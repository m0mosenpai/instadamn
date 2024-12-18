package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.WTl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70383WTl implements InterfaceC71890X8x {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ENX A02;
    public final /* synthetic */ SavedCollection A03;

    public C70383WTl(ENX enx, SavedCollection savedCollection, int i, int i2) {
        this.A02 = enx;
        this.A03 = savedCollection;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC71890X8x
    public final void DQz(LatLng latLng) {
        this.A02.A03(this.A03, this.A01, this.A00);
    }
}
