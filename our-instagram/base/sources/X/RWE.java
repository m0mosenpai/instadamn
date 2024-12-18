package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RWE extends TZ8<String> implements InterfaceC65687Ts9, RandomAccess {
    public static final InterfaceC65687Ts9 A01;
    public static final RWE A02;
    public final List A00;

    static {
        RWE rwe = new RWE();
        A02 = rwe;
        ((TZ8) rwe).A00 = false;
        A01 = rwe;
    }

    @Override // X.InterfaceC65687Ts9
    public final Object BkU(int i) {
        return this.A00.get(i);
    }

    @Override // X.InterfaceC65687Ts9
    public final List CCQ() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.InterfaceC65687Ts9
    public final InterfaceC65687Ts9 CCo() {
        if (super.A00) {
            return new TZ9(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A03;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC64538TIu) {
                AbstractC64538TIu abstractC64538TIu = (AbstractC64538TIu) obj;
                obj = abstractC64538TIu.A04();
                RWI rwi = (RWI) abstractC64538TIu;
                int A06 = rwi.A06();
                A03 = SU7.A00.A03(rwi.A00, A06, rwi.A02() + A06);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = AbstractC58318PtA.A0m(SVB.A04, bArr);
                A03 = SU7.A00.A03(bArr, 0, bArr.length);
            }
            if (A03 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public RWE(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    @Override // X.InterfaceC65687Ts9
    public final void A7g(AbstractC64538TIu abstractC64538TIu) {
        A01();
        this.A00.add(abstractC64538TIu);
        ((AbstractList) this).modCount++;
    }

    @Override // X.InterfaceC65691TsD
    public final /* bridge */ /* synthetic */ InterfaceC65691TsD Cq5(int i) {
        if (i >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(i);
            A17.addAll(this.A00);
            return new RWE(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof InterfaceC65687Ts9) {
            collection = ((InterfaceC65687Ts9) collection).CCQ();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (!(remove instanceof String)) {
            if (remove instanceof AbstractC64538TIu) {
                return ((AbstractC64538TIu) remove).A04();
            }
            return AbstractC58318PtA.A0m(SVB.A04, (byte[]) remove);
        }
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        if (!(obj2 instanceof String)) {
            if (obj2 instanceof AbstractC64538TIu) {
                return ((AbstractC64538TIu) obj2).A04();
            }
            return AbstractC58318PtA.A0m(SVB.A04, (byte[]) obj2);
        }
        return obj2;
    }

    public RWE() {
        this(AbstractC25225BEi.A17(10));
    }

    @Override // X.TZ8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
