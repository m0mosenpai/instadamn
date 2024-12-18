package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;

/* renamed from: X.WWh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70454WWh implements X9C {
    public final /* synthetic */ C69800Vvm A00;

    public C70454WWh(C69800Vvm c69800Vvm) {
        this.A00 = c69800Vvm;
    }

    @Override // X.X9C
    public final void D1O(CameraPosition cameraPosition) {
        C69800Vvm c69800Vvm = this.A00;
        InterfaceC71980XDp interfaceC71980XDp = c69800Vvm.A03;
        LatLng latLng = cameraPosition.A03;
        interfaceC71980XDp.DZl(c69800Vvm, new C69021Vfx(latLng.A00, latLng.A01, cameraPosition.A02));
    }
}
