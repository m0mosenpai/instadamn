package com.instagram.react.views.image;

import X.C1OG;
import X.C23597Acr;
import X.C25821No;
import X.InterfaceC65622ToD;
import X.R3M;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.typedurl.SimpleImageUrl;

@ReactModule(name = "ImageLoader")
/* loaded from: classes10.dex */
public class IgReactImageLoaderModule extends NativeImageLoaderAndroidSpec {
    public static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String MODULE_NAME = "ImageLoader";

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageLoader";
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void getSizeWithHeaders(String str, ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD) {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d, InterfaceC65622ToD interfaceC65622ToD) {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void queryCache(ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD) {
    }

    public IgReactImageLoaderModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void getSize(String str, InterfaceC65622ToD interfaceC65622ToD) {
        if (TextUtils.isEmpty(str)) {
            interfaceC65622ToD.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(str), null);
        A0J.A0I = false;
        A0J.A02(new C23597Acr(6, this, interfaceC65622ToD));
        A0J.A00().E7X();
    }
}
