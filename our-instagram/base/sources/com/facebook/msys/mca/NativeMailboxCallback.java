package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public final class NativeMailboxCallback implements MailboxCallback {
    public NativeHolder mNativeHolder;

    @Override // com.facebook.msys.mca.MailboxCallback
    public native void onCompletion(Object obj);

    static {
        C137306Jk.A00();
    }

    public NativeMailboxCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
