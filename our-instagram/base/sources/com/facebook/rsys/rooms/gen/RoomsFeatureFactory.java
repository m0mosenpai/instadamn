package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes12.dex */
public abstract class RoomsFeatureFactory {

    /* loaded from: classes12.dex */
    public final class CProxy extends RoomsFeatureFactory {
        public static native FeatureHolder create(RoomsOptions roomsOptions, RoomsProxy roomsProxy, RoomsLoggingProxy roomsLoggingProxy, RoomsStoreFactory roomsStoreFactory);

        public static native RoomsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
