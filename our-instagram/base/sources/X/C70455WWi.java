package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;

/* renamed from: X.WWi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70455WWi implements X9C {
    public final /* synthetic */ C70394WTw A00;
    public final /* synthetic */ C69800Vvm A01;

    public C70455WWi(C70394WTw c70394WTw, C69800Vvm c69800Vvm) {
        this.A01 = c69800Vvm;
        this.A00 = c70394WTw;
    }

    @Override // X.X9C
    public final void D1O(CameraPosition cameraPosition) {
        C69800Vvm c69800Vvm = this.A01;
        C69020Vfw A01 = c69800Vvm.A01();
        if (A01 != null) {
            LatLng latLng = new LatLng(A01.A00, A01.A01);
            InterfaceC71980XDp interfaceC71980XDp = c69800Vvm.A03;
            boolean z = false;
            if (this.A00.A0I.A0W) {
                z = true;
            }
            interfaceC71980XDp.D1Y(latLng, !z);
        }
    }
}
