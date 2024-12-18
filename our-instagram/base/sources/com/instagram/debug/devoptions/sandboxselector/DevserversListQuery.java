package com.instagram.debug.devoptions.sandboxselector;

import X.InterfaceC70433Ec;
import com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevserversListQuery {
    public static final Companion Companion = new Object();

    /* loaded from: classes11.dex */
    public interface Builder extends InterfaceC70433Ec {
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final Builder create() {
            return new DevserversListQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final Builder create() {
        return new DevserversListQueryImpl.Builder();
    }
}
