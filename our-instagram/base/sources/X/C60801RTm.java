package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.RTm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60801RTm extends AbstractC58537Px5<String> implements InterfaceC65686Ts8, RandomAccess {

    @Deprecated
    public static final InterfaceC65686Ts8 A01;
    public static final C60801RTm A02;
    public final List A00;

    static {
        C60801RTm c60801RTm = new C60801RTm(false);
        A02 = c60801RTm;
        A01 = c60801RTm;
    }

    public C60801RTm(boolean isMutable) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    public static String A00(Object o) {
        if (o instanceof String) {
            return (String) o;
        }
        if (o instanceof AbstractC58536Px4) {
            AbstractC58536Px4 abstractC58536Px4 = (AbstractC58536Px4) o;
            Charset charset = AbstractC62398S9x.A04;
            if (abstractC58536Px4.A02() == 0) {
                return "";
            }
            C58535Px3 c58535Px3 = (C58535Px3) abstractC58536Px4;
            return AbstractC58318PtA.A0n(charset, c58535Px3.A00, c58535Px3.A05(), c58535Px3.A02());
        }
        return AbstractC58318PtA.A0m(AbstractC62398S9x.A04, (byte[]) o);
    }

    @Override // X.InterfaceC65686Ts8
    public final Object BkU(int index) {
        return this.A00.get(index);
    }

    @Override // X.InterfaceC65686Ts8
    public final List CCQ() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.InterfaceC65686Ts8
    public final InterfaceC65686Ts8 CCn() {
        if (super.A00) {
            return new TZ7(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int index) {
        int A012;
        List list = this.A00;
        Object obj = list.get(index);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC58536Px4) {
                AbstractC58536Px4 abstractC58536Px4 = (AbstractC58536Px4) obj;
                Charset charset = AbstractC62398S9x.A04;
                if (abstractC58536Px4.A02() == 0) {
                    obj = "";
                } else {
                    C58535Px3 c58535Px3 = (C58535Px3) abstractC58536Px4;
                    obj = AbstractC58318PtA.A0n(charset, c58535Px3.A00, c58535Px3.A05(), c58535Px3.A02());
                }
                C58535Px3 c58535Px32 = (C58535Px3) abstractC58536Px4;
                int A05 = c58535Px32.A05();
                A012 = SU4.A00.A01(c58535Px32.A00, A05, c58535Px32.A02() + A05);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = AbstractC58318PtA.A0m(AbstractC62398S9x.A04, bArr);
                A012 = SU4.A00.A01(bArr, 0, bArr.length);
            }
            if (A012 == 0) {
                list.set(index, obj);
            }
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    @Override // X.InterfaceC65686Ts8
    public final void A7f(AbstractC58536Px4 element) {
        A01();
        this.A00.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // X.InterfaceC65690TsC
    public final /* bridge */ /* synthetic */ InterfaceC65690TsC Cq4(int capacity) {
        if (capacity >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(capacity);
            A17.addAll(this.A00);
            return new C60801RTm(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int index, Object element) {
        A01();
        this.A00.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // X.AbstractC58537Px5, java.util.AbstractList, java.util.List
    public final boolean addAll(int index, Collection c) {
        A01();
        if (c instanceof InterfaceC65686Ts8) {
            c = ((InterfaceC65686Ts8) c).CCQ();
        }
        boolean addAll = this.A00.addAll(index, c);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.AbstractC58537Px5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A01();
        this.A00.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int index) {
        A01();
        Object remove = this.A00.remove(index);
        ((AbstractList) this).modCount++;
        return A00(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int index, Object s) {
        A01();
        return A00(this.A00.set(index, s));
    }

    public C60801RTm(ArrayList list) {
        super(true);
        this.A00 = list;
    }

    @Override // X.AbstractC58537Px5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection c) {
        return addAll(size(), c);
    }

    public C60801RTm() {
        this(AbstractC25225BEi.A17(10));
    }
}
