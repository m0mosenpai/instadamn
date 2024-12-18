package com.facebook.cameracore.ardelivery.xplat.models;

import X.C00O;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class XplatScriptingManagerCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(List list, List list2);

    public XplatScriptingManagerCompletionCallback() {
        throw C00O.createAndThrow();
    }
}
