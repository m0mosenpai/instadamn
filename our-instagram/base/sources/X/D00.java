package X;

import android.view.View;
import kotlin.Deprecated;

@Deprecated(message = "This only exists as we test the migration of AudioControl component to MVVM")
/* loaded from: classes5.dex */
public final class D00 implements InterfaceC31014DkD {
    public final InterfaceC31137Dmc A00;

    public D00(InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 1);
        this.A00 = interfaceC31137Dmc;
    }

    @Override // X.InterfaceC31014DkD
    public final void CJM() {
        this.A00.Cxv();
    }

    @Override // X.InterfaceC31014DkD
    public final void CK7(View view) {
        this.A00.Cos(view);
    }
}
