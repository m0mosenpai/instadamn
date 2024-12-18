package com.facebook.traffic.knob;

import X.AbstractC166987dD;
import java.util.Set;

/* loaded from: classes12.dex */
public final class DebugStrOptions {
    public final Set allowListByFieldId;

    /* loaded from: classes12.dex */
    public final class Builder {
        public Set allowListByFieldId = AbstractC166987dD.A1H();

        public DebugStrOptions build() {
            return new DebugStrOptions(this);
        }

        public Builder allowListByFieldId(Set set) {
            this.allowListByFieldId = set;
            return this;
        }
    }

    public DebugStrOptions(Set set) {
        this.allowListByFieldId = set;
    }

    public Set getAllowListByFieldId() {
        return this.allowListByFieldId;
    }

    public DebugStrOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
    }
}
