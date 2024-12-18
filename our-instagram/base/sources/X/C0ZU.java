package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder;

/* renamed from: X.0ZU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZU extends AbstractC208410g {
    @Override // X.C0Xc
    public final String getName() {
        return "ig_dead_code";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        int markerId = c0xx.getMarkerId();
        if (ClassTracingLogger.A02) {
            ClassTracingLoggerNativeHolder.classLoadStarted(null);
            ClassTracingLoggerNativeHolder.classLoaded((markerId << 32) | 1505373456);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        int markerId = c0xx.getMarkerId();
        if (ClassTracingLogger.A02) {
            ClassTracingLoggerNativeHolder.classLoadStarted(null);
            ClassTracingLoggerNativeHolder.classLoaded((markerId << 32) | 1215735889);
        }
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        if (ClassTracingLogger.A00) {
            return new C06650Xb(new int[]{-1}, null);
        }
        return C06650Xb.A03;
    }
}
