package X;

import android.text.TextUtils;

/* renamed from: X.Bnz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26540Bnz extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0H = AbstractC25230BEn.A0H();
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A0a = AbstractC25233BEq.A0a(AbstractC25234BEr.A0E(C9CU.A00(null, C05F.A07, A1Z ? 1 : 0, A0J), AbstractC25227BEk.A0Z(A1Z ? 1 : 0, A0J), A1Z ? 1 : 0, A0H), C05F.A01, 1.0f);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        String A0F = AbstractC77623dm.A0F(A12, 2131966463);
        C30170DRa A00 = C30170DRa.A00(this, C30181DRm.A01(A12, 15), 14);
        BYS bys = new BYS(A12);
        A00.invoke(bys);
        CharSequence expandTemplate = TextUtils.expandTemplate(A0F, bys);
        C14360o3.A07(expandTemplate);
        Integer num = C05F.A0B;
        C88 c88 = C88.A0Z;
        C93E c93e = C93E.CENTER;
        long A0B = AbstractC25229BEm.A0B();
        A12.A00(new C26567BoQ(null, c93e, c88, expandTemplate, num, A1Z ? 1 : 0, A0B, A0B));
        return AbstractC76963ci.A0F(A12, c76223bS, A0a);
    }

    public C26540Bnz(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    public C26540Bnz() {
        this(null);
    }
}
