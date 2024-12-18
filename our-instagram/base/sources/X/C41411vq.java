package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41411vq {
    public final QuickPerformanceLogger A00;
    public final C41461vv A01;
    public final C41391vo A02;
    public volatile boolean A03;

    public C41411vq(QuickPerformanceLogger quickPerformanceLogger, C41391vo c41391vo) {
        Handler handler = new Handler(C1CG.A00());
        this.A00 = quickPerformanceLogger;
        this.A02 = c41391vo;
        this.A03 = false;
        this.A01 = new C41461vv(handler, quickPerformanceLogger, c41391vo, C05F.A00);
    }
}
