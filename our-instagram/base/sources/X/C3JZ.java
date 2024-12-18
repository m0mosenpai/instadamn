package X;

import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;

/* renamed from: X.3JZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JZ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IGTigonQuickPerformanceLogger A01;
    public final /* synthetic */ C1QW A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JZ(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, C1QW c1qw, String str, int i) {
        super(1);
        this.A01 = iGTigonQuickPerformanceLogger;
        this.A02 = c1qw;
        this.A03 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.A01.logger.markerAnnotate(((Number) obj).intValue(), this.A02.hashCode(), this.A03, this.A00);
        return C0eB.A00;
    }
}
