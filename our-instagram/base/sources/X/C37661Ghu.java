package X;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ghu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37661Ghu implements JIH, C38Y {
    public float A00;
    public C120985dq A01;
    public Boolean A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final ValueAnimator A09;
    public final Context A0A;
    public final ClipsViewerConfig A0B;
    public final UserSession A0C;
    public final InterfaceC60442pS A0D;
    public final InterfaceC19630xq A0E;
    public final InterfaceC43589JPu A0F;
    public final C43754JWs A0G;
    public final Runnable A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final boolean A0K;
    public final InterfaceC31077DlK A0L;
    public final List A0M;
    public final boolean A0N;

    public C37661Ghu(Context context, ClipsViewerConfig clipsViewerConfig, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C37560GgG c37560GgG, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        boolean z;
        C14360o3.A0B(interfaceC43589JPu, 6);
        this.A0A = context;
        this.A0D = interfaceC60442pS;
        this.A0C = userSession;
        this.A0J = interfaceC16820sZ;
        this.A0B = clipsViewerConfig;
        this.A0F = interfaceC43589JPu;
        this.A0I = interfaceC16820sZ2;
        this.A0L = interfaceC31077DlK;
        this.A0E = C1AT.A01(userSession).A04(C1AV.A0k, getClass());
        this.A03 = "bounce_nux";
        this.A09 = new ValueAnimator();
        ClipsViewerSource clipsViewerSource = ClipsViewerSource.A0s;
        boolean z2 = false;
        List A1Q = AbstractC16960so.A1Q(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "reel_feed_timeline", "push_notif", AbstractC111324zv.A00(2071));
        this.A0M = A1Q;
        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                if (AbstractC001900j.A0a(this.A0D.getModuleName(), AbstractC166987dD.A1B(it), false)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.A0N = z;
        if (this.A0B.A0J == clipsViewerSource) {
            UserSession userSession2 = this.A0C;
            if (C18U.A06(C06090Tz.A05, userSession2, 36318604232235346L) || C7M4.A00(userSession2).booleanValue()) {
                z2 = true;
            }
        }
        this.A0K = z2;
        C43754JWs A00 = AbstractC37837Gkr.A00(this.A0C);
        C14360o3.A07(A00);
        this.A0G = A00;
        this.A0H = new RunnableC38015Go2(this);
        c37560GgG.A99(this);
        InterfaceC19630xq interfaceC19630xq = this.A0E;
        if (interfaceC19630xq.getBoolean("KEY_HAS_SUCCESSFULLY_SWIPED", false) && !interfaceC19630xq.contains("KEY_LAST_SWIPED_TIMESTAMP_MS")) {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G("KEY_LAST_SWIPED_TIMESTAMP_MS", currentTimeMillis);
            ARD.E7G("KEY_SURFACE_LAST_SWIPED_TIMESTAMP_MS", currentTimeMillis);
            ARD.apply();
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DY0() {
        A03(this, false);
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        boolean z = false;
        if (intValue != 1) {
            if (intValue != 2 && intValue != 0) {
                throw B4Z.A00();
            }
        } else {
            ViewPager2 viewPager2 = AbstractC25226BEj.A17(this.A0I).A00;
            if (viewPager2 == null || !viewPager2.A06.A06.A07) {
                z = true;
            }
        }
        this.A08 = z;
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    public static final C120985dq A00(C37661Ghu c37661Ghu) {
        int A03 = AbstractC25226BEj.A17(c37661Ghu.A0I).A03() + 1;
        InterfaceC16820sZ interfaceC16820sZ = c37661Ghu.A0J;
        if (C37546Gg2.A01(interfaceC16820sZ) > A03) {
            return C37546Gg2.A03(interfaceC16820sZ).A0F(A03);
        }
        return null;
    }

    public static final void A01(C120985dq c120985dq, C37661Ghu c37661Ghu, boolean z) {
        String str;
        InterfaceC60442pS interfaceC60442pS = c37661Ghu.A0D;
        UserSession userSession = c37661Ghu.A0C;
        C38321qM c38321qM = c120985dq.A02;
        InterfaceC43589JPu interfaceC43589JPu = c37661Ghu.A0F;
        String str2 = c37661Ghu.A0B.A1I;
        String str3 = c37661Ghu.A03;
        C14360o3.A0B(str3, 5);
        if (c38321qM != null && str2 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_scroll_awareness_nux_dismissal");
            A0f.AAP("nux_type", str3);
            if (z) {
                str = "tap_dismiss";
            } else {
                str = "back_or_exit_button";
            }
            A0f.AAP("action_source", str);
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            String id = c38321qM.getId();
            if (id != null) {
                A0f.AAP("media_compound_key", id);
                AbstractC25230BEn.A1C(A0f, 0L);
                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                A0f.AAP("viewer_init_media_compound_key", str2);
                AbstractC37302Gc3.A0y(A0f, c38321qM);
                AbstractC37302Gc3.A0z(A0f, c38321qM);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0pQ, java.lang.Object] */
    public static final void A02(C37661Ghu c37661Ghu) {
        C120985dq A00;
        InterfaceC16820sZ interfaceC16820sZ = c37661Ghu.A0J;
        if (C37546Gg2.A01(interfaceC16820sZ) > 0 && (A00 = A00(c37661Ghu)) != null && !C37546Gg2.A03(interfaceC16820sZ).C09(A00).A0f) {
            UserSession userSession = c37661Ghu.A0C;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322577077971276L);
            if (A00.A01 == EnumC129395t1.A0G) {
                InterfaceC19630xq interfaceC19630xq = c37661Ghu.A0E;
                if (AbstractC37300Gc1.A00(interfaceC19630xq.getLong("KEY_LAST_SEEN_TIMESTAMP_MS", 0L)) > 86400000 && !AbstractC56862jK.A00(c37661Ghu.A0A) && !A06) {
                    ClipsViewerConfig clipsViewerConfig = c37661Ghu.A0B;
                    if (!clipsViewerConfig.A00()) {
                        c37661Ghu.A04 = false;
                        Object invoke = c37661Ghu.A0I.invoke();
                        InterfaceC31077DlK interfaceC31077DlK = c37661Ghu.A0L;
                        ValueAnimator valueAnimator = c37661Ghu.A09;
                        if (!valueAnimator.isRunning()) {
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                            valueAnimator.setFloatValues(-12.5f, 0.0f);
                            valueAnimator.setDuration(1000L);
                            valueAnimator.setRepeatCount(1);
                            valueAnimator.setRepeatMode(1);
                            ?? obj = new Object();
                            obj.A00 = 3;
                            valueAnimator.addUpdateListener(new C44249Jgt(15, invoke, c37661Ghu));
                            valueAnimator.addListener(new MaY(1, interfaceC31077DlK, invoke, obj, A00, c37661Ghu));
                            valueAnimator.start();
                        }
                        if (c37661Ghu.A07 && AbstractC166997dE.A1Z(c37661Ghu.A02, true)) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.E77("KEY_HAS_SEEN_DIRECT_SWIPE_UP_NUX", true);
                            ARD.apply();
                        }
                        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                        ARD2.E7G("KEY_LAST_SEEN_TIMESTAMP_MS", System.currentTimeMillis());
                        ARD2.apply();
                        InterfaceC60442pS interfaceC60442pS = c37661Ghu.A0D;
                        C38321qM c38321qM = A00.A02;
                        InterfaceC43589JPu interfaceC43589JPu = c37661Ghu.A0F;
                        String str = clipsViewerConfig.A1I;
                        String str2 = c37661Ghu.A03;
                        C14360o3.A0B(str2, 5);
                        if (c38321qM != null && str != null) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_scroll_awareness_nux_impression");
                            A0f.AAP("nux_type", str2);
                            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                            String id = c38321qM.getId();
                            if (id != null) {
                                A0f.AAP("media_compound_key", id);
                                AbstractC25230BEn.A1C(A0f, 0L);
                                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                                A0f.AAP("viewer_init_media_compound_key", str);
                                AbstractC37302Gc3.A0y(A0f, c38321qM);
                                AbstractC37302Gc3.A0z(A0f, c38321qM);
                                A0f.Cht();
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
        }
    }

    public static final void A03(C37661Ghu c37661Ghu, boolean z) {
        C120985dq c120985dq = c37661Ghu.A01;
        if ((c120985dq != null || (c120985dq = A00(c37661Ghu)) != null) && A04(c120985dq, c37661Ghu.A0L, c37661Ghu, false, false) && z) {
            InterfaceC60442pS interfaceC60442pS = c37661Ghu.A0D;
            UserSession userSession = c37661Ghu.A0C;
            C38321qM c38321qM = c120985dq.A02;
            InterfaceC43589JPu interfaceC43589JPu = c37661Ghu.A0F;
            String str = c37661Ghu.A0B.A1I;
            String str2 = c37661Ghu.A03;
            C14360o3.A0B(str2, 5);
            if (c38321qM != null && str != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_scroll_awareness_nux_scroll");
                A0f.AAP("nux_type", str2);
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String id = c38321qM.getId();
                if (id != null) {
                    A0f.AAP("media_compound_key", id);
                    AbstractC25230BEn.A1C(A0f, 0L);
                    InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                    AbstractC37303Gc4.A0a(A0f);
                    A0f.AAP("viewer_init_media_compound_key", str);
                    AbstractC37302Gc3.A0y(A0f, c38321qM);
                    AbstractC25232BEp.A1L(A0f, "mezql_token", c38321qM.A0C.getMezqlToken());
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        c37661Ghu.A09.cancel();
        AbstractC25226BEj.A17(c37661Ghu.A0I).A0D();
    }

    public static final boolean A04(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, C37661Ghu c37661Ghu, boolean z, boolean z2) {
        InterfaceC16820sZ interfaceC16820sZ = c37661Ghu.A0J;
        if (C37546Gg2.A03(interfaceC16820sZ).C09(c120985dq).A0f == z && !z2) {
            return false;
        }
        interfaceC31077DlK.EWb(c120985dq, c37661Ghu.A07);
        interfaceC31077DlK.EeB(c120985dq, z);
        interfaceC31077DlK.Ea3(c120985dq, true);
        interfaceC16820sZ.invoke();
        if (!z) {
            if (!C14360o3.A0K(c37661Ghu.A01, c120985dq)) {
                return true;
            }
            c120985dq = null;
        }
        c37661Ghu.A01 = c120985dq;
        return true;
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        if (i != i2) {
            this.A05 = true;
            InterfaceC19610xo ARD = this.A0E.ARD();
            ARD.E77("KEY_HAS_SUCCESSFULLY_SWIPED", true);
            ARD.E7G("KEY_LAST_SWIPED_TIMESTAMP_MS", System.currentTimeMillis());
            ARD.apply();
            A03(this, false);
            this.A06 = false;
        }
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
        C37556GgC c37556GgC = (C37556GgC) this.A0I.invoke();
        ViewPager2 viewPager2 = c37556GgC.A00;
        if ((viewPager2 == null || !viewPager2.A06.A06.A07) && c37556GgC.A0A() == C05F.A01) {
            A03(this, !this.A04);
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        if (!this.A06 && i2 >= 2 && i == 0 && this.A0N) {
            C11T.A03(new J43(this));
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        boolean z;
        long j;
        C3x9 A0u;
        C5HS CGA;
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null && (A0u = AbstractC25226BEj.A0u(A0G)) != null && (CGA = A0u.CGA()) != null) {
            z = CGA.Axy();
        } else {
            z = false;
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            j = c38321qM.A1C();
        } else {
            j = 10000;
        }
        if (!z) {
            C11T.A04(this.A0H, j);
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
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
