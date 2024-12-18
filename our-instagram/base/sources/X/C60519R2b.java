package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Map;

/* renamed from: X.R2b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60519R2b extends AbstractC62966SZj {
    public InterfaceC65589TnT A01;
    public final C63347Si4 A02;
    public final Map A04;
    public int A00 = -1;
    public final T0G A03 = new T0G();

    public C60519R2b(C63347Si4 c63347Si4, ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIterator;
        this.A02 = c63347Si4;
        ReadableMap map = readableMap.getMap("props");
        if (map != null) {
            readableMapKeySetIterator = map.keySetIterator();
        } else {
            readableMapKeySetIterator = null;
        }
        this.A04 = AbstractC166987dD.A1I();
        if (readableMapKeySetIterator != null) {
            while (readableMapKeySetIterator.CLQ()) {
                String Csu = readableMapKeySetIterator.Csu();
                this.A04.put(Csu, Integer.valueOf(map.getInt(Csu)));
            }
        }
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "PropsAnimatedNode[", A1C);
        A1C.append("] connectedViewTag: ");
        A1C.append(this.A00);
        A1C.append(" propNodeMapping: ");
        A1C.append(this.A04);
        A1C.append(" propMap: ");
        return AbstractC166997dE.A0v(this.A03, A1C);
    }
}
