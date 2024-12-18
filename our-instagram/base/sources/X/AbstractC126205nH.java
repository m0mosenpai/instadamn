package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.security.InvalidParameterException;

/* renamed from: X.5nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126205nH {
    public static final void A00(View view, ImageView imageView, TextView textView, TextView textView2, Integer num, boolean z) {
        int i;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(imageView, 1);
        if (num != C05F.A0N) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        i = R.dimen.avatar_size_ridiculously_xxlarge_plus;
                    } else {
                        throw new InvalidParameterException(AnonymousClass001.A0R("Card type is not supported: ", "SMALL"));
                    }
                } else {
                    i = R.dimen.avatar_size_ridiculously_xxxlarge;
                }
            } else {
                i = R.dimen.avatar_size_ridiculously_xxxlarge_plus;
            }
            Resources resources = imageView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            if (z) {
                imageView.setMaxHeight(dimensionPixelSize);
                imageView.setMaxWidth(dimensionPixelSize);
            } else {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
            }
            if (num == C05F.A01 || num == C05F.A00) {
                AbstractC13880nE.A0d(view, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            }
            if (textView != null) {
                Context context = textView.getContext();
                textView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igdsSecondaryText)));
            }
            if (textView2 != null) {
                Context context2 = textView2.getContext();
                textView2.setTextColor(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igdsSecondaryText)));
            }
        }
    }
}
