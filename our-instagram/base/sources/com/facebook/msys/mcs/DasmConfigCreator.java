package com.facebook.msys.mcs;

import X.C6Ec;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public abstract class DasmConfigCreator {
    public final NativeHolder mNativeHolder = initNativeHolder();

    public abstract C6Ec createDasmConfig();

    public abstract NativeHolder initNativeHolder();
}
