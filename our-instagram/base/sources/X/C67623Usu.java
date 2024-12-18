package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Usu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67623Usu extends Sb5 {
    public static final C12550kz A09 = new C12550kz(3);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Integer A08;

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("top", 0.0d);
        writableNativeMap.putDouble("bottom", 0.0d);
        writableNativeMap.putDouble("left", 0.0d);
        writableNativeMap.putDouble("right", 0.0d);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("x", WF1.A00(this.A00));
        writableNativeMap2.putDouble("y", WF1.A00(this.A01));
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble(IgReactMediaPickerNativeModule.WIDTH, WF1.A00(this.A05));
        writableNativeMap3.putDouble(IgReactMediaPickerNativeModule.HEIGHT, WF1.A00(this.A04));
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        writableNativeMap4.putDouble(IgReactMediaPickerNativeModule.WIDTH, WF1.A00(this.A07));
        writableNativeMap4.putDouble(IgReactMediaPickerNativeModule.HEIGHT, WF1.A00(this.A06));
        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
        writableNativeMap5.putDouble("x", this.A02);
        writableNativeMap5.putDouble("y", this.A03);
        WritableNativeMap writableNativeMap6 = new WritableNativeMap();
        writableNativeMap6.putMap("contentInset", writableNativeMap);
        writableNativeMap6.putMap("contentOffset", writableNativeMap2);
        writableNativeMap6.putMap("contentSize", writableNativeMap3);
        writableNativeMap6.putMap("layoutMeasurement", writableNativeMap4);
        writableNativeMap6.putMap("velocity", writableNativeMap5);
        writableNativeMap6.putInt("target", super.A02);
        writableNativeMap6.putBoolean("responderIgnoreScroll", true);
        return writableNativeMap6;
    }

    @Override // X.Sb5
    public final String A05() {
        Integer num = this.A08;
        AbstractC05810Sj.A00(num);
        C14360o3.A07(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            return "topMomentumScrollEnd";
                        }
                        throw new RuntimeException();
                    }
                    return "topMomentumScrollBegin";
                }
                return "topScroll";
            }
            return "topScrollEndDrag";
        }
        return "topScrollBeginDrag";
    }

    @Override // X.Sb5
    public final void A07() {
        try {
            A09.EE6(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("ScrollEvent", e);
        }
    }

    @Override // X.Sb5
    public final boolean A0B() {
        return AbstractC167007dF.A1X(this.A08, C05F.A0C);
    }
}
