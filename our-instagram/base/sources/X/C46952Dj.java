package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46952Dj extends C0T6 {
    public static final List A0D = AbstractC16960so.A1Q(C46962Dk.A00, C47032Dr.A00, C47062Du.A00, C47072Dv.A00, C47092Dx.A00);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C2E4 A07;
    public String A08;
    public String A09;
    public HashMap A0A;
    public List A0B;
    public boolean A0C;

    public C46952Dj(List list) {
        C2E4 c2e4 = (C2E4) C2Dz.A00.A00;
        C16930sl c16930sl = C16930sl.A00;
        HashMap hashMap = new HashMap();
        C14360o3.A0B(c2e4, 11);
        C14360o3.A0B(c16930sl, 12);
        this.A03 = 0;
        this.A04 = -1L;
        this.A05 = -1L;
        this.A06 = 0L;
        this.A09 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A0C = false;
        this.A07 = c2e4;
        this.A0B = c16930sl;
        this.A0A = hashMap;
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            A00((AbstractC46972Dl) it.next(), this);
        }
        this.A03 = 5;
        this.A0B = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x002a, B:7:0x0031, B:9:0x003b, B:14:0x0050, B:16:0x0054, B:17:0x0059), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized X.C9C6 A00(X.AbstractC46972Dl r11, X.C46952Dj r12) {
        /*
            monitor-enter(r12)
            r10 = 0
            X.C14360o3.A0B(r11, r10)     // Catch: java.lang.Throwable -> L72
            int r6 = r11.A00     // Catch: java.lang.Throwable -> L72
            X.2Dm r1 = r11.A01     // Catch: java.lang.Throwable -> L72
            boolean r0 = r11 instanceof X.C2E6     // Catch: java.lang.Throwable -> L72
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L50
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L72
            r5 = 3
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            X.2E6 r11 = (X.C2E6) r11     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r11.A00     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0}     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "%d:%d:%s"
        L2a:
            java.lang.String r1 = java.lang.String.format(r4, r0, r1)     // Catch: java.lang.Throwable -> L72
            X.C14360o3.A07(r1)     // Catch: java.lang.Throwable -> L72
        L31:
            java.util.HashMap r0 = r12.A0A     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L72
            X.9C6 r3 = (X.C9C6) r3     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L70
            r4 = 0
            r9 = 31
            X.9C6 r3 = new X.9C6     // Catch: java.lang.Throwable -> L72
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L72
            r3.A04 = r2     // Catch: java.lang.Throwable -> L72
            java.util.HashMap r0 = r12.A0A     // Catch: java.lang.Throwable -> L72
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L72
            goto L70
        L50:
            X.2Dm r0 = X.EnumC46982Dm.A05     // Catch: java.lang.Throwable -> L72
            if (r1 != r0) goto L59
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            goto L31
        L59:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L72
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "%d:%d"
            goto L2a
        L70:
            monitor-exit(r12)
            return r3
        L72:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46952Dj.A00(X.2Dl, X.2Dj):X.9C6");
    }

    public final C2E4 A04(AbstractC46972Dl abstractC46972Dl, String str) {
        C2E4 c2e4;
        C14360o3.A0B(str, 1);
        if (abstractC46972Dl.A00 == -1 && abstractC46972Dl.A01 == EnumC46982Dm.A05) {
            return this.A07;
        }
        C9C6 A00 = A00(abstractC46972Dl, this);
        JWd jWd = (JWd) ((Map) A00.A06).get(str);
        if (jWd != null && (c2e4 = (C2E4) jWd.A00) != null) {
            return c2e4;
        }
        return (C2E4) A00.A02;
    }

    public final String A05(AbstractC46972Dl abstractC46972Dl, String str) {
        String str2;
        C14360o3.A0B(str, 1);
        if (abstractC46972Dl.A00 == -1 && abstractC46972Dl.A01 == EnumC46982Dm.A05) {
            return this.A08;
        }
        C9C6 A00 = A00(abstractC46972Dl, this);
        JWd jWd = (JWd) ((Map) A00.A06).get(str);
        if (jWd != null && (str2 = jWd.A01) != null) {
            return str2;
        }
        return A00.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r17 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.AbstractC46972Dl r13, X.C2E4 r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, boolean r19) {
        /*
            r12 = this;
            r0 = 1
            r8 = r15
            X.C14360o3.A0B(r15, r0)
            r0 = 2
            r7 = r14
            X.C14360o3.A0B(r14, r0)
            int r1 = r13.A00
            r0 = -1
            r9 = r16
            r10 = r17
            if (r1 != r0) goto L3c
            X.2Dm r1 = r13.A01
            X.2Dm r0 = X.EnumC46982Dm.A05
            if (r1 != r0) goto L3c
            r12.A07 = r14
            r12.A0C = r10
            r12.A08 = r9
        L1f:
            java.util.List r0 = X.C46952Dj.A0D
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r1.next()
            X.2Dl r0 = (X.AbstractC46972Dl) r0
            X.9C6 r6 = A00(r0, r12)
            java.lang.String r8 = "all"
            r11 = 0
            r6.A00(r7, r8, r9, r10, r11)
            goto L25
        L3c:
            X.2Dv r3 = X.C47072Dv.A00
            boolean r0 = r13.equals(r3)
            if (r0 != 0) goto L1f
            X.9C6 r6 = A00(r13, r12)
            r11 = r19
            r6.A00(r7, r8, r9, r10, r11)
            if (r18 == 0) goto L8f
            X.9C6 r6 = A00(r3, r12)
            java.lang.String r8 = "all"
            java.lang.Object r5 = r6.A06
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r0 = r5.get(r8)
            X.JWd r0 = (X.JWd) r0
            if (r0 == 0) goto L90
            boolean r0 = r0.A02
        L63:
            r4 = 1
            if (r0 != 0) goto L69
            r2 = 1
            if (r17 != 0) goto L6a
        L69:
            r2 = 0
        L6a:
            X.2Dz r0 = X.C2Dz.A00
            java.util.Comparator r1 = r0.A02
            java.lang.Object r0 = r5.get(r8)
            X.JWd r0 = (X.JWd) r0
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r0.A00
            if (r0 != 0) goto L7c
        L7a:
            java.lang.Object r0 = r6.A02
        L7c:
            int r0 = r1.compare(r0, r14)
            if (r0 < 0) goto L83
            r4 = 0
        L83:
            if (r2 != 0) goto L87
            if (r4 == 0) goto L8f
        L87:
            X.9C6 r6 = A00(r3, r12)
            r11 = 0
            r6.A00(r7, r8, r9, r10, r11)
        L8f:
            return
        L90:
            boolean r0 = r6.A04
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46952Dj.A07(X.2Dl, X.2E4, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public final boolean A09(AbstractC46972Dl abstractC46972Dl, String str) {
        C14360o3.A0B(str, 1);
        if (abstractC46972Dl.A00 == -1 && abstractC46972Dl.A01 == EnumC46982Dm.A05) {
            return this.A0C;
        }
        C9C6 A00 = A00(abstractC46972Dl, this);
        JWd jWd = (JWd) ((Map) A00.A06).get(str);
        if (jWd != null) {
            return jWd.A02;
        }
        return A00.A04;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46952Dj) {
                C46952Dj c46952Dj = (C46952Dj) obj;
                if (this.A03 != c46952Dj.A03 || this.A04 != c46952Dj.A04 || this.A05 != c46952Dj.A05 || this.A06 != c46952Dj.A06 || !C14360o3.A0K(this.A09, c46952Dj.A09) || this.A00 != c46952Dj.A00 || this.A02 != c46952Dj.A02 || this.A01 != c46952Dj.A01 || !C14360o3.A0K(this.A08, c46952Dj.A08) || this.A0C != c46952Dj.A0C || !C14360o3.A0K(this.A07, c46952Dj.A07) || !C14360o3.A0K(this.A0B, c46952Dj.A0B) || !C14360o3.A0K(this.A0A, c46952Dj.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C50092Rx A01(AbstractC46972Dl abstractC46972Dl) {
        Object obj;
        AbstractC46972Dl abstractC46972Dl2;
        Collection values = this.A0A.values();
        C14360o3.A07(values);
        Iterator it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C50092Rx c50092Rx = (C50092Rx) ((C9C6) obj).A00;
                if (c50092Rx != null) {
                    abstractC46972Dl2 = c50092Rx.A00();
                } else {
                    abstractC46972Dl2 = null;
                }
                if (C14360o3.A0K(abstractC46972Dl2, abstractC46972Dl)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9C6 c9c6 = (C9C6) obj;
        if (c9c6 == null) {
            return null;
        }
        return (C50092Rx) c9c6.A00;
    }

    public final C50092Rx A02(String str) {
        Object obj;
        String str2;
        Collection values = this.A0A.values();
        C14360o3.A07(values);
        Iterator it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C50092Rx c50092Rx = (C50092Rx) ((C9C6) obj).A00;
                if (c50092Rx != null) {
                    str2 = c50092Rx.A05;
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9C6 c9c6 = (C9C6) obj;
        if (c9c6 == null) {
            return null;
        }
        return (C50092Rx) c9c6.A00;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2Dj] */
    public final C46952Dj A03() {
        int i = this.A03;
        long j = this.A04;
        long j2 = this.A05;
        long j3 = this.A06;
        String str = this.A09;
        int i2 = this.A00;
        int i3 = this.A02;
        int i4 = this.A01;
        String str2 = this.A08;
        boolean z = this.A0C;
        C2E4 c2e4 = this.A07;
        List list = this.A0B;
        HashMap hashMap = this.A0A;
        C14360o3.A0B(c2e4, 10);
        C14360o3.A0B(list, 11);
        C14360o3.A0B(hashMap, 12);
        ?? obj = new Object();
        obj.A03 = i;
        obj.A04 = j;
        obj.A05 = j2;
        obj.A06 = j3;
        obj.A09 = str;
        obj.A00 = i2;
        obj.A02 = i3;
        obj.A01 = i4;
        obj.A08 = str2;
        obj.A0C = z;
        obj.A07 = c2e4;
        obj.A0B = list;
        obj.A0A = hashMap;
        obj.A0A = new HashMap();
        for (Map.Entry entry : this.A0A.entrySet()) {
            Object key = entry.getKey();
            C9C6 c9c6 = (C9C6) entry.getValue();
            HashMap hashMap2 = obj.A0A;
            C50092Rx c50092Rx = (C50092Rx) c9c6.A00;
            String str3 = c9c6.A03;
            boolean z2 = c9c6.A04;
            C2E4 c2e42 = (C2E4) c9c6.A02;
            C2E4 c2e43 = (C2E4) c9c6.A01;
            C14360o3.A0B(c2e42, 3);
            C14360o3.A0B(c2e43, 4);
            C9C6 c9c62 = new C9C6(c50092Rx, c2e42, c2e43, str3, z2);
            for (Map.Entry entry2 : ((Map) c9c6.A06).entrySet()) {
                Object key2 = entry2.getKey();
                JWd jWd = (JWd) entry2.getValue();
                Map map = (Map) c9c62.A06;
                String str4 = jWd.A01;
                C2E4 c2e44 = (C2E4) jWd.A00;
                boolean z3 = jWd.A02;
                C14360o3.A0B(c2e44, 1);
                map.put(key2, new JWd(c2e44, str4, z3));
            }
            hashMap2.put(key, c9c62);
        }
        return obj;
    }

    public final List A06() {
        Collection values = this.A0A.values();
        C14360o3.A07(values);
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object obj = ((C9C6) it.next()).A00;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A08(List list) {
        Collection values = this.A0A.values();
        C14360o3.A07(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C9C6) it.next()).A00 = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C50092Rx c50092Rx = (C50092Rx) it2.next();
            A00(c50092Rx.A00(), this).A00 = c50092Rx;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A03 * 31;
        long j = this.A04;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A05;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A06;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.A09;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = (((((((i4 + hashCode) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i7 = (i6 + i5) * 31;
        int i8 = 1237;
        if (this.A0C) {
            i8 = 1231;
        }
        return ((((((i7 + i8) * 31) + this.A07.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0A.hashCode();
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            C2Rt.A00(A0A, this);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return super.toString();
        }
    }

    public C46952Dj() {
        C2E4 c2e4 = (C2E4) C2Dz.A00.A00;
        C16930sl c16930sl = C16930sl.A00;
        HashMap hashMap = new HashMap();
        C14360o3.A0B(c2e4, 11);
        C14360o3.A0B(c16930sl, 12);
        this.A03 = 0;
        this.A04 = -1L;
        this.A05 = -1L;
        this.A06 = 0L;
        this.A09 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A0C = false;
        this.A07 = c2e4;
        this.A0B = c16930sl;
        this.A0A = hashMap;
    }
}
