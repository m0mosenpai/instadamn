package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105584pV {
    public final LightweightQuickPerformanceLogger A00;
    public final java.util.Set A01;
    public final CopyOnWriteArraySet A02;
    public final int[] A03;
    public final int[] A04;

    public C105584pV(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A00 = lightweightQuickPerformanceLogger;
        C005101q c005101q = new C005101q(10);
        int A00 = c005101q.A00();
        int[] iArr = new int[A00];
        for (int i = 0; i < A00; i++) {
            iArr[i] = c005101q.A01(i);
        }
        this.A04 = iArr;
        C005101q c005101q2 = new C005101q(10);
        int A002 = c005101q2.A00();
        int[] iArr2 = new int[A002];
        for (int i2 = 0; i2 < A002; i2++) {
            iArr2[i2] = c005101q2.A01(i2);
        }
        this.A03 = iArr2;
        this.A02 = new CopyOnWriteArraySet();
        this.A01 = new HashSet();
    }
}
