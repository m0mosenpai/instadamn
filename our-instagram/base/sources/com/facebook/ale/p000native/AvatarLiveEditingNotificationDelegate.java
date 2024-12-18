package com.facebook.ale.p000native;

/* loaded from: classes9.dex */
public interface AvatarLiveEditingNotificationDelegate {
    void onAvatarGenerationBegin(String str);

    void onAvatarGenerationEnd(boolean z, String str, String str2, String str3);

    void onAvatarParametersUpdateBegin(String str);

    void onAvatarParametersUpdateEnd(String str, String str2);

    void onAvatarRenderUpdateBegin(String str);

    void onAvatarRenderUpdateEnd(String str, String str2);

    void onAvatarUpdateBegin(String str);

    void onAvatarUpdateEnd(String str, String str2);
}
