package X;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175097qj implements InterfaceC175107qk {
    public final /* synthetic */ C175057qf A00;

    public C175097qj(C175057qf c175057qf) {
        this.A00 = c175057qf;
    }

    @Override // X.InterfaceC175107qk
    public final void onCameraClosed(CameraDevice cameraDevice) {
        C175057qf c175057qf = this.A00;
        if (c175057qf.A0k == cameraDevice) {
            C175307r4 c175307r4 = c175057qf.A0R;
            InterfaceC176367st interfaceC176367st = c175307r4.A0E;
            if (interfaceC176367st != null) {
                interfaceC176367st.onCameraClosed(cameraDevice);
            }
            C176347sr c176347sr = c175057qf.A0m;
            if (c176347sr != null) {
                String A02 = c175057qf.A0Y.A02();
                if (!c176347sr.A00.isEmpty()) {
                    C176567tE.A00(new RunnableC200698uC(c176347sr, A02));
                }
            }
            c175057qf.A0r = false;
            c175057qf.A0s = false;
            c175057qf.A0k = null;
            c175057qf.A0D = null;
            c175057qf.A08 = null;
            c175057qf.A09 = null;
            c175057qf.A05 = null;
            C176697tR c176697tR = c175057qf.A07;
            if (c176697tR != null) {
                c176697tR.A0E.removeMessages(1);
                c176697tR.A08 = null;
                c176697tR.A06 = null;
                c176697tR.A07 = null;
                c176697tR.A05 = null;
                c176697tR.A04 = null;
                c176697tR.A0A = null;
                c176697tR.A0D = null;
                c176697tR.A0C = null;
            }
            c175057qf.A0Q.A0G = false;
            c175057qf.A0P.A00();
            C175287r2 c175287r2 = c175057qf.A0S;
            if (c175287r2.A0D && (!c175057qf.A0t || c175287r2.A0C)) {
                try {
                    c175057qf.A0Z.A00(new AbstractC184688Hj() { // from class: X.8nc
                    }, "on_camera_closed_stop_video_recording", new Callable() { // from class: X.B0d
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C175097qj.this.A00.A0S.A00();
                            return null;
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e) {
                    AbstractC175037qd.A00(4, 0, e);
                }
            }
            if (c175307r4.A09 != null) {
                synchronized (C175307r4.A0U) {
                    C177047u0 c177047u0 = c175307r4.A08;
                    if (c177047u0 != null) {
                        c177047u0.A0J = false;
                        c175307r4.A08 = null;
                    }
                }
                try {
                    c175307r4.A09.A73();
                    c175307r4.A09.close();
                } catch (Exception unused) {
                }
                c175307r4.A09 = null;
            }
            String id = cameraDevice.getId();
            C175077qh c175077qh = c175057qf.A0N;
            if (id.equals(c175077qh.A00)) {
                c175077qh.A01();
                c175077qh.A00 = null;
            }
        }
    }
}
