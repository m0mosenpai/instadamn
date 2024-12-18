package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.3Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72033Lb {
    public static final void A00(ImageView imageView, int i) {
        String quantityString;
        C14360o3.A0B(imageView, 0);
        imageView.setActivated(i > 0);
        imageView.setImageLevel(Math.min(i, 10000));
        Context context = imageView.getContext();
        C14360o3.A07(context);
        if (i == 0) {
            quantityString = context.getString(2131968842);
        } else {
            Resources resources = context.getResources();
            if (i < 99) {
                quantityString = resources.getQuantityString(R.plurals.notification_badge_description_plural, i, Integer.valueOf(i));
            } else {
                quantityString = resources.getQuantityString(R.plurals.notification_badge_description_more_than, 99, 99);
            }
        }
        C14360o3.A0A(quantityString);
        imageView.setContentDescription(quantityString);
    }
}
