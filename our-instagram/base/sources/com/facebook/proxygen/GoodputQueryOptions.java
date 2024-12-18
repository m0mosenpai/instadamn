package com.facebook.proxygen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AnonymousClass001;

/* loaded from: classes12.dex */
public class GoodputQueryOptions {
    public final boolean hostMustHaveQuicSocket;
    public String hostname;
    public final double percentile;

    /* loaded from: classes12.dex */
    public class Builder {
        public double mPercentile = 0.5d;
        public String mHostname = null;
        public boolean mHostMustHaveQuicSocket = false;

        public GoodputQueryOptions build() {
            return new GoodputQueryOptions(this);
        }

        public Builder setPercentile(double d) {
            if (d >= 0.0d && d <= 1.0d) {
                this.mPercentile = d;
                return this;
            }
            throw AbstractC166987dD.A12(AnonymousClass001.A0M("Percentile must be within [0,1] range inclusive. Provided percentile ", d));
        }

        public Builder setHostMustHaveQuicSocket(boolean z) {
            this.mHostMustHaveQuicSocket = z;
            return this;
        }

        public Builder setHostname(String str) {
            this.mHostname = str;
            return this;
        }
    }

    public String getHostname() {
        return this.hostname;
    }

    public double getPercentile() {
        return this.percentile;
    }

    public boolean mustHostHaveQuicSocket() {
        return this.hostMustHaveQuicSocket;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GoodputQueryOptions(percentile=");
        A1C.append(this.percentile);
        A1C.append(",hostname=");
        A1C.append(this.hostname);
        A1C.append(",mustHaveQuicSocket=");
        A1C.append(this.hostMustHaveQuicSocket);
        return AbstractC166997dE.A0x(")", A1C);
    }

    public GoodputQueryOptions(Builder builder) {
        this.percentile = builder.mPercentile;
        this.hostname = builder.mHostname;
        this.hostMustHaveQuicSocket = builder.mHostMustHaveQuicSocket;
    }
}
