package com.facebook.models.interfaces;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IManifestLoader {
    ListenableFuture load(String str, long j, Map map);

    ListenableFuture load(String str, Map map);
}
