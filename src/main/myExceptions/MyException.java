package myExceptions;

public class MyException extends Exception {
  int code;

  public int getCode(){
    return code;
  }

  public void setCode(int code){
    this.code = code;
  }

  public MyException(int code){
    super();
    this.setCode(code);
  }

  @Override
  public String getMessage(){
    String message = "ERROR - ";
    switch(code){
      case 1:
        message += "Introduce un número";
        break;
    }
    return message;
  }
}
