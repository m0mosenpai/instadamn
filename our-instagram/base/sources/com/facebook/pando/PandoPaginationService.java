package com.facebook.pando;

import X.C09170dP;
import X.C14360o3;
import X.XgX;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class PandoPaginationService {
    public static final XgX Companion = new Object();
    public final HybridData mHybridData;

    public PandoPaginationService(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager) {
        C14360o3.A0B(pandoConsistencyServiceJNI, 1);
        C14360o3.A0B(pandoPrimaryExecution, 2);
        C14360o3.A0B(connectionManager, 3);
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI, pandoPrimaryExecution, connectionManager);
    }

    private final native void appendEdgeNative(String str, TreeJNI treeJNI);

    private final native void deleteEdgeNative(String str, TreeJNI treeJNI);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager);

    private final native void prependEdgeNative(String str, TreeJNI treeJNI);

    public void appendEdge(String str, Object obj) {
        C14360o3.A0B(str, 0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        appendEdgeNative(str, (TreeJNI) obj);
    }

    public void deleteEdge(String str, Object obj) {
        C14360o3.A0B(str, 0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        deleteEdgeNative(str, (TreeJNI) obj);
    }

    public native IPandoGraphQLService.Token loadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor);

    public native IPandoGraphQLService.Token loadPreviousPage(String str, int i, String str2, Executor executor);

    public void prependEdge(String str, Object obj) {
        C14360o3.A0B(str, 0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        prependEdgeNative(str, (TreeJNI) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XgX] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }
}
