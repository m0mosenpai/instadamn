package X;

import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import com.instagram.compose.ui.gradientspinner.Segment;
import java.util.ArrayList;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.BHq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25297BHq extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ BezierControlPoints A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25297BHq(BezierControlPoints bezierControlPoints) {
        super(0);
        this.A00 = bezierControlPoints;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A17 = AbstractC25225BEi.A17(30);
        int i = 0;
        do {
            A17.add(new Segment(i, 0.0f, 0.0f, 0));
            i++;
        } while (i < 30);
        return new C25287BHf(this.A00, A17, 1.0f, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 1000);
    }
}
