public class Aluno {

  private String codigo;
  private String nome;
  private String email;
  private String cidade;
  private String uf;

  public Aluno(String codigo, String nome, String email, String cidade, String uf) {
    this.codigo = codigo;
    this.nome = nome;
    this.email = email;
    this.cidade = cidade;
    this.uf = uf;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public String getCodigo() {
    return this.codigo;
  }
  
  public String getNome() {
    return this.nome;
  }

  public String getEmail() {
    return this.email;
  }

  public String getCidade() {
    return this.cidade;
  }

  public String getUf() {
    return this.uf;
  }

  @Override
  public String toString() {
    return "Aluno " + this.getCodigo() + 
      "\nNome: " + this.getNome() + 
      "\nEmail: " + this.getEmail() + 
      "\nCidade: " + this.getCidade() + 
      "\nUF: " + this.getUf() + "\n\n";
  }

}