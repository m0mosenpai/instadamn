package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Kb5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46105Kb5 extends C2F3 implements IGFOAMessagingSendToSentLogger, FOAMessagingSendToSentLogger {
    public AbstractC47302Ey A00;
    public String A01;
    public final QuickPerformanceLogger A02;
    public final C2F8 A03;
    public final Map A04;
    public final C47282Ev A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public volatile long A08;
    public volatile long A09;
    public volatile String A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C46105Kb5(X.AbstractC47302Ey r24, X.C47282Ev r25, X.C47282Ev r26, java.util.Map r27, int r28, boolean r29) {
        /*
            r23 = this;
            r10 = 0
            r3 = 1
            X.2F7 r12 = X.C2F7.A02
            java.lang.Integer r13 = X.C05F.A0C
            java.util.LinkedHashMap r14 = X.AbstractC166987dD.A1I()
            r17 = 0
            X.2F8 r9 = new X.2F8
            r11 = r25
            r15 = r28
            r16 = r29
            r18 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.02i r0 = X.AbstractC43592JPx.A0N()
            r6 = r23
            r1 = r27
            r6.<init>(r0, r1)
            r6.A03 = r9
            r1 = r24
            r6.A00 = r1
            r6.A02 = r0
            X.2F7 r8 = X.C2F7.A03
            X.2Ev r15 = com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger.FOA_MARKER
            int r7 = r9.A04
            java.lang.Integer r5 = r9.A07
            boolean r4 = r9.A08
            X.2F1 r2 = r9.A05
            boolean r1 = r9.A02
            java.util.LinkedHashMap r18 = X.AbstractC166987dD.A1I()
            X.2F8 r0 = new X.2F8
            r19 = r7
            r20 = r4
            r21 = r17
            r22 = r1
            r16 = r8
            r17 = r5
            r13 = r0
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r8, r0)
            java.util.LinkedHashMap r0 = X.AbstractC25233BEq.A0p(r12, r9, r0)
            r6.A04 = r0
            r0 = r26
            r6.A05 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r6.A07 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r6.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46105Kb5.<init>(X.2Ey, X.2Ev, X.2Ev, java.util.Map, int, boolean):void");
    }

    @Override // X.C2F3
    public final void A0D(C2F8 c2f8, String str, int i) {
        C14360o3.A0B(str, 1);
        super.A0D(c2f8, str, i);
    }

    @Override // X.C2F3
    public final void A0G(C2F8 c2f8, String str, String str2) {
        C14360o3.A0B(c2f8, 0);
        super.A0G(c2f8, str, str2);
    }

    public final void A0N(C2F8 c2f8, String str) {
        A0G(c2f8, str, null);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateDirectMutationTypeStr(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A03, "direct_mutation_type_str", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateEndPointReason(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A03, "end_point_reason", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateFirstSend(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A03, "first_send", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotatePreviousMutation(long j, long j2, String str) {
        C14360o3.A0B(str, 2);
        C2F8 c2f8 = this.A03;
        A0E(c2f8, "prev_mutation_start_time_ms", j);
        A0E(c2f8, "prev_mutation_end_time_ms", j2);
        A0H(c2f8, "prev_mutation_type", str);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowFail(String str) {
        C14360o3.A0B(str, 0);
        String A0R = AnonymousClass001.A0R("reason: ", str);
        C14360o3.A0B(A0R, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A0A(AbstractC43594JPz.A0l(A15), A0R);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
        A00(RealtimeConstants.SEND_FAIL);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogCancelSendMutations(String str) {
        C14360o3.A0B(str, 0);
        C2F8 c2f8 = this.A03;
        A0N(c2f8, "cancel_send_mutations");
        A0H(c2f8, "cancel_send_mutations_reason", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDispatchMutationStart(UserSession userSession, boolean z, int i) {
        C14360o3.A0B(userSession, 0);
        C2F8 c2f8 = this.A03;
        A0N(c2f8, "dispatch_mutation_start");
        A0D(c2f8, "mutation_count_in_store_at_dispatch", i);
        A0L(c2f8, "mutation_manager_network_connected", z);
        Iterator A14 = AbstractC166997dE.A14(AbstractC86593tX.A0J(userSession));
        while (A14.hasNext()) {
            AbstractC31177DnL.A1S(AbstractC166987dD.A1K(A14), c2f8.A01);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMQTTFailure(String str) {
        C14360o3.A0B(str, 0);
        A0G(this.A03, "mqtt_failure", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogPlatformLayerAnnotationBoolean(String str, boolean z) {
        C14360o3.A0B(str, 0);
        A0L(this.A03, str, z);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogPlatformLayerPoints(String str, String str2) {
        C14360o3.A0B(str, 0);
        A0G(this.A03, str, str2);
    }

    private final void A00(String str) {
        this.A02.markEventBuilder(this.A05.A00, AbstractC167017dG.A0K(getInstanceKey()), str).annotate("message_id_debug", this.A01).report();
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateDirectMutationType(int i) {
        A0D(this.A03, "direct_mutation_type", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateDispatchedFromDisk() {
        A0L(this.A03, "dispatched_from_disk", true);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateForwardThreadType(boolean z, boolean z2) {
        Integer num;
        int i;
        C2F8 c2f8 = this.A03;
        if (z) {
            if (z2) {
                num = C05F.A0N;
            } else {
                num = C05F.A0C;
            }
        } else if (z2) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        switch (num.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        A0D(c2f8, "forward_thread_type", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateIsForward(boolean z) {
        A0L(this.A03, "is_forwarded", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void annotateIsReshare(boolean z) {
        A0L(this.A03, AbstractC111324zv.A00(2629), z);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Integer getInstanceKey() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        if (A15.hasNext()) {
            return Integer.valueOf(AbstractC43594JPz.A0l(A15).A04);
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Long getStartTimestamp() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        if (A15.hasNext()) {
            return AbstractC43594JPz.A0l(A15).A00;
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final boolean isMarkerOn() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        if (A15.hasNext()) {
            return A0M(AbstractC43594JPz.A0l(A15));
        }
        return false;
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void maybeAnnotateDiskIOBlocking() {
        boolean z;
        long j = AbstractC49672Qa.A01;
        long j2 = AbstractC49672Qa.A00;
        String str = AbstractC49672Qa.A02;
        if (this.A08 > 0 && this.A0A != null && this.A08 != j) {
            C2F8 c2f8 = this.A03;
            A0E(c2f8, "alive_disk_io_start_ms", this.A08);
            A0H(c2f8, "alive_disk_io_trigger", this.A0A);
            z = true;
        } else {
            z = false;
        }
        if (j > 0 && str != null && j2 > this.A09) {
            C2F8 c2f82 = this.A03;
            A0E(c2f82, "disk_io_blocking_start_ms", j);
            A0E(c2f82, "disk_io_blocking_end_ms", j2);
            A0H(c2f82, "disk_io_blocking_trigger", str);
        } else if (!z) {
            return;
        }
        C2F8 c2f83 = this.A03;
        A0E(c2f83, "io_blocking_send_event_start_ms", this.A09);
        A0E(c2f83, "io_blocking_send_mutation_start_ms", AwakeTimeSinceBootClock.INSTANCE.now());
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onAppBackgrounded(long j) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            C2F8 A0b = JQ0.A0b(A15);
            if (A0b.A07 == C05F.A01) {
                A08(A0b, j);
                AbstractC47302Ey abstractC47302Ey = this.A00;
                if (abstractC47302Ey != null) {
                    abstractC47302Ey.onLoggerEnded(this);
                }
                this.A00 = null;
            } else {
                A0N(A0b, AbstractC111324zv.A00(173));
            }
        }
    }

    @Override // X.C2F3, com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onAppForegrounded() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A0N(JQ0.A0b(A15), "app_foregrounded");
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowCancel(String str) {
        String A0S = AnonymousClass001.A0S("reason: ", str, '}');
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A09(AbstractC43594JPz.A0l(A15), A0S);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
        A00("cancel");
    }

    @Override // com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger
    public final void onEndFlowSucceed(String str) {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            A0C(AbstractC43594JPz.A0l(A15), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogArmadilloExpressSendEventListenerSendSuccessEnd() {
        A0N(this.A03, "armadillo_express_event_listener_send_success_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogArmadilloExpressSendEventListenerSendSuccessStart() {
        A0N(this.A03, "armadillo_express_event_listener_send_success_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogArmadilloTlcControlOpenThread() {
        A0N(this.A03, "armadillo_tlc_control_open_thread");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogBumpThreadEnd() {
        A0N(this.A03, "bump_thread_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogBumpThreadStart() {
        A0N(this.A03, "bump_thread_start");
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onLogClickEnd() {
        Iterator A15 = AbstractC166997dE.A15(this.A04);
        while (A15.hasNext()) {
            C2F8 A0l = AbstractC43594JPz.A0l(A15);
            C14360o3.A0B(A0l, 0);
            A0I(A0l, "click", null);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogCreateArmadilloExpressProtobufPayloadEnd() {
        A0N(this.A03, "create_armadillo_express_protobuf_payload_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogCreateArmadilloExpressProtobufPayloadStart() {
        A0N(this.A03, "create_armadillo_express_protobuf_payload_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationCancel() {
        A0N(this.A03, "direct_mutation_cancel");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationConfirm() {
        A0N(this.A03, "direct_mutation_confirm");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationDispatch() {
        A0N(this.A03, "direct_mutation_dispatch");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationDrop() {
        A0N(this.A03, "direct_mutation_drop");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationExecute() {
        A0N(this.A03, "direct_mutation_execute");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationFailure() {
        A0N(this.A03, AbstractC111324zv.A00(4285));
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationRetry() {
        A0N(this.A03, "direct_mutation_retry");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDirectMutationSuccess() {
        A0N(this.A03, "direct_mutation_success");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogDispatchMutationEnd() {
        A0N(this.A03, "dispatch_mutation_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogExecuteMutationEnd() {
        A0N(this.A03, "execute_mutation_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogExecuteMutationStart() {
        A0N(this.A03, "execute_mutation_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogFirstMutationSystemDispatchEnd(boolean z) {
        if (this.A06.compareAndSet(true, false)) {
            C2F8 c2f8 = this.A03;
            A0N(c2f8, "first_system_dispatch_mutation_end");
            A0L(c2f8, "is_send_mutation_pending", z);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogFirstMutationSystemDispatchStart() {
        if (this.A07.compareAndSet(true, false)) {
            A0N(this.A03, "first_system_dispatch_mutation_start");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogFlowConnectId() {
        A0N(this.A03, "flow_connect_id");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogHandleOutgoingPayloadEnd() {
        A0N(this.A03, "handle_outgoing_payload_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogHandleOutgoingPayloadStart() {
        A0N(this.A03, "handle_outgoing_payload_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogLSSEndFlowSucceed() {
        A0N(this.A03, "lss_end_flow_succeed");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMCCErrors(long j, long j2, long j3, int i) {
        C2F8 c2f8 = this.A03;
        A0G(c2f8, "mcc_error_domain", String.valueOf(j));
        A0G(c2f8, "mcc_error_event", String.valueOf(j2));
        A0G(c2f8, "mcc_error_sub_event", String.valueOf(j3));
        A0G(c2f8, "mcc_error_code", String.valueOf(i));
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMQTTACK() {
        A0N(this.A03, "mqtt_ack");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMQTTPublish() {
        A0N(this.A03, "mqtt_publish");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMediaScrutinyFailed() {
        A0N(this.A03, "media_scrutiny_failed");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMediaScrutinySuccess() {
        A0N(this.A03, "media_scrutiny_success");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMessageSyncEnd() {
        A0N(this.A03, "message_sync_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMessageSyncStart() {
        A0N(this.A03, "message_sync_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogMsysApiMainContextInvoked() {
        A0N(this.A03, "msys_api_main_context_invoked");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogPIIRemovalFailed() {
        A0N(this.A03, "pii_removal_failed");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogPIIRemovalStart() {
        A0N(this.A03, "pii_removal_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogPIIRemovalSuccess() {
        A0N(this.A03, "pii_removal_success");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogProcessDmMessageEnd() {
        A0N(this.A03, "process_dm_message_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogProcessDmMessageStart() {
        A0N(this.A03, "process_dm_message_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogRemoveMessageContextEnd() {
        A0N(this.A03, "remove_message_context_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogRemoveMessageContextStart() {
        A0N(this.A03, "remove_message_context_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogRenderVideoFailed() {
        A0N(this.A03, "render_video_failed");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogRenderVideoSuccess() {
        A0N(this.A03, "render_video_success");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendArmadilloExpressPayloadEnd() {
        A0N(this.A03, "send_armadillo_express_payload_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendArmadilloExpressPayloadStart() {
        A0N(this.A03, "send_armadillo_express_payload_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendMutationEnd() {
        A0N(this.A03, "send_mutation_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendMutationStart() {
        A0N(this.A03, "send_mutation_start");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendServerAuthoritative() {
        C2F8 c2f8 = this.A03;
        int i = c2f8.A04;
        Long l = c2f8.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("instanceKey: ");
        A1C.append(i);
        A0G(c2f8, "send_server_authoritative", AbstractC167017dG.A0n(l, ", startTimestamp: ", A1C));
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendTextMessageMutationEnd() {
        A0N(this.A03, "send_text_message_mutation_end");
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void onLogSendTextMessageMutationStart() {
        A0N(this.A03, "send_text_message_mutation_start");
    }

    @Override // com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger
    public final void onStartFlow() {
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null && abstractC47302Ey.onLoggerStarted(this)) {
            Iterator A15 = AbstractC166997dE.A15(this.A04);
            while (A15.hasNext()) {
                A07(AbstractC43594JPz.A0l(A15));
            }
        }
        C1GJ.A05(new KK0(this, 2), 1887904277, 4, 120000, false, true);
        this.A09 = AwakeTimeSinceBootClock.INSTANCE.now();
        long j = AbstractC49672Qa.A01;
        long j2 = AbstractC49672Qa.A00;
        String str = AbstractC49672Qa.A02;
        if (j2 < j && j > 0 && str != null) {
            this.A08 = j;
        } else {
            this.A08 = 0L;
            str = null;
        }
        this.A0A = str;
    }

    @Override // com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger
    public final void logTraceAnnotations(boolean z, int i, String str, int i2, String str2, int i3, String str3, boolean z2, Long l, Long l2, boolean z3, String str4, String str5, boolean z4, boolean z5, Integer num, Integer num2, String str6) {
        C14360o3.A0B(str, 2);
        AbstractC25229BEm.A1L(str4, 11, str5);
        C2F8 c2f8 = this.A03;
        A0L(c2f8, "is_instamadillo", z);
        A0D(c2f8, "trace_type", i);
        this.A01 = str;
        A0H(c2f8, "message_id_debug", str);
        A0D(c2f8, "hash_igd_message_id", i2);
        if (str2 != null) {
            A0H(c2f8, "1tid_trace_id", str2);
        }
        A0D(c2f8, "message_send_type", i3);
        if (str3 != null) {
            A0H(c2f8, "open_thread_id", str3);
        }
        A0L(c2f8, "is_disappearing_mode", z2);
        if (l != null) {
            A0E(c2f8, "ephemeral_lifetime_ms", l.longValue());
        }
        if (l2 != null) {
            A0E(c2f8, "after_view_ephemeral_lifetime_ms", l2.longValue());
        }
        A0L(c2f8, "is_vanish_mode", z3);
        A0H(c2f8, "thread_type", str4);
        A0H(c2f8, TraceFieldType.TransportType, str5);
        A0L(c2f8, "is_e2ee", z4);
        String A00 = AbstractC111324zv.A00(4765);
        A0L(c2f8, A00, z5);
        if (num != null) {
            A0D(c2f8, "attachment_type", num.intValue());
            A0H(c2f8, "at", num.toString());
        }
        if (num2 != null) {
            A0D(c2f8, "attachment_count", num2.intValue());
            A0H(c2f8, "ac", num2.toString());
        }
        if (str6 != null) {
            A0H(c2f8, "visual_type", str6);
        }
        EventBuilder annotate = this.A02.markEventBuilder(this.A05.A00, AbstractC167017dG.A0K(getInstanceKey()), "start").annotate("is_instamadillo", z).annotate("is_e2ee", z4).annotate(TraceFieldType.TransportType, str5).annotate("message_id_debug", str).annotate("message_send_type", i3).annotate("open_thread_id", str3).annotate("is_vanish_mode", z3).annotate("thread_type", str4).annotate(A00, z5);
        if (num != null) {
            annotate.annotate("attachment_type", num.intValue());
            annotate.annotate("at", num.toString());
        }
        if (num2 != null) {
            annotate.annotate("attachment_count", num2.intValue());
            annotate.annotate("ac", num2.toString());
        }
        if (str6 != null) {
            annotate.annotate("visual_type", str6);
        }
        if (l != null) {
            annotate.annotate("ephemeral_lifetime_ms", l.longValue());
        }
        if (l2 != null) {
            annotate.annotate("after_view_ephemeral_lifetime_ms", l2.longValue());
        }
        annotate.report();
    }

    @Override // com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger
    public final void onEndFlowSucceed() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("instanceKey: ");
        C2F8 c2f8 = this.A03;
        A1C.append(c2f8.A04);
        A1C.append(", startTimestamp: ");
        onEndFlowSucceed(AbstractC166997dE.A0v(c2f8.A00, A1C));
        A00("success");
    }
}
