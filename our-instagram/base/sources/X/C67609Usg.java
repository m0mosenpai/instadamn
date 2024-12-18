package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Usg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67609Usg extends Sb5 {
    public float A00;
    public float A01;

    @Override // X.Sb5
    public final String A05() {
        return AbstractC58317Pt9.A00(377);
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.WIDTH, this.A01);
        writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.HEIGHT, this.A00);
        writableNativeMap.putMap("contentSize", writableNativeMap2);
        writableNativeMap.putInt("target", this.A02);
        return writableNativeMap;
    }
}
