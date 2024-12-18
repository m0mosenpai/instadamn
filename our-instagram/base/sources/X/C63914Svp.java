package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Svp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63914Svp implements InterfaceC100084eW {
    public static WeakReference A00;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "litho_layout_thread";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        Thread thread;
        WeakReference weakReference = A00;
        if (weakReference != null && (thread = (Thread) weakReference.get()) != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if ("runAndGet".equals(stackTraceElement.getMethodName())) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    QDM qdm = (QDM) sn2;
                    int length = stackTrace.length;
                    String[] strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = stackTrace[i].toString();
                    }
                    qdm.A07 = thread.getName();
                    qdm.A0D = strArr;
                    return;
                }
            }
        }
    }
}
