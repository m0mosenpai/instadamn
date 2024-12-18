package com.facebook.profilo.mmapbuf.reader;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class MmapBufferHeaderReader {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native long readTraceId(String str);

    static {
        C09170dP.A0C("profilo_mmapbuf_rdr");
    }
}
