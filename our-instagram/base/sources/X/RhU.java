package X;

/* loaded from: classes10.dex */
public enum RhU {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String A00;

    RhU(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static RhU A00(String str) {
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    return TLS_1_3;
                }
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
            default:
                throw AbstractC167007dF.A0c("Unexpected TLS version: ", str);
        }
    }
}
