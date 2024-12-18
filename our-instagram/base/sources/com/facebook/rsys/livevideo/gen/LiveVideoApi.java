package com.facebook.rsys.livevideo.gen;

import X.C2N9;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class LiveVideoApi {
    public static C2N9 CONVERTER = new LSW(8);

    /* loaded from: classes8.dex */
    public final class CProxy extends LiveVideoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void acknowledgeLiveStream();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void cancelCreatedNotStartedBroadcast();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void endBroadcast();

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void startBroadcast(ArrayList arrayList);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void subscribeToBroadcast(Long l);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void syncUnsubscribe();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void updateBroadcastId(Long l);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void updateLiveStream(Long l, int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof LiveVideoApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void acknowledgeLiveStream();

    public abstract void cancelCreatedNotStartedBroadcast();

    public abstract void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

    public abstract void endBroadcast();

    public abstract void startBroadcast(ArrayList arrayList);

    public abstract void subscribeToBroadcast(Long l);

    public abstract void syncUnsubscribe();

    public abstract void updateBroadcastId(Long l);

    public abstract void updateLiveStream(Long l, int i);
}
