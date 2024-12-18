package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class ResProvider implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void markRootRelative() {
    }

    public abstract InputStream open(String str);

    public boolean shouldMemoizeReturnedData() {
        return true;
    }
}
