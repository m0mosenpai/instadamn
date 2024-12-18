package com.facebook.react.modules.camera;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C62160S0h;
import X.R3M;
import X.RunnableC64699TQe;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.concurrent.Executors;

@ReactModule(name = "ImageStoreManager")
/* loaded from: classes10.dex */
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    public static final int BUFFER_SIZE = 8192;
    public static final C62160S0h Companion = new Object();
    public static final String NAME = "ImageStoreManager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        AbstractC167027dH.A12(str, callback, callback2);
        Executors.newSingleThreadExecutor().execute(new RunnableC64699TQe(callback, callback2, this, str));
    }
}
