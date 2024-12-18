package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.OeY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55213OeY {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public RtcCallKey A0K;
    public Integer A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public final int A0P;
    public final OKO A0Q;
    public final EnumC46283KeF A0R;
    public final C54823OLg A0S;
    public final InterfaceC11360iu A0T;
    public final UserSession A0U;
    public final C54678ODe A0V;
    public final RealtimeClientManager A0W;
    public final C54978OTk A0X;
    public final NH7 A0Y;
    public final C1CM A0Z;
    public final Integer A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final boolean A0f;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r1.A06() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19280xC A00(X.OME r9, X.C55213OeY r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55213OeY.A00(X.OME, X.OeY):X.0xC");
    }

    public static final OME A01(C55213OeY c55213OeY, String str) {
        String str2;
        String str3;
        RtcCallKey rtcCallKey = c55213OeY.A0K;
        if (rtcCallKey != null) {
            str2 = rtcCallKey.A00;
        } else {
            str2 = null;
        }
        OME ome = new OME();
        ome.A03(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        ome.A03("server_info_data", str2);
        if (c55213OeY.A0a.intValue() != 0) {
            str3 = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else {
            str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        ome.A03("call_type", str3);
        return ome;
    }

    public static final void A02(EnumC53328Ni7 enumC53328Ni7, C55213OeY c55213OeY, InterfaceC16660sJ interfaceC16660sJ) {
        OXE oxe = OXE.A00;
        String str = enumC53328Ni7.A00;
        oxe.A00("RtcWaterfallImpl", AnonymousClass001.A0R("log: ", str));
        if (c55213OeY.A0f && !enumC53328Ni7.A01) {
            return;
        }
        OME A01 = A01(c55213OeY, str);
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(A01);
        }
        c55213OeY.A0T.EHW(A00(A01, c55213OeY));
    }

    public static final void A03(InterfaceC58062Pon interfaceC58062Pon, C55213OeY c55213OeY) {
        if (c55213OeY.A0f && !interfaceC58062Pon.C0P().A01) {
            return;
        }
        OME A01 = A01(c55213OeY, interfaceC58062Pon.C0P().A00);
        interfaceC58062Pon.Avc().invoke(A01);
        c55213OeY.A0T.EHW(A00(A01, c55213OeY));
    }

    public static final void A04(C55213OeY c55213OeY) {
        long j = c55213OeY.A07;
        long j2 = c55213OeY.A06;
        long j3 = 0;
        if (j2 != 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        c55213OeY.A07 = j + j3;
        c55213OeY.A06 = 0L;
    }

    public static final void A05(C55213OeY c55213OeY) {
        long j = c55213OeY.A08;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        int intValue = c55213OeY.A0L.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                c55213OeY.A03 += j2;
                return;
            } else {
                c55213OeY.A05 += j2;
                return;
            }
        }
        c55213OeY.A04 += j2;
    }

    public static final void A06(C55213OeY c55213OeY) {
        long j = c55213OeY.A0F;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        int intValue = c55213OeY.A0L.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                c55213OeY.A00 += j2;
                return;
            } else {
                c55213OeY.A0G += j2;
                return;
            }
        }
        c55213OeY.A0C += j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C55213OeY(android.content.Context r4, X.EnumC46283KeF r5, com.instagram.common.session.UserSession r6, com.instagram.model.rtc.RtcCallFunnelSessionId r7, com.instagram.model.rtc.RtcCallKey r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r3 = this;
            X.0xH r2 = X.AbstractC11060iN.A00(r6)
            com.instagram.realtimeclient.RealtimeClientManager r1 = com.instagram.realtimeclient.RealtimeClientManager.getInstance(r6)
            X.OLg r0 = new X.OLg
            r0.<init>(r6)
            r3.<init>()
            r3.A0U = r6
            r3.A0K = r8
            r3.A0e = r11
            r3.A0d = r12
            r3.A0b = r13
            r3.A0c = r14
            r3.A0R = r5
            r3.A0a = r9
            r3.A0f = r15
            r3.A0T = r2
            r3.A0W = r1
            r3.A0S = r0
            if (r7 == 0) goto L34
            boolean r0 = r7 instanceof com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString
            if (r0 == 0) goto L78
            com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString r7 = (com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) r7
            java.lang.String r1 = r7.A00
        L32:
            if (r1 != 0) goto L38
        L34:
            java.lang.String r1 = X.AbstractC167017dG.A0j()
        L38:
            X.NH7 r0 = new X.NH7
            r0.<init>(r10, r1)
            r3.A0Y = r0
            X.1CM r2 = new X.1CM
            r2.<init>(r4)
            r3.A0Z = r2
            r0 = 37
            X.MDj r1 = new X.MDj
            r1.<init>(r6, r0)
            java.lang.Class<X.ODe> r0 = X.C54678ODe.class
            java.lang.Object r0 = r6.A01(r0, r1)
            X.ODe r0 = (X.C54678ODe) r0
            r3.A0V = r0
            java.lang.Integer r0 = X.C05F.A00
            r3.A0L = r0
            X.C1CM.A00(r2)
            int r0 = r2.A00
            r3.A0P = r0
            java.lang.String r0 = "/proc/self/stat"
            java.lang.String[] r0 = X.OZK.A02(r0)
            X.OKO r0 = X.OZK.A01(r0)
            r3.A0Q = r0
            X.Pe7 r1 = X.C57409Pe7.A00
            X.OTk r0 = new X.OTk
            r0.<init>(r1)
            r3.A0X = r0
            return
        L78:
            com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId r7 = (com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) r7
            android.os.ParcelUuid r0 = r7.A00
            java.lang.String r1 = X.AbstractC166987dD.A19(r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55213OeY.<init>(android.content.Context, X.KeF, com.instagram.common.session.UserSession, com.instagram.model.rtc.RtcCallFunnelSessionId, com.instagram.model.rtc.RtcCallKey, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A07(C55213OeY c55213OeY, Integer num) {
        A06(c55213OeY);
        c55213OeY.A0F = SystemClock.elapsedRealtime();
        if (c55213OeY.A08 > 0) {
            A05(c55213OeY);
            c55213OeY.A08 = SystemClock.elapsedRealtime();
        }
        c55213OeY.A0L = num;
    }
}
