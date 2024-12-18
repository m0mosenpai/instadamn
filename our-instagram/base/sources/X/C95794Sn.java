package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.service.errorcallback.ErrorCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95794Sn implements Handler.Callback {
    public float A01;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public Context A0F;
    public Handler A0G;
    public Handler A0H;
    public Surface A0I;
    public Surface A0J;
    public Surface A0K;
    public C2BZ A0L;
    public InterfaceC92404Bv A0M;
    public C4TN A0N;
    public C96844Wu A0O;
    public C2BV A0P;
    public C4Xk A0R;
    public C4YK A0S;
    public String A0W;
    public String A0X;
    public String A0Y;
    public Map A0a;
    public AtomicReference A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public long A0l;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final long A0q;
    public final HandlerThread A0r;
    public final C4TG A0s;
    public final C46282Ap A0t;
    public final C95834Ss A0u;
    public final C95844St A0v;
    public final HeroPlayerSetting A0w;
    public final AtomicBoolean A0x;
    public final AtomicBoolean A0y;
    public final AtomicBoolean A0z;
    public final AtomicBoolean A10;
    public final AtomicReference A12;
    public volatile C4SS A15;
    public volatile C4X4 A17;
    public volatile C96864Ww A18;
    public volatile C4TS A19;
    public volatile String A1A;
    public volatile String A1B;
    public volatile boolean A1C;
    public volatile boolean A1D;
    public volatile boolean A1E;
    public volatile boolean A1F;
    public volatile boolean A1G;
    public volatile boolean A1H;
    public Integer A0m = null;
    public final AtomicInteger A11 = new AtomicInteger();
    public C4TP A0Q = null;
    public Integer A0U = C05F.A0N;
    public float A00 = 1.0f;
    public int A02 = 1;
    public boolean A0f = false;
    public int A04 = 1;
    public int A03 = 10;
    public volatile C4RU A14 = new C4RU();
    public String A0V = "";
    public String A0Z = "";
    public C98154au A0T = null;
    public volatile C4RV A13 = C4RV.A0D;
    public volatile C95814Sp A16 = new C95814Sp();

    private void A02() {
        this.A15 = null;
        this.A0d = false;
        this.A0U = C05F.A0N;
        this.A0o = false;
        this.A0f = false;
        this.A1F = false;
        this.A0p = false;
        this.A0j = false;
        this.A01 = 0.0f;
        this.A00 = 1.0f;
        this.A02 = 1;
        this.A0i = false;
        this.A04 = 1;
        this.A03 = 10;
        this.A09 = -1L;
        this.A0c = false;
        this.A1D = false;
        this.A1C = false;
        this.A06 = 0;
        this.A05 = 0;
        this.A0A = 0L;
        this.A14 = new C4RU();
        this.A13 = C4RV.A0D;
        C4TS c4ts = this.A19;
        c4ts.A0R.clear();
        c4ts.A0A.EEv();
        this.A0h = false;
        this.A0e = false;
        this.A0k = false;
        this.A0x.set(true);
        this.A0n = false;
        this.A0l = -1L;
        this.A0T = null;
        this.A0Z = "";
        this.A0X = null;
        this.A0W = null;
        C4TS c4ts2 = this.A19;
        c4ts2.A0C = null;
        c4ts2.A04 = null;
        if (A0K(this)) {
            this.A19.A0A.Ece(0);
        }
    }

    public static synchronized void A09(C95794Sn c95794Sn) {
        HandlerThread BJ6;
        synchronized (c95794Sn) {
            A0E(c95794Sn, "restorePlaybackPriority", new Object[0]);
            if (c95794Sn.A0m != null && c95794Sn.A19 != null && (BJ6 = c95794Sn.A19.A0A.BJ6()) != null) {
                int threadId = BJ6.getThreadId();
                if (Integer.valueOf(threadId) != null) {
                    try {
                        Process.setThreadPriority(threadId, c95794Sn.A0m.intValue());
                        c95794Sn.A0m = null;
                    } catch (IllegalArgumentException | Exception unused) {
                    }
                }
            }
        }
    }

    public static void A0B(C95794Sn c95794Sn, float f) {
        A0E(c95794Sn, "setVolumeInternal to: %d (x100)", Integer.valueOf((int) (100.0f * f)));
        c95794Sn.A01 = f;
        if (f > 0.0f) {
            c95794Sn.A0J(true);
        }
        C4TS c4ts = c95794Sn.A19;
        C96814Wq AMX = c4ts.A0A.AMX(c4ts.A0G[1]);
        AMX.A01(2);
        AMX.A02(Float.valueOf(f));
        AMX.A00();
    }

    public static void A0C(C95794Sn c95794Sn, int i) {
        A0E(c95794Sn, "setAudioUsageInternal: %d", Integer.valueOf(i));
        c95794Sn.A02 = i;
        C4TS c4ts = c95794Sn.A19;
        C4UX c4ux = new C4UX(i);
        C96814Wq AMX = c4ts.A0A.AMX(c4ts.A0G[1]);
        AMX.A01(3);
        AMX.A02(c4ux);
        AMX.A00();
    }

    public static synchronized void A0D(C95794Sn c95794Sn, int i) {
        HandlerThread BJ6;
        synchronized (c95794Sn) {
            A0E(c95794Sn, "downgradePlaybackPriority", new Object[0]);
            if (c95794Sn.A0m == null && c95794Sn.A19 != null && (BJ6 = c95794Sn.A19.A0A.BJ6()) != null) {
                int threadId = BJ6.getThreadId();
                if (Integer.valueOf(threadId) != null) {
                    try {
                        c95794Sn.A0m = Integer.valueOf(Process.getThreadPriority(threadId));
                        Process.setThreadPriority(threadId, i);
                    } catch (IllegalArgumentException | Exception unused) {
                    }
                }
            }
        }
    }

    private void A0H(boolean z) {
        A0E(this, "resetInternal", new Object[0]);
        if (this.A1E) {
            this.A0v.E1k("EXOPLAYER2_UNEXPECTED", "RESET_INTERNAL_REQUESTED_AFTER_RELEASED", "resetInternal requested after released");
        }
        A0G(false);
        HeroPlayerSetting heroPlayerSetting = this.A0w;
        if (!heroPlayerSetting.A2J) {
            A05(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
        Surface surface = this.A0J;
        if (heroPlayerSetting.A31) {
            this.A0K = null;
            this.A0I = null;
            this.A0J = null;
            this.A0D = -1L;
            this.A08 = -1L;
            this.A19.A0A(null, true);
            this.A0I = null;
        }
        this.A0J = surface;
        this.A19.A0A.stop(true);
        this.A19.A0A.EcR(0L);
        A02();
        C4TS c4ts = this.A19;
        C96844Wu c96844Wu = this.A0O;
        List list = c4ts.A0R;
        if (list.isEmpty()) {
            C96854Wv c96854Wv = new C96854Wv(c4ts);
            c4ts.A06 = c96854Wv;
            c4ts.A0A.A94(c96854Wv);
        }
        list.add(c96844Wu);
        if (z) {
            this.A0G.removeMessages(9);
        }
    }

    public final synchronized void A0M() {
        A0E(this, "Stop player", new Object[0]);
        A07(this.A0G.obtainMessage(41), this);
    }

    public final void A0N(float f) {
        A0E(this, "Set volume", new Object[0]);
        A07(this.A0G.obtainMessage(5, Float.valueOf(f)), this);
    }

    public final void A0O(long j, boolean z) {
        A0E(this, "Play", new Object[0]);
        this.A0x.set(false);
        this.A0y.compareAndSet(false, z);
        A07(this.A0G.obtainMessage(2, new Object[]{Long.valueOf(j)}), this);
    }

    public final void A0P(Surface surface, int i, int i2) {
        A0E(this, "Set surface", new Object[0]);
        A07(this.A0G.obtainMessage(6, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}), this);
    }

    public final void A0Q(EnumC117265Sl enumC117265Sl, C4Y4 c4y4) {
        ErrorCallback errorCallback;
        C117275Sm A0L = A0L(enumC117265Sl, c4y4);
        String str = A0L.A02;
        this.A0Z = str;
        Handler handler = this.A0G;
        EnumC117265Sl enumC117265Sl2 = A0L.A01;
        String str2 = enumC117265Sl2.A00;
        String name = A0L.A00.name();
        String str3 = A0L.A03;
        if (str3 == null) {
            str3 = "";
        }
        A07(handler.obtainMessage(12, new Object[]{str2, name, str, str3}), this);
        if (this.A0w.A33 && (errorCallback = C2CZ.A01.A00) != null) {
            String name2 = enumC117265Sl2.name();
            HashMap hashMap = new HashMap();
            C4SS c4ss = this.A15;
            if (c4ss != null) {
                C4AN c4an = c4ss.A0K;
                String str4 = this.A1B;
                String str5 = this.A1A;
                hashMap.put("player_origin", c4an.A0A);
                hashMap.put("play_sub_origin", c4an.A0B);
                hashMap.put("video_id", c4an.A0G);
                hashMap.put("is_live", String.valueOf(c4an.A03()));
                hashMap.put(TraceFieldType.StreamType, C5n6.A01(this.A0U));
                hashMap.put("video_decoder", str4);
                hashMap.put("audio_decoder", str5);
            }
            errorCallback.onError(c4y4, name2, name, str, hashMap);
        }
    }

    public final void A0R(C4SS c4ss) {
        C4AN c4an = c4ss.A0K;
        A0E(this, "Prepare: %s", c4an);
        this.A0v.DY8(c4an.A0G, "prepare_player_start");
        if (this.A0w.A34 && this.A0t.A04 != null && BreakpadManager.isActive()) {
            BreakpadManager.setCustomData("last_video", "%s", Arrays.copyOf(new Object[]{c4an}, 1));
        }
        this.A0x.set(true);
        A07(this.A0G.obtainMessage(1, new Object[]{c4ss}), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r59.A1F == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C4RU A00(long r60, boolean r62) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.A00(long, boolean):X.4RU");
    }

    private C41991wp A01() {
        C461429y c461429y;
        Integer num;
        int A00;
        int i;
        HeroPlayerSetting heroPlayerSetting = this.A0w;
        if (heroPlayerSetting.A3U && (c461429y = (C461429y) this.A12.get()) != null) {
            if (this.A15 != null && this.A15.A0K.A03()) {
                A00 = C461429y.A00(c461429y, 4);
                i = 5;
            } else {
                if (this.A15 != null && "fb_stories".equalsIgnoreCase(this.A15.A0K.A0A)) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0C;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    int i2 = 16;
                    if (intValue != 1) {
                        i2 = 2;
                    }
                    A00 = C461429y.A00(c461429y, i2);
                    i = 3;
                } else {
                    A00 = C461429y.A00(c461429y, 6);
                    i = 7;
                }
            }
            C41991wp c41991wp = new C41991wp(A00, C461429y.A00(c461429y, i));
            if (c41991wp.A00 > 0 && c41991wp.A01 > 0) {
                return c41991wp;
            }
        }
        return heroPlayerSetting.A14;
    }

    private void A03() {
        if (this.A0w.A2W) {
            boolean A01 = this.A0t.A03.A01();
            boolean z = false;
            C4YK c4yk = this.A0S;
            if (A01) {
                if (c4yk == null) {
                    z = true;
                }
                if (c4yk == null) {
                    c4yk = new C4YK(this.A0F);
                    this.A0S = c4yk;
                }
                c4yk.setEnabled(true);
                A0E(this, "Setting the WifiLockManager state to %s", "enabled");
                if (z) {
                    A04(this.A04);
                    return;
                }
                return;
            }
            if (c4yk == null) {
                return;
            }
            c4yk.setEnabled(false);
            A0E(this, "Setting the WifiLockManager state to %s", "disabled");
        }
    }

    private void A04(int i) {
        boolean z;
        if (this.A0R == null && this.A0S == null) {
            return;
        }
        if (i == 1 || (i != 2 && i != 3)) {
            z = false;
        } else {
            z = this.A19.A0A.Bdn();
        }
        A0I(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (r41 == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(int r38, long r39, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.A05(int, long, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0 > 200) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0401, code lost:
    
        if ((r12 / r7.A04) < 60) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0298, code lost:
    
        if (r1 != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(long r30) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.A06(long):void");
    }

    public static void A07(Message message, C95794Sn c95794Sn) {
        if (!c95794Sn.A1E) {
            c95794Sn.A0G.sendMessage(message);
        }
    }

    private void A08(C4RV c4rv) {
        Number number;
        if (!c4rv.equals(this.A13)) {
            this.A13 = c4rv;
            this.A0v.DPP(c4rv);
            C96864Ww c96864Ww = this.A18;
            c96864Ww.A0C = c4rv;
            if (C96864Ww.A03(c96864Ww)) {
                int i = c4rv.A00;
                if (i >= c96864Ww.A0S.A0d) {
                    SystemClock.elapsedRealtime();
                }
                TreeMap treeMap = c96864Ww.A0U;
                if (treeMap.isEmpty() || (number = (Number) treeMap.lastEntry().getValue()) == null || i != number.intValue()) {
                    long j = c4rv.A09;
                    if (treeMap.size() > 100) {
                        treeMap.pollFirstEntry();
                    }
                    treeMap.put(Long.valueOf(j), Integer.valueOf(i));
                    if (i > c96864Ww.A03) {
                        c96864Ww.A03 = i;
                    }
                }
            }
        }
    }

    public static void A0A(C95794Sn c95794Sn, float f) {
        A0E(c95794Sn, "setPlaybackSpeedInternal to: %d (x100)", Integer.valueOf((int) (100.0f * f)));
        c95794Sn.A00 = f;
        C4TS c4ts = c95794Sn.A19;
        C4TU c4tu = new C4TU(f, c4ts.A0B.A00);
        c4ts.A0A.Eaz(c4tu);
        c4ts.A0B = c4tu;
    }

    public static void A0E(C95794Sn c95794Sn, String str, Object... objArr) {
        C2QC.A00(c95794Sn, "HeroServicePlayer", str, objArr);
    }

    public static void A0F(C95794Sn c95794Sn, boolean z, boolean z2) {
        HeroPlayerSetting heroPlayerSetting;
        long j;
        long j2;
        C4XW c96974Xh;
        boolean z3 = c95794Sn.A0d;
        if (z2) {
            if (z3 && c95794Sn.A1D && c95794Sn.A1C) {
                A0E(c95794Sn, "Call ExoPlayer.addMediaSource() from prepareExoPlayerIfNotYet", new Object[0]);
                C4TS c4ts = c95794Sn.A19;
                if (c4ts.A0C != null) {
                    if (!c4ts.A02.A0N.isEmpty()) {
                        c4ts.A0A.Egp(new ArrayList(c4ts.A02.A0N));
                    }
                    C4SS c4ss = c4ts.A02;
                    int i = c4ss.A0F;
                    if (i == -1 && c4ss.A0E == -1) {
                        c96974Xh = c4ts.A0C;
                    } else {
                        if (i != -1) {
                            j = i * 1000;
                        } else {
                            j = 0;
                        }
                        int i2 = c4ss.A0E;
                        if (i2 != -1) {
                            j2 = i2 * 1000;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        c96974Xh = new C96974Xh(c4ts.A0C, j, j2);
                    }
                    c4ts.A0A.A9N(c96974Xh);
                }
                c95794Sn.A1C = false;
            }
            if (!z && z3 && c95794Sn.A1D) {
                heroPlayerSetting = c95794Sn.A0w;
                boolean z4 = heroPlayerSetting.A10.A0Y;
                if (!z4) {
                    A0E(c95794Sn, "Call ExoPlayer.prepareV2() from prepareExoPlayerIfNotYet", new Object[0]);
                    c95794Sn.A19.A0A.E5P();
                }
                if (c95794Sn.A01 <= 0.0f) {
                    c95794Sn.A0J(false);
                }
                if (z4) {
                    A0E(c95794Sn, "Call ExoPlayer.prepareV2() from prepareExoPlayerIfNotYet", new Object[0]);
                    c95794Sn.A19.A0A.E5P();
                }
            } else {
                return;
            }
        } else {
            if (!z3 || !c95794Sn.A1D) {
                return;
            }
            heroPlayerSetting = c95794Sn.A0w;
            boolean z5 = heroPlayerSetting.A10.A0Y;
            if (!z5) {
                A0E(c95794Sn, "Call ExoPlayer.prepare()", new Object[0]);
                c95794Sn.A19.A06();
            }
            if (c95794Sn.A01 <= 0.0f) {
                c95794Sn.A0J(false);
            }
            if (z5) {
                A0E(c95794Sn, "Call ExoPlayer.prepare()", new Object[0]);
                c95794Sn.A19.A06();
            }
        }
        c95794Sn.A03();
        C4SS c4ss2 = c95794Sn.A15;
        java.util.Set set = heroPlayerSetting.A1H;
        if (!set.isEmpty() && c4ss2 != null && (set.contains("all_origin") || set.contains(c4ss2.A0K.A0B))) {
            C4Xk c4Xk = c95794Sn.A0R;
            if (c4Xk == null) {
                c4Xk = new C4Xk(c95794Sn.A0F);
                c95794Sn.A0R = c4Xk;
            }
            c4Xk.setEnabled(true);
        }
        c95794Sn.A1D = false;
    }

    private void A0I(boolean z) {
        try {
            C4Xk c4Xk = this.A0R;
            if (c4Xk != null) {
                c4Xk.Eeo(z);
            }
            C4YK c4yk = this.A0S;
            if (c4yk != null) {
                c4yk.Eeo(z);
                A0E(this, "Setting StayAwake on WifiLockManager to: %b", Boolean.valueOf(z));
            }
        } catch (UnsupportedOperationException e) {
            A0E(this, "Setting StayAwake on WifiLockManager failed: %s", e.getMessage());
        }
    }

    private void A0J(boolean z) {
        String str;
        if (this.A15 != null && this.A15.A0R) {
            C4AK c4ak = this.A15.A0K.A07;
            if (this.A19.A05(1) == -1 && z) {
                C2QC.A02(this, "Enable audio track", new Object[0]);
                this.A19.A07(1, 0);
            } else {
                if (this.A19.A05(1) == -1 || z) {
                    return;
                }
                if (c4ak != C4AK.DASH_VOD && (c4ak != C4AK.PROGRESSIVE || !this.A0w.A28)) {
                    return;
                }
                C2QC.A02(this, "Disable audio track", new Object[0]);
                this.A19.A07(1, -1);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A0B < 100) {
                String str2 = "";
                if (this.A15 == null) {
                    str = "";
                } else {
                    str = this.A15.A0K.A0A;
                }
                if (this.A15 != null) {
                    str2 = this.A15.A0K.A0B;
                }
                this.A0v.E1k("AUDIO", "AUDIO_TRACK_UPDATED_TOO_FREQUENTLY", String.format("audio track is updated again in 100ms in origin: %s, subOrigin: %s. ", str, str2));
            }
            this.A0B = elapsedRealtime;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0.A0P == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0K(X.C95794Sn r3) {
        /*
            X.4SS r0 = r3.A15
            r2 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.A0P
            r1 = 1
            if (r0 != 0) goto Lb
        La:
            r1 = 0
        Lb:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0w
            if (r0 == 0) goto L16
            boolean r0 = r0.A2d
            if (r0 == 0) goto L16
            if (r1 != 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.A0K(X.4Sn):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C117275Sm A0L(X.EnumC117265Sl r13, X.C4Y4 r14) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.A0L(X.5Sl, X.4Y4):X.5Sm");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ba, code lost:
    
        if (r8.A0F == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0880, code lost:
    
        if (r5 != false) goto L434;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05fb  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r63) {
        /*
            Method dump skipped, instructions count: 3040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95794Sn.handleMessage(android.os.Message):boolean");
    }

    public C95794Sn(Context context, Handler handler, HandlerThread handlerThread, C2BZ c2bz, final C4SS c4ss, InterfaceC95434Rd interfaceC95434Rd, C46282Ap c46282Ap, C2BV c2bv, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference, long j) {
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.A10 = atomicBoolean2;
        this.A0x = new AtomicBoolean(true);
        this.A0y = new AtomicBoolean(false);
        this.A0D = -1L;
        this.A08 = -1L;
        this.A0d = false;
        this.A0n = false;
        this.A0l = -1L;
        this.A0E = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A1G = false;
        this.A1H = false;
        this.A0X = null;
        this.A0W = null;
        this.A0M = null;
        this.A0u = new C95834Ss(this);
        this.A0q = j;
        this.A0v = new C95844St(interfaceC95434Rd, this);
        if (interfaceC95434Rd instanceof C95854Su) {
            atomicBoolean2.set(true);
        }
        this.A0t = c46282Ap;
        this.A0w = c46282Ap.A06;
        this.A12 = c46282Ap.A09;
        this.A09 = -1L;
        this.A0c = false;
        this.A0F = context;
        this.A0H = handler;
        this.A0b = atomicReference;
        this.A0P = c2bv;
        this.A0L = c2bz;
        this.A0a = map;
        this.A0r = handlerThread;
        Handler handler2 = new Handler(handlerThread.getLooper(), this);
        this.A0G = handler2;
        this.A0s = new C4TG();
        this.A0z = atomicBoolean;
        handler2.post(new Runnable() { // from class: X.4TH
            /* JADX WARN: Type inference failed for: r0v4, types: [X.4TN, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.4Bv] */
            @Override // java.lang.Runnable
            public final void run() {
                C95794Sn c95794Sn = this;
                C4SS c4ss2 = c4ss;
                C95794Sn.A0E(c95794Sn, "Create new ExoPlayer", new Object[0]);
                HeroPlayerSetting heroPlayerSetting = c95794Sn.A0w;
                C41991wp c41991wp = heroPlayerSetting.A14;
                C4TL c4tl = new C4TL();
                C4TM c4tm = new C4TM(c4tl);
                c95794Sn.A0N = new Object();
                String str = c4ss2.A0K.A0G;
                AtomicReference atomicReference2 = c95794Sn.A0b;
                C46282Ap c46282Ap2 = c95794Sn.A0t;
                ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(c46282Ap2.A02, str, atomicReference2);
                HashMap hashMap = new HashMap();
                String str2 = c4ss2.A07;
                if (str2 != null && !str2.isEmpty()) {
                    hashMap.put(AbstractC58354Ptu.A01(9, 10, 37), AnonymousClass001.A0g(str2, "_", Long.toString(SystemClock.elapsedRealtime())));
                }
                if (str != null) {
                    hashMap.put("asset_id", str);
                }
                ?? obj = new Object();
                c95794Sn.A0M = obj;
                C4TP c4tp = new C4TP(c95794Sn.A0G, serviceEventCallbackImpl, obj, c4ss2, c46282Ap2, heroPlayerSetting);
                c95794Sn.A0Q = c4tp;
                Context context2 = c95794Sn.A0F;
                Handler handler3 = c95794Sn.A0H;
                C2BZ c2bz2 = c95794Sn.A0L;
                Map map2 = c95794Sn.A0a;
                AtomicBoolean atomicBoolean3 = c95794Sn.A10;
                AtomicBoolean atomicBoolean4 = c95794Sn.A0x;
                AtomicBoolean atomicBoolean5 = c95794Sn.A0y;
                C95834Ss c95834Ss = c95794Sn.A0u;
                c95794Sn.A19 = new C4TS(context2, handler3, c2bz2, c95794Sn.A0M, c95794Sn.A0N, c4tm, c4ss2, c46282Ap2, c95834Ss, c95794Sn, c4tp, serviceEventCallbackImpl, c41991wp, map2, atomicBoolean3, atomicBoolean4, atomicBoolean5, atomicReference2);
                c95794Sn.A0O = new C96844Wu(c95794Sn);
                C4TS c4ts = c95794Sn.A19;
                C96844Wu c96844Wu = c95794Sn.A0O;
                List list = c4ts.A0R;
                if (list.isEmpty()) {
                    C96854Wv c96854Wv = new C96854Wv(c4ts);
                    c4ts.A06 = c96854Wv;
                    c4ts.A0A.A94(c96854Wv);
                }
                list.add(c96844Wu);
                C4TS c4ts2 = c95794Sn.A19;
                c95794Sn.A18 = new C96864Ww(c95794Sn.A0M, c4tl, c4tm, c95794Sn.A0s, c4ss2, c46282Ap2, c95794Sn.A0v, c95794Sn.A0Q, c4ts2, heroPlayerSetting);
                c95794Sn.A18.A0F = c95794Sn.A19.A07.AfJ();
                C4TP c4tp2 = c95794Sn.A0Q;
                if (c4tp2 != null) {
                    c4tp2.A04 = c95794Sn.A19.A07.AfJ();
                }
                c95794Sn.A17 = new C4X4(c4ss2, c95794Sn.A19, heroPlayerSetting);
            }
        });
    }

    private void A0G(boolean z) {
        A0E(this, "pauseInternal %b", Boolean.valueOf(z));
        this.A0k = false;
        this.A0n = z;
        this.A19.A0A.Eax(false);
        if (this.A0w.A2J) {
            A05(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
    }
}
