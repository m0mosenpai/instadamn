package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MessageSyncService {
    public final AccountSession mAccountSession;
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(MessageSyncServiceConfig messageSyncServiceConfig);

    private native boolean isValidNative();

    /* JADX INFO: Access modifiers changed from: private */
    public native void setStateNative(int i);

    private native void shutdownAndDeleteNative(NotificationScope notificationScope);

    /* JADX INFO: Access modifiers changed from: private */
    public native void shutdownNative(NotificationScope notificationScope);

    static {
        C137306Jk.A00();
    }

    public MessageSyncService(AccountSession accountSession, MessageSyncServiceConfig messageSyncServiceConfig) {
        this.mAccountSession = accountSession;
        this.mNativeHolder = initNativeHolder(messageSyncServiceConfig);
    }
}
