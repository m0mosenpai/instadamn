package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GgI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37562GgI implements JI8, JIH, C38Y, InterfaceC43071ya {
    public C120985dq A00;
    public CountDownTimerC38297Gsg A01;
    public ConcurrentHashMap A02;
    public final Context A03;
    public final UserSession A04;
    public final C23031Ai A05;
    public final C59952od A06;
    public final C37546Gg2 A07;
    public final C37561GgH A08;
    public final String A09;
    public final ConcurrentHashMap A0A;
    public final ConcurrentHashMap A0B;
    public final ConcurrentHashMap A0C;
    public final AtomicLong A0D;
    public final AtomicLong A0E;
    public final AtomicReference A0F;
    public final AtomicReference A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final Handler A0K;
    public final ClipsViewerConfig A0L;
    public final ConcurrentHashMap A0M;
    public final AtomicBoolean A0N;
    public final AtomicReference A0O;
    public final InterfaceC16820sZ A0P;
    public final InterfaceC16820sZ A0Q;

    public C37562GgI(Context context, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C23031Ai c23031Ai, C59952od c59952od, C37546Gg2 c37546Gg2, C37561GgH c37561GgH, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1U(clipsViewerConfig, c23031Ai);
        C14360o3.A0B(str, 8);
        this.A04 = userSession;
        this.A03 = context;
        this.A06 = c59952od;
        this.A07 = c37546Gg2;
        this.A08 = c37561GgH;
        this.A0L = clipsViewerConfig;
        this.A05 = c23031Ai;
        this.A09 = str;
        this.A0Q = interfaceC16820sZ;
        this.A0P = interfaceC16820sZ2;
        this.A0J = AbstractC09440dt.A00(EnumC09460dv.A03, new BQP(this, 12));
        this.A0I = BQP.A00(this, 11);
        this.A0H = BQP.A00(this, 10);
        this.A0C = new ConcurrentHashMap();
        this.A0O = new AtomicReference(null);
        this.A0N = new AtomicBoolean();
        this.A0F = new AtomicReference(null);
        this.A0D = new AtomicLong(0L);
        this.A0M = new ConcurrentHashMap();
        this.A0B = new ConcurrentHashMap();
        this.A0K = new Handler(C1CG.A00());
        this.A02 = new ConcurrentHashMap();
        this.A0A = new ConcurrentHashMap();
        this.A0E = new AtomicLong(0L);
        this.A0G = new AtomicReference(null);
    }

    private final boolean A07(C120985dq c120985dq) {
        C75113Zb A02;
        return (c120985dq == null || (A02 = C37546Gg2.A02(c120985dq, this.A07)) == null || !AbstractC166987dD.A1a(A02.A3Z.A00)) ? false : true;
    }

    public final C37692GiT A08(C120985dq c120985dq) {
        InterfaceC09390do interfaceC09390do;
        if (c120985dq != null && c120985dq.CdW()) {
            interfaceC09390do = this.A0I;
        } else {
            interfaceC09390do = this.A0H;
        }
        return (C37692GiT) interfaceC09390do.getValue();
    }

    public final void A09(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG, Integer num) {
        String str;
        C14360o3.A0B(enumC37861GlG, 2);
        if (c120985dq != null) {
            String A01 = A01(enumC37860GlF, enumC37861GlG);
            boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
            C75113Zb A02 = C37546Gg2.A02(c120985dq, this.A07);
            ConcurrentHashMap concurrentHashMap = this.A02;
            Runnable runnable = (Runnable) AbstractC37301Gc2.A0f(c120985dq, concurrentHashMap);
            if (runnable != null) {
                this.A0K.removeCallbacks(runnable);
            }
            this.A0A.put(c120985dq.getId(), AbstractC166987dD.A1L(A01, Boolean.valueOf(A1X)));
            if (A02 != null) {
                if (1 - num.intValue() != 0) {
                    str = "for_session";
                } else {
                    str = "for_media";
                }
                A02.A3Q.A00(A02, AbstractC166987dD.A1L(A01, str));
            }
            concurrentHashMap.put(c120985dq.getId(), new J55(c120985dq, this));
            Runnable runnable2 = (Runnable) AbstractC37301Gc2.A0f(c120985dq, concurrentHashMap);
            if (runnable2 != null) {
                this.A0K.postDelayed(runnable2, 1000L);
            }
        }
    }

    @Override // X.JI8
    public final void AGM(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        this.A0E.set(0L);
        A05(c120985dq, enumC37860GlF, enumC37861GlG, false);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        long j;
        long j2;
        long j3;
        C38321qM c38321qM;
        Double d;
        Double d2;
        C38321qM c38321qM2;
        C120985dq c120985dq;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C38321qM c38321qM3 = ((C120985dq) c59062n7.A03).A02;
                if (c38321qM3 != null) {
                    this.A07.BRZ(c38321qM3).A0i(false);
                    return;
                }
                return;
            }
            if (interfaceC57162jr.CGk(c59062n7) != 1.0f) {
                return;
            }
            AtomicBoolean atomicBoolean = this.A0N;
            if (atomicBoolean.get()) {
                return;
            }
            Object obj = c59062n7.A03;
            C120985dq c120985dq2 = (C120985dq) obj;
            this.A00 = c120985dq2;
            if (C14360o3.A0K(this.A0F.get(), c120985dq2.getId())) {
                C14360o3.A06(obj);
                if (A06(c120985dq2)) {
                    AGM(c120985dq2, EnumC37860GlF.A06, EnumC37861GlG.A0f);
                    atomicBoolean.set(true);
                    return;
                }
            }
            C14360o3.A06(obj);
            if (CT2(c120985dq2) && c120985dq2.CdW() && (c38321qM2 = c120985dq2.A02) != null && c38321qM2.A5x()) {
                CountDownTimerC38297Gsg countDownTimerC38297Gsg = this.A01;
                if (countDownTimerC38297Gsg != null) {
                    c120985dq = countDownTimerC38297Gsg.A00;
                } else {
                    c120985dq = null;
                }
                if (!C14360o3.A0K(c120985dq, obj)) {
                    CountDownTimerC38297Gsg countDownTimerC38297Gsg2 = new CountDownTimerC38297Gsg(c120985dq2, this, C36J.A03(C36H.A04(C36G.A09, A08(c120985dq2).A06)));
                    this.A01 = countDownTimerC38297Gsg2;
                    countDownTimerC38297Gsg2.start();
                }
            }
            atomicBoolean.set(true);
            return;
        }
        Object obj2 = c59062n7.A03;
        C120985dq c120985dq3 = (C120985dq) obj2;
        long j4 = A08(c120985dq3).A06;
        C36G c36g = C36G.A09;
        C36J.A03(C36H.A04(c36g, j4));
        C14360o3.A06(obj2);
        long incrementAndGet = this.A0D.incrementAndGet();
        AtomicReference atomicReference = this.A0F;
        if (C14360o3.A0K(atomicReference.get(), c120985dq3.getId())) {
            if (incrementAndGet == 2) {
                A03(c120985dq3);
            } else {
                atomicReference.set(null);
                C75113Zb c75113Zb = this.A07.A0A.C09(c120985dq3).A0E;
                if (c75113Zb != null) {
                    c75113Zb.A3S.A00(c75113Zb, false);
                }
            }
        }
        if (CT2(c120985dq3)) {
            C75113Zb c75113Zb2 = ((C37644Ghd) c59062n7.A04).A0E;
            if (c75113Zb2 != null) {
                c75113Zb2.A0i(false);
            }
            this.A0G.set(null);
            C75113Zb c75113Zb3 = this.A07.A0A.C09(c120985dq3).A0E;
            C14360o3.A0A(c120985dq3);
            UserSession userSession = this.A04;
            C75363a3 A0A = c120985dq3.A0A(userSession, null);
            if (A0A != null && (d2 = A0A.A0C) != null) {
                j = C36J.A03(C36H.A02(c36g, d2.doubleValue()));
            } else {
                j = 1000;
            }
            if (A08(c120985dq3).A0F && A08(c120985dq3).A0B.contains(this.A09)) {
                j2 = A08(c120985dq3).A01;
            } else {
                j2 = A08(c120985dq3).A02;
            }
            long A03 = C36J.A03(C36H.A04(c36g, A08(c120985dq3).A03));
            if (j2 * j < A03) {
                j2 = (long) Math.ceil(A03 / j);
            }
            String id = c120985dq3.getId();
            ConcurrentHashMap concurrentHashMap = this.A0B;
            C75363a3 A0A2 = c120985dq3.A0A(userSession, null);
            if (A0A2 != null && (d = A0A2.A0C) != null) {
                j3 = C36J.A03(C36H.A02(c36g, d.doubleValue()));
            } else {
                j3 = 1000;
            }
            int i = (int) j2;
            int i2 = i - 1;
            int i3 = i2;
            if (i2 < 0) {
                i3 = 0;
            }
            concurrentHashMap.put(id, Long.valueOf((i3 * j3) + j3));
            if (!c120985dq3.CdW() || (c38321qM = c120985dq3.A02) == null || !c38321qM.A5x()) {
                if (c75113Zb3 != null) {
                    c75113Zb3.A3X.A00(c75113Zb3, Integer.valueOf(i2));
                }
                this.A0C.put(id, Integer.valueOf(i));
            }
        }
        this.A0N.set(false);
    }

    @Override // X.JI8
    public final boolean CT2(C120985dq c120985dq) {
        C75113Zb c75113Zb;
        C14360o3.A0B(c120985dq, 0);
        if (!this.A05.A01.getBoolean("has_cancelled_reels_auto_scroll", false)) {
            long j = A08(c120985dq).A04;
            if ((j < 0 || this.A0E.get() < j) && A06(c120985dq)) {
                if ((A08(c120985dq).A0F && !A08(c120985dq).A0E && !A08(c120985dq).A0B.contains(this.A09)) || (c75113Zb = this.A07.A0A.C09(c120985dq).A0E) == null || ((Boolean) c75113Zb.A3S.A00).booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.JI8
    public final boolean CT3(C120985dq c120985dq) {
        boolean z = false;
        C14360o3.A0B(c120985dq, 0);
        if (A06(c120985dq)) {
            C09530e4 c09530e4 = (C09530e4) this.A0O.get();
            z = true;
            if (c09530e4 != null && C14360o3.A0K(c09530e4.A00, c120985dq.getId())) {
                if (SystemClock.elapsedRealtime() - AbstractC166987dD.A0N(c09530e4.A01) > 100) {
                    return false;
                }
                return true;
            }
        }
        return z;
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (r17 != false) goto L48;
     */
    @Override // X.JIH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dby(X.C120985dq r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37562GgI.Dby(X.5dq, int, int, boolean):void");
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        C14360o3.A0B(c120985dq, 0);
        if (CT2(c120985dq)) {
            int A00 = A00(c120985dq);
            AbstractC37552Gg8 abstractC37552Gg8 = this.A07.A0A;
            int i3 = abstractC37552Gg8.C09(c120985dq).A08;
            C75113Zb c75113Zb = abstractC37552Gg8.C09(c120985dq).A0E;
            if (c75113Zb != null) {
                int i4 = (A00 - i3) - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                c75113Zb.A3X.A00(c75113Zb, Integer.valueOf(i4));
            }
            if (i3 >= A00) {
                A04(c120985dq, this);
            }
        }
    }

    private final int A00(C120985dq c120985dq) {
        int intValue;
        Number number = (Number) AbstractC37301Gc2.A0f(c120985dq, this.A0C);
        if (number == null || (intValue = number.intValue()) == 0) {
            return 3;
        }
        return intValue;
    }

    private final void A03(C120985dq c120985dq) {
        C75113Zb A02 = C37546Gg2.A02(c120985dq, this.A07);
        if (A02 != null) {
            A02.A0i(false);
            A02.A3S.A00(A02, true);
        }
        this.A0O.set(AbstractC167007dF.A0p(c120985dq.getId(), SystemClock.elapsedRealtime()));
    }

    public static final void A04(C120985dq c120985dq, C37562GgI c37562GgI) {
        C37561GgH c37561GgH = c37562GgI.A08;
        C14360o3.A0B(c120985dq, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37561GgH.A00, c37561GgH.A01), "instagram_reels_auto_advance_countdown_finished");
        if (A0f.isSampled()) {
            String str = null;
            A0f.AAP("media_id", AbstractC37301Gc2.A0h(c120985dq.A02));
            AbstractC37300Gc1.A0o(A0f, c120985dq.A0P);
            if (c120985dq.CdW()) {
                str = AbstractC25226BEj.A1E(c120985dq);
            }
            A0f.AAP("ad_id", str);
            A0f.Cht();
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c37562GgI.A07.BRZ(c38321qM).A0i(false);
        }
        c37562GgI.A06.A0N().A0I(true);
        c37562GgI.A0E.incrementAndGet();
        c37562GgI.A0D.set(0L);
        c37562GgI.A0F.set(c120985dq.getId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0169, code lost:
    
        if (r9 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0191, code lost:
    
        throw X.B4Z.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0184, code lost:
    
        r5.A1I(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0187, code lost:
    
        if (r12 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0189, code lost:
    
        A03(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0101, code lost:
    
        r0 = "for_media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0104, code lost:
    
        r1 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d8, code lost:
    
        r8 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00db, code lost:
    
        r8 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00de, code lost:
    
        r8 = r0.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e1, code lost:
    
        r8 = "for_media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0078, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x006e, code lost:
    
        if (A07(r12) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0070, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0071, code lost:
    
        if (r15 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0061, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x009b, code lost:
    
        if (A08(r12).A0H != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x009d, code lost:
    
        if (r12 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x009f, code lost:
    
        r0 = X.C37546Gg2.A02(r12, r11.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a5, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00af, code lost:
    
        if (X.AbstractC166987dD.A1a(r0.A3S.A00) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b3, code lost:
    
        if (r13 != X.EnumC37860GlF.A03) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00b7, code lost:
    
        if (r14 == X.EnumC37861GlG.A0A) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00bb, code lost:
    
        if (r14 == X.EnumC37861GlG.A0O) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00c5, code lost:
    
        if (A07(r12) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00c7, code lost:
    
        if (r15 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00c9, code lost:
    
        r11.A0G.set(X.AbstractC166987dD.A1L(r13, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bf, code lost:
    
        if (r13 != X.EnumC37860GlF.A05) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00d3, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0092, code lost:
    
        if (r12 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r1 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r12.CdW() == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r13 == X.EnumC37860GlF.A03) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r13 == X.EnumC37860GlF.A05) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r13 == X.EnumC37860GlF.A04) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r13 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r13 == X.EnumC37860GlF.A07) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (r13 != X.EnumC37860GlF.A08) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (r2 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r0 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
    
        r5 = r11.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        if (r5.A01.getBoolean("has_cancelled_reels_auto_scroll", false) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r0 = A08(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        switch(r1) {
            case 0: goto L82;
            case 1: goto L81;
            case 2: goto L81;
            case 3: goto L81;
            case 4: goto L80;
            case 5: goto L80;
            case 6: goto L83;
            case 7: goto L84;
            default: goto L55;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        throw X.B4Z.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r8 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        r7 = X.C05F.A00(2);
        r6 = r7.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r3 >= r6) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        r1 = r7[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        if ((1 - r1.intValue()) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        r0 = "for_session";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r0.equals(r8) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fe, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (r12 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        r0 = X.C37546Gg2.A02(r12, r11.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        if (X.AbstractC166987dD.A1a(r0.A3S.A00) != true) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        r6 = r11.A0A;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC37301Gc2.A0f(r12, r6), new X.C09530e4(null, null)) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
    
        r3 = A01(r13, r14);
        r2 = (X.C09530e4) X.AbstractC37301Gc2.A0f(r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0136, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        r0 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (X.C14360o3.A0K(r3, r0) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        if (r1 != X.C05F.A00) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0144, code lost:
    
        r5.A1I(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        A09(r12, r13, r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014f, code lost:
    
        if (r0 == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
    
        if (r0 != 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0153, code lost:
    
        if (r12 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0157, code lost:
    
        if (r13 != X.EnumC37860GlF.A03) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        if (r14 == X.EnumC37861GlG.A0A) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015f, code lost:
    
        if (r14 == X.EnumC37861GlG.A0O) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016b, code lost:
    
        r0 = X.C37546Gg2.A02(r12, r11.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0171, code lost:
    
        if (r0 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017b, code lost:
    
        if (X.AbstractC166987dD.A1a(r0.A3S.A00) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017d, code lost:
    
        A09(r12, r13, r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0180, code lost:
    
        A03(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0183, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0161, code lost:
    
        if (r10 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0167, code lost:
    
        if (A07(r12) != false) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(X.C120985dq r12, X.EnumC37860GlF r13, X.EnumC37861GlG r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37562GgI.A05(X.5dq, X.GlF, X.GlG, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r0.Cff() != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (((java.lang.Boolean) r7.A0J.getValue()).booleanValue() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06(X.C120985dq r8) {
        /*
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r3 = r7.A0M
            java.lang.String r2 = r8.getId()
            java.lang.Object r0 = r3.get(r2)
            if (r0 != 0) goto L3f
            X.Gg2 r0 = r7.A07
            X.Gg8 r0 = r0.A0A
            X.Ghd r1 = r0.C09(r8)
            X.GiT r0 = r7.A08(r8)
            boolean r0 = r0.A0C
            r5 = 0
            if (r0 == 0) goto L23
            int r0 = r1.A06()
            if (r0 != 0) goto L34
        L23:
            X.0sZ r0 = r7.A0P
            java.lang.Object r0 = r0.invoke()
            X.JI2 r0 = (X.JI2) r0
            r6 = 1
            if (r0 == 0) goto L49
            boolean r0 = r0.CST(r8)
            if (r0 != r6) goto L49
        L34:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r0 = r3.putIfAbsent(r2, r1)
            if (r0 != 0) goto L3f
            r0 = r1
        L3f:
            X.C14360o3.A09(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L49:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r7.A0L
            boolean r0 = r1.A1o
            if (r0 != 0) goto L34
            boolean r0 = r1.A00()
            if (r0 == 0) goto L5c
            boolean r0 = r8.A0K()
            if (r0 == 0) goto L5c
            goto L34
        L5c:
            boolean r1 = r8.CdW()
            X.GiT r0 = r7.A08(r8)
            boolean r0 = r0.A0D
            if (r1 == 0) goto Lae
            r5 = 1
            if (r0 == 0) goto L76
            X.1qM r0 = r8.A02
            if (r0 == 0) goto L76
            boolean r0 = r0.Cff()
            r4 = 1
            if (r0 == r6) goto L77
        L76:
            r4 = 0
        L77:
            X.1qM r0 = r8.A02
            if (r0 == 0) goto L90
            boolean r0 = r0.A5x()
            if (r0 != r6) goto L90
            X.0do r0 = r7.A0J
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L91
        L90:
            r1 = 0
        L91:
            boolean r0 = r8.A0F()
            if (r0 != 0) goto Lac
            boolean r0 = r8.A0G()
            if (r0 != 0) goto Lac
            X.1qM r0 = r8.A02
            if (r0 == 0) goto Lac
            boolean r0 = r0.A5w()
            if (r0 != 0) goto Lac
            if (r4 != 0) goto L34
            if (r1 == 0) goto Lac
            goto L34
        Lac:
            r5 = 0
            goto L34
        Lae:
            if (r0 == 0) goto L34
            boolean r0 = X.AbstractC37655Gho.A03(r8)
            if (r0 != 0) goto L34
            X.1qM r0 = r8.A02
            if (r0 == 0) goto L34
            boolean r0 = r0.Cff()
            if (r0 == 0) goto L34
            r5 = 1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37562GgI.A06(X.5dq):boolean");
    }

    @Override // X.JI8
    public final long BYI() {
        return this.A0E.get();
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
        EnumC37860GlF enumC37860GlF;
        C120985dq c120985dq = this.A00;
        if (c120985dq != null) {
            if ((CT2(c120985dq) && A07(c120985dq)) || this.A0A.get(c120985dq.getId()) != null) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    this.A07.BRZ(c38321qM).A0i(false);
                }
                if (f > f2) {
                    enumC37860GlF = EnumC37860GlF.A07;
                } else {
                    enumC37860GlF = EnumC37860GlF.A08;
                }
                AGM(c120985dq, enumC37860GlF, EnumC37861GlG.A0f);
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JI8
    public final void EJo() {
        this.A0G.set(null);
    }

    private final String A01(EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        String str;
        switch (enumC37860GlF.ordinal()) {
            case 0:
                return AbstractC43591JPw.A00(829);
            case 1:
                str = "interaction";
                break;
            case 2:
                str = "interaction_new_page";
                break;
            case 3:
                str = "interaction_dialog";
                break;
            case 4:
                return "scroll_down";
            case 5:
                return "scroll_up";
            case 6:
                return "scrollback";
            case 7:
                return "scrub";
            default:
                throw B4Z.A00();
        }
        return AnonymousClass001.A0R(str, A02(enumC37861GlG));
    }

    public static final String A02(EnumC37861GlG enumC37861GlG) {
        switch (enumC37861GlG.ordinal()) {
            case 0:
                return "_ad_cta";
            case 1:
                return "_appreciation";
            case 2:
                return "_attr_audio";
            case 3:
                return "_attr_sponsored";
            case 4:
                return "_back";
            case 5:
                return "_boost_cta";
            case 6:
                return "_bottomsheet";
            case 7:
                return "_camera";
            case 8:
                return "_caption";
            case 9:
                return "_clips_showcase";
            case 10:
                return "_comment";
            case 11:
                return "_content_lane";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "_content_notes";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "_direct";
            case 14:
                return "_follow";
            case Process.SIGTERM /* 15 */:
                return "_footer";
            case 16:
                return "_fund_raiser";
            case 17:
                return "_insights_cta";
            case 18:
                return "_insights_tip_cta";
            case Process.SIGSTOP /* 19 */:
                return "_join_channel";
            case 20:
                return "_like";
            case 21:
                return "_long_press";
            case 22:
                return "_long_press_fast_play";
            case 23:
                return "_media_info";
            case 24:
                return "_midscene_ad_cta";
            case 25:
                return "_more_menu";
            case 26:
                return "_header_mute";
            case 27:
                return "_overflow_attribution";
            case 28:
                return "_overlay_ad_cta";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "_overlay_ad_menu";
            case 30:
                return "_professional_cta";
            case 31:
                return AbstractC111324zv.A00(1873);
            case 32:
                return "_remix_button";
            case 33:
                return "_share";
            case 34:
                return "_social_context";
            case 35:
                return "_sponsored_followed_by";
            case 36:
                return "_tap";
            case 37:
                return "_trending_audio_cta";
            case 38:
                return "_ufi";
            case 39:
                return "";
            default:
                throw B4Z.A00();
        }
    }

    @Override // X.JI8
    public final void Co0(C120985dq c120985dq) {
        if (!c120985dq.CdW()) {
            long A0t = AbstractC25232BEp.A0t((Number) AbstractC37301Gc2.A0f(c120985dq, this.A0B));
            long j = A08(c120985dq).A06;
            C36G c36g = C36G.A09;
            long A03 = C36J.A03(C36H.A04(c36g, j));
            long A032 = C36J.A03(C36H.A04(c36g, A08(c120985dq).A00));
            if (A0t > A03 && A0t < A03 + A032) {
                this.A0C.put(c120985dq.getId(), Integer.valueOf(A00(c120985dq) + 1));
            }
        }
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
