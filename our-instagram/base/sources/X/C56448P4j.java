package X;

import android.location.Location;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.P4j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56448P4j implements InterfaceC127465pP {
    public final int A00;
    public final Object A01;

    public C56448P4j(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
        if (2 - this.A00 == 0) {
            ((InterfaceC16660sJ) this.A01).invoke(null);
        }
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        switch (this.A00) {
            case 0:
                C1VW c1vw = C1VW.A00;
                c1vw.getClass();
                if (!c1vw.isAccurateEnough(location)) {
                    return;
                }
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A01 = location;
                EditMediaInfoFragment.A05(editMediaInfoFragment);
                return;
            case 1:
                C1VW c1vw2 = C1VW.A00;
                if (c1vw2 == null || !c1vw2.isAccurateEnough(location, 600000L, 400.0f)) {
                    return;
                }
                N5Z n5z = (N5Z) this.A01;
                if (((Location) n5z.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION")) != null && location.distanceTo(r0) > 1000.0d) {
                    N5Z.A0A(n5z);
                    N5Z.A08(n5z);
                    return;
                } else {
                    n5z.A02 = location;
                    N5Z.A05(n5z);
                    return;
                }
            case 2:
                AbstractC25225BEi.A1U(this.A01, location);
                return;
            case 3:
                C14360o3.A0B(location, 0);
                NMW.A00(location, (NMW) this.A01);
                return;
            default:
                C14360o3.A0B(location, 0);
                NMX.A02(location, (NMX) this.A01);
                return;
        }
    }
}
