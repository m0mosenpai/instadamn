package X;

import android.os.StrictMode;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class OMg {
    public final int A00;
    public final int A01;

    public final void A03(String str, Object obj) {
        C14360o3.A0B(obj, 1);
        int i = this.A01;
        int i2 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
        if (quickPerformanceLogger != null) {
            if (obj instanceof Integer) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, AbstractC166987dD.A0H(obj));
                return;
            }
            if (obj instanceof String) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, (String) obj);
                return;
            }
            if (obj instanceof Long) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, AbstractC166987dD.A0N(obj));
                return;
            } else if (obj instanceof Double) {
                quickPerformanceLogger.markerAnnotate(i, i2, str, MSW.A00(obj));
                return;
            } else {
                if (!(obj instanceof Boolean)) {
                    return;
                }
                quickPerformanceLogger.markerAnnotate(i, i2, str, AbstractC166987dD.A1a(obj));
                return;
            }
        }
        throw new C53400Njp();
    }

    public final void A00(String str) {
        AbstractC54324Nzi.A00(this.A01, this.A00, str);
    }

    public final void A01(String str) {
        AbstractC54324Nzi.A00(this.A01, this.A00, AnonymousClass001.A0R(str, "_END"));
    }

    public final void A02(String str) {
        AbstractC54324Nzi.A00(this.A01, this.A00, AnonymousClass001.A0R(str, "_START"));
    }

    public final void A04(String str, short s) {
        int i = this.A01;
        int i2 = this.A00;
        AbstractC54324Nzi.A00(i, i2, str);
        QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(i, i2, s);
            return;
        }
        throw new C53400Njp();
    }

    public final void A05(short s) {
        int i = this.A01;
        int i2 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(i, i2, s);
            return;
        }
        throw new C53400Njp();
    }

    public OMg(C51753Mtc c51753Mtc, QuickPerformanceLogger quickPerformanceLogger) {
        int hashCode;
        AbstractC54324Nzi.A00 = quickPerformanceLogger;
        Number number = (Number) c51753Mtc.A02;
        if (number != null) {
            hashCode = number.intValue();
        } else {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                UUID randomUUID = UUID.randomUUID();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                hashCode = randomUUID.toString().hashCode();
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
        this.A00 = hashCode;
        int i = c51753Mtc.A01;
        this.A01 = i;
        QuickPerformanceLogger quickPerformanceLogger2 = AbstractC54324Nzi.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(i, hashCode);
            return;
        }
        throw new C53400Njp();
    }
}
