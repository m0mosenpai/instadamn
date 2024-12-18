package com.facebook.rsys.datachannel.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class DataChannelMessageParams {
    public static C2N9 CONVERTER = YAN.A00(42);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native DataChannelMessageParams createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(ArrayList arrayList, int i, ArrayList arrayList2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native ArrayList getRecipientNodeIds();

    public native ArrayList getRecipients();

    public native int getServiceRecipients();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof DataChannelMessageParams)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public DataChannelMessageParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public DataChannelMessageParams(ArrayList arrayList, int i, ArrayList arrayList2) {
        this.mNativeHolder = initNativeHolder(arrayList, i, arrayList2);
    }
}
