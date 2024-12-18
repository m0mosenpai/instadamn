package X;

import java.util.Arrays;

/* renamed from: X.01a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C003501a implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ long[] A02;
    public /* synthetic */ Object[] A03;

    public final long A02(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A00)) {
            if (this.A01) {
                long[] jArr = this.A02;
                Object[] objArr = this.A03;
                int i3 = 0;
                int i4 = 0;
                do {
                    Object obj = objArr[i3];
                    if (obj != AbstractC003601b.A00) {
                        if (i3 != i4) {
                            jArr[i4] = jArr[i3];
                            objArr[i4] = obj;
                            objArr[i3] = null;
                        }
                        i4++;
                    }
                    i3++;
                } while (i3 < i2);
                this.A01 = false;
                this.A00 = i4;
            }
            return this.A02[i];
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public final Object A04(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A00)) {
            if (this.A01) {
                long[] jArr = this.A02;
                Object[] objArr = this.A03;
                int i3 = 0;
                int i4 = 0;
                do {
                    Object obj = objArr[i3];
                    if (obj != AbstractC003601b.A00) {
                        if (i3 != i4) {
                            jArr[i4] = jArr[i3];
                            objArr[i4] = obj;
                            objArr[i3] = null;
                        }
                        i4++;
                    }
                    i3++;
                } while (i3 < i2);
                this.A01 = false;
                this.A00 = i4;
            }
            return this.A03[i];
        }
        AbstractC005601v.A00(AnonymousClass001.A0O("Expected index to be within 0..size()-1, but was ", i));
        throw C00O.createAndThrow();
    }

    public final int A00() {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC003601b.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return this.A00;
    }

    public final int A01(long j) {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC003601b.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return AbstractC005301s.A01(this.A02, this.A00, j);
    }

    public final Object A05(long j) {
        Object obj;
        int A01 = AbstractC005301s.A01(this.A02, this.A00, j);
        if (A01 < 0 || (obj = this.A03[A01]) == AbstractC003601b.A00) {
            return null;
        }
        return obj;
    }

    public final Object A06(long j, Object obj) {
        Object obj2;
        int A01 = AbstractC005301s.A01(this.A02, this.A00, j);
        if (A01 >= 0 && (obj2 = this.A03[A01]) != AbstractC003601b.A00) {
            return obj2;
        }
        return obj;
    }

    public final void A07() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A08(long j) {
        int A01 = AbstractC005301s.A01(this.A02, this.A00, j);
        if (A01 >= 0) {
            Object[] objArr = this.A03;
            Object obj = objArr[A01];
            Object obj2 = AbstractC003601b.A00;
            if (obj != obj2) {
                objArr[A01] = obj2;
                this.A01 = true;
            }
        }
    }

    public final void A09(long j, Object obj) {
        int i;
        int A01 = AbstractC005301s.A01(this.A02, this.A00, j);
        if (A01 < 0) {
            A01 ^= -1;
            int i2 = this.A00;
            if (A01 < i2 && this.A03[A01] == AbstractC003601b.A00) {
                this.A02[A01] = j;
            } else {
                if (this.A01) {
                    long[] jArr = this.A02;
                    if (i2 >= jArr.length) {
                        Object[] objArr = this.A03;
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            Object obj2 = objArr[i4];
                            if (obj2 != AbstractC003601b.A00) {
                                if (i4 != i3) {
                                    jArr[i3] = jArr[i4];
                                    objArr[i3] = obj2;
                                    objArr[i4] = null;
                                }
                                i3++;
                            }
                        }
                        this.A01 = false;
                        this.A00 = i3;
                        A01 = AbstractC005301s.A01(jArr, i3, j) ^ (-1);
                    }
                }
                int i5 = this.A00;
                long[] jArr2 = this.A02;
                if (i5 >= jArr2.length) {
                    int i6 = (i5 + 1) * 8;
                    int i7 = 4;
                    while (true) {
                        i = (1 << i7) - 12;
                        if (i6 <= i) {
                            break;
                        }
                        i7++;
                        if (i7 >= 32) {
                            i = i6;
                            break;
                        }
                    }
                    int i8 = i / 8;
                    long[] copyOf = Arrays.copyOf(jArr2, i8);
                    C14360o3.A07(copyOf);
                    this.A02 = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.A03, i8);
                    C14360o3.A07(copyOf2);
                    this.A03 = copyOf2;
                }
                int i9 = this.A00;
                if (i9 - A01 != 0) {
                    long[] jArr3 = this.A02;
                    int i10 = A01 + 1;
                    C14360o3.A0B(jArr3, 0);
                    System.arraycopy(jArr3, A01, jArr3, i10, i9 - A01);
                    Object[] objArr2 = this.A03;
                    AbstractC06960Yn.A0W(objArr2, objArr2, i10, A01, this.A00);
                }
                this.A02[A01] = j;
                this.A03[A01] = obj;
                this.A00++;
                return;
            }
        }
        this.A03[A01] = obj;
    }

    public C003501a(int i) {
        int i2;
        Object[] objArr;
        if (i == 0) {
            this.A02 = AbstractC005301s.A01;
            objArr = AbstractC005301s.A02;
        } else {
            int i3 = i * 8;
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
            int i5 = i2 / 8;
            this.A02 = new long[i5];
            objArr = new Object[i5];
        }
        this.A03 = objArr;
    }

    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C003501a clone() {
        Object clone = super.clone();
        C14360o3.A0C(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C003501a c003501a = (C003501a) clone;
        c003501a.A02 = (long[]) this.A02.clone();
        c003501a.A03 = (Object[]) this.A03.clone();
        return c003501a;
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
            sb.append(A02(i2));
            sb.append('=');
            Object A04 = A04(i2);
            if (A04 != sb) {
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

    public C003501a() {
        this(10);
    }
}
