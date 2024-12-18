package com.facebook.rsys.moderator.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

/* loaded from: classes12.dex */
public abstract class ModeratorApi {
    public static C2N9 CONVERTER = YAM.A00(9);

    /* loaded from: classes12.dex */
    public final class CProxy extends ModeratorApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ModeratorApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void enableScreenShare(boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void softMuteUser(String str);

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void softMuteUsers(HashSet hashSet);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof ModeratorApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enableScreenShare(boolean z);

    public abstract void softMuteUser(String str);

    public abstract void softMuteUsers(HashSet hashSet);
}
