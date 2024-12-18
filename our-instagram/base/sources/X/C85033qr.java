package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85033qr {
    public final UserSession A00;
    public final C59712oE A01;

    public final int A00(UserSession userSession, C38321qM c38321qM) {
        int i;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        Integer valueOf = Integer.valueOf(c38321qM.A0s());
        InterfaceC101404gy A00 = AbstractC76903cc.A00(c38321qM);
        if (A00 != null) {
            float f = 0.0f;
            for (int i2 = 0; i2 < AbstractC140306Wi.A03(userSession, A00, true).length; i2++) {
                f += r4[i2];
            }
            i = (int) f;
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{valueOf, Integer.valueOf(i), false});
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36327473339841119L) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r22.A3E != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C206249Bh A01(android.content.Context r18, X.C110914z3 r19, X.C38321qM r20, X.InterfaceC60442pS r21, X.C75113Zb r22) {
        /*
            r17 = this;
            r11 = 0
            r2 = r20
            X.C14360o3.A0B(r2, r11)
            r0 = 1
            r13 = r22
            X.C14360o3.A0B(r13, r0)
            r0 = 2
            r6 = r18
            X.C14360o3.A0B(r6, r0)
            r0 = 4
            r5 = r21
            X.C14360o3.A0B(r5, r0)
            r3 = r17
            com.instagram.common.session.UserSession r7 = r3.A00
            boolean r0 = r2.A5v()
            if (r0 != 0) goto L37
            boolean r0 = r2.A5m()
            if (r0 != 0) goto L37
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36327473339841119(0x810fa500023a5f, double:3.036978646884939E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            r16 = 1
            if (r0 != 0) goto L39
        L37:
            r16 = 0
        L39:
            if (r16 == 0) goto L40
            boolean r0 = r13.A3E
            r15 = 0
            if (r0 == 0) goto L41
        L40:
            r15 = 1
        L41:
            r5.getModuleName()
            boolean r0 = X.AbstractC76903cc.A04(r7, r2)
            if (r0 == 0) goto L79
            X.4gy r8 = X.AbstractC76903cc.A00(r2)
            r12 = 1
            X.9Ew r10 = new X.9Ew
            r10.<init>(r12, r2, r3)
            r0 = 8
            X.9FQ r9 = new X.9FQ
            r9.<init>(r0, r2, r3, r13)
            java.lang.CharSequence r14 = X.AbstractC76903cc.A01(r6, r7, r8, r9, r10, r11, r12)
        L5f:
            r0 = 7
            X.9FQ r4 = new X.9FQ
            r4.<init>(r0, r2, r3, r13)
            r0 = 23
            X.9Dp r1 = new X.9Dp
            r1.<init>(r13, r0)
            X.472 r0 = X.AnonymousClass472.A00
            X.9Bd r12 = new X.9Bd
            r12.<init>(r4, r1, r0)
            X.9Bh r11 = new X.9Bh
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L79:
            X.471 r0 = X.AnonymousClass471.A00
            boolean r0 = r0.A05(r7, r2)
            if (r0 == 0) goto L98
            com.instagram.api.schemas.CommentPrompt r1 = X.AnonymousClass471.A00(r2)
            java.lang.String r14 = ""
            if (r1 == 0) goto L5f
            android.content.res.Resources r0 = r6.getResources()
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.AnonymousClass471.A02(r0, r1, r7, r11)
            if (r0 == 0) goto L5f
            r14 = r0
            goto L5f
        L98:
            X.2oE r0 = r3.A01
            boolean r0 = r0.A02(r2)
            r5 = r19
            if (r0 == 0) goto Laf
            r1 = 2131976825(0x7f136279, float:1.9590781E38)
        La5:
            android.content.Context r0 = r5.A00
            java.lang.String r14 = r0.getString(r1)
        Lab:
            X.C14360o3.A07(r14)
            goto L5f
        Laf:
            int r1 = r2.A0s()
            r0 = 1
            if (r1 != r0) goto Lba
            r1 = 2131976821(0x7f136275, float:1.9590773E38)
            goto La5
        Lba:
            java.util.Locale r0 = X.C1Q2.A02()
            java.text.NumberFormat r4 = java.text.NumberFormat.getInstance(r0)
            long r0 = (long) r1
            java.lang.String r0 = r4.format(r0)
            X.C14360o3.A07(r0)
            r4 = 2131976826(0x7f13627a, float:1.9590783E38)
            android.content.Context r1 = r5.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r14 = r1.getString(r4, r0)
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85033qr.A01(android.content.Context, X.4z3, X.1qM, X.2pS, X.3Zb):X.9Bh");
    }

    public C85033qr(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new C59712oE(userSession);
    }
}
