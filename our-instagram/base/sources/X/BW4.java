package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public final class BW4 extends C0YY implements InterfaceC16660sJ {
    public static final BW4 A00 = new BW4();

    public BW4() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (!((Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, (C59O) ((C59Q) obj))).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return BWK.A01;
        }
        return BWI.A00;
    }
}
