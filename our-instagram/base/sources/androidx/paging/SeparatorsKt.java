package androidx.paging;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C55090Oaw;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class SeparatorsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:12:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C55090Oaw r10, X.InterfaceC23621Ds r11, X.InterfaceC16610sE r12) {
        /*
            r4 = 1
            boolean r0 = r11 instanceof X.C57139PWr
            if (r0 == 0) goto Lb2
            r1 = r11
            X.PWr r1 = (X.C57139PWr) r1
            int r0 = r1.A09
            if (r0 != r4) goto Lb2
            int r3 = r1.A02
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lb2
            int r3 = r3 - r2
            r1.A02 = r3
        L17:
            java.lang.Object r6 = r1.A08
            X.1JX r5 = X.C1JX.A02
            int r0 = r1.A02
            if (r0 == 0) goto L77
            if (r0 != r4) goto Lcf
            int r0 = r1.A01
            int r9 = r1.A00
            java.lang.Object r7 = r1.A07
            java.lang.Object r3 = r1.A06
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r1.A05
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r12 = r1.A04
            X.0sE r12 = (X.InterfaceC16610sE) r12
            java.lang.Object r10 = r1.A03
            X.Oaw r10 = (X.C55090Oaw) r10
            X.AbstractC09560e7.A00(r6)
        L3a:
            if (r6 == 0) goto L46
            r2.add(r6)
            java.lang.Integer r6 = X.AbstractC43592JPx.A0r(r9)
            r3.add(r6)
        L46:
            r2.add(r7)
            java.lang.Integer r6 = X.AbstractC43592JPx.A0r(r9)
            r3.add(r6)
            int r9 = r9 + 1
        L52:
            if (r9 >= r0) goto Lb9
            java.util.List r8 = r10.A01
            java.lang.Object r7 = r8.get(r9)
            int r6 = r9 + (-1)
            java.lang.Object r6 = r8.get(r6)
            r1.A03 = r10
            r1.A04 = r12
            r1.A05 = r2
            r1.A06 = r3
            r1.A07 = r7
            r1.A00 = r9
            r1.A01 = r0
            r1.A02 = r4
            java.lang.Object r6 = r12.invoke(r6, r7, r1)
            if (r6 != r5) goto L3a
            return r5
        L77:
            X.AbstractC09560e7.A00(r6)
            java.util.List r6 = r10.A01
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Ld4
            int r0 = r6.size()
            int r0 = r0 + 4
            java.util.ArrayList r2 = X.AbstractC25225BEi.A17(r0)
            java.util.ArrayList r3 = X.AbstractC25225BEi.A17(r0)
            java.lang.Object r0 = X.AbstractC001800i.A0I(r6)
            r2.add(r0)
            java.util.List r0 = r10.A02
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = X.AbstractC001800i.A0I(r0)
            int r0 = X.AbstractC166987dD.A0H(r0)
        La3:
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r3.add(r0)
            int r0 = r6.size()
            r9 = 1
            goto L52
        Lb0:
            r0 = 0
            goto La3
        Lb2:
            X.PWr r1 = new X.PWr
            r1.<init>(r11)
            goto L17
        Lb9:
            int r1 = r2.size()
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            if (r1 == r0) goto Ld4
            int[] r1 = r10.A03
            int r0 = r10.A00
            X.Oaw r10 = new X.Oaw
            r10.<init>(r2, r3, r1, r0)
            return r10
        Lcf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Ld4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.A00(X.Oaw, X.1Ds, X.0sE):java.lang.Object");
    }

    public static final void A01(C55090Oaw c55090Oaw, C55090Oaw c55090Oaw2, Object obj, List list, int i, int i2) {
        int[] iArr;
        C14360o3.A0B(list, 0);
        int[] iArr2 = null;
        if (c55090Oaw != null) {
            iArr = c55090Oaw.A03;
        } else {
            iArr = null;
        }
        if (c55090Oaw2 != null) {
            iArr2 = c55090Oaw2.A03;
        }
        if (iArr != null) {
            if (iArr2 != null) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] copyOf = Arrays.copyOf(iArr, length + length2);
                System.arraycopy(iArr2, 0, copyOf, length, length2);
                C14360o3.A0A(copyOf);
                C14360o3.A0B(copyOf, 0);
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(copyOf.length));
                for (int i3 : copyOf) {
                    linkedHashSet.add(Integer.valueOf(i3));
                }
                iArr = AbstractC001800i.A0x(AbstractC001800i.A0Z(AbstractC001800i.A0a(linkedHashSet)));
            }
        } else if (iArr2 != null) {
            iArr = iArr2;
        } else {
            throw AbstractC166987dD.A12("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj != null) {
            C55090Oaw c55090Oaw3 = C55090Oaw.A04;
            list.add(new C55090Oaw(AbstractC166987dD.A1J(obj), AbstractC166987dD.A1J(Integer.valueOf(i2)), iArr, i));
        }
    }
}
