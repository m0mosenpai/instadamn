package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.ShE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63308ShE {
    public C62961SZe A03;
    public final InterfaceC65578TnD A06;
    public final List A07 = AbstractC25225BEi.A17(1);
    public boolean A04 = false;
    public float A02 = 0.0f;
    public Object A05 = null;
    public float A01 = -1.0f;
    public float A00 = -1.0f;

    public void A07() {
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((InterfaceC65309Thl) list.get(i)).Dya();
                i++;
            } else {
                return;
            }
        }
    }

    public static int A02(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            return i3 - 1;
        }
        return i3;
    }

    public final float A04() {
        C63366SiP AuW = this.A06.AuW();
        if (AuW != null && !AuW.A03()) {
            return AuW.A0B.getInterpolation(A05());
        }
        return 0.0f;
    }

    public final float A05() {
        if (this.A04) {
            return 0.0f;
        }
        C63366SiP AuW = this.A06.AuW();
        if (AuW.A03()) {
            return 0.0f;
        }
        return (this.A02 - AuW.A02()) / (AuW.A01() - AuW.A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0597, code lost:
    
        if (r5 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x054b, code lost:
    
        if (r5 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
    
        if (r3.A01 != false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.graphics.Path] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.SOT] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v45, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.SKz] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06() {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63308ShE.A06():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(float r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.QAV
            if (r0 == 0) goto L7
            r5.A02 = r6
        L6:
            return
        L7:
            boolean r0 = r5 instanceof X.QAU
            if (r0 == 0) goto L3a
            r3 = r5
            X.QAU r3 = (X.QAU) r3
            X.ShE r1 = r3.A04
            r1.A08(r6)
            X.ShE r0 = r3.A05
            r0.A08(r6)
            android.graphics.PointF r2 = r3.A02
            float r1 = A01(r1)
            float r0 = A01(r0)
            r2.set(r1, r0)
            r2 = 0
        L26:
            java.util.List r1 = r3.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L6
            java.lang.Object r0 = r1.get(r2)
            X.Thl r0 = (X.InterfaceC65309Thl) r0
            r0.Dya()
            int r2 = r2 + 1
            goto L26
        L3a:
            X.TnD r4 = r5.A06
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L6
            float r1 = r5.A01
            r2 = r1
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            float r1 = r4.Bzb()
            r5.A01 = r1
            r2 = r1
        L52:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L73
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
            float r2 = r4.Bzb()
            r5.A01 = r2
        L60:
            r6 = r2
        L61:
            float r0 = r5.A02
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L6
            r5.A02 = r6
            boolean r0 = r4.CfV(r6)
            if (r0 == 0) goto L6
            r5.A07()
            return
        L73:
            float r1 = r5.A00
            r2 = r1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L81
            float r1 = r4.B1z()
            r5.A00 = r1
            r2 = r1
        L81:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L61
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L60
            float r2 = r4.B1z()
            r5.A00 = r2
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63308ShE.A08(float):void");
    }

    public final void A09(InterfaceC65309Thl interfaceC65309Thl) {
        this.A07.add(interfaceC65309Thl);
    }

    public final void A0A(C62961SZe c62961SZe) {
        C62961SZe c62961SZe2 = this.A03;
        if (c62961SZe2 != null) {
            c62961SZe2.A00 = null;
        }
        this.A03 = c62961SZe;
        if (c62961SZe != null) {
            c62961SZe.A00 = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC63308ShE(List list) {
        InterfaceC65578TnD interfaceC65578TnD;
        if (list.isEmpty()) {
            interfaceC65578TnD = new Object();
        } else if (list.size() == 1) {
            interfaceC65578TnD = new C63680Srn(list);
        } else {
            interfaceC65578TnD = new C63681Sro(list);
        }
        this.A06 = interfaceC65578TnD;
    }

    public static float A01(AbstractC63308ShE abstractC63308ShE) {
        return ((Number) abstractC63308ShE.A06()).floatValue();
    }

    public static PointF A03(AbstractC63308ShE abstractC63308ShE) {
        return (PointF) abstractC63308ShE.A06();
    }
}
