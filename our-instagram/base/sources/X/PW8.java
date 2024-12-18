package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class PW8<T> extends AbstractList<T> implements InterfaceC57787PkE<Object>, InterfaceC58162PqR<T> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final List A06;

    @Override // X.InterfaceC58162PqR
    public final Object B8p(int i) {
        List list = this.A06;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C51077MhX) list.get(i2)).A04.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C51077MhX) list.get(i2)).A04.get(i);
    }

    @Override // X.InterfaceC58162PqR
    public final int Bdc() {
        return this.A01;
    }

    @Override // X.InterfaceC58162PqR
    public final int Bdd() {
        return this.A02;
    }

    @Override // X.InterfaceC58162PqR
    public final int C0r() {
        return this.A04;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = i - this.A02;
        if (i >= 0 && i < size()) {
            if (i2 >= 0 && i2 < this.A04) {
                return B8p(i2);
            }
            return null;
        }
        throw AbstractC25229BEm.A0l("Index: ", ", Size: ", i, size());
    }

    @Override // X.InterfaceC58162PqR
    public final int getSize() {
        return this.A02 + this.A04 + this.A01;
    }

    public PW8(PW8 pw8) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A06 = A1E;
        this.A05 = true;
        A1E.addAll(pw8.A06);
        this.A02 = pw8.A02;
        this.A01 = pw8.A01;
        this.A03 = pw8.A03;
        this.A05 = pw8.A05;
        this.A04 = pw8.A04;
        this.A00 = pw8.A00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("leading ");
        A1C.append(this.A02);
        A1C.append(", storage ");
        A1C.append(this.A04);
        A1C.append(", trailing ");
        A1C.append(this.A01);
        A1C.append(' ');
        return AbstractC166997dE.A0x(AbstractC31175DnJ.A0a(" ", this.A06), A1C);
    }

    public PW8() {
        this.A06 = AbstractC166987dD.A1E();
        this.A05 = true;
    }
}
