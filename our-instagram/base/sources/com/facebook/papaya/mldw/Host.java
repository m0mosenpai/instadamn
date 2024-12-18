package com.facebook.papaya.mldw;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public class Host {
    public final HybridData mHybridData;

    private native int nativeGetProduct();

    private native SettableFuture nativeLog(Event event);

    private native SettableFuture nativeReadFeatures(ImmutableMap immutableMap, Set set);

    private native SettableFuture nativeReadFeatures(List list);

    private native SettableFuture nativeRegisterFeatures(String str, int i);

    private native SettableFuture nativeRepackDisk(Long l);

    static {
        C09170dP.A0C("papaya-mldw");
    }

    public Host(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ListenableFuture log(Event event) {
        return nativeLog(event);
    }

    public ListenableFuture registerFeatures(String str, int i) {
        return nativeRegisterFeatures(str, i);
    }
}
