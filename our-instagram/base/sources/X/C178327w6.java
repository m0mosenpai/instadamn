package X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.7w6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C178327w6 extends AbstractC178277w1 implements InterfaceC178337w7 {
    public int ArS(int i) {
        switch (i) {
            case 1004:
                return 10;
            case 1005:
                return 0;
            case 1006:
            default:
                return CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            case 1007:
                return CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        }
    }

    public boolean CUZ(int i) {
        return i == 94 || i == 95;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7vu] */
    @Deprecated
    public C178327w6() {
        this.A00 = new Object();
    }

    @Override // X.InterfaceC178337w7
    public final String ArT(int i) {
        if (this instanceof C178317w5) {
            if (!C18U.A06(C06090Tz.A05, ((C178317w5) this).A00, 36311173938938318L)) {
                return "baseline";
            }
            return "high";
        }
        return "baseline";
    }

    public long B5H(int i) {
        switch (i) {
            case 4:
                return 10000L;
            case 5:
                return 200L;
            case 6:
            case 7:
                return -1L;
            default:
                return 0L;
        }
    }

    @Override // X.InterfaceC178337w7
    public final String B5M(int i) {
        if (this instanceof C178317w5) {
            C178317w5 c178317w5 = (C178317w5) this;
            if (i != 1) {
                if (i == 3) {
                    return "prewarm_and_muxer_generate";
                }
                return "";
            }
            return C18U.A04(C06090Tz.A05, c178317w5.A00, 36877254923387010L);
        }
        return "";
    }

    @Override // X.InterfaceC178287w2
    public final C178307w4 BKX() {
        return InterfaceC178337w7.A00;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3 A[RETURN] */
    @Override // X.InterfaceC178337w7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CUa(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C178317w5
            if (r0 == 0) goto Le
            r0 = r5
            X.7w5 r0 = (X.C178317w5) r0
            r1 = 1
            switch(r6) {
                case 65: goto L44;
                case 66: goto L56;
                case 67: goto L68;
                case 68: goto L7a;
                default: goto Lb;
            }
        Lb:
            switch(r6) {
                case 74: goto L22;
                case 75: goto L10;
                case 76: goto L8c;
                case 77: goto La4;
                default: goto Le;
            }
        Le:
            r1 = 0
        Lf:
            return r1
        L10:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818185147158(0x81016800130316, double:3.0270782640182297E-306)
            goto L9d
        L22:
            com.instagram.common.session.UserSession r3 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r3)
            if (r0 == 0) goto Lb3
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36593069822509993(0x820134000303a9, double:3.2049429319959284E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r2 = (int) r0
            r0 = 48000(0xbb80, float:6.7262E-41)
            r1 = 0
            if (r2 != r0) goto Lf
            r1 = 1
            return r1
        L44:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818185016084(0x81016800110314, double:3.027078263935338E-306)
            goto L9d
        L56:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818185540378(0x8101680019031a, double:3.0270782642669036E-306)
            goto L9d
        L68:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818185605915(0x810168001a031b, double:3.0270782643083494E-306)
            goto L9d
        L7a:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818184688400(0x810168000c0310, double:3.027078263728109E-306)
            goto L9d
        L8c:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r4)
            if (r0 != 0) goto Le
            X.0Tz r0 = X.C06090Tz.A06
            r2 = 36311818185409304(0x81016800170318, double:3.027078264184012E-306)
        L9d:
            boolean r0 = X.C18U.A06(r0, r4, r2)
            if (r0 == 0) goto Le
            return r1
        La4:
            com.instagram.common.session.UserSession r3 = r0.A00
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC195898lZ.A00(r0, r3)
            if (r0 == 0) goto Lbb
            boolean r1 = X.AbstractC54272Nys.A00(r3)
            return r1
        Lb3:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36311818185081621(0x81016800120315, double:3.027078263976784E-306)
            goto Lc2
        Lbb:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36311818185278231(0x81016800150317, double:3.027078264101121E-306)
        Lc2:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178327w6.CUa(int):boolean");
    }
}
