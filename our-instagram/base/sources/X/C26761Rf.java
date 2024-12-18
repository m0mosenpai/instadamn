package X;

import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;

/* renamed from: X.1Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26761Rf extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ IGTigonQuickPerformanceLogger A00;
    public final /* synthetic */ C1QW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26761Rf(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, C1QW c1qw, String str, boolean z) {
        super(1);
        this.A00 = iGTigonQuickPerformanceLogger;
        this.A01 = c1qw;
        this.A02 = str;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.A00.logger.markerAnnotate(((Number) obj).intValue(), this.A01.hashCode(), this.A02, this.A03);
        return C0eB.A00;
    }
}
