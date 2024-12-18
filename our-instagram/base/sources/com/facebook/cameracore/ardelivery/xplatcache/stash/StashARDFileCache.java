package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.C09170dP;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class StashARDFileCache extends ARDFileCache {
    public static final StashARDFileCache $redex_init_class = null;
    public final FileStash mStash;

    public static native HybridData initHybrid(long j, FileStash fileStash);

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void commit(String str) {
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void unlock(String str) {
    }

    static {
        C09170dP.A0C("ardcache-stash");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void clear() {
        this.mStash.removeAll();
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void flush() {
        throw new UnsupportedOperationException("flush() is not supported in Stash");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public Map.Entry[] getAllMetas() {
        throw new UnsupportedOperationException("getAllMetas() is not supported in Stash");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry getCacheEntry(String str) {
        File file = this.mStash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        if (!this.mStash.hasKey(str)) {
            return null;
        }
        return new ARDFileCacheEntry(this.mStash.getFilePath(str).getAbsolutePath());
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public long getSize() {
        return this.mStash.getSizeBytes();
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry insertAndLock(String str) {
        return new ARDFileCacheEntry(this.mStash.insertFile(str).getAbsolutePath());
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileInMemoryStatus memContains(String str) {
        if (this.mStash.hasKey(str)) {
            return ARDFileInMemoryStatus.IN_CACHE;
        }
        return ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public boolean remove(String str) {
        return this.mStash.remove(str);
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public boolean updateExtra(String str, byte[] bArr) {
        throw new UnsupportedOperationException("updateExtra() is not supported in Stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.mStash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public Set getAllKeys() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            return this.mStash.getAllKeys();
        }
        throw new IllegalStateException("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }
}
