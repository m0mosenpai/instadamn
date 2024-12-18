package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC113415Ad {
    public InterfaceC113395Ab A00;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC113395Ab A07;
    public boolean A01 = true;
    public final Map A08 = new HashMap();

    public static final void A00(AbstractC122975hY abstractC122975hY, AbstractC113415Ad abstractC113415Ad, C59U c59u, int i) {
        long A00;
        float A01;
        loop0: while (true) {
            float f = i;
            A00 = AbstractC119395aw.A00(f, f);
            do {
                A00 = abstractC113415Ad.A02(c59u, A00);
                c59u = c59u.A07;
                C14360o3.A0A(c59u);
                if (C14360o3.A0K(c59u, abstractC113415Ad.A07.BHu())) {
                    break loop0;
                }
            } while (!abstractC113415Ad.A03(c59u).containsKey(abstractC122975hY));
            i = abstractC113415Ad.A01(abstractC122975hY, c59u);
        }
        if (abstractC122975hY instanceof C122965hX) {
            A01 = C119365at.A02(A00);
        } else {
            A01 = C119365at.A01(A00);
        }
        int round = Math.round(A01);
        Map map = abstractC113415Ad.A08;
        if (map.containsKey(abstractC122975hY)) {
            round = ((Number) abstractC122975hY.A00.invoke(Integer.valueOf(((Number) AbstractC09990gB.A0I(abstractC122975hY, map)).intValue()), Integer.valueOf(round))).intValue();
        }
        map.put(abstractC122975hY, Integer.valueOf(round));
    }

    public final void A04() {
        this.A01 = true;
        InterfaceC113395Ab interfaceC113395Ab = this.A07;
        InterfaceC113395Ab BbG = interfaceC113395Ab.BbG();
        if (BbG != null) {
            if (this.A06) {
                BbG.EJB();
            } else if (this.A02 || this.A05) {
                BbG.requestLayout();
            }
            if (this.A04) {
                interfaceC113395Ab.EJB();
            }
            if (this.A03) {
                interfaceC113395Ab.requestLayout();
            }
            BbG.Aav().A04();
        }
    }

    public long A02(C59U c59u, long j) {
        float[] fArr = C59U.A0Q;
        return c59u.A0S(j);
    }

    public final void A05() {
        Map map = this.A08;
        map.clear();
        InterfaceC113395Ab interfaceC113395Ab = this.A07;
        interfaceC113395Ab.AWN(new DRU(this, 35));
        map.putAll(A03(interfaceC113395Ab.BHu()));
        this.A01 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r1.A03 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r3.A03 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r3 = this;
            boolean r0 = r3.A06
            if (r0 != 0) goto L11
            boolean r0 = r3.A02
            if (r0 != 0) goto L11
            boolean r0 = r3.A04
            if (r0 != 0) goto L11
            boolean r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            X.5Ab r2 = r3.A07
            if (r0 != 0) goto L38
            X.5Ab r0 = r2.BbG()
            if (r0 == 0) goto L3a
            X.5Ad r0 = r0.Aav()
            X.5Ab r2 = r0.A00
            if (r2 == 0) goto L3b
            X.5Ad r1 = r2.Aav()
            boolean r0 = r1.A06
            if (r0 != 0) goto L38
            boolean r0 = r1.A02
            if (r0 != 0) goto L38
            boolean r0 = r1.A04
            if (r0 != 0) goto L38
            boolean r0 = r1.A03
            if (r0 == 0) goto L3b
        L38:
            r3.A00 = r2
        L3a:
            return
        L3b:
            X.5Ab r2 = r3.A00
            if (r2 == 0) goto L3a
            X.5Ad r1 = r2.Aav()
            boolean r0 = r1.A06
            if (r0 != 0) goto L3a
            boolean r0 = r1.A02
            if (r0 != 0) goto L3a
            boolean r0 = r1.A04
            if (r0 != 0) goto L3a
            boolean r0 = r1.A03
            if (r0 != 0) goto L3a
            X.5Ab r0 = r2.BbG()
            if (r0 == 0) goto L62
            X.5Ad r0 = r0.Aav()
            if (r0 == 0) goto L62
            r0.A06()
        L62:
            X.5Ab r0 = r2.BbG()
            if (r0 == 0) goto L71
            X.5Ad r0 = r0.Aav()
            if (r0 == 0) goto L71
            X.5Ab r2 = r0.A00
            goto L38
        L71:
            r2 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113415Ad.A06():void");
    }

    public AbstractC113415Ad(InterfaceC113395Ab interfaceC113395Ab) {
        this.A07 = interfaceC113395Ab;
    }

    public int A01(AbstractC122975hY abstractC122975hY, C59U c59u) {
        return c59u.AX8(abstractC122975hY);
    }

    public Map A03(C59U c59u) {
        return c59u.A0N().Aaw();
    }
}
