package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.PuM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58382PuM {
    public static final C62622SJf A00;
    public static final C62622SJf A01;
    public static final C62622SJf A02;
    public static final Class A03;

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:1|2)|3|(2:4|5)|(8:7|8|9|10|(3:12|13|14)|17|13|14)|20|8|9|10|(0)|17|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:10:0x0031, B:12:0x0039), top: B:9:0x0031 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.SJf, java.lang.Object] */
    static {
        /*
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            X.AbstractC58382PuM.A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L2d
            X.SJf r0 = (X.C62622SJf) r0     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            X.AbstractC58382PuM.A00 = r0
            r2 = 1
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L52
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L52
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L52
            X.SJf r0 = (X.C62622SJf) r0     // Catch: java.lang.Throwable -> L52
            goto L53
        L52:
            r0 = r3
        L53:
            X.AbstractC58382PuM.A01 = r0
            X.SJf r0 = new X.SJf
            r0.<init>()
            X.AbstractC58382PuM.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC58382PuM.<clinit>():void");
    }

    public static void A0A(InterfaceC65555Tma interfaceC65555Tma, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Q7P q7p = c63603SqB.A00;
                AbstractC58387PuR abstractC58387PuR = (AbstractC58387PuR) list.get(i2);
                AbstractC63226Sfd.A08(q7p, i);
                q7p.A0A(abstractC58387PuR);
            }
        }
    }

    public static void A0B(InterfaceC65555Tma interfaceC65555Tma, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (list instanceof InterfaceC65684Ts6) {
                InterfaceC65684Ts6 interfaceC65684Ts6 = (InterfaceC65684Ts6) list;
                while (i2 < list.size()) {
                    Object BkU = interfaceC65684Ts6.BkU(i2);
                    boolean z = BkU instanceof String;
                    Q7P q7p = c63603SqB.A00;
                    if (z) {
                        AbstractC63226Sfd.A08(q7p, i);
                        q7p.A0B((String) BkU);
                    } else {
                        AbstractC63226Sfd.A08(q7p, i);
                        q7p.A0A((AbstractC58387PuR) BkU);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Q7P q7p2 = c63603SqB.A00;
                String A1I = AbstractC25226BEj.A1I(list, i2);
                AbstractC63226Sfd.A08(q7p2, i);
                q7p2.A0B(A1I);
                i2++;
            }
        }
    }

    public static void A0C(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                AbstractC63226Sfd.A08(q7p, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    q7p.A0C(AbstractC166987dD.A1a(list.get(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Q7P q7p2 = c63603SqB.A00;
                boolean A1a = AbstractC166987dD.A1a(list.get(i2));
                Q7O q7o = (Q7O) q7p2;
                Q7O.A01(q7o, 11);
                q7o.A0E(i << 3);
                byte b = A1a ? (byte) 1 : (byte) 0;
                byte[] bArr = q7o.A03;
                int i5 = q7o.A00;
                q7o.A00 = i5 + 1;
                bArr[i5] = b;
                q7o.A01++;
                i2++;
            }
        }
    }

    public static void A0D(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    long A09 = AbstractC58320PtC.A09(list, i2);
                    Q7O.A01(q7o, 8);
                    q7o.A0F(A09);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A08(i, AbstractC58320PtC.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0E(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i3 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A012 = AbstractC31176DnK.A01(list, i5);
                    if (A012 >= 0) {
                        boolean z2 = Q7P.A02;
                        i2 = AbstractC58321PtD.A06(A012);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                q7p.A05(i4);
                while (i3 < list.size()) {
                    int A013 = AbstractC31176DnK.A01(list, i3);
                    if (A013 >= 0) {
                        q7o.A05(A013);
                    } else {
                        AbstractC63226Sfd.A07(q7o, A013);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                c63603SqB.A00.A07(i, AbstractC31176DnK.A01(list, i3));
                i3++;
            }
        }
    }

    public static void A0F(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    int A012 = AbstractC31176DnK.A01(list, i2);
                    Q7O.A01(q7o, 4);
                    q7o.A0D(A012);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A06(i, AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    long A0A = AbstractC58320PtC.A0A(list, i2);
                    Q7O.A01(q7o, 8);
                    q7o.A0F(A0A);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A08(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    int floatToRawIntBits = Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2));
                    Q7O.A01(q7o, 4);
                    q7o.A0D(floatToRawIntBits);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A06(i, Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2)));
                i2++;
            }
        }
    }

    public static void A0I(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i3 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A012 = AbstractC31176DnK.A01(list, i5);
                    if (A012 >= 0) {
                        boolean z2 = Q7P.A02;
                        i2 = AbstractC58321PtD.A06(A012);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                q7p.A05(i4);
                while (i3 < list.size()) {
                    int A013 = AbstractC31176DnK.A01(list, i3);
                    if (A013 >= 0) {
                        q7o.A05(A013);
                    } else {
                        AbstractC63226Sfd.A07(q7o, A013);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                c63603SqB.A00.A07(i, AbstractC31176DnK.A01(list, i3));
                i3++;
            }
        }
    }

    public static void A0J(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += Q7P.A03(AbstractC58320PtC.A0A(list, i4));
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    AbstractC63226Sfd.A07(q7o, AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A09(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0K(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    int A012 = AbstractC31176DnK.A01(list, i2);
                    Q7O.A01(q7o, 4);
                    q7o.A0D(A012);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A06(i, AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
    }

    public static void A0L(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    long A0A = AbstractC58320PtC.A0A(list, i2);
                    Q7O.A01(q7o, 8);
                    q7o.A0F(A0A);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A08(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                AbstractC63226Sfd.A08(q7p, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A022 = AbstractC58320PtC.A02(list, i4);
                    boolean z2 = Q7P.A02;
                    i3 += AbstractC58321PtD.A06(A022);
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    q7p.A05(AbstractC58320PtC.A02(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Q7P q7p2 = c63603SqB.A00;
                int A023 = AbstractC58320PtC.A02(list, i2);
                Q7O q7o = (Q7O) q7p2;
                AbstractC63226Sfd.A06(q7o, i);
                q7o.A0E(A023);
                i2++;
            }
        }
    }

    public static void A0N(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += Q7P.A03(AbstractC58321PtD.A0H(list, i4));
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    AbstractC63226Sfd.A07(q7o, AbstractC58321PtD.A0H(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A09(i, AbstractC58321PtD.A0H(list, i2));
                i2++;
            }
        }
    }

    public static void A0O(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                AbstractC63226Sfd.A08(q7p, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A012 = AbstractC31176DnK.A01(list, i4);
                    boolean z2 = Q7P.A02;
                    i3 += AbstractC58321PtD.A06(A012);
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    q7p.A05(AbstractC31176DnK.A01(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Q7P q7p2 = c63603SqB.A00;
                int A013 = AbstractC31176DnK.A01(list, i2);
                Q7O q7o = (Q7O) q7p2;
                AbstractC63226Sfd.A06(q7o, i);
                q7o.A0E(A013);
                i2++;
            }
        }
    }

    public static void A0P(InterfaceC65555Tma interfaceC65555Tma, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C63603SqB c63603SqB = (C63603SqB) interfaceC65555Tma;
            int i2 = 0;
            if (z) {
                Q7P q7p = c63603SqB.A00;
                Q7O q7o = (Q7O) q7p;
                AbstractC63226Sfd.A08(q7o, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += Q7P.A03(AbstractC58320PtC.A0A(list, i4));
                }
                q7p.A05(i3);
                while (i2 < list.size()) {
                    AbstractC63226Sfd.A07(q7o, AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c63603SqB.A00.A09(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [X.PuD, java.lang.Object] */
    public static void A0Q(Object obj, Object obj2) {
        AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) obj;
        C58373PuD c58373PuD = abstractC58374PuE.unknownFields;
        C58373PuD c58373PuD2 = ((AbstractC58374PuE) obj2).unknownFields;
        C58373PuD c58373PuD3 = c58373PuD;
        if (!c58373PuD2.equals(C58373PuD.A05)) {
            int i = c58373PuD.A00 + c58373PuD2.A00;
            int[] copyOf = Arrays.copyOf(c58373PuD.A03, i);
            System.arraycopy(c58373PuD2.A03, 0, copyOf, c58373PuD.A00, c58373PuD2.A00);
            Object[] copyOf2 = Arrays.copyOf(c58373PuD.A04, i);
            System.arraycopy(c58373PuD2.A04, 0, copyOf2, c58373PuD.A00, c58373PuD2.A00);
            ?? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            c58373PuD3 = obj3;
        }
        abstractC58374PuE.unknownFields = c58373PuD3;
    }

    public static int A00(InterfaceC65588TnS interfaceC65588TnS, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = AbstractC63226Sfd.A05(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int A032 = AbstractC58375PuF.A03(interfaceC65588TnS, (InterfaceC65625Tpl) list.get(i2));
            boolean z = Q7P.A02;
            A05 += AbstractC58321PtD.A06(A032) + A032;
        }
        return A05;
    }

    public static int A01(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A012 = AbstractC31176DnK.A01(list, i3);
            boolean z = Q7P.A02;
            if (A012 >= 0) {
                i = AbstractC58321PtD.A06(A012);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A02(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A012 = AbstractC31176DnK.A01(list, i3);
            boolean z = Q7P.A02;
            if (A012 >= 0) {
                i = AbstractC58321PtD.A06(A012);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Q7P.A03(AbstractC58320PtC.A0A(list, i2));
        }
        return i;
    }

    public static int A04(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A022 = AbstractC58320PtC.A02(list, i2);
            boolean z = Q7P.A02;
            i += AbstractC58321PtD.A06(A022);
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Q7P.A03(AbstractC58321PtD.A0H(list, i2));
        }
        return i;
    }

    public static int A06(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A012 = AbstractC31176DnK.A01(list, i2);
            boolean z = Q7P.A02;
            i += AbstractC58321PtD.A06(A012);
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Q7P.A03(AbstractC58320PtC.A0A(list, i2));
        }
        return i;
    }

    public static int A08(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = size * AbstractC63226Sfd.A05(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A012 = ((AbstractC58387PuR) list.get(i2)).A01();
            boolean z = Q7P.A02;
            A05 += AbstractC58321PtD.A06(A012) + A012;
        }
        return A05;
    }

    public static int A09(List list, int i) {
        int A04;
        int A042;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A05 = AbstractC63226Sfd.A05(i) * size;
        if (list instanceof InterfaceC65684Ts6) {
            InterfaceC65684Ts6 interfaceC65684Ts6 = (InterfaceC65684Ts6) list;
            while (i2 < size) {
                Object BkU = interfaceC65684Ts6.BkU(i2);
                if (BkU instanceof AbstractC58387PuR) {
                    int A012 = ((AbstractC58387PuR) BkU).A01();
                    boolean z = Q7P.A02;
                    A042 = AbstractC58321PtD.A06(A012) + A012;
                } else {
                    A042 = Q7P.A04((String) BkU);
                }
                A05 += A042;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC58387PuR) {
                    int A013 = ((AbstractC58387PuR) obj).A01();
                    boolean z2 = Q7P.A02;
                    A04 = AbstractC58321PtD.A06(A013) + A013;
                } else {
                    A04 = Q7P.A04((String) obj);
                }
                A05 += A04;
                i2++;
            }
        }
        return A05;
    }
}
