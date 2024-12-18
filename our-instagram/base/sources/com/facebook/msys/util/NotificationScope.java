package com.facebook.msys.util;

import X.C2NJ;
import X.InterfaceC49122Nj;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public final class NotificationScope implements InterfaceC49122Nj {
    public final McfReferenceHolder mMcfReference = new McfReferenceHolder();
    public final NativeHolder mNativeHolder = initNativeHolder(this);

    public static native NativeHolder initNativeHolder(NotificationScope notificationScope);

    @Override // X.InterfaceC49122Nj
    public long getNativeReference() {
        return this.mMcfReference.nativeReference;
    }

    static {
        C2NJ.A00();
    }
}
