package X;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.view.View;

/* renamed from: X.FXl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34853FXl {
    public static final PropertyValuesHolder A00(float f, boolean z) {
        float f2 = 1.0f;
        if (z) {
            f2 = f;
        }
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, f2);
        if (z) {
            f = 1.0f;
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.SCALE_X, ofFloat, Keyframe.ofFloat(1.0f, f));
        C14360o3.A07(ofKeyframe);
        return ofKeyframe;
    }

    public static final PropertyValuesHolder A01(float f, boolean z) {
        float f2 = 1.0f;
        if (z) {
            f2 = f;
        }
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, f2);
        if (z) {
            f = 1.0f;
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.SCALE_Y, ofFloat, Keyframe.ofFloat(1.0f, f));
        C14360o3.A07(ofKeyframe);
        return ofKeyframe;
    }
}
