package com.instagram.common.graphics;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C1O5;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes10.dex */
public final class IgBitmapReference {
    public WeakReference mBitmapWeakReference;
    public final long mNativeEntry;
    public boolean mReleased;

    public static native Bitmap nativeCreateBitmap(long j);

    public static native void nativeDestructor(long j);

    public static native void nativeMakeDiscardable(long j);

    public synchronized Bitmap getOrCreateBitmap() {
        Bitmap bitmap;
        if (!this.mReleased) {
            WeakReference weakReference = this.mBitmapWeakReference;
            if (weakReference != null) {
                bitmap = (Bitmap) weakReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = nativeCreateBitmap(this.mNativeEntry);
                List list = C1O5.A01;
                if (list.size() > 450) {
                    System.gc();
                }
                list.add(new WeakReference(bitmap, C1O5.A00));
                if (bitmap != null) {
                    this.mBitmapWeakReference = AbstractC25225BEi.A16(bitmap);
                }
            }
        } else {
            throw AbstractC166987dD.A14("Trying to use a bitmap reference that's already been released");
        }
        return bitmap;
    }

    public synchronized void makeDiscardable() {
        nativeMakeDiscardable(this.mNativeEntry);
    }

    public synchronized void release() {
        if (!this.mReleased) {
            this.mReleased = true;
            this.mBitmapWeakReference = null;
            nativeDestructor(this.mNativeEntry);
        } else {
            throw AbstractC166987dD.A14("Trying to release a bitmap reference that's already been released");
        }
    }

    public void finalize() {
        if (!this.mReleased) {
            nativeDestructor(this.mNativeEntry);
        }
    }

    public IgBitmapReference(long j) {
        this.mNativeEntry = j;
    }
}
