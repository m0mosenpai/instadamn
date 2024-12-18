package com.facebook.imagepipeline.platform;

import X.AbstractC63122SdQ;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;

/* loaded from: classes10.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public final WebpBitmapFactoryImpl A00;

    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!AbstractC63122SdQ.A00) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            AbstractC63122SdQ.A00 = true;
        }
        this.A00 = webpBitmapFactoryImpl;
    }
}
