package com.facebook.proxygen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;

/* loaded from: classes12.dex */
public class ConnQuality {
    public final long mCwnd;
    public final long mMss;
    public final long mRtt;
    public final long mRtx;
    public final long mTotalBytesWritten;
    public final long mTotalPackets;
    public final long mTotalPacketsLost;
    public final long mUploadLatency;
    public final long mUpstreamLatency;

    public ConnQuality(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.mRtt = j;
        this.mRtx = j2;
        this.mCwnd = j3;
        this.mMss = j4;
        this.mTotalBytesWritten = j5;
        this.mTotalPackets = j6;
        this.mTotalPacketsLost = j7;
        this.mUpstreamLatency = j8;
        this.mUploadLatency = j9;
    }

    public long getCwnd() {
        return this.mCwnd;
    }

    public long getMss() {
        return this.mMss;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public long getRtx() {
        return this.mRtx;
    }

    public long getTotalBytesWritten() {
        return this.mTotalBytesWritten;
    }

    public long getTotalPackets() {
        return this.mTotalPackets;
    }

    public long getTotalPacketsLost() {
        return this.mTotalPacketsLost;
    }

    public long getUploadLatency() {
        return this.mUploadLatency;
    }

    public long getUpstreamLatency() {
        return this.mUpstreamLatency;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{\"rtt\":");
        A1C.append(this.mRtt);
        A1C.append(",\"rtx\":");
        A1C.append(this.mRtx);
        A1C.append(",\"cwnd\":");
        A1C.append(this.mCwnd);
        A1C.append(",\"mss\":");
        A1C.append(this.mMss);
        A1C.append(",\"tbw\":");
        A1C.append(this.mTotalBytesWritten);
        A1C.append(",\"tp\":");
        A1C.append(this.mTotalPackets);
        A1C.append(",\"tpl\":");
        A1C.append(this.mTotalPacketsLost);
        A1C.append(",\"uplat\":");
        A1C.append(this.mUpstreamLatency);
        A1C.append(",\"ullat\":");
        A1C.append(this.mUploadLatency);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
