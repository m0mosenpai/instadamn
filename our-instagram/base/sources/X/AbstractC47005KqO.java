package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KqO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47005KqO {
    public static final void A00(UserSession userSession, C47631L1q c47631L1q) {
        Context context;
        TextView textView;
        C14360o3.A0B(c47631L1q, 0);
        if (c47631L1q.A00 == null) {
            View inflate = c47631L1q.A02.inflate();
            AbstractC43592JPx.A1T(inflate);
            ViewGroup viewGroup = (ViewGroup) inflate;
            c47631L1q.A00 = viewGroup;
            if (viewGroup != null) {
                textView = AbstractC166997dE.A0T(viewGroup, R.id.direct_story_reply_original_media_attribution_text);
            } else {
                textView = null;
            }
            c47631L1q.A01 = textView;
        }
        ViewGroup viewGroup2 = c47631L1q.A00;
        if (viewGroup2 != null && (context = viewGroup2.getContext()) != null) {
            TextView textView2 = c47631L1q.A01;
            if (textView2 != null) {
                textView2.setText(AbstractC86593tX.A0F(context, userSession, 2131959925));
            }
            ViewGroup viewGroup3 = c47631L1q.A00;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
        }
    }
}
