package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.09j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C023509j {
    public final ExecutorC19230x5 A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final InterfaceC08830cm A02;
    public final AwakeTimeSinceBootClock A03;
    public final C0JM A04;
    public final C0XM A05;
    public final Random A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC08830cm A08;

    public static RunnableC16080r6 A00(C0X2 c0x2, C023509j c023509j, String str, long j) {
        RunnableC16080r6 A02 = A02(c023509j, TimeUnit.NANOSECONDS, 27787270, j, c0x2.A0G);
        A02.ABZ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        int i = c0x2.A00;
        C0Wv c0Wv = A02.A0W;
        c0Wv.A05("real_marker_id", i);
        A02.A03("nanoseconds_value", j);
        c0Wv.A06("event_was_sampled", c0x2.A0N);
        A02.A03("thread_contention", c0x2.A0K.get());
        c0Wv.A06("main_thread", c0x2.A0L);
        ArrayList arrayList = c0x2.A0P;
        c0Wv.A06("listener_was_used", !arrayList.isEmpty());
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = c0x2.A0O;
            if (i2 < arrayList2.size()) {
                A02.A03(AnonymousClass001.A0R("listener_", (String) arrayList2.get(i2)), ((Number) arrayList.get(i2)).longValue());
                i2++;
            } else {
                A04(c0x2, A02, "quick_listeners_triggered", c0x2.A0D);
                A04(c0x2, A02, "restart_passed", c0x2.A0E);
                A04(c0x2, A02, "sample_rate_calculated", c0x2.A0F);
                A04(c0x2, A02, "quick_event_ready", c0x2.A0C);
                A04(c0x2, A02, "metadata_collected", c0x2.A09);
                A04(c0x2, A02, "listeners_triggered", c0x2.A05);
                A04(c0x2, A02, "event_found", c0x2.A03);
                A04(c0x2, A02, "annotation_added", c0x2.A01);
                A04(c0x2, A02, "point_added", c0x2.A0A);
                A04(c0x2, A02, "loss_track", c0x2.A0J);
                A04(c0x2, A02, "lock_acquired", c0x2.A06);
                A04(c0x2, A02, "lock_released", c0x2.A07);
                A04(c0x2, A02, "trace_map_updated", c0x2.A0I);
                A04(c0x2, A02, "event_was_not_found", c0x2.A04);
                A04(c0x2, A02, "quick_event_not_ready", c0x2.A0B);
                return A02;
            }
        }
    }

    public static RunnableC16080r6 A01(C023509j c023509j, TimeUnit timeUnit, int i) {
        C0XM c0xm = c023509j.A05;
        long BqB = c0xm.BqB(i);
        int i2 = (int) BqB;
        boolean z = false;
        if (i2 == -1) {
            z = true;
        }
        if (z || c0xm.E7i(i2) == Integer.MAX_VALUE) {
            return null;
        }
        return A02(c023509j, timeUnit, i, 0L, BqB);
    }

    public static RunnableC16080r6 A02(C023509j c023509j, TimeUnit timeUnit, int i, long j, long j2) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = c023509j.A03;
        RunnableC16080r6 runnableC16080r6 = new RunnableC16080r6(awakeTimeSinceBootClock);
        runnableC16080r6.A06 = timeUnit.toNanos(j);
        runnableC16080r6.A0M = (short) 2;
        runnableC16080r6.A0B = c023509j.A04.now();
        runnableC16080r6.A09 = awakeTimeSinceBootClock.nowNanos();
        runnableC16080r6.A0A = j2;
        runnableC16080r6.A05 = c023509j.A06.nextInt();
        runnableC16080r6.A03 = i;
        runnableC16080r6.A0Q = false;
        runnableC16080r6.A0P = false;
        runnableC16080r6.A0I = (C19200x2) c023509j.A07.get();
        return runnableC16080r6;
    }

    public static void A03(C0X2 c0x2, C023509j c023509j, RunnableC16080r6 runnableC16080r6) {
        InterfaceC08830cm interfaceC08830cm = c023509j.A08;
        ArrayList arrayList = c0x2.A0R;
        int i = 0;
        boolean z = false;
        if (arrayList.size() > 0) {
            z = true;
        }
        runnableC16080r6.A0W.A06("metadata_was_used", z);
        while (true) {
            ArrayList arrayList2 = c0x2.A0Q;
            if (i < arrayList2.size()) {
                int intValue = ((Number) arrayList2.get(i)).intValue();
                runnableC16080r6.A03(AnonymousClass001.A0R("metadata_", ((C07G) interfaceC08830cm.get()).A00(intValue).Bix()), ((Number) arrayList.get(i)).longValue());
                i++;
            } else {
                return;
            }
        }
    }

    public static void A04(C0X2 c0x2, RunnableC16080r6 runnableC16080r6, String str, long j) {
        if (j > 0) {
            runnableC16080r6.A01(null, null, str, TimeUnit.NANOSECONDS, 7, j - c0x2.A0H);
        }
    }

    public static boolean A05(C023509j c023509j) {
        ThreadLocal threadLocal = c023509j.A01;
        Boolean bool = (Boolean) threadLocal.get();
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        threadLocal.set(true);
        return true;
    }

    public C023509j(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C0JM c0jm, C0XM c0xm, ExecutorC19230x5 executorC19230x5, Random random, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        this.A00 = executorC19230x5;
        this.A07 = interfaceC08830cm;
        this.A05 = c0xm;
        this.A04 = c0jm;
        this.A08 = interfaceC08830cm3;
        this.A03 = awakeTimeSinceBootClock;
        this.A06 = random;
        this.A02 = interfaceC08830cm2;
    }

    public final void A06(TimeUnit timeUnit, int[] iArr, int[] iArr2, String[] strArr, int i) {
        RunnableC16080r6 A01 = A01(this, timeUnit, i);
        if (A01 != null) {
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 < 4) {
                    int i3 = iArr2[i2];
                    if (i3 != 2) {
                        if (i3 == 8) {
                            String str = strArr[i2];
                            if (iArr[i2] == 0) {
                                z = false;
                            }
                            A01.A0W.A06(str, z);
                        } else {
                            throw new UnsupportedOperationException(AnonymousClass001.A0c("Annotation type ", " is not supported yet. Add support on your own.", i3));
                        }
                    } else {
                        A01.A0W.A05(strArr[i2], iArr[i2]);
                    }
                    i2++;
                } else {
                    this.A00.execute(A01);
                    return;
                }
            }
        }
    }

    public final void A07(TimeUnit timeUnit, int[] iArr, String[] strArr) {
        RunnableC16080r6 A01 = A01(this, timeUnit, 27801349);
        if (A01 == null) {
            return;
        }
        for (int i = 0; i < 8; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            int i2 = iArr[i / 2];
            if (i2 != 1) {
                if (i2 == 2) {
                    A01.A0W.A05(str, Integer.parseInt(str2));
                } else {
                    throw new UnsupportedOperationException(AnonymousClass001.A0c("Annotation type ", " is not supported yet. Add support on your own.", i2));
                }
            } else {
                A01.ABZ(str, str2);
            }
        }
        this.A00.execute(A01);
    }
}
