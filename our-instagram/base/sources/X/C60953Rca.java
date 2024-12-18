package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import java.io.IOException;

/* renamed from: X.Rca, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60953Rca extends AbstractRunnableC18200v5 {
    public final /* synthetic */ IGTigonQuickPerformanceLogger A00;
    public final /* synthetic */ C26511Qg A01;
    public final /* synthetic */ C1QW A02;
    public final /* synthetic */ IOException A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60953Rca(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, C26511Qg c26511Qg, C1QW c1qw, IOException iOException) {
        super(11, 3, true, true);
        this.A01 = c26511Qg;
        this.A02 = c1qw;
        this.A03 = iOException;
        this.A00 = iGTigonQuickPerformanceLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26511Qg c26511Qg = this.A01;
        C1QW c1qw = this.A02;
        IOException iOException = this.A03;
        c26511Qg.A04(c1qw, iOException);
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A00;
        String message = iOException.getMessage();
        if (message == null) {
            message = "null";
        }
        iGTigonQuickPerformanceLogger.markerAnnotate(c1qw, TraceFieldType.FailureReason, message);
        iGTigonQuickPerformanceLogger.markerEnd(c1qw, (short) 3);
    }
}
