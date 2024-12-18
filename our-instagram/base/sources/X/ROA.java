package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class ROA extends TZ5 implements InterfaceC65685Ts7, RandomAccess {

    @Deprecated
    public static final InterfaceC65685Ts7 A01;
    public static final ROA A02;
    public final List A00;

    static {
        ROA roa = new ROA(false);
        A02 = roa;
        A01 = roa;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC64539TIv) {
            return ((AbstractC64539TIv) obj).A08(AbstractC63328Shc.A03);
        }
        return AbstractC63328Shc.A02((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        String A022;
        boolean A03;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC64539TIv) {
            AbstractC64539TIv abstractC64539TIv = (AbstractC64539TIv) obj;
            A022 = abstractC64539TIv.A08(AbstractC63328Shc.A03);
            A03 = abstractC64539TIv.A0B();
        } else {
            byte[] bArr = (byte[]) obj;
            A022 = AbstractC63328Shc.A02(bArr);
            A03 = AbstractC63353SiA.A03(bArr);
        }
        if (!A03) {
            return A022;
        }
        list.set(i, A022);
        return A022;
    }

    @Override // X.InterfaceC65685Ts7
    public final Object FGK(int i) {
        return this.A00.get(i);
    }

    @Override // X.InterfaceC65685Ts7
    public final List FGW() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ROA(int i) {
        super(true);
        ArrayList A17 = AbstractC25225BEi.A17(i);
        this.A00 = A17;
    }

    @Override // X.InterfaceC65693TsF
    public final /* bridge */ /* synthetic */ InterfaceC65693TsF FG7(int i) {
        if (i >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(i);
            A17.addAll(this.A00);
            return new ROA(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // X.InterfaceC65685Ts7
    public final InterfaceC65685Ts7 FGD() {
        if (FG0()) {
            return new TZ6(this);
        }
        return this;
    }

    @Override // X.InterfaceC65685Ts7
    public final void FGd(AbstractC64539TIv abstractC64539TIv) {
        A03();
        this.A00.add(abstractC64539TIv);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A03();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A03();
        if (collection instanceof InterfaceC65685Ts7) {
            collection = ((InterfaceC65685Ts7) collection).FGW();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A03();
        this.A00.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A03();
        Object remove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        return A00(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A03();
        return A00(this.A00.set(i, obj));
    }

    public ROA(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    @Override // X.TZ5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public ROA(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }

    public ROA() {
        this(10);
    }
}
