package X;

/* renamed from: X.Glz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37902Glz extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C120985dq A02;
    public final /* synthetic */ C37560GgG A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37902Glz(C120985dq c120985dq, C37560GgG c37560GgG, int i, int i2) {
        super(2056489509, 2, false, true);
        this.A03 = c37560GgG;
        this.A00 = i;
        this.A02 = c120985dq;
        this.A01 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if ((!X.C18U.A06(X.C06090Tz.A05, r3, 36328821959442234L)) != false) goto L13;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.GgG r0 = r9.A03     // Catch: java.lang.SecurityException -> Lc
            android.media.AudioManager r3 = r0.A08     // Catch: java.lang.SecurityException -> Lc
            r2 = 3
            int r1 = r9.A00     // Catch: java.lang.SecurityException -> Lc
            r0 = 1
            r3.adjustStreamVolume(r2, r1, r0)     // Catch: java.lang.SecurityException -> Lc
            goto L14
        Lc:
            r2 = move-exception
            java.lang.String r1 = "ClipsVideoPlayerController"
            java.lang.String r0 = "Failed to set the volume"
            X.C0K8.A0F(r1, r0, r2)
        L14:
            X.GgG r5 = r9.A03
            X.5dq r8 = r9.A02
            int r7 = r9.A01
            X.BKn r0 = X.C37560GgG.A04(r5)
            if (r0 == 0) goto L6f
            X.JIM r6 = X.C37560GgG.A05(r5, r0)
            if (r6 == 0) goto L6f
            android.media.AudioManager r1 = r5.A08
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            boolean r4 = X.AbstractC167007dF.A1O(r0)
            r0 = 25
            if (r7 != r0) goto L46
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328821959442234(0x8110df00003f3a, double:3.037831519351139E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L52
        L46:
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.1Hd r0 = X.AbstractC24321Hb.A00(r3)
            r0.A00(r4)
            X.C37560GgG.A0B(r8, r6, r5, r7)
        L52:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321962896664491(0x810aa2000027ab, double:3.0334938204312655E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6f
            X.1Ai r0 = r5.A0G
            r2 = r4 ^ 1
            X.0xo r1 = X.AbstractC166987dD.A0w(r0)
            java.lang.String r0 = "last_clips_volume_is_mute"
            r1.E77(r0, r2)
            r1.apply()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37902Glz.run():void");
    }
}
