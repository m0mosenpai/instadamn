package X;

import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* renamed from: X.FlA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC35474FlA implements Choreographer.FrameCallback {
    public final /* synthetic */ C34971Faw A00;

    public ChoreographerFrameCallbackC35474FlA(C34971Faw c34971Faw) {
        this.A00 = c34971Faw;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C34971Faw c34971Faw = this.A00;
        UserInputTextView userInputTextView = c34971Faw.A0B;
        if (userInputTextView.getVisibility() == 0) {
            float translationX = userInputTextView.getTranslationX();
            float f = c34971Faw.A02;
            if (Math.abs(translationX - f) >= 0.5f) {
                long j2 = c34971Faw.A03;
                if (j2 != 0) {
                    long j3 = (j - j2) / 1000000;
                    float abs = Math.abs(f - userInputTextView.getTranslationX());
                    int i = -1;
                    if (c34971Faw.A02 > userInputTextView.getTranslationX()) {
                        i = 1;
                    }
                    float f2 = c34971Faw.A00;
                    float f3 = c34971Faw.A08;
                    if (f2 >= f3) {
                        f3 = Math.min(f2 + c34971Faw.A05, c34971Faw.A07);
                    }
                    c34971Faw.A00 = f3;
                    userInputTextView.setTranslationX(userInputTextView.getTranslationX() + (Math.min(c34971Faw.A00 * ((float) j3), abs) * i));
                }
                c34971Faw.A03 = j;
                if (c34971Faw.A04) {
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
                return;
            }
        }
        c34971Faw.A04 = false;
    }
}
