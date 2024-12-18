package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Bkt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26348Bkt extends AbstractC51572Yf {
    public final C169547hU A00;
    public final UserSession A01;
    public final Jn5 A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C38321qM c38321qM;
        C14360o3.A0B(c76223bS, 0);
        EnumC27402C7f enumC27402C7f = this.A00.A00;
        String A0F = AbstractC77623dm.A0F(c76223bS, enumC27402C7f.A00);
        Jn5 jn5 = this.A02;
        Integer num = enumC27402C7f.A02;
        C14360o3.A0B(num, 0);
        C675432t c675432t = jn5.A02;
        InterfaceC38371qR interfaceC38371qR = jn5.A06.A00;
        if (interfaceC38371qR != null) {
            c38321qM = interfaceC38371qR.BQN();
        } else {
            c38321qM = null;
        }
        String A00 = AbstractC43591JPw.A00(106);
        if (c38321qM != null) {
            String A0T = AnonymousClass001.A0T(A00, AbstractC166107be.A00(num), '_');
            User A2E = c38321qM.A2E(c675432t.A03);
            if (A2E == null) {
                C0f5 AEp = C18950wb.A01.AEp("COMMENTS_LOGGER: Media Author Id is null.", 817896325);
                AEp.ABW("Media Id", c38321qM.getId());
                AEp.report();
            } else {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c675432t.A02, "ig_comments_context_menu_impresssion");
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    AbstractC25236BEt.A0r(A0f, A2u);
                    AbstractC25230BEn.A1D(A0f, Long.parseLong(A2E.getId()));
                    AbstractC25225BEi.A1O(A0f, A0T);
                    A0f.Cht();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Context A0O = AbstractC25226BEj.A0O(A12);
        C75933ay c75933ay = C51722Yv.A02;
        long A0F2 = AbstractC25229BEm.A0F();
        long A0E = AbstractC25229BEm.A0E();
        C51722Yv A0d = AbstractC25233BEq.A0d(AbstractC25234BEr.A0D(C9CU.A00(null, C05F.A0u, 0, A0F2), AbstractC25227BEk.A0c(A0E), 0, AbstractC25229BEm.A0B()), new C30172DRc(48, A0O, A12, this));
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        long A09 = AbstractC77623dm.A09(A0K);
        Typeface A0R = AbstractC167017dG.A0R(AbstractC77363dM.A00(A0K));
        int A07 = AbstractC25229BEm.A07(A0O, A0K);
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(A0K.A00, null, A0F, 0);
        AbstractC25233BEq.A1B(A0K, A0a, A07, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0R, A0K, A0a, A0D);
        A0a.A0X(num2);
        AbstractC25234BEr.A1H(A0a, num2, false);
        A0a.A0E();
        AbstractC25234BEr.A15(A0K, A0a, false);
        AbstractC25231BEo.A1A(new C85463rb(ImageView.ScaleType.CENTER, C9CU.A00(null, C05F.A04, 0, AbstractC77623dm.A06(A0K)), null, R.drawable.instagram_chevron_down_pano_filled_12, A0K.BoZ().A01(R.attr.glyphColorSecondary)), A0K, A12, A0d);
        return new C2WF(null, null, null, A12.A01, false);
    }

    public C26348Bkt(C169547hU c169547hU, UserSession userSession, Jn5 jn5) {
        AbstractC167027dH.A13(c169547hU, jn5, userSession);
        this.A00 = c169547hU;
        this.A02 = jn5;
        this.A01 = userSession;
    }
}
