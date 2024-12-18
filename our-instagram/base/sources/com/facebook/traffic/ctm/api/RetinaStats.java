package com.facebook.traffic.ctm.api;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public class RetinaStats {
    public final boolean configEngineEnabled;
    public final ArrayList edgerayIps;
    public final String relayIp;
    public final String uuid;
    public final boolean wasCallConnected;

    /* loaded from: classes12.dex */
    public final class Builder {
        public boolean configEngineEnabled;
        public ArrayList edgerayIps;
        public String relayIp;
        public String uuid;
        public boolean wasCallConnected;

        public RetinaStats build() {
            return new RetinaStats(this);
        }

        public Builder configEngineEnabled(boolean z) {
            this.configEngineEnabled = z;
            return this;
        }

        public Builder edgerayIps(ArrayList arrayList) {
            this.edgerayIps = arrayList;
            return this;
        }

        public Builder relayIp(String str) {
            this.relayIp = str;
            return this;
        }

        public Builder uuid(String str) {
            this.uuid = str;
            return this;
        }

        public Builder wasCallConnected(boolean z) {
            this.wasCallConnected = z;
            return this;
        }
    }

    public boolean getConfigEngineEnabled() {
        return this.configEngineEnabled;
    }

    public ArrayList getEdgerayIps() {
        return this.edgerayIps;
    }

    public String getRelayIp() {
        return this.relayIp;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean getWasCallConnected() {
        return this.wasCallConnected;
    }

    public RetinaStats(Builder builder) {
        this.configEngineEnabled = builder.configEngineEnabled;
        this.wasCallConnected = builder.wasCallConnected;
        this.edgerayIps = builder.edgerayIps;
        this.relayIp = builder.relayIp;
        this.uuid = builder.uuid;
    }
}
