package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BnI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26497BnI extends AbstractC51572Yf {
    public final InterfaceC30988Djn A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC31137Dmc A03;
    public final C9BW A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final InterfaceC60442pS A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        User Ae9;
        TestimonialDict A1N;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A06;
        TestimonialDict A1N2 = c38321qM.A1N();
        if (A1N2 == null || (Ae9 = A1N2.Ae9()) == null || (A1N = c38321qM.A1N()) == null || A1N.getText() == null) {
            return null;
        }
        C57342k9 c57342k9 = C57332k8.A0m;
        Context A00 = AbstractC77363dM.A00(c76223bS);
        UserSession userSession = this.A05;
        C57332k8 A002 = c57342k9.A00(A00, userSession);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0D = AbstractC25234BEr.A0D(AbstractC25230BEn.A0d(null, C05F.A0C, 0.0f, 1), AbstractC25227BEk.A0c(AbstractC77623dm.A0B(c76223bS)), 0, AbstractC77623dm.A08(c76223bS));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        A12.A00(C25436BNb.A00(A002.A0B(AbstractC77363dM.A00(A12), c38321qM, this.A07.getModuleName(), AbstractC166987dD.A1J(AbstractC101524hN.A00(Ae9))), A12, c38321qM.BqK(), "testimonial_profile_pictures", C30180DRl.A00(this, 43), true));
        C9BW c9bw = this.A04;
        int A02 = A12.BoZ().A02(R.color.fundraiser_sticker_donate_button_background_color);
        long A04 = AbstractC25449BNo.A04(userSession);
        A12.A00(new C89683z9(c9bw, enumC77683ds, userSession, Integer.valueOf(A02), AbstractC25449BNo.A06(A12, userSession), R.attr.igds_color_primary_text_on_media, R.attr.igds_color_primary_text_on_media, 1, R.dimen.add_payment_bottom_sheet_row_subtitle_size, R.dimen.abc_button_inset_vertical_material, 0, AbstractC25449BNo.A02(A12, userSession), 256, A04, AbstractC25449BNo.A05(userSession), true, true));
        InterfaceC30988Djn interfaceC30988Djn = this.A00;
        C25636BUy c25636BUy = null;
        if (interfaceC30988Djn != null) {
            c25636BUy = new C25636BUy(AbstractC25234BEr.A0K(AbstractC25230BEn.A0d(null, C05F.A00, 100.0f, 0), C05F.A01, 0), interfaceC30988Djn, this.A01, this.A02);
        }
        return AbstractC25226BEj.A0k(c25636BUy, A12, c76223bS, A0D);
    }

    public C26497BnI(C9BW c9bw, InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc) {
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A05 = userSession;
        this.A06 = c38321qM;
        this.A07 = interfaceC60442pS;
        this.A04 = c9bw;
        this.A03 = interfaceC31137Dmc;
        this.A00 = interfaceC30988Djn;
    }
}
