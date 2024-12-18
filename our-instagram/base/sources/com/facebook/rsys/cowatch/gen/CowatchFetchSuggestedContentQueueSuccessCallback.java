package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class CowatchFetchSuggestedContentQueueSuccessCallback {

    /* loaded from: classes12.dex */
    public final class CProxy extends CowatchFetchSuggestedContentQueueSuccessCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchFetchSuggestedContentQueueSuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueSuccessCallback
        public native void onSuccess(ArrayList arrayList);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CowatchFetchSuggestedContentQueueSuccessCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onSuccess(ArrayList arrayList);
}
