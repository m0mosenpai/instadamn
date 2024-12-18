package X;

/* loaded from: classes10.dex */
public abstract class S15 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECT_SENT";
            case 2:
                return "CONNECTED";
            case 3:
                return "DISCONNECTED";
            default:
                return "CONNECTING";
        }
    }
}
