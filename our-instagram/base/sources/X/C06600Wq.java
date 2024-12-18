package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06600Wq {
    public static final AtomicReference A00;
    public static final C06600Wq A01;
    public static volatile InterfaceC06270Us A02;
    public static volatile InterfaceC05750Sb A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Wq, java.lang.Object] */
    static {
        ?? obj = new Object();
        A01 = obj;
        A00 = new AtomicReference(new C05840Sm(obj));
    }

    public static C05620Rm A00() {
        int i;
        C0XT c0xt = (C0XT) ((C05840Sm) A00.get()).A00.get();
        if (c0xt != null && (i = c0xt.A00) != 0) {
            return (C05620Rm) c0xt.A01[i - 1];
        }
        return null;
    }

    public static C0SJ A01(C0SJ c0sj, int i) {
        Integer num;
        InterfaceC05750Sb interfaceC05750Sb;
        String tag = c0sj.getTag();
        A03(tag);
        C05840Sm c05840Sm = (C05840Sm) A00.get();
        if (c0sj instanceof C06230Uo) {
            c0sj = ((C06230Uo) c0sj).A00;
        }
        if (!(c0sj instanceof C05620Rm)) {
            return A02(c0sj.getTag(), i);
        }
        C0SW c0sw = C0SX.A00;
        if (c0sw == null || (num = c0sw.CAQ()) == null) {
            num = C05F.A0C;
        }
        if (num == C05F.A0C) {
            return C0TB.A00;
        }
        C05620Rm A002 = A00();
        if (A002 != null && num != C05F.A00 && c0sj.CLk(A002) && ((interfaceC05750Sb = A03) == null || (!interfaceC05750Sb.AFa(A002, 1, i)))) {
            return new C06230Uo(A002);
        }
        C05620Rm A003 = c05840Sm.A00((C05620Rm) c0sj, tag, 1, i);
        c05840Sm.A01(A003);
        return A003;
    }

    public static C0SJ A02(String str, int i) {
        Integer num;
        C05620Rm c05620Rm;
        int i2;
        Integer num2;
        InterfaceC05750Sb interfaceC05750Sb;
        A03(str);
        C0SW c0sw = C0SX.A00;
        if (c0sw == null || (num = c0sw.CAQ()) == null) {
            num = C05F.A0C;
        }
        Integer num3 = C05F.A0C;
        if (num == num3) {
            return C0TB.A00;
        }
        C05620Rm A002 = A00();
        if (A002 != null) {
            C0SW c0sw2 = C0SX.A00;
            if (c0sw2 == null || (num2 = c0sw2.CAQ()) == null) {
                num2 = num3;
            }
            if (num2 != C05F.A00 && ((interfaceC05750Sb = A03) == null || (!interfaceC05750Sb.AFa(A002, 3, i)))) {
                return new C06230Uo(A002);
            }
        }
        C05840Sm c05840Sm = (C05840Sm) A00.get();
        C0XT c0xt = (C0XT) c05840Sm.A00.get();
        if (c0xt == null || (i2 = c0xt.A00) == 0 || (c05620Rm = (C05620Rm) c0xt.A01[i2 - 1]) == null) {
            c05620Rm = null;
        }
        C05620Rm A003 = c05840Sm.A00(c05620Rm, str, 3, i);
        c05840Sm.A01(A003);
        return A003;
    }

    public static void A03(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(String.format("%s cannot be null.", "tag"));
        }
    }
}
