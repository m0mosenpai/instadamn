package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.messagingclient.componentslogger.ComponentLoggerPluginMCFBridgejniDispatcher;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger;
import com.meta.foa.performancelogging.lss.LocalSendSpeedAnnotations;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Kb3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46103Kb3 extends C2F3 implements IGFOAMessagingLocalSendSpeedLogger, FOAMessagingLocalSendSpeedLogger {
    public AbstractC47302Ey A00;
    public final C2F8 A01;
    public final Map A02;

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateEphemeralType(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A01, "ephemeral_type", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateFirstSendType(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A01, "first_send_type", str);
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateLocalDataId(String str) {
        C14360o3.A0B(str, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0H(AbstractC43594JPz.A0l(A15), AbstractC111324zv.A00(4846), str);
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateMediaSource(String str) {
        C14360o3.A0B(str, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0H(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.MEDIA_SOURCE.getAnnotation(), str);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateMessageLifeCycleState(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A01, "message_life_cycle_state", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateMessageSubtype(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A01, "message_sub_type", str);
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateMessageType(LocalSendSpeedMessageTypes localSendSpeedMessageTypes) {
        C14360o3.A0B(localSendSpeedMessageTypes, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0H(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.MESSAGE_TYPE.getAnnotation(), localSendSpeedMessageTypes.getTypeName());
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateReplyToType(String str) {
        C14360o3.A0B(str, 0);
        A0H(this.A01, "reply_to_type", str);
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateSendSurface(String str) {
        C14360o3.A0B(str, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0H(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.SEND_SURFACE.getAnnotation(), str);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateThreadType(int i, String str) {
        C14360o3.A0B(str, 1);
        C2F8 c2f8 = this.A01;
        A0D(c2f8, AbstractC111324zv.A00(3237), i);
        A0H(c2f8, AbstractC111324zv.A00(3236), str);
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateTransportType(String str) {
        C14360o3.A0B(str, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0H(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.TRANSPORT_TYPE.getAnnotation(), str);
        }
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onEndFlowFail(String str) {
        C14360o3.A0B(str, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0A(AbstractC43594JPz.A0l(A15), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onEndFlowSucceed() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            C2F8 A0l = AbstractC43594JPz.A0l(A15);
            synchronized (this) {
                C14360o3.A0B(A0l, 0);
                A0J(A0l, "trace", null, AwakeTimeSinceBootClock.INSTANCE.now());
                C2F3.A02(this, A0l);
                A06();
                if (A0M(A0l)) {
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = super.A00;
                    C2F3.A01(this, A0l);
                    lightweightQuickPerformanceLogger.markerEndForUserFlow(A0l.A06.A00, A0l.A04, (short) 2);
                } else {
                    C2F3.A05(A0l, "succeed", "marker is not active");
                }
            }
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46103Kb3(AbstractC47302Ey abstractC47302Ey, C47282Ev c47282Ev, Map map, int i) {
        super(AbstractC43592JPx.A0N(), map);
        C2F7 c2f7 = C2F7.A02;
        C2F8 c2f8 = new C2F8(null, c47282Ev, c2f7, C05F.A01, AbstractC166987dD.A1I(), i, true, false, false);
        this.A01 = c2f8;
        this.A00 = abstractC47302Ey;
        C2F7 c2f72 = C2F7.A03;
        this.A02 = AbstractC25233BEq.A0p(c2f7, c2f8, AbstractC166987dD.A1L(c2f72, new C2F8(null, FOAMessagingLocalSendSpeedLogger.FOA_MARKER, c2f72, c2f8.A07, AbstractC166987dD.A1I(), c2f8.A04, true, false, false)));
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateAfterSendEphemeralLifetimeMs(Long l) {
        if (l != null) {
            A0E(this.A01, "ephemeral_lifetime_ms", l.longValue());
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateAfterViewedEphemeralLifetimeMs(Long l) {
        if (l != null) {
            A0E(this.A01, "after_view_ephemeral_lifetime_ms", l.longValue());
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateIsBundledWithMediaSend(boolean z) {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0L(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.IS_BUNDLE_WITH_MEDIA_SEND.getAnnotation(), z);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsDm(boolean z) {
        A0L(this.A01, "is_dm", z);
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateIsEncrypted(boolean z) {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0L(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.IS_ENCRYPTED.getAnnotation(), z);
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void annotateIsGroup(boolean z) {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0L(AbstractC43594JPz.A0l(A15), LocalSendSpeedAnnotations.IS_GROUP.getAnnotation(), z);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsInstamadillo(boolean z) {
        A0L(this.A01, "is_instamadillo", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsLink(boolean z) {
        A0L(this.A01, "is_link", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsMsys(boolean z) {
        A0L(this.A01, "is_msys", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsReply(boolean z) {
        A0L(this.A01, "is_reply", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateIsVm(boolean z) {
        A0L(this.A01, "is_vm", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateMediaDurationMs(int i) {
        A0D(this.A01, "media_duration_ms", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateMediaPreviewEnabled(boolean z) {
        A0L(this.A01, "is_media_preview", z);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateMsysThreadId(long j) {
        A0E(this.A01, "msys_thread_id", j);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateNumPendingThreadRowUpdateTasks(int i) {
        A0D(this.A01, "num_pending_thread_row_update_tasks", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateNumSendMutationsCreated(int i) {
        A0D(this.A01, "num_send_mutations_created", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateNumViewModelsToGenerate(int i) {
        A0D(this.A01, "num_view_models_to_generate", i);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateOccamadilloThreadId(Long l) {
        if (l != null) {
            A0E(this.A01, "occamadillo_thread_id", l.longValue());
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateOpenThreadId(String str) {
        A0H(this.A01, "open_thread_id", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateReactToType(String str) {
        A0H(this.A01, "react_to_type", str);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void annotateSendGroupSize(int i) {
        A0D(this.A01, "send_group_size", i);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Integer getInstanceKey() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        if (A15.hasNext()) {
            return Integer.valueOf(AbstractC43594JPz.A0l(A15).A04);
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final Long getStartTimestamp() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        if (A15.hasNext()) {
            return AbstractC43594JPz.A0l(A15).A00;
        }
        return null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final boolean isMarkerOn() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        if (A15.hasNext()) {
            return A0M(AbstractC43594JPz.A0l(A15));
        }
        return false;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onAppBackgrounded(long j) {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            C2F8 A0b = JQ0.A0b(A15);
            if (A0b.A07 == C05F.A01) {
                A08(A0b, j);
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
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A09(AbstractC43594JPz.A0l(A15), str);
        }
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null) {
            abstractC47302Ey.onLoggerEnded(this);
        }
        this.A00 = null;
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public final void onLogClickEnd() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            C2F8 A0l = AbstractC43594JPz.A0l(A15);
            C14360o3.A0B(A0l, 0);
            A0I(A0l, "click", null);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateLocalThreadEnd() {
        A0I(this.A01, "create_local_thread", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateLocalThreadStart() {
        A0B(this.A01, "create_local_thread");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateSendMutationEnd() {
        A0I(this.A01, "create_send_mutation", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateSendMutationStart() {
        A0B(this.A01, "create_send_mutation");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateViewModelAndUpdateRecyclerViewEnd() {
        A0I(this.A01, "create_view_model_and_update_recycler_view", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogCreateViewModelAndUpdateRecyclerViewStart() {
        A0B(this.A01, "create_view_model_and_update_recycler_view");
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onLogDataProcessingEnd() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0I(JQ0.A0b(A15), "data_processing", null);
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onLogDataProcessingStart() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0B(JQ0.A0b(A15), "data_processing");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogDispatchSendMutationEnd() {
        A0I(this.A01, "dispatch_send_mutation", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogDispatchSendMutationStart() {
        A0B(this.A01, "dispatch_send_mutation");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogFetchMessageHistoryFromServerEnd() {
        A0I(this.A01, "fetch_message_history_from_server", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogFetchMessageHistoryFromServerStart() {
        A0B(this.A01, "fetch_message_history_from_server");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogFinishThreadRowUpdateTask() {
        A0G(this.A01, "finish_thread_row_update_task", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogGenerateMessageListViewModelsEnd() {
        A0I(this.A01, AbstractC111324zv.A00(421), null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogGenerateMessageListViewModelsStart() {
        A0B(this.A01, AbstractC111324zv.A00(421));
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogGenerateMessageRowDataEnd() {
        A0I(this.A01, "generate_message_row_data", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogGenerateMessageRowDataStart() {
        A0B(this.A01, "generate_message_row_data");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogMessageAddedToMemory(boolean z) {
        C2F8 c2f8 = this.A01;
        if (z) {
            A0G(c2f8, "message_added_to_memory", null);
        } else {
            A0G(c2f8, "message_add_to_memory_failed", null);
            onEndFlowFail("Message already exists in memory");
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogOnResumeThreadView() {
        A0G(this.A01, "on_resume_thread_view", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogPostThreadUpdateEventEnd() {
        A0I(this.A01, "post_thread_update_event", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogPostThreadUpdateEventStart() {
        A0B(this.A01, "post_thread_update_event");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogReceiverFetchEnd() {
        A0I(this.A01, "receiver_fetch", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogReceiverFetchStart() {
        A0B(this.A01, "receiver_fetch");
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onLogRenderEnd() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0I(JQ0.A0b(A15), "render", null);
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onLogRenderStart() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0B(JQ0.A0b(A15), "render");
        }
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onLogRenderWillDisplay() {
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            A0G(JQ0.A0b(A15), "render_will_display", null);
        }
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogScheduleThreadRowUpdateTaskEnd() {
        A0I(this.A01, "schedule_thread_row_update_task", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogScheduleThreadRowUpdateTaskStart() {
        A0B(this.A01, "schedule_thread_row_update_task");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogSendServiceEnd() {
        A0I(this.A01, "send_service", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogSendServiceStart() {
        A0B(this.A01, "send_service");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogShowOptimisticMessageEnd() {
        A0I(this.A01, "show_optimistic_message", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogShowOptimisticMessageStart() {
        A0B(this.A01, "show_optimistic_message");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogSnapshotMessagesEnd() {
        A0I(this.A01, "snapshot_messages", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogSnapshotMessagesStart() {
        A0B(this.A01, "snapshot_messages");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogTransportMessageEnd() {
        A0I(this.A01, "transport_message", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogTransportMessageStart() {
        A0B(this.A01, "transport_message");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogUpdateLocalThreadIdEnd() {
        A0I(this.A01, "update_local_thread_id", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogUpdateLocalThreadIdStart() {
        A0B(this.A01, "update_local_thread_id");
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogUpdateThreadRowDataListEnd() {
        A0I(this.A01, "update_thread_row_data_list", null);
    }

    @Override // com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger
    public final void onLogUpdateThreadRowDataListStart() {
        A0B(this.A01, "update_thread_row_data_list");
    }

    @Override // com.meta.foa.performancelogging.lss.FOAMessagingLocalSendSpeedLogger
    public final void onStartFlow(boolean z) {
        long longValue;
        String str;
        AbstractC47302Ey abstractC47302Ey = this.A00;
        if (abstractC47302Ey != null && abstractC47302Ey.onLoggerStarted(this)) {
            Iterator A15 = AbstractC166997dE.A15(this.A02);
            while (A15.hasNext()) {
                C2F8 A0b = JQ0.A0b(A15);
                synchronized (this) {
                    C14360o3.A0B(A0b, 0);
                    long now = AwakeTimeSinceBootClock.INSTANCE.now();
                    if (!A0M(A0b)) {
                        C2FA c2fa = C2FA.A04;
                        long A00 = C2FA.A00(c2fa, c2fa.A01.now());
                        long j = now;
                        if (A0b.A08 && 1 <= A00 && A00 < now) {
                            if (A00 > now) {
                                A00 = now;
                            }
                            j = A00;
                        }
                        Long l = A0b.A00;
                        if (l != null) {
                            long longValue2 = l.longValue();
                            if (longValue2 < j && j - longValue2 <= 3000) {
                                j = longValue2;
                            }
                        }
                        Long valueOf = Long.valueOf(j);
                        A0b.A00 = valueOf;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = super.A00;
                        int i = A0b.A06.A00;
                        int i2 = A0b.A04;
                        boolean A1X = AbstractC167007dF.A1X(A0b.A07, C05F.A00);
                        if (valueOf == null) {
                            longValue = now;
                        } else {
                            longValue = valueOf.longValue();
                        }
                        lightweightQuickPerformanceLogger.markerStartForUserFlow(i, i2, null, A1X, -1L, longValue, TimeUnit.MILLISECONDS);
                        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(i, i2);
                        withMarker.setSurviveUserSwitch(A0b.A03);
                        withMarker.markerEditingCompleted();
                        C2F3.A03(this, A0b, A00, now);
                        if (A0b.A02) {
                            if (A0b.A05 != null) {
                                str = "bootstrap_attribution_plugin";
                            } else {
                                str = null;
                            }
                            ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerStartNative(i, i2, str);
                        }
                    } else {
                        C2F3.A05(A0b, "start", "marker is active");
                    }
                }
            }
            annotateIsGroup(z);
        }
    }
}
