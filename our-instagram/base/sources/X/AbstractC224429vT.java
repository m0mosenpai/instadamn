package X;

import android.content.Context;
import android.os.Build;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.9vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224429vT {
    public static final boolean A00(Context context, QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        Integer A01;
        String str;
        if (!C3o4.A00(context) || Build.VERSION.SDK_INT < 29 || (A01 = C106434qx.A00.A01(context, z, z2)) == C05F.A0Y) {
            return false;
        }
        switch (A01.intValue()) {
            case 0:
                str = "NOT_AVAILABLE_NULL_PM";
                break;
            case 1:
                str = "NOT_AVAILABLE_NOT_PRESENT";
                break;
            case 2:
                str = "NOT_AVAILABLE_ARCH_MISMATCH";
                break;
            case 3:
                str = "NOT_AVAILABLE_NON_MODULAR";
                break;
            default:
                str = MessageAvailabilityResponseId$Companion.AVAILABLE;
                break;
        }
        quickPerformanceLogger.markerAnnotate(47654742, "trampoline_unavailable", str);
        return true;
    }
}
