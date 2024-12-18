package X;

import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.Svs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63917Svs implements InterfaceC100084eW {
    public int A00 = -1;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "render_thread_stack";
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if ((sn2 instanceof QDM) && this.A00 != -1 && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            QDM qdm = (QDM) sn2;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod() && "nSyncAndDrawFrame".equals(stackTraceElement.getMethodName())) {
                qdm.A0A = NativeBacktrace.getBacktraceNative(this.A00, 32, true, false);
            }
        }
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        int A00;
        if (this.A00 == -1 && (A00 = C15T.A00()) >= 0) {
            this.A00 = A00;
        }
    }
}
