package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.Usi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67611Usi extends Sb5 {
    public int A00;
    public int A01;

    @Override // X.Sb5
    public final String A05() {
        return "topSelectionChange";
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putInt("end", this.A00);
        writableNativeMap2.putInt("start", this.A01);
        writableNativeMap.putMap("selection", writableNativeMap2);
        return writableNativeMap;
    }
}
