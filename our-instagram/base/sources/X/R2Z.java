package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class R2Z extends AbstractC62966SZj {
    public final C63347Si4 A00;
    public final Map A01;

    public R2Z(C63347Si4 c63347Si4, ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        this.A00 = c63347Si4;
        ReadableMap map = readableMap.getMap("style");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        C06860Yd c06860Yd = new C06860Yd();
        if (readableMapKeySetIterator != null) {
            while (readableMapKeySetIterator.CLQ()) {
                String Csu = readableMapKeySetIterator.Csu();
                c06860Yd.put(Csu, Integer.valueOf(map.getInt(Csu)));
            }
        }
        this.A01 = AbstractC16850sd.A0N(c06860Yd);
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "StyleAnimatedNode[", A1C);
        A1C.append("] mPropMapping: ");
        return AbstractC166997dE.A0v(this.A01, A1C);
    }
}
