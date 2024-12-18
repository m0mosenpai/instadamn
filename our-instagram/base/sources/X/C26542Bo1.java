package X;

/* renamed from: X.Bo1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26542Bo1 extends AbstractC51572Yf {
    public final CharSequence A00;
    public final InterfaceC16820sZ A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 1.0f, 1));
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 1.0f, 1);
        C2XE c2xe = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        CharSequence charSequence = this.A00;
        if (charSequence != null) {
            Integer num2 = C05F.A0u;
            EnumC72394Xcg enumC72394Xcg = EnumC72394Xcg.A2B;
            long A0K = AbstractC25230BEn.A0K();
            A0P2.A00(new C26488Bn9(enumC72394Xcg, null, C93E.TEXT_START, charSequence, num2, 0, A0K, A0K));
        }
        AbstractC25227BEk.A1H(A0P2, A0P, A0d);
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            A0P.A00(AbstractC76963ci.A00(AbstractC25232BEp.A11(new C26451BmY(new C26450BmX(EnumC72438Xdi.THREE_LINES_CENTERED, null, EnumC27423C8q.SIZE_16, EnumC27424C8r.OUTLINE, EnumC72394Xcg.A2A, null), new C51722Yv(null, null).A00(C9CU.A00(null, C05F.A1F, 2, AbstractC25229BEm.A0F())).A00(AbstractC25232BEp.A16(null, C05F.A0F, true)).A00(AbstractC25233BEq.A0W(null, A0P, 2131977148)).A00(C9CV.A00(null, num, "android.widget.Button", 0)), C05F.A00, C05F.A0C, num, interfaceC16820sZ), c2xe)));
        }
        return AbstractC76963ci.A0J(A0P, c76223bS, A0h, null, enumC77683ds, null, null, null, false);
    }

    public C26542Bo1(CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = charSequence;
        this.A01 = interfaceC16820sZ;
    }

    public C26542Bo1() {
        this(null, null);
    }
}
