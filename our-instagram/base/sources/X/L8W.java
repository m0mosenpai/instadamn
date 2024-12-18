package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class L8W {
    public final QuickPerformanceLogger A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public final int A00(EnumC46194KcW enumC46194KcW, int i) {
        int andIncrement = this.A01.getAndIncrement();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStartWithCancelPolicy(i, false, andIncrement, -1L, TimeUnit.NANOSECONDS);
        quickPerformanceLogger.markerAnnotate(i, andIncrement, "clientType", enumC46194KcW.A00.intValue());
        return andIncrement;
    }

    public L8W(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public final void A01(Integer num, Integer num2, Long l, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerAnnotate(178991798, i, "errorCode", AbstractC37302Gc3.A02(num));
        quickPerformanceLogger.markerAnnotate(178991798, i, "attemptsRemaining", AbstractC25227BEk.A06(num2, -1));
        quickPerformanceLogger.markerAnnotate(178991798, i, "backOffInSeconds", AbstractC31178DnM.A03(l));
        if (AbstractC16960so.A1Q(EnumC46211Kcn.A09.A00, EnumC46211Kcn.A06.A00, EnumC46211Kcn.A05.A00).contains(Integer.valueOf(AbstractC37302Gc3.A02(num)))) {
            quickPerformanceLogger.markerEnd(178991798, i, (short) 2);
        } else {
            quickPerformanceLogger.markerEnd(178991798, i, (short) 3);
        }
    }
}
