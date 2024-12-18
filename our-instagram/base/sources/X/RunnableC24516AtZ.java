package X;

import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AtZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24516AtZ implements Runnable {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    public RunnableC24516AtZ(AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A00 = abstractServiceC201348vN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AREngineController aREngineController = this.A00.A0C;
        if (aREngineController != null) {
            aREngineController.resetCurrentEffect();
        }
    }
}
