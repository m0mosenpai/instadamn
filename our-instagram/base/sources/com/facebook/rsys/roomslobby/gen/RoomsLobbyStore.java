package com.facebook.rsys.roomslobby.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class RoomsLobbyStore {

    /* loaded from: classes12.dex */
    public final class CProxy extends RoomsLobbyStore {
        public final NativeHolder mNativeHolder;

        public static native RoomsLobbyStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.roomslobby.gen.RoomsLobbyStore
        public native void fetchRingableUsers(String str);

        @Override // com.facebook.rsys.roomslobby.gen.RoomsLobbyStore
        public native String getUrl();

        public native int hashCode();

        @Override // com.facebook.rsys.roomslobby.gen.RoomsLobbyStore
        public native void setHandler(RoomLobbyStoreHandler roomLobbyStoreHandler);

        @Override // com.facebook.rsys.roomslobby.gen.RoomsLobbyStore
        public native void startObserverActiveUsers();

        @Override // com.facebook.rsys.roomslobby.gen.RoomsLobbyStore
        public native void stopObserverActiveUsers();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof RoomsLobbyStore)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void fetchRingableUsers(String str);

    public abstract String getUrl();

    public abstract void setHandler(RoomLobbyStoreHandler roomLobbyStoreHandler);

    public abstract void startObserverActiveUsers();

    public abstract void stopObserverActiveUsers();
}
