package X;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.SbC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63037SbC {
    public static final C45H A00 = C45H.A04;

    public final C45H A08() {
        if (this instanceof RBP) {
            return ((RBP) this).A00;
        }
        RBQ rbq = (RBQ) this;
        AnonymousClass455 A0G = rbq.A0G();
        if (A0G == null) {
            A0G = rbq.A0E();
        }
        C44W c44w = rbq.A04;
        if (c44w == null) {
            return C45H.A04;
        }
        return c44w.A06(A0G);
    }

    public final C62494SDw A09() {
        C62494SDw c62494SDw;
        SQA sqa;
        SQA sqa2;
        if (this instanceof RBQ) {
            RBQ rbq = (RBQ) this;
            C62494SDw c62494SDw2 = rbq.A09;
            if (c62494SDw2 != null) {
                if (c62494SDw2 != RBQ.A0B) {
                    return c62494SDw2;
                }
            } else {
                C44W c44w = rbq.A04;
                C62494SDw c62494SDw3 = null;
                if (c44w != null) {
                    if (rbq.A08) {
                        sqa = rbq.A02;
                    } else {
                        SQA sqa3 = rbq.A00;
                        if (sqa3 == null || (c62494SDw3 = c44w.A0A((RBL) sqa3.A02)) == null) {
                            sqa = rbq.A03;
                        }
                    }
                    if ((sqa == null || (c62494SDw3 = c44w.A0A((RBL) sqa.A02)) == null) && (sqa2 = rbq.A01) != null) {
                        c62494SDw3 = c44w.A0A((RBL) sqa2.A02);
                    }
                }
                if (c62494SDw3 == null) {
                    c62494SDw = RBQ.A0B;
                } else {
                    c62494SDw = c62494SDw3;
                }
                rbq.A09 = c62494SDw;
                return c62494SDw3;
            }
        }
        return null;
    }

    public final AbstractC910944l A0A() {
        AnonymousClass455 A0I;
        if (this instanceof RBP) {
            A0I = ((RBP) this).A03;
        } else {
            RBQ rbq = (RBQ) this;
            if (rbq.A08) {
                A0I = rbq.A0G();
                if (A0I == null) {
                    A0I = rbq.A0E();
                }
                return A0I.A03();
            }
            A0I = rbq.A0I();
            if (A0I == null) {
                RBK A0H = rbq.A0H();
                if (A0H != null) {
                    return A0H.A0G(0);
                }
                A0I = rbq.A0E();
                if (A0I == null) {
                    A0I = rbq.A0G();
                }
            }
            return A0I.A03();
        }
        if (A0I == null) {
            return C910844k.A07;
        }
        return A0I.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ce, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.TIH A0B() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63037SbC.A0B():X.TIH");
    }

    public final C913945y A0C() {
        if (this instanceof RBP) {
            return ((RBP) this).A02;
        }
        return ((RBQ) this).A06;
    }

    public final C913945y A0D() {
        if (!(this instanceof RBP)) {
            A0F();
            return null;
        }
        return null;
    }

    public final RBJ A0E() {
        if (this instanceof RBP) {
            RBL rbl = ((RBP) this).A03;
            if (rbl instanceof RBJ) {
                return (RBJ) rbl;
            }
            return null;
        }
        RBQ rbq = (RBQ) this;
        SQA sqa = rbq.A01;
        if (sqa != null) {
            RBJ rbj = (RBJ) sqa.A02;
            for (SQA sqa2 = sqa.A01; sqa2 != null; sqa2 = sqa2.A01) {
                RBJ rbj2 = (RBJ) sqa2.A02;
                Class<?> declaringClass = rbj.A00.getDeclaringClass();
                Class<?> declaringClass2 = rbj2.A00.getDeclaringClass();
                if (declaringClass != declaringClass2) {
                    if (declaringClass.isAssignableFrom(declaringClass2)) {
                        rbj = rbj2;
                    } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                    }
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A13("Multiple fields representing property \"", rbq.A0L(), "\": ", rbj.A0B(), " vs ", rbj2.A0B()));
            }
            return rbj;
        }
        return null;
    }

    public final RBL A0F() {
        if (this instanceof RBP) {
            return ((RBP) this).A03;
        }
        RBQ rbq = (RBQ) this;
        if (!rbq.A08) {
            RBI A0I = rbq.A0I();
            if (A0I != null) {
                return A0I;
            }
            RBK A0H = rbq.A0H();
            if (A0H != null) {
                return A0H;
            }
            RBJ A0E = rbq.A0E();
            if (A0E != null) {
                return A0E;
            }
        }
        RBK A0G = rbq.A0G();
        if (A0G != null) {
            return A0G;
        }
        return rbq.A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return (X.RBK) r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        r2 = ((X.RBK) r6.A02).A01.getDeclaringClass();
        r3 = (X.RBK) r4.A02;
        r1 = r3.A01.getDeclaringClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r2 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r2.isAssignableFrom(r1) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r1.isAssignableFrom(r2) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r4 = r4.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r5.A02 = r6.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r2 = X.RBQ.A00(r3);
        r1 = (X.RBK) r6.A02;
        r0 = X.RBQ.A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r2 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r2 >= r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        throw X.AbstractC166987dD.A12(X.AnonymousClass001.A13("Conflicting getter definitions for property \"", r5.A0L(), "\": ", r1.A0B(), " vs ", r3.A0B()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RBK A0G() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.RBP
            if (r0 == 0) goto L16
            r0 = r10
            X.RBP r0 = (X.RBP) r0
            X.RBL r1 = r0.A03
            boolean r0 = r1 instanceof X.RBK
            if (r0 == 0) goto L80
            X.RBK r1 = (X.RBK) r1
            int r0 = r1.A0F()
            if (r0 != 0) goto L80
            return r1
        L16:
            r5 = r10
            X.RBQ r5 = (X.RBQ) r5
            X.SQA r6 = r5.A02
            if (r6 == 0) goto L80
            X.SQA r4 = r6.A01
            if (r4 != 0) goto L26
        L21:
            java.lang.Object r1 = r6.A02
            X.RBK r1 = (X.RBK) r1
            return r1
        L26:
            java.lang.Object r0 = r6.A02
            X.RBK r0 = (X.RBK) r0
            java.lang.reflect.Method r0 = r0.A01
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.Object r3 = r4.A02
            X.RBK r3 = (X.RBK) r3
            java.lang.reflect.Method r0 = r3.A01
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r2 == r1) goto L53
            boolean r0 = r2.isAssignableFrom(r1)
            if (r0 != 0) goto L63
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 == 0) goto L53
        L48:
            X.SQA r4 = r4.A01
            if (r4 != 0) goto L26
            X.SQA r0 = r6.A02()
            r5.A02 = r0
            goto L21
        L53:
            int r2 = X.RBQ.A00(r3)
            java.lang.Object r1 = r6.A02
            X.RBK r1 = (X.RBK) r1
            int r0 = X.RBQ.A00(r1)
            if (r2 == r0) goto L65
            if (r2 >= r0) goto L48
        L63:
            r6 = r4
            goto L48
        L65:
            java.lang.String r4 = "Conflicting getter definitions for property \""
            java.lang.String r5 = r5.A0L()
            java.lang.String r6 = "\": "
            java.lang.String r7 = r1.A0B()
            java.lang.String r8 = " vs "
            java.lang.String r9 = r3.A0B()
            java.lang.String r0 = X.AnonymousClass001.A13(r4, r5, r6, r7, r8, r9)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L80:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63037SbC.A0G():X.RBK");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r6 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return (X.RBK) r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        r2 = r5.A02;
        r1 = r3.A0X((X.RBK) r2, (X.RBK) r6.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r1 == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r1 != r6.A02) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r4 = X.AbstractC166987dD.A1E();
        r4.add(r5.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r4.add(r6.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        r6 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        r2 = r5.A02;
        r1 = r3.A0X((X.RBK) r2, (X.RBK) r6.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r1 == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r1 != r6.A02) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r4.clear();
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r4.isEmpty() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        throw X.AbstractC58319PtB.A0j("Conflicting setter definitions for property \"%s\": %s", new java.lang.Object[]{r3.A0L(), r4.stream().map(new X.J6G(0)).collect(java.util.stream.Collectors.joining(" vs "))});
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r3.A03 = r5.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003d, code lost:
    
        r6 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0027, code lost:
    
        if (r6 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RBK A0H() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.RBP
            if (r0 == 0) goto L17
            r0 = r7
            X.RBP r0 = (X.RBP) r0
            X.RBL r0 = r0.A03
            boolean r1 = r0 instanceof X.RBK
            if (r1 == 0) goto L9e
            X.RBK r0 = (X.RBK) r0
            int r2 = r0.A0F()
            r1 = 1
            if (r2 != r1) goto L9e
            return r0
        L17:
            r3 = r7
            X.RBQ r3 = (X.RBQ) r3
            X.SQA r5 = r3.A03
            if (r5 == 0) goto L9e
            X.SQA r6 = r5.A01
            if (r6 != 0) goto L29
        L22:
            java.lang.Object r0 = r5.A02
            X.RBK r0 = (X.RBK) r0
            return r0
        L27:
            if (r6 == 0) goto L97
        L29:
            java.lang.Object r2 = r5.A02
            r1 = r2
            X.RBK r1 = (X.RBK) r1
            java.lang.Object r0 = r6.A02
            X.RBK r0 = (X.RBK) r0
            X.RBK r1 = r3.A0X(r1, r0)
            if (r1 == r2) goto L3d
            java.lang.Object r0 = r6.A02
            if (r1 != r0) goto L40
            r5 = r6
        L3d:
            X.SQA r6 = r6.A01
            goto L27
        L40:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.lang.Object r0 = r5.A02
            r4.add(r0)
        L49:
            java.lang.Object r0 = r6.A02
            r4.add(r0)
        L4e:
            X.SQA r6 = r6.A01
            if (r6 == 0) goto L6a
            java.lang.Object r2 = r5.A02
            r1 = r2
            X.RBK r1 = (X.RBK) r1
            java.lang.Object r0 = r6.A02
            X.RBK r0 = (X.RBK) r0
            X.RBK r1 = r3.A0X(r1, r0)
            if (r1 == r2) goto L4e
            java.lang.Object r0 = r6.A02
            if (r1 != r0) goto L49
            r4.clear()
            r5 = r6
            goto L4e
        L6a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L97
            java.util.stream.Stream r2 = r4.stream()
            r1 = 0
            X.J6G r0 = new X.J6G
            r0.<init>(r1)
            java.util.stream.Stream r1 = r2.map(r0)
            java.lang.String r0 = " vs "
            java.util.stream.Collector r0 = java.util.stream.Collectors.joining(r0)
            java.lang.Object r1 = r1.collect(r0)
            java.lang.String r0 = r3.A0L()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Conflicting setter definitions for property \"%s\": %s"
            java.lang.IllegalArgumentException r0 = X.AbstractC58319PtB.A0j(r0, r1)
            throw r0
        L97:
            X.SQA r0 = r5.A02()
            r3.A03 = r0
            goto L22
        L9e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63037SbC.A0H():X.RBK");
    }

    public final RBI A0I() {
        Object obj;
        if (this instanceof RBP) {
            obj = ((RBP) this).A03;
            if (!(obj instanceof RBI)) {
                return null;
            }
        } else {
            SQA sqa = ((RBQ) this).A00;
            if (sqa == null) {
                return null;
            }
            do {
                RBI rbi = (RBI) sqa.A02;
                if (rbi.A02 instanceof RBG) {
                    return rbi;
                }
                sqa = sqa.A01;
            } while (sqa != null);
            obj = sqa.A02;
        }
        return (RBI) obj;
    }

    public final SZ3 A0J() {
        SQA sqa;
        if (this instanceof RBQ) {
            RBQ rbq = (RBQ) this;
            C44W c44w = rbq.A04;
            SZ3 sz3 = null;
            if (c44w == null) {
                return null;
            }
            if (rbq.A08) {
                sqa = rbq.A02;
            } else {
                SQA sqa2 = rbq.A00;
                if (sqa2 != null) {
                    AnonymousClass455 anonymousClass455 = (AnonymousClass455) sqa2.A02;
                    sz3 = c44w.A0H(anonymousClass455);
                    if (sz3 != null) {
                        sz3 = c44w.A0I(anonymousClass455, sz3);
                    }
                    if (sz3 != null) {
                        return sz3;
                    }
                }
                sqa = rbq.A03;
            }
            if (sqa != null) {
                AnonymousClass455 anonymousClass4552 = (AnonymousClass455) sqa.A02;
                sz3 = c44w.A0H(anonymousClass4552);
                if (sz3 != null) {
                    sz3 = c44w.A0I(anonymousClass4552, sz3);
                }
                if (sz3 != null) {
                    return sz3;
                }
            }
            SQA sqa3 = rbq.A01;
            if (sqa3 != null) {
                AnonymousClass455 anonymousClass4553 = (AnonymousClass455) sqa3.A02;
                SZ3 A0H = c44w.A0H(anonymousClass4553);
                if (A0H != null) {
                    return c44w.A0I(anonymousClass4553, A0H);
                }
                return A0H;
            }
            return sz3;
        }
        return null;
    }

    public final Class A0K() {
        if (this instanceof RBP) {
            RBL rbl = ((RBP) this).A03;
            if (rbl == null) {
                return Object.class;
            }
            return rbl.A04();
        }
        return A0A().A00;
    }

    public final String A0L() {
        C913945y c913945y;
        if (this instanceof RBQ) {
            c913945y = ((RBQ) this).A06;
            if (c913945y == null) {
                return null;
            }
        } else {
            c913945y = ((RBP) this).A02;
        }
        return c913945y.A02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, java.lang.Object, X.TSU] */
    public final Iterator A0M() {
        if (this instanceof RBP) {
            RBI A0I = A0I();
            if (A0I != null) {
                return Collections.singleton(A0I).iterator();
            }
        } else {
            SQA sqa = ((RBQ) this).A00;
            if (sqa != null) {
                ?? obj = new Object();
                obj.A00 = sqa;
                return obj;
            }
        }
        return C914045z.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.RBQ
            if (r0 == 0) goto L16
            r1 = r2
            X.RBQ r1 = (X.RBQ) r1
            X.SQA r0 = r1.A00
            if (r0 != 0) goto L14
            X.SQA r0 = r1.A03
            if (r0 != 0) goto L14
            X.SQA r1 = r1.A01
        L11:
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            return r0
        L16:
            X.RBI r0 = r2.A0I()
            if (r0 != 0) goto L14
            X.RBK r0 = r2.A0H()
            if (r0 != 0) goto L14
            X.RBJ r1 = r2.A0E()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63037SbC.A0N():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0O() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.RBQ
            if (r0 == 0) goto L12
            r1 = r2
            X.RBQ r1 = (X.RBQ) r1
            X.SQA r0 = r1.A02
            if (r0 != 0) goto L10
            X.SQA r1 = r1.A01
        Ld:
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            return r0
        L12:
            X.RBK r0 = r2.A0G()
            if (r0 != 0) goto L10
            X.RBJ r1 = r2.A0E()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63037SbC.A0O():boolean");
    }

    public final boolean A0P() {
        if (this instanceof RBP) {
            return ((RBP) this).A03 instanceof RBI;
        }
        return AbstractC167007dF.A1W(((RBQ) this).A00);
    }

    public final boolean A0Q() {
        if (this instanceof RBP) {
            return ((RBP) this).A03 instanceof RBJ;
        }
        return AbstractC167007dF.A1W(((RBQ) this).A01);
    }

    public final boolean A0R() {
        if (this instanceof RBP) {
            return AbstractC167007dF.A1W(A0H());
        }
        return AbstractC167007dF.A1W(((RBQ) this).A03);
    }

    public final boolean A0S() {
        if (this instanceof RBP) {
            return false;
        }
        RBQ rbq = (RBQ) this;
        if (!RBQ.A07(rbq.A01) && !RBQ.A07(rbq.A02) && !RBQ.A07(rbq.A03) && !RBQ.A06(rbq.A00)) {
            return false;
        }
        return true;
    }

    public final boolean A0T() {
        if (this instanceof RBP) {
            return false;
        }
        RBQ rbq = (RBQ) this;
        if (!RBQ.A06(rbq.A01) && !RBQ.A06(rbq.A02) && !RBQ.A06(rbq.A03) && !RBQ.A06(rbq.A00)) {
            return false;
        }
        return true;
    }

    public final boolean A0U() {
        SQA sqa;
        SQA sqa2;
        if (this instanceof RBQ) {
            RBQ rbq = (RBQ) this;
            C44W c44w = rbq.A04;
            Boolean bool = null;
            if (c44w != null) {
                if (rbq.A08) {
                    sqa = rbq.A02;
                } else {
                    SQA sqa3 = rbq.A00;
                    if (sqa3 == null || (bool = c44w.A0T((RBL) sqa3.A02)) == null) {
                        sqa = rbq.A03;
                    }
                    if (bool == null && bool.booleanValue()) {
                        return true;
                    }
                }
                if ((sqa == null || (bool = c44w.A0T((RBL) sqa.A02)) == null) && (sqa2 = rbq.A01) != null) {
                    bool = c44w.A0T((RBL) sqa2.A02);
                }
                if (bool == null) {
                }
            }
        }
        return false;
    }

    public final boolean A0V(C913945y c913945y) {
        C913945y c913945y2;
        if (this instanceof RBP) {
            c913945y2 = ((RBP) this).A02;
        } else {
            c913945y2 = ((RBQ) this).A06;
        }
        return c913945y2.equals(c913945y);
    }

    public final Class[] A0W() {
        SQA sqa;
        if (this instanceof RBQ) {
            RBQ rbq = (RBQ) this;
            C44W c44w = rbq.A04;
            Class[] clsArr = null;
            if (c44w == null) {
                return null;
            }
            if (rbq.A08) {
                sqa = rbq.A02;
            } else {
                SQA sqa2 = rbq.A00;
                if (sqa2 != null && (clsArr = c44w.A0o((AnonymousClass455) sqa2.A02)) != null) {
                    return clsArr;
                }
                sqa = rbq.A03;
            }
            if (sqa == null || (clsArr = c44w.A0o((AnonymousClass455) sqa.A02)) == null) {
                SQA sqa3 = rbq.A01;
                if (sqa3 != null) {
                    return c44w.A0o((AnonymousClass455) sqa3.A02);
                }
                return clsArr;
            }
            return clsArr;
        }
        return null;
    }
}
