package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BoS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26569BoS extends AbstractC51572Yf {
    public final C167297di A00;
    public final UserSession A01;
    public final C131325wL A02;
    public final String A03;
    public final boolean A04;
    public final C51722Yv A05;
    public final C166047bW A06;
    public final C25814BbV A07;
    public final boolean A08;
    public static final long A0A = AbstractC25230BEn.A0K();
    public static final long A09 = AbstractC25232BEp.A0r(12.0f);

    public C26569BoS(C51722Yv c51722Yv, C167297di c167297di, C166047bW c166047bW, C25814BbV c25814BbV, UserSession userSession, C131325wL c131325wL, String str, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(3, c25814BbV, c131325wL, userSession);
        C14360o3.A0B(str, 7);
        this.A00 = c167297di;
        this.A06 = c166047bW;
        this.A07 = c25814BbV;
        this.A02 = c131325wL;
        this.A01 = userSession;
        this.A04 = z;
        this.A03 = str;
        this.A08 = z2;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        List list;
        C14360o3.A0B(c76223bS, 0);
        Float valueOf = Float.valueOf(1.0f);
        C2XI A00 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, valueOf);
        AbstractC77313dH.A00(c76223bS, new D8L(47, AbstractC77183d4.A00(c76223bS, new D8L(48, A002, A00), new Object[0]), this), AbstractC25230BEn.A1a());
        C167297di c167297di = this.A00;
        int A0K = AbstractC167017dG.A0K(c167297di.A0G);
        String A003 = AbstractC43744JWe.A00(AbstractC25229BEm.A0O(c76223bS), Integer.valueOf(A0K), 1000, true);
        C14360o3.A07(A003);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A0C;
        C51722Yv A004 = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 0.0f, 1)).A00(this.A05);
        UserSession userSession = this.A01;
        C166047bW c166047bW = this.A06;
        C25814BbV c25814BbV = this.A07;
        C131325wL c131325wL = this.A02;
        C2XE c2xe = c76223bS.A05;
        C51722Yv A005 = A004.A00(CG2.A00(AbstractC166997dE.A0M(c2xe.A0C), c167297di, c166047bW, c25814BbV, userSession, c131325wL, false));
        User user = null;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        Drawable drawable = (Drawable) AbstractC77183d4.A00(c76223bS, new D89(c76223bS, 42), new Object[0]);
        Drawable drawable2 = (Drawable) AbstractC77183d4.A00(c76223bS, new D89(c76223bS, 41), new Object[0]);
        boolean z = c167297di.A0S;
        if (z) {
            drawable = drawable2;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        if (this.A08) {
            if (c166047bW != null) {
                user = c166047bW.A0A;
            }
            if (c167297di.A04(userSession) && user != null) {
                list = AbstractC166987dD.A1J(user);
            } else {
                list = C16930sl.A00;
            }
            Context A006 = AbstractC77363dM.A00(c76223bS);
            String str = this.A03;
            int i = 14;
            if (this.A04) {
                i = 16;
            }
            Drawable drawable3 = drawable;
            drawable = AbstractC89513yr.A00(A006, drawable3, Float.valueOf(0.25f), C05F.A00, 2, null, null, null, str, list, AbstractC13690mv.A01(AbstractC77363dM.A00(c76223bS), i), false, false, false, false, true);
        }
        boolean z2 = this.A04;
        int i2 = 14;
        if (z2) {
            i2 = 16;
        }
        long A0A2 = AbstractC25225BEi.A0A(i2);
        Integer num2 = C05F.A01;
        C51722Yv A007 = C9CU.A00(AbstractC25234BEr.A0A(A00, C9CU.A00(null, num2, 0, A0A2), new C9CV(A00, C05F.A1F)), C05F.A0E, 0, A0A);
        Integer num3 = C05F.A00;
        C51722Yv A0T = AbstractC25233BEq.A0T(AbstractC25231BEo.A0X(A002, A007, num3), AbstractC25225BEi.A0o(C05F.A06, Boolean.valueOf(z), 4), num, 0.0f, 1);
        Integer num4 = C05F.A08;
        AbstractC25228BEl.A1I(drawable, scaleType, A0P, AbstractC25233BEq.A0W(C9CV.A00(A0T, num4, "row_comment_like_button", 4), A0P, 2131965099));
        if (A0K > 0) {
            C51722Yv A008 = C9CV.A00(AbstractC25230BEn.A0d(null, num2, 0.0f, 1), num4, "row_comment_textview_like_count", 4);
            long j = A09;
            C2XE c2xe2 = A0P.A00;
            Context context = c2xe2.A0C;
            int A07 = AbstractC25229BEm.A07(context, A0P);
            int i3 = R.style.igds_emphasized_body_2;
            if (z2) {
                i3 = R.style.igds_emphasized_body_1;
            }
            Typeface create = Typeface.create("sans-serif-medium", 0);
            C14360o3.A07(create);
            Typeface A03 = AbstractC14710oj.A03(context, create, num2);
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A003, i3);
            AbstractC25233BEq.A1B(A0P, A0a, A07, j);
            A0a.A0S(0);
            AbstractC25234BEr.A0o(A03, A0P, A0a, A0D);
            A0a.A0X(num3);
            AbstractC25234BEr.A1C(A0a, num3, 1.0f);
            A0a.A0D();
            AbstractC25233BEq.A1A(A0P, A008, A0a);
        }
        return AbstractC76963ci.A0H(A0P, c76223bS, A005);
    }
}
