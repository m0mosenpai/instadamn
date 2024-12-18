package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.Usp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67618Usp extends Sb5 {
    public final int A00;

    @Override // X.Sb5
    public final String A05() {
        return "topSelect";
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", this.A00);
        return writableNativeMap;
    }

    public C67618Usp(int i, int i2, int i3) {
        super(i, i2);
        this.A00 = i3;
    }
}
