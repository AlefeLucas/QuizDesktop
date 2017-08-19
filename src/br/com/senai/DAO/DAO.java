package br.com.senai.DAO;

import br.com.senai.jdbc.ConnectionFactory;
import br.com.senai.modelo.Adm;
import br.com.senai.modelo.Jogador;
import br.com.senai.modelo.Question;
import br.com.senai.modelo.Resp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO {

    private static Connection connection = null;//Conexão

    static {
        try {
            //conecta no banco de dados (direto no mysql, sem conectar numa database específica)
            connection = ConnectionFactory.createConnection();

        } catch (SQLException ex) {
            //printa o erro em vermelho na linha de comando
            ex.printStackTrace();
            //encerra o programa com erro
            System.exit(1);
        }
    }

    public static ArrayList<Question> selectPerguntas() {
        ArrayList<Question> questions = new ArrayList<>();

        String select = "SELECT * FROM questao";

        try {
            PreparedStatement statement = connection.prepareStatement(select);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Resp resp;
                String correta = resultSet.getString("correta");
                String a = resultSet.getString("opA");
                String b = resultSet.getString("opB");
                String c = resultSet.getString("opC");
                String d = resultSet.getString("opD");

                if (correta.equals(a)) {
                    resp = Resp.A;
                } else if (correta.equals(b)) {
                    resp = Resp.B;
                } else if (correta.equals(c)) {
                    resp = Resp.C;
                } else {
                    resp = Resp.D;
                }

                Question question = new Question(resultSet.getString("enunciado"), a, b, c, d, resp);
                questions.add(question);
            }

            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }

        return questions;
    }

    public static int insertPergunta(Question question) {
        String insert = "INSERT INTO questao (enunciado, opA, opB, opC, opD, correta) VALUES ( ?, ?, ?, ?, ?, ?);";
        int update = -1;

        try {
            PreparedStatement statement = connection.prepareStatement(insert);
            statement.setString(1, question.getQuestion());
            String[] allOps = question.getAllOps();
            statement.setString(2, allOps[0]);
            statement.setString(3, allOps[1]);
            statement.setString(4, allOps[2]);
            statement.setString(5, allOps[3]);
            statement.setString(6, question.getOpCorreta());

            update = statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Impossível inserir" + ex.getStackTrace());
            ex.printStackTrace();
        }

        return update;
    }

    public static ArrayList<Jogador> selectJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        String select = "SELECT * FROM jogador ORDER BY pontuacao DESC";

        try {
            PreparedStatement statement = connection.prepareStatement(select);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                jogadores.add(new Jogador(resultSet.getString("nome"), resultSet.getString("email"), resultSet.getDouble("pontuacao"), resultSet.getString("horadia")));
            }

            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }

        return jogadores;
    }

    public static int insertJogador(Jogador jogador) {
        String insert = "INSERT INTO jogador (nome, email, pontuacao, horadia) VALUES ( ?, ?, ?, ?);";
        int update = -1;

        try {
            PreparedStatement statement = connection.prepareStatement(insert);
            statement.setString(1, jogador.getNome());
            statement.setString(2, jogador.getEmail());
            statement.setDouble(3, jogador.getPontuacao());
            statement.setString(4, jogador.getHoradia());

            update = statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Impossível inserir" + ex.getStackTrace());
        }

        return update;
    }

    public static ArrayList<Adm> selectAdm() {
        ArrayList<Adm> adms = new ArrayList<>();

        String select = "SELECT * FROM adm";

        try {
            PreparedStatement statement = connection.prepareStatement(select);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                adms.add(new Adm(resultSet.getString("nome"), resultSet.getString("senha")));
            }

            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }

        return adms;
    }

    public static boolean logarAdm(Adm adm) {
        boolean logou = false;

        String select = "SELECT * FROM adm WHERE nome_adm = ? AND senha_adm = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(select);
            statement.setString(1, adm.getNome());
            statement.setString(2, adm.getSenha());
            ResultSet resultSet = statement.executeQuery();

            logou = resultSet.next();
                
            
            
            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }
        System.out.println(logou);
        return logou;
    }

    public static int insertAdm(Adm adm) {
        String insert = "INSERT INTO adm (nome, senha) VALUES ( ?, ?);";
        int update = -1;

        try {
            PreparedStatement statement = connection.prepareStatement(insert);
            statement.setString(1, adm.getNome());
            statement.setString(2, adm.getSenha());

            update = statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Impossível inserir" + ex.getStackTrace());
        }

        return update;
    }
}
