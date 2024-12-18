package X;

/* renamed from: X.9OB, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9OB {
    public final /* synthetic */ C185948Mo A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C9OB(C185948Mo c185948Mo, boolean z) {
        this.A00 = c185948Mo;
        this.A01 = z;
    }

    public final void A00() {
        C185948Mo c185948Mo = this.A00;
        boolean z = this.A01;
        if (c185948Mo.A0I && !c185948Mo.A0J) {
            c185948Mo.A0I = false;
            C185948Mo.A07(c185948Mo);
        } else {
            if (!z || c185948Mo.A0s.AuG() != EnumC1810181d.A0m) {
                return;
            }
            for (C87B c87b : c185948Mo.A11) {
                c87b.DzD();
                c87b.E03();
            }
        }
    }
}
