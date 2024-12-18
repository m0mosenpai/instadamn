package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1M implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C175297r3 A01;
    public final /* synthetic */ C177047u0 A02;
    public final /* synthetic */ InterfaceC177197uF A03;

    public B1M(CaptureRequest.Builder builder, C175297r3 c175297r3, C177047u0 c177047u0, InterfaceC177197uF interfaceC177197uF) {
        this.A01 = c175297r3;
        this.A03 = interfaceC177197uF;
        this.A00 = builder;
        this.A02 = c177047u0;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        InterfaceC177197uF interfaceC177197uF = this.A03;
        if (interfaceC177197uF != null && (builder = this.A00) != null) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            CaptureRequest build = builder.build();
            C177047u0 c177047u0 = this.A02;
            interfaceC177197uF.AGk(build, null, c177047u0);
            return c177047u0;
        }
        return this.A02;
    }
}
