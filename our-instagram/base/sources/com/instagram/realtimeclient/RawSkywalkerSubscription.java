package com.instagram.realtimeclient;

import X.AnonymousClass001;

/* loaded from: classes4.dex */
public class RawSkywalkerSubscription {
    public static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";

    public static String getUserTopicSubscription(String str) {
        return AnonymousClass001.A0R(REALTIME_USER_TOPIC_PREFIX, str);
    }
}
