package UltraEmojiCombat;

public class Lutador {
        //Atributos 
         private String nome ;
         private String nacionalidade ;
         private int idade ;
         private float altura;
         private float peso;
         private String categoria;
         private int vitoria;
         private int derrotas;
         private int empates;
     
         //Metodos publicos
         public void apresentar() {
             System.out.println("Nome " + this.getNome());
             System.out.println("Nacionalidade " + this.getNacionalidade());
             System.out.println("Idade " + this.getIdade());
             System.out.println("Altura " + this.getAltura());
             System.out.println("Pesando " + this.getPeso());
             System.out.println("Ganhou " + this.getVitoria());
             System.out.println("Perdeu " + this.getDerrotas());
             System.out.println("Empatou " + this.getEmpates());
         }
         public void status(){ 
             System.out.println( this.getNome() + " E um peso " + this.getCategoria());
             System.out.println("Ganhou " + this.getVitoria() + " vezes");
             System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
             System.out.println("Empatou " + this.getEmpates() + " vezes");
            
     
         }
         public void ganharluta(){
             setVitoria(getVitoria() + 1);
         }
         public void perderluta(){
             setDerrotas(getDerrotas() + 1);
         }
         public void empatarluta(){
             setEmpates(getEmpates() + 1);
         }
         //Metodos especias 
         public Lutador(String no, String na, int id, float al , float pe, int vi, int de,int em) {
             this.nome = no;
             this.nacionalidade = na;
             this.idade = id ;
             this.altura = al;
             this.setPeso (pe);
             this.vitoria = vi;
             this.derrotas = de;
             this.empates = em;
         }
        // Getters e Satters 
         public String getNome() {
             return nome;
         }
         public void setNome(String nome) {
             this.nome = nome;
         }
         public String getNacionalidade() {
             return nacionalidade;
         }
         public void setNacionalidade(String nacionalidade) {
             this.nacionalidade = nacionalidade;
         }
         public int getIdade() {
             return idade;
         }
         public void setIdade(int idade) {
             this.idade = idade;
         }
         public float getAltura() {
             return altura;
         }
         public void setAltura(float altura) {
             this.altura = altura;
         }
         public float getPeso() {
             return peso;
         }
         public void setPeso(float peso) {
             this.peso = peso;
             this.setCategoria();
         }
         public String getCategoria() {
             return categoria;
         }
         private void setCategoria() {
             if (this.peso < 52.2){
                 this.categoria = "invalido";
             }else if (this.peso <= 70.3){
                 this.categoria = "leve";
             }else if (this.peso <= 83.9){
                 this.categoria = "medio";
             } else if (this.peso <= 120.2){
                 this.categoria = "pesado";
             }else{
                 this.categoria = "invalida";
             }
         }
         public int getVitoria() {
             return vitoria;
         }
         public void setVitoria(int vitoria) {
             this.vitoria = vitoria;
         }
         public int getDerrotas() {
             return derrotas;
         }
         public void setDerrotas(int derrotas) {
             this.derrotas = derrotas;
         }
         public int getEmpates() {
             return empates;
         }
         public void setEmpates(int empates) {
             this.empates = empates;
         }
         
     }

