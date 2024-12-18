package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1JA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JA {
    public Handler A00;
    public HandlerThread A01;
    public C95T A02;
    public final AnonymousClass155 A03;
    public volatile QuickPerformanceLogger A04;

    public C1JA() {
        C0w9 c0w9 = C0w9.A01;
        AnonymousClass155 anonymousClass155 = AnonymousClass155.A05;
        if (anonymousClass155 == null) {
            anonymousClass155 = new AnonymousClass155(c0w9);
            AnonymousClass155.A05 = anonymousClass155;
        }
        if (!anonymousClass155.A03) {
            anonymousClass155.A00 = c0w9;
            anonymousClass155.A03 = true;
        }
        this.A03 = anonymousClass155;
    }
}
