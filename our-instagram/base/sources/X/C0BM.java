package X;

import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0BM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BM extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0BM(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.12J
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "UnexpectedEventReporterInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C006802i c006802i = ((C12H) this.A00.A00()).A00;
                if (c006802i != null) {
                    C18950wb.A00 = new C1KE(c006802i, new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                } else {
                    C14360o3.A0F("qpl");
                    throw C00O.createAndThrow();
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
