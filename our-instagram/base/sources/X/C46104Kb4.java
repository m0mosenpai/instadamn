package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kb4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46104Kb4 extends C2F3 implements IGFOAMessagingThreadViewNavigationLogger, InterfaceC161097Ju {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;
    public C41761wQ A02;
    public C41761wQ A03;
    public UserSession A04;
    public RealtimeClientManager.Observer A05;
    public AbstractC47302Ey A06;
    public final C0k4 A07;
    public final C47802L9k A08;
    public final C47959LGv A09;
    public final C2F8 A0A;
    public final Map A0B;
    public final C218914p A0C;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.L9k, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C46104Kb4(X.C218914p r12, com.instagram.common.session.UserSession r13, X.AbstractC47302Ey r14) {
        /*
            r11 = this;
            r7 = 1
            r0 = 4
            X.C14360o3.A0B(r12, r0)
            X.2Ev r3 = X.C47900LDu.A00
            X.2F7 r4 = X.C2F7.A02
            java.lang.Integer r5 = X.C05F.A01
            r2 = 0
            r8 = 0
            java.util.LinkedHashMap r6 = X.AbstractC166987dD.A1I()
            X.2F8 r1 = new X.2F8
            r9 = r7
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.0k4 r0 = new X.0k4
            r0.<init>()
            r11.<init>(r0, r2)
            r11.A0A = r1
            r11.A06 = r14
            r11.A07 = r0
            X.0e4 r0 = X.AbstractC166987dD.A1L(r4, r1)
            X.2F7 r4 = X.C2F7.A03
            X.2Ev r3 = X.InterfaceC161097Ju.A00
            java.lang.Integer r5 = r1.A07
            boolean r9 = r1.A03
            java.util.LinkedHashMap r6 = X.AbstractC166987dD.A1I()
            X.2F8 r1 = new X.2F8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.LinkedHashMap r0 = X.AbstractC25233BEq.A0p(r4, r1, r0)
            r11.A0B = r0
            r11.A0C = r12
            r11.A04 = r13
            X.L9k r0 = new X.L9k
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r2
            r0.A03 = r8
            r0.A02 = r8
            r11.A08 = r0
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36323968647442166(0x810c7500102ef6, double:3.034762265299577E-306)
            boolean r3 = X.C18U.A06(r4, r13, r0)
            com.instagram.common.session.UserSession r2 = r11.A04
            r0 = 36323968647507703(0x810c7500112ef7, double:3.034762265341023E-306)
            boolean r1 = X.AbstractC31178DnM.A1X(r4, r2, r0)
            X.LGv r0 = new X.LGv
            r0.<init>(r3, r1)
            r11.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46104Kb4.<init>(X.14p, com.instagram.common.session.UserSession, X.2Ey):void");
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotatePushCategory(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A0A, "push_category", str);
        this.A08.A01 = str;
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void maybeEndFlowSuccess(String str) {
        C14360o3.A0B(str, 0);
        if (this.A09.A04(this.A08.A02)) {
            A0H(this.A0A, "end_reason", str);
            A0N();
            Iterator A15 = AbstractC166997dE.A15(this.A0B);
            while (A15.hasNext()) {
                A0C(AbstractC43594JPz.A0l(A15), null);
            }
            AbstractC47302Ey abstractC47302Ey = this.A06;
            if (abstractC47302Ey != null) {
                abstractC47302Ey.onLoggerEnded(this);
            }
            this.A06 = null;
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowFail(String str) {
        C14360o3.A0B(str, 0);
        A0N();
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        while (A15.hasNext()) {
            A0A(AbstractC43594JPz.A0l(A15), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A06;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A06 = null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onLogClickEnd() {
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void onLogThreadRenderingEnd(boolean z) {
        C47959LGv c47959LGv = this.A09;
        synchronized (c47959LGv) {
            c47959LGv.A05 = true;
        }
        C47802L9k c47802L9k = this.A08;
        A0I(this.A0A, "direct_thread_render", c47959LGv.A00(c47802L9k.A02));
        if (z) {
            if (!c47959LGv.A04(c47802L9k.A02)) {
                synchronized (this) {
                    if (this.A05 == null && !c47802L9k.A02) {
                        C49563LvH c49563LvH = new C49563LvH(this);
                        this.A05 = c49563LvH;
                        RealtimeClientManager.getInstance(this.A04).addObserver(c49563LvH);
                    }
                }
                synchronized (this) {
                    if (this.A02 == null && c47802L9k.A02) {
                        C30179DRk c30179DRk = new C30179DRk(this, 45);
                        C41761wQ A0S = AbstractC31174DnI.A0S();
                        this.A02 = A0S;
                        C49799Lz6.A00(C6AH.A00(this.A04).A0B, A0S, c30179DRk, 3);
                    }
                }
                synchronized (this) {
                    if (this.A03 == null && c47802L9k.A02) {
                        C30179DRk c30179DRk2 = new C30179DRk(this, 46);
                        C41761wQ A0S2 = AbstractC31174DnI.A0S();
                        this.A03 = A0S2;
                        C49799Lz6.A00(C6AH.A00(this.A04).A0E, A0S2, c30179DRk2, 3);
                    }
                }
                synchronized (this) {
                    if (!c47802L9k.A02) {
                        if (this.A00 == null) {
                            C44288Jhe c44288Jhe = new C44288Jhe(this, 22);
                            this.A00 = c44288Jhe;
                            AbstractC25651Mw.A00(this.A04).A01(c44288Jhe, C43686JTv.class);
                        }
                        if (this.A01 == null) {
                            C44288Jhe c44288Jhe2 = new C44288Jhe(this, 23);
                            this.A01 = c44288Jhe2;
                            AbstractC25651Mw.A00(this.A04).A01(c44288Jhe2, C5EX.class);
                        }
                    }
                }
                updateExtras(this.A04);
            }
            maybeEndFlowSuccess("rendering");
            return;
        }
        onEndFlowFail("invalid_state");
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void updateExtras(UserSession userSession) {
        boolean equals;
        boolean equals2;
        String str;
        C14360o3.A0B(userSession, 0);
        LinkedHashMap A0J = AbstractC86593tX.A0J(userSession);
        Iterator A14 = AbstractC166997dE.A14(A0J);
        while (A14.hasNext()) {
            AbstractC31177DnL.A1S(AbstractC166987dD.A1K(A14), this.A0A.A01);
        }
        String A0h = AbstractC31171DnF.A0h("act_connection_state", A0J);
        boolean z = false;
        if (A0h == null) {
            equals = false;
        } else {
            equals = A0h.equals("CONNECTED");
        }
        C47959LGv c47959LGv = this.A09;
        c47959LGv.A01(equals);
        String A0h2 = AbstractC31171DnF.A0h("mqtt_channel_connection_state", A0J);
        if (A0h2 == null) {
            equals2 = false;
        } else {
            equals2 = A0h2.equals("CONNECTED");
        }
        c47959LGv.A03(equals2);
        HashMap A00 = C9M5.A00(userSession);
        if (A00 instanceof Map) {
            Iterator A142 = AbstractC166997dE.A14(A00);
            while (A142.hasNext()) {
                AbstractC31177DnL.A1S(AbstractC166987dD.A1K(A142), this.A0A.A01);
            }
            Boolean bool = (Boolean) A00.get("mem_offline_sync_completed");
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        int i = C6AH.A00(userSession).A02;
        c47959LGv.A02(z);
        Integer valueOf = Integer.valueOf(i);
        Map map = this.A0A.A01;
        map.put("mem_offline_sync_queue_size", valueOf);
        if (AbstractC94044Ko.A00 > -1) {
            long j = AbstractC94044Ko.A00;
            synchronized (c47959LGv) {
                c47959LGv.A00 = j;
            }
            AbstractC43592JPx.A1V(AbstractC111324zv.A00(4819), AbstractC94044Ko.A00, map);
        }
        switch (AbstractC94044Ko.A03.intValue()) {
            case 0:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 1:
                str = "STARTED";
                break;
            default:
                str = "COMPLETED";
                break;
        }
        map.put("iris_subscription_status", str);
        long max = Math.max(AbstractC94044Ko.A02, AbstractC94044Ko.A01);
        if (max > -1) {
            AbstractC43592JPx.A1V("iris_delta_count", Math.max(0L, AbstractC94044Ko.A00 - max), map);
            synchronized (c47959LGv) {
                c47959LGv.A01 = Math.max(c47959LGv.A01, max);
            }
        }
        this.A04 = userSession;
    }

    @Override // X.C2F3
    public final void A06() {
        A0H(this.A0A, "unmet_conditions", this.A09.A00(this.A08.A02));
        C14120nc.A00().ATO(new C45705KLi(this));
    }

    public final void A0N() {
        C14360o3.A07(C006802i.A0p);
        this.A07.A01(AbstractC43592JPx.A0N());
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateFirstUserIsBackground(boolean z) {
        A0L(this.A0A, "first_user_is_background", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateIsDm(boolean z) {
        A0L(this.A0A, "is_dm", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateIsInstamadillo(boolean z) {
        C2F8 c2f8 = this.A0A;
        A0L(c2f8, "is_instamadillo", z);
        A0L(c2f8, "is_instamadillo_from_client", z);
        this.A08.A02 = z;
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateIsVm(boolean z) {
        A0L(this.A0A, "is_vm", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateMessageMatchingSuccess(boolean z) {
        A0L(this.A0A, AbstractC111324zv.A00(2717), z);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateMissingMessageId(boolean z) {
        A0L(this.A0A, "missing_message_id", z);
        this.A08.A03 = z;
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void annotateOpenThreadId(String str) {
        if (str != null) {
            A0H(this.A0A, "open_thread_id", str);
        }
        this.A08.A00 = str;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Integer getInstanceKey() {
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        if (A15.hasNext()) {
            return Integer.valueOf(AbstractC43594JPz.A0l(A15).A04);
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Long getStartTimestamp() {
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        if (A15.hasNext()) {
            return AbstractC43594JPz.A0l(A15).A00;
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final boolean isMarkerOn() {
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        if (A15.hasNext()) {
            return A0M(AbstractC43594JPz.A0l(A15));
        }
        return false;
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void maybeEndFlowCancel(String str, String str2) {
        String str3;
        if (str == null || ((str3 = this.A08.A00) != null && str3.equals(str))) {
            onEndFlowCancel(str2);
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onAppBackgrounded(long j) {
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        while (A15.hasNext()) {
            C2F8 A0b = JQ0.A0b(A15);
            if (A0b.A07 == C05F.A01) {
                A08(A0b, j);
                AbstractC47302Ey abstractC47302Ey = this.A06;
                if (abstractC47302Ey != null) {
                    abstractC47302Ey.onLoggerEnded(this);
                }
                this.A06 = null;
            }
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void onLogDirectThreadFragmentCreated() {
        A0G(this.A0A, "direct_thread_fragment_on_create", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void onLogDirectThreadFragmentPaused() {
        A0G(this.A0A, "direct_thread_fragment_on_pause", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger
    public final void onLogDirectThreadFragmentResumed() {
        A0G(this.A0A, "direct_thread_fragment_on_resume", null);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowCancel(String str) {
        A0N();
        Iterator A15 = AbstractC166997dE.A15(this.A0B);
        while (A15.hasNext()) {
            A09(AbstractC43594JPz.A0l(A15), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A06;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A06 = null;
    }
}
