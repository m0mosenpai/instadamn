package X;

import android.widget.SeekBar;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;

/* renamed from: X.4sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107414sm extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C9BD A00;
    public final /* synthetic */ C9BR A01;
    public final /* synthetic */ C77993eR A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C80143i3 A04;
    public final /* synthetic */ C107384sj A05;
    public final /* synthetic */ C86773tp A06;
    public final /* synthetic */ C80193i8 A07;
    public final /* synthetic */ C65502xm A08;
    public final /* synthetic */ C86633tb A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107414sm(C9BD c9bd, C9BR c9br, C77993eR c77993eR, C38321qM c38321qM, C80143i3 c80143i3, C107384sj c107384sj, C86773tp c86773tp, C80193i8 c80193i8, C65502xm c65502xm, C86633tb c86633tb, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A02 = c77993eR;
        this.A05 = c107384sj;
        this.A07 = c80193i8;
        this.A0E = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A06 = c86773tp;
        this.A01 = c9br;
        this.A09 = c86633tb;
        this.A0D = z4;
        this.A04 = c80143i3;
        this.A00 = c9bd;
        this.A0F = z5;
        this.A0A = interfaceC16820sZ;
        this.A08 = c65502xm;
        this.A03 = c38321qM;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C2YN c2yn = (C2YN) obj;
        C14360o3.A0B(c2yn, 0);
        C77993eR c77993eR = this.A02;
        C107384sj c107384sj = this.A05;
        UserSession userSession = c107384sj.A02;
        c77993eR.A00 = AbstractC65492xl.A00(userSession).A0O;
        C80143i3 c80143i3 = this.A04;
        C9BD c9bd = this.A00;
        boolean z = this.A0F;
        InterfaceC16820sZ interfaceC16820sZ = this.A0A;
        C65502xm c65502xm = this.A08;
        C38321qM c38321qM = this.A03;
        try {
            c2yn.A00 = C00Q.A03("image_and_video", StringTreeSet.MAX_SYMBOL_COUNT);
            InterfaceC60442pS interfaceC60442pS = c107384sj.A04;
            if (c107384sj.A0C) {
                obj2 = Float.valueOf(c107384sj.A05.A00);
            } else {
                obj2 = 0;
            }
            c2yn.A02(new DU0(c9bd, c38321qM, c80143i3, c107384sj, c65502xm, interfaceC16820sZ, z), new Object[]{userSession, interfaceC60442pS, c80143i3, c9bd, obj2, Boolean.valueOf(c107384sj.A0B)});
            c2yn.A00 = null;
            C79933hi c79933hi = C107384sj.A0E;
            C80193i8 c80193i8 = this.A07;
            C79723hN c79723hN = c107384sj.A05;
            C75113Zb c75113Zb = c79723hN.A0E;
            AbstractC80203i9.A07(c2yn, c80193i8, c79933hi, c75113Zb, new C72056XLx(c107384sj));
            AbstractC80203i9.A00(AbstractC77363dM.A00(c77993eR), c2yn, c79723hN, new C72055XLw(c107384sj), this.A0E);
            AbstractC80203i9.A08(c2yn, c107384sj.A0A, new XLz(c107384sj));
            AbstractC80203i9.A05(c2yn, c107384sj.A03, c79723hN, new C72057XLy(c107384sj), this.A0B, this.A0C);
            AbstractC80203i9.A06(c2yn, c79723hN, c107384sj.A08, new XM0(c107384sj));
            EnumC79303gb enumC79303gb = c79723hN.A0F;
            AbstractC80203i9.A03(this.A01, c2yn, c79723hN, this.A06, enumC79303gb, new XM1(c107384sj));
            C79553h6 c79553h6 = c79723hN.A0C;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = c107384sj.A00;
            XM2 xm2 = new XM2(c107384sj);
            C14360o3.A0B(onSeekBarChangeListener, 2);
            c2yn.A02(new C9FN(14, c79553h6, onSeekBarChangeListener, xm2), new Object[]{c79553h6, onSeekBarChangeListener});
            C86633tb c86633tb = this.A09;
            boolean z2 = this.A0D;
            AbstractC80203i9.A04(c2yn, userSession, c75113Zb, c107384sj.A09, c86633tb, interfaceC60442pS.getModuleName(), new XM3(c107384sj), z2);
            return C0eB.A00;
        } catch (Throwable th) {
            c2yn.A00 = null;
            throw th;
        }
    }
}
