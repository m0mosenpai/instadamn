package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.instagram.common.ui.blur.BlurUtil;

/* loaded from: classes4.dex */
public abstract class A19 {
    public static final void A00(Bitmap bitmap, View view) {
        view.setBackground(new BitmapDrawable(view.getResources(), BlurUtil.blur(bitmap, 0.1f, 6)));
    }
}
