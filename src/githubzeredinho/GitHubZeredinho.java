package githubzeredinho;
public class GitHubZeredinho {
    public static void main(String[] args) {
    Vetor v = new Vetor(10);
    Vetor v2 = new Vetor(5);
    
    v.randomFill();
    v2.randomFill();
    v2 = v2.Concat(v);
    v2.bubbleSort();
    System.out.println(v2.toString());
    }
   
    
}
