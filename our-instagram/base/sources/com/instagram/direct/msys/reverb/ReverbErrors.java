package com.instagram.direct.msys.reverb;

import X.C47880LDa;
import com.facebook.simplejni.NativeHolder;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ReverbErrors {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(Map map, List list);

    public native Map getMessageLevelErrors();

    public native List getTopLevelErrors();

    static {
        C47880LDa.A00();
    }

    public ReverbErrors(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ReverbErrors(Map map, List list) {
        this.mNativeHolder = initNativeHolder(map, list);
    }
}
