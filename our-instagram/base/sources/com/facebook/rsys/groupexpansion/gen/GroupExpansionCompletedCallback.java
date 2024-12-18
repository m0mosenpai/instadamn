package com.facebook.rsys.groupexpansion.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class GroupExpansionCompletedCallback {
    public static C2N9 CONVERTER = YAN.A00(55);

    /* loaded from: classes12.dex */
    public final class CProxy extends GroupExpansionCompletedCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GroupExpansionCompletedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onFailure(int i);

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onSuccess(String str, boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof GroupExpansionCompletedCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess(String str, boolean z);
}
