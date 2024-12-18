package com.instagram.debug.devoptions.apiperf;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes12.dex */
public interface ImagePerformanceProvider {
    void onEnterViewport();

    void onImageFailure(String str, Object obj);

    void onImageSuccess(String str);

    void onLeaveViewportRendered(ImageUrl imageUrl);

    void onLeaveViewportUnrendered(ImageUrl imageUrl);

    void onRender(long j);
}
