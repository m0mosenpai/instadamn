package com.facebook.quicklog.reliability;

/* loaded from: classes.dex */
public class UserFlowConfig {
    public final boolean mCancelOnBackground;
    public final String mTriggerSource;
    public long mTtlMs;

    /* loaded from: classes.dex */
    public class UserFlowConfigBuilder {
        public final boolean mCancelOnBackground;
        public final String mTriggerSource;
        public long mTtlMs = -1;

        public UserFlowConfig build() {
            UserFlowConfig userFlowConfig = new UserFlowConfig(this.mTriggerSource, this.mCancelOnBackground);
            userFlowConfig.mTtlMs = this.mTtlMs;
            return userFlowConfig;
        }

        public UserFlowConfigBuilder setTtlMs(long j) {
            this.mTtlMs = j;
            return this;
        }

        public UserFlowConfigBuilder(String str, boolean z) {
            this.mTriggerSource = str;
            this.mCancelOnBackground = z;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserFlowConfig)) {
            return false;
        }
        UserFlowConfig userFlowConfig = (UserFlowConfig) obj;
        return userFlowConfig.mTriggerSource.equals(this.mTriggerSource) && userFlowConfig.mCancelOnBackground == this.mCancelOnBackground && userFlowConfig.mTtlMs == this.mTtlMs;
    }

    public static UserFlowConfigBuilder builder(String str, boolean z) {
        return new UserFlowConfigBuilder(str, z);
    }

    public static UserFlowConfig create(String str, boolean z) {
        return new UserFlowConfig(str, z);
    }

    public String getTriggerSource() {
        return this.mTriggerSource;
    }

    public long getTtlMs() {
        return this.mTtlMs;
    }

    public final int hashCode() {
        return ((((589 + this.mTriggerSource.hashCode()) * 31) + Long.valueOf(this.mTtlMs).hashCode()) * 31) + (this.mCancelOnBackground ? 1 : 0);
    }

    public boolean isCancelOnBackground() {
        return this.mCancelOnBackground;
    }

    public UserFlowConfig(String str, boolean z) {
        this.mTtlMs = -1L;
        this.mTriggerSource = str;
        this.mCancelOnBackground = z;
    }
}
