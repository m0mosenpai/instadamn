package X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;

/* renamed from: X.5MT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MT<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator A08 = new Comparator() { // from class: X.5MU
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    };
    public int A00;
    public int A01;
    public C5MV A02;
    public TZX A03;
    public TZY A04;
    public final C5MV A05;
    public final Comparator A06;
    public final boolean A07;

    public C5MT(boolean z) {
        Comparator comparator = A08;
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = comparator;
        this.A07 = false;
        this.A05 = new C5MV(false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A02 = null;
        this.A01 = 0;
        this.A00++;
        C5MV c5mv = this.A05;
        c5mv.A04 = c5mv;
        c5mv.A02 = c5mv;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C5MV c5mv = null;
        if (obj != null) {
            try {
                c5mv = A04(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c5mv != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C5MV c5mv = null;
        if (obj != null) {
            try {
                c5mv = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c5mv != null) {
            return c5mv.A06;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C5MV c5mv = null;
        if (obj != null) {
            try {
                c5mv = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c5mv != null) {
            A05(c5mv, true);
        }
        if (c5mv != null) {
            return c5mv.A06;
        }
        return null;
    }

    private void A00(C5MV c5mv) {
        int i;
        int i2;
        C5MV c5mv2 = c5mv.A01;
        C5MV c5mv3 = c5mv.A05;
        C5MV c5mv4 = c5mv3.A01;
        C5MV c5mv5 = c5mv3.A05;
        c5mv.A05 = c5mv4;
        if (c5mv4 != null) {
            c5mv4.A03 = c5mv;
        }
        A02(c5mv, c5mv3);
        c5mv3.A01 = c5mv;
        c5mv.A03 = c5mv3;
        int i3 = 0;
        if (c5mv2 != null) {
            i = c5mv2.A00;
        } else {
            i = 0;
        }
        if (c5mv4 != null) {
            i2 = c5mv4.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5mv.A00 = max;
        if (c5mv5 != null) {
            i3 = c5mv5.A00;
        }
        c5mv3.A00 = Math.max(max, i3) + 1;
    }

    private void A01(C5MV c5mv) {
        int i;
        int i2;
        C5MV c5mv2 = c5mv.A01;
        C5MV c5mv3 = c5mv.A05;
        C5MV c5mv4 = c5mv2.A01;
        C5MV c5mv5 = c5mv2.A05;
        c5mv.A01 = c5mv5;
        if (c5mv5 != null) {
            c5mv5.A03 = c5mv;
        }
        A02(c5mv, c5mv2);
        c5mv2.A05 = c5mv;
        c5mv.A03 = c5mv2;
        int i3 = 0;
        if (c5mv3 != null) {
            i = c5mv3.A00;
        } else {
            i = 0;
        }
        if (c5mv5 != null) {
            i2 = c5mv5.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c5mv.A00 = max;
        if (c5mv4 != null) {
            i3 = c5mv4.A00;
        }
        c5mv2.A00 = Math.max(max, i3) + 1;
    }

    private void A02(C5MV c5mv, C5MV c5mv2) {
        C5MV c5mv3 = c5mv.A03;
        c5mv.A03 = null;
        if (c5mv2 != null) {
            c5mv2.A03 = c5mv3;
        }
        if (c5mv3 != null) {
            if (c5mv3.A01 == c5mv) {
                c5mv3.A01 = c5mv2;
                return;
            } else {
                c5mv3.A05 = c5mv2;
                return;
            }
        }
        this.A02 = c5mv2;
    }

    private void A03(C5MV c5mv, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c5mv != null) {
            C5MV c5mv2 = c5mv.A01;
            C5MV c5mv3 = c5mv.A05;
            int i5 = 0;
            if (c5mv2 != null) {
                i = c5mv2.A00;
            } else {
                i = 0;
            }
            if (c5mv3 != null) {
                i2 = c5mv3.A00;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C5MV c5mv4 = c5mv3.A01;
                C5MV c5mv5 = c5mv3.A05;
                if (c5mv5 != null) {
                    i4 = c5mv5.A00;
                } else {
                    i4 = 0;
                }
                if (c5mv4 != null) {
                    i5 = c5mv4.A00;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    A01(c5mv3);
                }
                A00(c5mv);
            } else if (i6 == 2) {
                C5MV c5mv6 = c5mv2.A01;
                C5MV c5mv7 = c5mv2.A05;
                if (c5mv7 != null) {
                    i3 = c5mv7.A00;
                } else {
                    i3 = 0;
                }
                if (c5mv6 != null) {
                    i5 = c5mv6.A00;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    A00(c5mv2);
                }
                A01(c5mv);
            } else if (i6 == 0) {
                c5mv.A00 = i + 1;
            } else {
                c5mv.A00 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                } else {
                    c5mv = c5mv.A03;
                }
            }
            if (z) {
                return;
            } else {
                c5mv = c5mv.A03;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0020 -> B:6:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5MV A04(java.lang.Object r11, boolean r12) {
        /*
            r10 = this;
            java.util.Comparator r3 = r10.A06
            X.5MV r5 = r10.A02
            r4 = 0
            r8 = r11
            if (r5 == 0) goto L2d
            java.util.Comparator r0 = X.C5MT.A08
            if (r3 != r0) goto L25
            r2 = r8
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        Lf:
            if (r2 == 0) goto L26
            java.lang.Object r0 = r5.A07
            int r1 = r2.compareTo(r0)
        L17:
            if (r1 != 0) goto L1a
            return r5
        L1a:
            if (r1 >= 0) goto L22
            X.5MV r0 = r5.A01
        L1e:
            if (r0 == 0) goto L2e
            r5 = r0
            goto Lf
        L22:
            X.5MV r0 = r5.A05
            goto L1e
        L25:
            r2 = r4
        L26:
            java.lang.Object r0 = r5.A07
            int r1 = r3.compare(r11, r0)
            goto L17
        L2d:
            r1 = 0
        L2e:
            if (r12 == 0) goto L79
            X.5MV r6 = r10.A05
            r0 = 1
            if (r5 != 0) goto L5d
            java.util.Comparator r0 = X.C5MT.A08
            if (r3 != r0) goto L51
            boolean r0 = r11 instanceof java.lang.Comparable
            if (r0 != 0) goto L51
            java.lang.Class r0 = r11.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = " is not Comparable"
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L51:
            boolean r9 = r10.A07
            X.5MV r7 = r6.A04
            X.5MV r4 = new X.5MV
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r4
            goto L6d
        L5d:
            boolean r9 = r10.A07
            X.5MV r7 = r6.A04
            X.5MV r4 = new X.5MV
            r4.<init>(r5, r6, r7, r8, r9)
            if (r1 >= 0) goto L7a
            r5.A01 = r4
        L6a:
            r10.A03(r5, r0)
        L6d:
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
        L79:
            return r4
        L7a:
            r5.A05 = r4
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5MT.A04(java.lang.Object, boolean):X.5MV");
    }

    public final void A05(C5MV c5mv, boolean z) {
        int i;
        if (z) {
            C5MV c5mv2 = c5mv.A04;
            c5mv2.A02 = c5mv.A02;
            c5mv.A02.A04 = c5mv2;
        }
        C5MV c5mv3 = c5mv.A01;
        C5MV c5mv4 = c5mv.A05;
        C5MV c5mv5 = c5mv.A03;
        int i2 = 0;
        if (c5mv3 != null) {
            if (c5mv4 != null) {
                if (c5mv3.A00 > c5mv4.A00) {
                    for (C5MV c5mv6 = c5mv3.A05; c5mv6 != null; c5mv6 = c5mv6.A05) {
                        c5mv3 = c5mv6;
                    }
                } else {
                    c5mv3 = c5mv4;
                    for (C5MV c5mv7 = c5mv4.A01; c5mv7 != null; c5mv7 = c5mv7.A01) {
                        c5mv3 = c5mv7;
                    }
                }
                A05(c5mv3, false);
                C5MV c5mv8 = c5mv.A01;
                if (c5mv8 != null) {
                    i = c5mv8.A00;
                    c5mv3.A01 = c5mv8;
                    c5mv8.A03 = c5mv3;
                    c5mv.A01 = null;
                } else {
                    i = 0;
                }
                C5MV c5mv9 = c5mv.A05;
                if (c5mv9 != null) {
                    i2 = c5mv9.A00;
                    c5mv3.A05 = c5mv9;
                    c5mv9.A03 = c5mv3;
                    c5mv.A05 = null;
                }
                c5mv3.A00 = Math.max(i, i2) + 1;
                A02(c5mv, c5mv3);
                return;
            }
            A02(c5mv, c5mv3);
            c5mv.A01 = null;
        } else if (c5mv4 != null) {
            A02(c5mv, c5mv4);
            c5mv.A05 = null;
        } else {
            A02(c5mv, null);
        }
        A03(c5mv5, false);
        this.A01--;
        this.A00++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        TZX tzx = this.A03;
        if (tzx == null) {
            TZX tzx2 = new TZX(this);
            this.A03 = tzx2;
            return tzx2;
        }
        return tzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        TZY tzy = this.A04;
        if (tzy == null) {
            TZY tzy2 = new TZY(this);
            this.A04 = tzy2;
            return tzy2;
        }
        return tzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.A07) {
                throw new NullPointerException("value == null");
            }
            C5MV A04 = A04(obj, true);
            Object obj3 = A04.A06;
            A04.A06 = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A01;
    }

    public C5MT() {
        Comparator comparator = A08;
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = comparator;
        this.A07 = true;
        this.A05 = new C5MV(true);
    }
}
