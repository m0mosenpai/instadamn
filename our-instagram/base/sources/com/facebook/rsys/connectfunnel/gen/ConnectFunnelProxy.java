package com.facebook.rsys.connectfunnel.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class ConnectFunnelProxy {
    public abstract void annotateMultiple(String str, Map map, Map map2, Map map3, Map map4);

    public abstract void associateCallIds(String str, String str2, boolean z);

    public abstract void markPoint(String str, int i);

    public abstract void start(String str, int i, Map map);

    public abstract void upload(String str, McfReference mcfReference);
}
