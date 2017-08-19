package br.com.senai.modelo;

import java.util.ArrayList;

public class QuestionsData {

    private static final ArrayList<Question> web;
    private static final ArrayList<Question> java;
    private static final ArrayList<Question> sql;
    private static final ArrayList<Question> hardware;
    private static final ArrayList<Question> so;

    public static ArrayList<Question> getWeb() {
        return (ArrayList<Question>) web.clone();
    }

    public static ArrayList<Question> getHardware() {
        return (ArrayList<Question>) hardware.clone();
    }

    public static ArrayList<Question> getSo() {
        return (ArrayList<Question>) so.clone();
    }

    public static ArrayList<Question> getJava() {
        return (ArrayList<Question>) java.clone();
    }

    public static ArrayList<Question> getSql() {
        return (ArrayList<Question>) sql.clone();
    }

    static {

        ArrayList<Question> temp = new ArrayList<>();

        temp.add(new Question(
                "HTML é uma linguagem de...",
                "Criação",
                "Programação",
                "Formatação",
                "Informação",
                Resp.C
        ));

        temp.add(new Question(
                "O que é o símbolo (s) para comentar uma linha em JavaScript?",
                "// Este é um comentário",
                "** Este é um comentário",
                "%% Este é um comentário",
                "** Este é um comentário **",
                Resp.A));

        temp.add(new Question(
                "Como você cria uma variável x que é igual à string \"Hello\"?",
                "string x = \"Hello\";",
                "var x = \"Hello\";",
                "text x = \"Hello\";",
                "strings x = \"Hello\";",
                Resp.A));

        temp.add(new Question(
                "Quem inventou a linguagem de programação javascript?",
                "Ténis Ritchie",
                "James Gosling",
                "Rasmus Lerdorf",
                "Brendan Eich",
                Resp.D));

        temp.add(new Question(
                "Quando o programador deseja aplicar uma formatação dentro da tag, esse processo é chamado de estilo...",
                "In-line",
                "Incorporado",
                "In-tag",
                "CSS",
                Resp.A
        ));

        temp.add(new Question(
                "Para deixar a página com o fundo azul claro, qual tag deve ser inserida?",
                "<body style=\"background-color:lightblue\">",
                "<body style=\"backcolor:blue\">",
                "<body style=\"back-color-type:blue\">",
                "<body style=\"background-color:#0000FF\">",
                Resp.A
        ));

        temp.add(new Question(
                "O código para a inserção de arquivo CSS é:",
                "<link rel=\"arquivocss\" href=\"stylesheet\" type=\"text/css\">",
                "<link href=\"arquivocss\" rel=\"stylesheet\" type=\"text/css\">",
                "<link type=\"arquivocss\" rel=\"stylesheet\" href=\"text/css\">",
                "<link type=\"arquivocss\" href=\"stylesheet\" rel=\"text/css\">",
                Resp.B
        ));

        temp.add(new Question(
                "A linguagem HTML, para produzir páginas na Web, trata-se de uma linguagem do tipo",
                "de marcação",
                "de script",
                "procedural",
                "orientada à objetos",
                Resp.A
        ));

        temp.add(new Question(
                "Na HTML5, esse atributo exibe uma mensagem no campo antes dele ganhar o foco. "
                + "Quando o campo ganha o foco, a mensagem é apagada automaticamente. "
                + "Essa mensagem geralmente é utilizada para instruir o usuário no preenchimento do campo. O atributo citado é o",
                "placeholder",
                "pattern",
                "name",
                "value",
                Resp.A
        ));

        temp.add(new Question(
                "O símbolo # especifica que o seletor é...",
                "uma ID",
                "uma classe",
                "uma tag",
                "um element",
                Resp.A));

        web = temp;

        temp = new ArrayList<>();

        temp.add(new Question(
                "Qual das seguintes características permite ao usuário escolher tipos de forma incremental, a partir de tipos existentes?",
                "Abstração",
                "Herança",
                "Polimorfismo",
                "Encapsulamento",
                Resp.B));

        temp.add(new Question(
                "Qual das seguintes características esconde os detalhes de funcionamento interno das classes?",
                "Abstração",
                "Herança",
                "Polimorfismo",
                "Encapsulamento",
                Resp.D));

        temp.add(new Question(
                "Um atributo definido como private está visível...",
                "no pacote",
                "no mundo",
                "na classe",
                "no projeto",
                Resp.C));

        temp.add(new Question(
                "int x = 0;\nSystem.out.println(++x);\nA saída desse código é:",
                "-1",
                "null",
                "1",
                "0",
                Resp.D));

        temp.add(new Question(
                "Qual é o tipo de dado do número 9.6352?",
                "float",
                "double",
                "Double",
                "Float",
                Resp.B));

        temp.add(new Question(
                "Uma classe pode ter vários métodos com o mesmo nome desde que o número de parâmetros ou o tipo dos parâmetros seja diferente. Qual é o nome desse conceito da POO?",
                "Sobrescrita de métodos",
                "Sobrecarga de métodos",
                "Invocação de métodos",
                "Polimorfismo",
                Resp.B));

        temp.add(new Question(
                "Uma classe pode possuir versões mais específicas dos métodos de sua superclasse. Qual é o nome desse conceito na POO?",
                "Sobrescrita de métodos",
                "Sobrecarga de métodos",
                "Invocação de métodos",
                "Polimorfismo",
                Resp.A));

        temp.add(new Question(
                "Um método que tem que ser implementado na classe que extende ou implementa, é um método:",
                "public",
                "final",
                "abstract",
                "static",
                Resp.C));

        temp.add(new Question(
                "Não precisamos instanciar a classe Math para chamar o método random(). Isso é possível pois este método é:",
                "public",
                "final",
                "abstract",
                "static",
                Resp.D));

        temp.add(new Question(
                "O método da classe Graphics que desenha um círculo preenchido é:",
                "drawOval()",
                "drawRect()",
                "fillOval()",
                "fillRect()",
                Resp.C));
        java = temp;

        temp = new ArrayList<>();

        temp.add(new Question(
                "Nome do autoteste executado durante a inicialização do computador:",
                "BIOS",
                "Setup",
                "POST",
                "CMOS",
                Resp.C
        ));

        temp.add(new Question(
                "Qual o significado de RAM?",
                "Remote Authorization Mechanism",
                "Readily Accessed Mailer",
                "Random Authorization Mechanism",
                "Random Access Memory",
                Resp.D));

        temp.add(new Question(
                "São exemplos de hardware, somente:",
                "Mouse, placa de vídeo e Windows",
                "Leitor biométrico, Leitor de código de barras e placa de rede",
                "Word, impressora e monitor",
                "Placa de vídeo, Scanner e OCR",
                Resp.B));

        temp.add(new Question(
                "Como é chamado o programa que fica gravado na BIOS?",
                "Setup",
                "Windows",
                "Bios",
                "MS-DOS",
                Resp.A));

        temp.add(new Question(
                "Sobre a fonte ATX é correto afirmar:",
                "Tem 1 conector de 20 pinos",
                "Tem 2 conectores de 8 pinos",
                "Tem 1 conector de 8 pinos",
                "Tem 2 conectores de 20 pinos",
                Resp.A));

        temp.add(new Question(
                "Serve como ponte de comunicaçao entre periferico e sistema operacional:",
                "Barramento",
                "Bridge",
                "Driver",
                "Cooler",
                Resp.C));

        temp.add(new Question(
                "Qual o significado da sigla BIOS?",
                "Best Incredible Operating Sound",
                "Bicho Ignorante Operando Sistema",
                "Basic Interconnect Output Surround",
                "Basic Input Output Sistem",
                Resp.D));

        temp.add(new Question(
                "São exemplos de perifericos:",
                "CPU e Setup",
                "Fonte e Barramento",
                "Placa-mãe e Processador",
                "Scanner e Impressora",
                Resp.D));

        temp.add(new Question(
                "Como é chamada a memória permanente do computador?",
                "CD-ROM",
                "RAM",
                "ROM",
                "CPU",
                Resp.C));

        temp.add(new Question(
                "DOS significa:",
                "Disk Organized System",
                "Dual Operating System",
                "Dual Organized System",
                "Disk Operating System",
                Resp.D));

        hardware = temp;

        temp = new ArrayList<>();

        temp.add(new Question(
                "O que é um Mainframe?",
                "Um sistema operacional.",
                "Computadores gigantes que surgiram em 1800.",
                "Computadores gigantes que surgiram em 1950.",
                "linguagem de programação.",
                Resp.C));

        temp.add(new Question(
                "Quando surgiu o primeiro sistema operacional?",
                "1980",
                "1969",
                "1990",
                "1950",
                Resp.B));

        temp.add(new Question(
                "Uma equipe de desenvolvedores da AT&T Bell Labs resolveu trabalhar em um software mais objetivo e simplificado jamais visto, o chamado:",
                "XENIX",
                "GNU",
                "UNIX",
                "Android",
                Resp.C));

        temp.add(new Question(
                "O sistema UNIX foi programado especificamente para um tipo de máquina, mas, em 1973, o software foi recodificado para:",
                "COBOL",
                "C",
                "C++",
                "Fortran",
                Resp.B));

        temp.add(new Question(
                "UNIX - Apesar de se tratar de um software com código fechado, a AT&T forneceu cópias. Para quem inicialmente?",
                "Empresas ligada do ramo",
                "Steve Jobs, para criar a Apple DOS",
                "Universidades",
                "Bill Gates, para criar o windows",
                Resp.C));

        temp.add(new Question(
                "Os sistemas operacionais com suporte a múltiplos processadores que compartilhem um mesmo barramento e onde cada processador pode receber uma tarefa específica sob controle de um processador mestre podem ser classificado de qual forma?",
                "Multiprocessador síncrono",
                "Multicomputador assimétrico",
                "Multiprocessador simétrico",
                "Multiprocessador assimétrico",
                Resp.C));

        temp.add(new Question(
                "SOs fortemente e fracamente acoplados são divisões de:",
                "Multiprocessamento",
                "Monoprocessamento",
                "Monousuário",
                "Multiusuário",
                Resp.A));

        temp.add(new Question(
                "SOs fracamente acoplados são também conhecidos como:",
                "Multiprocessadores",
                "Multicomputadores",
                "Monotarefa",
                "Multitarefa",
                Resp.B));

        temp.add(new Question(
                "Qual das seguintes alternativas NÃO é um estado de processo?",
                "Pronto",
                "Bloqueio",
                "Execução",
                "Escalonador",
                Resp.D));

        temp.add(new Question(
                "\"Uma coleção de informações relacionadas definidas por seu criador\" - essa é a definição de:",
                "Sistema Operacional",
                "Programa",
                "Processo",
                "Arquivo",
                Resp.D));

        so = temp;

        temp = new ArrayList<>();

        temp.add(new Question(
                "Com SQL, como você seleciona todos os registros de uma tabela chamada \"Persons\" onde o valor da coluna \"FirstName\" é \"Peter\"?",
                "SELECT [all] FROM Persons WHERE FirstName='Peter'",
                "SELECT * FROM Persons WHERE FirstName<>'Peter'",
                "SELECT [all] FROM Persons WHERE FirstName LIKE 'Peter'",
                "SELECT * FROM Persons WHERE FirstName='Peter'",
                Resp.D));

        temp.add(new Question(
                "O que significa SQL?",
                "Structured Query Language",
                "Strong Question Language",
                "Structured Question Language",
                "Select Question Language",
                Resp.A));

        temp.add(new Question(
                "Com SQL, como você pode retornar o número de registros da tabela \"Persons\"?",
                "SELECT COUNT() FROM Persons",
                "SELECT COLUMNS() FROM Persons",
                "SELECT COLUMNS(*) FROM Persons",
                "SELECT COUNT(*) FROM Persons",
                Resp.D));

        temp.add(new Question(
                "Com SQL, como você pode retornar todos os registros de uma tabela chamada \"Persons\" ordenada descendentemente por \"FirstName\"?",
                "SELECT * FROM Persons SORT BY 'FirstName' DESC",
                "SELECT * FROM Persons ORDER FirstName DESC",
                "SELECT * FROM Persons ORDER BY FirstName DESC",
                "SELECT * FROM Persons SORT 'FirstName' DESC",
                Resp.C));

        temp.add(new Question(
                "Que comando SQL é usado para deletar dados em um banco de dados?",
                "COLLAPSE",
                "REMOVE",
                "DELETE",
                "DROP",
                Resp.C));

        temp.add(new Question(
                "Qual palavra-chave SQL é usada para ordenar um conjunto de registros de resultado?",
                "ORDER",
                "ORDER BY",
                "SORT BY",
                "SORT",
                Resp.B));

        temp.add(new Question(
                "Como você pode modificar \"Hansen\" para \"Nilsen\" na coluna \"LastName\" na tabela Persons?",
                "UPDATE Persons SET LastName='Hansen' INTO LastName='Nilsen'",
                "MODIFY Persons SET LastName='Hansen' INTO LastName='Nilsen",
                "UPDATE Persons SET LastName='Nilsen' WHERE LastName='Hansen'",
                "MODIFY Persons SET LastName='Nilsen' WHERE LastName='Hansen'",
                Resp.C));

        temp.add(new Question(
                "Que comando SQL é usado para extrair dados de um banco de dados?",
                "GET",
                "OPEN",
                "SELECT",
                "EXTRACT",
                Resp.C));

        temp.add(new Question(
                "Com SQL, como você seleciona todas as colunas de uma tabela chamada \"Persons\"?",
                "SELECT * FROM Persons",
                "SELECT [all] FROM Persons",
                "SELECT Persons",
                "SELECT *.Persons",
                Resp.A));

        temp.add(new Question("Que comando SQL é usado para retornar somente valores diferentes?",
                "SELECT DIFFERENT",
                "SELECT UNIQUE",
                "SELECT DISTINCT",
                "select ORDER",
                Resp.C));

        sql = temp;
    }

}
