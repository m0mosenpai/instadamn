package X;

import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes12.dex */
public abstract class XO5 implements InterfaceC13000lm {
    public String A00;
    public String A01;
    public final XO6 A02;
    public final YO9 A03;

    public XO5(YO9 yo9) {
        C14360o3.A0B(yo9, 1);
        this.A03 = yo9;
        XO6 xo6 = new XO6();
        this.A02 = xo6;
        xo6.A0E = new XO7(yo9);
        xo6.A00 = 1;
    }

    public final void A04(YP3 yp3) {
        C14360o3.A0B(yp3, 0);
        YP3 yp32 = (YP3) yp3.FBH(this.A00);
        XO6 xo6 = this.A02;
        String BKg = yp32.BKg(this.A01);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        C18C.A07(xo6.A0E, "Must init with a valid delegate first!");
        BKg.getClass();
        if (xo6.A0F != null) {
            XO6.A00(xo6, valueOf, yp32, BKg);
        }
    }

    public final void A05(YP3 yp3) {
        C14360o3.A0B(yp3, 0);
        YP3 yp32 = (YP3) yp3.FBH(this.A00);
        XO6 xo6 = this.A02;
        String BKg = yp32.BKg(this.A01);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        C18C.A07(xo6.A0E, "Must init with a valid delegate first!");
        BKg.getClass();
        if (xo6.A0F != null) {
            int i = -1;
            C20030yX c20030yX = xo6.A09;
            Number number = (Number) c20030yX.get(BKg);
            if (number != null) {
                i = Math.max(number.intValue(), -1);
            }
            c20030yX.put(BKg, Integer.valueOf(i));
            int i2 = -1;
            C20030yX c20030yX2 = xo6.A07;
            Number number2 = (Number) c20030yX2.get(BKg);
            if (number2 != null) {
                i2 = Math.max(number2.intValue(), -1);
            }
            c20030yX2.put(BKg, Integer.valueOf(i2));
            C20030yX c20030yX3 = xo6.A05;
            if (c20030yX3.containsKey(BKg)) {
                C0K8.A0D("RankingImpressionLoggingManager", "Previous impression has not stopped yet, check your logging logic");
                return;
            }
            c20030yX3.put(BKg, valueOf);
            C20030yX c20030yX4 = xo6.A02;
            Number number3 = (Number) c20030yX4.get(BKg);
            int i3 = 1;
            if (number3 != null) {
                i3 = 1 + number3.intValue();
            }
            c20030yX4.put(BKg, Integer.valueOf(i3));
            if (xo6.A00 != 0 && xo6.A06.containsKey(BKg)) {
                return;
            }
            xo6.A06.put(BKg, yp32);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01 = null;
    }

    public final void A01() {
        XO6 xo6 = this.A02;
        C18C.A07(xo6.A0E, "Must init with a valid delegate first!");
        if (xo6.A0F == null) {
            xo6.A0F = UUID.randomUUID().toString();
            xo6.A01 = xo6.A0D.now();
        }
    }

    public final void A02() {
        XO6 xo6 = this.A02;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        C18C.A07(xo6.A0E, "Must init with a valid delegate first!");
        C18C.A07(valueOf, "Timestamp is null!");
        if (xo6.A0F != null) {
            C20030yX c20030yX = xo6.A06;
            Iterator it = c20030yX.keySet().iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                Object obj = c20030yX.get(A1B);
                XO6.A00(xo6, valueOf, obj, A1B);
                if (xo6.A00 != 0) {
                    int A0H = AbstractC166987dD.A0H(xo6.A02.get(A1B));
                    long A0N = AbstractC166987dD.A0N(xo6.A08.get(A1B));
                    C20030yX c20030yX2 = xo6.A09;
                    if (c20030yX2.get(A1B) != null) {
                        c20030yX2.get(A1B);
                    }
                    C20030yX c20030yX3 = xo6.A07;
                    if (c20030yX3.get(A1B) != null) {
                        c20030yX3.get(A1B);
                    }
                    long A0N2 = AbstractC166987dD.A0N(xo6.A0B.get(A1B));
                    long A0N3 = AbstractC166987dD.A0N(xo6.A03.get(A1B));
                    long A0N4 = AbstractC166987dD.A0N(xo6.A04.get(A1B));
                    C20030yX c20030yX4 = xo6.A0A;
                    if (c20030yX4.containsKey(A1B)) {
                        c20030yX4.get(A1B);
                    }
                    if (A0N2 >= 0) {
                        xo6.A0F.getClass();
                        obj.getClass();
                        C34961Fal c34961Fal = new C34961Fal(obj, A0H, A0N3, A0N4, A0N, A0N2, xo6.A0C.contains(A1B));
                        xo6.A0E.A00.Ck7(c34961Fal, c34961Fal.A06);
                    }
                }
            }
            xo6.A0F = null;
            c20030yX.clear();
            xo6.A02.clear();
            xo6.A05.clear();
            xo6.A0B.clear();
            xo6.A08.clear();
            xo6.A09.clear();
            xo6.A07.clear();
            xo6.A03.clear();
            xo6.A04.clear();
            xo6.A0C.clear();
        }
    }

    public final void A03(YP3 yp3) {
        YP3 yp32 = (YP3) yp3.FBH(this.A00);
        XO6 xo6 = this.A02;
        String BKg = yp32.BKg(this.A01);
        C18C.A07(xo6.A0E, "Must init with a valid delegate first!");
        BKg.getClass();
        if (xo6.A0F != null) {
            xo6.A0C.add(BKg);
        }
    }
}
