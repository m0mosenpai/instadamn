package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ce8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28320Ce8 {
    public static final C89533yt A00(Context context, Bitmap bitmap, String str, int i, int i2, int i3) {
        C89533yt c89533yt = new C89533yt(null, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, false);
        c89533yt.A01(bitmap);
        return c89533yt;
    }

    public static final C89533yt A01(Context context, ImageUrl imageUrl, String str, int i, int i2, int i3) {
        return new C89533yt(imageUrl, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, true);
    }

    public static final C89553yv A02(Context context, String str, List list, int i, int i2, int i3) {
        int i4 = i;
        C14360o3.A0B(list, 1);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        if (i4 > size) {
            i4 = size;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            A1E.add(A01(context, (ImageUrl) AbstractC001800i.A0O(list, i5), str, resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3), context.getColor(R.color.barcelona_story_share_light_mode)));
        }
        return new C89553yv(context, C05F.A00, A1E, 0.42f, dimensionPixelSize, true);
    }
}
