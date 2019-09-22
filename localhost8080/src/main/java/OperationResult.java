import java.util.Objects;

public class OperationResult {
String operation;
String oneParam;
String twoParam;
String result;

public OperationResult(){
}
public OperationResult(String operation, String oneParam, String twoParam, String result) {
        this.operation = operation;
        this.oneParam = oneParam;
        this.twoParam = twoParam;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOneParam() {
        return oneParam;
    }

    public void setOneParam(String oneParam) {
        this.oneParam = oneParam;
    }

    public String getTwoParam() {
        return twoParam;
    }

    public void setTwoParam(String twoParam) {
        this.twoParam = twoParam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "OperationResult{" +
            "operation='" + operation + '/' +
                    ", oneParam='" + oneParam + '/' +
                ", twoParam='" + twoParam + '/' +
                ", result='" + result + '/' + '}';
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationResult that = (OperationResult) o;
        return Objects.equals(operation, that.operation) &&
                Objects.equals(oneParam, that.oneParam) &&
                Objects.equals(twoParam, that.twoParam) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, oneParam, twoParam, result);
    }
}
