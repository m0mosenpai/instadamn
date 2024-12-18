package com.facebook.nativeutil;

import X.AbstractC48942Mn;
import X.C09270dc;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class NativeList {
    public static final NativeList $redex_init_class = null;
    public final HybridData mHybridData;

    private native void addBoolean(boolean z);

    private native void addDouble(double d);

    private native void addInt(long j);

    private native void addNativeList(NativeList nativeList);

    private native void addNativeMap(NativeMap nativeMap);

    private native void addNull();

    private native void addString(String str);

    public static native HybridData initHybridData();

    public native List consumeList();

    static {
        C09270dc.A03("nativeutil-jni");
    }

    public NativeList(List list) {
        this.mHybridData = initHybridData();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A00 = AbstractC48942Mn.A00(it.next());
                if (A00 == null) {
                    addNull();
                } else if (A00 instanceof Boolean) {
                    addBoolean(((Boolean) A00).booleanValue());
                } else if (!(A00 instanceof Integer) && !(A00 instanceof Long) && !(A00 instanceof Short)) {
                    if (A00 instanceof Number) {
                        addDouble(((Number) A00).doubleValue());
                    } else if (A00 instanceof String) {
                        addString((String) A00);
                    } else if (A00 instanceof NativeMap) {
                        addNativeMap((NativeMap) A00);
                    } else if (A00 instanceof NativeList) {
                        addNativeList((NativeList) A00);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Could not convert ");
                        sb.append(A00.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    addInt(((Number) A00).longValue());
                }
            }
        }
    }

    public NativeList(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
