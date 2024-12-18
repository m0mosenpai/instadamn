package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bkx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26352Bkx extends AbstractC51572Yf {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String A0F;
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(450.0d);
        Integer num = C05F.A01;
        C51722Yv A00 = C9CU.A00(null, num, 0, doubleToRawLongBits);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C4dV c4dV = (C4dV) this.A02.invoke();
        C51722Yv A002 = C9CU.A00(null, C05F.A0Y, 0, Double.doubleToRawLongBits(56.0d));
        long A0F2 = AbstractC25229BEm.A0F();
        Integer num2 = C05F.A04;
        C51722Yv A003 = C9CU.A00(A002, num2, 0, A0F2);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        C80403iV A0Z = AbstractC25231BEo.A0Z(AbstractC77623dm.A0E(A13, R.drawable.instagram_app_threads_pano_outline_24), A13.A00);
        A0Z.A0C();
        A13.A00(A0Z.A0A());
        String str = c4dV.A08;
        Integer valueOf = Integer.valueOf(A13.BoZ().A01(R.attr.igds_color_primary_text));
        C2Z3 A0p = AbstractC25225BEi.A0p(AbstractC77623dm.A0D(A13, R.dimen.auth_title_text_size));
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 1.0f, 1);
        long A0J = AbstractC25229BEm.A0J();
        A13.A00(new C78003eS(null, null, C9CU.A00(A0d, num2, 0, A0J), A0p, C78003eS.A0C, true, str, null, valueOf, null, null, null));
        EnumC99704do enumC99704do = EnumC99704do.A07;
        EnumC99714dp enumC99714dp = EnumC99714dp.A04;
        if (c4dV.A04.intValue() != 0) {
            A0F = AbstractC77623dm.A0F(A13, 2131975577);
        } else {
            A0F = AbstractC77623dm.A0F(A13, 2131975575);
        }
        AbstractC25230BEn.A1G(new C26635BpW(ViewOnClickListenerC28666ClE.A00(this, 3), c75933ay, enumC99714dp, enumC99704do, A0F), A13, A12, A003);
        A12.A00(AbstractC76963ci.A0M(A12, AbstractC25232BEp.A16(AbstractC25230BEn.A0d(null, num, 1.0f, 1), C05F.A00, AbstractC25225BEi.A0i(AbstractC77623dm.A02(A12, R.attr.igds_color_secondary_background)))));
        return AbstractC25227BEk.A0V(AbstractC76963ci.A0M(A12, C9CU.A00(null, C05F.A05, 0, A0J)), A12, c76223bS, A00);
    }

    public C26352Bkx(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1R(userSession, fragmentActivity);
        this.A02 = interfaceC16820sZ;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
