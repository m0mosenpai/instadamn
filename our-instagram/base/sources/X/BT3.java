package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BT3 extends AbstractC51572Yf {
    public final InterfaceC31017DkG A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final EnumC75183Zl A04;
    public final InterfaceC30945Dj2 A05;
    public final BOK A06;

    public BT3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, EnumC75183Zl enumC75183Zl, InterfaceC30945Dj2 interfaceC30945Dj2, InterfaceC31017DkG interfaceC31017DkG, BOK bok) {
        AbstractC167027dH.A0a(1, bok, interfaceC31017DkG, interfaceC11380iw, userSession);
        this.A06 = bok;
        this.A00 = interfaceC31017DkG;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A04 = enumC75183Zl;
        this.A05 = interfaceC30945Dj2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        ViewOnClickListenerC28654Cl2 viewOnClickListenerC28654Cl2;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC31017DkG interfaceC31017DkG = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession userSession = this.A02;
        C38321qM c38321qM = this.A03;
        EnumC75183Zl enumC75183Zl = this.A04;
        InterfaceC30945Dj2 interfaceC30945Dj2 = this.A05;
        AbstractC167027dH.A12(interfaceC11380iw, userSession, c38321qM);
        if (enumC75183Zl != EnumC75183Zl.A03) {
            viewOnClickListenerC28654Cl2 = new ViewOnClickListenerC28654Cl2(1, c38321qM, interfaceC11380iw, userSession, interfaceC30945Dj2, enumC75183Zl);
        } else {
            viewOnClickListenerC28654Cl2 = null;
        }
        interfaceC31017DkG.Ea2(viewOnClickListenerC28654Cl2);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25233BEq.A0d(C9CU.A00(null, C05F.A15, 0, AbstractC77623dm.A06(c76223bS)), DRT.A00(this, 43));
        String A0F = AbstractC77623dm.A0F(c76223bS, this.A06.A00);
        C2XE c2xe = c76223bS.A05;
        int A03 = AbstractC25232BEp.A03(c2xe.A0C, c76223bS, R.attr.igds_color_secondary_text_on_media);
        long A09 = AbstractC77623dm.A09(c76223bS);
        Integer num = C05F.A0N;
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A03, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num, num2);
        A0a.A0E();
        AbstractC25233BEq.A1D(A0d, A0a, false);
        return A0a.A0A();
    }
}
