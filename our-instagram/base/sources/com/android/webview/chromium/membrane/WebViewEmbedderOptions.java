package com.android.webview.chromium.membrane;

import X.AbstractC166987dD;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class WebViewEmbedderOptions {
    public final List mCommandLineSwitches;
    public final Boolean mEnableCookieMerge;
    public final Boolean mIsExternalService;
    public final MultiProcessMode mMultiProcessMode;
    public final OnVariationsSetListener mOnVariationsSetListener;
    public final String mPrivilegedServicesName;
    public final WebViewProviderInitListener mProviderInitListener;
    public final AppHostedResourcesProvider mResourcesProvider;
    public final String mSandboxedServicesName;
    public final AppHostedShareDelegate mShareDelegate;
    public final String mUmaAllowlist;

    /* loaded from: classes12.dex */
    public final class Builder {
        public List mCommandLineSwitches = AbstractC166987dD.A1E();
        public Boolean mEnableCookieMerge;
        public Boolean mEnableEmbeddedAppDebugBuild;
        public Boolean mIsExternalService;
        public MultiProcessMode mMultiProcessMode;
        public OnVariationsSetListener mOnVariationsSetListener;
        public String mPrivilegedServicesName;
        public WebViewProviderInitListener mProviderInitListener;
        public AppHostedResourcesProvider mResourcesProvider;
        public String mSandboxedServicesName;
        public AppHostedShareDelegate mShareDelegate;
        public String mUmaAllowlist;

        public Builder appendCommandLineSwitch(String str) {
            this.mCommandLineSwitches.add(str);
            return this;
        }

        public WebViewEmbedderOptions build() {
            return new WebViewEmbedderOptions(this);
        }

        public List getCommandLineSwitches() {
            return Collections.unmodifiableList(this.mCommandLineSwitches);
        }

        public Boolean getEnableCookieMerge() {
            return this.mEnableCookieMerge;
        }

        public Boolean getEnableEmbeddedAppDebugBuild() {
            return this.mEnableEmbeddedAppDebugBuild;
        }

        public Boolean getIsExternalService() {
            return this.mIsExternalService;
        }

        public MultiProcessMode getMultiProcessMode() {
            return this.mMultiProcessMode;
        }

        public OnVariationsSetListener getOnVariationsSetListener() {
            return this.mOnVariationsSetListener;
        }

        public String getPrivilegedServicesName() {
            return this.mPrivilegedServicesName;
        }

        public WebViewProviderInitListener getProviderInitListener() {
            return this.mProviderInitListener;
        }

        public AppHostedResourcesProvider getResourcesProvider() {
            return this.mResourcesProvider;
        }

        public String getSandboxedServicesName() {
            return this.mSandboxedServicesName;
        }

        public AppHostedShareDelegate getShareDelegate() {
            return this.mShareDelegate;
        }

        public String getUmaAllowlist() {
            return this.mUmaAllowlist;
        }

        public Builder setIsExternalService(boolean z) {
            this.mIsExternalService = Boolean.valueOf(z);
            return this;
        }

        public Builder setEnableCookieMerge(Boolean bool) {
            this.mEnableCookieMerge = bool;
            return this;
        }

        public Builder setEnableEmbeddedAppDebugBuild(Boolean bool) {
            this.mEnableEmbeddedAppDebugBuild = bool;
            return this;
        }

        public Builder setMultiProcessMode(MultiProcessMode multiProcessMode) {
            this.mMultiProcessMode = multiProcessMode;
            return this;
        }

        public Builder setOnVariationsSetListener(OnVariationsSetListener onVariationsSetListener) {
            this.mOnVariationsSetListener = onVariationsSetListener;
            return this;
        }

        public Builder setPrivilegedServicesName(String str) {
            this.mPrivilegedServicesName = str;
            return this;
        }

        public Builder setProviderInitListener(WebViewProviderInitListener webViewProviderInitListener) {
            this.mProviderInitListener = webViewProviderInitListener;
            return this;
        }

        public Builder setResourcesProvider(AppHostedResourcesProvider appHostedResourcesProvider) {
            this.mResourcesProvider = appHostedResourcesProvider;
            return this;
        }

        public Builder setSandboxedServicesName(String str) {
            this.mSandboxedServicesName = str;
            return this;
        }

        public Builder setShareDelegate(AppHostedShareDelegate appHostedShareDelegate) {
            this.mShareDelegate = appHostedShareDelegate;
            return this;
        }

        public Builder setUmaAllowlist(String str) {
            this.mUmaAllowlist = str;
            return this;
        }
    }

    /* loaded from: classes12.dex */
    public enum MultiProcessMode {
        FORCE_ON,
        FORCE_OFF
    }

    public WebViewEmbedderOptions(AppHostedResourcesProvider appHostedResourcesProvider, OnVariationsSetListener onVariationsSetListener, MultiProcessMode multiProcessMode, WebViewProviderInitListener webViewProviderInitListener, Boolean bool, Boolean bool2, String str, String str2, List list) {
        this.mMultiProcessMode = multiProcessMode;
        this.mSandboxedServicesName = str;
        this.mPrivilegedServicesName = "com.facebook.browser.helium.content.PrivilegedProcessService";
        this.mIsExternalService = bool2;
        this.mUmaAllowlist = str2;
        this.mProviderInitListener = webViewProviderInitListener;
        this.mCommandLineSwitches = Collections.unmodifiableList(list);
        this.mShareDelegate = null;
        this.mEnableCookieMerge = bool;
        this.mResourcesProvider = appHostedResourcesProvider;
        this.mOnVariationsSetListener = onVariationsSetListener;
    }

    public WebViewEmbedderOptions(Builder builder) {
        this.mMultiProcessMode = builder.mMultiProcessMode;
        this.mSandboxedServicesName = builder.mSandboxedServicesName;
        this.mPrivilegedServicesName = builder.mPrivilegedServicesName;
        this.mIsExternalService = builder.mIsExternalService;
        this.mUmaAllowlist = builder.mUmaAllowlist;
        this.mProviderInitListener = builder.mProviderInitListener;
        this.mCommandLineSwitches = Collections.unmodifiableList(builder.mCommandLineSwitches);
        this.mShareDelegate = builder.mShareDelegate;
        this.mEnableCookieMerge = builder.mEnableCookieMerge;
        this.mResourcesProvider = builder.mResourcesProvider;
        this.mOnVariationsSetListener = builder.mOnVariationsSetListener;
    }

    public List getCommandLineSwitches() {
        return this.mCommandLineSwitches;
    }

    public Boolean getEnableCookieMerge() {
        return this.mEnableCookieMerge;
    }

    public Boolean getIsExternalService() {
        return this.mIsExternalService;
    }

    public MultiProcessMode getMultiProcessMode() {
        return this.mMultiProcessMode;
    }

    public OnVariationsSetListener getOnVariationsSetListener() {
        return this.mOnVariationsSetListener;
    }

    public String getPrivilegedServicesName() {
        return this.mPrivilegedServicesName;
    }

    public WebViewProviderInitListener getProviderInitListener() {
        return this.mProviderInitListener;
    }

    public AppHostedResourcesProvider getResourcesProvider() {
        return this.mResourcesProvider;
    }

    public String getSandboxedServicesName() {
        return this.mSandboxedServicesName;
    }

    public AppHostedShareDelegate getShareDelegate() {
        return this.mShareDelegate;
    }

    public String getUmaAllowlist() {
        return this.mUmaAllowlist;
    }
}
