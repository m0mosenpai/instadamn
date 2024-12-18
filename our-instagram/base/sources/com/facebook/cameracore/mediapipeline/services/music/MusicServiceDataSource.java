package com.facebook.cameracore.mediapipeline.services.music;

import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: classes3.dex */
public interface MusicServiceDataSource {
    void getCurrentPlayingItem(NativeDataPromise nativeDataPromise);

    void getCurrentSongArtist(NativeDataPromise nativeDataPromise);

    void getCurrentSongGenre(NativeDataPromise nativeDataPromise);

    void getCurrentSongPlaybackTimeMs(NativeDataPromise nativeDataPromise);

    void getCurrentSongTitle(NativeDataPromise nativeDataPromise);

    void stop();
}
