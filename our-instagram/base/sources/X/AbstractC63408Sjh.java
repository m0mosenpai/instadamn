package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Sjh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63408Sjh {
    public static final SK1 A00;
    public static final SK1 A01;
    public static final SK1 A02;
    public static final Class A03;

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:1|2)|3|(2:4|5)|(8:7|8|9|10|(3:12|13|14)|17|13|14)|20|8|9|10|(0)|17|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:10:0x0031, B:12:0x0039), top: B:9:0x0031 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.SK1] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            X.AbstractC63408Sjh.A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L2d
            X.SK1 r0 = (X.SK1) r0     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            X.AbstractC63408Sjh.A00 = r0
            r2 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L52
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L52
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L52
            X.SK1 r0 = (X.SK1) r0     // Catch: java.lang.Throwable -> L52
            goto L53
        L52:
            r0 = r3
        L53:
            X.AbstractC63408Sjh.A01 = r0
            X.SK1 r0 = new X.SK1
            r0.<init>()
            X.AbstractC63408Sjh.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63408Sjh.<clinit>():void");
    }

    public static Object A0A(InterfaceC65444TkG interfaceC65444TkG, Object obj, List list, int i) {
        if (interfaceC65444TkG != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int A012 = AbstractC31176DnK.A01(list, i3);
                    if (interfaceC65444TkG.CWL(A012)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(A012));
                        }
                        i2++;
                    } else {
                        if (obj == null) {
                            obj = new C63022Saq();
                        }
                        ((C63022Saq) obj).A01(i << 3, Long.valueOf(A012));
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A0B = AbstractC167007dF.A0B(it);
                    if (!interfaceC65444TkG.CWL(A0B)) {
                        if (obj == null) {
                            obj = new C63022Saq();
                        }
                        ((C63022Saq) obj).A01(i << 3, Long.valueOf(A0B));
                        it.remove();
                    }
                }
            }
        }
        return obj;
    }

    public static void A0B(SCD scd, List list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC64538TIu abstractC64538TIu = (AbstractC64538TIu) list.get(i2);
                AbstractC63073Sbv.A06(codedOutputStream, i);
                codedOutputStream.A0H(abstractC64538TIu);
            }
        }
    }

    public static void A0C(SCD scd, List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof InterfaceC65687Ts9) {
                InterfaceC65687Ts9 interfaceC65687Ts9 = (InterfaceC65687Ts9) list;
                while (i2 < list.size()) {
                    Object BkU = interfaceC65687Ts9.BkU(i2);
                    boolean z = BkU instanceof String;
                    CodedOutputStream codedOutputStream = scd.A00;
                    if (z) {
                        AbstractC63073Sbv.A06(codedOutputStream, i);
                        codedOutputStream.A0I((String) BkU);
                    } else {
                        AbstractC63073Sbv.A06(codedOutputStream, i);
                        codedOutputStream.A0H((AbstractC64538TIu) BkU);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = scd.A00;
                String A1I = AbstractC25226BEj.A1I(list, i2);
                AbstractC63073Sbv.A06(codedOutputStream2, i);
                codedOutputStream2.A0I(A1I);
                i2++;
            }
        }
    }

    public static void A0D(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A05(AbstractC166987dD.A1a(list.get(i2)) ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0D(i, AbstractC166987dD.A1a(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0E(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AbstractC58320PtC.A09(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0B(i, AbstractC58320PtC.A09(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(SCD scd, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A012 = AbstractC31176DnK.A01(list, i5);
                    if (A012 >= 0) {
                        boolean z2 = CodedOutputStream.A02;
                        i2 = AbstractC58321PtD.A06(A012);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A013 = AbstractC31176DnK.A01(list, i3);
                    if (A013 >= 0) {
                        codedOutputStream.A07(A013);
                    } else {
                        codedOutputStream.A0F(A013);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                scd.A00.A09(i, AbstractC31176DnK.A01(list, i3));
                i3++;
            }
        }
    }

    public static void A0G(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AbstractC31176DnK.A01(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A08(i, AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0B(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A08(i, Float.floatToRawIntBits(AbstractC167007dF.A04(list, i2)));
                i2++;
            }
        }
    }

    public static void A0J(SCD scd, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A012 = AbstractC31176DnK.A01(list, i5);
                    if (A012 >= 0) {
                        boolean z2 = CodedOutputStream.A02;
                        i2 = AbstractC58321PtD.A06(A012);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A07(i4);
                while (i3 < list.size()) {
                    int A013 = AbstractC31176DnK.A01(list, i3);
                    if (A013 >= 0) {
                        codedOutputStream.A07(A013);
                    } else {
                        codedOutputStream.A0F(A013);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                scd.A00.A09(i, AbstractC31176DnK.A01(list, i3));
                i3++;
            }
        }
    }

    public static void A0K(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(AbstractC58320PtC.A0A(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0C(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0L(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AbstractC31176DnK.A01(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A08(i, AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0E(AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0B(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A022 = AbstractC58320PtC.A02(list, i4);
                    boolean z2 = CodedOutputStream.A02;
                    i3 += AbstractC58321PtD.A06(A022);
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(AbstractC58320PtC.A02(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0A(i, AbstractC58320PtC.A02(list, i2));
                i2++;
            }
        }
    }

    public static void A0O(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(AbstractC58321PtD.A0H(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AbstractC58321PtD.A0H(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0C(i, AbstractC58321PtD.A0H(list, i2));
                i2++;
            }
        }
    }

    public static void A0P(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A012 = AbstractC31176DnK.A01(list, i4);
                    boolean z2 = CodedOutputStream.A02;
                    i3 += AbstractC58321PtD.A06(A012);
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(AbstractC31176DnK.A01(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0A(i, AbstractC31176DnK.A01(list, i2));
                i2++;
            }
        }
    }

    public static void A0Q(SCD scd, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = scd.A00;
                AbstractC63073Sbv.A06(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(AbstractC58320PtC.A0A(list, i4));
                }
                codedOutputStream.A07(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(AbstractC58320PtC.A0A(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                scd.A00.A0C(i, AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [X.Saq, java.lang.Object] */
    public static void A0R(Object obj, Object obj2) {
        RYn rYn = (RYn) obj;
        C63022Saq c63022Saq = rYn.unknownFields;
        C63022Saq c63022Saq2 = ((RYn) obj2).unknownFields;
        C63022Saq c63022Saq3 = c63022Saq;
        if (!c63022Saq2.equals(C63022Saq.A05)) {
            int i = c63022Saq.A00 + c63022Saq2.A00;
            int[] copyOf = Arrays.copyOf(c63022Saq.A03, i);
            System.arraycopy(c63022Saq2.A03, 0, copyOf, c63022Saq.A00, c63022Saq2.A00);
            Object[] copyOf2 = Arrays.copyOf(c63022Saq.A04, i);
            System.arraycopy(c63022Saq2.A04, 0, copyOf2, c63022Saq.A00, c63022Saq2.A00);
            ?? obj3 = new Object();
            obj3.A01 = -1;
            obj3.A00 = i;
            obj3.A03 = copyOf;
            obj3.A04 = copyOf2;
            obj3.A02 = true;
            c63022Saq3 = obj3;
        }
        rYn.unknownFields = c63022Saq3;
    }

    public static int A00(InterfaceC65596Tnf interfaceC65596Tnf, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = AbstractC63073Sbv.A05(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            TEQ teq = (TEQ) list.get(i2);
            int A0D = TEQ.A0D(interfaceC65596Tnf, teq, teq);
            boolean z = CodedOutputStream.A02;
            A05 += AbstractC58321PtD.A06(A0D) + A0D;
        }
        return A05;
    }

    public static int A01(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            i = 0;
            while (i4 < size) {
                RWC.A00(rwc, i4);
                int i5 = rwc.A01[i4];
                boolean z = CodedOutputStream.A02;
                if (i5 >= 0) {
                    i3 = AbstractC58321PtD.A06(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            i = 0;
            while (i4 < size) {
                int A012 = AbstractC31176DnK.A01(list, i4);
                boolean z2 = CodedOutputStream.A02;
                if (A012 >= 0) {
                    i2 = AbstractC58321PtD.A06(A012);
                } else {
                    i2 = 10;
                }
                i += i2;
                i4++;
            }
        }
        return i;
    }

    public static int A02(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            i = 0;
            while (i4 < size) {
                RWC.A00(rwc, i4);
                int i5 = rwc.A01[i4];
                boolean z = CodedOutputStream.A02;
                if (i5 >= 0) {
                    i3 = AbstractC58321PtD.A06(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            i = 0;
            while (i4 < size) {
                int A012 = AbstractC31176DnK.A01(list, i4);
                boolean z2 = CodedOutputStream.A02;
                if (A012 >= 0) {
                    i2 = AbstractC58321PtD.A06(A012);
                } else {
                    i2 = 10;
                }
                i += i2;
                i4++;
            }
        }
        return i;
    }

    public static int A03(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            i = 0;
            while (i2 < size) {
                RWD.A00(rwd, i2);
                i += CodedOutputStream.A01(rwd.A01[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.A01(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            i = 0;
            while (i2 < size) {
                RWC.A00(rwc, i2);
                int A012 = AbstractC58318PtA.A01(rwc.A01[i2]);
                boolean z = CodedOutputStream.A02;
                i += AbstractC58321PtD.A06(A012);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int A022 = AbstractC58320PtC.A02(list, i2);
                boolean z2 = CodedOutputStream.A02;
                i += AbstractC58321PtD.A06(A022);
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            i = 0;
            while (i2 < size) {
                RWD.A00(rwd, i2);
                i += CodedOutputStream.A01(AbstractC58320PtC.A06(rwd.A01[i2]));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.A01(AbstractC58321PtD.A0H(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            i = 0;
            while (i2 < size) {
                RWC.A00(rwc, i2);
                int i3 = rwc.A01[i2];
                boolean z = CodedOutputStream.A02;
                i += AbstractC58321PtD.A06(i3);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int A012 = AbstractC31176DnK.A01(list, i2);
                boolean z2 = CodedOutputStream.A02;
                i += AbstractC58321PtD.A06(A012);
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            i = 0;
            while (i2 < size) {
                RWD.A00(rwd, i2);
                i += CodedOutputStream.A01(rwd.A01[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.A01(AbstractC58320PtC.A0A(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A08(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = size * AbstractC63073Sbv.A05(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A022 = ((AbstractC64538TIu) list.get(i2)).A02();
            boolean z = CodedOutputStream.A02;
            A05 += AbstractC58321PtD.A06(A022) + A022;
        }
        return A05;
    }

    public static int A09(List list, int i) {
        int A022;
        int A023;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A05 = AbstractC63073Sbv.A05(i) * size;
        if (list instanceof InterfaceC65687Ts9) {
            InterfaceC65687Ts9 interfaceC65687Ts9 = (InterfaceC65687Ts9) list;
            while (i2 < size) {
                Object BkU = interfaceC65687Ts9.BkU(i2);
                if (BkU instanceof AbstractC64538TIu) {
                    int A024 = ((AbstractC64538TIu) BkU).A02();
                    boolean z = CodedOutputStream.A02;
                    A023 = AbstractC58321PtD.A06(A024) + A024;
                } else {
                    A023 = CodedOutputStream.A02((String) BkU);
                }
                A05 += A023;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC64538TIu) {
                    int A025 = ((AbstractC64538TIu) obj).A02();
                    boolean z2 = CodedOutputStream.A02;
                    A022 = AbstractC58321PtD.A06(A025) + A025;
                } else {
                    A022 = CodedOutputStream.A02((String) obj);
                }
                A05 += A022;
                i2++;
            }
        }
        return A05;
    }
}
