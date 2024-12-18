package X;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Co3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28833Co3 implements InterfaceC1127857k {
    public final InterfaceC30783DgK A00;

    public static InterfaceC1131659e A00(List list) {
        List list2 = (List) AbstractC001800i.A0O(list, 2);
        if (list2 != null) {
            return (InterfaceC1131659e) AbstractC001800i.A0J(list2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28833Co3) && C14360o3.A0K(this.A00, ((C28833Co3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC1127857k
    public final int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        InterfaceC30783DgK interfaceC30783DgK = this.A00;
        ArrayList A00 = AbstractC28016CWo.A00(interfaceC1131259a);
        C28740CmY c28740CmY = (C28740CmY) interfaceC30783DgK;
        CWV cwv = c28740CmY.A07;
        List list2 = (List) AbstractC001800i.A0O(A00, 1);
        InterfaceC1131659e interfaceC1131659e = null;
        if (list2 != null) {
            interfaceC1131659e = (InterfaceC1131659e) AbstractC001800i.A0J(list2);
        }
        cwv.A00(interfaceC1131659e, A00(A00), AbstractC25231BEo.A0K(i));
        List list3 = (List) AbstractC001800i.A0J(A00);
        if (list3 == null) {
            list3 = C16930sl.A00;
        }
        int EL8 = interfaceC1131259a.EL8(c28740CmY.A01);
        int EL82 = interfaceC1131259a.EL8(c28740CmY.A00);
        int i2 = c28740CmY.A03;
        return AbstractC25225BEi.A06(AbstractC28419CgQ.A00(cwv, list3, c28740CmY.A0A, c28740CmY.A09, i, EL8, EL82, c28740CmY.A02, i2));
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        InterfaceC30783DgK interfaceC30783DgK = this.A00;
        ArrayList A00 = AbstractC28016CWo.A00(interfaceC1131259a);
        C28740CmY c28740CmY = (C28740CmY) interfaceC30783DgK;
        CWV cwv = c28740CmY.A07;
        List list2 = (List) AbstractC001800i.A0O(A00, 1);
        InterfaceC1131659e interfaceC1131659e = null;
        if (list2 != null) {
            interfaceC1131659e = (InterfaceC1131659e) AbstractC001800i.A0J(list2);
        }
        cwv.A00(interfaceC1131659e, A00(A00), C5AU.A04(0, Integer.MAX_VALUE, 0, i));
        List list3 = (List) AbstractC001800i.A0J(A00);
        if (list3 == null) {
            list3 = C16930sl.A00;
        }
        int EL8 = interfaceC1131259a.EL8(c28740CmY.A01);
        InterfaceC16610sE interfaceC16610sE = c28740CmY.A08;
        int i2 = c28740CmY.A02;
        AbstractC119735bX abstractC119735bX = AbstractC28419CgQ.A01;
        int size = list3.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            int A06 = AbstractC25236BEt.A06(list3.get(i3), Integer.valueOf(i3), interfaceC16610sE, i) + EL8;
            int i7 = i3 + 1;
            if (i7 - i5 != i2 && i7 != list3.size()) {
                i6 += A06;
            } else {
                i4 = Math.max(i4, (i6 + A06) - EL8);
                i5 = i3;
                i6 = 0;
            }
            i3 = i7;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0275 A[LOOP:1: B:61:0x0273->B:62:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0287 A[LOOP:2: B:65:0x0285->B:66:0x0287, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0291 A[LOOP:3: B:69:0x028f->B:70:0x0291, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029d A[LOOP:4: B:73:0x029b->B:74:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dc  */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0w4, X.01I] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0w4, X.01I] */
    @Override // X.InterfaceC1127857k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpD(X.C59Z r55, java.util.List r56, long r57) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28833Co3.CpD(X.59Z, java.util.List, long):X.5ac");
    }

    @Override // X.InterfaceC1127857k
    public final int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        InterfaceC30783DgK interfaceC30783DgK = this.A00;
        ArrayList A00 = AbstractC28016CWo.A00(interfaceC1131259a);
        C28740CmY c28740CmY = (C28740CmY) interfaceC30783DgK;
        CWV cwv = c28740CmY.A07;
        List list2 = (List) AbstractC001800i.A0O(A00, 1);
        InterfaceC1131659e interfaceC1131659e = null;
        if (list2 != null) {
            interfaceC1131659e = (InterfaceC1131659e) AbstractC001800i.A0J(list2);
        }
        cwv.A00(interfaceC1131659e, A00(A00), AbstractC25231BEo.A0K(i));
        List list3 = (List) AbstractC001800i.A0J(A00);
        if (list3 == null) {
            list3 = C16930sl.A00;
        }
        int EL8 = interfaceC1131259a.EL8(c28740CmY.A01);
        int EL82 = interfaceC1131259a.EL8(c28740CmY.A00);
        int i2 = c28740CmY.A03;
        return AbstractC25225BEi.A06(AbstractC28419CgQ.A00(cwv, list3, c28740CmY.A0A, c28740CmY.A09, i, EL8, EL82, c28740CmY.A02, i2));
    }

    @Override // X.InterfaceC1127857k
    public final int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        InterfaceC30783DgK interfaceC30783DgK = this.A00;
        ArrayList A00 = AbstractC28016CWo.A00(interfaceC1131259a);
        C28740CmY c28740CmY = (C28740CmY) interfaceC30783DgK;
        CWV cwv = c28740CmY.A07;
        List list2 = (List) AbstractC001800i.A0O(A00, 1);
        InterfaceC1131659e interfaceC1131659e = null;
        if (list2 != null) {
            interfaceC1131659e = (InterfaceC1131659e) AbstractC001800i.A0J(list2);
        }
        cwv.A00(interfaceC1131659e, A00(A00), C5AU.A04(0, Integer.MAX_VALUE, 0, i));
        List list3 = (List) AbstractC001800i.A0J(A00);
        if (list3 == null) {
            list3 = C16930sl.A00;
        }
        int EL8 = interfaceC1131259a.EL8(c28740CmY.A01);
        int EL82 = interfaceC1131259a.EL8(c28740CmY.A00);
        int i2 = c28740CmY.A03;
        int i3 = c28740CmY.A02;
        InterfaceC16610sE interfaceC16610sE = c28740CmY.A0A;
        InterfaceC16610sE interfaceC16610sE2 = c28740CmY.A09;
        AbstractC119735bX abstractC119735bX = AbstractC28419CgQ.A01;
        if (list3.isEmpty()) {
            return 0;
        }
        int size = list3.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list3.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Object obj = list3.get(i6);
            Integer valueOf = Integer.valueOf(i6);
            int A06 = AbstractC25236BEt.A06(obj, valueOf, interfaceC16610sE, i);
            iArr[i6] = A06;
            iArr2[i6] = AbstractC25236BEt.A06(obj, valueOf, interfaceC16610sE2, A06);
        }
        int i7 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            i7 = i3 * i2;
        }
        list3.size();
        list3.size();
        int min = Math.min(i7, list3.size());
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += iArr[i9];
        }
        int size4 = i8 + ((list3.size() - 1) * EL8);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr2[0];
        C58612mK it = new C17u(1, size2 - 1).iterator();
        while (it.hasNext()) {
            int i11 = iArr2[it.A00()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i12 = iArr[0];
        C58612mK it2 = new C17u(1, size - 1).iterator();
        while (it2.hasNext()) {
            int i13 = iArr[it2.A00()];
            if (i12 < i13) {
                i12 = i13;
            }
        }
        int i14 = size4;
        while (i12 <= i14 && i10 != i) {
            size4 = (i12 + i14) / 2;
            long A002 = AbstractC28419CgQ.A00(cwv, list3, C30712DfA.A00(iArr, 4), C30712DfA.A00(iArr2, 5), size4, EL8, EL82, i3, i2);
            i10 = AbstractC25225BEi.A06(A002);
            int A02 = AbstractC25228BEl.A02(A002);
            if (i10 <= i && A02 >= min) {
                if (i10 >= i) {
                    return size4;
                }
                i14 = size4 - 1;
            } else {
                i12 = size4 + 1;
                if (i12 > i14) {
                    return i12;
                }
            }
        }
        return size4;
    }

    public C28833Co3(InterfaceC30783DgK interfaceC30783DgK) {
        this.A00 = interfaceC30783DgK;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MultiContentMeasurePolicyImpl(measurePolicy=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
