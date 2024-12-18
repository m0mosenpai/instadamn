package com.facebook.rsys.callinfo.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class UserProfilesReadCallback {
    public static C2N9 CONVERTER = YAN.A00(24);

    /* loaded from: classes12.dex */
    public final class CProxy extends UserProfilesReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native UserProfilesReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.UserProfilesReadCallback
        public native void complete(ArrayList arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof UserProfilesReadCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(ArrayList arrayList);
}
