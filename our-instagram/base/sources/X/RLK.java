package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RLK extends TZ3 implements InterfaceC65682Ts4, RandomAccess {

    @Deprecated
    public static final InterfaceC65682Ts4 A01;
    public static final RLK A02;
    public final List A00;

    static {
        RLK rlk = new RLK(false);
        A02 = rlk;
        A01 = rlk;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC64536TIs) {
            AbstractC64536TIs abstractC64536TIs = (AbstractC64536TIs) obj;
            Charset charset = AbstractC62394S9t.A03;
            if (abstractC64536TIs.A01() == 0) {
                return "";
            }
            RLN rln = (RLN) abstractC64536TIs;
            return AbstractC58318PtA.A0n(charset, rln.A00, 0, rln.A01());
        }
        return AbstractC58318PtA.A0m(AbstractC62394S9t.A03, (byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        String A0m;
        boolean A00;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC64536TIs) {
            AbstractC64536TIs abstractC64536TIs = (AbstractC64536TIs) obj;
            Charset charset = AbstractC62394S9t.A03;
            if (abstractC64536TIs.A01() == 0) {
                A0m = "";
            } else {
                RLN rln = (RLN) abstractC64536TIs;
                A0m = AbstractC58318PtA.A0n(charset, rln.A00, 0, rln.A01());
            }
            RLN rln2 = (RLN) abstractC64536TIs;
            int A012 = rln2.A01();
            A00 = S7D.A00.A00(rln2.A00, 0, A012);
        } else {
            byte[] bArr = (byte[]) obj;
            A0m = AbstractC58318PtA.A0m(AbstractC62394S9t.A03, bArr);
            A00 = S7D.A00.A00(bArr, 0, bArr.length);
        }
        if (!A00) {
            return A0m;
        }
        list.set(i, A0m);
        return A0m;
    }

    @Override // X.InterfaceC65682Ts4
    public final InterfaceC65682Ts4 FGB() {
        if (super.A00) {
            return new TZ4(this);
        }
        return this;
    }

    @Override // X.InterfaceC65682Ts4
    public final List FGR() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLK(int i) {
        super(true);
        ArrayList A17 = AbstractC25225BEi.A17(i);
        this.A00 = A17;
    }

    @Override // X.InterfaceC65689TsB
    public final /* bridge */ /* synthetic */ InterfaceC65689TsB FG6(int i) {
        if (i >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(i);
            A17.addAll(this.A00);
            return new RLK(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.TZ3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof InterfaceC65682Ts4) {
            collection = ((InterfaceC65682Ts4) collection).FGR();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.TZ3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    public RLK(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    @Override // X.TZ3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public RLK(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }

    public RLK() {
        this(10);
    }
}
