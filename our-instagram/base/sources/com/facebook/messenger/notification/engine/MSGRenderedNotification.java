package com.facebook.messenger.notification.engine;

import X.C47819LAb;
import X.LDB;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGRenderedNotification {
    public static final C47819LAb Companion = new Object();
    public final boolean isEphemeral;
    public final boolean isGroupThread;
    public final boolean isRenderedByEngine;
    public final boolean isSilentPush;
    public NativeHolder mNativeHolder;
    public final boolean showMessagePreview;

    public static final native NativeHolder initNativeHolder(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str7, Long l7, Long l8, String str8, Long l9, String str9, Long l10, boolean z, long j, boolean z2, boolean z3, Long l11, String str10, String str11, String str12, Integer num, String str13, String str14, boolean z4, boolean z5, Integer num2, String str15, String str16, String str17);

    public final native Integer getAttachmentType();

    public final native String getAttachmentUrl();

    public final native String getEngineMessage();

    public final native String getGroupingID();

    public final native boolean getIsEphemeral();

    public final native boolean getIsGroupThread();

    public final native boolean getIsRenderedByEngine();

    public final native boolean getIsSilentPush();

    public final native String getMessage();

    public final native Long getMessageAuthoritativeTimestampMs();

    public final native Long getMessageEphemeralDurationInSec();

    public final native String getMessageId();

    public final native Long getMessagePK();

    public final native String getMessageTraceId();

    public final native Integer getNotifRenderType();

    public final native Long getNotifType();

    public final native String getNotificationId();

    public final native String getNotificationTraceId();

    public final native String getOfflineThreadingID();

    public final native String getOrcaThreadKey();

    public final native Long getPk();

    public final native String getPrivacyContext();

    public final native Long getSenderContactPK();

    public final native Long getSenderId();

    public final native String getSenderName();

    public final native String getSenderProfilePictureFallbackUrl();

    public final native String getSenderProfilePictureUrl();

    public final native Long getSenderProfilePictureUrlExpirationTimestamp();

    public final native Long getServerThreadKey();

    public final native boolean getShowMessagePreview();

    public final native String getSound();

    public final native String getSubtitle();

    public final native Long getThreadKey();

    public final native Long getThreadPK();

    public final native long getTimestampMs();

    public final native String getTitle();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LAb, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGRenderedNotification(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
