package com.android.webview.chromium.membrane;

import X.AbstractC58318PtA;

/* loaded from: classes10.dex */
public class AppHostedChromiumLoader {
    public static final String IMPL_CLASS_NAME = "com.android.webview.chromium.AppHostedChromiumImpl";

    public static AppHostedChromium fromClassLoader(ClassLoader classLoader) {
        try {
            return (AppHostedChromium) classLoader.loadClass(IMPL_CLASS_NAME).newInstance();
        } catch (ClassNotFoundException e) {
            throw AbstractC58318PtA.A0e("Provider implementation not found", e);
        } catch (IllegalAccessException | InstantiationException e2) {
            throw AbstractC58318PtA.A0e("Failed to initialize provider", e2);
        }
    }
}
