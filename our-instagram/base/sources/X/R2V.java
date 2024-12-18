package X;

import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/* loaded from: classes10.dex */
public final class R2V extends AbstractC208410g implements C0HV {
    public static int A02;
    public static int A03;
    public static String A04;
    public static InterfaceC08830cm A05;
    public static InterfaceC08830cm A06;
    public static boolean A07;
    public static final List A08 = AbstractC58319PtB.A12(new String[]{"caller_1", "caller_2", "caller_3", "caller_4"});
    public boolean A00 = false;
    public final boolean A01;

    @Override // X.C0HV
    public final void A76(Message message, C0HT c0ht, String str) {
    }

    @Override // X.C0HV
    public final C0HW Ajg(C0HX c0hx, String str, Method method, Object[] objArr) {
        return null;
    }

    @Override // X.C0HV
    public final boolean DSx(Message message, C0HT c0ht, String str) {
        return false;
    }

    @Override // X.C0Xc
    public final String getName() {
        return "system_service_binder_logger";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerDrop(C0XX c0xx) {
        this.A00 = false;
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        this.A00 = true;
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        this.A00 = false;
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        return new C06650Xb(new int[]{A03}, null);
    }

    public R2V(boolean z) {
        this.A01 = z;
    }

    @Override // X.C0HV
    public final void DEj(Object obj, String str, Method method, Object[] objArr, long j) {
        int i = 0;
        boolean z = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Binder(");
            A1C.append(j);
            A1C.append("ms): ");
            A1C.append(method.getDeclaringClass().getSimpleName());
            A1C.append(".");
            StrictMode.noteSlowCall(AbstractC166997dE.A0x(method.getName(), A1C));
        }
        if (this.A00 || (this.A01 && z)) {
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) A06.get();
            if (quickPerformanceLogger == null) {
                C0K8.A0H("SystemServiceBinderLogger", "QuickPerformanceLogger not initialized", new Throwable());
                return;
            }
            int nextInt = new Random().nextInt();
            quickPerformanceLogger.markerStart(A02, nextInt);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, AbstractC111324zv.A00(1261), str);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "method_name", method.getName());
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "is_main_thread", z);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "current_module_name", (String) A05.get());
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "execution_duration_ms", j);
            quickPerformanceLogger.markerAnnotate(A02, nextInt, "is_scrolling", this.A00);
            if (A07) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i2 = 7;
                do {
                    if (length > i2) {
                        quickPerformanceLogger.markerAnnotate(A02, nextInt, AbstractC25226BEj.A1I(A08, i), stackTrace[i2].toString());
                        i++;
                    }
                    i2++;
                } while (i2 <= 10);
                int i3 = A02;
                String str2 = A04;
                if (str2.isEmpty()) {
                    str2 = "caller_4";
                }
                quickPerformanceLogger.markerAnnotate(i3, nextInt, "field_to_deobfuscate", str2);
            }
            quickPerformanceLogger.markerEnd(A02, nextInt, (short) 2);
        }
    }
}
