package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RO9 extends TZ5 implements InterfaceC65664Tqu, InterfaceC65263Tgt, RandomAccess {
    public static final RO9 A02 = new RO9(new int[0], 0, false);
    public int A00;
    public int[] A01;

    public static RO9 A00() {
        return A02;
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RO9)) {
            return super.equals(obj);
        }
        RO9 ro9 = (RO9) obj;
        int i = this.A00;
        if (i == ro9.A00) {
            int[] iArr = ro9.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    private final String A01(int i) {
        return AnonymousClass001.A02(i, this.A00, "Index:", ", Size:");
    }

    private final void A02(int i) {
        if (i >= 0 && i < this.A00) {
        } else {
            throw AbstractC58318PtA.A0a(A01(i));
        }
    }

    @Override // X.InterfaceC65693TsF
    /* renamed from: FGQ, reason: merged with bridge method [inline-methods] */
    public final RO9 FG7(int i) {
        if (i >= this.A00) {
            return new RO9(Arrays.copyOf(this.A01, i), this.A00, true);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0H = AbstractC166987dD.A0H(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A0H) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public RO9(int[] iArr, int i, boolean z) {
        super(z);
        this.A01 = iArr;
        this.A00 = i;
    }

    public final int A04(int i) {
        A02(i);
        return this.A01[i];
    }

    @Override // X.InterfaceC65664Tqu
    public final void FGX(int i) {
        A03();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0H = AbstractC166987dD.A0H(obj);
        A03();
        if (i >= 0 && i <= (i2 = this.A00)) {
            int i3 = i + 1;
            int[] iArr = this.A01;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.A01, i, iArr2, i3, this.A00 - i);
                this.A01 = iArr2;
            }
            this.A01[i] = A0H;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a(A01(i));
    }

    @Override // X.TZ5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        A03();
        Charset charset = AbstractC63328Shc.A02;
        collection.getClass();
        if (!(collection instanceof RO9)) {
            return super.addAll(collection);
        }
        RO9 ro9 = (RO9) collection;
        int i = ro9.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.A01;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.A01 = iArr;
            }
            System.arraycopy(ro9.A01, 0, iArr, this.A00, ro9.A00);
            this.A00 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return MSY.A1S(indexOf(obj), -1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        A02(i);
        return Integer.valueOf(this.A01[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A03();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        AbstractC58323PtF.A0z(this.A00, i, iArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        A03();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0H = AbstractC166987dD.A0H(obj);
        A03();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0H;
        return Integer.valueOf(i2);
    }

    public RO9() {
        this(new int[10], 0, true);
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        FGX(AbstractC166987dD.A0H(obj));
        return true;
    }
}
