package X;

/* renamed from: X.DuF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31587DuF implements Runnable {
    public final /* synthetic */ JR3 A00;
    public final /* synthetic */ C2056698q A01;

    public RunnableC31587DuF(JR3 jr3, C2056698q c2056698q) {
        this.A00 = jr3;
        this.A01 = c2056698q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        JR3 jr3 = this.A00;
        C2056698q c2056698q = this.A01;
        C14360o3.A0B(c2056698q, 0);
        boolean A1O = AbstractC167007dF.A1O((c2056698q.A00 > 0L ? 1 : (c2056698q.A00 == 0L ? 0 : -1)));
        C31261Doj c31261Doj = jr3.A02;
        if (c31261Doj == null) {
            str = "actionBarController";
        } else {
            c31261Doj.A02 = A1O;
            C56352iT c56352iT = c31261Doj.A00;
            if (c56352iT != null) {
                c56352iT.A0T();
            }
            C31256Doe c31256Doe = jr3.A04;
            if (c31256Doe == null) {
                str = "actionBarRepository";
            } else {
                if (c31256Doe.A02 != A1O) {
                    c31256Doe.A02 = A1O;
                    C31256Doe.A01(c31256Doe);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
