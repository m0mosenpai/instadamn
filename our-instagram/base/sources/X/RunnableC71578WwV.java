package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

/* renamed from: X.WwV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71578WwV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ MediaTagHintsLayout A02;

    public RunnableC71578WwV(C75113Zb c75113Zb, MediaTagHintsLayout mediaTagHintsLayout, int i) {
        this.A02 = mediaTagHintsLayout;
        this.A01 = c75113Zb;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r4.A03 != null) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            X.3Zb r5 = r10.A01
            int r2 = r10.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto L99
            com.instagram.tagging.widget.MediaTagHintsLayout r4 = r10.A02
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            r7 = -1
            X.3tC r0 = r5.A07(r2, r7)
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L99
            r9 = 0
        L1d:
            int r0 = r4.getChildCount()
            if (r9 >= r0) goto L53
            android.view.View r8 = r4.getChildAt(r9)
            r0 = 0
            r8.setVisibility(r0)
            r0 = 1
            X.5le r1 = X.AbstractC125325le.A01(r8, r0)
            X.4nZ r0 = new X.4nZ
            r0.<init>()
            X.5le r6 = r1.A0D(r0)
            float r0 = r8.getPivotX()
            r3 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.A0U(r3, r1, r0)
            float r0 = r8.getPivotY()
            r6.A0V(r3, r1, r0)
            r6.A0M(r3, r1)
            r6.A0H()
            int r9 = r9 + 1
            goto L1d
        L53:
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            X.3tC r1 = r5.A07(r2, r7)
            java.lang.Integer r0 = X.C05F.A00
            r1.A01 = r0
            com.instagram.common.session.UserSession r0 = r4.A02
            r0.getClass()
            X.3tC r1 = r5.A07(r2, r7)
            r0 = 1
            r1.A05 = r0
            java.lang.Runnable r1 = r4.A04
            if (r1 == 0) goto L78
            android.os.Handler r0 = r4.A05
            r0.removeCallbacks(r1)
            r1 = 0
            r4.A04 = r1
        L78:
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto La7
            if (r1 != 0) goto L85
            java.lang.Runnable r1 = r4.A03
            r0 = 1
            if (r1 == 0) goto L86
        L85:
            r0 = 0
        L86:
            X.C18C.A0E(r0)
            X.WwW r3 = new X.WwW
            r3.<init>(r5, r4, r2)
            r4.A03 = r3
            android.os.Handler r2 = r4.A05
            int r0 = r4.A00
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            return
        L99:
            com.instagram.tagging.widget.MediaTagHintsLayout r2 = r10.A02
            java.lang.Runnable r1 = r2.A04
            if (r1 == 0) goto La7
            android.os.Handler r0 = r2.A05
            r0.removeCallbacks(r1)
            r0 = 0
            r2.A04 = r0
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC71578WwV.run():void");
    }
}
