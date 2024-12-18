package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class T0F implements ReadableArray, InterfaceC65656Tqi {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((T0F) obj).A00));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    public static T0F A00(ReadableArray readableArray) {
        List list;
        Object valueOf;
        Object string;
        T0F t0f = new T0F();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    t0f.A00.add(null);
                    break;
                case 1:
                    boolean z = readableArray.getBoolean(i);
                    list = t0f.A00;
                    valueOf = Boolean.valueOf(z);
                    list.add(valueOf);
                    break;
                case 2:
                    double d = readableArray.getDouble(i);
                    list = t0f.A00;
                    valueOf = Double.valueOf(d);
                    list.add(valueOf);
                    break;
                case 3:
                    string = readableArray.getString(i);
                    t0f.A00.add(string);
                    break;
                case 4:
                    string = T0G.A00(readableArray.getMap(i));
                    t0f.A00.add(string);
                    break;
                case 5:
                    string = A00(readableArray.getArray(i));
                    t0f.A00.add(string);
                    break;
            }
        }
        return t0f;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final ReadableArray getArray(int i) {
        return (ReadableArray) this.A00.get(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final boolean getBoolean(int i) {
        return AbstractC166987dD.A1a(this.A00.get(i));
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final double getDouble(int i) {
        return MSW.A00(this.A00.get(i));
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final int getInt(int i) {
        return AbstractC31176DnK.A01(this.A00, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final ReadableMap getMap(int i) {
        return (ReadableMap) this.A00.get(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final String getString(int i) {
        return AbstractC25226BEj.A1I(this.A00, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final ReadableType getType(int i) {
        Object obj = this.A00.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (!(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long)) {
            if (obj instanceof String) {
                return ReadableType.String;
            }
            if (obj instanceof ReadableArray) {
                return ReadableType.Array;
            }
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            return null;
        }
        return ReadableType.Number;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final boolean isNull(int i) {
        return AbstractC25229BEm.A1Z(this.A00.get(i));
    }

    @Override // X.InterfaceC65656Tqi
    public final void pushInt(int i) {
        this.A00.add(new Double(i));
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final int size() {
        return this.A00.size();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public final ArrayList toArrayList() {
        return AbstractC166987dD.A1F(this.A00);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public T0F(List list) {
        this.A00 = AbstractC166987dD.A1F(list);
    }

    public T0F() {
        this.A00 = AbstractC166987dD.A1E();
    }
}
