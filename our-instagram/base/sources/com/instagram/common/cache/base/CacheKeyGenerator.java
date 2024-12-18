package com.instagram.common.cache.base;

import X.C09170dP;
import X.C14360o3;
import X.C40569Hyp;
import X.J7Q;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CacheKeyGenerator {
    public static final C40569Hyp Companion = new Object();
    public final HybridData mHybridData;
    public final UserSession userSession;

    public /* synthetic */ CacheKeyGenerator(UserSession userSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession);
    }

    public static final CacheKeyGenerator getInstance(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (CacheKeyGenerator) userSession.A01(CacheKeyGenerator.class, new J7Q(userSession, 36));
    }

    private final native HybridData initHybrid();

    public final native void enableLogging();

    public final native String generateKey(String str, String str2);

    public final native void initializeKeyGenerator(String str);

    public final native boolean isInitialized();

    public final UserSession getUserSession() {
        return this.userSession;
    }

    public CacheKeyGenerator(UserSession userSession) {
        this.userSession = userSession;
        C09170dP.A0C("cache_key_generator_jni");
        this.mHybridData = initHybrid();
    }
}
