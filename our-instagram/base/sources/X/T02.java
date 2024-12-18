package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes10.dex */
public final class T02 implements Dynamic {
    public Object A00;

    @Override // com.facebook.react.bridge.Dynamic
    public final void recycle() {
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableArray asArray() {
        return (ReadableArray) this.A00;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean asBoolean() {
        return AbstractC166987dD.A1a(this.A00);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final double asDouble() {
        return MSW.A00(this.A00);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final int asInt() {
        return AbstractC166987dD.A0H(this.A00);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableMap asMap() {
        return (ReadableMap) this.A00;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final String asString() {
        return (String) this.A00;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean isNull() {
        return AbstractC25229BEm.A1Z(this.A00);
    }

    public T02(Object obj) {
        this.A00 = obj;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableType getType() {
        String A0h;
        if (isNull()) {
            return ReadableType.Null;
        }
        Object obj = this.A00;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj == null) {
            A0h = "<NULL object>";
        } else {
            A0h = MSY.A0h(obj);
        }
        C0I2.A03("ReactNative", AnonymousClass001.A0R("Unmapped object type ", A0h));
        return ReadableType.Null;
    }
}
