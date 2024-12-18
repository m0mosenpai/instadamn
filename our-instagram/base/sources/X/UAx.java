package X;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes11.dex */
public final class UAx extends Animation {
    public float A00;
    public final float A01;
    public final /* synthetic */ IgdsSwitch A02;

    public UAx(IgdsSwitch igdsSwitch, float f, float f2) {
        this.A02 = igdsSwitch;
        this.A01 = f;
        this.A00 = f2 - f;
        int i = IgdsSwitch.A0M;
        setDuration(Math.abs((250.0f * r5) / igdsSwitch.A02));
        setInterpolator(new DecelerateInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        IgdsSwitch igdsSwitch = this.A02;
        float f2 = this.A01 + (this.A00 * f);
        int i = IgdsSwitch.A0M;
        igdsSwitch.A00 = f2;
        igdsSwitch.invalidate();
    }
}
