package com.facebook.graphservice.factory;

import X.C09270dc;
import X.C0JT;
import X.InterfaceC40501uJ;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.serialization.TreeJsonSerializerJNI;
import com.facebook.graphservice.serialization.TreeSerializerJNI;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class GraphQLServiceFactory implements InterfaceC40501uJ {
    public final HybridData mHybridData;

    private native String clientDocIdForQueryNameHash(long j);

    public static native HybridData initHybridData(GraphServiceAsset graphServiceAsset);

    private native long legacyPersistIdForQueryNameHash(long j);

    private native TreeBuilderJNI moveTreeBuilder(TreeBuilderJNI treeBuilderJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native TreeBuilderJNI newTreeBuilderFromType(String str, Class cls, int i, boolean z);

    private native TreeBuilderJNI newUpdateBuilderFromTree(TreeJNI treeJNI, Class cls, int i);

    private native long ossPersistIdForQueryNameHash(long j);

    private native String queryTextForQueryNameHash(long j);

    private native String[] transientParametersForQueryNameHash(long j);

    public native TreeJsonSerializerJNI newTreeJsonSerializer();

    public native TreeSerializerJNI newTreeSerializer();

    @Override // X.InterfaceC40501uJ
    public String schemaForQuery(String str) {
        return null;
    }

    static {
        C09270dc.A01("graphservice-jni-factory");
    }

    public GraphQLServiceFactory(GraphServiceAsset graphServiceAsset) {
        this.mHybridData = initHybridData(graphServiceAsset);
    }

    @Override // X.InterfaceC40501uJ
    public String clientDocIdForQuery(String str) {
        return clientDocIdForQueryNameHash(Long.parseLong(C0JT.A00(str).substring(0, 8), 16));
    }

    @Override // X.InterfaceC40501uJ
    public String persistIdForQuery(String str) {
        return Long.toString(ossPersistIdForQueryNameHash(Long.parseLong(C0JT.A00(str).substring(0, 8), 16)));
    }

    public GraphQLServiceFactory() {
        this.mHybridData = null;
    }
}
