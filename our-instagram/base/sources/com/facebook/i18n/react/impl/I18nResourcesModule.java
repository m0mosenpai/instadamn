package com.facebook.i18n.react.impl;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C14360o3;
import X.C61777RtX;
import X.InterfaceC08830cm;
import X.InterfaceC215713j;
import X.R3M;
import com.facebook.fbreact.specs.NativeI18nResourcesSpec;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "I18nResources")
/* loaded from: classes10.dex */
public final class I18nResourcesModule extends NativeI18nResourcesSpec {
    public static final C61777RtX Companion = new Object();
    public static final int[] EMPTY_ARRAY = new int[0];
    public static final String NAME = "I18nResources";
    public final InterfaceC08830cm fbtEnabledProvider;
    public final InterfaceC215713j stringResources;

    @Override // com.facebook.fbreact.specs.NativeI18nResourcesSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "I18nResources";
    }

    @Override // com.facebook.fbreact.specs.NativeI18nResourcesSpec
    public String getOverrideContent(String str) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nResourcesSpec
    public String getTranslation(String str, ReadableArray readableArray) {
        C14360o3.A0B(str, 0);
        int[] iArr = EMPTY_ARRAY;
        if (readableArray != null) {
            int size = readableArray.size();
            iArr = new int[size];
            int i = 0;
            while (i < size) {
                try {
                    iArr[i] = readableArray.getInt(i);
                    i++;
                } catch (Exception e) {
                    IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass001.A07(i, "Could not getTranslation: ", str, ": arg index "), e);
                    ReactSoftExceptionLogger.logSoftException("I18nResources", illegalStateException);
                    throw illegalStateException;
                }
            }
        }
        String AV4 = this.stringResources.AV4(str, iArr);
        if (AV4 == null) {
            return "";
        }
        return AV4;
    }

    public final InterfaceC08830cm getFbtEnabledProvider() {
        return this.fbtEnabledProvider;
    }

    public final InterfaceC215713j getStringResources() {
        return this.stringResources;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nResourcesSpec
    public boolean isEnabled() {
        Object obj = this.fbtEnabledProvider.get();
        C14360o3.A07(obj);
        return AbstractC166987dD.A1a(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I18nResourcesModule(R3M r3m, InterfaceC215713j interfaceC215713j, InterfaceC08830cm interfaceC08830cm) {
        super(r3m);
        AbstractC167017dG.A1R(interfaceC215713j, interfaceC08830cm);
        this.stringResources = interfaceC215713j;
        this.fbtEnabledProvider = interfaceC08830cm;
    }
}
