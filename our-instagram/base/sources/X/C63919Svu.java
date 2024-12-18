package X;

import android.os.Process;
import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.Svu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63919Svu implements InterfaceC100084eW {
    public static final String[] A00 = {"android.", "java.", "dalvik.", "com.android.", "sun."};

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "native_stack";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if ((sn2 instanceof QDM) && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            QDM qdm = (QDM) sn2;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod()) {
                String className = stackTraceElement.getClassName();
                String[] strArr = A00;
                int i = 0;
                while (!className.startsWith(strArr[i])) {
                    i++;
                    if (i >= 5) {
                        qdm.A08 = NativeBacktrace.getBacktraceNative(Process.myPid(), 32, true, false);
                        return;
                    }
                }
            }
        }
    }
}
