package X;

import android.content.Intent;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.UUID;

/* renamed from: X.919, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass919 {
    public final int A00(Intent intent) {
        String str;
        if (intent == null || (str = PushInfraMetaData.Companion.A01(intent).A08) == null) {
            return 1;
        }
        return UUID.fromString(str).hashCode();
    }

    public final void A01(Intent intent, String str) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (str != null) {
            if (qPLInstance != null) {
                qPLInstance.markerAnnotate(875309620, A00(intent), "error", str);
            } else {
                return;
            }
        } else {
            C0K8.A0C("PushInfraQpl", "Client push received error is null");
            if (qPLInstance == null) {
                return;
            }
        }
        qPLInstance.markerEnd(875309620, A00(intent), (short) 3);
    }

    public final void A02(Intent intent, String str) {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            qPLInstance.markerPoint(875309620, A00(intent), str);
        }
    }
}
