package X;

import java.util.Arrays;

/* renamed from: X.01q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005101q implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ int[] A02;
    public /* synthetic */ Object[] A03;

    public final int A00() {
        if (this.A01) {
            AbstractC005201r.A01(this);
        }
        return this.A00;
    }

    public final int A01(int i) {
        if (this.A01) {
            AbstractC005201r.A01(this);
        }
        return this.A02[i];
    }

    public final int A02(Object obj) {
        if (this.A01) {
            AbstractC005201r.A01(this);
        }
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A03[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public final Object A04(int i) {
        if (this.A01) {
            AbstractC005201r.A01(this);
        }
        return this.A03[i];
    }

    public final void A05() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A06(int i) {
        int A00 = AbstractC005301s.A00(this.A02, this.A00, i);
        if (A00 >= 0) {
            Object[] objArr = this.A03;
            Object obj = objArr[A00];
            Object obj2 = AbstractC005201r.A00;
            if (obj != obj2) {
                objArr[A00] = obj2;
                this.A01 = true;
            }
        }
    }

    public final void A07(int i, Object obj) {
        int i2;
        int A00 = AbstractC005301s.A00(this.A02, this.A00, i);
        if (A00 < 0) {
            A00 ^= -1;
            int i3 = this.A00;
            if (A00 < i3 && this.A03[A00] == AbstractC005201r.A00) {
                this.A02[A00] = i;
            } else {
                if (this.A01) {
                    int[] iArr = this.A02;
                    if (i3 >= iArr.length) {
                        AbstractC005201r.A01(this);
                        A00 = AbstractC005301s.A00(iArr, this.A00, i) ^ (-1);
                    }
                }
                int i4 = this.A00;
                int[] iArr2 = this.A02;
                if (i4 >= iArr2.length) {
                    int i5 = (i4 + 1) * 4;
                    int i6 = 4;
                    while (true) {
                        i2 = (1 << i6) - 12;
                        if (i5 <= i2) {
                            break;
                        }
                        i6++;
                        if (i6 >= 32) {
                            i2 = i5;
                            break;
                        }
                    }
                    int i7 = i2 / 4;
                    int[] copyOf = Arrays.copyOf(iArr2, i7);
                    C14360o3.A07(copyOf);
                    this.A02 = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.A03, i7);
                    C14360o3.A07(copyOf2);
                    this.A03 = copyOf2;
                }
                int i8 = this.A00;
                if (i8 - A00 != 0) {
                    int[] iArr3 = this.A02;
                    int i9 = A00 + 1;
                    AbstractC06960Yn.A0U(iArr3, iArr3, i9, A00, i8);
                    Object[] objArr = this.A03;
                    AbstractC06960Yn.A0W(objArr, objArr, i9, A00, this.A00);
                }
                this.A02[A00] = i;
                this.A03[A00] = obj;
                this.A00++;
                return;
            }
        }
        this.A03[A00] = obj;
    }

    public C005101q(int i) {
        int i2;
        int i3 = i * 4;
        int i4 = 4;
        while (true) {
            i2 = (1 << i4) - 12;
            if (i3 <= i2) {
                break;
            }
            i4++;
            if (i4 >= 32) {
                i2 = i3;
                break;
            }
        }
        int i5 = i2 / 4;
        this.A02 = new int[i5];
        this.A03 = new Object[i5];
    }

    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C005101q clone() {
        Object clone = super.clone();
        C14360o3.A0C(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C005101q c005101q = (C005101q) clone;
        c005101q.A02 = (int[]) this.A02.clone();
        c005101q.A03 = (Object[]) this.A03.clone();
        return c005101q;
    }

    public final String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(A01(i2));
            sb.append('=');
            Object A04 = A04(i2);
            if (A04 != this) {
                sb.append(A04);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C005101q() {
        this(10);
    }
}
