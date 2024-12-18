package X;

import java.util.ListIterator;

/* renamed from: X.Pw6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58480Pw6<E> extends AbstractC114895Ha<E> implements C5Hb<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A03;
    }

    public C58480Pw6(Object[] objArr, Object[] objArr2, int i, int i2) {
        AbstractC167017dG.A1P(objArr, objArr2);
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        throw AbstractC25230BEn.A0n("Trie-based persistent vector should have at least 33 elements, got ", size());
    }

    private final Object[] A00(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = AbstractC58319PtB.A1a(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A00((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    @Override // X.C5Hb
    public final C5Hb A7Z(Object obj) {
        Object[] A00;
        int size = size() - ((size() - 1) & (-32));
        if (size < 32) {
            Object[] A1a = AbstractC58319PtB.A1a(this.A02, 32);
            A1a[size] = obj;
            return new C58480Pw6(this.A01, A1a, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        Object[] objArr2 = this.A01;
        Object[] objArr3 = this.A02;
        int size2 = size() >> 5;
        int i = this.A00;
        if (size2 > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr2;
            i += 5;
            A00 = A00(objArr4, objArr3, i);
        } else {
            A00 = A00(objArr2, objArr3, i);
        }
        return new C58480Pw6(A00, objArr, size() + 1, i);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C6C4.A00(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.A02;
        } else {
            objArr = this.A01;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator(int i) {
        C6C4.A01(i, size());
        return new C58483Pw9(this.A01, this.A02, i, size(), (this.A00 / 5) + 1);
    }
}
