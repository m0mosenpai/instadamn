package X;

import android.graphics.RadialGradient;
import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.ui.view.MetaAIListeningIndicatorView;
import java.util.Random;

/* renamed from: X.CjT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC28588CjT implements Choreographer.FrameCallback {
    public final MetaAIListeningIndicatorView A00;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        MetaAIListeningIndicatorView metaAIListeningIndicatorView = this.A00;
        RadialGradient radialGradient = MetaAIListeningIndicatorView.A0S;
        long j2 = j - metaAIListeningIndicatorView.A07;
        metaAIListeningIndicatorView.A07 = j;
        int i = metaAIListeningIndicatorView.A05;
        int[] iArr = C25735BYv.A0b;
        metaAIListeningIndicatorView.A05 = (int) AbstractC27724CKr.A00(metaAIListeningIndicatorView.A06, i, 2.0f, j2);
        metaAIListeningIndicatorView.A01 = AbstractC27724CKr.A00(metaAIListeningIndicatorView.A04, metaAIListeningIndicatorView.A01, 0.025f, j2);
        float f = metaAIListeningIndicatorView.A02;
        Random random = metaAIListeningIndicatorView.A0L;
        metaAIListeningIndicatorView.A02 = Math.min(Math.max((f + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        metaAIListeningIndicatorView.A00 = Math.min(Math.max((metaAIListeningIndicatorView.A00 + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        metaAIListeningIndicatorView.A03 = Math.min(Math.max((metaAIListeningIndicatorView.A03 + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        if (metaAIListeningIndicatorView.A05 != i || metaAIListeningIndicatorView.A01 != metaAIListeningIndicatorView.A04) {
            metaAIListeningIndicatorView.invalidate();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    public ChoreographerFrameCallbackC28588CjT(MetaAIListeningIndicatorView metaAIListeningIndicatorView) {
        this.A00 = metaAIListeningIndicatorView;
    }
}
