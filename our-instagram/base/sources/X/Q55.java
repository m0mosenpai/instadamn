package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes10.dex */
public final class Q55 extends FrameLayout {
    public double A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public ProgressBar A04;

    public final void A00() {
        ProgressBar progressBar = this.A04;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.A03);
            setColor(progressBar);
            progressBar.setProgress((int) (this.A00 * 1000.0d));
            int i = 4;
            if (this.A02) {
                i = 0;
            }
            progressBar.setVisibility(i);
            return;
        }
        throw new RuntimeException("setStyle() not called");
    }

    public final boolean getAnimating$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A02;
    }

    public final Integer getColor$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A01;
    }

    public final boolean getIndeterminate$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A03;
    }

    public final double getProgress$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid() {
        return this.A00;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable != null) {
            Integer num = this.A01;
            if (num != null) {
                progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                progressDrawable.clearColorFilter();
            }
        }
    }

    public final void setAnimating$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(boolean z) {
        this.A02 = z;
    }

    public final void setColor$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(Integer num) {
        this.A01 = num;
    }

    public final void setIndeterminate$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(boolean z) {
        this.A03 = z;
    }

    public final void setProgress$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(double d) {
        this.A00 = d;
    }

    public final void setStyle$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(String str) {
        ProgressBar A01 = C63055Sbc.A01(getContext(), C63055Sbc.A00(str));
        A01.setMax(1000);
        this.A04 = A01;
        removeAllViews();
        addView(this.A04, new ViewGroup.LayoutParams(-1, -1));
    }
}
