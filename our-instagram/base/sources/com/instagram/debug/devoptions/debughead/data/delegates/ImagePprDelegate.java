package com.instagram.debug.devoptions.debughead.data.delegates;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes12.dex */
public interface ImagePprDelegate {
    void onEnterViewport();

    void onLeaveViewportRendered(ImageUrl imageUrl);

    void onLeaveViewportUnrendered(ImageUrl imageUrl);

    void onRender(long j);
}
