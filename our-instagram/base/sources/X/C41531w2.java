package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41531w2 {
    public final QuickPerformanceLogger A00;
    public final C41391vo A01;
    public final Integer A02;
    public volatile AtomicBoolean A03;

    public C41531w2(QuickPerformanceLogger quickPerformanceLogger, C41391vo c41391vo) {
        C14360o3.A0B(quickPerformanceLogger, 1);
        C14360o3.A0B(c41391vo, 2);
        this.A00 = quickPerformanceLogger;
        this.A01 = c41391vo;
        this.A02 = C05F.A0C;
        this.A03 = new AtomicBoolean(false);
    }
}
