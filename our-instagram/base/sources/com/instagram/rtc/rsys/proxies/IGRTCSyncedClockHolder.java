package com.instagram.rtc.rsys.proxies;

import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class IGRTCSyncedClockHolder {
    public static C2N9 CONVERTER = new C55647OnY(16);

    /* loaded from: classes9.dex */
    public final class CProxy extends IGRTCSyncedClockHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCSyncedClockHolder createFromMcfType(McfReference mcfReference);

        public static native IGRTCSyncedClockHolder createSyncedClockHolder(SignalingSenderProxy signalingSenderProxy);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder
        public native McfReference getSyncedClock();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof IGRTCSyncedClockHolder)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract McfReference getSyncedClock();
}
