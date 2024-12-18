package X;

import android.app.Application;
import com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2S1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2S1 {
    public static volatile C2S1 A0Z;
    public Application A00;
    public HeapSanitizer A01;
    public C72641XjU A02;
    public S5F A03;
    public C3Ts A04;
    public C2S7 A05;
    public C121105e2 A06;
    public C71633Jm A07;
    public C72506XfL A08;
    public XjT A09;
    public C49912Rb A0A;
    public C2S8 A0B;
    public List A0C;
    public final C2RW A0D;
    public final C2RW A0E;
    public final C2RX A0F;
    public final InterfaceC08830cm A0G;
    public final InterfaceC08830cm A0H;
    public final InterfaceC08830cm A0I;
    public final InterfaceC08830cm A0J;
    public final InterfaceC08830cm A0K;
    public final InterfaceC08830cm A0L;
    public final InterfaceC08830cm A0M;
    public final C2SC A0N;
    public final C2RW A0O;
    public final List A0P;
    public final InterfaceC08830cm A0Q;
    public final InterfaceC08830cm A0R;
    public final InterfaceC08830cm A0S;
    public final InterfaceC08830cm A0T;
    public final InterfaceC08830cm A0U;
    public final InterfaceC08830cm A0V;
    public final InterfaceC08830cm A0W;
    public final InterfaceC08830cm A0X;
    public final InterfaceC08830cm A0Y;

    public final synchronized C3Ts A01() {
        InterfaceC08830cm interfaceC08830cm;
        if (this.A04 == null && (interfaceC08830cm = this.A0K) != null) {
            AbstractC09780fb.A01("MemoryManager.getOmuraMetricsReporter", 688268340);
            this.A04 = (C3Ts) interfaceC08830cm.get();
            AbstractC09780fb.A00(824899295);
        }
        return this.A04;
    }

    public final synchronized C2SC A02() {
        return this.A0N;
    }

    public final synchronized C2S7 A03() {
        if (this.A05 == null) {
            AbstractC09780fb.A01("MemoryManager.getDumperScheduler", 1871427592);
            this.A05 = (C2S7) this.A0R.get();
            AbstractC09780fb.A00(-581792140);
        }
        return this.A05;
    }

    public final synchronized C121105e2 A04() {
        if (this.A06 == null) {
            AbstractC09780fb.A01("MemoryManager.getMemoryUploader", 929584891);
            this.A06 = (C121105e2) this.A0X.get();
            AbstractC09780fb.A00(-1053800489);
        }
        return this.A06;
    }

    public final synchronized C71633Jm A05() {
        InterfaceC08830cm interfaceC08830cm = this.A0I;
        if (this.A07 == null) {
            AbstractC09780fb.A01("MemoryManager.getLeakDetector", -915051206);
            this.A07 = (C71633Jm) interfaceC08830cm.get();
            AbstractC09780fb.A00(672131424);
        }
        return this.A07;
    }

    public final synchronized C72506XfL A06() {
        if (this.A08 == null) {
            AbstractC09780fb.A01("MemoryManager.getMemoryMetricsManager", 302857392);
            InterfaceC08830cm interfaceC08830cm = this.A0W;
            interfaceC08830cm.getClass();
            this.A08 = (C72506XfL) interfaceC08830cm.get();
            AbstractC09780fb.A00(385021668);
        }
        return this.A08;
    }

    public final synchronized C49912Rb A07() {
        if (this.A0A == null) {
            AbstractC09780fb.A01("MemoryManager.getMemoryLeakConfig", 32869045);
            this.A0A = (C49912Rb) this.A0V.get();
            AbstractC09780fb.A00(-2021131311);
        }
        return this.A0A;
    }

    public final synchronized C2S8 A08() {
        if (this.A0B == null) {
            AbstractC09780fb.A01("MemoryManager.getMemoryDumpMetadataStore", 1817358961);
            this.A0B = (C2S8) this.A0T.get();
            AbstractC09780fb.A00(-1331028697);
        }
        return this.A0B;
    }

    public final synchronized List A09() {
        List list;
        List list2 = this.A0P;
        if (list2 == null) {
            list = Collections.emptyList();
        } else {
            if (this.A0C == null) {
                AbstractC09780fb.A01("MemoryManager.getMemoryLeakListeners", 314540183);
                this.A0C = new ArrayList(list2.size());
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    this.A0C.add((C3Tt) ((InterfaceC08830cm) it.next()).get());
                }
                AbstractC09780fb.A00(1490351465);
            }
            list = this.A0C;
        }
        return list;
    }

    public final synchronized void A0A() {
        if (this.A09 == null) {
            AbstractC09780fb.A01("MemoryManager.getMemoryDumpSoftErrorReporter", 850731505);
            this.A09 = (XjT) this.A0U.get();
            AbstractC09780fb.A00(1897581438);
        }
    }

    public static C2S1 A00() {
        if (A0Z != null) {
            return A0Z;
        }
        throw new IllegalStateException("Metagen failed or MemoryManager wasn't initialized yet");
    }

    public final void A0B(Object obj, String str, Map map) {
        if (A00().A07().A00()) {
            C71633Jm A05 = A00().A05();
            A05.getClass();
            A05.A02(obj, str, map);
        }
        if (A00().A07().A02() && this.A0K != null && A00().A01() != null) {
            C3Ts A01 = A00().A01();
            if (C3Ts.A02.nextInt(A01.A00) == 0) {
                A01.A00(false, obj.getClass().getName(), map, "activity");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        if (X.C2RR.A03() == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2S1(X.C2Rs r19, X.C2RW r20, X.C2RW r21, X.C2RW r22, X.C2RX r23, java.util.List r24, X.InterfaceC08830cm r25, X.InterfaceC08830cm r26, X.InterfaceC08830cm r27, X.InterfaceC08830cm r28, X.InterfaceC08830cm r29, X.InterfaceC08830cm r30, X.InterfaceC08830cm r31, X.InterfaceC08830cm r32, X.InterfaceC08830cm r33, X.InterfaceC08830cm r34, X.InterfaceC08830cm r35, X.InterfaceC08830cm r36, X.InterfaceC08830cm r37, X.InterfaceC08830cm r38, X.InterfaceC08830cm r39, X.InterfaceC08830cm r40, X.InterfaceC08830cm r41) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2S1.<init>(X.2Rs, X.2RW, X.2RW, X.2RW, X.2RX, java.util.List, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm):void");
    }
}
