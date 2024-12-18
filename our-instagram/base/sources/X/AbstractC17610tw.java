package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17610tw {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0uH] */
    public static C17790uH A00(final UserSession userSession) {
        final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36320829025297329L));
        return new InterfaceC17600tv(userSession, A07) { // from class: X.0uH
            public final C17570ts A00;
            public final C23531Cp A01;
            public final boolean A02;

            private HashSet A00() {
                HashSet hashSet = new HashSet();
                C23531Cp c23531Cp = this.A01;
                UserSession userSession2 = c23531Cp.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36323109654440966L)) {
                    C23541Cq c23541Cq = c23531Cp.A00;
                    C23541Cq c23541Cq2 = null;
                    if (C18U.A06(c06090Tz, userSession2, 36323109654440966L)) {
                        c23541Cq2 = c23541Cq;
                    }
                    for (Map.Entry entry : c23541Cq2.A01.entrySet()) {
                        String str = (String) entry.getKey();
                        C110974z9 c110974z9 = (C110974z9) entry.getValue();
                        hashSet.add(new C17530to(str, c110974z9.A00(), c110974z9.A01()));
                    }
                }
                if (C18U.A06(c06090Tz, userSession2, 36323109654440966L)) {
                    c23531Cp.A00.A01.clear();
                }
                return hashSet;
            }

            @Override // X.InterfaceC17600tv
            public final java.util.Set BsF() {
                HashSet A03 = this.A00.A03();
                A03.addAll(A00());
                return A03;
            }

            @Override // X.InterfaceC17600tv
            public final String BuG() {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.A00.A03().iterator();
                while (it.hasNext()) {
                    C17530to c17530to = (C17530to) it.next();
                    if (c17530to.A08) {
                        arrayList.add(c17530to.A05);
                    }
                }
                String A05 = AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
                if (A05 == null) {
                    return "";
                }
                return A05;
            }

            @Override // X.InterfaceC17600tv
            public final void Dg5(C17590tu c17590tu, List list, boolean z) {
                java.util.Set<C17530to> A03;
                if (this.A02) {
                    if (c17590tu != null) {
                        A03 = c17590tu.A01;
                    } else {
                        A03 = new HashSet();
                    }
                } else {
                    A03 = this.A00.A03();
                }
                for (C17530to c17530to : A03) {
                    if (!c17530to.A07) {
                        C17640tz c17640tz = c17530to.A02;
                        if (c17640tz.A05.A02 == -1 && c17640tz.A06.A02 == -1 && c17640tz.A07.A02 == -1 && c17640tz.A08.A02 == -1) {
                            C17570ts c17570ts = this.A00;
                            synchronized (c17570ts) {
                                c17570ts.A04();
                                if (c17570ts.A05.remove(c17530to.A05) != null) {
                                    c17570ts.A04.EIx();
                                }
                            }
                        }
                    }
                }
            }

            {
                C17570ts A00 = C17570ts.A00(userSession);
                C23531Cp A002 = AbstractC23521Co.A00(userSession);
                this.A00 = A00;
                this.A01 = A002;
                this.A02 = A07;
            }

            @Override // X.InterfaceC17600tv
            public final String ApV(java.util.Set set) {
                if (set.isEmpty()) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C17530to c17530to = (C17530to) it.next();
                    if (z) {
                        z = false;
                    } else {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    sb.append(c17530to.A05);
                }
                return sb.toString();
            }

            @Override // X.InterfaceC17600tv
            public final String BsA(java.util.Set set) {
                if (set.isEmpty()) {
                    return "[]";
                }
                StringWriter stringWriter = new StringWriter();
                try {
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    try {
                        A0A.A0c();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            C17530to c17530to = (C17530to) it.next();
                            AbstractC17550tq.A00(A0A, c17530to);
                            c17530to.A07 = false;
                        }
                        A0A.A0Z();
                        A0A.flush();
                        String obj = stringWriter.toString();
                        A0A.close();
                        return obj;
                    } finally {
                    }
                } catch (IOException unused) {
                    return "invalid";
                }
            }
        };
    }
}
