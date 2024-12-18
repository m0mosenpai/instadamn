package X;

import org.apache.http.client.HttpResponseException;

/* renamed from: X.OPg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54885OPg {
    public static final String A01(Throwable th) {
        String A02 = C71473Il.A00('|').A02(AbstractC63327Shb.A01(th));
        C14360o3.A07(A02);
        return A02;
    }

    public static final int A00(Throwable th) {
        for (Throwable th2 : AbstractC63327Shb.A01(th)) {
            if (th2 instanceof HttpResponseException) {
                return ((HttpResponseException) th2).getStatusCode();
            }
        }
        return -1;
    }
}
