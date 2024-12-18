package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.4eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99894eB {
    public final Activity A00;
    public final boolean A01;
    public final boolean A02;

    public static final FrameLayout A00(C99894eB c99894eB) {
        Activity activity = c99894eB.A00;
        int color = activity.getResources().getColor(R.color.splash_screen_background);
        boolean z = c99894eB.A02;
        Resources resources = activity.getResources();
        Drawable drawable = activity.getDrawable(R.drawable.instagram);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackgroundColor(color);
        frameLayout.setFitsSystemWindows(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(drawable);
        imageView.setId(1);
        imageView.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        frameLayout.addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(activity);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.from_meta_gradient);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
        imageView2.setImageBitmap(decodeResource);
        imageView2.setId(2);
        imageView2.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        frameLayout.addView(imageView2, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        if (drawable != null) {
            int i = resources.getConfiguration().orientation;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i == 2) {
                intrinsicHeight /= 3;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = intrinsicHeight;
        }
        if (z) {
            frameLayout.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        C0B7.A00(imageView, imageView2);
        return frameLayout;
    }

    public final void A02() {
        Activity activity = this.A00;
        A01(activity, this);
        if (Build.VERSION.SDK_INT < 31) {
            AbstractC99914eD.A00(activity, A00(this), this.A01);
        }
    }

    public C99894eB(Activity activity, boolean z, boolean z2) {
        this.A00 = activity;
        this.A01 = z;
        this.A02 = z2;
    }

    public static final void A01(Activity activity, C99894eB c99894eB) {
        Window window = activity.getWindow();
        if (window != null) {
            Window window2 = activity.getWindow();
            C14360o3.A07(window2);
            if (!window2.hasFeature(1)) {
                try {
                    window2.requestFeature(1);
                } catch (Exception e) {
                    C0K8.A0I("FbMainActivitySplashHelper", "Unable to request FEATURE_NO_TITLE (setContentView already called?)", e);
                }
            }
        }
        activity.setContentView(A00(c99894eB));
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                AbstractC107044s5.A01(window, c99894eB.A01);
            } else if (i >= 29) {
                AbstractC99904eC.A00(window, c99894eB.A01);
            } else {
                AbstractC99914eD.A01(window, c99894eB.A01);
            }
        }
    }
}
