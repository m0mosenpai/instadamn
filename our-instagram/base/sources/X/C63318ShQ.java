package X;

import android.os.Build;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.ShQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63318ShQ {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        if (r4 == X.C4IB.A0B) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r4 < 29) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(android.app.Activity r8, X.C51760Mtj r9) {
        /*
            r7 = 0
            r6 = 1
            java.lang.Object r4 = r9.A00
            java.lang.Object r2 = r9.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r9.A01
            X.4IB r0 = X.C4IB.A09
            java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
            r3 = 29
            if (r4 == r0) goto L25
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L8b
            X.Rfq r0 = X.EnumC61136Rfq.A04
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L8b
            boolean r0 = X.AbstractC23451Ch.A05(r8, r1)
            if (r0 != 0) goto L8b
            return r7
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r4 < r0) goto L38
            java.lang.Integer r0 = X.C05F.A00
            if (r5 != r0) goto L4d
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            boolean r0 = X.AbstractC23451Ch.A05(r8, r0)
            if (r0 != 0) goto L4d
            return r7
        L38:
            r0 = 33
            if (r4 >= r0) goto L4d
            X.Rfq r0 = X.EnumC61136Rfq.A05
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L7a
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
        L46:
            boolean r0 = X.AbstractC23451Ch.A05(r8, r0)
            if (r0 != 0) goto L7a
            return r7
        L4d:
            X.Rfq r0 = X.EnumC61136Rfq.A03
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5e
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = X.AbstractC23451Ch.A05(r8, r0)
            if (r0 != 0) goto L5e
            return r7
        L5e:
            X.Rfq r0 = X.EnumC61136Rfq.A02
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = X.AbstractC23451Ch.A05(r8, r0)
            if (r0 != 0) goto L6f
            return r7
        L6f:
            X.Rfq r0 = X.EnumC61136Rfq.A07
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            goto L46
        L7a:
            if (r4 < r3) goto L8f
        L7c:
            X.Rfq r0 = X.EnumC61136Rfq.A04
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L8f
            boolean r0 = X.AbstractC23451Ch.A05(r8, r1)
            if (r0 != 0) goto L8f
            return r7
        L8b:
            X.4IB r0 = X.C4IB.A0B
            if (r4 != r0) goto L25
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63318ShQ.A03(android.app.Activity, X.Mtj):boolean");
    }

    public static final List A00(C51760Mtj c51760Mtj, C63318ShQ c63318ShQ) {
        java.util.Set A02;
        int ordinal = ((C4IB) c51760Mtj.A00).ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    return C16930sl.A00;
                }
                java.util.Set A022 = c63318ShQ.A02(c51760Mtj);
                List list = (List) c51760Mtj.A02;
                LinkedHashSet A0l = AbstractC31171DnF.A0l();
                if (Build.VERSION.SDK_INT >= 29 && list.contains(EnumC61136Rfq.A04)) {
                    A0l.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                A0l.add(AbstractC43591JPw.A00(2));
                A02 = AnonymousClass090.A00(A0l, A022);
            } else {
                List list2 = (List) c51760Mtj.A02;
                A02 = AbstractC31171DnF.A0l();
                if (Build.VERSION.SDK_INT >= 29 && list2.contains(EnumC61136Rfq.A04)) {
                    A02.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                A02.add(AbstractC43591JPw.A00(2));
            }
        } else {
            A02 = c63318ShQ.A02(c51760Mtj);
        }
        return AbstractC001800i.A0a(A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r3.contains(X.EnumC61136Rfq.A07) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set A02(X.C51760Mtj r8) {
        /*
            r7 = this;
            java.lang.Object r3 = r8.A02
            java.util.List r3 = (java.util.List) r3
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r6 < r0) goto L68
            java.lang.Object r1 = r8.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L68
            X.Rfq r1 = X.EnumC61136Rfq.A04
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            X.0e4 r5 = X.AbstractC166987dD.A1L(r1, r0)
            X.Rfq r1 = X.EnumC61136Rfq.A02
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            X.0e4 r4 = X.AbstractC166987dD.A1L(r1, r0)
            X.Rfq r1 = X.EnumC61136Rfq.A03
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r1, r0)
            X.Rfq r1 = X.EnumC61136Rfq.A07
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            java.util.LinkedHashMap r5 = X.AbstractC167017dG.A0u(r1, r0, r5, r4, r2)
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.Set r2 = X.AbstractC16830sb.A06(r0)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r3.iterator()
        L42:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L42
            r4.add(r0)
            goto L42
        L56:
            java.util.Iterator r1 = r4.iterator()
        L5a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L5a
        L68:
            java.util.LinkedHashSet r2 = X.AbstractC31171DnF.A0l()
            java.lang.String r5 = "android.permission.ACCESS_MEDIA_LOCATION"
            r0 = 33
            if (r6 < r0) goto La5
            X.Rfq r0 = X.EnumC61136Rfq.A02
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L7f
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            r2.add(r0)
        L7f:
            X.Rfq r0 = X.EnumC61136Rfq.A03
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L8c
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            r2.add(r0)
        L8c:
            X.Rfq r0 = X.EnumC61136Rfq.A07
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L99
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
        L96:
            r2.add(r1)
        L99:
            X.Rfq r0 = X.EnumC61136Rfq.A04
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto La4
            r2.add(r5)
        La4:
            return r2
        La5:
            r4 = 29
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            X.Rfq r0 = X.EnumC61136Rfq.A05
            boolean r0 = r3.contains(r0)
            if (r6 < r4) goto Lcc
            if (r0 != 0) goto L96
            X.Rfq r0 = X.EnumC61136Rfq.A02
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L96
            X.Rfq r0 = X.EnumC61136Rfq.A03
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L96
            X.Rfq r0 = X.EnumC61136Rfq.A07
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L99
            goto L96
        Lcc:
            if (r0 != 0) goto Le6
            X.Rfq r0 = X.EnumC61136Rfq.A02
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto Le6
            X.Rfq r0 = X.EnumC61136Rfq.A03
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto Le6
            X.Rfq r0 = X.EnumC61136Rfq.A07
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto La4
        Le6:
            r2.add(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63318ShQ.A02(X.Mtj):java.util.Set");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (X.C14360o3.A0K(r4, "android.permission.READ_MEDIA_VIDEO") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r12.A01 != X.C05F.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map A01(X.C51760Mtj r12, X.C63318ShQ r13, java.util.Map r14) {
        /*
            java.util.LinkedHashMap r2 = X.AbstractC166987dD.A1I()
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r0 < r6) goto L11
            java.lang.Object r1 = r12.A01
            java.lang.Integer r0 = X.C05F.A00
            r11 = 1
            if (r1 == r0) goto L12
        L11:
            r11 = 0
        L12:
            java.util.List r5 = A00(r12, r13)
            java.util.Iterator r10 = r5.iterator()
            r9 = 0
        L1b:
            boolean r0 = r10.hasNext()
            java.lang.String r8 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r7 = "android.permission.READ_MEDIA_VIDEO"
            if (r0 == 0) goto L63
            java.lang.Object r4 = r10.next()
            java.lang.Object r3 = r14.get(r4)
            if (r3 != 0) goto L3c
            X.Rfq r0 = X.EnumC61136Rfq.A06
            java.lang.String r1 = r0.toString()
            X.4IC r0 = X.C4IC.A0C
            java.util.Map r2 = X.AbstractC167007dF.A0n(r1, r0)
        L3b:
            return r2
        L3c:
            X.4IC r0 = X.C4IC.A06
            if (r3 == r0) goto L5f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L5f
            if (r9 != 0) goto L55
            boolean r0 = X.C14360o3.A0K(r4, r8)
            if (r0 != 0) goto L55
            boolean r0 = X.C14360o3.A0K(r4, r7)
            r9 = 0
            if (r0 == 0) goto L56
        L55:
            r9 = 1
        L56:
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 == 0) goto L5f
            r11 = 0
        L5f:
            r2.put(r4, r3)
            goto L1b
        L63:
            if (r11 == 0) goto L3b
            if (r9 == 0) goto L3b
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L3b
            boolean r0 = r5.contains(r7)
            if (r0 == 0) goto L76
            X.4IC r0 = X.C4IC.A0D
            r2.put(r7, r0)
        L76:
            boolean r0 = r5.contains(r8)
            if (r0 == 0) goto L3b
            X.4IC r0 = X.C4IC.A0D
            r2.put(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63318ShQ.A01(X.Mtj, X.ShQ, java.util.Map):java.util.Map");
    }
}
