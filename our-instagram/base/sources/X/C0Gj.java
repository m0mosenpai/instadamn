package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;

/* renamed from: X.0Gj, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Gj {
    public static C0N1 A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static String A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00() {
        C0Mq c0Mq = C04770Mv.A00;
        boolean z = A01;
        boolean z2 = z;
        if (A02) {
            z2 = (z ? 1 : 0) | 2;
        }
        boolean z3 = z2;
        if (A03) {
            z3 = (z2 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (A07) {
            z4 = (z3 ? 1 : 0) | ' ';
        }
        boolean z5 = z4;
        if (A04) {
            z5 = (z4 ? 1 : 0) | '@';
        }
        boolean z6 = z5;
        if (A09) {
            z6 = (z5 ? 1 : 0) | 128;
        }
        boolean z7 = z6;
        if (A06) {
            z7 = (z6 ? 1 : 0) | 256;
        }
        boolean z8 = z7;
        if (A08) {
            z8 = (z7 ? 1 : 0) | 512;
        }
        int i = z8;
        if (A05) {
            i = (z8 ? 1 : 0) | 1024;
        }
        String valueOf = String.valueOf(i);
        if (!valueOf.equals(A0A)) {
            A0A = valueOf;
            c0Mq.A02(C0LK.A7A, C0M6.CRITICAL_REPORT, valueOf);
        }
    }

    public static synchronized void A01(int i, String str) {
        synchronized (C0Gj.class) {
            C0N1 c0n1 = A00;
            if (c0n1 != null) {
                EventBuilder markEventBuilder = c0n1.A00.markEventBuilder(21375349, "native_provider");
                if (markEventBuilder.isSampled()) {
                    markEventBuilder.annotate(TraceFieldType.ErrorCode, i);
                    if (str != null) {
                        markEventBuilder.annotate("error_message", str);
                    }
                    markEventBuilder.report();
                }
            }
            A09 = false;
            A06 = false;
            A00();
        }
    }
}
