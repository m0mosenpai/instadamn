package com.facebook.traffic.ctm.api;

/* loaded from: classes12.dex */
public final class CumulativeConnectionStats {
    public final long cumulativeBytesReceived;
    public final long cumulativeBytesSent;
    public final SocketStateStats socketStateStats;
    public final ThrottlingUpdateStats throttlingUpdateStats;

    /* loaded from: classes12.dex */
    public final class Builder {
        public long cumulativeBytesSent = 0;
        public long cumulativeBytesReceived = 0;
        public ThrottlingUpdateStats throttlingUpdateStats = new ThrottlingUpdateStats();
        public SocketStateStats socketStateStats = new SocketStateStats();

        public CumulativeConnectionStats build() {
            return new CumulativeConnectionStats(this);
        }

        public Builder cumulativeBytesReceived(long j) {
            this.cumulativeBytesReceived = j;
            return this;
        }

        public Builder cumulativeBytesSent(long j) {
            this.cumulativeBytesSent = j;
            return this;
        }

        public Builder socketStateStats(SocketStateStats socketStateStats) {
            this.socketStateStats = socketStateStats;
            return this;
        }

        public Builder throttlingUpdateStats(ThrottlingUpdateStats throttlingUpdateStats) {
            this.throttlingUpdateStats = throttlingUpdateStats;
            return this;
        }
    }

    public long getCumulativeBytesReceived() {
        return this.cumulativeBytesReceived;
    }

    public long getCumulativeBytesSent() {
        return this.cumulativeBytesSent;
    }

    public SocketStateStats getSocketStateStats() {
        return this.socketStateStats;
    }

    public ThrottlingUpdateStats getThrottlingUpdateStats() {
        return this.throttlingUpdateStats;
    }

    public CumulativeConnectionStats(Builder builder) {
        this.cumulativeBytesSent = builder.cumulativeBytesSent;
        this.cumulativeBytesReceived = builder.cumulativeBytesReceived;
        this.throttlingUpdateStats = builder.throttlingUpdateStats;
        this.socketStateStats = builder.socketStateStats;
    }
}
