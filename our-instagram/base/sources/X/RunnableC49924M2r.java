package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.M2r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49924M2r implements Runnable {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC49924M2r(LK0 lk0, C5KS c5ks) {
        this.A01 = c5ks;
        this.A00 = lk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception A05;
        LK0 lk0;
        String message;
        List A0m;
        String str;
        Integer A0i;
        Object obj;
        C5KS c5ks = this.A01;
        if (c5ks.A0F()) {
            int A0H = AbstractC166987dD.A0H(c5ks.A06());
            lk0 = this.A00;
            if (A0H <= 0) {
                A05 = new Exception("Blockstore API reported complete, but no bytes written");
            } else {
                obj = K53.A00;
                lk0.A05(obj);
            }
        } else {
            Exception A052 = c5ks.A05();
            String str2 = null;
            if (A052 != null && (message = A052.getMessage()) != null && (A0m = AbstractC167007dF.A0m(message, ":", 0)) != null && (str = (String) AbstractC001800i.A0J(A0m)) != null && (A0i = AbstractC003100w.A0i(str)) != null) {
                int intValue = A0i.intValue();
                if (intValue != 40002 && intValue != 17) {
                    if (intValue == 40000) {
                        Exception A053 = c5ks.A05();
                        if (A053 != null) {
                            str2 = A053.getMessage();
                        }
                        A05 = new IOException(str2);
                    } else if (intValue == 40001) {
                        Exception A054 = c5ks.A05();
                        if (A054 != null) {
                            str2 = A054.getMessage();
                        }
                        A05 = new IOException(str2);
                    }
                } else {
                    Exception A055 = c5ks.A05();
                    if (A055 != null) {
                        str2 = A055.getMessage();
                    }
                    A05 = new IOException(str2);
                }
                lk0 = this.A00;
            }
            if (c5ks.A05() instanceof C64878TYe) {
                Exception A056 = c5ks.A05();
                if (A056 != null) {
                    str2 = A056.getMessage();
                }
                A05 = new IOException(str2);
            } else {
                A05 = c5ks.A05();
            }
            lk0 = this.A00;
        }
        obj = new K54(A05);
        lk0.A05(obj);
    }
}
