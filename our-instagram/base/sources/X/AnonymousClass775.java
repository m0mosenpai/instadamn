package X;

import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.775, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass775 {
    public static final void A00(TextView textView, boolean z) {
        C14360o3.A0B(textView, 0);
        if (z) {
            textView.setShadowLayer(2.0f, 0.0f, 1.0f, textView.getContext().getColor(R.color.black_50_transparent));
            textView.setTextColor(-1);
        } else {
            if (textView.getShadowColor() == 0) {
                return;
            }
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }
}
