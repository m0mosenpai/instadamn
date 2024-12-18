package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sw3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63928Sw3 implements InterfaceC65338TiJ, InterfaceC65636Tpx {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63928Sw3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        if (1 - this.A00 != 0) {
            throw C00O.createAndThrow();
        }
        ((InterfaceC65338TiJ) this.A02).onError(th);
    }

    @Override // X.InterfaceC65636Tpx
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                InterfaceC65636Tpx interfaceC65636Tpx = (InterfaceC65636Tpx) this.A02;
                ImmutableList.Builder builder = ImmutableList.builder();
                C1LC it = ((ImmutableCollection) obj).iterator();
                while (it.hasNext()) {
                    builder.add(it.next());
                }
                interfaceC65636Tpx.onSuccess(builder.build());
                return;
            case 1:
                LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
                ((C69270Vke) this.A01).A01.FDF(new C63927Sw2(0, this, liveLocationSession), liveLocationSession);
                return;
            default:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                if (immutableCollection.isEmpty()) {
                    ((InterfaceC65635Tpw) this.A02).onSuccess();
                    return;
                }
                C62537SFo c62537SFo = (C62537SFo) this.A01;
                C7CY c7cy = c62537SFo.A02;
                Location location = c62537SFo.A01;
                InterfaceC65635Tpw interfaceC65635Tpw = (InterfaceC65635Tpw) this.A02;
                C14360o3.A0B(location, 1);
                UserSession userSession = c7cy.A00;
                if (C18U.A06(C06090Tz.A05, userSession, 36321086723728532L)) {
                    C18950wb.A01.AEp("DirectLiveLocationSendingRepository - uploading location while pdp manager is enabled", 20134884).report();
                    return;
                }
                C1LC A0I = AbstractC43592JPx.A0I(immutableCollection);
                while (A0I.hasNext()) {
                    LiveLocationSession liveLocationSession2 = (LiveLocationSession) A0I.next();
                    String str = liveLocationSession2.A04;
                    C14360o3.A07(str);
                    Long A0j = AbstractC166997dE.A0j(str);
                    if (A0j == null) {
                        interfaceC65635Tpw.onError(new Throwable(AbstractC111324zv.A00(3599)));
                    } else {
                        String str2 = liveLocationSession2.A02;
                        C14360o3.A07(str2);
                        long longValue = A0j.longValue();
                        float f = (float) location.A00;
                        float f2 = (float) location.A01;
                        long currentTimeMillis = System.currentTimeMillis();
                        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                        c25621Ms.A05();
                        c25621Ms.A0B("direct_v2/threads/broadcast/update_live_location_session/");
                        c25621Ms.A0R(RaV.class, C62811SSh.class);
                        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                        c25621Ms.A0E("live_location_session_id", longValue);
                        c25621Ms.A0C(com.facebook.location.platform.api.Location.LATITUDE, f);
                        c25621Ms.A0C("longitude", f2);
                        c25621Ms.A0E("geo_timestamp_s", TimeUnit.SECONDS.toMillis(currentTimeMillis));
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = new RaX(interfaceC65635Tpw, liveLocationSession2, userSession, c7cy);
                        C1GJ.A03(A0N);
                    }
                }
                return;
        }
    }
}
