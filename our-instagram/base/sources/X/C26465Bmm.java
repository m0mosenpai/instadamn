package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bmm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26465Bmm extends AbstractC51572Yf {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final int A02;
    public final int A03;
    public final C51722Yv A04;
    public final InterfaceC30886Dhz A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30886Dhz interfaceC30886Dhz = this.A05;
        if (interfaceC30886Dhz instanceof D0P) {
            return null;
        }
        if (interfaceC30886Dhz instanceof C26251BjK) {
            Context A00 = AbstractC77363dM.A00(c76223bS);
            UserSession userSession = this.A01;
            C26251BjK c26251BjK = (C26251BjK) interfaceC30886Dhz;
            List list = c26251BjK.A01;
            SpannableStringBuilder A002 = AbstractC100574fM.A00(A00, userSession, null, null, AbstractC166987dD.A1F(AbstractC001800i.A0X(list)), list.size(), c76223bS.BoZ().A01(R.attr.igds_color_primary_text_on_media), AbstractC25230BEn.A1S(AbstractC166987dD.A1F(AbstractC001800i.A0X(list)).size(), 2), true, true).A00();
            C14360o3.A07(A002);
            C51722Yv c51722Yv = this.A04;
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            Drawable A07 = C57332k8.A0m.A00(AbstractC77363dM.A00(c76223bS), userSession).A07(AbstractC77363dM.A00(c76223bS), c26251BjK.A00, this.A00.getModuleName());
            C75933ay c75933ay = C51722Yv.A02;
            int i = this.A02;
            long A0D = AbstractC77623dm.A0D(A12, i);
            Integer num = C05F.A00;
            C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(AbstractC25233BEq.A0X(C9CU.A00(null, num, 0, A0D), A12, i), C05F.A09, 0, AbstractC77623dm.A0A(A12)), C05F.A0C, 0.0f, 1);
            C2XE c2xe = A12.A00;
            AbstractC25234BEr.A0r(A07, c2xe, A12, A0d);
            Typeface A0Q = AbstractC25226BEj.A0Q(AbstractC77363dM.A00(A12), num);
            int A06 = AbstractC25228BEl.A06(c2xe.A0C, A12, R.attr.igds_color_primary_text_on_media);
            long A0D2 = AbstractC77623dm.A0D(A12, this.A03);
            int A02 = A12.BoZ().A02(R.color.black_30_transparent);
            long A0D3 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            long A0D4 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A002, 0);
            AbstractC25233BEq.A1B(A12, A0a, A06, A0D2);
            AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(A0Q, A12, A0a, 0, A02), A0D3), A0D4);
            AbstractC25234BEr.A1I(A0a, num, false);
            A0a.A0M(2);
            AbstractC25234BEr.A15(A12, A0a, false);
            return AbstractC76963ci.A0H(A12, c76223bS, c51722Yv);
        }
        throw B4Z.A00();
    }

    public C26465Bmm(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC30886Dhz interfaceC30886Dhz) {
        AbstractC167017dG.A1P(interfaceC11380iw, interfaceC30886Dhz);
        this.A00 = interfaceC11380iw;
        this.A05 = interfaceC30886Dhz;
        this.A04 = c51722Yv;
        this.A02 = R.dimen.abc_dropdownitem_icon_width;
        this.A03 = R.dimen.action_bar_item_spacing_right;
        this.A01 = userSession;
    }
}
