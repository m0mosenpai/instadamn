package X;

/* loaded from: classes9.dex */
public final class PR7 implements Runnable {
    public final /* synthetic */ NA2 A00;
    public final /* synthetic */ C123645id A01;

    public PR7(NA2 na2, C123645id c123645id) {
        this.A00 = na2;
        this.A01 = c123645id;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NA2 na2 = this.A00;
        C37494GfC c37494GfC = na2.A03;
        if (c37494GfC != null) {
            c37494GfC.A0E("profile_on_data");
        }
        C154806xV c154806xV = na2.A01.A03;
        c154806xV.A00(C05F.A0C);
        C123645id c123645id = this.A01;
        c154806xV.A07 = c123645id.A04;
        c154806xV.A0A = c123645id.A07;
        na2.A02.A00(c123645id);
    }
}
