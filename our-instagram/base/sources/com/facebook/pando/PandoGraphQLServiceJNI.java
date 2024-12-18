package com.facebook.pando;

import X.AbstractC001800i;
import X.AbstractC40541uN;
import X.AnonymousClass001;
import X.AnonymousClass489;
import X.C09170dP;
import X.C14360o3;
import X.C2JS;
import X.C48O;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class PandoGraphQLServiceJNI implements IPandoGraphQLService {
    public static final AnonymousClass489 Companion = new Object();
    public final PandoGraphQLConsistencyJNI mGraphqlConsistency;
    public final HybridData mHybridData;

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, DefaultConstructorMarker defaultConstructorMarker) {
        this(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    public static final PandoGraphQLServiceJNI createDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, Executor executor) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, true, z, z2, executor);
    }

    public static final PandoGraphQLServiceJNI createNonDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, Executor executor) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, false, true, false, executor);
    }

    public static /* synthetic */ void getMGraphqlConsistency$annotations() {
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor);

    private final native IPandoGraphQLService.Result initiateNative(String str, PandoGraphQLRequest pandoGraphQLRequest, NativeCallbacks nativeCallbacks, Executor executor);

    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.pando.IPandoGraphQLService$Token, java.lang.Object] */
    @Override // com.facebook.pando.IPandoGraphQLService
    public IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C48O c48o, Executor executor) {
        NativeCallbacks nativeCallbacks;
        C14360o3.A0B(pandoGraphQLRequest, 1);
        if (c48o != null) {
            nativeCallbacks = new NativeCallbacks(c48o);
        } else {
            nativeCallbacks = null;
        }
        IPandoGraphQLService.Result initiateNative = initiateNative(str, pandoGraphQLRequest, nativeCallbacks, executor);
        Object obj = initiateNative.tree;
        if (AbstractC40541uN.A00 && (obj instanceof C2JS)) {
            C2JS c2js = (C2JS) obj;
            if (!c2js.areAllSelectionsOptionalOrNonnull()) {
                String A0P = AbstractC001800i.A0P("\n", "", "", c2js.bubbledNullPaths(pandoGraphQLRequest.queryName), null);
                if (c48o != null) {
                    c48o.DEA(new PandoError(AnonymousClass001.A0R("A root field is required but null, or is required and has a recursively required but null child field:\n", A0P), "", "", (short) 0, "", "", "", "", false, false, false, ""));
                }
                return new IPandoGraphQLService.Result(null, new Object());
            }
        }
        return initiateNative;
    }

    public void pandoAppendEdge(String str, TreeJNI treeJNI) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(treeJNI, 1);
        pandoAppendEdgeNative(str, treeJNI);
    }

    public final native void pandoAppendEdgeNative(String str, TreeJNI treeJNI);

    public IPandoGraphQLService.Token pandoLoadNextPage(String str, int i, int i2, boolean z, String str2, Executor executor) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(executor, 5);
        return pandoLoadNextPageNative(str, i, i2, z, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadNextPageNative(String str, int i, int i2, boolean z, String str2, Executor executor);

    public IPandoGraphQLService.Token pandoLoadPreviousPage(String str, int i, String str2, Executor executor) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(executor, 3);
        return pandoLoadPreviousPageNative(str, i, str2, executor);
    }

    public final native IPandoGraphQLService.Token pandoLoadPreviousPageNative(String str, int i, String str2, Executor executor);

    public void pandoPrependEdge(String str, TreeJNI treeJNI) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(treeJNI, 1);
        pandoPrependEdgeNative(str, treeJNI);
    }

    public final native void pandoPrependEdgeNative(String str, TreeJNI treeJNI);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.489, java.lang.Object] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public static /* synthetic */ HybridData initHybridData$default(PandoGraphQLServiceJNI pandoGraphQLServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, int i, Object obj) {
        if ((i & 32) != 0) {
            executor = null;
        }
        return pandoGraphQLServiceJNI.initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    public PandoGraphQLConsistencyJNI graphQLConsistency() {
        return this.mGraphqlConsistency;
    }

    public PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor) {
        this.mGraphqlConsistency = pandoGraphQLConsistencyJNI;
        this.mHybridData = initHybridData(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, z2, z3, executor);
    }

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, boolean z, boolean z2, boolean z3, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pandoPrimaryExecution, pandoGraphQLConsistencyJNI, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : executor);
    }
}
