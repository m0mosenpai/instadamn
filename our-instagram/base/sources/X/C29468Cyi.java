package X;

import android.content.Context;

/* renamed from: X.Cyi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29468Cyi implements InterfaceC30959DjG {
    public static final C29473Cyn A06;
    public static final C29473Cyn A07;
    public static final Integer A08 = C05F.A06;
    public static final Integer A09 = C05F.A01;
    public final int A00;
    public final InterfaceC31001Dk0 A01;
    public final C88 A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;

    public C29468Cyi(InterfaceC31001Dk0 interfaceC31001Dk0, C88 c88, Integer num, Integer num2, Integer num3, int i) {
        AbstractC167007dF.A1G(c88, 3, num);
        AbstractC167007dF.A1I(num2, 7, num3);
        this.A00 = i;
        this.A02 = c88;
        this.A05 = num;
        this.A01 = interfaceC31001Dk0;
        this.A03 = num2;
        this.A04 = num3;
    }

    static {
        Integer num = C05F.A0D;
        A06 = new C29473Cyn(C88.A0Z, num);
        A07 = new C29473Cyn(C88.A0i, num);
    }

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        AbstractC167017dG.A1N(context, interfaceC30923Dia);
        InterfaceC31128DmB A00 = C28351CfB.A00(interfaceC30923Dia);
        boolean CSM = interfaceC30923Dia.CSM();
        int EKE = A00.EKE(C88.A0Z, CSM);
        int EKE2 = A00.EKE(C88.A0o, CSM);
        int EKE3 = A00.EKE(this.A02, CSM);
        int EKF = A00.EKF(C05F.A1I);
        CVO cvo = new CVO(EKF, EKE2);
        CVO cvo2 = new CVO(EKF, EKE2);
        int EKE4 = A00.EKE(C88.A0i, CSM);
        int EKF2 = A00.EKF(C05F.A05);
        C29473Cyn c29473Cyn = A06;
        C29473Cyn c29473Cyn2 = A07;
        int i = this.A00;
        Integer num = C05F.A01;
        int EKF3 = A00.EKF(C05F.A02);
        int EKF4 = A00.EKF(C05F.A03);
        int EKF5 = A00.EKF(C05F.A04);
        int EKF6 = A00.EKF(this.A05);
        InterfaceC31001Dk0 interfaceC31001Dk0 = this.A01;
        int EKF7 = A00.EKF(this.A03);
        return new CWP(c29473Cyn, c29473Cyn2, cvo, cvo2, cvo2, interfaceC31001Dk0, Integer.valueOf(EKE4), num, this.A04, i, EKE, EKF3, EKF4, EKF2, EKF5, EKF2, EKE2, EKE2, EKE3, EKF6, EKF7);
    }
}
