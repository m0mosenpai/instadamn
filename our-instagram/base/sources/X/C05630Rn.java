package X;

/* renamed from: X.0Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05630Rn implements C0CD {
    public final C005001p A00 = new C005001p(0);

    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C0XO c0xo = (C0XO) abstractC02960Bu;
        int i = 0;
        while (true) {
            C005001p c005001p = this.A00;
            if (i < c005001p.size()) {
                Class cls = (Class) c005001p.A05(i);
                if (c0xo.A08(cls)) {
                    ((C0CD) c005001p.get(cls)).EIU(c0xo.A04(cls), c0cc);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
