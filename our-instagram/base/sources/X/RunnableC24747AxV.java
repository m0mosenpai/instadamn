package X;

import android.view.View;

/* renamed from: X.AxV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24747AxV implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C170327il A02;

    public RunnableC24747AxV(View view, C76223bS c76223bS, C170327il c170327il) {
        this.A01 = c76223bS;
        this.A00 = view;
        this.A02 = c170327il;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r9 != null) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            X.3bS r0 = r1.A01
            android.content.Context r13 = X.AbstractC77363dM.A00(r0)
            android.view.View r4 = r1.A00
            X.7il r0 = r1.A02
            com.instagram.common.session.UserSession r14 = r0.A03
            X.7bW r7 = r0.A01
            X.7di r0 = r0.A00
            X.7h1 r10 = r0.A03
            X.5Mi r9 = r0.A08
            r0 = 2
            X.C14360o3.A0B(r14, r0)
            r3 = 1
            X.1Ai r2 = X.AbstractC23021Ah.A00(r14)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r6.toSeconds(r0)
            X.0xq r2 = r2.A01
            java.lang.String r5 = "seen_comment_create_barcelona_post_nux_time_seconds"
            r0 = 0
            long r0 = r2.getLong(r5, r0)
            long r11 = r11 - r0
            boolean r1 = X.AbstractC14490oL.A0A(r13)
            r0 = 0
            if (r1 == 0) goto La0
            java.lang.String r8 = "seen_comment_create_barcelona_post_nux_count"
            int r1 = r2.getInt(r8, r0)
            r0 = 3
            if (r1 >= r0) goto La0
            r1 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto La0
            if (r10 != 0) goto L51
            r19 = 0
            if (r9 == 0) goto L53
        L51:
            r19 = 1
        L53:
            r0 = 0
            if (r7 == 0) goto La1
            com.instagram.user.model.User r2 = r7.A0A
            X.3bi r1 = r7.A04
            com.instagram.model.mediatype.ProductType r0 = r7.A07
        L5c:
            r17 = r2
            r18 = r3
            r16 = r0
            r15 = r1
            boolean r0 = X.AbstractC225889y7.A00(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto La0
            X.0xq r0 = X.AbstractC166987dD.A0x(r14)
            X.0xo r0 = X.AbstractC167017dG.A0g(r0, r8)
            r0.apply()
            X.0xq r0 = X.AbstractC166987dD.A0x(r14)
            X.0xo r2 = r0.ARD()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r6.toSeconds(r0)
            r2.E7G(r5, r0)
            r2.apply()
            r1 = 2131956444(0x7f1312dc, float:1.9549444E38)
            android.app.Activity r0 = X.AbstractC13330mJ.A00(r13)
            X.5SU r0 = X.AbstractC167007dF.A0U(r0, r1)
            r0.A03(r4)
            r0.A02()
            r0.A0A = r3
            X.AbstractC166997dE.A1P(r0)
        La0:
            return
        La1:
            r2 = r0
            r1 = r0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC24747AxV.run():void");
    }
}
