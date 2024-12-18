package X;

/* renamed from: X.BoA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26551BoA extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, AbstractC28159Cb6.A09);
        Object A002 = AbstractC77183d4.A00(c76223bS, C29905DGt.A01(c76223bS, 18), new Object[0]);
        C75933ay c75933ay = C51722Yv.A02;
        long j = AbstractC28159Cb6.A05;
        Integer num = C05F.A00;
        C51722Yv A003 = C9CU.A00(null, num, 0, j);
        long j2 = AbstractC28159Cb6.A01;
        C51722Yv A004 = C9CU.A00(A003, C05F.A04, 0, AbstractC28159Cb6.A04);
        Integer num2 = C05F.A05;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(A004, num2, 0, j2), C05F.A0C, 0.0f, 1);
        C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(C9CV.A00(AbstractC25233BEq.A0c(C9CV.A00(null, num2, A002, 4), C05F.A0N, true), num, AbstractC28159Cb6.A00(c76223bS, null, 12.0f, A00), 4), C05F.A0G, 0, AbstractC28159Cb6.A02), num, EnumC77683ds.FLEX_START);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            A12.A00(new C26457Bme(null, A03(A12, C87.A0J, AbstractC77623dm.A0F(A12, 2131966464)), A0d, AbstractC77623dm.A0F(A12, 2131966461), null, interfaceC16820sZ));
        }
        InterfaceC16820sZ interfaceC16820sZ2 = this.A03;
        if (interfaceC16820sZ2 != null) {
            A12.A00(new C26457Bme(null, A03(A12, C87.A0I, AbstractC77623dm.A0F(A12, 2131966469)), A0d, AbstractC77623dm.A0F(A12, 2131966563), null, interfaceC16820sZ2));
        }
        A12.A00(new C26457Bme(null, A03(A12, C87.A0O, AbstractC77623dm.A0F(A12, 2131966472)), A0d, AbstractC77623dm.A0F(A12, 2131966473), null, this.A02));
        return AbstractC25227BEk.A0V(new C26457Bme(null, A03(A12, C87.A0N, AbstractC77623dm.A0F(A12, 2131966471)), A0d, AbstractC77623dm.A0F(A12, 2131966450), null, this.A01), A12, c76223bS, A15);
    }

    public static final C26511BnW A03(C2Z1 c2z1, C87 c87, String str) {
        return new C26511BnW(null, c87, null, null, Integer.valueOf(AbstractC28406CgC.A00(c2z1, C88.A0X)), str, null, 12, true);
    }

    public C26551BoA(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
        this.A00 = interfaceC16820sZ4;
    }
}
