package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.KZj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46040KZj extends AbstractC26311Pm {
    public static final C46040KZj A01 = new C46040KZj(2);
    public final int A00;

    public C46040KZj(int i) {
        this.A00 = 2;
    }

    public static final void A01(List list, int... iArr) {
        int length = iArr.length;
        for (int i : iArr) {
            if (i < 0 || i > list.size()) {
                Integer[] numArr = new Integer[length];
                for (int i2 = 0; i2 < length; i2++) {
                    AbstractC25235BEs.A1R(numArr, iArr[i2], i2);
                }
                String arrays = Arrays.toString(numArr);
                C14360o3.A07(arrays);
                throw AbstractC166987dD.A12(AnonymousClass001.A07(list.size(), "positions are not correct: ", arrays, " for list of size: "));
            }
        }
    }

    @Override // X.AbstractC26311Pm
    public final int A03(EnumC26291Pk enumC26291Pk, List list, int i) {
        C14360o3.A0B(list, 0);
        A01(list, i);
        ArrayList A1F = AbstractC166987dD.A1F(list);
        A1F.add(i, enumC26291Pk);
        return A00(enumC26291Pk, A1F, i);
    }

    @Override // X.AbstractC26311Pm
    public final int A04(EnumC26291Pk enumC26291Pk, List list, int i, int i2) {
        C14360o3.A0B(list, 0);
        A01(list, i, i2);
        ArrayList A1F = AbstractC166987dD.A1F(list);
        Object remove = A1F.remove(i);
        if (remove == enumC26291Pk) {
            A1F.add(i2, remove);
            return A00(enumC26291Pk, A1F, i2);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("State ");
        A1C.append(list);
        A1C.append(" is out of sync or wrong item at position ");
        A1C.append(i);
        A1C.append(" and type ");
        A1C.append(enumC26291Pk);
        A1C.append('.');
        throw AbstractC166987dD.A12(A1C.toString());
    }

    @Override // X.AbstractC26311Pm
    public final int A05(List list) {
        return 0;
    }

    @Override // X.AbstractC26311Pm
    public final boolean A06(EnumC26291Pk enumC26291Pk, Integer num, List list, int i) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 > r7.A00) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r3 > r7.A00) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(X.EnumC26291Pk r8, java.util.List r9, int r10) {
        /*
            r7 = this;
            int[] r0 = new int[]{r10}
            A01(r9, r0)
            r5 = r10
            r4 = 0
            r3 = 0
            r6 = 0
        Lb:
            int r10 = r10 + (-1)
            if (r10 < 0) goto L14
            int r0 = r7.A00
            r2 = 1
            if (r4 <= r0) goto L15
        L14:
            r2 = 0
        L15:
            int r5 = r5 + 1
            int r0 = r9.size()
            if (r5 >= r0) goto L22
            int r1 = r7.A00
            r0 = 1
            if (r3 <= r1) goto L23
        L22:
            r0 = 0
        L23:
            r2 = r2 | r0
            if (r2 == 0) goto L4f
            if (r10 < 0) goto L30
            java.lang.Object r0 = r9.get(r10)
            if (r0 == r8) goto L47
            int r4 = r4 + 1
        L30:
            int r0 = r9.size()
            if (r5 >= r0) goto Lb
            java.lang.Object r0 = r9.get(r5)
            if (r0 == r8) goto L3f
            int r3 = r3 + 1
            goto Lb
        L3f:
            int r0 = r7.A00
            if (r3 != r0) goto Lb
            int r6 = r6 + 1
            r3 = 0
            goto Lb
        L47:
            int r0 = r7.A00
            if (r4 != r0) goto L30
            int r6 = r6 + 1
            r4 = 0
            goto L30
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46040KZj.A00(X.1Pk, java.util.List, int):int");
    }

    public C46040KZj() {
        this(2);
    }
}
