package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.FMe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34595FMe {
    public final View A00;
    public final View A01;
    public final ViewGroup A02;
    public final List A03;
    public final SpinnerImageView A04;

    public C34595FMe(View view, UserSession userSession) {
        AbstractC167017dG.A1Q(view, userSession);
        View A0c = AbstractC166987dD.A0c(view, R.id.comment_emoji_picker_v1_parent);
        this.A01 = A0c;
        this.A00 = AbstractC166987dD.A0c(view, R.id.emoji_picker_v1_divider);
        this.A04 = (SpinnerImageView) AbstractC166987dD.A0c(view, R.id.row_feed_emoji_picker_loading_spinner);
        this.A03 = AbstractC166987dD.A1E();
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.comment_emoji_picker_v1_emoji_container);
        this.A02 = A0F;
        if (C18U.A06(C06090Tz.A05, userSession, 36322967919405849L)) {
            A0c.setPadding(0, 0, 0, 0);
        }
        Context context = A0F.getContext();
        int A0C = AbstractC167017dG.A0C(context);
        int i = 0;
        do {
            IgFrameLayout A01 = AbstractC168777gB.A01(context, A0C, false);
            this.A02.addView(A01);
            this.A03.add(A01);
            i++;
        } while (i < 8);
    }
}
