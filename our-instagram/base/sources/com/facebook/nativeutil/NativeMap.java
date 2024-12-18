package com.facebook.nativeutil;

import X.AbstractC48942Mn;
import X.C09270dc;
import com.facebook.jni.HybridData;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class NativeMap extends AbstractMap<String, Object> {
    public static final NativeMap $redex_init_class = null;
    public final HybridData mHybridData = initHybridData();

    public static native HybridData initHybridData();

    private native void putBoolean(String str, boolean z);

    private native void putDouble(String str, double d);

    private native void putInt(String str, long j);

    private native void putNativeList(String str, NativeList nativeList);

    private native void putNativeMap(String str, NativeMap nativeMap);

    private native void putNull(String str);

    private native void putString(String str, String str2);

    public native Map consumeMap();

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        Object A00 = AbstractC48942Mn.A00(obj2);
        if (A00 == null) {
            putNull(str);
            return obj2;
        }
        if (A00 instanceof Boolean) {
            putBoolean(str, ((Boolean) A00).booleanValue());
            return obj2;
        }
        if (!(A00 instanceof Integer) && !(A00 instanceof Long) && !(A00 instanceof Short)) {
            if (A00 instanceof Number) {
                putDouble(str, ((Number) A00).doubleValue());
                return obj2;
            }
            if (A00 instanceof String) {
                putString(str, (String) A00);
                return obj2;
            }
            if (A00 instanceof NativeMap) {
                putNativeMap(str, (NativeMap) A00);
                return obj2;
            }
            if (A00 instanceof NativeList) {
                putNativeList(str, (NativeList) A00);
                return obj2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not convert ");
            sb.append(A00.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
        putInt(str, ((Number) A00).longValue());
        return obj2;
    }

    static {
        C09270dc.A03("nativeutil-jni");
    }

    public NativeMap(Map map) {
        putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        throw new UnsupportedOperationException("not implemented");
    }

    public NativeMap() {
    }
}
