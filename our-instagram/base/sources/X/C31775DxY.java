package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.DxY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31775DxY extends FrameLayout {
    public final AnimatorSet A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;

    public C31775DxY(Context context) {
        super(context, null, 0);
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.pulsing_image_view, (ViewGroup) this, true);
        ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.pulse_circle_outer);
        this.A03 = A08;
        ImageView A082 = AbstractC31171DnF.A08(inflate, R.id.pulse_circle_inner);
        this.A02 = A082;
        this.A01 = AbstractC31171DnF.A08(inflate, R.id.pulse_icon);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playTogether(AbstractC13160m2.A01(A08), AbstractC13160m2.A01(A082));
    }

    public final void setButtonResource(int i) {
        this.A01.setImageResource(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public final void setPulsingEnabled(boolean z) {
        if (z) {
            AnimatorSet animatorSet = this.A00;
            if (!animatorSet.isStarted()) {
                this.A03.setVisibility(0);
                this.A02.setVisibility(0);
                animatorSet.start();
                return;
            }
            return;
        }
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        AnimatorSet animatorSet2 = this.A00;
        if (!animatorSet2.isStarted()) {
            return;
        }
        animatorSet2.end();
    }
}
