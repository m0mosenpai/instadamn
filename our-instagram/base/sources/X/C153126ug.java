package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153126ug implements Iterable, InterfaceC15590qF {
    public final int A00;
    public final List A01;
    public final int A02;

    public C153126ug(List list, int i, int i2) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                C153126ug c153126ug = (C153126ug) obj;
                int i = this.A00;
                if (i == c153126ug.A00 && A00() == c153126ug.A00()) {
                    Iterable c17u = new C17u(i, A00());
                    if (!(c17u instanceof Collection) || !((Collection) c17u).isEmpty()) {
                        Iterator it = c17u.iterator();
                        while (it.hasNext()) {
                            int A00 = ((AbstractC16880sg) it).A00();
                            if (!C14360o3.A0K(this.A01.get(A00), c153126ug.A01.get(A00))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        return Math.min(this.A00 + this.A02, this.A01.size()) - 1;
    }

    public final Object A02(int i) {
        return this.A01.get(this.A00 + i);
    }

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        int A00 = A00();
        int i3 = 1;
        if (i2 <= A00) {
            while (true) {
                Object obj = this.A01.get(i2);
                int i4 = i3 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i3 = i4 + i;
                if (i2 == A00) {
                    break;
                }
                i2++;
            }
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A01.subList(this.A00, A00() + 1).iterator();
    }

    public final int A01() {
        int A00 = (A00() - this.A00) + 1;
        int size = this.A01.size();
        if (A00 > size) {
            A00 = size;
        }
        if (A00 < 0) {
            return 0;
        }
        return A00;
    }
}
