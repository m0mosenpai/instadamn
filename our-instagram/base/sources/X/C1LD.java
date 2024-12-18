package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1LD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LD implements InterfaceC13000lm {
    public static final Object A05 = new Object();
    public C98934cD A00;
    public C14160ng A01;
    public C1OP A02;
    public final UserSession A03;
    public final AtomicBoolean A04;

    public C1LD(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = new AtomicBoolean(false);
    }

    public final void A04(final UserSession userSession) {
        int i;
        C14360o3.A0B(userSession, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.prefetchMainReel", -1357539571);
        }
        try {
            if (!this.A04.get()) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36318479678838952L)) {
                    C1LE.A09(userSession);
                }
                if (C18U.A06(c06090Tz, userSession, 36328057457359967L)) {
                    A01(userSession, this);
                } else {
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    A00.ATO(new AbstractRunnableC14200nk() { // from class: X.1LF
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(201, 1, false, true);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1LD.A01(userSession, this);
                        }
                    });
                }
                if (Systrace.A0E(1L)) {
                    i = 900833421;
                } else {
                    return;
                }
            } else if (Systrace.A0E(1L)) {
                i = -1044844338;
            } else {
                return;
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1241607443);
            }
            throw th;
        }
    }

    public final void A05(final UserSession userSession, boolean z) {
        int i;
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.prepareNetworkReelTrayRequest", 2075912577);
        }
        try {
            if (!C18U.A06(C06090Tz.A05, userSession, 36328057457884260L)) {
                if (this.A01 == null && this.A02 == null) {
                    C14160ng c14160ng = new C14160ng(new Callable() { // from class: X.56u
                        @Override // java.util.concurrent.Callable
                        public final /* bridge */ /* synthetic */ Object call() {
                            return C1LD.A00(userSession, C05F.A01);
                        }
                    }, 199, 1, false, true);
                    this.A01 = c14160ng;
                    if (z) {
                        c14160ng.run();
                    } else {
                        C14120nc.A00().ATN(c14160ng);
                    }
                }
                if (Systrace.A0E(1L)) {
                    i = -1820367276;
                } else {
                    return;
                }
            } else if (Systrace.A0E(1L)) {
                i = 1128475850;
            } else {
                return;
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1850628742);
            }
            throw th;
        }
    }

    public static final C1OP A00(final UserSession userSession, Integer num) {
        C1OP A052;
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.createReelTrayRequest", -625998273);
        }
        try {
            C25201La c25201La = (C25201La) userSession.A01(C25201La.class, new InterfaceC16820sZ() { // from class: X.1Ld
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    UserSession userSession2 = UserSession.this;
                    C25301Lk c25301Lk = new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.1Lg
                        @Override // X.InterfaceC25281Li
                        public final /* bridge */ /* synthetic */ Object E3T(String str) {
                            C34466FHe parseFromJson;
                            synchronized (this) {
                                parseFromJson = AbstractC34322FBq.parseFromJson(C16V.A00(str));
                            }
                            return parseFromJson;
                        }

                        @Override // X.InterfaceC25281Li
                        public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                            String obj2;
                            C34466FHe c34466FHe = (C34466FHe) obj;
                            synchronized (this) {
                                StringWriter stringWriter = new StringWriter();
                                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                A0A.A0d();
                                if (c34466FHe.A00 != null) {
                                    A0A.A0r("pending_reel_tray_seen_state");
                                    C25331Ln c25331Ln = c34466FHe.A00;
                                    A0A.A0d();
                                    if (c25331Ln.A00 != null) {
                                        A0A.A0r("reel_tray_impressions");
                                        A0A.A0d();
                                        for (Map.Entry entry : c25331Ln.A00.entrySet()) {
                                            if (!C16V.A04(A0A, entry)) {
                                                A0A.A0i(((Long) entry.getValue()).longValue());
                                            }
                                        }
                                        A0A.A0a();
                                    }
                                    A0A.A0a();
                                }
                                A0A.A0a();
                                A0A.close();
                                obj2 = stringWriter.toString();
                            }
                            return obj2;
                        }
                    }, 29884922);
                    C0o0 A00 = AbstractC14350nz.A00();
                    A00.A01 = "pending_reel_tray_seen_state";
                    C25201La c25201La2 = new C25201La(c25301Lk, userSession2, new C18240vB(A00));
                    C218914p.A08.A0B(c25201La2);
                    return c25201La2;
                }
            });
            C14360o3.A07(c25201La);
            UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession2, 36317212662830011L) && C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 2342160221877113796L) && num != C05F.A0C) {
                A052 = C25401Lu.A06(null, userSession, num, C05F.A00, C25331Ln.A00(c25201La.A00.A00));
                C14360o3.A0A(A052);
            } else if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317212663550918L) && C20150ym.A07(AbstractC20100yh.A00(36317212663616455L))) {
                A052 = IBJ.A00.A00(userSession, num, C05F.A00);
            } else {
                A052 = C25401Lu.A05(null, userSession, num, C05F.A00, C25331Ln.A00(c25201La.A00.A00), false);
                C14360o3.A0A(A052);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1815469787);
            }
            return A052;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-2030859246);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0163 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #7 {, blocks: (B:8:0x0013, B:19:0x0020, B:23:0x002a, B:28:0x0039, B:30:0x0040, B:26:0x0047, B:31:0x004c, B:33:0x0052, B:34:0x0058, B:36:0x0069, B:37:0x0073, B:39:0x007b, B:52:0x015d, B:54:0x0163, B:89:0x0182, B:91:0x0188, B:92:0x018e, B:41:0x0081, B:43:0x0085, B:45:0x008d, B:48:0x00b4, B:51:0x0144, B:62:0x00c0, B:65:0x0152, B:66:0x0155, B:68:0x00cb, B:70:0x00cf, B:71:0x0105, B:73:0x0109, B:75:0x0111, B:78:0x013b, B:83:0x0149, B:87:0x0156, B:77:0x0119, B:47:0x0095), top: B:7:0x0013, outer: #2, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r18, final X.C1LD r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LD.A01(com.instagram.common.session.UserSession, X.1LD):void");
    }

    public static final void A02(C1OP c1op, C3NO c3no, C1LD c1ld, int i, boolean z) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.onReelTrayResponseSuccess", -209171152);
        }
        try {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new HJX(c1op, c3no, c1ld, i, z));
            if (Systrace.A0E(1L)) {
                C0fO.A00(1529633047);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1364178689);
            }
            throw th;
        }
    }

    public final C1OP A03() {
        C1OP c1op;
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.popMainReelTask", -307229610);
        }
        try {
            synchronized (A05) {
                c1op = this.A02;
                this.A02 = null;
                this.A04.set(false);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1256593171);
            }
            return c1op;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(337034479);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("StartupReelTrayPrefetcher.onSessionWillEnd", -1467860690);
        }
        try {
            C11T.A02(new RunnableC43096J3l(this));
            if (Systrace.A0E(1L)) {
                C0fO.A00(1288780406);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(970004907);
            }
            throw th;
        }
    }
}
