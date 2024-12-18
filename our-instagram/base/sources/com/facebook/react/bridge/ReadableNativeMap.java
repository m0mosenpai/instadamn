package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AnonymousClass001;
import X.C14360o3;
import X.C18140uy;
import X.C62153S0a;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.PUE;
import X.STV;
import X.T04;
import X.T0I;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    public static final C62153S0a Companion = new Object();
    public static int jniPassCounter;
    public final InterfaceC09390do keys$delegate;
    public final InterfaceC09390do localMap$delegate;
    public final InterfaceC09390do localTypeMap$delegate;

    public final native String[] importKeys();

    public final native Object[] importTypes();

    public final native Object[] importValues();

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof ReadableArray)) {
            obj2 = null;
        }
        ReadableArray readableArray = (ReadableArray) obj2;
        if (readableArray == null) {
            Class<?> cls = obj.getClass();
            if (cls == null || (str2 = cls.getSimpleName()) == null) {
                str2 = "NULL";
            }
            String A13 = AnonymousClass001.A13("Value for ", str, " cannot be cast from ", str2, " to ", "ReadableArray");
            C14360o3.A0B(A13, 1);
            throw new RuntimeException(A13);
        }
        return readableArray;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Class cls = Boolean.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            Class<?> cls2 = value.getClass();
            if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
                str2 = "NULL";
            }
            throw AbstractC58323PtF.A0a(cls, str, str2);
        }
        return bool.booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Double)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null) {
            Class<?> cls2 = value.getClass();
            if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
                str2 = "NULL";
            }
            throw AbstractC58323PtF.A0a(cls, str, str2);
        }
        return number.doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String str) {
        C14360o3.A0B(str, 0);
        T04 t04 = (T04) ((C18140uy) T04.A02.get()).A7H();
        T04 t042 = t04;
        if (t04 == null) {
            t042 = new Object();
        }
        t042.A00 = this;
        t042.A01 = str;
        return t042;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator getEntryIterator() {
        PUE pue;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] importValues = importValues();
            jniPassCounter++;
            pue = new PUE(importValues, keys);
        }
        return pue;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Double)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null) {
            Class<?> cls2 = value.getClass();
            if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
                str2 = "NULL";
            }
            throw AbstractC58323PtF.A0a(cls, str, str2);
        }
        return (int) number.doubleValue();
    }

    public long getLong(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Class cls = Long.TYPE;
        Object value = getValue(str);
        Object obj = value;
        if (!(value instanceof Long)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null) {
            Class<?> cls2 = value.getClass();
            if (cls2 == null || (str2 = cls2.getSimpleName()) == null) {
                str2 = "NULL";
            }
            throw AbstractC58323PtF.A0a(cls, str, str2);
        }
        return number.longValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof ReadableNativeMap)) {
            obj2 = null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) obj2;
        if (readableNativeMap == null) {
            Class<?> cls = obj.getClass();
            if (cls == null || (str2 = cls.getSimpleName()) == null) {
                str2 = "NULL";
            }
            String A13 = AnonymousClass001.A13("Value for ", str, " cannot be cast from ", str2, " to ", "ReadableNativeMap");
            C14360o3.A0B(A13, 1);
            throw new RuntimeException(A13);
        }
        return readableNativeMap;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        Object obj = getLocalMap().get(str);
        if (obj == null) {
            return null;
        }
        Object obj2 = obj;
        if (!(obj instanceof String)) {
            obj2 = null;
        }
        String str3 = (String) obj2;
        if (str3 == null) {
            Class<?> cls = obj.getClass();
            if (cls == null || (str2 = cls.getSimpleName()) == null) {
                str2 = "NULL";
            }
            String A13 = AnonymousClass001.A13("Value for ", str, " cannot be cast from ", str2, " to ", "String");
            C14360o3.A0B(A13, 1);
            throw new RuntimeException(A13);
        }
        return str3;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        C14360o3.A0B(str, 0);
        ReadableType readableType = (ReadableType) getLocalTypeMap().get(str);
        if (readableType != null) {
            return readableType;
        }
        throw new RuntimeException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        C14360o3.A0B(str, 0);
        return getLocalMap().containsKey(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String str) {
        C14360o3.A0B(str, 0);
        if (getLocalMap().containsKey(str)) {
            return AbstractC25229BEm.A1Z(getLocalMap().get(str));
        }
        throw new RuntimeException(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.S0a, java.lang.Object] */
    static {
        STV.A00();
    }

    private final /* synthetic */ Object checkInstance(String str, Object obj, Class cls) {
        throw AbstractC166987dD.A1D("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final int getJNIPassCounter() {
        return jniPassCounter;
    }

    public final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeMap)) {
            return false;
        }
        return C14360o3.A0K(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
    }

    public ReadableNativeMap() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.keys$delegate = AbstractC58322PtE.A13(this, enumC09460dv, 47);
        this.localMap$delegate = AbstractC58322PtE.A13(this, enumC09460dv, 48);
        this.localTypeMap$delegate = AbstractC58322PtE.A13(this, enumC09460dv, 49);
    }

    public static final /* synthetic */ String[] access$getKeys(ReadableNativeMap readableNativeMap) {
        return readableNativeMap.getKeys();
    }

    public static final /* synthetic */ String[] access$importKeys(ReadableNativeMap readableNativeMap) {
        return readableNativeMap.importKeys();
    }

    public static final /* synthetic */ Object[] access$importTypes(ReadableNativeMap readableNativeMap) {
        return readableNativeMap.importTypes();
    }

    public static final /* synthetic */ Object[] access$importValues(ReadableNativeMap readableNativeMap) {
        return readableNativeMap.importValues();
    }

    private final /* synthetic */ Object getNullableValue(String str, Class cls) {
        if (getLocalMap().get(str) == null) {
            return null;
        }
        throw AbstractC166987dD.A1D("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private final /* synthetic */ Object getValue(String str, Class cls) {
        getValue(str);
        throw AbstractC166987dD.A1D("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new T0I(getKeys());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap toHashMap() {
        Cloneable arrayList;
        HashMap A10 = AbstractC58318PtA.A10(getLocalMap());
        Iterator A0l = AbstractC167007dF.A0l(A10);
        while (A0l.hasNext()) {
            Object next = A0l.next();
            AbstractC25225BEi.A1S(next);
            String str = (String) next;
            switch (getType(str).ordinal()) {
                case 4:
                    ReadableNativeMap map = getMap(str);
                    AbstractC05810Sj.A00(map);
                    arrayList = map.toHashMap();
                    break;
                case 5:
                    ReadableArray array = getArray(str);
                    AbstractC05810Sj.A00(array);
                    arrayList = array.toArrayList();
                    break;
            }
            A10.put(str, arrayList);
        }
        return A10;
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final Object getValue(String str) {
        if (hasKey(str)) {
            Object obj = getLocalMap().get(str);
            AbstractC05810Sj.A00(obj);
            C14360o3.A07(obj);
            return obj;
        }
        throw new RuntimeException(str);
    }
}
