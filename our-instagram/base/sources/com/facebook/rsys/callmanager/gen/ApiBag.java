package com.facebook.rsys.callmanager.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes9.dex */
public class ApiBag {
    public static C2N9 CONVERTER = C55648OnZ.A00(14);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native ApiBag createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(Map map, CallApi callApi);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Map getApis();

    public native CallApi getCall();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ApiBag)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public ApiBag(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ApiBag(Map map, CallApi callApi) {
        map.getClass();
        callApi.getClass();
        this.mNativeHolder = initNativeHolder(map, callApi);
    }
}
