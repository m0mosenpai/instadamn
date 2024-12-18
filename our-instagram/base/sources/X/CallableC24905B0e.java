package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24905B0e implements Callable {
    public final /* synthetic */ C175057qf A00;

    public CallableC24905B0e(C175057qf c175057qf) {
        this.A00 = c175057qf;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        C175057qf c175057qf = this.A00;
        AbstractC175037qd.A00(15, c175057qf.A00, null);
        try {
            try {
                if (c175057qf.A0k != null) {
                    boolean A1N = AbstractC167007dF.A1N(c175057qf.A00);
                    C175247qy c175247qy = c175057qf.A0O;
                    int i = 1;
                    if (A1N) {
                        i = 0;
                    }
                    if (!c175247qy.A09(i)) {
                        if (A1N) {
                            str = "FRONT";
                        } else {
                            str = "BACK";
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0g("Cannot switch to ", str, ", camera is not present"));
                    }
                    c175057qf.A0t = true;
                    String A07 = c175247qy.A07(A1N ? 1 : 0);
                    C175057qf.A03(c175057qf, A07);
                    c175057qf.A0B(A07);
                    C175057qf.A01(c175057qf);
                    C175057qf.A02(c175057qf, null, A07);
                    C177447ue c177447ue = new C177447ue(c175057qf.AlU(), null, c175057qf.Bty(), c175057qf.A00, false);
                    AbstractC175037qd.A00(17, A1N ? 1 : 0, null);
                    c175057qf.A0t = false;
                    return c177447ue;
                }
                throw new RuntimeException("Cannot switch camera, no cameras open.");
            } catch (Exception e) {
                AbstractC175037qd.A00(16, c175057qf.A00, e);
                throw e;
            }
        } catch (Throwable th) {
            c175057qf.A0t = false;
            throw th;
        }
    }
}
