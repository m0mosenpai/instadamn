package X;

import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.factory.GraphQLServiceFactory;
import com.facebook.graphservice.interfaces.TreeSerializer;
import com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader;
import java.util.Map;

/* renamed from: X.SdL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63117SdL {
    public static final Map A00 = new C005001p(1);
    public static final Map A03 = new C005001p(1);
    public static final Map A02 = new C005001p(1);
    public static final Map A01 = new C005001p(1);
    public static final Map A04 = new C005001p(1);

    public static TreeSerializer A00() {
        String str;
        TreeSerializer treeSerializer;
        synchronized (GraphServiceAsset.class) {
            str = GraphServiceAsset.sDefaultConfigName;
            if (str == null) {
                GraphServiceNativeConfigLoader.loadNativeConfigs();
                str = GraphServiceAsset.getDefaultConfigNameNative();
                GraphServiceAsset.sDefaultConfigName = str;
            }
        }
        synchronized (C63117SdL.class) {
            String str2 = GraphServiceAsset.getInstance(str).mConfig.rootBuildConfigName;
            Map map = A01;
            if (!map.containsKey(str2)) {
                synchronized (C63117SdL.class) {
                    GraphServiceAsset graphServiceAsset = GraphServiceAsset.getInstance(str2);
                    String str3 = graphServiceAsset.mConfig.rootBuildConfigName;
                    Map map2 = A00;
                    if (!map2.containsKey(str3)) {
                        map2.put(str3, new GraphQLServiceFactory(graphServiceAsset));
                    }
                    GraphQLServiceFactory graphQLServiceFactory = (GraphQLServiceFactory) map2.get(str3);
                    graphQLServiceFactory.getClass();
                    map.put(str2, graphQLServiceFactory.newTreeSerializer());
                }
            }
            treeSerializer = (TreeSerializer) map.get(str2);
            treeSerializer.getClass();
        }
        return treeSerializer;
    }
}
