package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes11.dex */
public final class UJO extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgFrameLayout A03;
    public final RoundedCornerImageView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJO(View view, TextView textView, TextView textView2, IgFrameLayout igFrameLayout, RoundedCornerImageView roundedCornerImageView) {
        super(view);
        AbstractC25234BEr.A0j(2, textView, textView2, roundedCornerImageView, igFrameLayout);
        this.A00 = view;
        this.A02 = textView;
        this.A01 = textView2;
        this.A04 = roundedCornerImageView;
        this.A03 = igFrameLayout;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
    }
}
