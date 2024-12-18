package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

/* renamed from: X.AWw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23348AWw implements TouchGesturesListener$HitTestCallback {
    public final /* synthetic */ C9YK A00;

    public C23348AWw(C9YK c9yk) {
        this.A00 = c9yk;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback
    public final void hitTestResult(long j, boolean z) {
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A1b("consumed", Boolean.valueOf(z), AbstractC167007dF.A0o("serviceType", 91), AbstractC167027dH.A0Y(C05F.A0N)));
        A00.putLong("gestureId", j);
        this.A00.A00.add(A00);
    }
}
