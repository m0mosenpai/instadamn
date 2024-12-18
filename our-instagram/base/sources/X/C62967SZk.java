package X;

import android.content.Context;
import android.location.Geocoder;
import android.os.Build;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.util.List;

/* renamed from: X.SZk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62967SZk {
    public final UserSession A00;
    public final DirectShareTarget A01;
    public final Context A02;
    public final Geocoder A03;

    public static final Address A00(List list, double d, double d2) {
        String addressLine = ((android.location.Address) list.get(0)).getAddressLine(0);
        AbstractC63311ShH.A04(addressLine, "localizedAddress");
        return new Address(new Location(AbstractC166987dD.A1H(), d, d2, -1, Integer.MIN_VALUE, -1L), addressLine);
    }

    public final void A01(InterfaceC65635Tpw interfaceC65635Tpw, Address address) {
        String A08;
        DirectShareTarget directShareTarget = this.A01;
        if (directShareTarget != null && (A08 = directShareTarget.A08()) != null) {
            UserSession userSession = this.A00;
            Location location = address.A00;
            float f = (float) location.A00;
            float f2 = (float) location.A01;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0B("direct_v2/threads/broadcast/pinned_location/");
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A08);
            c25621Ms.A0C(com.facebook.location.platform.api.Location.LATITUDE, f);
            c25621Ms.A0C("longitude", f2);
            C1GJ.A03(c25621Ms.A0N());
        }
        interfaceC65635Tpw.onSuccess();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0038: INVOKE (r2 I:X.TiJ), (r0 I:java.lang.Throwable) INTERFACE call: X.TiJ.onError(java.lang.Throwable):void A[MD:(java.lang.Throwable):void (m)] (LINE:56), block:B:16:0x0038 */
    public final void A02(InterfaceC65636Tpx interfaceC65636Tpx, double d, double d2) {
        InterfaceC65338TiJ onError;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                this.A03.getFromLocation(d, d2, 1, new C63451SkU(interfaceC65636Tpx, this, d, d2));
                return;
            }
            List<android.location.Address> fromLocation = this.A03.getFromLocation(d, d2, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                interfaceC65636Tpx.onSuccess(A00(fromLocation, d, d2));
            }
        } catch (IOException e) {
            onError.onError(e);
        }
    }

    public C62967SZk(Context context, UserSession userSession, DirectShareTarget directShareTarget) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = directShareTarget;
        this.A03 = new Geocoder(context);
    }
}
