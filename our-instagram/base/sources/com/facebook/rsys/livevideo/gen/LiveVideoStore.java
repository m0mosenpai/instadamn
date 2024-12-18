package com.facebook.rsys.livevideo.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class LiveVideoStore {
    public static C2N9 CONVERTER = YAN.A00(64);

    /* loaded from: classes12.dex */
    public final class CProxy extends LiveVideoStore {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void cancelCreatedNotStartedBroadcast(String str, String str2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void createBroadcast(String str, String str2, int i, int i2, String str3, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback, boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void endBroadcast(String str, String str2, String str3, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void setHandler(LiveVideoStoreHandler liveVideoStoreHandler);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void startBroadcast(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void startObservingLiveStreamMetadata(String str);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void startObservingRoomBroadcast(String str);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void stopObservingLiveStreamMetadata();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
        public native void stopObservingRoomBroadcast();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof LiveVideoStore)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancelCreatedNotStartedBroadcast(String str, String str2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void createBroadcast(String str, String str2, int i, int i2, String str3, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback, boolean z);

    public abstract void endBroadcast(String str, String str2, String str3, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void setHandler(LiveVideoStoreHandler liveVideoStoreHandler);

    public abstract void startBroadcast(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void startObservingLiveStreamMetadata(String str);

    public abstract void startObservingRoomBroadcast(String str);

    public abstract void stopObservingLiveStreamMetadata();

    public abstract void stopObservingRoomBroadcast();
}
