package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18600vn implements InterfaceC12870lZ {
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();
    public final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C04880Nh.A00);
    public final AtomicInteger A02 = new AtomicInteger();

    public final void A01(InterfaceC13060ls interfaceC13060ls) {
        C14360o3.A0B(interfaceC13060ls, 0);
        this.A01.addIfAbsent(interfaceC13060ls);
    }

    public final void A02(InterfaceC13060ls interfaceC13060ls) {
        C14360o3.A0B(interfaceC13060ls, 0);
        this.A01.remove(interfaceC13060ls);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1012753951);
        if (Systrace.A0E(1L)) {
            C0fO.A01("SBD.onAppBackgrounded", 442881036);
        }
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
            int size = copyOnWriteArrayList.size();
            AtomicInteger atomicInteger = this.A02;
            int andIncrement = atomicInteger.getAndIncrement();
            InterfaceC09390do interfaceC09390do = this.A00;
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerStart(694564060, andIncrement, false);
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "operation", "SessionBackgroundDetector.onAppBackgrounded");
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "asl_session_id", C0L6.A01());
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "number_of_listeners", size);
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "thread_priority", Thread.currentThread().getPriority());
            Iterator it = copyOnWriteArrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                InterfaceC13060ls interfaceC13060ls = (InterfaceC13060ls) it.next();
                String name = interfaceC13060ls.getClass().getName();
                C14360o3.A07(name);
                int andIncrement2 = atomicInteger.getAndIncrement();
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerStart(694559790, andIncrement2, false);
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "operation", "SessionBackgroundDetector.onAppBackgrounded");
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "listener", AnonymousClass001.A0g("<cls>", name, "</cls>"));
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "asl_session_id", C0L6.A01());
                interfaceC13060ls.Cww(C023409i.A0A.A05(this));
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerEnd(694559790, andIncrement2, (short) 2);
            }
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerEnd(694564060, andIncrement, (short) 2);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-832915685);
            }
            C0f9.A0A(-341813278, A03);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1756066035);
            }
            C0f9.A0A(-1763174486, A03);
            throw th;
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1603879052);
        if (Systrace.A0E(1L)) {
            C0fO.A01("SBD.onAppForegrounded", 2064270059);
        }
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
            int size = copyOnWriteArrayList.size();
            AtomicInteger atomicInteger = this.A02;
            int andIncrement = atomicInteger.getAndIncrement();
            InterfaceC09390do interfaceC09390do = this.A00;
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerStart(694564060, andIncrement, false);
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "operation", "SessionBackgroundDetector.onAppForegrounded");
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "asl_session_id", C0L6.A01());
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "number_of_listeners", size);
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694564060, andIncrement, "thread_priority", Thread.currentThread().getPriority());
            Iterator it = copyOnWriteArrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                InterfaceC13060ls interfaceC13060ls = (InterfaceC13060ls) it.next();
                String name = interfaceC13060ls.getClass().getName();
                C14360o3.A07(name);
                int andIncrement2 = atomicInteger.getAndIncrement();
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerStart(694559790, andIncrement2, false);
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "operation", "SessionBackgroundDetector.onAppForegrounded");
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "listener", AnonymousClass001.A0g("<cls>", name, "</cls>"));
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerAnnotate(694559790, andIncrement2, "asl_session_id", C0L6.A01());
                interfaceC13060ls.Cwy(C023409i.A0A.A05(this));
                ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerEnd(694559790, andIncrement2, (short) 2);
            }
            ((QuickPerformanceLogger) interfaceC09390do.getValue()).markerEnd(694564060, andIncrement, (short) 2);
            if (Systrace.A0E(1L)) {
                C0fO.A00(91859202);
            }
            C0f9.A0A(668481242, A03);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1019445427);
            }
            C0f9.A0A(-973715436, A03);
            throw th;
        }
    }
}
