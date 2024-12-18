package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.smartcapture.ui.SCImageView;

/* renamed from: X.Jl0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44438Jl0 extends ScrollView {
    public TextView A00;
    public TextView A01;
    public SCImageView A02;

    public void set(L2H l2h) {
        String str;
        C14360o3.A0B(l2h, 0);
        int i = l2h.A01;
        int i2 = l2h.A00;
        Drawable drawable = l2h.A03;
        TextView textView = this.A01;
        if (textView == null) {
            str = "titleView";
        } else {
            textView.setText(i);
            TextView textView2 = this.A00;
            if (textView2 == null) {
                str = "subtitleView";
            } else {
                textView2.setText(i2);
                str = "imageView";
                if (drawable != null) {
                    SCImageView sCImageView = this.A02;
                    if (sCImageView != null) {
                        sCImageView.setLayerType(0, null);
                        SCImageView sCImageView2 = this.A02;
                        if (sCImageView2 != null) {
                            sCImageView2.setImageAlpha(255);
                            SCImageView sCImageView3 = this.A02;
                            if (sCImageView3 != null) {
                                sCImageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                                SCImageView sCImageView4 = this.A02;
                                if (sCImageView4 != null) {
                                    sCImageView4.setImageDrawable(drawable);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
