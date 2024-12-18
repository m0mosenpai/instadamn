package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.9G4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G4 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G4(Object obj, Object obj2, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int hashCode;
        int i = this.A00;
        int intValue = ((Number) obj).intValue();
        if (i != 0) {
            lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A03).logger;
            hashCode = ((C1QW) this.A02).A04;
        } else {
            lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A03).logger;
            hashCode = this.A02.hashCode();
        }
        lightweightQuickPerformanceLogger.markerAnnotate(intValue, hashCode, this.A04, this.A01);
        return C0eB.A00;
    }
}
