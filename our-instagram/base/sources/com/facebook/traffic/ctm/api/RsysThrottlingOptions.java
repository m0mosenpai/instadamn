package com.facebook.traffic.ctm.api;

/* loaded from: classes12.dex */
public class RsysThrottlingOptions {
    public final long maxDownlinkBitsPerSecond;
    public final long maxUplinkBitsPerSecond;

    /* loaded from: classes12.dex */
    public final class Builder {
        public long maxUplinkBitsPerSecond = -1;
        public long maxDownlinkBitsPerSecond = -1;

        public RsysThrottlingOptions build() {
            return new RsysThrottlingOptions(this);
        }

        public Builder maxDownlinkBitsPerSecond(long j) {
            this.maxDownlinkBitsPerSecond = j;
            return this;
        }

        public Builder maxUplinkBitsPerSecond(long j) {
            this.maxUplinkBitsPerSecond = j;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RsysThrottlingOptions)) {
            return false;
        }
        RsysThrottlingOptions rsysThrottlingOptions = (RsysThrottlingOptions) obj;
        return this.maxUplinkBitsPerSecond == rsysThrottlingOptions.maxUplinkBitsPerSecond && this.maxDownlinkBitsPerSecond == rsysThrottlingOptions.maxDownlinkBitsPerSecond;
    }

    public long getMaxDownlinkBitsPerSecond() {
        return this.maxDownlinkBitsPerSecond;
    }

    public long getMaxUplinkBitsPerSecond() {
        return this.maxUplinkBitsPerSecond;
    }

    public RsysThrottlingOptions(Builder builder) {
        this.maxUplinkBitsPerSecond = builder.maxUplinkBitsPerSecond;
        this.maxDownlinkBitsPerSecond = builder.maxDownlinkBitsPerSecond;
    }
}
