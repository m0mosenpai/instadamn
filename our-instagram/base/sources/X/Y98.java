package X;

/* loaded from: classes12.dex */
public final class Y98 implements YNN {
    public final /* synthetic */ YNN A00;
    public final /* synthetic */ Y6Z A01;

    public Y98(YNN ynn, Y6Z y6z) {
        this.A01 = y6z;
        this.A00 = ynn;
    }

    @Override // X.YNN
    public final /* bridge */ /* synthetic */ Object Eq4(Y6Z y6z) {
        if (y6z.A07()) {
            Exception A03 = y6z.A03();
            C72862XpO c72862XpO = new C72862XpO();
            c72862XpO.A01(A03);
            return c72862XpO.A00;
        }
        if (y6z.A06()) {
            return Y6Z.A06;
        }
        return y6z.A02(this.A00, Y6Z.A0A);
    }
}
