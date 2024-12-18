package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: X.SJp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62632SJp {
    public final Object A00(InterfaceC65353Tih interfaceC65353Tih, ReadableArray readableArray, int i) {
        switch (((R3F) this).A00) {
            case 0:
                AbstractC62632SJp abstractC62632SJp = C63280Sgf.A0B;
                return new PromiseImpl((Callback) abstractC62632SJp.A00(interfaceC65353Tih, readableArray, i), (Callback) abstractC62632SJp.A00(interfaceC65353Tih, readableArray, i + 1));
            case 1:
                return Boolean.valueOf(readableArray.getBoolean(i));
            case 2:
                return Double.valueOf(readableArray.getDouble(i));
            case 3:
                return Float.valueOf((float) readableArray.getDouble(i));
            case 4:
                return Integer.valueOf((int) readableArray.getDouble(i));
            case 5:
                return readableArray.getString(i);
            case 6:
                return readableArray.getArray(i);
            case 7:
                T03 t03 = (T03) T03.A02.A7H();
                if (t03 == null) {
                    t03 = new T03();
                }
                t03.A01 = readableArray;
                t03.A00 = i;
                return t03;
            case 8:
                return readableArray.getMap(i);
            default:
                if (readableArray.isNull(i)) {
                    return null;
                }
                return new C64135Szy(interfaceC65353Tih, (int) readableArray.getDouble(i));
        }
    }
}
