package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeIGCommentModerationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGCommentModerationReactModule";

    @ReactMethod
    public abstract void fetchBlockedCommenters(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void fetchCommentAudienceControlType(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void fetchCommentCategoryFilterDisabled(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void fetchCommentFilter(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void fetchCommentFilterKeywords(InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void fetchCurrentUser(InterfaceC65622ToD interfaceC65622ToD);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void setBlockedCommenters(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setCommentAudienceControlType(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setCommentCategoryFilterDisabled(boolean z, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setCustomKeywords(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setCustomKeywordsWithDisabled(String str, boolean z, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void setUseDefaultKeywords(boolean z, InterfaceC65622ToD interfaceC65622ToD);

    public NativeIGCommentModerationReactModuleSpec(R3M r3m) {
        super(r3m);
    }
}
