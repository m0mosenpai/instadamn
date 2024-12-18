package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* loaded from: classes6.dex */
public abstract class FU0 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r11 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, int r12, boolean r13) {
        /*
            r4 = 1
            int r7 = X.AbstractC167007dF.A06(r4, r9, r10)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36599383425486347(0x8206f200130e0b, double:3.208935679941013E-306)
            int r2 = X.AbstractC25225BEi.A07(r2, r9, r0)
            r0 = 0
            if (r2 == r4) goto L9c
            r1 = 3
            if (r2 == r7) goto L6e
            if (r2 != r1) goto L6a
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            if (r12 <= r1) goto L6b
            if (r11 == 0) goto L55
            android.content.res.Resources r6 = r8.getResources()
            r5 = 2131820665(0x7f110079, float:1.9274051E38)
            int r3 = r12 - r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = X.AbstractC43744JWe.A01(r1, r2, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r1}
            java.lang.String r1 = r6.getQuantityString(r5, r3, r1)
            X.C14360o3.A07(r1)
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L47:
            r1 = 2131959590(0x7f131f26, float:1.9555825E38)
            java.lang.String r1 = X.AbstractC31177DnL.A0b(r8, r11, r1)
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L55:
            android.content.res.Resources r2 = X.AbstractC166997dE.A0M(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = X.AbstractC31437Drh.A01(r2, r1, r4)
            if (r1 == 0) goto L6a
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L6a:
            return r0
        L6b:
            if (r11 == 0) goto L55
            goto L47
        L6e:
            if (r11 == 0) goto L9c
            if (r12 != r7) goto L7d
            r0 = 2131959590(0x7f131f26, float:1.9555825E38)
            java.lang.String r1 = X.AbstractC167007dF.A0f(r8, r11, r0)
        L79:
            X.C14360o3.A07(r1)
            goto Laa
        L7d:
            if (r12 <= r1) goto L6a
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131820665(0x7f110079, float:1.9274051E38)
            int r12 = r12 - r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r0 = X.AbstractC43744JWe.A01(r0, r1, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            java.lang.String r1 = r3.getQuantityString(r2, r12, r0)
            goto L79
        L9c:
            android.content.res.Resources r2 = X.AbstractC166997dE.A0M(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = X.AbstractC31437Drh.A01(r2, r1, r4)
            if (r1 == 0) goto L6a
        Laa:
            java.lang.CharSequence r0 = A00(r8, r1, r10, r13)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FU0.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int, boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CharSequence A00(Context context, String str, String str2, boolean z) {
        String A0t = AbstractC31174DnI.A0t(context, str2, str, 2131959589);
        C14360o3.A07(A0t);
        String str3 = A0t;
        if (z) {
            int A08 = AbstractC001900j.A08(A0t, str2, 0, false);
            str3 = A0t;
            if (A08 != -1) {
                boolean A02 = AbstractC13620mo.A02(context);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0t);
                if (!A02) {
                    A08 += str2.length();
                }
                C85963sQ.A04(context, A0H, A08);
                str3 = A0H;
            }
        }
        return str3;
    }
}
