package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3YG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YG implements C33R {
    public int A00;
    public C75113Zb A01;
    public final MediaTagHintsLayout A02;
    public final UserSession A03;

    public C3YG(UserSession userSession, MediaTagHintsLayout mediaTagHintsLayout) {
        C14360o3.A0B(mediaTagHintsLayout, 2);
        this.A03 = userSession;
        this.A02 = mediaTagHintsLayout;
        mediaTagHintsLayout.A02 = userSession;
        mediaTagHintsLayout.A01 = 500;
        mediaTagHintsLayout.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        this.A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        if (r5.A1y != false) goto L22;
     */
    @Override // X.C33R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSJ(X.C75113Zb r5, int r6) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            X.3Zb r0 = r4.A01
            if (r5 != r0) goto L13
            r0 = 10
            if (r6 == r0) goto L2a
            r0 = 58
            if (r6 == r0) goto L22
            switch(r6) {
                case 16: goto L43;
                case 17: goto L14;
                case 18: goto L2f;
                default: goto L13;
            }
        L13:
            return
        L14:
            int r1 = r4.A00
            r0 = -1
            X.3tC r0 = r5.A07(r1, r0)
            r0.A05 = r3
            boolean r0 = r5.A22
            if (r0 == 0) goto L13
            goto L52
        L22:
            boolean r0 = r5.A1z
            if (r0 == 0) goto L13
            X.AbstractC86383tB.A00(r5, r4, r3)
            return
        L2a:
            boolean r0 = r5.A1y
            if (r0 == 0) goto L52
            goto L33
        L2f:
            boolean r0 = r5.A1v
            if (r0 != 0) goto L13
        L33:
            com.instagram.tagging.widget.MediaTagHintsLayout r2 = r4.A02
            r2.A01()
            int r1 = r4.A00
            r0 = -1
            X.3tC r0 = r5.A07(r1, r0)
            r2.A02(r0, r3)
            return
        L43:
            X.3VZ r1 = r5.A0i
            X.3VZ r0 = X.C3VZ.A03
            if (r1 != r0) goto L56
            int r1 = r4.A00
            r0 = -1
            X.3tC r0 = r5.A07(r1, r0)
            r0.A05 = r3
        L52:
            r4.A00()
            return
        L56:
            r0 = 1
            X.AbstractC86383tB.A00(r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YG.DSJ(X.3Zb, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r4.A03 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r6 = this;
            X.3Zb r5 = r6.A01
            if (r5 == 0) goto L4c
            int r0 = r6.A00
            r1 = -1
            X.3tC r0 = r5.A07(r0, r1)
            boolean r0 = r0.A05
            if (r0 != 0) goto L4c
            int r0 = r6.A00
            X.3tC r0 = r5.A07(r0, r1)
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L4c
            int r0 = r6.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r0)
            if (r0 != 0) goto L4c
            com.instagram.tagging.widget.MediaTagHintsLayout r4 = r6.A02
            r4.A01()
            int r2 = r6.A00
            boolean r0 = com.instagram.tagging.widget.MediaTagHintsLayout.A00(r5, r2)
            if (r0 != 0) goto L4c
            java.lang.Runnable r0 = r4.A04
            if (r0 != 0) goto L39
            java.lang.Runnable r1 = r4.A03
            r0 = 1
            if (r1 == 0) goto L3a
        L39:
            r0 = 0
        L3a:
            X.C18C.A0E(r0)
            X.WwV r3 = new X.WwV
            r3.<init>(r5, r4, r2)
            r4.A04 = r3
            android.os.Handler r2 = r4.A05
            int r0 = r4.A01
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YG.A00():void");
    }
}
