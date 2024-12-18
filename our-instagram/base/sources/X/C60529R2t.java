package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.R2t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60529R2t extends R2f {
    public final C63347Si4 A00;
    public final int[] A01;

    public C60529R2t(C63347Si4 c63347Si4, ReadableMap readableMap) {
        super(null);
        int[] iArr;
        this.A00 = c63347Si4;
        ReadableArray array = readableMap.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = array.getInt(i);
            }
        }
        this.A01 = iArr;
    }

    @Override // X.R2f, X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "DivisionAnimatedNode[", A1C);
        A1C.append("]: input nodes: ");
        A1C.append(this.A01);
        A1C.append(" - super: ");
        return AbstractC166997dE.A0x(super.A03(), A1C);
    }
}
