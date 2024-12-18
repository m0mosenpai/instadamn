package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3FD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FD implements C3FE {
    public final C3FC A02;
    public C02Q A01 = new C18140uy(30);
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public int A00 = 0;
    public final C3FF A03 = new C3FF(this);

    public C3FD(C3FC c3fc) {
        this.A02 = c3fc;
    }

    @Override // X.C3FE
    public final void ECi(C3QV c3qv) {
        c3qv.A03 = null;
        this.A01.EE6(c3qv);
    }

    private int A00(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3QV c3qv = (C3QV) arrayList.get(size);
            int i9 = c3qv.A00;
            int i10 = c3qv.A02;
            if (i9 == 8) {
                if (i10 < c3qv.A01) {
                    i4 = c3qv.A02;
                    i5 = c3qv.A01;
                } else {
                    i4 = c3qv.A01;
                    i5 = c3qv.A02;
                }
                if (i >= i4 && i <= i5) {
                    if (i4 == c3qv.A02) {
                        if (i2 == 1) {
                            i8 = c3qv.A01 + 1;
                        } else {
                            if (i2 == 2) {
                                i8 = c3qv.A01 - 1;
                            }
                            i++;
                        }
                        c3qv.A01 = i8;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i7 = c3qv.A02 + 1;
                        } else {
                            if (i2 == 2) {
                                i7 = c3qv.A02 - 1;
                            }
                            i--;
                        }
                        c3qv.A02 = i7;
                        i--;
                    }
                } else if (i < c3qv.A02) {
                    if (i2 == 1) {
                        c3qv.A02++;
                        i6 = c3qv.A01 + 1;
                    } else if (i2 == 2) {
                        c3qv.A02--;
                        i6 = c3qv.A01 - 1;
                    }
                    c3qv.A01 = i6;
                }
            } else if (i10 <= i) {
                if (c3qv.A00 == 1) {
                    i -= c3qv.A01;
                } else if (c3qv.A00 == 2) {
                    i += c3qv.A01;
                }
            } else {
                if (i2 == 1) {
                    i3 = c3qv.A02 + 1;
                } else if (i2 == 2) {
                    i3 = c3qv.A02 - 1;
                }
                c3qv.A02 = i3;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C3QV c3qv2 = (C3QV) arrayList.get(size2);
            int i11 = c3qv2.A00;
            int i12 = c3qv2.A01;
            if (i11 == 8) {
                if (i12 != c3qv2.A02 && c3qv2.A01 >= 0) {
                }
                arrayList.remove(size2);
                ECi(c3qv2);
            } else {
                if (i12 > 0) {
                }
                arrayList.remove(size2);
                ECi(c3qv2);
            }
        }
        return i;
    }

    private void A01(C3QV c3qv) {
        int i;
        int i2 = c3qv.A00;
        if (i2 != 1 && i2 != 8) {
            int A00 = A00(c3qv.A02, i2);
            int i3 = c3qv.A02;
            int i4 = c3qv.A00;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("op should be remove or update.");
                    sb.append(c3qv);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c3qv.A01; i6++) {
                int A002 = A00(c3qv.A02 + (i * i6), i4);
                i4 = c3qv.A00;
                if (i4 == 2 ? A002 == A00 : !(i4 != 4 || A002 != A00 + 1)) {
                    i5++;
                } else {
                    C3QV Ctq = Ctq(c3qv.A03, i4, A00, i5);
                    A08(Ctq, i3);
                    ECi(Ctq);
                    i4 = c3qv.A00;
                    if (i4 == 4) {
                        i3 += i5;
                    }
                    A00 = A002;
                    i5 = 1;
                }
            }
            Object obj = c3qv.A03;
            ECi(c3qv);
            if (i5 > 0) {
                C3QV Ctq2 = Ctq(obj, c3qv.A00, A00, i5);
                A08(Ctq2, i3);
                ECi(Ctq2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void A02(C3QV c3qv) {
        this.A05.add(c3qv);
        int i = c3qv.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.A02.Cu6(c3qv.A02, c3qv.A01);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown update op type for ");
                    sb.append(c3qv);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.A02.CnM(c3qv.A02, c3qv.A01, c3qv.A03);
                return;
            }
            C3FC c3fc = this.A02;
            int i2 = c3qv.A02;
            int i3 = c3qv.A01;
            RecyclerView recyclerView = ((C3FB) c3fc).A00;
            recyclerView.A0v(i2, i3, false);
            recyclerView.A0U = true;
            return;
        }
        this.A02.Cu5(c3qv.A02, c3qv.A01);
    }

    private boolean A03(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3QV c3qv = (C3QV) arrayList.get(i2);
            if (c3qv.A00 == 8) {
                if (A04(c3qv.A01, i2 + 1) == i) {
                    return true;
                }
            } else {
                if (c3qv.A00 == 1) {
                    int i3 = c3qv.A02;
                    int i4 = i3 + c3qv.A01;
                    while (i3 < i4) {
                        if (A04(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A04(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C3QV c3qv = (C3QV) arrayList.get(i2);
            int i3 = c3qv.A00;
            int i4 = c3qv.A02;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c3qv.A01;
                } else {
                    if (c3qv.A02 < i) {
                        i--;
                    }
                    if (c3qv.A01 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (c3qv.A00 == 2) {
                if (i < c3qv.A02 + c3qv.A01) {
                    return -1;
                }
                i -= c3qv.A01;
            } else if (c3qv.A00 == 1) {
                i += c3qv.A01;
            }
            i2++;
        }
        return i;
    }

    public final void A05() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C3FB) this.A02).A00((C3QV) arrayList.get(i));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d9, code lost:
    
        if (r0.A08.A04.contains(r1.itemView) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0233, code lost:
    
        if (r0.A08.A04.contains(r1.itemView) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r4.A01 != (r2 - r13)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        if (r1 > r4.A02) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r5.A01 = r1 - r4.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
    
        r12.set(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0135, code lost:
    
        if (r5.A02 == r5.A01) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        r12.set(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r12.remove(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:
    
        if (r1 >= r4.A02) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f8, code lost:
    
        if (r4.A01 != (r13 - r2)) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FD.A07():void");
    }

    public final void A08(C3QV c3qv, int i) {
        C3FC c3fc = this.A02;
        C3FB c3fb = (C3FB) c3fc;
        c3fb.A00(c3qv);
        int i2 = c3qv.A00;
        if (i2 != 2) {
            if (i2 == 4) {
                c3fc.CnM(i, c3qv.A01, c3qv.A03);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = c3qv.A01;
        RecyclerView recyclerView = c3fb.A00;
        recyclerView.A0v(i, i3, true);
        recyclerView.A0U = true;
        recyclerView.mState.A00 += i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C3FE
    public final C3QV Ctq(Object obj, int i, int i2, int i3) {
        C3QV c3qv = (C3QV) this.A01.A7H();
        C3QV c3qv2 = c3qv;
        if (c3qv == null) {
            c3qv2 = new Object();
        }
        c3qv2.A00 = i;
        c3qv2.A02 = i2;
        c3qv2.A01 = i3;
        c3qv2.A03 = obj;
        return c3qv2;
    }

    public final void A06() {
        A05();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3QV c3qv = (C3QV) arrayList.get(i);
            int i2 = c3qv.A00;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            C3FC c3fc = this.A02;
                            ((C3FB) c3fc).A00(c3qv);
                            c3fc.Cu6(c3qv.A02, c3qv.A01);
                        }
                    } else {
                        C3FC c3fc2 = this.A02;
                        ((C3FB) c3fc2).A00(c3qv);
                        c3fc2.CnM(c3qv.A02, c3qv.A01, c3qv.A03);
                    }
                } else {
                    C3FB c3fb = (C3FB) this.A02;
                    c3fb.A00(c3qv);
                    int i3 = c3qv.A02;
                    int i4 = c3qv.A01;
                    RecyclerView recyclerView = c3fb.A00;
                    recyclerView.A0v(i3, i4, true);
                    recyclerView.A0U = true;
                    recyclerView.mState.A00 += i4;
                }
            } else {
                C3FC c3fc3 = this.A02;
                ((C3FB) c3fc3).A00(c3qv);
                c3fc3.Cu5(c3qv.A02, c3qv.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public final void A09(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ECi((C3QV) list.get(i));
        }
        list.clear();
    }
}
