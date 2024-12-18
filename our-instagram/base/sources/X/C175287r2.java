package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: X.7r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175287r2 {
    public long A00;
    public C175297r3 A01;
    public C175307r4 A02;
    public C176787ta A03;
    public InterfaceC174657pz A04;
    public AbstractC176767tY A05;
    public Y1s A06;
    public InterfaceC176297sm A07;
    public final C175247qy A08;
    public final C175277r1 A09;
    public final C175227qw A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public final Exception A00() {
        Surface surface;
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        InterfaceC176297sm interfaceC176297sm = this.A07;
        if (interfaceC176297sm != null) {
            try {
                interfaceC176297sm.Eom();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C175307r4 c175307r4 = this.A02;
        if (c175307r4 != null) {
            C175277r1 c175277r1 = c175307r4.A0J;
            c175277r1.A01("Can only stop video recording on the Optic thread");
            c175277r1.A01("Can only check if the prepared on the Optic thread");
            if (c175277r1.A00) {
                CaptureRequest.Builder builder = c175307r4.A02;
                if (builder != null && (surface = c175307r4.A06) != null) {
                    builder.removeTarget(surface);
                }
                c175307r4.A06 = null;
            }
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public final void A01(final CaptureRequest.Builder builder, AbstractC184688Hj abstractC184688Hj, final InterfaceC175197qt interfaceC175197qt, final C175207qu c175207qu, final C177047u0 c177047u0, final InterfaceC175497rP interfaceC175497rP, final FileDescriptor fileDescriptor, final String str, final int i, final int i2, final int i3, final boolean z, final boolean z2, boolean z3, boolean z4) {
        C175307r4 c175307r4 = this.A02;
        if (c175307r4 != null && c175307r4.A0S && this.A03 != null) {
            if (this.A0D) {
                abstractC184688Hj.A01(new IllegalStateException("Cannot start recording video, there is a video already being recorded"));
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            C176787ta c176787ta = this.A03;
            C176807tc c176807tc = AbstractC176797tb.A0y;
            Object A02 = c176787ta.A02(c176807tc);
            C176787ta c176787ta2 = this.A03;
            if (A02 == null) {
                c176807tc = AbstractC176797tb.A0q;
            }
            final C176877tj c176877tj = (C176877tj) c176787ta2.A02(c176807tc);
            if (str == null && fileDescriptor == null) {
                abstractC184688Hj.A01(new IllegalArgumentException("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            this.A0D = true;
            this.A0C = z3;
            this.A0A.A00(new C196928nM(builder, abstractC184688Hj, this, c177047u0, z4), "start_video_recording", new Callable() { // from class: X.B1V
                /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
                
                    if (r0.A0C() == false) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0147, code lost:
                
                    if (r0.A0C() == false) goto L44;
                 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 406
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.B1V.call():java.lang.Object");
                }
            });
            return;
        }
        abstractC184688Hj.A01(new IllegalStateException("Cannot start recording video, camera is not ready or has been closed."));
    }

    public C175287r2(C175247qy c175247qy, C175227qw c175227qw) {
        this.A0A = c175227qw;
        this.A08 = c175247qy;
        this.A09 = new C175277r1(c175227qw);
    }
}
