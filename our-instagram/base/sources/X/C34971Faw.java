package X;

import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* renamed from: X.Faw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34971Faw {
    public float A01;
    public float A02;
    public long A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final DisabledHorizontalScrollView A0A;
    public final UserInputTextView A0B;
    public float A00 = -1.0f;
    public final ChoreographerFrameCallbackC35474FlA A09 = new ChoreographerFrameCallbackC35474FlA(this);

    public static final void A00(C34971Faw c34971Faw) {
        if (!c34971Faw.A04) {
            UserInputTextView userInputTextView = c34971Faw.A0B;
            if (userInputTextView.getVisibility() == 0 && Math.abs(userInputTextView.getTranslationX() - c34971Faw.A02) >= 0.5f) {
                c34971Faw.A04 = true;
                c34971Faw.A03 = 0L;
                c34971Faw.A00 = -1.0f;
                Choreographer.getInstance().postFrameCallback(c34971Faw.A09);
            }
        }
    }

    public C34971Faw(DisabledHorizontalScrollView disabledHorizontalScrollView, UserInputTextView userInputTextView, float f, float f2, float f3, float f4, float f5) {
        this.A0A = disabledHorizontalScrollView;
        this.A0B = userInputTextView;
        this.A06 = f2;
        this.A07 = f3;
        this.A08 = f4;
        this.A05 = f5;
        disabledHorizontalScrollView.A01 = f;
        disabledHorizontalScrollView.A00 = f2;
        ViewOnLayoutChangeListenerC35699FpZ.A00(disabledHorizontalScrollView, 6, this);
        ViewOnLayoutChangeListenerC35699FpZ.A00(userInputTextView, 7, this);
        userInputTextView.A00 = new GJV(this);
    }
}
