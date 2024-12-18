package X;

import com.facebook.android.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.WWj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70456WWj implements X9D {
    public final /* synthetic */ V7S A00;

    public C70456WWj(V7S v7s) {
        this.A00 = v7s;
    }

    @Override // X.X9D
    public final void DQz(LatLng latLng) {
        V7S v7s = this.A00;
        BottomSheetBehavior bottomSheetBehavior = v7s.A03;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.A0G != 5) {
                bottomSheetBehavior.A0W(5);
            } else {
                return;
            }
        }
        BottomSheetBehavior bottomSheetBehavior2 = v7s.A02;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0W(4);
        }
    }
}
