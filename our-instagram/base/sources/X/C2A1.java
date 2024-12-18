package X;

import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2A1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A1 {
    public static final C2A1 A01 = new C2A1();
    public final AtomicReference A00 = new AtomicReference(new C2A3());

    public final void A01(EnumC49762Qj enumC49762Qj) {
        C2A3 c2a3 = (C2A3) this.A00.get();
        if (c2a3 != null) {
            synchronized (c2a3) {
                TimeInAppControllerWrapper timeInAppControllerWrapper = c2a3.A00;
                if (timeInAppControllerWrapper != null) {
                    timeInAppControllerWrapper.dispatch(enumC49762Qj, null);
                } else {
                    c2a3.A01.add(new C54372O1e(enumC49762Qj));
                }
            }
        }
    }

    public final void A02(TimeInAppReminder timeInAppReminder, int i) {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        C2A3 c2a3 = (C2A3) this.A00.get();
        if (c2a3 != null) {
            synchronized (c2a3) {
                timeInAppControllerWrapper = c2a3.A00;
            }
            if (timeInAppControllerWrapper != null) {
                timeInAppControllerWrapper.setReminder(timeInAppReminder, i);
            }
        }
    }

    public final int[] A03(long j) {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        C2A3 c2a3 = (C2A3) this.A00.get();
        if (c2a3 != null) {
            synchronized (c2a3) {
                timeInAppControllerWrapper = c2a3.A00;
            }
            if (timeInAppControllerWrapper != null) {
                return timeInAppControllerWrapper.getDailyTimeInApp(j);
            }
        }
        return new int[0];
    }

    public final ImmutableList A00(long j) {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        C2A3 c2a3 = (C2A3) this.A00.get();
        if (c2a3 != null) {
            synchronized (c2a3) {
                timeInAppControllerWrapper = c2a3.A00;
            }
            if (timeInAppControllerWrapper != null) {
                return timeInAppControllerWrapper.queryIntervalsWithEvent(j, Long.MAX_VALUE);
            }
        }
        return ImmutableList.of();
    }
}
