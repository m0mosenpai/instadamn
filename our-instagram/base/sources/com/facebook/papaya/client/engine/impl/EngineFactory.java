package com.facebook.papaya.client.engine.impl;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class EngineFactory extends IEngineFactory {
    private final native void initHybrid(ITransport iTransport, Map map, Map map2, IModelLoader iModelLoader);

    public EngineFactory(Context context, Map map, Bundle bundle, Map map2, List list, ITransport iTransport, IModelLoader iModelLoader) {
        JQ0.A1O(context, map, bundle, map2, list);
        C14360o3.A0B(iTransport, 6);
        C09170dP.A0C("papaya-engine");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09170dP.A0D(AbstractC166987dD.A1B(it), 16);
        }
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1G.put(A1K.getKey(), ((PapayaRestrictions) A1K.getValue()).A00());
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator A152 = AbstractC166997dE.A15(map);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            String A17 = AbstractC31172DnG.A17(A1K2);
            try {
                builder.put(A17, (IExecutorFactory) ((Class) A1K2.getValue()).getConstructor(Context.class, Bundle.class).newInstance(context, bundle.getBundle(A17)));
            } catch (Exception e) {
                C0K8.A0G("PapayaEngineFactory", "Failed to instantiate ExecutorFactory implementation", e);
            }
        }
        Map buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        initHybrid(iTransport, buildOrThrow, A1G, iModelLoader);
    }
}
