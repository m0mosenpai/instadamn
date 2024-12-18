package com.facebook.traffic.retina.config;

/* loaded from: classes12.dex */
public class RetinaConfig {
    public final boolean dnsResolutionEnabled;
    public final boolean enableCustomProbeSizes;
    public final long interProbeDelayUs;
    public final long numberOfProbes;
    public final long numberOfTests;
    public final boolean onlyConnected;
    public final long probeSizeBytes;
    public final String profileName;
    public final String retinaServerFallbackDomain;
    public final String retinaServers;
    public final String testDirection;
    public final boolean useProfile;

    /* loaded from: classes12.dex */
    public final class Builder {
        public boolean dnsResolutionEnabled;
        public boolean enableCustomProbeSizes;
        public long interProbeDelayUs;
        public long numberOfProbes;
        public long numberOfTests;
        public boolean onlyConnected;
        public long probeSizeBytes;
        public String profileName;
        public String retinaServerFallbackDomain;
        public String retinaServers;
        public String testDirection;
        public boolean useProfile;

        public RetinaConfig build() {
            return new RetinaConfig(this);
        }

        public Builder dnsResolutionEnabled(boolean z) {
            this.dnsResolutionEnabled = z;
            return this;
        }

        public Builder enableCustomProbeSizes(boolean z) {
            this.enableCustomProbeSizes = z;
            return this;
        }

        public Builder interProbeDelayUs(long j) {
            this.interProbeDelayUs = j;
            return this;
        }

        public Builder numberOfProbes(long j) {
            this.numberOfProbes = j;
            return this;
        }

        public Builder numberOfTests(long j) {
            this.numberOfTests = j;
            return this;
        }

        public Builder onlyConnected(boolean z) {
            this.onlyConnected = z;
            return this;
        }

        public Builder probeSizeBytes(long j) {
            this.probeSizeBytes = j;
            return this;
        }

        public Builder profileName(String str) {
            this.profileName = str;
            return this;
        }

        public Builder retinaServerFallbackDomain(String str) {
            this.retinaServerFallbackDomain = str;
            return this;
        }

        public Builder retinaServers(String str) {
            this.retinaServers = str;
            return this;
        }

        public Builder testDirection(String str) {
            this.testDirection = str;
            return this;
        }

        public Builder useProfile(boolean z) {
            this.useProfile = z;
            return this;
        }
    }

    public boolean getDnsResolutionEnabled() {
        return this.dnsResolutionEnabled;
    }

    public boolean getEnableCustomProbeSizes() {
        return this.enableCustomProbeSizes;
    }

    public long getInterProbeDelayUs() {
        return this.interProbeDelayUs;
    }

    public long getNumberOfProbes() {
        return this.numberOfProbes;
    }

    public long getNumberOfTests() {
        return this.numberOfTests;
    }

    public boolean getOnlyConnected() {
        return this.onlyConnected;
    }

    public long getProbeSizeBytes() {
        return this.probeSizeBytes;
    }

    public String getProfileName() {
        return this.profileName;
    }

    public String getRetinaServerFallbackDomain() {
        return this.retinaServerFallbackDomain;
    }

    public String getRetinaServers() {
        return this.retinaServers;
    }

    public String getTestDirection() {
        return this.testDirection;
    }

    public boolean getUseProfile() {
        return this.useProfile;
    }

    public RetinaConfig(Builder builder) {
        this.interProbeDelayUs = builder.interProbeDelayUs;
        this.testDirection = builder.testDirection;
        this.numberOfProbes = builder.numberOfProbes;
        this.numberOfTests = builder.numberOfTests;
        this.probeSizeBytes = builder.probeSizeBytes;
        this.profileName = builder.profileName;
        this.useProfile = builder.useProfile;
        this.retinaServers = builder.retinaServers;
        this.onlyConnected = builder.onlyConnected;
        this.enableCustomProbeSizes = builder.enableCustomProbeSizes;
        this.dnsResolutionEnabled = builder.dnsResolutionEnabled;
        this.retinaServerFallbackDomain = builder.retinaServerFallbackDomain;
    }
}
