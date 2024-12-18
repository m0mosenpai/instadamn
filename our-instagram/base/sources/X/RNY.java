package X;

/* loaded from: classes10.dex */
public final class RNY extends TTX {
    public int A00;
    public final Object A01;
    public final /* synthetic */ TZK A02;

    public RNY(TZK tzk, int i) {
        this.A02 = tzk;
        Object[] objArr = tzk.A04;
        objArr.getClass();
        this.A01 = objArr[i];
        this.A00 = i;
    }

    public static final void A00(RNY rny) {
        int i = rny.A00;
        if (i != -1) {
            TZK tzk = rny.A02;
            if (i < tzk.size()) {
                Object obj = rny.A01;
                int i2 = rny.A00;
                Object[] objArr = tzk.A04;
                objArr.getClass();
                if (AbstractC62214S2j.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        rny.A00 = TZK.A00(rny.A02, rny.A01);
    }
}
