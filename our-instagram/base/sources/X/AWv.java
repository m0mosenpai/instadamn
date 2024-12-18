package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

/* loaded from: classes4.dex */
public final class AWv implements TouchGesturesListener$HitTestCallback {
    public final /* synthetic */ C2039790k A00;

    public AWv(C2039790k c2039790k) {
        this.A00 = c2039790k;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback
    public final void hitTestResult(long j, boolean z) {
        this.A00.A0F.post(new RunnableC24728AxC(this, j, z));
    }
}
