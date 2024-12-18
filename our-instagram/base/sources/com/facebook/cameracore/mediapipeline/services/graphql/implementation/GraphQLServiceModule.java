package com.facebook.cameracore.mediapipeline.services.graphql.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C203848zt;
import X.C224849w9;
import X.C90m;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class GraphQLServiceModule extends ServiceModule {
    public static final C224849w9 Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9w9, java.lang.Object] */
    static {
        C09170dP.A0C("graphqlservice");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90m.A04;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                return new GraphQLServiceConfigurationHybrid((C90m) anonymousClass904.A02(c203848zt));
            }
            return null;
        }
        return null;
    }

    public GraphQLServiceModule() {
        this.mHybridData = initHybrid();
    }
}
