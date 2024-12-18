package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.30i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC669130i {
    public static final C55942hf A00 = C55942hf.A03(8.0d, 13.0d);

    public static final BitmapDrawable A00(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        return A02(context, viewGroup, 3, R.color.black);
    }

    public static final ViewGroup A03(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return (ViewGroup) activity.findViewById(android.R.id.content);
    }

    public static final BitmapDrawable A01(Context context, ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 1);
        Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        viewGroup.draw(new Canvas(createBitmap));
        return new BitmapDrawable(context.getResources(), BlurUtil.blur(createBitmap, 0.1f, i));
    }

    public static final BitmapDrawable A02(Context context, ViewGroup viewGroup, int i, int i2) {
        BitmapDrawable bitmapDrawable;
        viewGroup.setDrawingCacheEnabled(true);
        viewGroup.buildDrawingCache();
        Bitmap drawingCache = viewGroup.getDrawingCache();
        if (drawingCache != null) {
            Bitmap blur = BlurUtil.blur(drawingCache, 0.1f, i);
            new Canvas(blur).drawColor(context.getColor(i2), PorterDuff.Mode.DST_OVER);
            bitmapDrawable = new BitmapDrawable(context.getResources(), blur);
        } else {
            bitmapDrawable = null;
        }
        viewGroup.destroyDrawingCache();
        viewGroup.setDrawingCacheEnabled(false);
        return bitmapDrawable;
    }
}
