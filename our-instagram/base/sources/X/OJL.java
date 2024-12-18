package X;

import android.app.Activity;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OJL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Activity A04;

    public final void A00(Reel reel, InterfaceC58060Pol interfaceC58060Pol, User user, String str) {
        Activity activity;
        int i;
        boolean A1a = AbstractC31175DnJ.A1a(str);
        if (user.A1t()) {
            boolean A0d = reel.A0d();
            activity = this.A04;
            i = 2131976102;
            if (A0d) {
                i = 2131976098;
            }
        } else {
            activity = this.A04;
            i = 2131963553;
        }
        String A0c = AbstractC31178DnM.A0c(activity, user, i);
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0j(new C89533yt(user.Bhu(), str, this.A01, this.A03, this.A02, this.A00));
        A0H.A05 = user.getUsername();
        A0H.A0s(A1a);
        A0H.A0t(A1a);
        DialogInterfaceOnClickListenerC55321Ogj.A01(A0H, interfaceC58060Pol, user, 44, 2131976876);
        A0H.A0b(DialogInterfaceOnClickListenerC55321Ogj.A00(interfaceC58060Pol, user, 45), A0c);
        A0H.A0D(DialogInterfaceOnClickListenerC55321Ogj.A00(interfaceC58060Pol, user, 46));
        A0H.A0C(new DialogInterfaceOnCancelListenerC55247OfL(8, user, interfaceC58060Pol));
        AbstractC166987dD.A1W(A0H);
    }

    public OJL(Activity activity) {
        this.A04 = activity;
        Resources resources = activity.getResources();
        this.A02 = AbstractC167007dF.A09(activity, R.attr.avatarInnerStroke);
        this.A00 = activity.getColor(AbstractC53242c7.A04(activity));
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }
}
