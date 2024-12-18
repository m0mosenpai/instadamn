package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06300Uv {
    public static volatile boolean A00;

    public static C0V9 A01() {
        C06360Vc c06360Vc = C06360Vc.A0A;
        if (c06360Vc != null) {
            C0V9 c0v9 = (C0V9) ((AbstractC06400Vg) c06360Vc.A01.get(C0V9.A00));
            if (c0v9 != null) {
                return c0v9;
            }
        }
        return null;
    }

    public static ArrayList A03(int i) {
        if (A00) {
            Object A01 = A01();
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (A01 != null && c06360Vc != null) {
                AtomicReference atomicReference = c06360Vc.A05;
                if (atomicReference.get() != null) {
                    InterfaceC06330Uz interfaceC06330Uz = (InterfaceC06330Uz) atomicReference.get();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C0VC) ((AbstractC19070wo) A01).A06(interfaceC06330Uz)).A00.iterator();
                    while (it.hasNext()) {
                        long j = ((C0VB) it.next()).A02;
                        int i2 = (int) j;
                        if (i == 0 || i == i2) {
                            arrayList.add(Long.valueOf(j));
                        }
                    }
                    return arrayList;
                }
            }
        }
        return new ArrayList();
    }

    public static void A04() {
        if (A00) {
            Iterator it = A03(0).iterator();
            while (it.hasNext()) {
                A05(((Number) it.next()).longValue());
            }
        }
    }

    public static void A05(long j) {
        C0Pe c0Pe;
        if (A00) {
            if (A01() == null) {
                C06570Wi.A00().A04("BlackBoxApi", "UNABLE TO START: No bb controller");
                return;
            }
            if (C06360Vc.A0A == null) {
                return;
            }
            C06360Vc c06360Vc = C06360Vc.A0A;
            C0V9 A01 = A01();
            if (c06360Vc != null && A01 != null) {
                int i = C0V9.A00;
                boolean A09 = c06360Vc.A09(j, i, 2);
                C06570Wi.A00().A02(Boolean.valueOf(A09), A01.ACd(j), "BlackBoxApi", "TRACE START: success: %b; context: %s");
                if (!A09) {
                    return;
                }
                String str = null;
                for (TraceContext traceContext : c06360Vc.A06()) {
                    if (traceContext.A01 == i) {
                        long j2 = traceContext.A05;
                        if (j2 == j) {
                            BufferLogger.writeStandardEntry(traceContext.A09, 6, 43, 0L, 0, (int) j2, 0, 0L);
                            if (str == null && j != 30539777) {
                                str = traceContext.A0D;
                            }
                        }
                    }
                }
                if (str == null) {
                    return;
                }
                C0L9 A002 = C0L9.A00();
                synchronized (A002) {
                    C024009o c024009o = A002.A00;
                    if (c024009o != null && (c0Pe = c024009o.A00.A01) != null) {
                        C003801d c003801d = c0Pe.A03;
                        C02R.A03(c003801d, "Did you call SessionManager.init()?");
                        synchronized (c003801d.A02) {
                            c003801d.A0D(str, 2242, 12);
                            C003801d.A02(c003801d);
                        }
                    }
                }
                return;
            }
            C06570Wi.A00().A04("BlackBoxApi", "UNABLE TO START: No traceControl");
        }
    }

    public static void A06(TraceContext traceContext, String str, String[] strArr, int i) {
        int i2;
        Buffer buffer = traceContext.A09;
        BufferLogger.writeStandardEntry(buffer, 6, 46, 0L, 0, i, 0, 562949953421312L);
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 59, 0L, 0, i, 0, 562949953421312L), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), str);
        int i3 = 0;
        while (true) {
            int length = strArr.length;
            if (i3 < length && (i2 = i3 + 1) < length) {
                BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 59, 0L, 0, i, 0, 562949953421312L), strArr[i3]), strArr[i2]);
                i3 += 2;
            } else {
                return;
            }
        }
    }

    public static C0Uw A00(String str, String[] strArr, int i, boolean z) {
        int i2;
        TraceContext A01;
        Iterator it = A03(i).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            long longValue = number.longValue();
            if (A00) {
                C06360Vc c06360Vc = C06360Vc.A0A;
                C0V9 A012 = A01();
                C0Uw c0Uw = null;
                if (c06360Vc != null && A012 != null && (A01 = C06360Vc.A01(c06360Vc, null, (i2 = C0V9.A00), longValue)) != null) {
                    TraceContext traceContext = new TraceContext(A01);
                    C06570Wi.A00().A02(A012.ACd(longValue), str, "DelayedTraceHandle", "stopTraceAndDelayUpload(blackbox context = %s, type = %s)");
                    C0Uw c0Uw2 = new C0Uw(traceContext.A0D);
                    A06(traceContext, str, strArr, (int) traceContext.A05);
                    C20020yW A002 = C20020yW.A00();
                    InterfaceC20060yb interfaceC20060yb = c0Uw2.A04;
                    A002.A06.A00.add(interfaceC20060yb);
                    boolean A08 = c06360Vc.A08(longValue, i2);
                    C10V A003 = C06570Wi.A00();
                    if (!A08) {
                        A003.A03("DelayedTraceHandle", number, "UNABLE TO STOP: No trace is active. context: %s");
                        C20020yW.A00().A07(interfaceC20060yb);
                    } else {
                        A003.A02(number, traceContext.A0D, "DelayedTraceHandle", "TRACE STOP. context: %s; Trace ID: %s");
                        c0Uw = c0Uw2;
                    }
                }
                if (z) {
                    A05(longValue);
                }
                if (c0Uw != null) {
                    return c0Uw;
                }
            }
        }
        return null;
    }

    public static String A02() {
        Iterator it = A03(30539777).iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (A00) {
                String str = null;
                if (A00) {
                    C06360Vc c06360Vc = C06360Vc.A0A;
                    C0V9 A01 = A01();
                    if (c06360Vc != null && A01 != null) {
                        C06570Wi.A00().A02(A01.ACd(longValue), "bugreport", "BlackBoxApi", "stopBlackBoxTrace(context: %s, type: %s)");
                        int i = C0V9.A00;
                        TraceContext A012 = C06360Vc.A01(c06360Vc, null, i, longValue);
                        if (A012 == null) {
                            C06570Wi.A00().A03("BlackBoxApi", A01.ACd(longValue), "UNABLE TO STOP: No trace is active. context: %s");
                        } else {
                            TraceContext traceContext = new TraceContext(A012);
                            A06(traceContext, "bugreport", new String[0], (int) traceContext.A05);
                            C06570Wi.A00().A01(A01.ACd(traceContext.A05), "bugreport", traceContext.A0D, "BlackBoxApi", "TRACE STOP. context=%s; type: %s, Trace ID: %s");
                            c06360Vc.A08(longValue, i);
                            str = traceContext.A0D;
                        }
                    }
                }
                A05(longValue);
                if (str != null) {
                    return str;
                }
            }
        }
        return null;
    }
}
