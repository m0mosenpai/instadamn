package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;

/* loaded from: classes4.dex */
public abstract class AHV {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        if ((r1 instanceof X.C221479qC) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(android.content.Context r5, android.text.Spannable r6, X.C190888ck r7, X.C6RB r8, float r9) {
        /*
            r0 = 2
            X.C14360o3.A0B(r7, r0)
            X.8cr r3 = r7.A06
            X.C14360o3.A0A(r5)
            r2 = r9
            r4 = 0
            X.C14360o3.A0B(r5, r4)
            java.lang.Integer r0 = r3.A09
            if (r0 == 0) goto Lb9
            int r0 = r0.intValue()
            if (r0 != r4) goto Lb9
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r3.A07
            float r0 = X.AbstractC166987dD.A04(r1, r0)
            float r2 = r3.A01
        L24:
            float r2 = r2 * r0
            boolean r0 = r8 instanceof X.AbstractC202988yG
            r3 = 0
            if (r0 == 0) goto Lb6
            r0 = r8
            X.8yG r0 = (X.AbstractC202988yG) r0
            float r5 = r0.A0U()
        L31:
            X.C14360o3.A0A(r6)
            int r0 = r6.length()
            X.6S5 r4 = X.AbstractC190978ct.A00(r6, r4, r0)
            X.8cs r1 = r7.A04
            if (r1 == 0) goto Lb4
            X.6S5 r0 = X.C6S5.A04
            if (r4 == r0) goto L48
            X.6S5 r0 = X.C6S5.A06
            if (r4 != r0) goto Lb4
        L48:
            X.C14360o3.A0A(r1)
            boolean r0 = r1 instanceof X.C194998k0
            if (r0 != 0) goto Lb0
            boolean r0 = r1 instanceof X.C194988jz
            if (r0 != 0) goto Lac
            boolean r0 = r1 instanceof X.C1808780p
            if (r0 == 0) goto L6d
            r4 = 1063675494(0x3f666666, float:0.9)
        L5a:
            float r1 = r9 * r4
        L5c:
            if (r8 == 0) goto L66
            X.6RC r0 = r8.A0I
            if (r0 == 0) goto L66
            float r3 = X.AbstractC23029ADl.A00(r0, r9)
        L66:
            float r2 = r2 + r5
            float r0 = java.lang.Math.max(r1, r3)
            float r2 = r2 + r0
            return r2
        L6d:
            boolean r0 = r1 instanceof X.C1808880q
            if (r0 != 0) goto Lb0
            boolean r0 = r1 instanceof X.C195008k1
            if (r0 != 0) goto Lac
            boolean r0 = r1 instanceof X.C194928jt
            if (r0 != 0) goto La8
            boolean r0 = r1 instanceof X.C194898jq
            if (r0 != 0) goto Lb0
            boolean r0 = r1 instanceof X.C8k4
            if (r0 == 0) goto L85
            r4 = 1060320051(0x3f333333, float:0.7)
            goto L5a
        L85:
            boolean r0 = r1 instanceof X.C195028k3
            if (r0 == 0) goto L8d
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            goto L5a
        L8d:
            boolean r0 = r1 instanceof X.C195018k2
            if (r0 != 0) goto Lac
            boolean r0 = r1 instanceof X.C194978jy
            if (r0 == 0) goto La4
            r0 = 4626956035913940992(0x4036400000000000, double:22.25)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r4 = (float) r0
            goto L5a
        La4:
            boolean r0 = r1 instanceof X.C221479qC
            if (r0 == 0) goto Lb4
        La8:
            r4 = 1050253722(0x3e99999a, float:0.3)
            goto L5a
        Lac:
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            goto L5a
        Lb0:
            r4 = 1053609165(0x3ecccccd, float:0.4)
            goto L5a
        Lb4:
            r1 = 0
            goto L5c
        Lb6:
            r5 = 0
            goto L31
        Lb9:
            float r0 = r3.A01
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHV.A00(android.content.Context, android.text.Spannable, X.8ck, X.6RB, float):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A01(android.content.Context r5, android.text.Spannable r6, X.C190888ck r7, X.C6RB r8, float r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHV.A01(android.content.Context, android.text.Spannable, X.8ck, X.6RB, float):float");
    }

    public static void A02(Context context, Paint paint, Spannable spannable, C190888ck c190888ck, C6RB c6rb) {
        c6rb.A0C(A00(context, spannable, c190888ck, c6rb, paint.getTextSize()), A01(context, spannable, c190888ck, c6rb, paint.getTextSize()));
    }
}
