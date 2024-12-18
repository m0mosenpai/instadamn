package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.MhX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51077MhX extends AbstractC53418Nk7 implements Iterable, InterfaceC15590qF {
    public static final C51077MhX A05 = new C51077MhX(null, null, C16930sl.A00, 0, 0);
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51077MhX) {
                C51077MhX c51077MhX = (C51077MhX) obj;
                if (!C14360o3.A0K(this.A04, c51077MhX.A04) || !C14360o3.A0K(this.A03, c51077MhX.A03) || !C14360o3.A0K(this.A02, c51077MhX.A02) || this.A01 != c51077MhX.A01 || this.A00 != c51077MhX.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A01) * 31) + this.A00;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A04.listIterator();
    }

    public C51077MhX(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw AbstractC166987dD.A12("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw AbstractC166987dD.A12("itemsAfter cannot be negative");
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadResult.Page(\n                    |   data size: ");
        List list = this.A04;
        A1C.append(list.size());
        A1C.append("\n                    |   first Item: ");
        A1C.append(AbstractC001800i.A0J(list));
        A1C.append("\n                    |   last Item: ");
        A1C.append(AbstractC001800i.A0L(list));
        A1C.append("\n                    |   nextKey: ");
        A1C.append(this.A02);
        A1C.append("\n                    |   prevKey: ");
        A1C.append(this.A03);
        A1C.append("\n                    |   itemsBefore: ");
        A1C.append(this.A01);
        A1C.append("\n                    |   itemsAfter: ");
        A1C.append(this.A00);
        return AbstractC16490ru.A0q(AbstractC166997dE.A0x("\n                    |) ", A1C), "|");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51077MhX(Object obj, List list) {
        this(null, obj, list, Integer.MIN_VALUE, Integer.MIN_VALUE);
        C14360o3.A0B(list, 1);
    }
}
