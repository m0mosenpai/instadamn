package com.facebook.messenger.notification.engine;

import X.LAZ;
import X.LDB;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineUnreadMessage {
    public static final LAZ Companion = new Object();
    public NativeHolder mNativeHolder;

    public static final native NativeHolder initNativeHolder(Long l, String str, Long l2, String str2, String str3, String str4);

    public final native String getMessageId();

    public final native String getPreviewUrl();

    public final native Long getSenderId();

    public final native String getSenderName();

    public final native String getText();

    public final native Long getTimestampMs();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LAZ, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGNotificationEngineUnreadMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
