package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes10.dex */
public final class T03 implements Dynamic {
    public static final C18140uy A02 = new C18140uy(10);
    public int A00 = -1;
    public ReadableArray A01;

    @Override // com.facebook.react.bridge.Dynamic
    public final void recycle() {
        this.A01 = null;
        this.A00 = -1;
        A02.EE6(this);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableArray asArray() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getArray(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean asBoolean() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getBoolean(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final double asDouble() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getDouble(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final int asInt() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getInt(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableMap asMap() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getMap(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final String asString() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getString(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final ReadableType getType() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.getType(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public final boolean isNull() {
        ReadableArray readableArray = this.A01;
        if (readableArray != null) {
            return readableArray.isNull(this.A00);
        }
        throw AbstractC58321PtD.A0l();
    }
}
