package com.facebook.pando;

import X.AbstractC001800i;
import X.AbstractC40541uN;
import X.AnonymousClass001;
import X.C09170dP;
import X.C14360o3;
import X.C1Dc;
import X.C2JS;
import X.C48O;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class PandoGraphQLConsistencyJNI {
    public static final C1Dc Companion = new Object();
    public final PandoConsistencyServiceJNI consistencyService;
    public final HybridData mHybridData;

    public PandoGraphQLConsistencyJNI(PandoConsistencyServiceJNI pandoConsistencyServiceJNI) {
        C14360o3.A0B(pandoConsistencyServiceJNI, 1);
        this.consistencyService = pandoConsistencyServiceJNI;
        this.mHybridData = initHybridData(pandoConsistencyServiceJNI);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoConsistencyServiceJNI pandoConsistencyServiceJNI);

    private final native IPandoGraphQLService.Result subscribeNative(TreeJNI treeJNI, Class cls, NativeCallbacks nativeCallbacks, Executor executor);

    private final native IPandoGraphQLService.Token subscribeWithJavaASTNative(TreeJNI treeJNI, Class cls, NativeCallbacks nativeCallbacks, Executor executor);

    public final native boolean hasSubscribersRacey();

    public final native void publish(String str);

    public final native void publishTreeUpdaters(List list, boolean z);

    public final IPandoGraphQLService.Token subscribeWithJavaAST(TreeJNI treeJNI, C48O c48o, Executor executor) {
        C14360o3.A0B(treeJNI, 0);
        C14360o3.A0B(c48o, 1);
        C14360o3.A0B(executor, 2);
        return subscribeWithJavaASTNative(treeJNI, treeJNI.getClass(), new NativeCallbacks(c48o), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Dc, java.lang.Object] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public static /* synthetic */ void publishTreeUpdaters$default(PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pandoGraphQLConsistencyJNI.publishTreeUpdaters(list, z);
    }

    public final PandoConsistencyServiceJNI getInnerConsistencyService() {
        return this.consistencyService;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.pando.IPandoGraphQLService$Token, java.lang.Object] */
    public final IPandoGraphQLService.Result subscribe(Object obj, Class cls, C48O c48o, Executor executor) {
        C14360o3.A0B(cls, 1);
        C14360o3.A0B(c48o, 2);
        C14360o3.A0B(executor, 3);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        IPandoGraphQLService.Result subscribeNative = subscribeNative((TreeJNI) obj, cls, new NativeCallbacks(c48o), executor);
        Object obj2 = subscribeNative.tree;
        if (AbstractC40541uN.A00 && (obj2 instanceof C2JS)) {
            C2JS c2js = (C2JS) obj2;
            if (!c2js.areAllSelectionsOptionalOrNonnull()) {
                String obj3 = cls.toString();
                C14360o3.A07(obj3);
                c48o.DEA(new PandoError(AnonymousClass001.A0R("A root field is required but null, or is required and has a recursively required but null child field:\n", AbstractC001800i.A0P("\n", "", "", c2js.bubbledNullPaths(obj3), null)), "", "", (short) 0, "", "", "", "", false, false, false, ""));
                return new IPandoGraphQLService.Result(null, new Object());
            }
            return subscribeNative;
        }
        return subscribeNative;
    }
}
