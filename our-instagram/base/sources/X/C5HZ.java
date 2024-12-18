package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.5HZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HZ<E> extends AbstractC114895Ha<E> implements C5Hc<E> {
    public static final C5HZ A01 = new C5HZ(new Object[0]);
    public final Object[] A00;

    public final C5Hb A09(Collection collection) {
        C14360o3.A0B(collection, 0);
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + collection.size());
            C14360o3.A07(copyOf);
            int size = size();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new C5HZ(copyOf);
        }
        C58484PwA c58484PwA = new C58484PwA(this, this.A00);
        c58484PwA.addAll(collection);
        return c58484PwA.AEU();
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.length;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC009903n.A02(this.A00, obj);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC009903n.A03(this.A00, obj);
    }

    public C5HZ(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.C5Hb
    public final C5Hb A7Z(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + 1);
            C14360o3.A07(copyOf);
            copyOf[size()] = obj;
            return new C5HZ(copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new C58480Pw6(this.A00, objArr, size() + 1, 0);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        C6C4.A00(i, size());
        return this.A00[i];
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final ListIterator listIterator(int i) {
        C6C4.A01(i, size());
        return new C6C5(this.A00, i, size());
    }
}
