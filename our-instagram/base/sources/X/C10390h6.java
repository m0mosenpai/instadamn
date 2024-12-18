package X;

import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10390h6 {
    public final C023509j A00;
    public final long A02;
    public final AwakeTimeSinceBootClock A03;
    public final C0XM A04;
    public final Random A06;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final Thread A05 = Looper.getMainLooper().getThread();

    public static boolean A00(C0X2 c0x2, C10390h6 c10390h6) {
        int i = (int) c0x2.A08;
        if (!c0x2.A0N && i > 1 && c10390h6.A06.nextInt(i) != 0) {
            return true;
        }
        return false;
    }

    public final C0X2 A01(int i) {
        C0XM c0xm = this.A04;
        long j = this.A02;
        if (c0xm.E7i((int) j) == Integer.MAX_VALUE) {
            return null;
        }
        C0X2 c0x2 = new C0X2();
        c0x2.A00 = i;
        c0x2.A0G = j;
        boolean z = false;
        if (this.A05 == Thread.currentThread()) {
            z = true;
        }
        c0x2.A0L = z;
        c0x2.A0H = this.A03.nowNanos();
        return c0x2;
    }

    public final void A02(int i, String str, String str2) {
        this.A00.A07(TimeUnit.NANOSECONDS, new int[]{2, 1, 1, 1}, new String[]{"markerId", String.valueOf(i), "annotationKey", str, "error", "annotation discarded", "reason", str2});
    }

    public final void A03(int i, String str, String str2) {
        this.A00.A07(TimeUnit.NANOSECONDS, new int[]{2, 1, 1, 1}, new String[]{"markerId", String.valueOf(i), "annotationKey", str, "error", AnonymousClass001.A0g("annotation ", str2, " truncated"), "reason", AnonymousClass001.A0R(str2, " too long")});
    }

    public final void A05(C0X2 c0x2) {
        c0x2.A08 = this.A04.BqB(c0x2.A00);
        if (!A00(c0x2, this)) {
            long nowNanos = this.A03.nowNanos() - c0x2.A0H;
            C023509j c023509j = this.A00;
            RunnableC16080r6 A00 = C023509j.A00(c0x2, c023509j, "MARKER_POINT_TIME", nowNanos);
            if (C023509j.A05(c023509j)) {
                C023509j.A03(c0x2, c023509j, A00);
                c023509j.A00.execute(A00);
                c023509j.A01.set(false);
            }
        }
    }

    public final void A07(C0X2 c0x2, String str, boolean z) {
        String str2;
        c0x2.A08 = this.A04.BqB(c0x2.A00);
        if (!A00(c0x2, this)) {
            long nowNanos = this.A03.nowNanos() - c0x2.A0H;
            C023509j c023509j = this.A00;
            if (z) {
                str2 = "MARKER_ANNOTATE_EVENT_TIME";
            } else {
                str2 = "MARKER_ANNOTATE_TIME";
            }
            RunnableC16080r6 A00 = C023509j.A00(c0x2, c023509j, str2, nowNanos);
            if (C023509j.A05(c023509j)) {
                A00.ABZ("annotation_type", str);
                c023509j.A00.execute(A00);
                c023509j.A01.set(false);
            }
        }
    }

    public final void A08(Throwable th) {
        ((C19180x0) this.A00.A02.get()).A00.EmP("qpl", "error", th);
    }

    public C10390h6(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C0XM c0xm, C023509j c023509j, Random random) {
        this.A03 = awakeTimeSinceBootClock;
        this.A04 = c0xm;
        this.A06 = random;
        this.A00 = c023509j;
        this.A02 = c0xm.BqB(27787270);
    }

    public final void A04(C0X2 c0x2) {
        if (!A00(c0x2, this)) {
            long nowNanos = (this.A03.nowNanos() - c0x2.A0H) + c0x2.A02;
            C023509j c023509j = this.A00;
            RunnableC16080r6 A00 = C023509j.A00(c0x2, c023509j, "MARK_EVENT_TIME", nowNanos);
            if (C023509j.A05(c023509j)) {
                C023509j.A03(c0x2, c023509j, A00);
                c023509j.A00.execute(A00);
                c023509j.A01.set(false);
            }
        }
    }

    public final void A06(C0X2 c0x2, long j) {
        if (!A00(c0x2, this)) {
            long j2 = j - c0x2.A0H;
            C023509j c023509j = this.A00;
            RunnableC16080r6 A00 = C023509j.A00(c0x2, c023509j, "MARKER_START_TIME", j2);
            if (C023509j.A05(c023509j)) {
                A00.A0W.A06("event_was_restarted", c0x2.A0M);
                C023509j.A03(c0x2, c023509j, A00);
                c023509j.A00.execute(A00);
                c023509j.A01.set(false);
            }
        }
    }
}
