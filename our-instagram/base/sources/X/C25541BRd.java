package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BRd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25541BRd extends C37583Gge implements InterfaceC43436JHa, InterfaceC43071ya {
    public C120985dq A00;
    public C120985dq A01;
    public boolean A02;
    public List A03;
    public final Context A04;
    public final Handler A05;
    public final FragmentActivity A06;
    public final InterfaceC31077DlK A07;
    public final C37546Gg2 A08;
    public final C37582Ggd A09;
    public final C37851Gl5 A0A;
    public final AbstractC43757JWv A0B;
    public final BKQ A0C;
    public final C37576GgX A0D;
    public final C37560GgG A0E;
    public final Runnable A0F;
    public final Runnable A0G;
    public final AtomicBoolean A0H;
    public final float A0I;
    public final long A0J;
    public final Fragment A0K;
    public final AbstractC10360h2 A0L;
    public final C07X A0M;
    public final AbstractC018607g A0N;
    public final ClipsViewerConfig A0O;
    public final UserSession A0P;
    public final InterfaceC60442pS A0Q;
    public final C1M1 A0R;
    public final C25540BRc A0S;
    public final C25539BRb A0T;
    public final Runnable A0U;
    public final Runnable A0V;
    public final boolean A0W;
    public final boolean A0X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25541BRd(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C07X c07x, AbstractC018607g abstractC018607g, ClipsViewerConfig clipsViewerConfig, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, C37546Gg2 c37546Gg2, C37582Ggd c37582Ggd, C37851Gl5 c37851Gl5, AbstractC43757JWv abstractC43757JWv, C25540BRc c25540BRc, C37576GgX c37576GgX, C37560GgG c37560GgG) {
        super(fragmentActivity, clipsViewerConfig, userSession, interfaceC60442pS, c37582Ggd, c37576GgX, c37560GgG);
        AbstractC25233BEq.A0w(2, userSession, clipsViewerConfig, c37560GgG);
        AbstractC25234BEr.A1Q(interfaceC60442pS, interfaceC31077DlK, c1m1);
        this.A04 = context;
        this.A0P = userSession;
        this.A0O = clipsViewerConfig;
        this.A0E = c37560GgG;
        this.A09 = c37582Ggd;
        this.A0D = c37576GgX;
        this.A08 = c37546Gg2;
        this.A0B = abstractC43757JWv;
        this.A0A = c37851Gl5;
        this.A0S = c25540BRc;
        this.A06 = fragmentActivity;
        this.A0Q = interfaceC60442pS;
        this.A07 = interfaceC31077DlK;
        this.A0R = c1m1;
        this.A0N = abstractC018607g;
        this.A0L = abstractC10360h2;
        this.A0M = c07x;
        this.A0K = fragment;
        this.A0H = new AtomicBoolean();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0T = new C25539BRb(userSession, AbstractC25225BEi.A07(c06090Tz, userSession, 36604374176699456L), AbstractC25225BEi.A07(c06090Tz, userSession, 36604374176764993L));
        this.A05 = AbstractC167007dF.A0J();
        this.A0X = C18U.A06(c06090Tz, userSession, 36325789712921967L);
        this.A0W = C18U.A06(c06090Tz, userSession, 36325789712987504L);
        this.A0J = C18U.A01(c06090Tz, userSession, 36607264689755715L);
        this.A0I = AbstractC25225BEi.A00(c06090Tz, userSession, 37167324129788355L);
        this.A0C = new BKQ(userSession);
        this.A0G = new RunnableC25544BRg(this);
        this.A0V = new RunnableC25542BRe(this);
        this.A0F = new RunnableC25545BRh(this);
        this.A0U = new RunnableC25543BRf(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0151, code lost:
    
        if (r19 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        r0 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (java.lang.Math.sqrt(A00(((X.C09530e4) r4.get(2)).A00, r23) + A00(((X.C09530e4) r4.get(2)).A01, r24)) <= X.AbstractC13880nE.A00(r5, 26.0f)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    @Override // X.C37583Gge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C120985dq r21, X.C37644Ghd r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25541BRd.A0C(X.5dq, X.Ghd, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r4.A0d(r0) != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (r15.A0X != false) goto L53;
     */
    @Override // X.C37583Gge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.C120985dq r16, X.C37644Ghd r17, float r18, float r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25541BRd.A0D(X.5dq, X.Ghd, float, float):void");
    }

    @Override // X.C37583Gge
    public final boolean A0G(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        boolean z;
        EnumC77213d7 enumC77213d7;
        String str;
        boolean z2 = false;
        if (A06(c120985dq, this)) {
            Handler handler = this.A05;
            handler.removeCallbacks(this.A0V);
            handler.removeCallbacks(this.A0F);
            handler.removeCallbacks(this.A0U);
            this.A07.EWU(c120985dq, false);
        }
        this.A02 = false;
        if (A04(c120985dq) && this.A0H.getAndSet(false)) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb == null || !c75113Zb.A2E) {
                A0B();
            }
            this.A0E.A0I(1.0f);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                C75113Zb BRZ = this.A08.BRZ(c38321qM);
                if (BRZ.A2D) {
                    BRZ.A2D = false;
                    C75113Zb.A00(BRZ, 59);
                }
            }
            this.A0S.A00(this.A04, c120985dq, c37644Ghd, "ended", this.A0I, 1.0f, f, f2);
            return false;
        }
        if (A05(c120985dq)) {
            InterfaceC31077DlK interfaceC31077DlK = this.A07;
            interfaceC31077DlK.EWQ(c120985dq, false);
            int i = c37644Ghd.A07;
            C38321qM c38321qM2 = c120985dq.A02;
            UserSession userSession = this.A0P;
            EnumC27401C7e A01 = AbstractC28409CgF.A01(c37644Ghd, i, SaveApiUtil.A09(userSession, c38321qM2));
            if (A01 != null) {
                BKQ bkq = this.A0C;
                EnumC27389C6s enumC27389C6s = A01.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) bkq.A00, "ig_sundial_gesture_system_events");
                if (A0f.isSampled()) {
                    AbstractC25233BEq.A17(A0f, "action", "fanout_menu_select_option");
                    A0f.AAP("action_source", null);
                    if (enumC27389C6s != null) {
                        str = enumC27389C6s.name();
                    } else {
                        str = null;
                    }
                    A0f.AAP("options", str);
                    A0f.A9K("options_count", null);
                    A0f.A9M("metadata", null);
                    A0f.Cht();
                }
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null) {
                if (i == 3) {
                    this.A05.post(this.A0F);
                } else if (i == 4) {
                    C75113Zb c75113Zb2 = c37644Ghd.A0E;
                    if (c75113Zb2 != null) {
                        FragmentActivity fragmentActivity = this.A06;
                        C1M1 c1m1 = this.A0R;
                        InterfaceC60442pS interfaceC60442pS = this.A0Q;
                        C14360o3.A0B(fragmentActivity, 2);
                        AbstractC167007dF.A1G(interfaceC60442pS, 4, userSession);
                        boolean A09 = SaveApiUtil.A09(userSession, c38321qM3);
                        if (A09) {
                            enumC77213d7 = EnumC77213d7.A03;
                        } else {
                            enumC77213d7 = EnumC77213d7.A04;
                        }
                        SaveApiUtil.A04(fragmentActivity, this.A04, userSession, c38321qM3, interfaceC60442pS, null, enumC77213d7, null, c1m1, null, null, null, 0, 0, -1);
                        AbstractC35184Ffb.A00(fragmentActivity, userSession, c38321qM3, interfaceC60442pS, c75113Zb2, c1m1, null, "long_press", 0, !A09);
                    }
                } else if (i == 2) {
                    FragmentActivity fragmentActivity2 = this.A06;
                    Context context = this.A04;
                    AbstractC018607g abstractC018607g = this.A0N;
                    AbstractC10360h2 abstractC10360h2 = this.A0L;
                    C07X c07x = this.A0M;
                    InterfaceC60442pS interfaceC60442pS2 = this.A0Q;
                    C14360o3.A0B(fragmentActivity2, 1);
                    C14360o3.A0B(context, 2);
                    C14360o3.A0B(userSession, 3);
                    AbstractC25234BEr.A0k(4, abstractC018607g, abstractC10360h2, c07x, interfaceC60442pS2);
                    IQ5.A01(context, fragmentActivity2, abstractC10360h2, c07x, abstractC018607g, interfaceC60442pS2, userSession, c38321qM3, C05F.A02);
                } else if (i == 5) {
                    C75113Zb c75113Zb3 = c37644Ghd.A0E;
                    if (c75113Zb3 != null) {
                        Fragment fragment = this.A0K;
                        InterfaceC60442pS interfaceC60442pS3 = this.A0Q;
                        C14360o3.A0B(userSession, 2);
                        AbstractC167007dF.A1F(fragment, 3, interfaceC60442pS3);
                        String id = c38321qM3.getId();
                        if (id == null) {
                            id = "";
                        }
                        String A2f = c38321qM3.A2f();
                        String moduleName = interfaceC60442pS3.getModuleName();
                        LJe.A01(fragment, userSession, new C45000Jvq(EnumC25577BSp.REELS_LONG_PRESS_FANOUT_MENU, c38321qM3.A1S(), null, Integer.valueOf(c75113Zb3.getPosition()), null, id, A2f, moduleName, c38321qM3.A0C.BJN(), AbstractC25226BEj.A1G(c38321qM3), null, null, false));
                    }
                } else {
                    BKQ bkq2 = this.A0C;
                    Integer num = C05F.A01;
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f((C18920wW) bkq2.A00, "ig_sundial_gesture_system_events");
                    if (A0f2.isSampled()) {
                        AbstractC25233BEq.A17(A0f2, "action", "fanout_menu_exit");
                        BKQ.A00(A0f2, num);
                    }
                    this.A05.removeCallbacks(this.A0U);
                }
                interfaceC31077DlK.EUA(c120985dq, 0);
            }
        }
        C75113Zb c75113Zb4 = c37644Ghd.A0E;
        if (c75113Zb4 != null) {
            z = c75113Zb4.A2E;
        } else {
            z = false;
        }
        boolean z3 = !z;
        if (c37644Ghd.A0R || c37644Ghd.A07 == 3) {
            z2 = true;
        }
        return A0H(c37644Ghd, z3, z2);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue == 2) {
            Object obj = c59062n7.A04;
            C14360o3.A06(obj);
            Object obj2 = c59062n7.A03;
            C14360o3.A06(obj2);
            C120985dq c120985dq = (C120985dq) obj2;
            C75113Zb c75113Zb = ((C37644Ghd) obj).A0E;
            if (c75113Zb != null) {
                if (c75113Zb.A2D) {
                    c75113Zb.A2D = false;
                    C75113Zb.A00(c75113Zb, 59);
                }
                if (c75113Zb.A2E) {
                    c75113Zb.A2E = false;
                    C75113Zb.A00(c75113Zb, 60);
                }
            }
            A01(c120985dq);
            this.A0H.set(false);
            this.A0E.A0I(1.0f);
            this.A05.removeCallbacks(this.A0G);
            this.A02 = false;
        }
    }

    public static double A00(Object obj, float f) {
        return Math.pow(((Number) obj).doubleValue() - f, 2.0d);
    }

    private final void A01(C120985dq c120985dq) {
        if (c120985dq != null) {
            if (A06(c120985dq, this) || A05(c120985dq)) {
                C37644Ghd C09 = this.A08.A0A.C09(c120985dq);
                this.A06.getWindow().clearFlags(8192);
                if (C09.A0R) {
                    this.A0C.A01(C05F.A0j);
                }
                InterfaceC31077DlK interfaceC31077DlK = this.A07;
                interfaceC31077DlK.EWT(c120985dq, false);
                interfaceC31077DlK.EUA(c120985dq, 0);
                Handler handler = this.A05;
                handler.removeCallbacks(this.A0V);
                handler.removeCallbacks(this.A0F);
                handler.removeCallbacks(this.A0U);
                A0B();
            }
        }
    }

    public static final void A02(C120985dq c120985dq, C25541BRd c25541BRd, String str) {
        long j;
        String A2u;
        Long A0j;
        InterfaceC19630xq interfaceC19630xq = c25541BRd.A0T.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("key_clips_fast_play_ui_last_shown_timestamp_ms", System.currentTimeMillis());
        AbstractC167017dG.A1L(ARD, interfaceC19630xq, "key_clips_fast_play_ui_shown_count", 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb BRZ = c25541BRd.A08.BRZ(c38321qM);
            if (!BRZ.A2E) {
                BRZ.A2E = true;
                C75113Zb.A00(BRZ, 60);
            }
        }
        C25540BRc c25540BRc = c25541BRd.A0S;
        long A0C = c25541BRd.A08.A0A.A0C(c120985dq);
        UserSession userSession = c25540BRc.A01;
        InterfaceC11380iw interfaceC11380iw = c25540BRc.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_fast_reels_nux_impression");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A2u = c38321qM2.A2u()) != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0f, j);
            AbstractC25230BEn.A1C(A0f, A0C);
            C37604Ggz c37604Ggz = c25540BRc.A02;
            AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
            A0f.AAP("chaining_session_id", c37604Ggz.A00);
            AbstractC25233BEq.A17(A0f, "ranking_info_token", c120985dq.A0Q);
            AbstractC25232BEp.A1L(A0f, "fast_reels_nux_trigger", str);
        }
    }

    private final boolean A03(float f) {
        Context context = this.A04;
        UserSession userSession = this.A0P;
        float A00 = AbstractC13880nE.A00(context, AbstractC25225BEi.A00(AbstractC166997dE.A0U(userSession), userSession, 37167324129853892L));
        if (0.0f <= f && f <= A00) {
            return true;
        }
        float A01 = AbstractC13890nF.A01(context) - f;
        if (0.0f <= A01 && A01 <= A00) {
            return true;
        }
        return false;
    }

    private final boolean A04(C120985dq c120985dq) {
        if (c120985dq.A01 == EnumC129395t1.A0G && c120985dq.A0J == EnumC40111tc.A0a && !C76493bt.A0Y(c120985dq.A02)) {
            UserSession userSession = this.A0P;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36322899199535846L)) {
                return true;
            }
        }
        return false;
    }

    private final boolean A05(C120985dq c120985dq) {
        if (c120985dq.A01 == EnumC129395t1.A0G && !C76493bt.A0Y(c120985dq.A02)) {
            UserSession userSession = this.A0P;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325789712659822L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(C120985dq c120985dq, C25541BRd c25541BRd) {
        if (c120985dq.A01 == EnumC129395t1.A0G && !C76493bt.A0Y(c120985dq.A02)) {
            UserSession userSession = c25541BRd.A0P;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325789712528749L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC43436JHa
    public final void DGJ(C75113Zb c75113Zb) {
        if (!c75113Zb.A2D && !c75113Zb.A2E && !this.A02) {
            A0B();
        }
    }

    @Override // X.InterfaceC43436JHa
    public final void Dj4(C120985dq c120985dq) {
        if (c120985dq != null && A04(c120985dq) && this.A0T.A00()) {
            this.A00 = c120985dq;
            this.A05.postDelayed(this.A0G, 2000L);
        }
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        A01(this.A01);
        super.onDestroyView();
    }

    @Override // X.C37583Gge
    public final boolean A0F(C120985dq c120985dq, float f, float f2) {
        if (A04(c120985dq) && A03(f)) {
            return true;
        }
        return false;
    }
}
