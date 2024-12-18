package X;

import android.content.Context;
import com.facebook.common.lyra.LyraManager;

/* renamed from: X.0j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11460j4 implements C0NC {
    @Override // X.C0NC
    public final Integer BW5() {
        return C05F.A0S;
    }

    @Override // X.C0NC
    public final Integer CHb() {
        return C05F.A0C;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0di, java.lang.Object] */
    @Override // X.C0NC
    public final void CNh(C0NK c0nk) {
        int i;
        AbstractC09780fb.A01("Lyra.init", 883386750);
        try {
            Context applicationContext = c0nk.A0J.getApplicationContext();
            if (LyraManager.initialized.compareAndSet(false, true)) {
                System.getProperty("fb.running_e2e");
                ?? obj = new Object();
                obj.A00 = applicationContext;
                boolean z = true;
                if (AbstractC05790Sg.A00(obj, "android_crash_lyra_hook_cxa_throw", 1) != 1) {
                    z = false;
                }
                ?? obj2 = new Object();
                obj2.A00 = applicationContext;
                int A00 = AbstractC05790Sg.A00(obj2, "android_crash_lyra_enable_backtraces", 1);
                boolean z2 = true;
                if (A00 != 1) {
                    z2 = false;
                }
                if (z) {
                    try {
                        if (!LyraManager.nativeInstallLyraHook(z2)) {
                            C0K8.A0C("LyraManager", "Installing lyra hook failed.");
                        }
                    } catch (Exception e) {
                        C0K8.A0F("LyraManager", "Exception thrown during installing Lyra hook", e);
                    }
                }
            }
            i = -1017651932;
        } finally {
            try {
                AbstractC09780fb.A00(i);
            } catch (Throwable th) {
            }
        }
        AbstractC09780fb.A00(i);
    }
}
