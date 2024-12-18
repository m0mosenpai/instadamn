package com.instagram.realtimeclient.regionhint.graphql;

import X.InterfaceC70433Ec;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class IGRealtimeRegionHintQuery {
    public static final Companion Companion = new Object();

    /* loaded from: classes11.dex */
    public interface Builder extends InterfaceC70433Ec {
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final Builder create() {
            return new IGRealtimeRegionHintQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final Builder create() {
        return new IGRealtimeRegionHintQueryImpl.Builder();
    }
}
