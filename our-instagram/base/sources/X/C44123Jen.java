package X;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.Arrays;

/* renamed from: X.Jen, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44123Jen extends AbstractRunnableC14200nk {
    public final /* synthetic */ C26141Ov A00;

    @Override // java.lang.Runnable
    public final void run() {
        EventBuilder markEventBuilder;
        try {
            C26141Ov c26141Ov = this.A00;
            IntentFilter intentFilter = C26141Ov.A0W;
            ConnectivityManager connectivityManager = (ConnectivityManager) c26141Ov.A03.getSystemService("connectivity");
            c26141Ov.A00 = connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.registerDefaultNetworkCallback(c26141Ov.A04);
            }
            c26141Ov.A0O = true;
        } catch (Exception e) {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null && (markEventBuilder = qPLInstance.markEventBuilder(936446320, "network_state_handler_mutation_manager")) != null && markEventBuilder.isSampled()) {
                qPLInstance.markEventBuilder(936446320, "network_state_handler_mutation_manager").annotate("trace", AnonymousClass001.A0g(e.getMessage(), ": ", Arrays.toString(e.getStackTrace()))).report();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44123Jen(C26141Ov c26141Ov) {
        super(1338936892, 3, true, false);
        this.A00 = c26141Ov;
    }
}
