package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MailboxMessengerMediaSendManagerConfig {
    public static final MailboxMessengerMediaSendManagerConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(String str, String str2, int i, int i2, Integer num);

    public MailboxMessengerMediaSendManagerConfig(String str, String str2, int i, int i2, Integer num) {
        this.mNativeHolder = initNativeHolder(str, str2, 262144000, 262144000, null);
    }

    static {
        C137306Jk.A00();
    }
}
