package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AKI {
    public static final List A04;
    public static final List A05;
    public static final List A07;
    public static final List A08;
    public static final List A0B;
    public static final List A0G;
    public static final AKI A00 = new Object();
    public static final List A01 = AbstractC16960so.A1Q("DoF", "blurry", "motionBlur", "light", "colVivid", "balanceElements", "colHarmony", "aesthetics_rating", "RoT");
    public static final List A0H = AbstractC16960so.A1Q("no_occluded", "occluded");
    public static final List A09 = AbstractC16960so.A1Q("violence", "nudity");
    public static final List A02 = AbstractC16960so.A1Q("dog", "pet", "cat", "animal");
    public static final List A0C = AbstractC16960so.A1Q("child", "face", "smiling", "people");
    public static final List A0A = AbstractC166987dD.A1J("foodstuff");
    public static final List A03 = AbstractC166987dD.A1J("giraffe");
    public static final List A06 = AbstractC16960so.A1Q("food", "drink");
    public static final List A0D = AbstractC166987dD.A1J("plant");
    public static final List A0E = AbstractC166987dD.A1J("sports");
    public static final List A0F = AbstractC166987dD.A1J("vehicle");

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r1 != 3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A01(X.C8KU r18, java.util.List r19, org.pytorch.Tensor[] r20, boolean r21) {
        /*
            r17 = this;
            r13 = 0
            r12 = 1
            r14 = r20
            X.C14360o3.A0B(r14, r12)
            r11 = 2
            r15 = r18
            java.util.ArrayList r10 = X.AbstractC166997dE.A12(r15, r11)
            java.util.Iterator r16 = r19.iterator()
        L12:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r9 = r16.next()
            X.8KX r9 = (X.C8KX) r9
            X.8KX r0 = X.C8KX.A04
            r8 = 0
            if (r9 != r0) goto L36
            int r0 = r14.length
            r2 = 5
            if (r0 <= r2) goto L36
        L27:
            r0 = r20[r2]
            float[] r1 = r0.getDataAsFloatArray()
            X.AKS r0 = new X.AKS
            r0.<init>(r9, r8, r8, r1)
            r10.add(r0)
            goto L12
        L36:
            X.8KX r0 = X.C8KX.A07
            r2 = 3
            if (r9 != r0) goto L3f
            int r0 = r14.length
            if (r0 <= r2) goto L3f
            goto L27
        L3f:
            int r1 = r9.ordinal()
            if (r1 == r13) goto Lb0
            if (r1 == r11) goto Lad
            if (r1 == r12) goto Laa
            if (r1 != r2) goto L12
            java.util.List r7 = X.AKI.A0H
        L4d:
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            r5 = 0
            r0 = 4
            if (r1 == r13) goto L61
            if (r1 == r11) goto L5f
            if (r1 == r12) goto L63
            if (r1 == r2) goto L64
        L5b:
            r10.addAll(r6)
            goto L12
        L5f:
            r0 = 1
            goto L64
        L61:
            r0 = 0
            goto L64
        L63:
            r0 = 2
        L64:
            r0 = r20[r0]
            float[] r4 = r0.getDataAsFloatArray()
            int r1 = r7.size()
            int r0 = r4.length
            if (r1 != r0) goto L5b
            int r3 = r7.size()
        L75:
            if (r5 >= r3) goto L5b
            X.8KX r0 = X.C8KX.A03
            if (r9 != r0) goto L95
            r1 = r4[r5]
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L90
            java.util.List r1 = X.AKI.A03
            java.lang.Object r0 = r7.get(r5)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L95
        L90:
            if (r21 != 0) goto L95
        L92:
            int r5 = r5 + 1
            goto L75
        L95:
            java.lang.Object r2 = r7.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            r0 = r4[r5]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.AKS r0 = new X.AKS
            r0.<init>(r9, r1, r2, r8)
            r6.add(r0)
            goto L92
        Laa:
            java.util.List r7 = X.AKI.A01
            goto L4d
        Lad:
            java.util.List r7 = X.AKI.A09
            goto L4d
        Lb0:
            java.util.List r7 = r15.A00()
            goto L4d
        Lb5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AKI.A01(X.8KU, java.util.List, org.pytorch.Tensor[], boolean):java.util.ArrayList");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.AKI, java.lang.Object] */
    static {
        List A1J = AbstractC166987dD.A1J("waterside");
        A0G = A1J;
        List A1J2 = AbstractC166987dD.A1J("outdoors");
        A0B = A1J2;
        A07 = AbstractC166987dD.A1J("landmark");
        A05 = AbstractC166987dD.A1J("happy special event");
        A04 = AbstractC16960so.A1Q("has_text", "stub", "reading", "study", "document");
        A08 = AbstractC001800i.A0S(A1J, AbstractC001800i.A0S(A1J2, AbstractC16960so.A1Q("ocean", "river", "castle", "coast", "mountain", "pond", "lake", "snow_mountain")));
    }

    public static final float A00(List list, List list2) {
        double d;
        double d2;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list2) {
            AKS aks = (AKS) obj;
            if (aks.A03 == C8KX.A03 && AbstractC001800i.A0u(list, aks.A01)) {
                A1E.add(obj);
            }
        }
        Iterator it = A1E.iterator();
        if (it.hasNext()) {
            Float f = ((AKS) it.next()).A00;
            if (f != null) {
                d = f.floatValue();
            } else {
                d = 0.0d;
            }
            while (it.hasNext()) {
                Float f2 = ((AKS) it.next()).A00;
                if (f2 != null) {
                    d2 = f2.floatValue();
                } else {
                    d2 = 0.0d;
                }
                d = Math.max(d, d2);
            }
            Double valueOf = Double.valueOf(d);
            if (valueOf != null) {
                return (float) valueOf.doubleValue();
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
