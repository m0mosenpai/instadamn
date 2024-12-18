package X;

import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes10.dex */
public final class R2i extends SMC {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E;
    public final SOZ A0F;

    public static final boolean A00(R2i r2i) {
        SOZ soz = r2i.A0F;
        if (Math.abs(soz.A01) <= r2i.A04) {
            if (Math.abs(r2i.A01 - soz.A00) <= r2i.A00 || r2i.A07 == 0.0d) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.SOZ, java.lang.Object] */
    public R2i(ReadableMap readableMap) {
        ?? obj = new Object();
        obj.A00 = 0.0d;
        obj.A01 = 0.0d;
        this.A0F = obj;
        obj.A01 = readableMap.getDouble("initialVelocity");
        A01(readableMap);
    }
}
