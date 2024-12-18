package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3OK, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OK {
    public static int A00;
    public static int A01;
    public static C56132i1 A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v20, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.2i1, java.lang.Object] */
    public static void A02(C56082hw c56082hw, InterfaceC56272iG interfaceC56272iG, int i) {
        C56112hz c56112hz;
        C56112hz c56112hz2;
        boolean z;
        C56112hz c56112hz3;
        C56112hz c56112hz4;
        C56112hz c56112hz5;
        boolean z2;
        C56112hz c56112hz6;
        C56112hz c56112hz7;
        if (!c56082hw.A0x) {
            A01++;
            if (!(c56082hw instanceof C56062hu) && c56082hw.A0a() && A06(c56082hw)) {
                C56062hu.A00(c56082hw, new Object(), interfaceC56272iG);
            }
            C56112hz A0A = c56082hw.A0A(EnumC56102hy.TOP);
            C56112hz A0A2 = c56082hw.A0A(EnumC56102hy.BOTTOM);
            int A002 = A0A.A00();
            int A003 = A0A2.A00();
            HashSet hashSet = A0A.A05;
            if (hashSet != null && A0A.A06) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C56112hz c56112hz8 = (C56112hz) it.next();
                    C56082hw c56082hw2 = c56112hz8.A08;
                    int i2 = i + 1;
                    boolean A06 = A06(c56082hw2);
                    if (c56082hw2.A0a() && A06) {
                        C56062hu.A00(c56082hw2, new Object(), interfaceC56272iG);
                    }
                    C56112hz c56112hz9 = c56082hw2.A0g;
                    if ((c56112hz8 == c56112hz9 && (c56112hz7 = (c56112hz5 = c56082hw2.A0a).A04) != null && c56112hz7.A06) || (c56112hz8 == (c56112hz5 = c56082hw2.A0a) && (c56112hz6 = c56112hz9.A04) != null && c56112hz6.A06)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c56082hw2.A14[1] == C05F.A0C && !A06) {
                        if (c56082hw2.A0I >= 0 && c56082hw2.A0K >= 0 && (c56082hw2.A0R == 8 || (c56082hw2.A0G == 0 && c56082hw2.A01 == 0.0f))) {
                            if (!c56082hw2.A0Z() && !c56082hw2.A0s && z2) {
                                A00(c56082hw, c56082hw2, interfaceC56272iG, i2);
                            }
                        }
                    } else if (!c56082hw2.A0a()) {
                        if (c56112hz8 == c56112hz9 && c56112hz5.A04 == null) {
                            int A012 = c56112hz9.A01() + A002;
                            c56082hw2.A0K(A012, c56082hw2.A06() + A012);
                        } else if (c56112hz8 == c56112hz5 && c56112hz9.A04 == null) {
                            int A013 = A002 - c56112hz5.A01();
                            c56082hw2.A0K(A013 - c56082hw2.A06(), A013);
                        } else if (z2 && !c56082hw2.A0Z()) {
                            A03(c56082hw2, interfaceC56272iG, i2);
                        }
                        A02(c56082hw2, interfaceC56272iG, i2);
                    }
                }
            }
            if (!(c56082hw instanceof C3OH)) {
                HashSet hashSet2 = A0A2.A05;
                if (hashSet2 != null && A0A2.A06) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        C56112hz c56112hz10 = (C56112hz) it2.next();
                        C56082hw c56082hw3 = c56112hz10.A08;
                        int i3 = i + 1;
                        boolean A062 = A06(c56082hw3);
                        if (c56082hw3.A0a() && A062) {
                            C56062hu.A00(c56082hw3, new Object(), interfaceC56272iG);
                        }
                        C56112hz c56112hz11 = c56082hw3.A0g;
                        if ((c56112hz10 == c56112hz11 && (c56112hz4 = (c56112hz2 = c56082hw3.A0a).A04) != null && c56112hz4.A06) || (c56112hz10 == (c56112hz2 = c56082hw3.A0a) && (c56112hz3 = c56112hz11.A04) != null && c56112hz3.A06)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c56082hw3.A14[1] == C05F.A0C && !A062) {
                            if (c56082hw3.A0I >= 0 && c56082hw3.A0K >= 0 && (c56082hw3.A0R == 8 || (c56082hw3.A0G == 0 && c56082hw3.A01 == 0.0f))) {
                                if (!c56082hw3.A0Z() && !c56082hw3.A0s && z) {
                                    A00(c56082hw, c56082hw3, interfaceC56272iG, i3);
                                }
                            }
                        } else if (!c56082hw3.A0a()) {
                            if (c56112hz10 == c56112hz11 && c56112hz2.A04 == null) {
                                int A014 = c56112hz11.A01() + A003;
                                c56082hw3.A0K(A014, c56082hw3.A06() + A014);
                            } else if (c56112hz10 == c56112hz2 && c56112hz11.A04 == null) {
                                int A015 = A003 - c56112hz2.A01();
                                c56082hw3.A0K(A015 - c56082hw3.A06(), A015);
                            } else if (z && !c56082hw3.A0Z()) {
                                A03(c56082hw3, interfaceC56272iG, i3);
                            }
                            A02(c56082hw3, interfaceC56272iG, i3);
                        }
                    }
                }
                C56112hz A0A3 = c56082hw.A0A(EnumC56102hy.BASELINE);
                HashSet hashSet3 = A0A3.A05;
                if (hashSet3 != null && A0A3.A06) {
                    int A004 = A0A3.A00();
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        C56112hz c56112hz12 = (C56112hz) it3.next();
                        C56082hw c56082hw4 = c56112hz12.A08;
                        int i4 = i + 1;
                        boolean A063 = A06(c56082hw4);
                        if (c56082hw4.A0a() && A063) {
                            C56062hu.A00(c56082hw4, new Object(), interfaceC56272iG);
                        }
                        if (c56082hw4.A14[1] != C05F.A0C || A063) {
                            if (!c56082hw4.A0a() && c56112hz12 == (c56112hz = c56082hw4.A0Z)) {
                                int A016 = c56112hz12.A01() + A004;
                                if (c56082hw4.A0q) {
                                    int i5 = A016 - c56082hw4.A08;
                                    int i6 = c56082hw4.A0A + i5;
                                    c56082hw4.A0W = i5;
                                    C56112hz c56112hz13 = c56082hw4.A0g;
                                    c56112hz13.A00 = i5;
                                    c56112hz13.A06 = true;
                                    C56112hz c56112hz14 = c56082hw4.A0a;
                                    c56112hz14.A00 = i6;
                                    c56112hz14.A06 = true;
                                    c56112hz.A00 = A016;
                                    c56112hz.A06 = true;
                                    c56082hw4.A0w = true;
                                }
                                A02(c56082hw4, interfaceC56272iG, i4);
                            }
                        }
                    }
                }
                c56082hw.A0x = true;
            }
        }
    }

    public static void A00(C56082hw c56082hw, C56082hw c56082hw2, InterfaceC56272iG interfaceC56272iG, int i) {
        float f = c56082hw2.A06;
        C56112hz c56112hz = c56082hw2.A0g;
        int A002 = c56112hz.A04.A00() + c56112hz.A01();
        C56112hz c56112hz2 = c56082hw2.A0a;
        int A003 = c56112hz2.A04.A00() - c56112hz2.A01();
        if (A003 >= A002) {
            int A06 = c56082hw2.A06();
            if (c56082hw2.A0R != 8) {
                int i2 = c56082hw2.A0G;
                if (i2 == 2) {
                    if (!(c56082hw instanceof C56062hu)) {
                        c56082hw = c56082hw.A0h;
                    }
                    A06 = (int) (f * 0.5f * c56082hw.A06());
                } else if (i2 == 0) {
                    A06 = A003 - A002;
                }
                A06 = Math.max(c56082hw2.A0K, A06);
                int i3 = c56082hw2.A0I;
                if (i3 > 0) {
                    A06 = Math.min(i3, A06);
                }
            }
            int i4 = A002 + ((int) ((f * ((A003 - A002) - A06)) + 0.5f));
            c56082hw2.A0K(i4, A06 + i4);
            A02(c56082hw2, interfaceC56272iG, i + 1);
        }
    }

    public static void A01(C56082hw c56082hw, C56082hw c56082hw2, InterfaceC56272iG interfaceC56272iG, int i, boolean z) {
        float f = c56082hw2.A02;
        C56112hz c56112hz = c56082hw2.A0e;
        int A002 = c56112hz.A04.A00() + c56112hz.A01();
        C56112hz c56112hz2 = c56082hw2.A0f;
        int A003 = c56112hz2.A04.A00() - c56112hz2.A01();
        if (A003 >= A002) {
            int A07 = c56082hw2.A07();
            if (c56082hw2.A0R != 8) {
                int i2 = c56082hw2.A0H;
                if (i2 == 2) {
                    if (!(c56082hw instanceof C56062hu)) {
                        c56082hw = c56082hw.A0h;
                    }
                    A07 = (int) (f * 0.5f * c56082hw.A07());
                } else if (i2 == 0) {
                    A07 = A003 - A002;
                }
                A07 = Math.max(c56082hw2.A0L, A07);
                int i3 = c56082hw2.A0J;
                if (i3 > 0) {
                    A07 = Math.min(i3, A07);
                }
            }
            int i4 = A002 + ((int) ((f * ((A003 - A002) - A07)) + 0.5f));
            c56082hw2.A0J(i4, A07 + i4);
            A04(c56082hw2, interfaceC56272iG, i + 1, z);
        }
    }

    public static void A03(C56082hw c56082hw, InterfaceC56272iG interfaceC56272iG, int i) {
        float f = c56082hw.A06;
        C56112hz c56112hz = c56082hw.A0g;
        int A002 = c56112hz.A04.A00();
        C56112hz c56112hz2 = c56082hw.A0a;
        int A003 = c56112hz2.A04.A00();
        int A012 = c56112hz.A01() + A002;
        int A013 = A003 - c56112hz2.A01();
        if (A002 == A003) {
            f = 0.5f;
        } else {
            A002 = A012;
            A003 = A013;
        }
        int A06 = c56082hw.A06();
        int i2 = (A003 - A002) - A06;
        if (A002 > A003) {
            i2 = (A002 - A003) - A06;
        }
        float f2 = f * i2;
        if (i2 > 0) {
            f2 += 0.5f;
        }
        int i3 = (int) f2;
        int i4 = A002 + i3;
        int i5 = i4 + A06;
        if (A002 > A003) {
            i4 = A002 - i3;
            i5 = i4 - A06;
        }
        c56082hw.A0K(i4, i5);
        A02(c56082hw, interfaceC56272iG, i + 1);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.2i1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [X.2i1, java.lang.Object] */
    public static void A04(C56082hw c56082hw, InterfaceC56272iG interfaceC56272iG, int i, boolean z) {
        C56112hz c56112hz;
        boolean z2;
        C56112hz c56112hz2;
        C56112hz c56112hz3;
        C56112hz c56112hz4;
        boolean z3;
        C56112hz c56112hz5;
        C56112hz c56112hz6;
        if (!c56082hw.A0r) {
            A00++;
            if (!(c56082hw instanceof C56062hu) && c56082hw.A0a() && A06(c56082hw)) {
                C56062hu.A00(c56082hw, new Object(), interfaceC56272iG);
            }
            C56112hz A0A = c56082hw.A0A(EnumC56102hy.LEFT);
            C56112hz A0A2 = c56082hw.A0A(EnumC56102hy.RIGHT);
            int A002 = A0A.A00();
            int A003 = A0A2.A00();
            HashSet hashSet = A0A.A05;
            if (hashSet != null && A0A.A06) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C56112hz c56112hz7 = (C56112hz) it.next();
                    C56082hw c56082hw2 = c56112hz7.A08;
                    int i2 = i + 1;
                    boolean A06 = A06(c56082hw2);
                    if (c56082hw2.A0a() && A06) {
                        C56062hu.A00(c56082hw2, new Object(), interfaceC56272iG);
                    }
                    C56112hz c56112hz8 = c56082hw2.A0e;
                    if ((c56112hz7 == c56112hz8 && (c56112hz6 = (c56112hz4 = c56082hw2.A0f).A04) != null && c56112hz6.A06) || (c56112hz7 == (c56112hz4 = c56082hw2.A0f) && (c56112hz5 = c56112hz8.A04) != null && c56112hz5.A06)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c56082hw2.A14[0] == C05F.A0C && !A06) {
                        if (c56082hw2.A0J >= 0 && c56082hw2.A0L >= 0 && (c56082hw2.A0R == 8 || (c56082hw2.A0H == 0 && c56082hw2.A01 == 0.0f))) {
                            if (!c56082hw2.A0Y() && !c56082hw2.A0s && z3) {
                                A01(c56082hw, c56082hw2, interfaceC56272iG, i2, z);
                            }
                        }
                    } else if (!c56082hw2.A0a()) {
                        if (c56112hz7 == c56112hz8 && c56112hz4.A04 == null) {
                            int A012 = c56112hz8.A01() + A002;
                            c56082hw2.A0J(A012, c56082hw2.A07() + A012);
                        } else if (c56112hz7 == c56112hz4 && c56112hz8.A04 == null) {
                            int A013 = A002 - c56112hz4.A01();
                            c56082hw2.A0J(A013 - c56082hw2.A07(), A013);
                        } else if (z3 && !c56082hw2.A0Y()) {
                            A05(c56082hw2, interfaceC56272iG, i2, z);
                        }
                        A04(c56082hw2, interfaceC56272iG, i2, z);
                    }
                }
            }
            if (!(c56082hw instanceof C3OH)) {
                HashSet hashSet2 = A0A2.A05;
                if (hashSet2 != null && A0A2.A06) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        C56112hz c56112hz9 = (C56112hz) it2.next();
                        C56082hw c56082hw3 = c56112hz9.A08;
                        int i3 = i + 1;
                        boolean A062 = A06(c56082hw3);
                        if (c56082hw3.A0a() && A062) {
                            C56062hu.A00(c56082hw3, new Object(), interfaceC56272iG);
                        }
                        C56112hz c56112hz10 = c56082hw3.A0e;
                        if ((c56112hz9 == c56112hz10 && (c56112hz3 = (c56112hz = c56082hw3.A0f).A04) != null && c56112hz3.A06) || (c56112hz9 == (c56112hz = c56082hw3.A0f) && (c56112hz2 = c56112hz10.A04) != null && c56112hz2.A06)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (c56082hw3.A14[0] == C05F.A0C && !A062) {
                            if (c56082hw3.A0J >= 0 && c56082hw3.A0L >= 0 && (c56082hw3.A0R == 8 || (c56082hw3.A0H == 0 && c56082hw3.A01 == 0.0f))) {
                                if (!c56082hw3.A0Y() && !c56082hw3.A0s && z2) {
                                    A01(c56082hw, c56082hw3, interfaceC56272iG, i3, z);
                                }
                            }
                        } else if (!c56082hw3.A0a()) {
                            if (c56112hz9 == c56112hz10 && c56112hz.A04 == null) {
                                int A014 = c56112hz10.A01() + A003;
                                c56082hw3.A0J(A014, c56082hw3.A07() + A014);
                            } else if (c56112hz9 == c56112hz && c56112hz10.A04 == null) {
                                int A015 = A003 - c56112hz.A01();
                                c56082hw3.A0J(A015 - c56082hw3.A07(), A015);
                            } else if (z2 && !c56082hw3.A0Y()) {
                                A05(c56082hw3, interfaceC56272iG, i3, z);
                            }
                            A04(c56082hw3, interfaceC56272iG, i3, z);
                        }
                    }
                }
                c56082hw.A0r = true;
            }
        }
    }

    public static void A05(C56082hw c56082hw, InterfaceC56272iG interfaceC56272iG, int i, boolean z) {
        float f = c56082hw.A02;
        C56112hz c56112hz = c56082hw.A0e;
        int A002 = c56112hz.A04.A00();
        C56112hz c56112hz2 = c56082hw.A0f;
        int A003 = c56112hz2.A04.A00();
        int A012 = c56112hz.A01() + A002;
        int A013 = A003 - c56112hz2.A01();
        if (A002 == A003) {
            f = 0.5f;
        } else {
            A002 = A012;
            A003 = A013;
        }
        int A07 = c56082hw.A07();
        int i2 = (A003 - A002) - A07;
        if (A002 > A003) {
            i2 = (A002 - A003) - A07;
        }
        float f2 = f * i2;
        if (i2 > 0) {
            f2 += 0.5f;
        }
        int i3 = ((int) f2) + A002;
        int i4 = i3 + A07;
        if (A002 > A003) {
            i4 = i3 - A07;
        }
        c56082hw.A0J(i3, i4);
        A04(c56082hw, interfaceC56272iG, i + 1, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (((r1.A00() - r3.A01()) - (r4.A00() + r6.A01())) >= r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (((r1.A00() - r3.A01()) - (r4.A00() + r5.A01())) >= r6) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(X.C56082hw r12) {
        /*
            java.lang.Integer[] r0 = r12.A14
            r2 = 0
            r1 = r0[r2]
            r7 = 1
            r5 = r0[r7]
            java.lang.Integer r9 = X.C05F.A00
            r11 = 0
            r10 = 0
            if (r1 == r9) goto L5b
            boolean r0 = r12.A0W()
            if (r0 != 0) goto L5b
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L5b
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto Lb9
            int r1 = r12.A0H
            if (r1 != 0) goto L2c
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L2c
            boolean r0 = r12.A0b(r2)
            if (r0 != 0) goto L5b
        L2c:
            if (r1 != r7) goto Lb9
            int r8 = r12.A07()
            X.2hz r6 = r12.A0e
            X.2hz r4 = r6.A04
            if (r4 == 0) goto Lb9
            boolean r0 = r4.A06
            if (r0 == 0) goto Lb9
            X.2hz r3 = r12.A0f
            X.2hz r1 = r3.A04
            if (r1 == 0) goto Lb9
            boolean r0 = r1.A06
            if (r0 == 0) goto Lb9
            int r2 = r1.A00()
            int r0 = r3.A01()
            int r2 = r2 - r0
            int r1 = r4.A00()
            int r0 = r6.A01()
            int r1 = r1 + r0
            int r2 = r2 - r1
            if (r2 < r8) goto Lb9
        L5b:
            r8 = 1
        L5c:
            if (r5 == r9) goto Lab
            boolean r0 = r12.A0X()
            if (r0 != 0) goto Lab
            java.lang.Integer r0 = X.C05F.A01
            if (r5 == r0) goto Lab
            java.lang.Integer r0 = X.C05F.A0C
            if (r5 != r0) goto Lb7
            int r1 = r12.A0G
            if (r1 != 0) goto L7c
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L7c
            boolean r0 = r12.A0b(r7)
            if (r0 != 0) goto Lab
        L7c:
            if (r1 != r7) goto Lb7
            int r6 = r12.A06()
            X.2hz r5 = r12.A0g
            X.2hz r4 = r5.A04
            if (r4 == 0) goto Lb7
            boolean r0 = r4.A06
            if (r0 == 0) goto Lb7
            X.2hz r3 = r12.A0a
            X.2hz r1 = r3.A04
            if (r1 == 0) goto Lb7
            boolean r0 = r1.A06
            if (r0 == 0) goto Lb7
            int r2 = r1.A00()
            int r0 = r3.A01()
            int r2 = r2 - r0
            int r1 = r4.A00()
            int r0 = r5.A01()
            int r1 = r1 + r0
            int r2 = r2 - r1
            if (r2 < r6) goto Lb7
        Lab:
            r1 = 1
        Lac:
            float r0 = r12.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto Lbb
            if (r8 != 0) goto Lb6
            if (r1 == 0) goto Lc0
        Lb6:
            return r7
        Lb7:
            r1 = 0
            goto Lac
        Lb9:
            r8 = 0
            goto L5c
        Lbb:
            if (r8 == 0) goto Lc0
            if (r1 == 0) goto Lc0
            r10 = 1
        Lc0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3OK.A06(X.2hw):boolean");
    }
}
