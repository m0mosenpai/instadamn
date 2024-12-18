package X;

import android.location.Location;
import com.instagram.location.intf.LocationSignalPackage;

/* renamed from: X.P4n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56451P4n implements InterfaceC57959Pn5 {
    public final /* synthetic */ N5Z A00;

    public C56451P4n(N5Z n5z) {
        this.A00 = n5z;
    }

    @Override // X.InterfaceC57959Pn5
    public final void DQG(LocationSignalPackage locationSignalPackage) {
        Location BOK = locationSignalPackage.BOK();
        N5Z n5z = this.A00;
        if (((Location) n5z.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION")) != null && BOK != null && BOK.distanceTo(r0) > 1000.0d) {
            N5Z.A0A(n5z);
            N5Z.A08(n5z);
        } else {
            n5z.A02 = BOK;
            n5z.A0F = locationSignalPackage;
            N5Z.A05(n5z);
        }
    }
}
