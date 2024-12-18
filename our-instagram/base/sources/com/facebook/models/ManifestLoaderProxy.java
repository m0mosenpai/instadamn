package com.facebook.models;

import com.facebook.models.interfaces.IManifestLoader;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* loaded from: classes4.dex */
public class ManifestLoaderProxy {
    public final IManifestLoader mManifestLoader;

    public ListenableFuture load(String str, long j, Map map) {
        return this.mManifestLoader.load(str, j, map);
    }

    public ManifestLoaderProxy(IManifestLoader iManifestLoader) {
        this.mManifestLoader = iManifestLoader;
    }

    public ListenableFuture load(String str, Map map) {
        return this.mManifestLoader.load(str, map);
    }
}
