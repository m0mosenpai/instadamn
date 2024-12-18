package X;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes10.dex */
public final class R2w extends R2f {
    public final double A00;
    public final int A01;
    public final C63347Si4 A02;

    public R2w(C63347Si4 c63347Si4, ReadableMap readableMap) {
        super(null);
        this.A02 = c63347Si4;
        this.A01 = readableMap.getInt("input");
        this.A00 = readableMap.getDouble("modulus");
    }

    @Override // X.R2f, X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "NativeAnimatedNodesManager[", A1C);
        A1C.append("] inputNode: ");
        A1C.append(this.A01);
        A1C.append(" modulus: ");
        A1C.append(this.A00);
        A1C.append(" super: ");
        return AbstractC166997dE.A0x(super.A03(), A1C);
    }
}
