package X;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: X.6ML, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ML<E> extends C6MM<E> implements C6MO<E> {
    public static final C6ML A01 = new C6ML(new Object[0]);
    public final Object[] A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.length;
    }

    @Override // X.C6MN
    public final C64937TaD AF0() {
        return new C64937TaD(this, null, this.A00, 0);
    }

    @Override // X.C6MN
    public final C6MN EEr(InterfaceC16660sJ interfaceC16660sJ) {
        Object[] objArr = this.A00;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) interfaceC16660sJ.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr = Arrays.copyOf(objArr, objArr.length);
                    C14360o3.A07(objArr);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        return new C6ML(AbstractC06960Yn.A0a(objArr, 0, size));
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC009903n.A02(this.A00, obj);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC009903n.A03(this.A00, obj);
    }

    public C6ML(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.C6MN
    public final C6MN A7U(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + 1);
            C14360o3.A07(copyOf);
            copyOf[size()] = obj;
            return new C6ML(copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new Q5p(this.A00, objArr, size() + 1, 0);
    }

    @Override // X.C6MN
    public final C6MN A7p(Object obj, int i) {
        AbstractC63038SbD.A01(i, size());
        if (i == size()) {
            return A7U(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[size() + 1];
            Object[] objArr2 = this.A00;
            AbstractC06960Yn.A0W(objArr2, objArr, 0, 0, i);
            AbstractC06960Yn.A0W(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new C6ML(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr3, objArr3.length);
        C14360o3.A07(copyOf);
        System.arraycopy(objArr3, i, copyOf, i + 1, (size() - 1) - i);
        copyOf[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new Q5p(copyOf, objArr4, size() + 1, 0);
    }

    @Override // X.C6MN
    public final C6MN EF1(int i) {
        AbstractC63038SbD.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, size() - 1);
        C14360o3.A07(copyOf);
        AbstractC06960Yn.A0W(objArr, copyOf, i, i + 1, size());
        return new C6ML(copyOf);
    }

    @Override // X.C6MN
    public final C6MN EP2(Object obj, int i) {
        AbstractC63038SbD.A00(i, size());
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C14360o3.A07(copyOf);
        copyOf[i] = obj;
        return new C6ML(copyOf);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        AbstractC63038SbD.A00(i, size());
        return this.A00[i];
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC63038SbD.A01(i, size());
        return new Q5k(this.A00, i, size());
    }
}
