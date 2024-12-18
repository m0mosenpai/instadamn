package X;

import android.widget.SeekBar;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YLG extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C9BD A00;
    public final /* synthetic */ C9BR A01;
    public final /* synthetic */ C77993eR A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C80143i3 A04;
    public final /* synthetic */ XVb A05;
    public final /* synthetic */ C86773tp A06;
    public final /* synthetic */ C80193i8 A07;
    public final /* synthetic */ C86633tb A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLG(C9BD c9bd, C9BR c9br, C77993eR c77993eR, C38321qM c38321qM, C80143i3 c80143i3, XVb xVb, C86773tp c86773tp, C80193i8 c80193i8, C86633tb c86633tb, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        super(1);
        this.A07 = c80193i8;
        this.A05 = xVb;
        this.A02 = c77993eR;
        this.A0B = z;
        this.A06 = c86773tp;
        this.A01 = c9br;
        this.A08 = c86633tb;
        this.A0A = z2;
        this.A04 = c80143i3;
        this.A00 = c9bd;
        this.A0C = z3;
        this.A09 = interfaceC16820sZ;
        this.A03 = c38321qM;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C2YN c2yn = (C2YN) obj;
        C14360o3.A0B(c2yn, 0);
        XVb xVb = this.A05;
        C80143i3 c80143i3 = this.A04;
        C9BD c9bd = this.A00;
        boolean z = this.A0C;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        C38321qM c38321qM = this.A03;
        try {
            c2yn.A00 = C00Q.A03("image_and_video", StringTreeSet.MAX_SYMBOL_COUNT);
            UserSession userSession = xVb.A01;
            InterfaceC60442pS interfaceC60442pS = xVb.A02;
            if (xVb.A07) {
                obj2 = Float.valueOf(xVb.A03.A00);
            } else {
                obj2 = 0;
            }
            c2yn.A02(new C30221DTa(1, xVb, c80143i3, interfaceC16820sZ, c38321qM, z), new Object[]{userSession, interfaceC60442pS, c80143i3, c9bd, obj2});
            c2yn.A00 = null;
            C79933hi c79933hi = XVb.A0B;
            C80193i8 c80193i8 = this.A07;
            C79723hN c79723hN = xVb.A03;
            C75113Zb c75113Zb = c79723hN.A0E;
            AbstractC80203i9.A07(c2yn, c80193i8, c79933hi, c75113Zb, new XM9(xVb, 8));
            AbstractC80203i9.A00(AbstractC77363dM.A00(this.A02), c2yn, c79723hN, new XM9(xVb, 9), this.A0B);
            AbstractC80203i9.A08(c2yn, xVb.A06, new XM9(xVb, 10));
            EnumC79303gb enumC79303gb = c79723hN.A0F;
            AbstractC80203i9.A03(this.A01, c2yn, c79723hN, this.A06, enumC79303gb, new XM9(xVb, 11));
            C79553h6 c79553h6 = c79723hN.A0C;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = xVb.A00;
            XM9 xm9 = new XM9(xVb, 12);
            C14360o3.A0B(onSeekBarChangeListener, 2);
            c2yn.A02(new C9FN(14, c79553h6, onSeekBarChangeListener, xm9), new Object[]{c79553h6, onSeekBarChangeListener});
            C86633tb c86633tb = this.A08;
            boolean z2 = this.A0A;
            AbstractC80203i9.A04(c2yn, userSession, c75113Zb, xVb.A05, c86633tb, interfaceC60442pS.getModuleName(), new XM9(xVb, 13), z2);
            return C0eB.A00;
        } catch (Throwable th) {
            c2yn.A00 = null;
            throw th;
        }
    }
}
