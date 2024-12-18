package X;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: X.Cda, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28288Cda {
    public static final void A00(HandwritingGesture handwritingGesture, CWQ cwq, BXF bxf, C59J c59j, Executor executor, final IntConsumer intConsumer, InterfaceC16660sJ interfaceC16660sJ) {
        final int i;
        if (cwq != null) {
            i = C28366CfR.A00.A01(handwritingGesture, cwq, bxf, c59j, interfaceC16660sJ);
        } else {
            i = 3;
        }
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: X.D1R
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i);
                    }
                });
            } else {
                intConsumer.accept(i);
            }
        }
    }

    public static final boolean A02(CancellationSignal cancellationSignal, PreviewableHandwritingGesture previewableHandwritingGesture, CWQ cwq, BXF bxf) {
        if (cwq != null) {
            return C28366CfR.A00.A02(cancellationSignal, previewableHandwritingGesture, cwq, bxf);
        }
        return false;
    }
}
