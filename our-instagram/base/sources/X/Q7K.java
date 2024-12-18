package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class Q7K extends TZ1<String> implements InterfaceC65684Ts6, RandomAccess {
    public static final InterfaceC65684Ts6 A01;
    public static final Q7K A02;
    public final List A00;

    static {
        Q7K q7k = new Q7K();
        A02 = q7k;
        ((TZ1) q7k).A00 = false;
        A01 = q7k;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC58387PuR) {
            AbstractC58387PuR abstractC58387PuR = (AbstractC58387PuR) obj;
            Charset charset = AbstractC58376PuG.A03;
            if (abstractC58387PuR.A01() == 0) {
                return "";
            }
            C58386PuQ c58386PuQ = (C58386PuQ) abstractC58387PuR;
            return AbstractC58318PtA.A0n(charset, c58386PuQ.A00, c58386PuQ.A02(), c58386PuQ.A01());
        }
        return AbstractC58318PtA.A0m(AbstractC58376PuG.A03, (byte[]) obj);
    }

    @Override // X.InterfaceC65684Ts6
    public final Object BkU(int i) {
        return this.A00.get(i);
    }

    @Override // X.InterfaceC65684Ts6
    public final List CCQ() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.InterfaceC65684Ts6
    public final InterfaceC65684Ts6 CCm() {
        if (super.A00) {
            return new TZ2(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC58387PuR) {
                AbstractC58387PuR abstractC58387PuR = (AbstractC58387PuR) obj;
                Charset charset = AbstractC58376PuG.A03;
                if (abstractC58387PuR.A01() == 0) {
                    obj = "";
                } else {
                    C58386PuQ c58386PuQ = (C58386PuQ) abstractC58387PuR;
                    obj = AbstractC58318PtA.A0n(charset, c58386PuQ.A00, c58386PuQ.A02(), c58386PuQ.A01());
                }
                C58386PuQ c58386PuQ2 = (C58386PuQ) abstractC58387PuR;
                int A022 = c58386PuQ2.A02();
                A012 = AbstractC58407Pul.A00.A01(c58386PuQ2.A00, A022, c58386PuQ2.A01() + A022);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = AbstractC58318PtA.A0m(AbstractC58376PuG.A03, bArr);
                A012 = AbstractC58407Pul.A00.A01(bArr, 0, bArr.length);
            }
            if (A012 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public Q7K(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    @Override // X.InterfaceC65684Ts6
    public final void A7d(AbstractC58387PuR abstractC58387PuR) {
        A01();
        this.A00.add(abstractC58387PuR);
        ((AbstractList) this).modCount++;
    }

    @Override // X.InterfaceC65688TsA
    public final /* bridge */ /* synthetic */ InterfaceC65688TsA Cq3(int i) {
        if (i >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(i);
            A17.addAll(this.A00);
            return new Q7K(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.TZ1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof InterfaceC65684Ts6) {
            collection = ((InterfaceC65684Ts6) collection).CCQ();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.TZ1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A01();
        this.A00.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        return A00(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public Q7K() {
        this(AbstractC25225BEi.A17(10));
    }

    @Override // X.TZ1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
