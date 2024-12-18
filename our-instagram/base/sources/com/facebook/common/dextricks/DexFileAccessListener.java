package com.facebook.common.dextricks;

import dalvik.system.DexFile;

/* loaded from: classes.dex */
public interface DexFileAccessListener {
    void onClassLoadedFromDexFile(Class cls, DexFile dexFile);
}
