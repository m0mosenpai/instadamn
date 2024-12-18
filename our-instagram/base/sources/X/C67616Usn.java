package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.Usn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67616Usn extends Sb5 {
    public String A00;

    @Override // X.Sb5
    public final String A05() {
        return "topKeyPress";
    }

    @Override // X.Sb5
    public final boolean A0B() {
        return false;
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("key", this.A00);
        return writableNativeMap;
    }
}
