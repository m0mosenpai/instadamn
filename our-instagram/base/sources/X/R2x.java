package X;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes10.dex */
public final class R2x extends R2f {
    public double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final C63347Si4 A04;

    public R2x(C63347Si4 c63347Si4, ReadableMap readableMap) {
        super(null);
        this.A04 = c63347Si4;
        this.A03 = readableMap.getInt("input");
        this.A02 = readableMap.getDouble("min");
        this.A01 = readableMap.getDouble("max");
        ((R2f) this).A00 = this.A00;
    }

    @Override // X.R2f, X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "DiffClampAnimatedNode[", A1C);
        A1C.append("]: InputNodeTag: ");
        A1C.append(this.A03);
        A1C.append(" min: ");
        A1C.append(this.A02);
        A1C.append(" max: ");
        A1C.append(this.A01);
        A1C.append(" lastValue: ");
        A1C.append(this.A00);
        A1C.append(" super: ");
        return AbstractC166997dE.A0x(super.A03(), A1C);
    }
}
