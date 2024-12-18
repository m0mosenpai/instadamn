package X;

import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.Aww, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24715Aww implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractServiceC201348vN A01;

    public RunnableC24715Aww(AbstractServiceC201348vN abstractServiceC201348vN, int i) {
        this.A01 = abstractServiceC201348vN;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AREngineController aREngineController = this.A01.A0C;
        if (aREngineController != null) {
            aREngineController.setCameraFacing(this.A00);
        }
    }
}
