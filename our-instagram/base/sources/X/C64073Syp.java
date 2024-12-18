package X;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderImpl;
import com.facebook.native_bridge.NativeDataPromise;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Syp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64073Syp implements InterfaceC65486Tl6 {
    public final int A00;
    public final Object A01;

    public C64073Syp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65486Tl6
    public final void DE7(C58601PyU c58601PyU) {
        switch (this.A00) {
            case 0:
                AbstractC63183Sei abstractC63183Sei = (AbstractC63183Sei) this.A01;
                C0K8.A05(QFG.class, "Failed to request location updates", c58601PyU);
                abstractC63183Sei.A01();
                return;
            case 1:
                return;
            default:
                C0K8.A0F("InstagramDirectLocationManager", "Location error: %s", c58601PyU);
                if (((SXJ) this.A01).A00 != null) {
                    c58601PyU.getMessage();
                    Integer num = c58601PyU.A00;
                    C14360o3.A06(num);
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
                        throw B4Z.A00();
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC65486Tl6
    public final void DQA(C103804lz c103804lz) {
        switch (this.A00) {
            case 0:
                try {
                    AbstractC63183Sei abstractC63183Sei = (AbstractC63183Sei) this.A01;
                    LocationDataProviderImpl locationDataProviderImpl = abstractC63183Sei.A00;
                    if (locationDataProviderImpl != null) {
                        locationDataProviderImpl.onLocationDataUpdated(AbstractC63183Sei.A00(abstractC63183Sei, c103804lz));
                    }
                    if (abstractC63183Sei.A04 == null) {
                        Geocoder geocoder = abstractC63183Sei.A08;
                        Location location = c103804lz.A00;
                        List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (!fromLocation.isEmpty()) {
                            String locality = ((Address) AbstractC166987dD.A16(fromLocation)).getLocality();
                            abstractC63183Sei.A04 = locality;
                            NativeDataPromise nativeDataPromise = abstractC63183Sei.A03;
                            if (nativeDataPromise != null && !abstractC63183Sei.A05) {
                                nativeDataPromise.setValue(locality);
                                abstractC63183Sei.A05 = true;
                            }
                        }
                    }
                    if (abstractC63183Sei.A00 == null) {
                        abstractC63183Sei.A01();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    C0K8.A05(QFG.class, "Error while handling location changed", e);
                    return;
                }
            case 1:
                TFA tfa = (TFA) this.A01;
                Location location2 = new Location(c103804lz.A00);
                tfa.A00 = location2;
                Iterator it = tfa.A05.iterator();
                while (it.hasNext()) {
                    ((C70684Wf5) it.next()).A06(location2);
                }
                return;
            default:
                SXJ sxj = (SXJ) this.A01;
                List A0a = AbstractC001800i.A0a(sxj.A01);
                String str = sxj.A07;
                String str2 = sxj.A08;
                Context context = sxj.A02;
                UserSession userSession = sxj.A06;
                C62570SGv c62570SGv = new C62570SGv(c103804lz, sxj, A0a);
                C14360o3.A0B(str, 3);
                C14360o3.A0B(str2, 4);
                C202098wp c202098wp = new C202098wp(null, c103804lz, null, null, null, null, null, null, null, null, null, null, null, AnonymousClass001.A0R("InstagramDirectLocationManager", ":LocationUploadNetworkApi"), null, null, null, null, null, null, null, null);
                try {
                    if (AbstractC15820qc.A0E(context)) {
                        Integer num = C05F.A00;
                        C127625pm A00 = C127625pm.A00(null, num, str, str2, AbstractC166987dD.A1J(c202098wp), A0a);
                        if (A00 != null) {
                            C907542o c907542o = new C907542o(userSession);
                            c907542o.A09(A00);
                            C1ON A07 = c907542o.A07(num);
                            A07.A00 = new C60902RbH(c62570SGv, 4);
                            C1GJ.A06(A07, 1698122764, 2, true, false);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    e2.getMessage();
                    return;
                }
        }
    }
}
