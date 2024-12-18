package X;

import android.content.Context;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03780It extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211411q A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03780It(C211411q c211411q, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211411q;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211411q c211411q = this.A00;
        return new AbstractC211911v(context, c211411q) { // from class: X.120
            public final Context A00;
            public final C211511r A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211411q;
            }

            @Override // X.AbstractC211911v
            public final void A04(C226418s c226418s) {
                C14360o3.A0B(c226418s, 0);
                long j = super.A01;
                long j2 = super.A00;
                c226418s.A0Q(c226418s.A02, "FIXIE_INIT_START", j);
                c226418s.A0Q(c226418s.A02, "FIXIE_INIT_END", j2);
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "IgFixieEarlyInitializer";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [X.0gv, X.0h7, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v3, types: [X.0RK, X.0hA] */
            /* JADX WARN: Type inference failed for: r4v2, types: [X.0h9, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                final C10410h9 c10410h9;
                Context context2 = this.A00;
                C10420hA c10420hA = C10420hA.A01;
                C10420hA c10420hA2 = c10420hA;
                if (c10420hA == null) {
                    ?? c0rk = new C0RK(context2);
                    C10420hA.A01 = c0rk;
                    c10420hA2 = c0rk;
                }
                if (EndToEnd.A05() || C20150ym.A07(AbstractC20100yh.A00(36314103106636188L))) {
                    final C0k4 c0k4 = new C0k4();
                    final C0h7 c0h7 = new C0h7() { // from class: X.0gy
                        @Override // X.C0h7, X.InterfaceC08830cm
                        public final Object get() {
                            return c0k4;
                        }
                    };
                    InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.15j
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            return new C1KE((LightweightQuickPerformanceLogger) C0h7.this.get(), new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
                        }
                    };
                    ?? obj = new Object();
                    obj.A00 = interfaceC08830cm;
                    C05730Rz c05730Rz = new C05730Rz(c0h7, obj);
                    C211511r c211511r = this.A01;
                    C211511r c211511r2 = c211511r;
                    if (c211511r == null) {
                        c211511r2 = new Object();
                    }
                    synchronized (C10410h9.class) {
                        C10410h9 c10410h92 = C10410h9.A04;
                        c10410h9 = c10410h92;
                        if (c10410h92 == null) {
                            ?? obj2 = new Object();
                            obj2.A03 = false;
                            obj2.A01 = c10420hA2;
                            obj2.A00 = c211511r2;
                            C10410h9.A04 = obj2;
                            c10410h9 = obj2;
                        }
                    }
                    c10410h9.A02 = c05730Rz;
                    C0Rw c0Rw = c10410h9.A01;
                    Context context3 = ((C0RK) c0Rw).A01;
                    C0h7 c0h72 = c05730Rz.A01;
                    synchronized (C220915k.class) {
                        if (C220915k.A03 == null) {
                            C220915k.A03 = new C220915k(context3, c0h72);
                        }
                    }
                    if (c0Rw.CTk()) {
                        C220915k.A00();
                        ApiExemption.enableUnsafeExemption();
                    }
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    A00.ATO(new AbstractRunnableC14200nk() { // from class: X.15m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10410h9.this.A03(C05F.A00);
                        }

                        {
                            super(18311787, 3, false, false);
                        }
                    });
                }
            }
        };
    }
}
