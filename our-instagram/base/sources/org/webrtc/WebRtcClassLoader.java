package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes4.dex */
public class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw AbstractC166987dD.A18("Failed to get WebRTC class loader.");
    }
}
