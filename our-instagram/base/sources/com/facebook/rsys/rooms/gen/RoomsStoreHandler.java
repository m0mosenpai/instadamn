package com.facebook.rsys.rooms.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class RoomsStoreHandler {

    /* loaded from: classes12.dex */
    public final class CProxy extends RoomsStoreHandler {
        public final NativeHolder mNativeHolder;

        public static native RoomsStoreHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.rooms.gen.RoomsStoreHandler
        public native void roomThreadKeyUpdated(String str);

        @Override // com.facebook.rsys.rooms.gen.RoomsStoreHandler
        public native void roomUpdated(String str, RoomJoiningModel roomJoiningModel, UserProfile userProfile);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof RoomsStoreHandler)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void roomThreadKeyUpdated(String str);

    public abstract void roomUpdated(String str, RoomJoiningModel roomJoiningModel, UserProfile userProfile);
}
