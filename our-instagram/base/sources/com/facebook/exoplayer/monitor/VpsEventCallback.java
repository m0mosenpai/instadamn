package com.facebook.exoplayer.monitor;

import X.AbstractC53312cF;
import X.EnumC61171RgX;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;

/* loaded from: classes.dex */
public interface VpsEventCallback {
    void callback(AbstractC53312cF abstractC53312cF);

    void callback(EnumC61171RgX enumC61171RgX, VideoPlayerServiceEvent videoPlayerServiceEvent);

    void errorCallback(String str, String str2, String str3);
}
