package X;

import android.os.SystemClock;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;

/* renamed from: X.2RM, reason: invalid class name */
/* loaded from: classes.dex */
public class C2RM implements C0TT {
    public EventBuilder A00;
    public final long A01;
    public final C04280Ku A02;
    public final MemoryTimeline A03;
    public final QuickPerformanceLogger A04;

    @Override // X.C0TT
    public int BoH() {
        return -1;
    }

    @Override // X.C0TT
    public synchronized void DVg(MemoryTimeline memoryTimeline, C0TS c0ts) {
        EventBuilder eventBuilder = this.A00;
        if (eventBuilder != null) {
            A00(c0ts, eventBuilder);
            this.A00 = null;
        }
    }

    @Override // X.C0TT
    public synchronized boolean FDw() {
        boolean z;
        EventBuilder markEventBuilder = this.A04.markEventBuilder(21364745, "periodic_info");
        if (markEventBuilder.isSampled()) {
            this.A00 = markEventBuilder;
            z = true;
        } else {
            markEventBuilder.report();
            z = false;
        }
        return z;
    }

    @Override // X.C0TT
    public final void DES(C0TM c0tm) {
        if (c0tm.A00 == C05F.A00) {
            EventBuilder annotate = this.A04.markEventBuilder(21364746, "trim").annotate("trim_type", c0tm.A01);
            C0TS c0ts = (C0TS) ((C2RK) this.A03).A0F.get();
            if (c0ts != null) {
                for (C0TJ c0tj : c0ts.A00) {
                    C0TP c0tp = c0tj.A02;
                    annotate.annotate(AnonymousClass001.A11("cur", ":", c0tp.A01(), ":", C0TO.A00(c0tp.A01)), Long.toString(c0tj.A00));
                    long j = c0tj.A01;
                    if (j != -1) {
                        annotate.annotate(AnonymousClass001.A11("max", ":", c0tp.A01(), ":", C0TO.A00(c0tp.A01)), Long.toString(j));
                    }
                }
            }
            annotate.report();
        }
    }

    public C2RM(C04280Ku c04280Ku, MemoryTimeline memoryTimeline, QuickPerformanceLogger quickPerformanceLogger, long j) {
        this.A04 = quickPerformanceLogger;
        this.A03 = memoryTimeline;
        this.A01 = j;
        this.A02 = c04280Ku;
    }

    public final void A00(C0TS c0ts, EventBuilder eventBuilder) {
        long j;
        long j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        eventBuilder.annotate("uptime_ms_since_process_start", uptimeMillis - this.A01);
        C04280Ku c04280Ku = this.A02;
        if (c04280Ku != null) {
            synchronized (c04280Ku) {
                j = c04280Ku.A04;
            }
            if (j > 0) {
                eventBuilder.annotate("uptime_ms_since_first_fg", uptimeMillis - j);
            }
            synchronized (c04280Ku) {
                j2 = c04280Ku.A01;
            }
            if (j2 > 0) {
                eventBuilder.annotate("uptime_ms_since_last_fg", uptimeMillis - j2);
            }
        }
        for (Map.Entry entry : c0ts.A01.entrySet()) {
            eventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
        }
        for (C0TJ c0tj : c0ts.A00) {
            C0TP c0tp = c0tj.A02;
            eventBuilder.annotate(AnonymousClass001.A11("cur", ":", c0tp.A01(), ":", C0TO.A00(c0tp.A01)), c0tj.A00);
            long j3 = c0tj.A01;
            if (j3 != -1) {
                eventBuilder.annotate(AnonymousClass001.A11("max", ":", c0tp.A01(), ":", C0TO.A00(c0tp.A01)), j3);
            }
        }
        eventBuilder.report();
    }
}
