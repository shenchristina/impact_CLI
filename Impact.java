import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "company", description = "Print the company name", mixinStandardHelpOptions = true)
class Impact implements Runnable {

    @Parameters(index = "0", description = "The name of the company")
    private String companyName;

    @Override
    public void run() {
        System.out.println("Hi! My name is Christina :) Welcome to " + companyName + "'s personalized company CLI.");

        final String BOLD = "\033[1m";
        final String RESET = "\033[0m";
        final String RED = "\033[31m";

        // Fun border design
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println(" * " + BOLD + RED + companyName + " - SaaSquatch" + RESET + " *");
        System.out.println("*                            *");
        System.out.println("******************************");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Impact()).execute(args);
        System.exit(exitCode);
    }
}
