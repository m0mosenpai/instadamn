package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.zero.cms.ZeroCmsTextView;

/* renamed from: X.5Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114875Gx extends C1I7 {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public InterfaceC41501vz A05;
    public ZeroCmsTextView A06;
    public boolean A07 = true;

    public C114875Gx(LinearLayout linearLayout) {
        this.A03 = linearLayout;
        this.A06 = (ZeroCmsTextView) linearLayout.findViewById(R.id.free_photo_text);
        this.A04 = (TextView) this.A03.findViewById(R.id.video_setting_status_text);
        this.A02 = (ImageView) this.A03.findViewById(R.id.video_setting_icon);
        Drawable drawable = this.A03.getContext().getDrawable(R.drawable.video_setting_banner_background_blue);
        Drawable drawable2 = this.A03.getContext().getDrawable(R.drawable.video_setting_banner_background_white);
        this.A01 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A05 = new C36149FxN(this);
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        TransitionDrawable transitionDrawable;
        int A03 = C0f9.A03(1833043501);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        if (z != this.A07) {
            this.A07 = z;
            if (z) {
                transitionDrawable = this.A01;
            } else {
                transitionDrawable = this.A00;
            }
            LinearLayout linearLayout = this.A03;
            linearLayout.setBackgroundDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            ZeroCmsTextView zeroCmsTextView = this.A06;
            if (zeroCmsTextView != null) {
                Context context = linearLayout.getContext();
                int i6 = R.color.zero_rating_video_settings_drawer_cancel_button_color;
                if (z) {
                    i6 = R.color.design_dark_default_color_on_background;
                }
                zeroCmsTextView.setTextColor(context.getColor(i6));
            }
            TextView textView = this.A04;
            if (textView != null) {
                Context context2 = linearLayout.getContext();
                int i7 = R.color.zero_rating_video_settings_drawer_subtitle_color;
                if (z) {
                    i7 = R.color.fds_white_alpha60;
                }
                textView.setTextColor(context2.getColor(i7));
            }
            ImageView imageView = this.A02;
            if (imageView != null) {
                Context context3 = linearLayout.getContext();
                int i8 = R.color.baseline_neutral_80;
                if (z) {
                    i8 = R.color.design_dark_default_color_on_background;
                }
                imageView.setColorFilter(C3DY.A00(context3.getColor(i8)));
            }
        }
        C0f9.A0A(209932255, A03);
    }
}
