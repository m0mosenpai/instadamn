package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes10.dex */
public final class T04 implements Dynamic {
    public static final ThreadLocal A02 = new TYJ();
    public ReadableMap A00;
    public String A01;

    @Override // com.facebook.react.bridge.Dynamic
    public final void recycle() {
        this.A00 = null;
        this.A01 = null;
        ((C18140uy) A02.get()).EE6(this);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableArray asArray() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getArray(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getBoolean(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final double asDouble() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getDouble(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final int asInt() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getInt(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableMap asMap() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            ReadableMap map = readableMap.getMap(str);
            map.getClass();
            return map;
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final String asString() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getString(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableType getType() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.getType(str);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean isNull() {
        String str;
        ReadableMap readableMap = this.A00;
        if (readableMap != null && (str = this.A01) != null) {
            return readableMap.isNull(str);
        }
        throw AbstractC58321PtD.A0l();
    }
}
