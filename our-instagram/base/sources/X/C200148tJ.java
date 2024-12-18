package X;

import com.google.common.base.Strings;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200148tJ {
    public static final InterfaceC216113n A06 = new C200168tL(new Object() { // from class: X.8tK
    });
    public static final AbstractC95374Qx A07 = new AbstractC95374Qx() { // from class: X.8tM
        @Override // X.AbstractC95374Qx
        public final long A00() {
            return 0L;
        }
    };
    public AbstractC95374Qx A04;
    public InterfaceC200298tY A05;
    public long A01 = -1;
    public long A00 = -1;
    public long A02 = -1;
    public InterfaceC216113n A03 = A06;

    public final C200448tn A00() {
        boolean z = false;
        if (this.A02 == -1) {
            z = true;
        }
        C18C.A0H(z, "refreshAfterWrite requires a LoadingCache");
        return new C200448tn(new ConcurrentMapC200188tN(this, null));
    }

    public final void A01(long maximumSize) {
        long j = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (j == -1) {
            z2 = true;
        }
        C18C.A06(j, "maximum size was already set to %s", z2);
        if (maximumSize < 0) {
            z = false;
        }
        C18C.A0G(z, "maximum size must not be negative");
        this.A01 = maximumSize;
    }

    public final void A02(long duration, TimeUnit unit) {
        long j = this.A00;
        boolean z = true;
        boolean z2 = false;
        if (j == -1) {
            z2 = true;
        }
        C18C.A06(j, "expireAfterWrite was already set to %s ns", z2);
        if (duration < 0) {
            z = false;
        }
        if (z) {
            this.A00 = unit.toNanos(duration);
            return;
        }
        throw new IllegalArgumentException(Strings.A00("duration cannot be negative: %s %s", Long.valueOf(duration), unit));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.L0k] */
    public final String toString() {
        JSR A00 = JSS.A00(this);
        long j = this.A01;
        if (j != -1) {
            A00.A03("maximumSize", j);
        }
        long j2 = this.A00;
        if (j2 != -1) {
            A00.A01(AnonymousClass001.A0A(j2, "ns"), "expireAfterWrite");
        }
        if (this.A05 != null) {
            ?? obj = new Object();
            A00.A00.A00 = obj;
            A00.A00 = obj;
            obj.A01 = "removalListener";
        }
        return A00.toString();
    }
}
