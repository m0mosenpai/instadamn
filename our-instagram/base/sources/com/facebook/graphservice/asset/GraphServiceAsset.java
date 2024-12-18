package com.facebook.graphservice.asset;

import X.AbstractC03210De;
import X.AnonymousClass001;
import X.B0W;
import X.C005001p;
import X.C03220Df;
import X.C09270dc;
import X.C0B4;
import X.C0J8;
import X.C23161Av;
import android.content.Context;
import com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class GraphServiceAsset {
    public static Context sApplicationContext;
    public static final Map sAssets;
    public static String sDefaultConfigName;
    public final GraphQLServiceConfig mConfig;
    public final HybridData mHybridData;

    public static native String getDefaultConfigNameNative();

    public static native HybridData initHybridData(String str, String str2, String str3, boolean z);

    public static native GraphQLServiceConfig resolveBuildConfig(String str);

    /* loaded from: classes10.dex */
    public class GraphQLServiceConfig {
        public final String assetFilename;
        public final String cacheNamespace;
        public final String rootBuildConfigName;
        public final String serverEndpoint;

        public GraphQLServiceConfig(String str, String str2, String str3, String str4) {
            this.rootBuildConfigName = str;
            this.assetFilename = str2;
            this.cacheNamespace = str3;
            this.serverEndpoint = str4;
        }
    }

    public static synchronized GraphServiceAsset getInstance(String str) {
        GraphServiceAsset graphServiceAsset;
        synchronized (GraphServiceAsset.class) {
            Map map = sAssets;
            if (map.containsKey(str)) {
                graphServiceAsset = (GraphServiceAsset) map.get(str);
                graphServiceAsset.getClass();
            } else {
                try {
                    GraphServiceNativeConfigLoader.loadNativeConfigs();
                    GraphQLServiceConfig resolveBuildConfig = resolveBuildConfig(str);
                    if (map.containsKey(resolveBuildConfig.rootBuildConfigName)) {
                        map.put(str, (GraphServiceAsset) map.get(resolveBuildConfig.rootBuildConfigName));
                        graphServiceAsset = (GraphServiceAsset) map.get(str);
                        graphServiceAsset.getClass();
                    } else {
                        Context context = sApplicationContext;
                        if (context == null) {
                            context = C0B4.A00();
                            sApplicationContext = context;
                        }
                        C0J8.A03(context, "GraphServiceAsset unable to get the application context. Please initialize it manually by calling useContext.");
                        String str2 = resolveBuildConfig.assetFilename;
                        File file = new File(C23161Av.A00(context).AXd(null, 709674273), resolveBuildConfig.cacheNamespace);
                        File file2 = new File(file, str2);
                        ArrayList arrayList = new ArrayList();
                        Executor executor = C03220Df.A07;
                        arrayList.add(new AbstractC03210De(AnonymousClass001.A0R(str2, ".checksum"), AnonymousClass001.A0g("uncompressed_", str2, ".checksum")));
                        arrayList.add(new AbstractC03210De(AnonymousClass001.A0R(str2, ".xzs"), str2));
                        for (int i = 0; i < arrayList.size(); i++) {
                            AbstractC03210De abstractC03210De = (AbstractC03210De) arrayList.get(i);
                            abstractC03210De.A00 = new File(file, abstractC03210De.A01);
                        }
                        new C03220Df(context, file, "GraphServiceUnpacker", arrayList, executor).A03();
                        try {
                            B0W b0w = new B0W(sApplicationContext);
                            b0w.A01 = 0;
                            Iterator it = b0w.iterator();
                            while (it.hasNext()) {
                                B0W b0w2 = (B0W) it.next();
                                if (b0w2 != null) {
                                    synchronized (b0w2.A03) {
                                        try {
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    throw new IllegalArgumentException(AnonymousClass001.A0O("method not found: ", b0w2.A00 << 8));
                                }
                            }
                            throw new RuntimeException("Found no IGraphServiceAssetSocket implementation");
                        } catch (NoClassDefFoundError unused) {
                            GraphServiceAsset graphServiceAsset2 = new GraphServiceAsset(file2.getCanonicalPath(), resolveBuildConfig, false);
                            map.put(str, graphServiceAsset2);
                            map.put(resolveBuildConfig.rootBuildConfigName, graphServiceAsset2);
                            return graphServiceAsset2;
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return graphServiceAsset;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01p, java.util.Map] */
    static {
        C09270dc.A03("fb");
        C09270dc.A03("graphservice-jni-asset");
        sAssets = new C005001p(1);
    }

    public GraphServiceAsset(String str, GraphQLServiceConfig graphQLServiceConfig, boolean z) {
        this.mHybridData = initHybridData(graphQLServiceConfig.rootBuildConfigName, str, graphQLServiceConfig.serverEndpoint, z);
        this.mConfig = graphQLServiceConfig;
        GraphServiceNativeConfigLoader.loadNativeConfigs();
    }
}
