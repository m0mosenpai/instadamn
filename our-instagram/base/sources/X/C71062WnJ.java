package X;

/* renamed from: X.WnJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71062WnJ implements GYT {
    public final int A00;
    public final Object A01;

    public C71062WnJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYT
    public final void DjF() {
        String str;
        switch (this.A00) {
            case 0:
                ((EVU) this.A01).A0l.DjF();
                return;
            case 1:
                V1F v1f = (V1F) this.A01;
                if (!v1f.A0A) {
                    return;
                }
                v1f.A0C = true;
                C65974TxR c65974TxR = v1f.A04;
                if (c65974TxR == null) {
                    str = "queuedTypeAheadManager";
                    break;
                } else {
                    String str2 = v1f.A07;
                    C14360o3.A0B(str2, 0);
                    C65974TxR.A00(new UQE(str2), c65974TxR);
                    v1f.CMc();
                    return;
                }
            case 2:
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                if (!abstractC65919TwQ.A0H) {
                    return;
                }
                C65974TxR c65974TxR2 = abstractC65919TwQ.A0A;
                if (c65974TxR2 == null) {
                    str = "queuedTypeaheadManager";
                    break;
                } else {
                    C65974TxR.A00(abstractC65919TwQ.A01, c65974TxR2);
                    abstractC65919TwQ.A0l.CMc();
                    return;
                }
            default:
                ((AbstractC67878V0j) this.A01).A07().A04();
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
