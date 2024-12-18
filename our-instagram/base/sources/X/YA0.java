package X;

/* loaded from: classes12.dex */
public final class YA0 implements YNa {
    public final C005001p A00;

    @Override // X.YNa
    public final /* bridge */ /* synthetic */ void reportTo(AbstractC72463XeB abstractC72463XeB, YNZ ynz) {
        C72177XRn c72177XRn = (C72177XRn) abstractC72463XeB;
        int i = 0;
        while (true) {
            C005001p c005001p = this.A00;
            if (i < c005001p.size()) {
                Class cls = (Class) c005001p.A05(i);
                YNa yNa = (YNa) c005001p.A06(i);
                C005001p c005001p2 = c72177XRn.A00;
                if (c005001p2.containsKey(cls)) {
                    yNa.reportTo((AbstractC72463XeB) cls.cast(c005001p2.get(cls)), ynz);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public YA0(C005001p c005001p) {
        C005001p c005001p2 = new C005001p(0);
        this.A00 = c005001p2;
        c005001p2.A09(c005001p);
    }
}
