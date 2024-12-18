package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149946on {
    public C149966op A00;
    public final C149956oo A01;
    public final Map A02;
    public final Map A03;

    public final void A00(C1819185b c1819185b, String str, boolean z) {
        C149966op c149966op = this.A00;
        String str2 = c1819185b.A01;
        int i = 22413316;
        if (c1819185b.A02) {
            i = 22413315;
        }
        int hashCode = Arrays.hashCode(new Object[]{str2, str});
        short s = 3;
        if (z) {
            s = 2;
        }
        QuickPerformanceLogger quickPerformanceLogger = c149966op.A02;
        if (quickPerformanceLogger.isMarkerOn(i, hashCode)) {
            quickPerformanceLogger.markerEnd(i, hashCode, s);
        }
    }

    public C149946on(InterfaceC149916ok interfaceC149916ok, AbstractC150536q2 abstractC150536q2, AbstractC149936om abstractC149936om, InterfaceC150356pk interfaceC150356pk, QuickPerformanceLogger quickPerformanceLogger) {
        C149956oo c149956oo = new C149956oo();
        this.A01 = c149956oo;
        this.A03 = Collections.synchronizedMap(new HashMap());
        this.A02 = Collections.synchronizedMap(new HashMap());
        this.A00 = new C149966op(interfaceC149916ok, c149956oo, abstractC150536q2, abstractC149936om, interfaceC150356pk, quickPerformanceLogger);
    }
}
