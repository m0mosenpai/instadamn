package X;

import android.os.SystemClock;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.List;

/* renamed from: X.11v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC211911v {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;

    public void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        String A06 = A06();
        c226418s.A0Q(c226418s.A02, AnonymousClass001.A0g("AppInit_", A06, "_START"), this.A01);
        c226418s.A0Q(c226418s.A02, AnonymousClass001.A0g("AppInit_", A06, "_END"), this.A00);
    }

    public abstract String A06();

    public abstract void A07();

    public final void A03() {
        if (!this.A03) {
            AbstractC09800fd.A01(AnonymousClass001.A0R("initialize-", A06()), -922804949);
            try {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                this.A01 = awakeTimeSinceBootClock.now();
                A07();
                this.A00 = awakeTimeSinceBootClock.now();
                this.A02 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
                this.A03 = true;
                AbstractC09800fd.A00(-1392460355);
            } catch (Throwable th) {
                AbstractC09800fd.A00(1547656711);
                throw th;
            }
        }
    }

    public final void A05(C226418s c226418s, boolean z) {
        if (z) {
            String A06 = A06();
            long j = this.A01;
            long j2 = this.A00;
            long j3 = this.A02;
            C14360o3.A0B(A06, 0);
            ((List) c226418s.A0H.getValue()).add(new C206359Bs(A06, j, j2, j3));
        }
        A04(c226418s);
    }
}
