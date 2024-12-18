package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import com.facebook.R;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.3sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86193sq {
    public static final C86193sq A00 = new Object();

    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        if (AbstractC13890nF.A01(context) / AbstractC13890nF.A00(context) > 0.5625f && AbstractC52812bN.A00) {
            return true;
        }
        return false;
    }

    public final Size A01(Context context, ExtendedImageUrl extendedImageUrl, int i, int i2) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        if (extendedImageUrl == null) {
            return null;
        }
        float A01 = AbstractC13890nF.A01(context);
        if (AbstractC52812bN.A02(AbstractC52892bV.A00(resources.getConfiguration().screenWidthDp))) {
            A01 -= resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        }
        float f = A01 - i2;
        float A002 = AbstractC13890nF.A00(context) - i;
        float width = extendedImageUrl.getWidth() / extendedImageUrl.getHeight();
        float f2 = A002 * width;
        if (f2 > f) {
            A002 = f / width;
        } else {
            f = f2;
        }
        return new Size((int) f, (int) A002);
    }
}
