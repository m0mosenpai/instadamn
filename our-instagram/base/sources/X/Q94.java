package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public class Q94 extends C61034Re4 {
    public final int A00;
    public final C62932SYa A01;

    public Q94(C62932SYa c62932SYa) {
        this.A01 = c62932SYa;
        this.A00 = 1;
    }

    public static Q94 A00(C62932SYa c62932SYa, IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            if (message != null && C4B2.A00(message).matches("cleartext.*not permitted.*")) {
                return new Q94(c62932SYa, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", 2007);
            }
            i2 = 2001;
        }
        return new Q94(c62932SYa, iOException, i2, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q94(X.C62932SYa r2, java.io.IOException r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L9
            r0 = 1
            if (r5 != r0) goto L9
            r4 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r3)
            r1.A01 = r2
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q94.<init>(X.SYa, java.io.IOException, int, int):void");
    }

    public Q94(C62932SYa c62932SYa, IOException iOException, String str, int i) {
        super(str, iOException, i);
        this.A01 = c62932SYa;
        this.A00 = 1;
    }
}
