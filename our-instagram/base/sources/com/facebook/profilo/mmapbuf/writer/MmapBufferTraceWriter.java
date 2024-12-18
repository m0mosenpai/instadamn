package com.facebook.profilo.mmapbuf.writer;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* loaded from: classes.dex */
public class MmapBufferTraceWriter {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native long nativeInitAndVerify(String str);

    public native void nativeWriteTrace(String str, boolean z, String str2, String str3, int i, NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String[] strArr);

    static {
        C09170dP.A0C("profilo_mmap_file_writer");
    }
}
