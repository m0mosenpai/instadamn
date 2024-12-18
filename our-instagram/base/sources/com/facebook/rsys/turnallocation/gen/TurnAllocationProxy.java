package com.facebook.rsys.turnallocation.gen;

import X.C2N9;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes11.dex */
public abstract class TurnAllocationProxy {
    public static C2N9 CONVERTER = new WV3(4);

    /* loaded from: classes11.dex */
    public final class CProxy extends TurnAllocationProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TurnAllocationProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
        public native void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

        @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
        public native void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof TurnAllocationProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

    public abstract void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);
}
