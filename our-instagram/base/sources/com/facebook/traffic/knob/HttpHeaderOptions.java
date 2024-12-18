package com.facebook.traffic.knob;

import X.AbstractC166987dD;
import java.util.Set;

/* loaded from: classes12.dex */
public final class HttpHeaderOptions {
    public final Set allowListByFieldId;
    public final boolean includeAlternateEstimators;
    public final String prependStr;

    /* loaded from: classes12.dex */
    public final class Builder {
        public Set allowListByFieldId = AbstractC166987dD.A1H();
        public boolean includeAlternateEstimators = false;
        public String prependStr = "";

        public HttpHeaderOptions build() {
            return new HttpHeaderOptions(this);
        }

        public Builder allowListByFieldId(Set set) {
            this.allowListByFieldId = set;
            return this;
        }

        public Builder includeAlternateEstimators(boolean z) {
            this.includeAlternateEstimators = z;
            return this;
        }

        public Builder prependStr(String str) {
            this.prependStr = str;
            return this;
        }
    }

    public Set getAllowListByFieldId() {
        return this.allowListByFieldId;
    }

    public String getPrependStr() {
        return this.prependStr;
    }

    public boolean includeAlternateEstimators() {
        return this.includeAlternateEstimators;
    }

    public HttpHeaderOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
        this.includeAlternateEstimators = builder.includeAlternateEstimators;
        this.prependStr = builder.prependStr;
    }
}
