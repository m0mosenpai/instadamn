package X;

import android.os.Handler;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.locationsharing.core.models.Location;
import java.util.HashSet;

/* renamed from: X.WWg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70453WWg implements X9C {
    public final /* synthetic */ V7T A00;

    public C70453WWg(V7T v7t) {
        this.A00 = v7t;
    }

    @Override // X.X9C
    public final void D1O(CameraPosition cameraPosition) {
        C66542ULx c66542ULx = this.A00.A02;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        LatLng latLng = cameraPosition.A03;
        double d = latLng.A00;
        double d2 = latLng.A01;
        if (((AbstractC68892Vdo) c66542ULx).A00) {
            Handler handler = c66542ULx.A00;
            Runnable runnable = c66542ULx.A07;
            handler.removeCallbacks(runnable);
            if (C66542ULx.A00(c66542ULx).A0D) {
                handler.postDelayed(runnable, 200L);
            }
            AbstractC66543ULy.A04(c66542ULx, new Location(new HashSet(), d, d2, -1, Integer.MIN_VALUE, -1L), "MAP_MOVED");
        }
    }
}
