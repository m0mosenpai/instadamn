package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.JXz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43786JXz {
    public static final void A00(Context context, ImageView imageView) {
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.alert_off_new_pano_outline_12dp));
        boolean A07 = C14640oc.A07();
        int i = R.attr.textColorTertiary;
        if (A07) {
            i = R.attr.muteIconPrimaryColor;
        }
        imageView.setColorFilter(AbstractC53242c7.A0F(context, i));
        imageView.setVisibility(0);
    }
}
