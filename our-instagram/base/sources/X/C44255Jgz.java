package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Jgz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44255Jgz extends ImageView {
    public boolean A00;
    public final ObjectAnimator A01;

    public C44255Jgz(Context context) {
        super(context);
        float[] A1b = AbstractC43592JPx.A1b();
        // fill-array-data instruction
        A1b[0] = 0.0f;
        A1b[1] = 360.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", A1b).setDuration(850L);
        C14360o3.A07(duration);
        this.A01 = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        AbstractC43593JPy.A18(duration);
        AbstractC166997dE.A19(context, this, R.drawable.spinner_large);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i == 0 && getVisibility() == 0) {
                if (getAnimation() == null) {
                    if (getMeasuredWidth() != 0) {
                        this.A01.start();
                        return;
                    } else {
                        this.A00 = true;
                        return;
                    }
                }
                return;
            }
            this.A01.cancel();
            this.A00 = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1260640904);
        super.onAttachedToWindow();
        if (isShown()) {
            this.A01.start();
        }
        C0f9.A0D(777578769, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1361385964);
        this.A00 = false;
        this.A01.cancel();
        super.onDetachedFromWindow();
        C0f9.A0D(1141284911, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            this.A01.start();
            this.A00 = false;
        }
    }
}
