package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.9GF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GF extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GF(Object obj, Object obj2, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        Number number = (Number) obj;
        switch (this.A00) {
            case 0:
                intValue = number.intValue();
                lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A02).logger;
                i = this.A01.hashCode();
                lightweightQuickPerformanceLogger.markerAnnotate(intValue, i, this.A03, this.A04);
                break;
            case 1:
                intValue = number.intValue();
                lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A02).logger;
                i = ((C1QW) this.A01).A04;
                lightweightQuickPerformanceLogger.markerAnnotate(intValue, i, this.A03, this.A04);
                break;
            default:
                ((CacheBehaviorLogger) this.A02).logger.markerPoint(number.intValue(), ((C1QW) this.A01).A04, this.A03, this.A04);
                break;
        }
        return C0eB.A00;
    }
}
