package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2F2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F2 extends C2F3 implements IGFOAMessagingReadyLogger, FOAMessagingReadyLogger {
    public AbstractC47302Ey A00;
    public boolean A01;
    public final C2F8 A02;
    public final Map A03;
    public final UserSession A04;
    public final List A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile boolean A0B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2F2(com.instagram.common.session.UserSession r21, X.C2F1 r22, X.AbstractC47302Ey r23, X.C47282Ev r24, int r25) {
        /*
            r20 = this;
            r15 = 1
            X.2F7 r9 = X.C2F7.A02
            java.lang.Integer r10 = X.C05F.A0C
            r1 = 0
            r13 = 0
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            X.2F8 r6 = new X.2F8
            r7 = r22
            r8 = r24
            r12 = r25
            r14 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.02i r0 = X.C006802i.A0p
            X.C14360o3.A07(r0)
            r3 = r20
            r3.<init>(r0, r1)
            r3.A02 = r6
            r0 = r23
            r3.A00 = r0
            X.2F7 r5 = X.C2F7.A03
            X.2Ev r12 = com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger.FOA_MARKER
            int r4 = r6.A04
            java.lang.Integer r2 = r6.A07
            boolean r1 = r6.A03
            X.2F1 r11 = r6.A05
            boolean r0 = r6.A02
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            X.2F8 r10 = new X.2F8
            r16 = r4
            r17 = r13
            r18 = r1
            r19 = r0
            r14 = r2
            r13 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0e4 r1 = new X.0e4
            r1.<init>(r5, r10)
            X.0e4 r0 = new X.0e4
            r0.<init>(r9, r6)
            X.0e4[] r0 = new X.C09530e4[]{r1, r0}
            java.util.LinkedHashMap r0 = X.AbstractC06930Yk.A06(r0)
            r3.A03 = r0
            r0 = r21
            r3.A04 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2F2.<init>(com.instagram.common.session.UserSession, X.2F1, X.2Ey, X.2Ev, int):void");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void annotateLoginResult(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A02, "login_result", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void annotateLoginType(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A02, "login_type", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void annotateMsysCallsite(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A02, "msys_callsite", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onBuildFailure(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05.contains(str)) {
            onEndFlowFail("failed_during_offline_message_build");
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowFail(String str) {
        C14360o3.A0B(str, 0);
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            A0A((C2F8) entry.getValue(), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onPersistFailure(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05.contains(str)) {
            onEndFlowFail("failed_during_offline_message_persist");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onPersistMessage(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05.contains(str)) {
            this.A08++;
            if (this.A08 >= this.A07) {
                A0I(this.A02, "offline_persist", null);
                onEndFlowSucceed();
                return;
            }
            return;
        }
        onEndFlowFail("realtime_message_persist_complete");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onProcessFailure(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05.contains(str)) {
            onEndFlowFail("failed_during_offline_message_process");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onReceiveOfflineMessage(String str) {
        C14360o3.A0B(str, 0);
        this.A05.add(str);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onRenderFailure(String str) {
        C14360o3.A0B(str, 0);
        if (this.A05.contains(str)) {
            onEndFlowFail("failed_during_offline_message_render");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void annotateConnectionFailureCode(int i) {
        A0D(this.A02, "connection_failure_code", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void annotateNotifTriggered(boolean z) {
        A0L(this.A02, "notif_triggered", z);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Integer getInstanceKey() {
        Iterator it = this.A03.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            return Integer.valueOf(((C2F8) entry.getValue()).A04);
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Long getStartTimestamp() {
        Iterator it = this.A03.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            return ((C2F8) entry.getValue()).A00;
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final boolean isMarkerOn() {
        Iterator it = this.A03.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            return A0M((C2F8) entry.getValue());
        }
        return false;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onAppBackgrounded(long j) {
        C2F8 c2f8 = this.A02;
        A0L(c2f8, "been_on_background", true);
        A0B(c2f8, "on_background");
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            C2F8 c2f82 = (C2F8) entry.getValue();
            if (c2f82.A07 == C05F.A01) {
                A08(c2f82, j);
                AbstractC47302Ey abstractC47302Ey = this.A00;
                if (abstractC47302Ey != null) {
                    abstractC47302Ey.onLoggerEnded(this);
                }
                this.A00 = null;
            }
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowCancel(String str) {
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            A09((C2F8) entry.getValue(), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger
    public final void onEndFlowSucceed(String str) {
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            A0C((C2F8) entry.getValue(), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogActConnectionEnd() {
        A0I(this.A02, "act_connection", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogActConnectionStart() {
        A0B(this.A02, "act_connection");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogActLoginEnd() {
        A0I(this.A02, "act_login", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogActLoginStart() {
        A0B(this.A02, "act_login");
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onLogClickEnd() {
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            C2F8 c2f8 = (C2F8) entry.getValue();
            C14360o3.A0B(c2f8, 0);
            A0I(c2f8, "click", null);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogInitMsysArmadillo() {
        C2F8 c2f8 = this.A02;
        A0G(c2f8, "init_msys_armadillo", null);
        this.A06++;
        A0D(c2f8, "msys_init_attempt", this.A06);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMailboxBootstrapEnd() {
        A0I(this.A02, "mailbox_bootstrap", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMailboxBootstrapStart() {
        A0B(this.A02, "mailbox_bootstrap");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMailboxDepCallbackEnd() {
        A0I(this.A02, "mailbox_dep_callback", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMailboxDepCallbackStart() {
        A0B(this.A02, "mailbox_dep_callback");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMainFeedFragmentCreated() {
        A0G(this.A02, "main_feed_fragment_created", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMainFeedFragmentResumed() {
        A0G(this.A02, "main_feed_fragment_resumed", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMainFeedRequestEnd() {
        A0I(this.A02, "main_feed_request", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMainFeedRequestStart() {
        A0B(this.A02, "main_feed_request");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogMainFragmentOnCreate() {
        A0G(this.A02, "main_fragment_on_create", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogOfflineSyncStart() {
        A0B(this.A02, "offline_sync");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogRxActCallbackEnd() {
        A0I(this.A02, "rx_act_callback", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogRxActCallbackStart() {
        A0B(this.A02, "rx_act_callback");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogSecureMessageCryptoCallbackEnd() {
        A0I(this.A02, "secure_message_crypto_callback", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onLogSecureMessageCryptoCallbackStart() {
        A0B(this.A02, "secure_message_crypto_callback");
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onOfflineCompletion(int i) {
        this.A07 = i;
        this.A01 = true;
        C2F8 c2f8 = this.A02;
        A0I(c2f8, "offline_sync", null);
        A0H(c2f8, "startup_destination", C1CC.A01);
        A0D(c2f8, "message_count", i);
        if (this.A07 != 0 && !this.A0B) {
            A0L(c2f8, "ending_extended", true);
        } else {
            A0L(c2f8, "ending_extended", false);
            onEndFlowSucceed();
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onOfflineMessageProcessed() {
        this.A09++;
        C2F8 c2f8 = this.A02;
        A0D(c2f8, "offline_message_processed", this.A09);
        if (this.A01 && this.A09 >= this.A07) {
            A0I(c2f8, "offline_process", null);
            onEndFlowSucceed();
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onOfflineMessageProcessedFailed() {
        this.A0A++;
        A0D(this.A02, "offline_message_processed_failed", this.A09);
    }

    @Override // com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger
    public final void onStartFlow(boolean z, boolean z2) {
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null && abstractC47302Ey.onLoggerStarted(this)) {
            for (Map.Entry entry : this.A03.entrySet()) {
                entry.getKey();
                A07((C2F8) entry.getValue());
            }
        }
        C2F8 c2f8 = this.A02;
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        A0L(c2f8, "is_instamadillo", C18U.A06(c06090Tz, userSession, 36326154785928895L));
        A0H(c2f8, "startup_type", C1CC.A09.toString());
        A0L(c2f8, "is_ttlc", C18U.A06(c06090Tz, userSession, 36326154786584264L));
        A0L(c2f8, "is_cold_start", z);
        this.A0B = z2;
        A0L(c2f8, "is_background_account_sync", z2);
    }

    @Override // com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger
    public final void onValidateTotalOfflineDispatch(int i) {
        if (i < this.A07) {
            onEndFlowFail("less_dispatched_from_xplat");
        }
    }

    @Override // com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger
    public final void onEndFlowSucceed() {
        for (Map.Entry entry : this.A03.entrySet()) {
            entry.getKey();
            A0C((C2F8) entry.getValue(), null);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }
}
