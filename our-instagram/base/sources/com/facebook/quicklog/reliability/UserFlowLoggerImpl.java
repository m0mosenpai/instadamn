package com.facebook.quicklog.reliability;

import X.AnonymousClass001;
import X.C209210o;
import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class UserFlowLoggerImpl implements UserFlowLogger {
    public static final String CANCEL_REASON_ANNOTATION = "cancel_reason";
    public static final String DEBUG_INFO_ANNOTATION = "uf_debug_info";
    public static final String HAS_ERROR_ANNOTATION = "uf_has_error";
    public static final AtomicInteger INSTANCE_KEY_COUNTER = new AtomicInteger(1);
    public static final String INVALID_REASON_ANNOTATION = "uf_invalid_reason";
    public static final String SOURCE_ANNOTATION = "trigger_source";
    public static final String SOURCE_OF_RESTART_ANNOTATION = "trigger_source_of_restart";
    public static final String UNSTARTED_DEBUG_INFO_ANNOTATION = "uf_unstarted_debug_info";
    public final boolean mAnnotateTriggerSourceAsCrucial;
    public final Set mOngoingBgCancellableFlows;
    public final Set mOngoingFlows;
    public final QuickPerformanceLogger mQPL;
    public final boolean mStrictMode;

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger) {
        this(quickPerformanceLogger, false, false);
    }

    public static int extractInstanceId(long j) {
        return (int) (j >>> 32);
    }

    public static int extractMarkerId(long j) {
        return (int) j;
    }

    private void flowMarkDebugInfo(long j, String str, boolean z, String str2) {
        MarkerEditor withMarker = this.mQPL.withMarker((int) j, (int) (j >>> 32));
        withMarker.annotate(HAS_ERROR_ANNOTATION, z);
        PointEditor pointEditor = withMarker.pointEditor(str);
        if (str2 != null) {
            pointEditor.addPointData(DEBUG_INFO_ANNOTATION, str2);
        }
        withMarker.markerEditingCompleted();
    }

    public static long generateUserFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
            logUnstartedSession(i2, (short) 10087, str, str2);
        } else {
            this.mQPL.markerAnnotateCrucialForUserFlow(i2, i3, str, i);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        this.mQPL.markerAnnotate(i, i2, "cancel_reason", str2);
        synchronized (this) {
            if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
                logUnstartedSession(i, (short) 10294, AnonymousClass001.A0R("flowCancelAtPoint|", str2), str3);
            } else {
                this.mQPL.markerEndForUserFlow(i, str, i2, (short) 4);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowDrop(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.mQPL.markerDropForUserFlow(i, i2);
            }
            this.mOngoingFlows.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndAbort(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
                logUnstartedSession(i, (short) 10294, "flowEndAbort", "");
            } else {
                this.mQPL.markerEndForUserFlow(i, null, i2, (short) 105);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndFail(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
                logUnstartedSession(i, (short) 10294, AnonymousClass001.A0R("flowEndFail|", str), str3);
            } else {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 3);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    public void flowEndNewStartFound(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 111);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndTimeout(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 113);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkError(long j, String str, String str2) {
        flowMarkDebugInfo(j, str, true, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
            logUnstartedSession(i, (short) 10088, str, str3);
            return;
        }
        MarkerEditor withMarker = this.mQPL.withMarker(i, i2);
        withMarker.pointEditor(str).addPointData(DEBUG_INFO_ANNOTATION, str2);
        withMarker.markerEditingCompleted();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z, long j2) {
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j2;
        flowStartInternal(j, userFlowConfig, false, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        long j2 = i | (i2 << 32);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j;
        if (!flowStartInternal(j2, userFlowConfig, true, null)) {
            return null;
        }
        return Long.valueOf(j2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateFlowId(int i, int i2) {
        return i | (i2 << 32);
    }

    public synchronized int[] getOngoingFlows() {
        int[] iArr;
        iArr = new int[this.mOngoingFlows.size()];
        int i = 0;
        Iterator it = this.mOngoingFlows.iterator();
        while (it.hasNext()) {
            iArr[i] = (int) ((Long) it.next()).longValue();
            i++;
        }
        return iArr;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public synchronized boolean isOngoingFlow(long j) {
        return this.mOngoingFlows.contains(Long.valueOf(j));
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public synchronized void onAppBackgrounded() {
        this.mOngoingFlows.removeAll(this.mOngoingBgCancellableFlows);
        this.mOngoingBgCancellableFlows.clear();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public MarkerEditor withFlow(long j) {
        return this.mQPL.withMarker((int) j, (int) (j >>> 32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        if (r24 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0015, B:12:0x002c, B:16:0x003d, B:18:0x0043, B:19:0x004a, B:21:0x004e, B:23:0x0074, B:26:0x007a, B:27:0x0068, B:28:0x0059), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean flowStartInternal(long r21, com.facebook.quicklog.reliability.UserFlowConfig r23, boolean r24, java.lang.String r25) {
        /*
            r20 = this;
            r2 = r20
            r0 = r21
            monitor-enter(r2)
            java.util.Set r4 = r2.mOngoingFlows     // Catch: java.lang.Throwable -> L81
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L81
            boolean r4 = r4.add(r3)     // Catch: java.lang.Throwable -> L81
            r8 = 1
            r7 = 0
            r6 = 0
            if (r4 != 0) goto L15
            r6 = 1
        L15:
            int r10 = (int) r0     // Catch: java.lang.Throwable -> L81
            r4 = 32
            long r0 = r21 >>> r4
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L81
            boolean r0 = r2.mStrictMode     // Catch: java.lang.Throwable -> L81
            r5 = r23
            if (r0 == 0) goto L26
            if (r6 == 0) goto L3d
            if (r24 != 0) goto L2a
            goto L2c
        L26:
            if (r6 == 0) goto L3d
            if (r24 == 0) goto L3d
        L2a:
            monitor-exit(r2)
            return r7
        L2c:
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "trigger_source_of_restart"
            java.lang.String r0 = r5.mTriggerSource     // Catch: java.lang.Throwable -> L81
            r4.markerAnnotate(r10, r11, r1, r0)     // Catch: java.lang.Throwable -> L81
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            r0 = 111(0x6f, float:1.56E-43)
            r1.markerEndForUserFlow(r10, r11, r0)     // Catch: java.lang.Throwable -> L81
        L3d:
            boolean r13 = r5.mCancelOnBackground     // Catch: java.lang.Throwable -> L81
            r12 = r25
            if (r25 == 0) goto L59
            com.facebook.quicklog.QuickPerformanceLogger r9 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            long r14 = r5.mTtlMs     // Catch: java.lang.Throwable -> L81
            r9.markerStartForUserFlow(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L81
        L4a:
            boolean r0 = r2.mAnnotateTriggerSourceAsCrucial     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L68
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r5.mTriggerSource     // Catch: java.lang.Throwable -> L81
            r4.markerAnnotateCrucialForUserFlow(r10, r11, r1, r0)     // Catch: java.lang.Throwable -> L81
            goto L72
        L59:
            com.facebook.quicklog.QuickPerformanceLogger r14 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            long r0 = r5.mTtlMs     // Catch: java.lang.Throwable -> L81
            r15 = r10
            r16 = r11
            r17 = r13
            r18 = r0
            r14.markerStartForUserFlow(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L81
            goto L4a
        L68:
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.mQPL     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r5.mTriggerSource     // Catch: java.lang.Throwable -> L81
            r4.markerAnnotate(r10, r11, r1, r0)     // Catch: java.lang.Throwable -> L81
        L72:
            if (r13 == 0) goto L7a
            java.util.Set r0 = r2.mOngoingBgCancellableFlows     // Catch: java.lang.Throwable -> L81
            r0.add(r3)     // Catch: java.lang.Throwable -> L81
            goto L7f
        L7a:
            java.util.Set r0 = r2.mOngoingBgCancellableFlows     // Catch: java.lang.Throwable -> L81
            r0.remove(r3)     // Catch: java.lang.Throwable -> L81
        L7f:
            monitor-exit(r2)
            return r8
        L81:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.reliability.UserFlowLoggerImpl.flowStartInternal(long, com.facebook.quicklog.reliability.UserFlowConfig, boolean, java.lang.String):boolean");
    }

    private void logUnstartedSession(int i, short s, String str, String str2) {
        EventBuilder annotate = this.mQPL.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate(INVALID_REASON_ANNOTATION, str);
        if (!TextUtils.isEmpty(str2)) {
            annotate = annotate.annotate(UNSTARTED_DEBUG_INFO_ANNOTATION, str2);
        }
        annotate.report();
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long flowStartForMarker(int i, String str, boolean z) {
        long incrementAndGet = i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
        flowStartInternal(incrementAndGet, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, null);
        return incrementAndGet;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public long generateNewFlowId(int i) {
        return i | (INSTANCE_KEY_COUNTER.incrementAndGet() << 32);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, double d, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, d);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i2, i3, str, i);
        } else {
            logUnstartedSession(i2, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, long j2, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, j2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, str2);
        } else {
            logUnstartedSession(i, (short) 10087, str, str3);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotate(long j, String str, boolean z, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.mStrictMode || this.mOngoingFlows.contains(Long.valueOf(j))) {
            this.mQPL.markerAnnotate(i, i2, str, z);
        } else {
            logUnstartedSession(i, (short) 10087, str, str2);
        }
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        this.mOngoingFlows = new HashSet();
        this.mOngoingBgCancellableFlows = new HashSet();
        quickPerformanceLogger.getClass();
        this.mQPL = quickPerformanceLogger;
        this.mStrictMode = z;
        this.mAnnotateTriggerSourceAsCrucial = z2;
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, null, str, str2);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowEndSuccess(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
                logUnstartedSession(i, (short) 10294, "flowEndSuccess", str);
            } else {
                this.mQPL.markerEndForUserFlow(i, i2, (short) 2);
            }
            Set set = this.mOngoingFlows;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.mOngoingBgCancellableFlows.remove(valueOf);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowMarkPoint(long j, String str, String str2) {
        flowMarkPoint(j, str, str2, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, str);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        return flowStartInternal(j, userFlowConfig, true, str);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public PointEditor markPointWithEditor(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
            logUnstartedSession(i, (short) 10088, str, str2);
            return C209210o.A00;
        }
        return this.mQPL.withMarker(i, i2).pointEditor(str);
    }

    public UserFlowLoggerImpl(QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        this(quickPerformanceLogger, z, true);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, int i) {
        flowAnnotateWithCrucialData(j, str, i, "");
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowMarkPoint(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
            logUnstartedSession(i, (short) 10088, str, "");
        } else {
            this.mQPL.markerPoint(i, i2, str);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, String str, boolean z) {
        flowStartInternal(j, new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), false, null);
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (this.mStrictMode && !this.mOngoingFlows.contains(Long.valueOf(j))) {
            logUnstartedSession(i, (short) 10087, str, str3);
        } else {
            this.mQPL.markerAnnotateCrucialForUserFlow(i, i2, str, str2);
        }
    }

    @Override // com.facebook.quicklog.reliability.UserFlowLogger
    public void flowStart(long j, UserFlowConfig userFlowConfig) {
        flowStartInternal(j, userFlowConfig, false, null);
    }
}
