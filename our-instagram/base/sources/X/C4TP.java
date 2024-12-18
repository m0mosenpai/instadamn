package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;

/* renamed from: X.4TP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TP {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C2B4 A04;
    public EnumC440821q A05;
    public String A06;
    public long A07;
    public final Handler A08;
    public final EnumC440821q A09;
    public final C46282Ap A0A;
    public final HeroPlayerSetting A0B;
    public final Runnable A0C;
    public final VpsEventCallback A0D;
    public final InterfaceC92404Bv A0E;
    public final C4SS A0F;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4TP(android.os.Handler r8, com.facebook.exoplayer.monitor.VpsEventCallback r9, X.InterfaceC92404Bv r10, X.C4SS r11, X.C46282Ap r12, com.facebook.video.heroplayer.setting.HeroPlayerSetting r13) {
        /*
            r7 = this;
            r2 = 1
            X.C14360o3.A0B(r8, r2)
            r7.<init>()
            r7.A08 = r8
            r7.A0B = r13
            r7.A0F = r11
            r7.A0A = r12
            r7.A0D = r9
            r7.A0E = r10
            r0 = 0
            r7.A01 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A03 = r0
            r0 = -1
            r7.A07 = r0
            int r1 = r13.A0f
            r0 = 2
            if (r1 == r0) goto L6e
            if (r1 != r2) goto L6b
            X.21q r6 = X.EnumC440821q.A02
        L29:
            r7.A09 = r6
            r7.A05 = r6
            X.4TQ r0 = X.C4TQ.A00
            r7.A0C = r0
            java.lang.String r0 = ""
            r7.A06 = r0
            X.21v r0 = A00(r6, r7)
            boolean r0 = r0.A0g
            if (r0 == 0) goto L68
            X.21q r0 = X.EnumC440821q.A04
        L3f:
            r7.A05 = r0
            r7.A05()
            X.21q r0 = r7.A05
            X.21v r0 = A00(r0, r7)
            int r0 = r0.A0R
            long r2 = (long) r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5a
            android.os.Handler r1 = r7.A08
            java.lang.Runnable r0 = r7.A0C
            r1.postDelayed(r0, r2)
        L5a:
            X.21q r2 = r7.A05
            java.lang.String r1 = "Initial:"
            java.lang.String r0 = r7.A06
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            A01(r6, r2, r7, r0)
            return
        L68:
            X.21q r0 = r7.A05
            goto L3f
        L6b:
            java.lang.String r0 = "Classifier"
            goto L70
        L6e:
            java.lang.String r0 = "ToggleNormal"
        L70:
            r7.A06 = r0
            X.21q r6 = X.EnumC440821q.A04
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TP.<init>(android.os.Handler, com.facebook.exoplayer.monitor.VpsEventCallback, X.4Bv, X.4SS, X.2Ap, com.facebook.video.heroplayer.setting.HeroPlayerSetting):void");
    }

    public static final C441321v A00(EnumC440821q enumC440821q, C4TP c4tp) {
        C441321v c441321v = (C441321v) c4tp.A0B.A1A.get(enumC440821q);
        if (c441321v == null) {
            return new C441321v();
        }
        return c441321v;
    }

    public static final void A01(EnumC440821q enumC440821q, EnumC440821q enumC440821q2, C4TP c4tp, String str) {
        VpsEventCallback vpsEventCallback = c4tp.A0D;
        System.currentTimeMillis();
        A00(enumC440821q2, c4tp);
        vpsEventCallback.callback(new C4TR(enumC440821q, enumC440821q2, str));
        HashMap hashMap = new HashMap();
        hashMap.put("latency_level", enumC440821q2.toString());
        hashMap.put("target_latency_level", enumC440821q.toString());
        hashMap.put("settings", A00(enumC440821q2, c4tp).A0a);
        hashMap.put("reason", c4tp.A06);
    }

    private final boolean A03(int i, int i2) {
        long j;
        C2B4 c2b4 = this.A04;
        if (c2b4 != null) {
            j = c2b4.A00().getEstimatedThroughput(i2, null);
        } else {
            j = 0;
        }
        if (j <= i) {
            return false;
        }
        return true;
    }

    private final boolean A04(C441321v c441321v) {
        C2B4 c2b4;
        long j;
        String str;
        C2B4 c2b42;
        if (c441321v.A0e && !this.A0A.A03.A01()) {
            str = "cell";
        } else {
            String str2 = c441321v.A0Y;
            C14360o3.A06(str2);
            if (str2.length() != 0 && !AbstractC001900j.A0a(str2, "UNKNOWN", true)) {
                str = "connection";
            } else {
                int i = c441321v.A0E;
                if (i > 0 && this.A00 <= i) {
                    str = "abr_bitrate";
                } else if (c441321v.A0f) {
                    str = AnonymousClass001.A0R("not QUIC: ", null);
                } else {
                    int i2 = c441321v.A0D;
                    if (i2 > 0 && (c2b42 = this.A04) != null) {
                        c2b42.A00();
                        if (!A03(i2, c441321v.A0C)) {
                            str = "low_bandwidth";
                        }
                    }
                    int i3 = c441321v.A0H;
                    if (i3 > 0 && (c2b4 = this.A04) != null) {
                        c2b4.A00();
                        int i4 = c441321v.A0G;
                        C2B4 c2b43 = this.A04;
                        if (c2b43 != null) {
                            j = c2b43.A00().getEstimatedRequestTTFBMs(i4, null);
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (j >= i3) {
                            str = "high_ttfb";
                        }
                    }
                    return false;
                }
            }
        }
        this.A06 = str;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4TP.A05():void");
    }

    public static final void A02(C4TP c4tp) {
        c4tp.A03 = SystemClock.elapsedRealtime();
        c4tp.A07 = SystemClock.elapsedRealtime();
        c4tp.A02 = 0;
        Handler handler = c4tp.A08;
        Runnable runnable = c4tp.A0C;
        handler.removeCallbacks(runnable);
        long j = A00(c4tp.A05, c4tp).A0R;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        }
    }
}
