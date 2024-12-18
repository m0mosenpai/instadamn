package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YLF extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C9BD A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C80143i3 A02;
    public final /* synthetic */ XVc A03;
    public final /* synthetic */ C80193i8 A04;
    public final /* synthetic */ C65502xm A05;
    public final /* synthetic */ C86633tb A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLF(C9BD c9bd, C38321qM c38321qM, C80143i3 c80143i3, XVc xVc, C80193i8 c80193i8, C65502xm c65502xm, C86633tb c86633tb, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A03 = xVc;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = c80193i8;
        this.A06 = c86633tb;
        this.A0A = z3;
        this.A02 = c80143i3;
        this.A00 = c9bd;
        this.A0B = z4;
        this.A07 = interfaceC16820sZ;
        this.A05 = c65502xm;
        this.A01 = c38321qM;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C2YN c2yn = (C2YN) obj;
        C14360o3.A0B(c2yn, 0);
        XVc xVc = this.A03;
        C80143i3 c80143i3 = this.A02;
        C9BD c9bd = this.A00;
        boolean z = this.A0B;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        C65502xm c65502xm = this.A05;
        C38321qM c38321qM = this.A01;
        try {
            c2yn.A00 = C00Q.A03("image_and_video", StringTreeSet.MAX_SYMBOL_COUNT);
            UserSession userSession = xVc.A00;
            InterfaceC60442pS interfaceC60442pS = xVc.A02;
            if (xVc.A08) {
                obj2 = Float.valueOf(xVc.A03.A00);
            } else {
                obj2 = 0;
            }
            c2yn.A02(new C30272DUz(1, c9bd, c38321qM, c80143i3, xVc, c65502xm, interfaceC16820sZ, z), new Object[]{userSession, interfaceC60442pS, c80143i3, c9bd, obj2});
            c2yn.A00 = null;
            C79723hN c79723hN = xVc.A03;
            AbstractC80203i9.A05(c2yn, xVc.A01, c79723hN, new XM9(xVc, 3), this.A08, this.A09);
            AbstractC80203i9.A06(c2yn, c79723hN, xVc.A05, new XM9(xVc, 4));
            C79933hi c79933hi = XVc.A0C;
            C80193i8 c80193i8 = this.A04;
            C75113Zb c75113Zb = c79723hN.A0E;
            AbstractC80203i9.A07(c2yn, c80193i8, c79933hi, c75113Zb, new XM9(xVc, 5));
            AbstractC80203i9.A08(c2yn, xVc.A07, new XM9(xVc, 6));
            C86633tb c86633tb = this.A06;
            boolean z2 = this.A0A;
            AbstractC80203i9.A04(c2yn, userSession, c75113Zb, xVc.A06, c86633tb, interfaceC60442pS.getModuleName(), new XM9(xVc, 7), z2);
            return C0eB.A00;
        } catch (Throwable th) {
            c2yn.A00 = null;
            throw th;
        }
    }
}
