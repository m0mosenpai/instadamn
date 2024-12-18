package com.facebook.traffic.ctm.api;

/* loaded from: classes12.dex */
public class RsysCallStatus {
    public final long heartbeatMs;
    public final State state;

    /* loaded from: classes12.dex */
    public final class Builder {
        public State state = State.ENDED;
        public long heartbeatMs = 0;

        public RsysCallStatus build() {
            return new RsysCallStatus(this);
        }

        public Builder heartbeatMs(long j) {
            this.heartbeatMs = j;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }
    }

    /* loaded from: classes12.dex */
    public enum State {
        ONGOING,
        ENDED
    }

    public long getHeartbeatMs() {
        return this.heartbeatMs;
    }

    public State getState() {
        return this.state;
    }

    public RsysCallStatus(Builder builder) {
        this.state = builder.state;
        this.heartbeatMs = builder.heartbeatMs;
    }
}
