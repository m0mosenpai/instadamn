package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.Ush, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67610Ush extends Sb5 {
    public int A00;
    public String A01;

    @Override // X.Sb5
    public final String A05() {
        return "topChange";
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("text", this.A01);
        writableNativeMap.putInt("eventCount", this.A00);
        writableNativeMap.putInt("target", this.A02);
        return writableNativeMap;
    }
}
