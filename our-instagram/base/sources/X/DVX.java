package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DVX extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ C29100CsR A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVX(InterfaceC74953Yl interfaceC74953Yl, C29100CsR c29100CsR, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        super(2);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = c29100CsR;
        this.A04 = str;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
        this.A06 = interfaceC16820sZ4;
        this.A00 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2007544591, "com.instagram.barcelonaig.fragment.BarcelonaIgScreen.<anonymous>.<anonymous> (BarcelonaIgScreen.kt:84)");
            }
            UserSession userSession = this.A02;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C29100CsR c29100CsR = this.A01;
            String str = this.A04;
            InterfaceC16820sZ interfaceC16820sZ = this.A08;
            AbstractC27576CEv.A00(c5Tl, c29100CsR, null, userSession, interfaceC60442pS, str, interfaceC16820sZ, this.A07, this.A05, this.A06, 384, 256);
            InterfaceC74953Yl interfaceC74953Yl = this.A00;
            CRK crk = (CRK) interfaceC74953Yl.getValue();
            if (crk != null) {
                String str2 = crk.A01;
                String str3 = crk.A02;
                Boolean bool = crk.A00;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                C51729Mt8 c51729Mt8 = new C51729Mt8(2, 0, z);
                C5yG c5yG = C5yG.A00;
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -516924160);
                Object obj3 = C5UI.A00;
                if (A0q == obj3) {
                    A0q = new C50150MDd(interfaceC74953Yl, 12);
                    c5Tl.FBy(A0q);
                }
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) A0q;
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ, -516922206);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == obj3) {
                    EEc = C30480DbP.A00(interfaceC16820sZ, 32);
                    c5Tl.FBy(EEc);
                }
                CE3.A00(c5Tl, null, c51729Mt8, null, c5yG, str2, str3, interfaceC16820sZ2, AbstractC25225BEi.A1C(A0K, EEc), C30757Dfu.A00, 1600512, 384);
            }
            if (C0fH.A02()) {
                C0fH.A00(-391637762);
            }
        }
        return C0eB.A00;
    }
}
