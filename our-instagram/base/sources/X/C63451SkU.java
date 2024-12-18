package X;

import android.location.Geocoder;
import java.util.List;

/* renamed from: X.SkU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63451SkU implements Geocoder.GeocodeListener {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ InterfaceC65636Tpx A02;
    public final /* synthetic */ C62967SZk A03;

    @Override // android.location.Geocoder.GeocodeListener
    public final void onGeocode(List list) {
        C14360o3.A0B(list, 0);
        if (AbstractC166987dD.A1b(list)) {
            this.A02.onSuccess(C62967SZk.A00(list, this.A00, this.A01));
        }
    }

    public C63451SkU(InterfaceC65636Tpx interfaceC65636Tpx, C62967SZk c62967SZk, double d, double d2) {
        this.A02 = interfaceC65636Tpx;
        this.A03 = c62967SZk;
        this.A00 = d;
        this.A01 = d2;
    }

    @Override // android.location.Geocoder.GeocodeListener
    public final void onError(String str) {
        this.A02.onError(new Throwable(str));
    }
}
