package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Blf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26396Blf extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC75453aC A01;
    public final User A02;
    public final String A03;

    public C26396Blf(UserSession userSession, InterfaceC75453aC interfaceC75453aC, User user, String str) {
        C14360o3.A0B(user, 4);
        this.A03 = str;
        this.A01 = interfaceC75453aC;
        this.A00 = userSession;
        this.A02 = user;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25233BEq.A0h());
        Drawable drawable = AbstractC77363dM.A00(c76223bS).getDrawable(R.drawable.opal_badge_background);
        Integer num = C05F.A00;
        C51722Yv A0e = AbstractC25230BEn.A0e(C9CV.A00(AbstractC25231BEo.A0Y(C9CV.A00(A0h, num, drawable, 4), new C43362JEd(this, 39)), C05F.A0D, Integer.valueOf(R.id.feed_opal_indicator_component), 4), C05F.A0Y, new C50268MHx(39, c76223bS, this), null);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A00 = C9CU.A00(null, num, A1Z ? 1 : 0, AbstractC77623dm.A07(A12));
        long A07 = AbstractC77623dm.A07(A12);
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CU.A00(A00, num2, A1Z ? 1 : 0, A07);
        Drawable A0N = AbstractC25228BEl.A0N(A12, R.drawable.instagram_key_pano_outline_24);
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        AbstractC25231BEo.A0y(A0N, A12, AbstractC53242c7.A0E(context));
        AbstractC25234BEr.A0r(A0N, c2xe, A12, A002);
        C51722Yv A003 = C9CU.A00(C9CU.A00(C9CU.A00(null, num, A1Z ? 1 : 0, AbstractC77623dm.A0C(A12)), num2, A1Z ? 1 : 0, AbstractC77623dm.A0C(A12)), C05F.A0u, A1Z ? 1 : 0, AbstractC77623dm.A0A(A12));
        Drawable A0N2 = AbstractC25228BEl.A0N(A12, R.drawable.instagram_chevron_down_pano_filled_12);
        AbstractC25231BEo.A0y(A0N2, A12, AbstractC53242c7.A0E(context));
        AbstractC25234BEr.A0r(A0N2, c2xe, A12, A003);
        return AbstractC76963ci.A0H(A12, c76223bS, A0e);
    }
}
