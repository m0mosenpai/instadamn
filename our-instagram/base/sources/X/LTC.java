package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class LTC implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LTC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C44828Jt2 A00(Integer num, String str) {
        return new C44828Jt2(new C46339KfN(str, num));
    }

    public static C44830Jt4 A01(Integer num, String str) {
        return new C44830Jt4(new C46340KfO(str, num));
    }

    public static C46342KfQ A02(Integer num, String str) {
        return new C46342KfQ(num, new Throwable(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        if (r1 != null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v298, types: [X.L75] */
    /* JADX WARN: Type inference failed for: r0v395, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v396, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v399, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v217, types: [X.Ki3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object, X.Ki6] */
    /* JADX WARN: Type inference failed for: r3v74, types: [X.KiC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.Ky2, java.lang.Object] */
    @Override // X.InterfaceC48192Ji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.AnonymousClass436 r27) {
        /*
            Method dump skipped, instructions count: 5656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTC.invoke(X.436):void");
    }

    public static void A03(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2) {
        lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str);
    }
}
