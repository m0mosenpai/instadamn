package com.facebook.pando;

import X.C14360o3;
import X.C3OO;
import com.facebook.common.dextricks.Constants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class Summary {
    public final long additiveThreadHopTimeMs;
    public final long cacheAge;
    public final long cacheEndTime;
    public final long cacheStartTime;
    public final String connectionErrorMessage;
    public final String connectionFieldName;
    public final boolean connectionHasError;
    public final long connectionUpdateEndIndex;
    public final long connectionUpdateStartIndex;
    public final String fbRequestId;
    public final boolean isFinal;
    public final long networkAttempts;
    public final long networkChunksCount;
    public final long networkEndTime;
    public final long networkResponseStartTime;
    public final long networkResponsesCount;
    public final long networkStartTime;
    public final long parseEndTime;
    public final long parseStartTime;
    public final long parsedBytes;
    public final long parserElapsedMs;
    public final long requestStartTime;
    public final long serverDuration;
    public final String source;
    public final Map trackedResponseHeaders;

    public Summary(String str, boolean z, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Map map, long j14, long j15, long j16, String str3, long j17, long j18, boolean z2, String str4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 21);
        C14360o3.A0B(str4, 25);
        this.source = str;
        this.isFinal = z;
        this.fbRequestId = str2;
        this.requestStartTime = j;
        this.networkStartTime = j2;
        this.networkEndTime = j3;
        this.networkResponseStartTime = j4;
        this.parseStartTime = j5;
        this.parseEndTime = j6;
        this.parserElapsedMs = j7;
        this.parsedBytes = j8;
        this.serverDuration = j9;
        this.networkChunksCount = j10;
        this.additiveThreadHopTimeMs = j11;
        this.networkResponsesCount = j12;
        this.networkAttempts = j13;
        this.trackedResponseHeaders = map;
        this.cacheAge = j14;
        this.cacheStartTime = j15;
        this.cacheEndTime = j16;
        this.connectionFieldName = str3;
        this.connectionUpdateStartIndex = j17;
        this.connectionUpdateEndIndex = j18;
        this.connectionHasError = z2;
        this.connectionErrorMessage = str4;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    public /* synthetic */ Summary(String str, boolean z, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Map map, long j14, long j15, long j16, String str3, long j17, long j18, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? 0L : j3, (i & 64) != 0 ? 0L : j4, (i & 128) != 0 ? 0L : j5, (i & 256) != 0 ? 0L : j6, (i & 512) != 0 ? 0L : j7, (i & 1024) != 0 ? 0L : j8, (i & C3OO.FLAG_MOVED) != 0 ? 0L : j9, (i & 4096) != 0 ? 0L : j10, (i & 8192) != 0 ? 0L : j11, (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? 0L : j12, (32768 & i) != 0 ? 0L : j13, (65536 & i) != 0 ? null : map, (131072 & i) != 0 ? 0L : j14, (262144 & i) != 0 ? 0L : j15, (524288 & i) != 0 ? 0L : j16, (1048576 & i) != 0 ? "" : str3, (2097152 & i) != 0 ? 0L : j17, (4194304 & i) != 0 ? 0L : j18, (8388608 & i) != 0 ? false : z2, (i & 16777216) != 0 ? "" : str4);
    }
}
