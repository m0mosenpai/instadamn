package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ST, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ST {
    public static final void A00(final View.OnClickListener onClickListener, C41181vS c41181vS, C143746eH c143746eH) {
        C14360o3.A0B(c143746eH, 0);
        c143746eH.A01();
        View view = c143746eH.A04;
        if (view != null) {
            Context context = view.getContext();
            TextView textView = c143746eH.A07;
            if (textView != null) {
                C14360o3.A0A(context);
                UserSession userSession = c143746eH.A0D;
                textView.setText(AbstractC84863qa.A05(context, userSession, c41181vS, false, null, null));
                ImageView imageView = c143746eH.A05;
                if (imageView != null) {
                    imageView.setImageDrawable(c143746eH.A09);
                    TextView textView2 = c143746eH.A08;
                    if (textView2 != null) {
                        textView2.setText(AbstractC84863qa.A05(context, userSession, c41181vS, false, null, null));
                    }
                    ImageView imageView2 = c143746eH.A06;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(c143746eH.A09);
                    }
                    c143746eH.A0A = true;
                    C0fQ.A00(new View.OnClickListener() { // from class: X.6SU
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int A05 = C0f9.A05(-693431109);
                            onClickListener.onClick(view2);
                            C0f9.A0C(-247420459, A05);
                        }
                    }, view);
                    view.setVisibility(0);
                    Resources resources = view.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    AbstractC13880nE.A0e(view, dimensionPixelSize);
                    AbstractC13880nE.A0V(view, dimensionPixelSize);
                    AbstractC13880nE.A0i(view, dimensionPixelSize2, dimensionPixelSize2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
