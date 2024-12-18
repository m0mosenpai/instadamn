package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FQM {
    public CircularImageView A00;
    public final Activity A01;
    public final Context A02;
    public final C53O A03;
    public final UserSession A04;
    public final String A05;

    public FQM(Activity activity, Context context, C53O c53o, UserSession userSession, String str) {
        AbstractC167007dF.A1G(userSession, 2, c53o);
        this.A02 = context;
        this.A04 = userSession;
        this.A01 = activity;
        this.A05 = str;
        this.A03 = c53o;
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        CircularImageView circularImageView = this.A00;
        if (circularImageView != null) {
            Context context = this.A02;
            circularImageView.setImageDrawable(new C44306Jhx(context, new ColorDrawable(AbstractC167007dF.A09(context, R.attr.igds_color_elevated_highlight_background)), null, str, R.dimen.action_bar_item_spacing_left, 0, 0, 0, 1896, false));
        }
        CircularImageView circularImageView2 = this.A00;
        if (circularImageView2 != null) {
            AbstractC166997dE.A18(this.A02, circularImageView2, 2131961566);
        }
    }
}
