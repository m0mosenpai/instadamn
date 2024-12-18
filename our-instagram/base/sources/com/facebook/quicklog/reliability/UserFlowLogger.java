package com.facebook.quicklog.reliability;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;

/* loaded from: classes.dex */
public interface UserFlowLogger {
    public static final long UNDEFINED_FLOW_ID = 0;

    void flowAnnotate(long j, String str, double d);

    void flowAnnotate(long j, String str, double d, String str2);

    void flowAnnotate(long j, String str, int i);

    void flowAnnotate(long j, String str, int i, String str2);

    void flowAnnotate(long j, String str, long j2);

    void flowAnnotate(long j, String str, long j2, String str2);

    void flowAnnotate(long j, String str, String str2);

    void flowAnnotate(long j, String str, String str2, String str3);

    void flowAnnotate(long j, String str, boolean z);

    void flowAnnotate(long j, String str, boolean z, String str2);

    void flowAnnotateWithCrucialData(long j, String str, int i);

    void flowAnnotateWithCrucialData(long j, String str, int i, String str2);

    void flowAnnotateWithCrucialData(long j, String str, String str2);

    void flowAnnotateWithCrucialData(long j, String str, String str2, String str3);

    void flowCancelAtPoint(long j, String str, String str2);

    void flowCancelAtPoint(long j, String str, String str2, String str3);

    void flowDrop(long j);

    void flowEndAbort(long j);

    void flowEndCancel(long j, String str);

    void flowEndCancel(long j, String str, String str2);

    void flowEndFail(long j, String str, String str2);

    void flowEndFail(long j, String str, String str2, String str3);

    void flowEndSuccess(long j);

    void flowEndSuccess(long j, String str);

    void flowEndTimeout(long j);

    void flowMarkError(long j, String str, String str2);

    void flowMarkPoint(long j, String str);

    void flowMarkPoint(long j, String str, String str2);

    void flowMarkPoint(long j, String str, String str2, String str3);

    void flowStart(long j, UserFlowConfig userFlowConfig);

    void flowStart(long j, String str, UserFlowConfig userFlowConfig);

    void flowStart(long j, String str, boolean z);

    void flowStart(long j, String str, boolean z, long j2);

    long flowStartForMarker(int i, String str, boolean z);

    boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig);

    boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig);

    Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j);

    long generateFlowId(int i, int i2);

    long generateNewFlowId(int i);

    boolean isOngoingFlow(long j);

    PointEditor markPointWithEditor(long j, String str);

    PointEditor markPointWithEditor(long j, String str, String str2);

    void onAppBackgrounded();

    MarkerEditor withFlow(long j);
}
