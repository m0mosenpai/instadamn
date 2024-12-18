package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Ust, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67622Ust extends Sb5 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final int A03;
    public final String A04;

    public C67622Ust(String str, String str2, int i, int i2, int i3, int i4) {
        super(-1, i);
        this.A03 = i2;
        this.A04 = str;
        this.A02 = str2;
        this.A01 = i3;
        this.A00 = i4;
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        int i = this.A03;
        if (i != 1) {
            if (i == 2) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("uri", this.A02);
                writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.WIDTH, this.A01);
                writableNativeMap2.putDouble(IgReactMediaPickerNativeModule.HEIGHT, this.A00);
                writableNativeMap.putMap(CacheBehaviorLogger.SOURCE, writableNativeMap2);
            }
            return writableNativeMap;
        }
        writableNativeMap.putString("error", this.A04);
        return writableNativeMap;
    }

    @Override // X.Sb5
    public final String A05() {
        int i = this.A03;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw AbstractC31175DnJ.A0U("Invalid image event: ", i);
                    }
                    return "topLoadStart";
                }
                return "topLoadEnd";
            }
            return "topLoad";
        }
        return "topError";
    }

    @Override // X.Sb5
    public final short A06() {
        return (short) this.A03;
    }
}
