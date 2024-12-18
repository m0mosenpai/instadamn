package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;

/* renamed from: X.SfH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63212SfH {
    public static final String[] A09 = {GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public RBV[] A02;
    public RBV[] A03;
    public RBV[] A04;
    public final C45B A05;
    public final boolean A06;
    public final boolean A07;
    public final RBH[] A08 = new RBH[11];
    public int A00 = 0;
    public boolean A01 = false;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if ("valueOf".equals(r4.A05()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0016, code lost:
    
        if ((!r12) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r12 == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.RBH r10, int r11, boolean r12) {
        /*
            r9 = this;
            r3 = 1
            int r8 = r3 << r11
            r9.A01 = r3
            X.RBH[] r2 = r9.A08
            r4 = r2[r11]
            if (r4 == 0) goto L7c
            int r0 = r9.A00
            r0 = r0 & r8
            r5 = 0
            if (r0 == 0) goto L14
            if (r12 != 0) goto L18
        L13:
            return r5
        L14:
            r0 = r12 ^ 1
            if (r0 == 0) goto L7c
        L18:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r10.getClass()
            if (r1 != r0) goto L7c
            java.lang.Class r7 = r4.A0I(r5)
            java.lang.Class r6 = r10.A0I(r5)
            if (r7 != r6) goto L48
            java.lang.Class r1 = r10.A09()
            java.util.Iterator r0 = X.C914045z.A00
            java.lang.Class<java.lang.Enum> r6 = java.lang.Enum.class
            boolean r0 = r6.isAssignableFrom(r1)
            if (r0 == 0) goto L65
            java.lang.String r1 = r10.A05()
            java.lang.String r0 = "valueOf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            return r5
        L48:
            boolean r0 = r6.isAssignableFrom(r7)
            if (r0 != 0) goto L13
            boolean r0 = r7.isAssignableFrom(r6)
            if (r0 != 0) goto L7c
            boolean r1 = r7.isPrimitive()
            boolean r0 = r6.isPrimitive()
            if (r1 == r0) goto L95
            boolean r0 = r7.isPrimitive()
            if (r0 == 0) goto L7c
            return r5
        L65:
            java.lang.Class r0 = r4.A09()
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L95
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "valueOf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
        L7c:
            if (r12 == 0) goto L83
            int r0 = r9.A00
            r0 = r0 | r8
            r9.A00 = r0
        L83:
            boolean r0 = r9.A06
            if (r0 == 0) goto L92
            java.lang.reflect.AnnotatedElement r1 = r10.A07()
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            boolean r0 = r9.A07
            X.C914045z.A0H(r1, r0)
        L92:
            r2[r11] = r10
            return r3
        L95:
            java.lang.String[] r0 = X.C63212SfH.A09
            r1 = r0[r11]
            if (r12 == 0) goto La8
            java.lang.String r0 = "explicitly marked"
        L9d:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4, r10}
            java.lang.String r0 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            java.lang.IllegalArgumentException r0 = X.AbstractC58319PtB.A0j(r0, r1)
            throw r0
        La8:
            java.lang.String r0 = "implicitly discovered"
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63212SfH.A03(X.RBH, int, boolean):boolean");
    }

    public static AbstractC910944l A00(AnonymousClass469 anonymousClass469, C63212SfH c63212SfH, RBH rbh, RBV[] rbvArr) {
        if (c63212SfH.A01 && rbh != null) {
            int i = 0;
            if (rbvArr != null) {
                int length = rbvArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (rbvArr[i2] == null) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            C45T c45t = anonymousClass469.A02;
            AbstractC910944l A0G = rbh.A0G(i);
            C44W A00 = c45t.A00();
            if (A00 != null) {
                RBI A0H = rbh.A0H(i);
                Object A0Z = A00.A0Z(A0H);
                if (A0Z != null) {
                    return A0G.A0F(anonymousClass469.A0F(A0Z));
                }
                return A00.A0B(A0G, c45t, A0H);
            }
            return A0G;
        }
        return null;
    }

    public final void A02(RBH rbh, RBV[] rbvArr, boolean z) {
        Integer valueOf;
        Object put;
        if (A03(rbh, 9, z)) {
            int length = rbvArr.length;
            if (length > 1) {
                HashMap A1G = AbstractC166987dD.A1G();
                int i = 0;
                do {
                    String str = rbvArr[i].A06.A02;
                    if ((str.isEmpty() && rbvArr[i].A0B() != null) || (put = A1G.put(str, (valueOf = Integer.valueOf(i)))) == null) {
                        i++;
                    } else {
                        throw AbstractC58319PtB.A0j("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{str, put, valueOf, C914045z.A06(this.A05.A05.A00)});
                    }
                } while (i < length);
            }
            this.A04 = rbvArr;
        }
    }

    public C63212SfH(C45T c45t, C45B c45b) {
        this.A05 = c45b;
        this.A06 = c45t.A05();
        this.A07 = c45t.A07();
    }

    public final void A01(RBH rbh, RBV[] rbvArr, int i, boolean z) {
        if (rbh.A0G(i).A0M()) {
            if (A03(rbh, 10, z)) {
                this.A02 = rbvArr;
            }
        } else {
            if (!A03(rbh, 8, z)) {
                return;
            }
            this.A03 = rbvArr;
        }
    }
}
