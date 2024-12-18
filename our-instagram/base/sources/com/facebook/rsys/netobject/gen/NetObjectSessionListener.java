package com.facebook.rsys.netobject.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class NetObjectSessionListener {
    public static C2N9 CONVERTER = YAM.A00(19);

    /* loaded from: classes12.dex */
    public final class CProxy extends NetObjectSessionListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectSessionListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionListener
        public native void onChanged(ArrayList arrayList, ArrayList arrayList2);

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionListener
        public native void onPeerConnected(String str, NetObjectPeerMetadata netObjectPeerMetadata);

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionListener
        public native void onPeerDisconnected(String str);

        @Override // com.facebook.rsys.netobject.gen.NetObjectSessionListener
        public native void onPeerLatencyChanged(String str, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof NetObjectSessionListener)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onChanged(ArrayList arrayList, ArrayList arrayList2);

    public abstract void onPeerConnected(String str, NetObjectPeerMetadata netObjectPeerMetadata);

    public abstract void onPeerDisconnected(String str);

    public abstract void onPeerLatencyChanged(String str, long j);
}
