package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FR3 {
    public final View A00;
    public final C34970Fav A01;
    public final Context A02;

    public FR3(Context context, View view, C163917Vf c163917Vf) {
        C14360o3.A0B(view, 3);
        this.A02 = context;
        this.A00 = view;
        C34970Fav c34970Fav = new C34970Fav(view, c163917Vf);
        this.A01 = c34970Fav;
        View view2 = c34970Fav.A09;
        c34970Fav.A01 = (IgSimpleImageView) view2.requireViewById(R.id.invitation_channel_icon);
        c34970Fav.A00 = (IgSimpleImageView) view2.requireViewById(R.id.invitation_cancel_icon);
        c34970Fav.A03 = AbstractC31172DnG.A0X(view2, R.id.invitation_text_title);
        c34970Fav.A02 = AbstractC31172DnG.A0X(view2, R.id.invitation_text);
        c34970Fav.A05 = AbstractC31173DnH.A0W(view2, R.id.invitation_primary_cta_button);
        c34970Fav.A06 = AbstractC31173DnH.A0W(view2, R.id.invitation_secondary_button);
    }

    public final void A01(FragmentActivity fragmentActivity, C7DS c7ds, C2EE c2ee) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        List BJS;
        Context context = this.A02;
        C05A c05a = c7ds.A05;
        c05a.getValue();
        String str5 = null;
        if (c2ee != null) {
            str = c2ee.At6();
            str2 = c2ee.C7I();
            str3 = c2ee.C7q();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        boolean z = false;
        if (c2ee != null) {
            i = c2ee.AdZ();
        } else {
            i = 0;
        }
        C7DT c7dt = new C7DT(str, str2, str3, i);
        Integer num = (Integer) ((C9BW) c05a.getValue()).A00;
        C14360o3.A0B(num, 0);
        c05a.Egh(new C9BW(c7dt, num));
        C05A c05a2 = c7ds.A07;
        if (c2ee != null) {
            z = c2ee.CPZ();
        }
        AbstractC166997dE.A1Y(c05a2, z);
        C05A c05a3 = c7ds.A08;
        UserSession userSession = c7ds.A00;
        boolean z2 = false;
        if (c2ee != null && c2ee.CPZ() && (BJS = c2ee.BJS()) != null && BJS.contains(userSession.userId)) {
            z2 = true;
        }
        AbstractC166997dE.A1Y(c05a3, z2);
        C05A c05a4 = c7ds.A0B;
        AbstractC166997dE.A1Y(c05a4, C7I8.A00(userSession, c2ee));
        c7ds.A09.Egh(context.getString(2131960763));
        String str6 = ((C7DT) ((C9BW) c05a.getValue()).A01).A01;
        if (AbstractC31176DnK.A1b(c05a4)) {
            str5 = context.getString(2131954268);
        } else if (str6 != null) {
            str5 = AbstractC167007dF.A0f(context, str6, 2131954262);
        }
        boolean A1b = AbstractC31176DnK.A1b(c05a4);
        String A0p = AbstractC166997dE.A0p(context, 2131954260);
        int i2 = 2131954261;
        if (A1b) {
            i2 = 2131954267;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, A0p, i2));
        AnonymousClass773.A03(A0H, new EPO(new C012804r(16, A0p), userSession, C05F.A01, A0p, AbstractC31174DnI.A02(context)), A0p);
        Drawable drawable = context.getDrawable(R.drawable.instagram_shield_star_pano_outline_24);
        int i3 = 2131954246;
        if (AbstractC31176DnK.A1b(c05a4)) {
            i3 = 2131954266;
        }
        String A0u = AbstractC25227BEk.A0u(context, i3);
        if (!AbstractC31176DnK.A1b(c05a4)) {
            str4 = context.getString(2131954249);
        } else {
            str4 = null;
        }
        c7ds.A06.Egh(new C9CL(A0H, drawable, str5, A0u, str4, 1));
        AbstractC31178DnM.A11(fragmentActivity, new PZ3(c7ds, c2ee, this, null, 19), c7ds.A0E);
    }

    public final void A00() {
        C34970Fav c34970Fav = this.A01;
        c34970Fav.A03 = null;
        c34970Fav.A02 = null;
        c34970Fav.A01 = null;
        c34970Fav.A00 = null;
        c34970Fav.A05 = null;
        c34970Fav.A06 = null;
        AnonymousClass195 anonymousClass195 = c34970Fav.A07;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        c34970Fav.A04 = null;
    }
}
