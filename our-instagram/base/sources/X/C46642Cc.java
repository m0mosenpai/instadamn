package X;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.2Cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46642Cc {
    public static C46742Cm A00;
    public static C46742Cm A01;
    public static C46742Cm A02;
    public static C46742Cm A03;
    public static C46742Cm A04;
    public static C46742Cm A05;
    public static InterfaceC16820sZ A06;
    public static InterfaceC16820sZ A07;
    public static InterfaceC16820sZ A08;
    public static InterfaceC16820sZ A09;
    public static C46742Cm A0A;
    public static C46742Cm A0B;
    public static InterfaceC16820sZ A0C;
    public static final C46642Cc A0D = new Object();
    public static final AtomicInteger A0E;
    public static final AtomicReference A0F;
    public static final AtomicReference A0G;
    public static final AtomicReference A0H;
    public static volatile Map A0I;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Cc, java.lang.Object] */
    static {
        EnumC46652Cd enumC46652Cd = EnumC46652Cd.GREEN;
        A0G = new AtomicReference(enumC46652Cd);
        A0F = new AtomicReference(enumC46652Cd);
        A0C = C46662Ce.A00;
        A0E = new AtomicInteger(0);
        A07 = C46672Cf.A00;
        A09 = C46682Cg.A00;
        A0H = new AtomicReference(EnumC46692Ch.UNKNOWN);
        A06 = C46702Ci.A00;
        A08 = C46712Cj.A00;
        C206209Bd c206209Bd = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd.A03(EnumC46722Ck.A0B);
        A03 = c206209Bd.A02();
        C206209Bd c206209Bd2 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd2.A03(EnumC46722Ck.A0E);
        A0B = c206209Bd2.A02();
        C206209Bd c206209Bd3 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd3.A03(EnumC46722Ck.A0A);
        A02 = c206209Bd3.A02();
        C206209Bd c206209Bd4 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd4.A03(EnumC46722Ck.A09);
        A01 = c206209Bd4.A02();
        C206209Bd c206209Bd5 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd5.A03(EnumC46722Ck.A0G);
        A0A = c206209Bd5.A02();
        C206209Bd c206209Bd6 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd6.A03(EnumC46722Ck.A0D);
        A04 = c206209Bd6.A02();
        C206209Bd c206209Bd7 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd7.A03(EnumC46722Ck.A0H);
        A05 = c206209Bd7.A02();
        A0I = new EnumMap(EnumC46722Ck.class);
        C206209Bd c206209Bd8 = new C206209Bd((EnumC46732Cl) null, (EnumC46722Ck) null, (Map) null, (DefaultConstructorMarker) null, 7, 0);
        c206209Bd8.A03(EnumC46722Ck.A07);
        A00 = c206209Bd8.A02();
    }

    public static final int A00(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Map map = A00.A02;
        C4HI c4hi = C4HI.A0C;
        Number number = (Number) map.get(c4hi);
        int i6 = -1;
        if (number == null || (i2 = number.intValue()) < -1) {
            i2 = -1;
        }
        Map map2 = A00.A02;
        C4HI c4hi2 = C4HI.A0D;
        Number number2 = (Number) map2.get(c4hi2);
        if (number2 == null || (i3 = number2.intValue()) < -1) {
            i3 = -1;
        }
        Number number3 = (Number) A00.A02.get(C4HI.A0B);
        if (number3 == null || (i4 = number3.intValue()) < -1) {
            i4 = -1;
        }
        Number number4 = (Number) A03.A02.get(c4hi);
        if (number4 == null || (i5 = number4.intValue()) < -1) {
            i5 = -1;
        }
        Number number5 = (Number) A03.A02.get(c4hi2);
        if (number5 != null) {
            int intValue = number5.intValue();
            if (intValue < -1) {
                intValue = -1;
            }
            i6 = intValue;
        }
        long longValue = ((Number) A08.invoke()).longValue() / 1048576;
        long j = i5;
        if (longValue <= j) {
            return i2;
        }
        if (j < longValue && longValue <= i6) {
            return i3;
        }
        if (longValue > i6) {
            return i4;
        }
        return i;
    }

    public static final int A01(C46742Cm c46742Cm) {
        return A0D.A02(EnumC46732Cl.A03, c46742Cm, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0139, code lost:
    
        if (r1 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r8 != (-2147483647)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        if (X.C46642Cc.A0F.get() == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        if (r5 != (-2147483647)) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184 A[PHI: r9
      0x0184: PHI (r9v10 int) = (r9v6 int), (r9v12 int) binds: [B:84:0x0181, B:68:0x010c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(X.EnumC46732Cl r13, X.C46742Cm r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46642Cc.A02(X.2Cl, X.2Cm, boolean):int");
    }
}
