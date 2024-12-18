package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FTv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34772FTv {
    public static final void A00(LinearLayout linearLayout, UserSession userSession, IgImageView igImageView) {
        Context context;
        float A04;
        AbstractC167007dF.A1D(linearLayout, 1, igImageView);
        if (C18U.A06(C06090Tz.A05, userSession, 36318209095702557L)) {
            linearLayout.setGravity(49);
            context = igImageView.getContext();
            C14360o3.A07(context);
            A04 = AbstractC13880nE.A04(context, 3);
        } else {
            linearLayout.setGravity(17);
            context = igImageView.getContext();
            C14360o3.A07(context);
            A04 = AbstractC13880nE.A04(context, 1);
        }
        igImageView.setPadding(AbstractC167017dG.A07(context), (int) A04, 0, 0);
    }

    public static final void A01(TextView textView, UserSession userSession, IgImageView igImageView) {
        AbstractC167007dF.A1D(textView, 1, igImageView);
        if (C18U.A06(C06090Tz.A05, userSession, 36318209095768094L)) {
            textView.setTypeface(null, 1);
            Context A0L = AbstractC166997dE.A0L(igImageView);
            igImageView.setPadding(AbstractC167017dG.A07(A0L), AbstractC166987dD.A0C(A0L, 4), 0, 0);
        }
    }
}
