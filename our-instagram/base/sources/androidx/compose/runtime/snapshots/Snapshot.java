package androidx.compose.runtime.snapshots;

import X.AbstractC001800i;
import X.AbstractC004901o;
import X.AbstractC06960Yn;
import X.AbstractC75003Yq;
import X.AbstractC75013Yr;
import X.C00O;
import X.C18570vk;
import X.C206929Dx;
import X.C3Z0;
import X.C3Z1;
import X.C3Z3;
import X.C3Z4;
import X.C5TV;
import X.C75063Yw;
import X.C75073Yx;
import X.InterfaceC16660sJ;
import X.InterfaceC74933Yj;
import X.Q5y;
import X.SQP;
import X.ST4;

/* loaded from: classes2.dex */
public abstract class Snapshot {
    public int A00;
    public int A01;
    public boolean A02;
    public C75063Yw A03;

    public void A0H() {
        this.A02 = true;
        synchronized (AbstractC75013Yr.A07) {
            int i = this.A01;
            if (i >= 0) {
                AbstractC75013Yr.A0F(i);
                this.A01 = -1;
            }
        }
    }

    public final int A01() {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                return C3Z3.A00((C3Z3) c3z1).A01();
            }
            return c3z1.A01;
        }
        return 0;
    }

    public Snapshot A02(InterfaceC16660sJ interfaceC16660sJ) {
        Q5y q5y;
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z0) {
                C206929Dx c206929Dx = new C206929Dx(interfaceC16660sJ, 39);
                int i = AbstractC75013Yr.A00;
                return (Snapshot) AbstractC75013Yr.A0A(new C206929Dx(c206929Dx, 40));
            }
            if (c3z1 instanceof C3Z3) {
                C3Z3 c3z3 = (C3Z3) c3z1;
                InterfaceC16660sJ A0C = AbstractC75013Yr.A0C(interfaceC16660sJ, c3z3.A00, true);
                boolean z = c3z3.A03;
                C3Z1 A00 = C3Z3.A00(c3z3);
                if (!z) {
                    return AbstractC75013Yr.A01(A00.A02(null), A0C, true);
                }
                return A00.A02(A0C);
            }
            if (!(!((Snapshot) c3z1).A02)) {
                SQP.A00("Cannot use a disposed snapshot");
            } else if (c3z1.A03 && ((Snapshot) c3z1).A01 < 0) {
                SQP.A01("Unsupported operation on a disposed or applied snapshot");
            } else {
                int A0F = c3z1.A0F();
                c3z1.A0N(c3z1.A0F());
                Object obj = AbstractC75013Yr.A07;
                synchronized (obj) {
                    int i2 = AbstractC75013Yr.A00;
                    AbstractC75013Yr.A00 = i2 + 1;
                    AbstractC75013Yr.A01 = AbstractC75013Yr.A01.A01(i2);
                    C75063Yw A0G = c3z1.A0G();
                    for (int i3 = A0F + 1; i3 < i2; i3++) {
                        A0G = A0G.A01(i3);
                    }
                    q5y = new Q5y(c3z1, A0G, AbstractC75013Yr.A0C(interfaceC16660sJ, c3z1.A07, true), i2);
                }
                if (c3z1.A03 || ((Snapshot) c3z1).A02) {
                    return q5y;
                }
                int A0F2 = c3z1.A0F();
                synchronized (obj) {
                    int i4 = AbstractC75013Yr.A00;
                    AbstractC75013Yr.A00 = i4 + 1;
                    ((Snapshot) c3z1).A00 = i4;
                    AbstractC75013Yr.A01 = AbstractC75013Yr.A01.A01(c3z1.A0F());
                }
                C75063Yw A0G2 = c3z1.A0G();
                int A0F3 = c3z1.A0F();
                for (int i5 = A0F2 + 1; i5 < A0F3; i5++) {
                    A0G2 = A0G2.A01(i5);
                }
                c3z1.A0C(A0G2);
                return q5y;
            }
            throw C00O.createAndThrow();
        }
        C3Z4 c3z4 = (C3Z4) this;
        InterfaceC16660sJ A0C2 = AbstractC75013Yr.A0C(interfaceC16660sJ, c3z4.A00, true);
        Snapshot snapshot = c3z4.A02;
        if (snapshot == null) {
            snapshot = (Snapshot) AbstractC75013Yr.A08.get();
        }
        return AbstractC75013Yr.A01(snapshot.A02(null), A0C2, true);
    }

    public InterfaceC16660sJ A03() {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                return ((C3Z3) c3z1).A00;
            }
            return c3z1.A07;
        }
        return ((C3Z4) this).A00;
    }

    public InterfaceC16660sJ A04() {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                return ((C3Z3) c3z1).A01;
            }
            return c3z1.A08;
        }
        return null;
    }

    public final void A05() {
        C75063Yw A00;
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            A00 = AbstractC75013Yr.A01.A00(c3z1.A0F()).A02(c3z1.A02);
        } else {
            A00 = AbstractC75013Yr.A01.A00(A0F());
        }
        AbstractC75013Yr.A01 = A00;
    }

    public void A06() {
        Snapshot snapshot;
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z0) {
                AbstractC75013Yr.A0A(C5TV.A00);
                return;
            } else if (c3z1 instanceof C3Z3) {
                snapshot = C3Z3.A00((C3Z3) c3z1);
            } else {
                if (c3z1.A03 || ((Snapshot) c3z1).A02) {
                    return;
                }
                c3z1.A0M();
                return;
            }
        } else {
            snapshot = ((C3Z4) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AbstractC75013Yr.A08.get();
            }
        }
        snapshot.A06();
    }

    public void A07() {
        int i = this.A01;
        if (i >= 0) {
            AbstractC75013Yr.A0F(i);
            this.A01 = -1;
        }
    }

    public final void A08() {
        synchronized (AbstractC75013Yr.A07) {
            A05();
            A07();
        }
    }

    public final void A09(int i) {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                C3Z3.A00((C3Z3) c3z1).A09(i);
                return;
            } else {
                c3z1.A01 = i;
                return;
            }
        }
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public void A0A(Snapshot snapshot) {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (!(c3z1 instanceof C3Z3) && !(c3z1 instanceof C3Z0)) {
                c3z1.A00++;
                return;
            }
        }
        ST4.A00();
        throw C00O.createAndThrow();
    }

    public void A0B(Snapshot snapshot) {
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (!(c3z1 instanceof C3Z3) && !(c3z1 instanceof C3Z0)) {
                int i = c3z1.A00;
                if (i > 0) {
                    int i2 = i - 1;
                    c3z1.A00 = i2;
                    if (i2 == 0 && !c3z1.A03) {
                        C18570vk A0I = c3z1.A0I();
                        if (A0I != null) {
                            if (!(!c3z1.A03)) {
                                SQP.A01("Unsupported operation on a snapshot that has been applied");
                            } else {
                                c3z1.A0O(null);
                                int A0F = c3z1.A0F();
                                Object[] objArr = A0I.A03;
                                long[] jArr = A0I.A02;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((255 & j) < 128) {
                                                    for (AbstractC75003Yq B6j = ((InterfaceC74933Yj) objArr[(i3 << 3) + i5]).B6j(); B6j != null; B6j = B6j.A01) {
                                                        int i6 = B6j.A00;
                                                        if (i6 == A0F || AbstractC001800i.A0u(c3z1.A02, Integer.valueOf(i6))) {
                                                            B6j.A00 = 0;
                                                        }
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                        }
                        c3z1.A08();
                        return;
                    }
                    return;
                }
                SQP.A00("no pending nested snapshots");
                throw C00O.createAndThrow();
            }
        }
        ST4.A00();
        throw C00O.createAndThrow();
    }

    public final void A0C(C75063Yw c75063Yw) {
        if (this instanceof C3Z3) {
            ST4.A00();
            throw C00O.createAndThrow();
        }
        this.A03 = c75063Yw;
    }

    public void A0D(InterfaceC74933Yj interfaceC74933Yj) {
        Snapshot snapshot;
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                snapshot = C3Z3.A00((C3Z3) c3z1);
            } else {
                C18570vk A0I = c3z1.A0I();
                if (A0I == null) {
                    C18570vk c18570vk = AbstractC004901o.A00;
                    A0I = new C18570vk(6);
                    c3z1.A0O(A0I);
                }
                A0I.A09(interfaceC74933Yj);
                return;
            }
        } else {
            snapshot = ((C3Z4) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AbstractC75013Yr.A08.get();
            }
        }
        snapshot.A0D(interfaceC74933Yj);
    }

    public boolean A0E() {
        Snapshot snapshot;
        if (this instanceof C3Z1) {
            C3Z1 c3z1 = (C3Z1) this;
            if (c3z1 instanceof C3Z3) {
                snapshot = C3Z3.A00((C3Z3) c3z1);
            } else {
                return false;
            }
        } else {
            snapshot = ((C3Z4) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AbstractC75013Yr.A08.get();
            }
        }
        return snapshot.A0E();
    }

    public int A0F() {
        return this.A00;
    }

    public C75063Yw A0G() {
        return this.A03;
    }

    public Snapshot(C75063Yw c75063Yw, int i) {
        int i2;
        int i3;
        this.A03 = c75063Yw;
        this.A00 = i;
        if (i != 0) {
            C75063Yw A0G = A0G();
            int i4 = AbstractC75013Yr.A00;
            int[] iArr = A0G.A03;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = A0G.A01;
                if (j != 0) {
                    i3 = A0G.A00;
                } else {
                    j = A0G.A02;
                    i3 = j != 0 ? A0G.A00 + 64 : i3;
                }
                i = i3 + Long.numberOfTrailingZeros(j);
            }
            synchronized (AbstractC75013Yr.A07) {
                C75073Yx c75073Yx = AbstractC75013Yr.A06;
                int i5 = c75073Yx.A01 + 1;
                int[] iArr2 = c75073Yx.A04;
                int length = iArr2.length;
                if (i5 > length) {
                    int i6 = length * 2;
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    AbstractC06960Yn.A0U(iArr2, iArr3, 0, 0, length);
                    int[] iArr5 = c75073Yx.A03;
                    AbstractC06960Yn.A0U(iArr5, iArr4, 0, 0, iArr5.length);
                    c75073Yx.A04 = iArr3;
                    c75073Yx.A03 = iArr4;
                }
                int i7 = c75073Yx.A01;
                c75073Yx.A01 = i7 + 1;
                int[] iArr6 = c75073Yx.A02;
                int length2 = iArr6.length;
                if (c75073Yx.A00 >= length2) {
                    int i8 = 0;
                    int i9 = length2 * 2;
                    int[] iArr7 = new int[i9];
                    while (i8 < i9) {
                        int i10 = i8 + 1;
                        iArr7[i8] = i10;
                        i8 = i10;
                    }
                    AbstractC06960Yn.A0U(iArr6, iArr7, 0, 0, length2);
                    c75073Yx.A02 = iArr7;
                    iArr6 = iArr7;
                }
                i2 = c75073Yx.A00;
                c75073Yx.A00 = iArr6[i2];
                int[] iArr8 = c75073Yx.A04;
                iArr8[i7] = i;
                c75073Yx.A03[i7] = i2;
                iArr6[i2] = i7;
                int i11 = iArr8[i7];
                while (i7 > 0) {
                    int i12 = ((i7 + 1) >> 1) - 1;
                    if (iArr8[i12] <= i11) {
                        break;
                    }
                    C75073Yx.A00(c75073Yx, i12, i7);
                    i7 = i12;
                }
            }
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
