package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class WYP implements InterfaceC95914Ta {
    public Handler A00;
    public C2B4 A01;
    public InterfaceC92404Bv A02;
    public C123195hu A03;
    public C2BE A04;
    public C2BH A05;
    public final Context A06;
    public final InterfaceC460229m A07;
    public final C46302As A08;
    public final ServiceEventCallbackImpl A09;
    public final XC7 A0A;
    public final HeroPlayerSetting A0B;
    public final Map A0C;
    public final AtomicBoolean A0D;
    public final AtomicBoolean A0E;
    public final C2A5 A0F;
    public final C2A4 A0G;
    public final C4TN A0H;
    public final C461429y A0I;
    public final C95924Tb A0J;
    public final InterfaceC460429o A0K;

    @Override // X.InterfaceC95914Ta
    public final InterfaceC96374Uv BOB(C4SS c4ss, C41991wp c41991wp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        int i = c41991wp.A00;
        int i2 = c41991wp.A01;
        C2A4 c2a4 = this.A0G;
        C2A5 c2a5 = this.A0F;
        C461429y c461429y = this.A0I;
        C96334Ur c96334Ur = new C96334Ur();
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        C96314Up c96314Up = new C96314Up(c461429y, heroPlayerSetting.A11, new AtomicBoolean(false), new AtomicBoolean(false), 1000, 1000, 6000, heroPlayerSetting.A0L, heroPlayerSetting.A0K, true, false, false, false);
        boolean z2 = heroPlayerSetting.A3Q;
        int i3 = heroPlayerSetting.A0g;
        int i4 = heroPlayerSetting.A06;
        boolean z3 = true;
        if (c461429y == null) {
            z3 = false;
        }
        C4B8.A03(z3);
        return new C96364Uu(c2a5, c96314Up, null, c2a4, c461429y, c96334Ur, atomicBoolean, atomicBoolean2, i, i2, -1, i3, i4, -1, z2, false, z);
    }

    public static long A00(C4SS c4ss, C4BR c4br, WYP wyp) {
        String str;
        if (c4br != null) {
            VideoBandwidthEstimate A00 = wyp.A01.A00();
            android.net.Uri uri = c4ss.A0K.A05;
            if (uri != null) {
                str = uri.getHost();
            } else {
                str = null;
            }
            A00.getEstimatedThroughput(75, str);
            List list = c4br.A01;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        C4AN c4an = c4ss.A0K;
        long j = wyp.A0B.A0J;
        long j2 = c4an.A02;
        if (j2 > 0) {
            j = Math.max(j2, j);
        }
        return (int) j;
    }

    public final C2B2 A01(C4SS c4ss) {
        C2B2 c2b2 = new C2B2();
        C4AN c4an = c4ss.A0K;
        c2b2.A06(c4an.A0M);
        String str = c4ss.A06;
        synchronized (c2b2) {
            c2b2.A00 = str;
        }
        synchronized (c2b2) {
        }
        c2b2.A05(c4an.A0G);
        boolean z = c4an.A0N;
        synchronized (c2b2) {
            c2b2.A04 = z;
        }
        c2b2.A04(c4an.A0A);
        synchronized (c2b2) {
        }
        android.net.Uri uri = c4an.A05;
        if (uri != null) {
            c2b2.A03(uri.getHost());
        }
        synchronized (c2b2) {
        }
        return c2b2;
    }

    @Override // X.InterfaceC95914Ta
    public final C2BE Adl(C2BH c2bh, C4SS c4ss) {
        C2B1 c2b1;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        C42081wy c42081wy = heroPlayerSetting.A0w;
        if (!c42081wy.A0v) {
            return null;
        }
        C2B2 A01 = A01(c4ss);
        C2A4 c2a4 = this.A0G;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c42081wy, c2a4, A01, true, false);
        C2B4 c2b4 = new C2B4(abrContextAwareConfiguration, this.A0K);
        if (abrContextAwareConfiguration.getShouldEnableAudioIbrCache()) {
            c2b1 = new C2B1(new C46352Ax(this.A08.A01), null, c4ss.A04, heroPlayerSetting);
        } else {
            c2b1 = null;
        }
        return new C2BE(this.A06, c2b4, A01, c2b1, this.A04, abrContextAwareConfiguration, c2bh, c2a4);
    }

    @Override // X.InterfaceC95914Ta
    public final C2B4 AfJ() {
        return this.A01;
    }

    @Override // X.InterfaceC95914Ta
    public final C2BE AvX() {
        return this.A04;
    }

    @Override // X.InterfaceC95914Ta
    public final C4V3 BDZ(InterfaceC123215hw interfaceC123215hw, C4SS c4ss) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        boolean z6 = heroPlayerSetting.A2o;
        C4AN c4an = c4ss.A0K;
        int i = (int) c4an.A02;
        int i2 = (int) c4an.A03;
        int i3 = heroPlayerSetting.A0V;
        int i4 = heroPlayerSetting.A0S;
        int i5 = heroPlayerSetting.A0R;
        int i6 = heroPlayerSetting.A0a;
        int AOy = interfaceC123215hw.AOy();
        int AOz = interfaceC123215hw.AOz();
        boolean CXu = interfaceC123215hw.CXu();
        boolean z7 = heroPlayerSetting.A2c;
        boolean z8 = heroPlayerSetting.A1U;
        C42121x2 c42121x2 = heroPlayerSetting.A0v;
        C42181x8 c42181x8 = heroPlayerSetting.A0u;
        C42191x9 c42191x9 = heroPlayerSetting.A0t;
        boolean z9 = heroPlayerSetting.A2I;
        int i7 = heroPlayerSetting.A0z.maxAllowed503RetryCount;
        int i8 = heroPlayerSetting.A0H;
        C42361xQ c42361xQ = heroPlayerSetting.A10;
        boolean z10 = c42361xQ.A0g;
        C41861wa c41861wa = heroPlayerSetting.A01;
        if (c41861wa != null) {
            z = c41861wa.A0l;
            z2 = c41861wa.A0k;
            z3 = c41861wa.A0j;
            z4 = c41861wa.A0i;
            z5 = c41861wa.A0I;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        return new C4V3(c42191x9, c42181x8, c42121x2, i, i2, i3, i4, i5, i6, AOy, AOz, 3, i7, i8, -1000L, true, z6, true, CXu, z7, z8, z9, false, z10, z, z2, z3, z4, z5, heroPlayerSetting.A1o, heroPlayerSetting.A3K, c42361xQ.A0f);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.5hw, java.lang.Object, X.WV9] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.5hw, java.lang.Object, X.WV8] */
    @Override // X.InterfaceC95914Ta
    public final InterfaceC123215hw BPN(C4SS c4ss) {
        boolean A1X = AbstractC167007dF.A1X(c4ss.A0K.A06, C4AM.GAMING);
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        if (A1X) {
            ?? obj = new Object();
            obj.A00 = c4ss;
            obj.A01 = heroPlayerSetting;
            return obj;
        }
        C2A4 c2a4 = this.A0G;
        ?? obj2 = new Object();
        obj2.A01 = c4ss;
        obj2.A02 = heroPlayerSetting;
        obj2.A00 = c2a4;
        return obj2;
    }

    @Override // X.InterfaceC95914Ta
    public final C2BE CF2(C2BH c2bh, C4SS c4ss, C92124As c92124As) {
        C2B2 A01 = A01(c4ss);
        this.A05 = c2bh;
        C46352Ax c46352Ax = new C46352Ax(this.A08.A01);
        EnumC46372Az enumC46372Az = c4ss.A04;
        HeroPlayerSetting heroPlayerSetting = this.A0B;
        C2B1 c2b1 = new C2B1(c46352Ax, null, enumC46372Az, heroPlayerSetting);
        C42081wy c42081wy = heroPlayerSetting.A0w;
        C2A4 c2a4 = this.A0G;
        AbrContextAwareConfiguration abrContextAwareConfiguration = new AbrContextAwareConfiguration(c42081wy, c2a4, A01, true, false);
        this.A01 = null;
        C2B4 c2b4 = new C2B4(abrContextAwareConfiguration, this.A0K);
        this.A01 = c2b4;
        C2BE c2be = new C2BE(this.A06, c2b4, A01, c2b1, null, abrContextAwareConfiguration, c2bh, c2a4);
        this.A04 = c2be;
        return c2be;
    }

    public WYP(Context context, Handler handler, C2BZ c2bz, InterfaceC92404Bv interfaceC92404Bv, C4TN c4tn, C46282Ap c46282Ap, ServiceEventCallbackImpl serviceEventCallbackImpl, C123195hu c123195hu, XC7 xc7, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A06 = context;
        this.A0C = map;
        HeroPlayerSetting heroPlayerSetting = c46282Ap.A06;
        this.A0B = heroPlayerSetting;
        C461429y c461429y = (C461429y) c46282Ap.A09.get();
        this.A0I = c461429y;
        InterfaceC460429o interfaceC460429o = c46282Ap.A07;
        this.A0K = interfaceC460429o;
        this.A0G = c46282Ap.A03;
        this.A0F = c46282Ap.A01;
        this.A08 = c46282Ap.A00;
        this.A07 = c46282Ap.A02;
        this.A09 = serviceEventCallbackImpl;
        this.A02 = interfaceC92404Bv;
        this.A0J = new C95924Tb(context, c2bz, interfaceC92404Bv, c461429y, serviceEventCallbackImpl, heroPlayerSetting, interfaceC460429o);
        this.A00 = handler;
        this.A0A = xc7;
        this.A0E = atomicBoolean;
        this.A0D = atomicBoolean2;
        this.A03 = c123195hu;
        this.A0H = c4tn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f4, code lost:
    
        r10.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fb, code lost:
    
        if (r10.isEmpty() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02fd, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0303, code lost:
    
        if (r9.isEmpty() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0305, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0307, code lost:
    
        if (r10 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0309, code lost:
    
        if (r9 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x030f, code lost:
    
        r4 = new X.C4BR(r10, r9);
        r10 = r4.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0316, code lost:
    
        if (r10 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0318, code lost:
    
        r25 = 0;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x031c, code lost:
    
        r4 = null;
        r25 = 0;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0323, code lost:
    
        r7 = r57.A0I;
        r15 = r57.A0G;
        r34 = new X.C5L3(new java.lang.Object(), r17, r15, r4, r58, r59, r14, r7, r43, r44, r45, r66, -1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0343, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0125, code lost:
    
        r40 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0115, code lost:
    
        r39 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0119, code lost:
    
        if (r65.A0W != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0109, code lost:
    
        if (r65 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0361, code lost:
    
        if (r65 != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0105, code lost:
    
        if (r65.A0U == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010b, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        if (r65.A0V != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0113, code lost:
    
        if (r65 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011b, code lost:
    
        r39 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011d, code lost:
    
        if (r65 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011f, code lost:
    
        r40 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0123, code lost:
    
        if (r65.A0R != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0127, code lost:
    
        r15 = r11.A2U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0129, code lost:
    
        if (r65 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        if (r65.A0Q.size() <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0133, code lost:
    
        r9 = X.AbstractC65702TsY.A0M(r65).A02.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        r13 = r60.A07;
        r4 = r57.A02;
        r16 = "";
        r7 = new X.C92414Bw(null, r6, r21, r4, r23, null, r4, "", r27, r9, r13, r7, r7, r67, r8, r8, r8, r37, r38, r39, r40, r8, r15);
        r7.A16 = r11.A3B;
        r4 = new X.WcE(r7);
        r62.A01 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0175, code lost:
    
        if (r12.A0V == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0177, code lost:
    
        r7 = r57.A0I;
        r15 = r57.A0G;
        r34 = new X.C4YG(new java.lang.Object(), r17, r15, r4, r58, r59, r14, r7, r43, r44, r45, r66, -1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0195, code lost:
    
        r7 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory(r17, r4, r12, r14, r63, r34, new X.Wc3(new X.C92304Bk(r60.A04, r7, r1, r55, r4, r7), r4, r6.A05.A18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ca, code lost:
    
        if (r65 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d2, code lost:
    
        if (r65.A0Q.size() >= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d4, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d6, code lost:
    
        r10 = r4.A01;
        r25 = r10.size();
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01dc, code lost:
    
        r9 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01de, code lost:
    
        if (r9 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e0, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e2, code lost:
    
        if (r25 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e6, code lost:
    
        if (r65.A0W == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e8, code lost:
    
        r12 = (X.C4BB) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
    
        if ((r12 instanceof X.C97814aM) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f2, code lost:
    
        ((X.C97814aM) r12).BsK(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f9, code lost:
    
        r9 = A00(r60, r4, r57);
        r13 = r11.A0M;
        r7.A04 = new X.C4XT(r13);
        r7.A00 = r9;
        r7.A05 = new X.C92074An(r57.A06, r11, r1, true);
        r7.A01 = r15;
        r9 = r5.A05;
        r5 = X.C4XU.$redex_init_class;
        r6 = new X.C96614Vw();
        r6.A00 = r9;
        r6.A07 = "DashMediaSource";
        r6.A08 = "application/dash+xml";
        r33 = r6.A00();
        r5 = r7.A0B;
        r5 = r7.A05;
        r5 = r7.A0A;
        r20 = new X.C4XU(r7.A06, r7.A01, r7.A07, r7.A08, r7.A09, r33, r7.A02, r7.A03, r5, null, r5, r7.A04, r5, r7.A00);
        r5 = new X.WYR(r60, r61, r4, r57, r20, X.AbstractC25229BEm.A1Z(r65));
        r2.A0G.set(r8);
        r6 = r2.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0283, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x040a, code lost:
    
        if (r2.A0K != X.C05F.A00) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x040c, code lost:
    
        ((X.AbstractC123255i0) r2).A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x040e, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x041c, code lost:
    
        r21 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x041e, code lost:
    
        if (r65 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0420, code lost:
    
        r11 = 0;
        r9 = 0;
        r7 = 0;
        r5 = 0;
        r35 = 0;
        r14 = false;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x042c, code lost:
    
        r22 = X.C95934Tc.A02(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0430, code lost:
    
        if (r65 != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0432, code lost:
    
        r15 = "";
        r4 = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0451, code lost:
    
        return new X.C96944Xe(r2, r20, r21, r22, r15, r16, r25, r26, r11, r9, r7, r5, r35, r14, r13, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0452, code lost:
    
        r15 = r65.A0K;
        r4 = r65.A0W;
        r3 = r65.A0R;
        r16 = r65.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x045d, code lost:
    
        r11 = r65.A0B;
        r9 = r65.A07;
        r7 = r65.A05;
        r5 = r65.A08;
        r35 = android.os.SystemClock.elapsedRealtime();
        r14 = r65.A0S;
        r13 = r65.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0410, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0415, code lost:
    
        if (r2.A0K != X.C05F.A01) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0417, code lost:
    
        r5.DmQ(r2.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x046e, code lost:
    
        ((X.AbstractC123255i0) r2).A00 = r5;
        r2.A02(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0286, code lost:
    
        if (r25 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0288, code lost:
    
        X.AbstractC459729h.A02("HeroExo2LiveInitHelper", "No valid video representation found for live video %s", r1);
        r6.callback(new X.C97144Xz(r1, "MANIFEST", "NO_VALID_VIDEO_REPRESENTATION", "No valid video representation found for live video"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a7, code lost:
    
        r26 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ad, code lost:
    
        r4 = r65.A02(r8);
        r10 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r14 = r4.A03.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02c5, code lost:
    
        if (r14.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c7, code lost:
    
        r13 = (X.C4BF) r14.next();
        r12 = r13.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02cf, code lost:
    
        if (r12 == 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e4, code lost:
    
        r12 = r13.A07.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02ee, code lost:
    
        if (r12.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02f0, code lost:
    
        X.AbstractC58318PtA.A1W(r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d2, code lost:
    
        if (r12 != 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02d4, code lost:
    
        r12 = r13.A07.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02de, code lost:
    
        if (r12.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02e0, code lost:
    
        X.AbstractC58318PtA.A1W(r10, r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Type inference failed for: r35v2, types: [X.4XC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r35v7, types: [X.4XC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // X.InterfaceC95914Ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C96944Xe BRX(X.C4TM r58, X.C4TG r59, X.C4SS r60, X.C4X8 r61, X.C4TV r62, X.C4XR r63, X.C4BL r64, X.C92124As r65, X.C2BC r66, long r67, boolean r69) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WYP.BRX(X.4TM, X.4TG, X.4SS, X.4X8, X.4TV, X.4XR, X.4BL, X.4As, X.2BC, long, boolean):X.4Xe");
    }
}
