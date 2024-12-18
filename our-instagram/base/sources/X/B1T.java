package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1T implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C175287r2 A02;
    public final /* synthetic */ C177047u0 A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public B1T(CaptureRequest.Builder builder, C175287r2 c175287r2, C177047u0 c177047u0, long j, boolean z, boolean z2) {
        this.A02 = c175287r2;
        this.A01 = builder;
        this.A05 = z;
        this.A03 = c177047u0;
        this.A04 = z2;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Key key;
        int i;
        CaptureRequest.Builder builder;
        InterfaceC174657pz interfaceC174657pz;
        C175287r2 c175287r2 = this.A02;
        if (c175287r2.A0D) {
            if (c175287r2.A0B != null && c175287r2.A05 != null && c175287r2.A03 != null && c175287r2.A02 != null && c175287r2.A01 != null) {
                if (c175287r2.A06 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c175287r2.A00;
                    if (elapsedRealtime < 500) {
                        SystemClock.sleep(500 - elapsedRealtime);
                    }
                    Y1s y1s = c175287r2.A06;
                    boolean z = c175287r2.A0C;
                    y1s.A02(Y1s.A0Y, Long.valueOf(SystemClock.elapsedRealtime()));
                    Exception A00 = c175287r2.A00();
                    C176787ta c176787ta = c175287r2.A03;
                    C176807tc c176807tc = AbstractC176797tb.A0B;
                    if (AbstractC167017dG.A0H(c176807tc, c176787ta) != 0 && (builder = this.A01) != null && ((interfaceC174657pz = c175287r2.A04) == null || !AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A03)))) {
                        C176837tf c176837tf = new C176837tf();
                        c176837tf.A01(c176807tc, 0);
                        c175287r2.A03.A04(c176837tf.A00());
                        AbstractC177647uy.A01(builder, c175287r2.A03, c175287r2.A05, 0);
                        c175287r2.A02.A05();
                    }
                    if (this.A05) {
                        boolean A0C = c175287r2.A02.A0C();
                        CaptureRequest.Builder builder2 = this.A01;
                        if (A0C) {
                            builder2.getClass();
                            key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                            i = 3;
                        } else {
                            builder2.getClass();
                            key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                            i = 1;
                        }
                        builder2.set(key, i);
                        c175287r2.A01.A01(builder2, this.A03);
                        if (z) {
                            c175287r2.A02.A0B(this.A04, true);
                        }
                    }
                    if (A00 == null) {
                        y1s.A02(Y1s.A0X, Long.valueOf(this.A00));
                        return y1s;
                    }
                    throw A00;
                }
                throw AbstractC166987dD.A14("Cannot stop recording video, VideoCaptureInfo is null");
            }
            throw AbstractC166987dD.A14("Cannot stop recording video, camera is closed");
        }
        throw AbstractC166987dD.A14("Not recording video.");
    }
}
