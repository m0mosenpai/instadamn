package X;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* loaded from: classes4.dex */
public final class AZU implements C8KW {
    public final List A00 = AbstractC166987dD.A1E();
    public final List A01 = AbstractC166987dD.A1E();
    public final C8KY A02;
    public final C8KU A03;
    public final C22937A9h A04;
    public final C85N A05;

    public static C224179v1 A01(AbstractList abstractList, AbstractList abstractList2, int i) {
        return (C224179v1) abstractList2.get(((Number) abstractList.get(i)).intValue() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [X.9v1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.9v1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.9v1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    @Override // X.C8KW
    public final List AxD(AHC ahc, C8KR c8kr, String str) {
        Object A0K;
        C17u c17u;
        ?? arrayList;
        int i;
        ArrayList A1E = AbstractC166987dD.A1E();
        AA9 A00 = c8kr.A00(str);
        if (A00 != null) {
            List list = A00.A05;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        break;
                    }
                    ((Number) next).longValue();
                    AbstractC166997dE.A1W(A0i, i2);
                    i2 = i3;
                } else {
                    if (A0i.isEmpty()) {
                        c17u = new C17u(0, 0);
                    } else {
                        int size = A0i.size();
                        int A0H = AbstractC166987dD.A0H(AbstractC001800i.A0I(A0i));
                        if (size == 1) {
                            A0K = AbstractC001800i.A0I(A0i);
                        } else {
                            A0K = AbstractC001800i.A0K(A0i);
                        }
                        c17u = new C17u(A0H, AbstractC166987dD.A0H(A0K));
                    }
                    for (EnumC222589rz enumC222589rz : ahc.A03) {
                        List list2 = A00.A04;
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        int i4 = 0;
                        for (Object obj : list2) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                ((Number) obj).floatValue();
                                int i6 = c17u.A00;
                                if (i4 <= c17u.A01 && i6 <= i4) {
                                    A1E2.add(obj);
                                }
                                i4 = i5;
                            }
                        }
                        int ordinal = enumC222589rz.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    ArrayList A002 = AbstractC225299ws.A00(A1E2);
                                    List list3 = A00.A04;
                                    if (A002.isEmpty()) {
                                        ?? obj2 = new Object();
                                        obj2.A02 = 0;
                                        obj2.A00 = 5;
                                        obj2.A01 = 0;
                                        arrayList = AbstractC166987dD.A1J(obj2);
                                    } else {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        ArrayList A1E3 = AbstractC166987dD.A1E();
                                        Iterator it2 = A002.iterator();
                                        int i7 = 0;
                                        while (it2.hasNext()) {
                                            int A0B = AbstractC167007dF.A0B(it2);
                                            Integer valueOf = Integer.valueOf(A0B);
                                            if (!linkedHashSet.contains(valueOf)) {
                                                linkedHashSet.add(valueOf);
                                                float A04 = AbstractC167007dF.A04(list3, A0B);
                                                int max = Math.max(A0B - 1, 0);
                                                while (max >= 0 && !linkedHashSet.contains(Integer.valueOf(max)) && AbstractC167007dF.A04(list3, max) > A04 * 0.85f) {
                                                    linkedHashSet.add(Integer.valueOf(max));
                                                    max--;
                                                }
                                                int min = Math.min(max + 1, A0B);
                                                int min2 = Math.min(A0B + 1, list3.size() - 1);
                                                while (min2 <= list3.size() - 1 && !linkedHashSet.contains(Integer.valueOf(min2)) && AbstractC167007dF.A04(list3, min2) > A04 * 0.85f) {
                                                    linkedHashSet.add(Integer.valueOf(min2));
                                                    min2++;
                                                }
                                                int max2 = Math.max(min2 - 1, A0B);
                                                i7 = (max2 - min) + 1;
                                                ?? obj3 = new Object();
                                                obj3.A02 = min;
                                                obj3.A00 = max2;
                                                obj3.A01 = A0B;
                                                A1E3.add(obj3);
                                            }
                                        }
                                        if (i7 * 1000 <= 3000) {
                                            ArrayList A0i2 = AbstractC167007dF.A0i(A1E3);
                                            Iterator it3 = A1E3.iterator();
                                            while (it3.hasNext()) {
                                                C224179v1 c224179v1 = (C224179v1) it3.next();
                                                AbstractC166997dE.A1R(Integer.valueOf(c224179v1.A02 - 1), c224179v1, A0i2);
                                            }
                                            ArrayList A1E4 = AbstractC166987dD.A1E();
                                            Iterator it4 = A0i2.iterator();
                                            while (true) {
                                                i = 0;
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next2 = it4.next();
                                                if (AbstractC166987dD.A0H(((C09530e4) next2).A00) >= 0) {
                                                    A1E4.add(next2);
                                                }
                                            }
                                            ArrayList A0U = AbstractC001800i.A0U(A1E4);
                                            ArrayList A0i3 = AbstractC167007dF.A0i(A1E3);
                                            Iterator it5 = A1E3.iterator();
                                            while (it5.hasNext()) {
                                                C224179v1 c224179v12 = (C224179v1) it5.next();
                                                AbstractC166997dE.A1R(Integer.valueOf(c224179v12.A00 + 1), c224179v12, A0i3);
                                            }
                                            ArrayList A1E5 = AbstractC166987dD.A1E();
                                            for (Object obj4 : A0i3) {
                                                if (AbstractC166987dD.A0H(((C09530e4) obj4).A00) < list3.size()) {
                                                    A1E5.add(obj4);
                                                }
                                            }
                                            ArrayList A0U2 = AbstractC001800i.A0U(A1E5);
                                            AbstractC001800i.A0g(A0U, new C50585MUv(list3, 1));
                                            AbstractC001800i.A0g(A0U2, new C50585MUv(list3, 2));
                                            int i8 = 0;
                                            while (i < A0U.size() && i8 < A0U2.size() && i7 * 1000 <= 3000) {
                                                if (A00(A0U, i) >= A00(A0U2, i8)) {
                                                    ((C224179v1) ((C09530e4) A0U.get(i)).A01).A02 = A00(A0U, i);
                                                    i++;
                                                } else {
                                                    ((C224179v1) ((C09530e4) A0U2.get(i8)).A01).A00 = A00(A0U2, i8);
                                                    i8++;
                                                }
                                                i7++;
                                            }
                                            while (i < A0U.size() && i7 * 1000 <= 3000) {
                                                ((C224179v1) ((C09530e4) A0U.get(i)).A01).A02 = A00(A0U, i);
                                                i++;
                                                i7++;
                                            }
                                            while (i8 < A0U2.size() && i7 * 1000 <= 3000) {
                                                ((C224179v1) ((C09530e4) A0U2.get(i8)).A01).A02 = A00(A0U2, i8);
                                                i8++;
                                                i7++;
                                            }
                                        }
                                        int size2 = A1E3.size();
                                        ArrayList arrayList2 = new ArrayList(size2);
                                        for (int i9 = 0; i9 < size2; i9++) {
                                            AbstractC166997dE.A1W(arrayList2, -1);
                                        }
                                        int size3 = A1E3.size();
                                        int i10 = 0;
                                        int i11 = 1;
                                        while (i10 < size3) {
                                            arrayList2.set(i10, Integer.valueOf(i11));
                                            int i12 = i10 + 1;
                                            if (i12 < A1E3.size() && ((C224179v1) A1E3.get(i12)).A02 - ((C224179v1) A1E3.get(i10)).A00 > 2) {
                                                i11++;
                                            }
                                            i10 = i12;
                                        }
                                        if (i11 == A1E3.size()) {
                                            arrayList = A1E3;
                                        } else {
                                            arrayList = new ArrayList(i11);
                                            for (int i13 = 0; i13 < i11; i13++) {
                                                int size4 = list3.size() - 1;
                                                int size5 = list3.size() - 1;
                                                ?? obj5 = new Object();
                                                obj5.A02 = size4;
                                                obj5.A00 = 0;
                                                obj5.A01 = size5;
                                                arrayList.add(obj5);
                                            }
                                            int size6 = arrayList2.size();
                                            for (int i14 = 0; i14 < size6; i14++) {
                                                A01(arrayList2, arrayList, i14).A02 = Math.min(A01(arrayList2, arrayList, i14).A02, ((C224179v1) A1E3.get(i14)).A02);
                                                A01(arrayList2, arrayList, i14).A00 = Math.max(A01(arrayList2, arrayList, i14).A00, ((C224179v1) A1E3.get(i14)).A00);
                                                A01(arrayList2, arrayList, i14).A01 = Math.min(A01(arrayList2, arrayList, i14).A01, ((C224179v1) A1E3.get(i14)).A01);
                                            }
                                        }
                                    }
                                    for (C224179v1 c224179v13 : arrayList) {
                                        int i15 = c224179v13.A02;
                                        int i16 = i15 * 1000;
                                        int i17 = c224179v13.A00 - i15;
                                        int i18 = 2500;
                                        if (i17 != 0) {
                                            i18 = i17 * 1000;
                                        }
                                        int i19 = c224179v13.A01;
                                        A1E.add(new C23011ACl(enumC222589rz, str, AbstractC167007dF.A04(A00.A04, i19), i19, i16, i18));
                                    }
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                Iterator it6 = AbstractC225299ws.A00(A1E2).iterator();
                                while (it6.hasNext()) {
                                    int A0B2 = AbstractC167007dF.A0B(it6);
                                    int A0L = (int) AbstractC166987dD.A0L(AbstractC166987dD.A0N(A00.A05.get(A0B2)));
                                    int i20 = ahc.A00;
                                    A1E.add(new C23011ACl(enumC222589rz, str, AbstractC167007dF.A04(A00.A04, A0B2), A0B2, Math.max(0, A0L - (i20 / 2)), i20));
                                }
                            }
                        } else {
                            List A0d = AbstractC001800i.A0d(A1E2, ahc.A01);
                            int size7 = A0d.size();
                            for (int i21 = 0; i21 < size7; i21++) {
                                if (i21 < A00.A05.size()) {
                                    A1E.add(new C23011ACl(enumC222589rz, str, AbstractC167007dF.A04(A0d, i21), i21, (int) AbstractC166987dD.A0L(AbstractC166987dD.A0N(A00.A05.get(i21))), ahc.A00));
                                }
                            }
                        }
                    }
                }
            }
            AbstractC16960so.A1U();
            throw C00O.createAndThrow();
        }
        if (A1E.isEmpty()) {
            return A1E;
        }
        if (A1E.size() > 1) {
            C01T.A1D(A1E, new C9J7(1));
        }
        return AbstractC001800i.A0g(AbstractC001800i.A0U(AbstractC001800i.A0d(A1E, Math.min(1, A1E.size()))), new C9J7(2));
    }

    @Override // X.C8KW
    public final void CzY(long j, int i, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        if (i == 0) {
            this.A00.clear();
            this.A01.clear();
        }
        C8KY c8ky = this.A02;
        c8ky.A01 = new AZP(this, i, j);
        c8ky.A00(bitmap);
    }

    @Override // X.C8KW
    public final void Dz3(C8KR c8kr, String str, boolean z, boolean z2) {
        Tensor tensor;
        List list = this.A00;
        if (AbstractC166987dD.A1b(list)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        return;
                    }
                }
            }
            C22937A9h c22937A9h = this.A04;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0q.add(((C22903A7y) it2.next()).A02);
            }
            c22937A9h.A00 = new C212479bG(A0q);
            c22937A9h.A01 = new AZQ(this, c8kr, str);
            String str2 = c22937A9h.A02;
            float[] fArr = null;
            if (AbstractC167007dF.A1W(str2)) {
                C193208h0 c193208h0 = c22937A9h.A03;
                if (c193208h0 == null) {
                    c193208h0 = AbstractC193188gy.A00(str2);
                    c22937A9h.A03 = c193208h0;
                }
                AbstractC203508z9 abstractC203508z9 = c22937A9h.A00;
                if ((abstractC203508z9 instanceof C212479bG) && c193208h0 != null) {
                    C14360o3.A0C(abstractC203508z9, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputFloatArrays");
                    List list2 = ((C212479bG) abstractC203508z9).A00;
                    C14360o3.A0B(list2, 0);
                    int size = list2.size();
                    int length = ((float[]) list2.get(0)).length;
                    FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(size * length);
                    for (int i = 0; i < size; i++) {
                        for (int i2 = 0; i2 < length; i2++) {
                            allocateFloatBuffer.put((i * length) + i2, ((float[]) list2.get(i))[i2]);
                        }
                    }
                    IValue forward = c193208h0.A00.forward(IValue.from(Tensor.fromBlob(allocateFloatBuffer, new long[]{1, size, length}, EnumC209389Nw.CONTIGUOUS)));
                    if (forward != null && (tensor = forward.toTensor()) != null) {
                        fArr = tensor.getDataAsFloatArray();
                    }
                } else {
                    return;
                }
            }
            InterfaceC203488z7 interfaceC203488z7 = c22937A9h.A01;
            if (interfaceC203488z7 != null) {
                interfaceC203488z7.DaC(fArr);
            }
        }
    }

    @Override // X.C8KW
    public final void D9x() {
        this.A00.clear();
    }

    public AZU(C8KU c8ku, C85N c85n) {
        this.A05 = c85n;
        this.A03 = c8ku;
        this.A02 = new C8KY(c8ku, AbstractC16960so.A1Q(C8KX.A03, C8KX.A02, C8KX.A04));
        this.A04 = new C22937A9h(c85n);
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((Number) ((C09530e4) abstractList.get(i)).A00).intValue();
    }
}
