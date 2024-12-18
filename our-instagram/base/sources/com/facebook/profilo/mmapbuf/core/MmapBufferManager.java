package com.facebook.profilo.mmapbuf.core;

import X.AnonymousClass001;
import X.C09170dP;
import X.C0WE;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public class MmapBufferManager {
    public static final MmapBufferManager $redex_init_class = null;
    public final C0WE mFileHelper;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public synchronized boolean deallocateBuffer(Buffer buffer) {
        return nativeDeallocateBuffer(buffer);
    }

    public Buffer allocateBuffer(int i, boolean z) {
        if (z) {
            String A01 = this.mFileHelper.A01(AnonymousClass001.A0R(C0WE.A00(UUID.randomUUID().toString()), ".buff"));
            if (A01 == null) {
                return null;
            }
            return nativeAllocateBuffer(i, A01);
        }
        return nativeAllocateBuffer(i);
    }

    static {
        C09170dP.A0C("profilo_mmapbuf");
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new C0WE(file);
    }
}
