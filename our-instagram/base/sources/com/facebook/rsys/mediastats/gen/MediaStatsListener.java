package com.facebook.rsys.mediastats.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class MediaStatsListener {
    public static C2N9 CONVERTER = YAM.A00(0);

    /* loaded from: classes12.dex */
    public final class CProxy extends MediaStatsListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaStatsListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsListener
        public native void onMediaStats(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof MediaStatsListener)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onMediaStats(ArrayList arrayList);
}
