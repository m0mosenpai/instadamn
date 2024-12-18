package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RBQ extends AbstractC63037SbC implements Comparable {
    public static final C62494SDw A0B = new C62494SDw(C05F.A00, "");
    public SQA A00;
    public SQA A01;
    public SQA A02;
    public SQA A03;
    public final C44W A04;
    public final C913945y A05;
    public final C913945y A06;
    public final C45T A07;
    public final boolean A08;
    public transient C62494SDw A09;
    public transient TIH A0A;

    public static SQA A03(C64179T2j c64179T2j, SQA sqa, RBQ rbq) {
        RBL rbl;
        SQA sqa2 = sqa;
        RBL rbl2 = (RBL) sqa.A02;
        if (rbl2 instanceof RBK) {
            RBK rbk = (RBK) rbl2;
            rbl = new RBK(c64179T2j, ((RBL) rbk).A01, rbk.A01, ((RBH) rbk).A00);
        } else {
            boolean z = rbl2 instanceof RBF;
            rbl = rbl2;
            if (!z) {
                if (rbl2 instanceof RBI) {
                    RBI rbi = (RBI) rbl2;
                    C64179T2j c64179T2j2 = ((RBL) rbi).A00;
                    rbl = rbi;
                    if (c64179T2j != c64179T2j2) {
                        RBH rbh = rbi.A02;
                        int i = rbi.A00;
                        rbh.A00[i] = c64179T2j;
                        rbl = rbh.A0H(i);
                    }
                } else if (rbl2 instanceof RBJ) {
                    RBJ rbj = (RBJ) rbl2;
                    rbl = new RBJ(c64179T2j, rbj.A01, rbj.A00);
                } else {
                    RBG rbg = (RBG) rbl2;
                    rbl = new RBG(c64179T2j, rbg.A01, rbg.A00, ((RBH) rbg).A00);
                }
            }
        }
        SQA sqa3 = sqa.A01;
        if (sqa3 != null) {
            sqa2 = sqa.A05(A03(c64179T2j, sqa3, rbq));
        }
        if (rbl != sqa2.A02) {
            return new SQA(sqa2.A00, sqa2.A01, rbl, sqa2.A04, sqa2.A05, sqa2.A03);
        }
        return sqa2;
    }

    public static void A05(SQA sqa, RBQ rbq, Collection collection, Map map) {
        String A08;
        for (SQA sqa2 = sqa; sqa2 != null; sqa2 = sqa2.A01) {
            C913945y c913945y = sqa2.A00;
            if (sqa2.A04 && c913945y != null) {
                RBQ rbq2 = (RBQ) map.get(c913945y);
                if (rbq2 == null) {
                    C45T c45t = rbq.A07;
                    rbq2 = new RBQ(rbq.A04, rbq.A05, c913945y, c45t, rbq.A08);
                    map.put(c913945y, rbq2);
                }
                if (sqa == rbq.A01) {
                    rbq2.A01 = sqa2.A05(rbq2.A01);
                } else if (sqa == rbq.A02) {
                    rbq2.A02 = sqa2.A05(rbq2.A02);
                } else if (sqa == rbq.A03) {
                    rbq2.A03 = sqa2.A05(rbq2.A03);
                } else if (sqa == rbq.A00) {
                    rbq2.A00 = sqa2.A05(rbq2.A00);
                } else {
                    throw AbstractC43594JPz.A0o(rbq, "Internal error: mismatched accessors, property: ", AbstractC166987dD.A1C());
                }
            } else if (sqa2.A05) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Conflicting/ambiguous property name definitions (implicit name ");
                C913945y c913945y2 = rbq.A06;
                Iterator it = C914045z.A00;
                if (c913945y2 == null) {
                    A08 = "[null]";
                } else {
                    A08 = C914045z.A08(c913945y2.A02);
                }
                A1C.append(A08);
                A1C.append("): found multiple explicit names: ");
                A1C.append(collection);
                throw AbstractC43594JPz.A0o(sqa2, ", but also implicit accessor: ", A1C);
            }
        }
    }

    public static final int A00(RBK rbk) {
        String name = rbk.A01.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    private C64179T2j A01(SQA sqa) {
        C64179T2j c64179T2j = ((RBL) sqa.A02).A00;
        SQA sqa2 = sqa.A01;
        if (sqa2 != null) {
            return C64179T2j.A00(c64179T2j, A01(sqa2));
        }
        return c64179T2j;
    }

    public static C64179T2j A02(RBQ rbq, SQA[] sqaArr, int i) {
        C64179T2j A01 = rbq.A01(sqaArr[i]);
        do {
            i++;
            if (i >= sqaArr.length) {
                return A01;
            }
        } while (sqaArr[i] == null);
        return C64179T2j.A00(A01, A02(rbq, sqaArr, i));
    }

    public static java.util.Set A04(SQA sqa, java.util.Set set) {
        while (sqa != null) {
            if (sqa.A04 && sqa.A00 != null) {
                if (set == null) {
                    set = AbstractC166987dD.A1H();
                }
                set.add(sqa.A00);
            }
            sqa = sqa.A01;
        }
        return set;
    }

    public static boolean A06(SQA sqa) {
        while (sqa != null) {
            if (sqa.A00 != null && sqa.A04) {
                return true;
            }
            sqa = sqa.A01;
        }
        return false;
    }

    public static boolean A07(SQA sqa) {
        while (sqa != null) {
            if (sqa.A00 != null && (!sqa.A00.A02.isEmpty())) {
                return true;
            }
            sqa = sqa.A01;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r1.length() <= 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r1.length() <= 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1.isAssignableFrom(r3) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RBK A0X(X.RBK r6, X.RBK r7) {
        /*
            r5 = this;
            java.lang.reflect.Method r4 = r6.A01
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.reflect.Method r2 = r7.A01
            java.lang.Class r1 = r2.getDeclaringClass()
            if (r3 == r1) goto L1b
            boolean r0 = r3.isAssignableFrom(r1)
            if (r0 != 0) goto L48
            boolean r0 = r1.isAssignableFrom(r3)
            if (r0 == 0) goto L1b
        L1a:
            return r6
        L1b:
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "set"
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L2f
            int r1 = r1.length()
            r0 = 3
            r3 = 1
            if (r1 > r0) goto L30
        L2f:
            r3 = 2
        L30:
            java.lang.String r1 = r4.getName()
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L42
            int r2 = r1.length()
            r1 = 3
            r0 = 1
            if (r2 > r1) goto L43
        L42:
            r0 = 2
        L43:
            if (r3 == r0) goto L49
            if (r3 >= r0) goto L1a
            return r7
        L48:
            return r7
        L49:
            X.44W r0 = r5.A04
            if (r0 != 0) goto L4f
            r6 = 0
            return r6
        L4f:
            X.RBK r6 = r0.A0G(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RBQ.A0X(X.RBK, X.RBK):X.RBK");
    }

    public final void A0Y(RBQ rbq) {
        SQA sqa = this.A01;
        SQA sqa2 = rbq.A01;
        if (sqa != null) {
            if (sqa2 != null) {
                sqa = sqa.A04(sqa2);
            }
            sqa2 = sqa;
        }
        this.A01 = sqa2;
        SQA sqa3 = this.A00;
        SQA sqa4 = rbq.A00;
        if (sqa3 != null) {
            if (sqa4 != null) {
                sqa3 = sqa3.A04(sqa4);
            }
            sqa4 = sqa3;
        }
        this.A00 = sqa4;
        SQA sqa5 = this.A02;
        SQA sqa6 = rbq.A02;
        if (sqa5 != null) {
            if (sqa6 != null) {
                sqa5 = sqa5.A04(sqa6);
            }
            sqa6 = sqa5;
        }
        this.A02 = sqa6;
        SQA sqa7 = this.A03;
        SQA sqa8 = rbq.A03;
        if (sqa7 != null) {
            if (sqa8 != null) {
                sqa7 = sqa7.A04(sqa8);
            }
            sqa8 = sqa7;
        }
        this.A03 = sqa8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        RBQ rbq = (RBQ) obj;
        SQA sqa = this.A00;
        SQA sqa2 = rbq.A00;
        if (sqa != null) {
            if (sqa2 == null) {
                return -1;
            }
        } else if (sqa2 != null) {
            return 1;
        }
        return A0L().compareTo(rbq.A0L());
    }

    public RBQ(C913945y c913945y, RBQ rbq) {
        this.A07 = rbq.A07;
        this.A04 = rbq.A04;
        this.A05 = rbq.A05;
        this.A06 = c913945y;
        this.A01 = rbq.A01;
        this.A00 = rbq.A00;
        this.A02 = rbq.A02;
        this.A03 = rbq.A03;
        this.A08 = rbq.A08;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[Property '");
        A1C.append(this.A06);
        A1C.append("'; ctors: ");
        A1C.append(this.A00);
        A1C.append(", field(s): ");
        A1C.append(this.A01);
        A1C.append(", getter(s): ");
        A1C.append(this.A02);
        A1C.append(", setter(s): ");
        A1C.append(this.A03);
        return AbstractC58319PtB.A0w(A1C);
    }

    public RBQ(C44W c44w, C913945y c913945y, C913945y c913945y2, C45T c45t, boolean z) {
        this.A07 = c45t;
        this.A04 = c44w;
        this.A05 = c913945y;
        this.A06 = c913945y2;
        this.A08 = z;
    }
}
