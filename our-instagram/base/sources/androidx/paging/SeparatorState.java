package androidx.paging;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC16960so;
import X.AbstractC25229BEm;
import X.AbstractC43594JPz;
import X.C55090Oaw;
import X.C57134PWm;
import X.InterfaceC16610sE;
import X.OMK;
import X.OX8;
import java.util.List;

/* loaded from: classes9.dex */
public final class SeparatorState {
    public int A00;
    public int A01;
    public OX8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Integer A09;
    public final InterfaceC16610sE A0A;
    public final List A08 = AbstractC166987dD.A1E();
    public final OMK A07 = new OMK();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(androidx.paging.PageEvent$StaticList r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r1 = 0
            boolean r0 = r12 instanceof X.C57139PWr
            if (r0 == 0) goto L77
            r8 = r12
            X.PWr r8 = (X.C57139PWr) r8
            int r0 = r8.A09
            if (r0 != r1) goto L77
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r8.A02 = r2
        L17:
            java.lang.Object r2 = r8.A07
            X.1JX r9 = X.C1JX.A02
            int r0 = r8.A02
            r7 = 1
            if (r0 == 0) goto L68
            if (r0 != r7) goto L7d
            int r6 = r8.A01
            int r5 = r8.A00
            java.lang.Object r1 = r8.A06
            java.lang.Object r4 = r8.A05
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r11 = r8.A04
            androidx.paging.PageEvent$StaticList r11 = (androidx.paging.PageEvent$StaticList) r11
            java.lang.Object r3 = r8.A03
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            X.AbstractC09560e7.A00(r2)
        L37:
            if (r2 == 0) goto L3c
            r4.add(r2)
        L3c:
            if (r1 == 0) goto L41
            r4.add(r1)
        L41:
            if (r5 == r6) goto L82
            int r5 = r5 + 1
        L45:
            java.util.List r1 = r11.A02
            int r0 = r5 + (-1)
            java.lang.Object r2 = X.AbstractC001800i.A0O(r1, r0)
            java.lang.Object r1 = X.AbstractC001800i.A0O(r1, r5)
            X.0sE r0 = r3.A0A
            r8.A03 = r3
            r8.A04 = r11
            r8.A05 = r4
            r8.A06 = r1
            r8.A00 = r5
            r8.A01 = r6
            r8.A02 = r7
            java.lang.Object r2 = r0.invoke(r2, r1, r8)
            if (r2 != r9) goto L37
            return r9
        L68:
            java.util.ArrayList r4 = X.MSY.A0i(r2)
            r5 = 0
            java.util.List r0 = r11.A02
            int r6 = r0.size()
            if (r6 < 0) goto L82
            r3 = r10
            goto L45
        L77:
            X.PWr r8 = new X.PWr
            r8.<init>(r10, r12)
            goto L17
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L82:
            X.OX8 r2 = r11.A01
            X.OX8 r1 = r11.A00
            androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
            r0.<init>(r2, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A03(androidx.paging.PageEvent$StaticList, X.1Ds):java.lang.Object");
    }

    public static final C55090Oaw A00(C55090Oaw c55090Oaw) {
        int i;
        int A09;
        C55090Oaw c55090Oaw2 = C55090Oaw.A04;
        int[] iArr = c55090Oaw.A03;
        List list = c55090Oaw.A01;
        List A1Q = AbstractC16960so.A1Q(AbstractC001800i.A0I(list), AbstractC001800i.A0K(list));
        int i2 = c55090Oaw.A00;
        List list2 = c55090Oaw.A02;
        if (list2 != null) {
            i = AbstractC166987dD.A0H(AbstractC001800i.A0I(list2));
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (list2 != null) {
            A09 = AbstractC166987dD.A0H(AbstractC001800i.A0K(list2));
        } else {
            A09 = AbstractC25229BEm.A09(list);
        }
        return new C55090Oaw(A1Q, AbstractC43594JPz.A11(valueOf, A09), iArr, i2);
    }

    public static void A01(C57134PWm c57134PWm, Object obj, Object obj2, Object obj3, Object obj4) {
        c57134PWm.A05 = obj;
        c57134PWm.A06 = obj2;
        c57134PWm.A07 = obj3;
        c57134PWm.A08 = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00f6, code lost:
    
        if (r3 != r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x013c, code lost:
    
        if (r13 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0134, code lost:
    
        if (r8 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x03d8, code lost:
    
        if (r6 == r9) goto L158;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0459 -> B:12:0x045a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0574 -> B:81:0x0577). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(androidx.paging.PageEvent$Insert r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A02(androidx.paging.PageEvent$Insert, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.AbstractC53628NnZ r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A04(X.NnZ, X.1Ds):java.lang.Object");
    }

    public SeparatorState(Integer num, InterfaceC16610sE interfaceC16610sE) {
        this.A09 = num;
        this.A0A = interfaceC16610sE;
    }
}
