package X;

import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74773Xm extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IGTigonQuickPerformanceLogger A01;
    public final /* synthetic */ C1QW A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ TimeUnit A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74773Xm(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, C1QW c1qw, String str, TimeUnit timeUnit, long j) {
        super(1);
        this.A01 = iGTigonQuickPerformanceLogger;
        this.A02 = c1qw;
        this.A03 = str;
        this.A00 = j;
        this.A04 = timeUnit;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.A01.logger.markerPoint(((Number) obj).intValue(), this.A02.hashCode(), this.A03, this.A00, this.A04);
        return C0eB.A00;
    }
}
