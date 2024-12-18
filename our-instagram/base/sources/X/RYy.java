package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RYy extends TZA<String> implements InterfaceC65683Ts5, RandomAccess {
    public static final InterfaceC65683Ts5 A01;
    public static final RYy A02;
    public final List A00;

    static {
        RYy rYy = new RYy();
        A02 = rYy;
        ((TZA) rYy).A00 = false;
        A01 = rYy;
    }

    public static String A00(Object obj) {
        int i;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC64535TIr) {
            AbstractC64535TIr abstractC64535TIr = (AbstractC64535TIr) obj;
            Charset charset = SVC.A04;
            if (abstractC64535TIr.A00() == 0) {
                return "";
            }
            RZ1 rz1 = (RZ1) abstractC64535TIr;
            byte[] bArr = rz1.A00;
            if (rz1 instanceof RZ0) {
                i = ((RZ0) rz1).A01;
            } else {
                i = 0;
            }
            return AbstractC58318PtA.A0n(charset, bArr, i, rz1.A00());
        }
        return AbstractC58318PtA.A0m(SVC.A04, (byte[]) obj);
    }

    @Override // X.InterfaceC65683Ts5
    public final List CCQ() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.InterfaceC65683Ts5
    public final InterfaceC65683Ts5 CCp() {
        if (super.A00) {
            return new TZB(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A00;
        int i2;
        int i3;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC64535TIr) {
                AbstractC64535TIr abstractC64535TIr = (AbstractC64535TIr) obj;
                Charset charset = SVC.A04;
                if (abstractC64535TIr.A00() == 0) {
                    obj = "";
                } else {
                    RZ1 rz1 = (RZ1) abstractC64535TIr;
                    byte[] bArr = rz1.A00;
                    if (rz1 instanceof RZ0) {
                        i2 = ((RZ0) rz1).A01;
                    } else {
                        i2 = 0;
                    }
                    obj = AbstractC58318PtA.A0n(charset, bArr, i2, rz1.A00());
                }
                RZ1 rz12 = (RZ1) abstractC64535TIr;
                if (rz12 instanceof RZ0) {
                    i3 = ((RZ0) rz12).A01;
                } else {
                    i3 = 0;
                }
                A00 = AbstractC62343S7o.A00.A00(rz12.A00, i3, rz12.A00() + i3);
            } else {
                byte[] bArr2 = (byte[]) obj;
                obj = AbstractC58318PtA.A0m(SVC.A04, bArr2);
                A00 = AbstractC62343S7o.A00.A00(bArr2, 0, bArr2.length);
            }
            if (A00 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    public RYy(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    @Override // X.InterfaceC65692TsE
    public final /* bridge */ /* synthetic */ InterfaceC65692TsE Cq6(int i) {
        if (i >= size()) {
            ArrayList A17 = AbstractC25225BEi.A17(i);
            A17.addAll(this.A00);
            return new RYy(A17);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.TZA, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof InterfaceC65683Ts5) {
            collection = ((InterfaceC65683Ts5) collection).CCQ();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // X.TZA, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    public RYy() {
        this(AbstractC25225BEi.A17(10));
    }

    @Override // X.TZA, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
