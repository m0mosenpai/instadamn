package X;

import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.google.common.collect.ImmutableList;
import com.instagram.model.venue.Venue;
import java.util.HashSet;

/* renamed from: X.Wfp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70724Wfp implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70724Wfp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1076038085);
            C70712Wfb c70712Wfb = (C70712Wfb) obj;
            int A0N = AbstractC167017dG.A0N(c70712Wfb, -538548646);
            switch (c70712Wfb.A01.intValue()) {
                case 0:
                case 1:
                case 6:
                    C3A9 c3a9 = ((C69229Vjx) this.A02).A03;
                    if (c3a9 != null) {
                        c3a9.A01();
                        break;
                    }
                    break;
                case 2:
                    ((AbstractC60592pi) this.A01).onPause();
                    break;
                case 3:
                    ((AbstractC60592pi) this.A01).onResume();
                    break;
                case 4:
                    C69229Vjx c69229Vjx = (C69229Vjx) this.A02;
                    c69229Vjx.A01.A02(c69229Vjx.A00, C70712Wfb.class);
                    c69229Vjx.A02.onDestroy();
                    break;
            }
            C0f9.A0A(52401853, A0N);
            i = 1861763590;
        } else {
            A03 = C0f9.A03(1290687605);
            C55985OtI c55985OtI = (C55985OtI) obj;
            int A0N2 = AbstractC167017dG.A0N(c55985OtI, 1737693470);
            Venue venue = c55985OtI.A00;
            C66542ULx c66542ULx = (C66542ULx) this.A01;
            Double A00 = venue.A00();
            if (A00 != null) {
                double doubleValue = A00.doubleValue();
                Double A01 = venue.A01();
                if (A01 != null) {
                    double doubleValue2 = A01.doubleValue();
                    String address = venue.A00.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    c66542ULx.A0C(ImmutableList.of((Object) new PointOfInterest(new Location(new HashSet(), doubleValue, doubleValue2, -1, Integer.MIN_VALUE, -1L), address, venue.A02(), venue.A00.getShortName(), venue.A00.getName())));
                }
            }
            C0f9.A0A(1856662427, A0N2);
            i = 1647181657;
        }
        C0f9.A0A(i, A03);
    }
}
