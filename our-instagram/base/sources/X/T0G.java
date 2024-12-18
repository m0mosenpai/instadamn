package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T0G implements ReadableMap, InterfaceC65657Tqj {
    public final Map A00 = AbstractC166987dD.A1G();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Map map2 = ((T0G) obj).A00;
                if (map != null) {
                    if (!map.equals(map2)) {
                    }
                } else if (map2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static T0G A00(ReadableMap readableMap) {
        Map map;
        Boolean valueOf;
        T0G t0g = new T0G();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            switch (readableMap.getType(Csu).ordinal()) {
                case 0:
                    map = t0g.A00;
                    valueOf = null;
                    break;
                case 1:
                    boolean z = readableMap.getBoolean(Csu);
                    map = t0g.A00;
                    valueOf = Boolean.valueOf(z);
                    break;
                case 2:
                    t0g.putDouble(Csu, readableMap.getDouble(Csu));
                    continue;
                case 3:
                    t0g.putString(Csu, readableMap.getString(Csu));
                    continue;
                case 4:
                    t0g.putMap(Csu, A00(readableMap.getMap(Csu)));
                    continue;
                case 5:
                    t0g.putArray(Csu, T0F.A00(readableMap.getArray(Csu)));
                    continue;
            }
            map.put(Csu, valueOf);
        }
        return t0g;
    }

    public final void A01(String str, int i) {
        this.A00.put(str, new Double(i));
    }

    @Override // X.InterfaceC65657Tqj
    public final InterfaceC65657Tqj copy() {
        T0G t0g = new T0G();
        t0g.A00.putAll(this.A00);
        return t0g;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableArray getArray(String str) {
        return (ReadableArray) this.A00.get(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean getBoolean(String str) {
        return AbstractC166987dD.A1a(this.A00.get(str));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final double getDouble(String str) {
        return MSW.A00(this.A00.get(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.ReadableMap
    public final Dynamic getDynamic(String str) {
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
    public final Iterator getEntryIterator() {
        return AbstractC166997dE.A15(this.A00);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final int getInt(String str) {
        return AbstractC166987dD.A0H(this.A00.get(str));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableMap getMap(String str) {
        return (ReadableMap) this.A00.get(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final String getString(String str) {
        return AbstractC166987dD.A1A(str, this.A00);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableType getType(String str) {
        Object obj = this.A00.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A11("Invalid value ", obj.toString(), " for key ", str, "contained in JavaOnlyMap"));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean hasKey(String str) {
        return this.A00.containsKey(str);
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean isNull(String str) {
        return AbstractC25229BEm.A1Z(this.A00.get(str));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableMapKeySetIterator keySetIterator() {
        return new T0H(this);
    }

    @Override // X.InterfaceC65657Tqj
    public final void putArray(String str, ReadableArray readableArray) {
        this.A00.put(str, readableArray);
    }

    @Override // X.InterfaceC65657Tqj
    public final void putDouble(String str, double d) {
        this.A00.put(str, Double.valueOf(d));
    }

    @Override // X.InterfaceC65657Tqj
    public final void putMap(String str, ReadableMap readableMap) {
        this.A00.put(str, readableMap);
    }

    @Override // X.InterfaceC65657Tqj
    public final void putString(String str, String str2) {
        this.A00.put(str, str2);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final HashMap toHashMap() {
        return AbstractC58318PtA.A10(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public T0G(Object... objArr) {
        Object obj = objArr[1];
        this.A00.put(objArr[0], obj instanceof Number ? Double.valueOf(MSW.A00(obj)) : obj);
    }

    public T0G() {
    }
}
