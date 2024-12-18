package com.instagram.creation.capture.quickcapture.autocreatedclips.repository;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ClipsSoundSyncBeatsInfoRepository {
    public final LruCache A00 = new LruCache(10);
    public final UserSession A01;

    public ClipsSoundSyncBeatsInfoRepository(UserSession userSession) {
        this.A01 = userSession;
    }
}
