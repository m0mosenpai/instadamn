package com.facebook.graphservice;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC61280Rkq;
import X.C09270dc;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;

/* loaded from: classes10.dex */
public class GraphQLQueryBuilder {
    public final HybridData mHybridData;

    public static native HybridData initHybridData(GraphQLConfigHintsJNI graphQLConfigHintsJNI, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z);

    public native GraphQLQuery getResult();

    public native void setAcsToken(String str, String str2, String str3, String str4, String str5, String str6);

    public native void setOhaiConfig(int i, int i2, int i3, int i4, String str);

    static {
        C09270dc.A01("graphservice-jni");
    }

    public GraphQLQueryBuilder(AbstractC61280Rkq abstractC61280Rkq, String str, String str2, long j, NativeMap nativeMap, Class cls, int i, GraphServiceAsset graphServiceAsset, boolean z) {
        AbstractC09800fd.A03("GraphQLQueryBuilder(%s)", str2, 2067294751);
        GraphQLConfigHintsJNI graphQLConfigHintsJNI = GraphQLConfigHintsJNI.$redex_init_class;
        throw AbstractC166987dD.A15("cacheTtlSeconds");
    }
}
