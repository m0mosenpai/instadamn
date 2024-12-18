package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class DiscreteFileInputDexIterator extends InputDexIterator {
    public final ResProvider mResProvider;

    public DiscreteFileInputDexIterator(DexManifest dexManifest, ResProvider resProvider) {
        super(dexManifest, null);
        this.mResProvider = resProvider;
    }

    @Override // com.facebook.common.dextricks.InputDexIterator
    public InputDex nextImpl(DexManifest.Dex dex) {
        InputStream open = this.mResProvider.open(dex.assetName);
        try {
            return new InputDex(dex, open);
        } catch (Throwable th) {
            Fs.safeClose(open);
            throw th;
        }
    }
}
