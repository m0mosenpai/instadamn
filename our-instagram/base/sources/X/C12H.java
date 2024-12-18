package X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.xplat.QPLXplatInitializerImpl;
import com.facebook.xanalytics.XAnalyticsHolder;

/* renamed from: X.12H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12H extends AbstractC211911v {
    public static final int[] A08 = {15335435, 23592980, 34420479, 31784979, 31784974, 31784971, 31784972, 31784962, 31795699, 31784973, 31784991};
    public C006802i A00;
    public C07650ae A01;
    public final Context A02;
    public final MessageQueue A03;
    public final C211211o A04;
    public final C211211o A05;
    public final C211211o A06;
    public final boolean A07;

    public C12H(Context context, C211211o c211211o, C211211o c211211o2, C211211o c211211o3, boolean z) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
        this.A04 = c211211o;
        this.A05 = c211211o2;
        this.A06 = c211211o3;
        MessageQueue queue = Looper.getMainLooper().getQueue();
        C14360o3.A07(queue);
        this.A03 = queue;
        this.A07 = z;
    }

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "QPL_INIT_START", j);
        c226418s.A0Q(c226418s.A02, "QPL_INIT_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "QPLInitializer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if (new java.util.Random().nextInt(r2) != 0) goto L28;
     */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, X.4s6] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.0Xy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [X.1Jb] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, X.0iP, X.0X0] */
    /* JADX WARN: Type inference failed for: r1v73, types: [X.0ae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, X.10h] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, X.0X0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0Xy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r42v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r43v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r46v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r48v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r49v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r50v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r52v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r53v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r54v0, types: [X.0Wx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0Xy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0Xy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.0cQ, X.0Wx, java.lang.Object] */
    @Override // X.AbstractC211911v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12H.A07():void");
    }

    public final void A08() {
        QPLXplatInitializerImpl.initHybrid();
        if (this.A01 != null) {
            if (QuickPerformanceLoggerProvider.getQPLInstance() != null) {
                XAnalyticsHolder xAnalyticsHolder = C07650ae.A01;
                C14360o3.A07(xAnalyticsHolder);
                QPLXplatInitializerImpl.setupNativeQPLWithXAnalyticsHolder(xAnalyticsHolder);
                return;
            }
            throw new RuntimeException("Call QuickPerformanceLoggerProvider.setQuickPerformanceLogger(qplInstance) before calling QPLXplatInitializer.initialize(xAnalytixAnalyticsProvider)");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
