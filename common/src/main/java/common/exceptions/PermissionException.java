package common.exceptions;

public class PermissionException extends AuthException {
    public PermissionException(String user) {
        super("[PermissionException]", "you dont have permission, element was created by [" + user + "]");
    }
}
