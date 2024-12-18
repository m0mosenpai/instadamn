package X;

import java.util.Iterator;

/* renamed from: X.44p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC911344p extends AbstractC911444q implements Iterable {
    public int A02() {
        return A03(0);
    }

    public int A03(int i) {
        return 0;
    }

    public abstract AbstractC911344p A04(String str);

    public abstract AbstractC911344p A05(String str);

    public String A06() {
        return null;
    }

    public abstract String A07();

    public boolean A0A() {
        return false;
    }

    public boolean A0B() {
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public Iterator A08() {
        return C914045z.A00;
    }

    public Iterator A09() {
        return C914045z.A00;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return A08();
    }
}
