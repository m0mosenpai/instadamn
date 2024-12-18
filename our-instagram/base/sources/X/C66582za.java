package X;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66582za {
    public final int A00;
    public final int A01;
    public final AbstractC66542zW A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    public final int A01(int i) {
        if (i >= 0 && i < this.A01) {
            int i2 = this.A05[i];
            int i3 = i2 & 15;
            int i4 = i2 >> 4;
            if (i3 == 0) {
                return -1;
            }
            return i4;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, this.A01, "Index out of bounds - passed position = ", ", old list size = "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.XfB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.XfB, java.lang.Object] */
    public final void A02(final InterfaceC65452xh interfaceC65452xh) {
        C66602zc c66602zc;
        int i;
        if (interfaceC65452xh instanceof C66602zc) {
            c66602zc = (C66602zc) interfaceC65452xh;
        } else {
            c66602zc = new InterfaceC65452xh(interfaceC65452xh) { // from class: X.2zc
                public final InterfaceC65452xh A04;
                public int A02 = 0;
                public int A01 = -1;
                public int A00 = -1;
                public Object A03 = null;

                public final void A00() {
                    int i2 = this.A02;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                this.A04.D2j(this.A01, this.A00, this.A03);
                            } else {
                                this.A04.DfC(this.A01, this.A00);
                            }
                        } else {
                            this.A04.DMJ(this.A01, this.A00);
                        }
                        this.A03 = null;
                        this.A02 = 0;
                    }
                }

                @Override // X.InterfaceC65452xh
                public final void D2j(int i2, int i3, Object obj) {
                    int i4;
                    int i5;
                    int i6;
                    if (this.A02 == 3 && i2 <= (i5 = (i4 = this.A01) + this.A00) && (i6 = i2 + i3) >= i4 && this.A03 == obj) {
                        int min = Math.min(i2, i4);
                        this.A01 = min;
                        this.A00 = Math.max(i5, i6) - min;
                    } else {
                        A00();
                        this.A01 = i2;
                        this.A00 = i3;
                        this.A03 = obj;
                        this.A02 = 3;
                    }
                }

                @Override // X.InterfaceC65452xh
                public final void DMJ(int i2, int i3) {
                    int i4;
                    if (this.A02 == 1 && i2 >= (i4 = this.A01)) {
                        int i5 = this.A00;
                        if (i2 <= i4 + i5) {
                            this.A00 = i5 + i3;
                            this.A01 = Math.min(i2, i4);
                            return;
                        }
                    }
                    A00();
                    this.A01 = i2;
                    this.A00 = i3;
                    this.A02 = 1;
                }

                @Override // X.InterfaceC65452xh
                public final void DfC(int i2, int i3) {
                    int i4;
                    if (this.A02 == 2 && (i4 = this.A01) >= i2 && i4 <= i2 + i3) {
                        this.A00 += i3;
                        this.A01 = i2;
                    } else {
                        A00();
                        this.A01 = i2;
                        this.A00 = i3;
                        this.A02 = 2;
                    }
                }

                {
                    this.A04 = interfaceC65452xh;
                }

                @Override // X.InterfaceC65452xh
                public final void DTy(int i2, int i3) {
                    A00();
                    this.A04.DTy(i2, i3);
                }
            };
        }
        int i2 = this.A01;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = i2;
        int i4 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            C66592zb c66592zb = (C66592zb) list.get(size);
            int i5 = c66592zb.A01;
            int i6 = c66592zb.A00;
            int i7 = i5 + i6;
            int i8 = c66592zb.A02 + i6;
            while (true) {
                if (i3 <= i7) {
                    break;
                }
                i3--;
                int i9 = this.A05[i3];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    C72498XfB A00 = A00(arrayDeque, i10, false);
                    if (A00 != null) {
                        int i11 = (i2 - A00.A00) - 1;
                        c66602zc.DTy(i3, i11);
                        if ((i9 & 4) != 0) {
                            c66602zc.D2j(i11, 1, this.A02.A01(i3, i10));
                        }
                    } else {
                        ?? obj = new Object();
                        obj.A01 = i3;
                        obj.A00 = (i2 - i3) - 1;
                        obj.A02 = true;
                        arrayDeque.add(obj);
                    }
                } else {
                    c66602zc.DfC(i3, 1);
                    i2--;
                }
            }
            while (i4 > i8) {
                i4--;
                int i12 = this.A04[i4];
                if ((i12 & 12) != 0) {
                    int i13 = i12 >> 4;
                    C72498XfB A002 = A00(arrayDeque, i13, true);
                    if (A002 == null) {
                        ?? obj2 = new Object();
                        obj2.A01 = i4;
                        obj2.A00 = i2 - i3;
                        obj2.A02 = false;
                        arrayDeque.add(obj2);
                    } else {
                        c66602zc.DTy((i2 - A002.A00) - 1, i3);
                        if ((i12 & 4) != 0) {
                            c66602zc.D2j(i3, 1, this.A02.A01(i13, i4));
                        }
                    }
                } else {
                    c66602zc.DMJ(i3, 1);
                    i2++;
                }
            }
            int i14 = c66592zb.A01;
            int i15 = c66592zb.A02;
            for (i = 0; i < c66592zb.A00; i++) {
                if ((this.A05[i14] & 15) == 2) {
                    c66602zc.D2j(i14, 1, this.A02.A01(i14, i15));
                }
                i14++;
                i15++;
            }
            i3 = c66592zb.A01;
            i4 = c66592zb.A02;
        }
        c66602zc.A00();
    }

    public final void A03(C2UU c2uu) {
        A02(new C65442xg(c2uu));
    }

    public C66582za(AbstractC66542zW abstractC66542zW, List list, int[] iArr, int[] iArr2) {
        int i;
        C66592zb c66592zb;
        this.A03 = list;
        this.A05 = iArr;
        this.A04 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.A02 = abstractC66542zW;
        this.A01 = abstractC66542zW.A03();
        this.A00 = abstractC66542zW.A02();
        List list2 = this.A03;
        if (list2.isEmpty() || (c66592zb = (C66592zb) list2.get(0)) == null || c66592zb.A01 != 0 || c66592zb.A02 != 0) {
            list2.add(0, new C66592zb(0, 0, 0));
        }
        list2.add(new C66592zb(this.A01, this.A00, 0));
        List<C66592zb> list3 = this.A03;
        for (C66592zb c66592zb2 : list3) {
            for (int i2 = 0; i2 < c66592zb2.A00; i2++) {
                int i3 = c66592zb2.A01 + i2;
                int i4 = c66592zb2.A02 + i2;
                int i5 = 2;
                if (this.A02.A04(i3, i4)) {
                    i5 = 1;
                }
                this.A05[i3] = (i4 << 4) | i5;
                this.A04[i4] = (i3 << 4) | i5;
            }
        }
        int i6 = 0;
        for (C66592zb c66592zb3 : list3) {
            while (true) {
                i = c66592zb3.A01;
                if (i6 < i) {
                    int[] iArr3 = this.A05;
                    if (iArr3[i6] == 0) {
                        int size = list3.size();
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            if (i7 < size) {
                                C66592zb c66592zb4 = (C66592zb) list3.get(i7);
                                while (i8 < c66592zb4.A02) {
                                    int[] iArr4 = this.A04;
                                    if (iArr4[i8] == 0) {
                                        AbstractC66542zW abstractC66542zW2 = this.A02;
                                        if (abstractC66542zW2.A05(i6, i8)) {
                                            int i9 = abstractC66542zW2.A04(i6, i8) ? 8 : 4;
                                            iArr3[i6] = (i8 << 4) | i9;
                                            iArr4[i8] = (i6 << 4) | i9;
                                        }
                                    }
                                    i8++;
                                }
                                i8 = c66592zb4.A02 + c66592zb4.A00;
                                i7++;
                            }
                        }
                    }
                    i6++;
                }
            }
            i6 = i + c66592zb3.A00;
        }
    }

    public static C72498XfB A00(Collection collection, int i, boolean z) {
        C72498XfB c72498XfB;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                c72498XfB = (C72498XfB) it.next();
                if (c72498XfB.A01 == i && c72498XfB.A02 == z) {
                    it.remove();
                    break;
                }
            } else {
                c72498XfB = null;
                break;
            }
        }
        while (it.hasNext()) {
            C72498XfB c72498XfB2 = (C72498XfB) it.next();
            int i2 = c72498XfB2.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            c72498XfB2.A00 = i3;
        }
        return c72498XfB;
    }
}
