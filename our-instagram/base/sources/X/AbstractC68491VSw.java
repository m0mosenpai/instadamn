package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;

/* renamed from: X.VSw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68491VSw {
    public static void A00(FragmentActivity fragmentActivity, C53S c53s, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Venue venue, String str, String str2, double[] dArr, boolean z) {
        if (C18U.A06(C06090Tz.A05, userSession, 36312342170108975L)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MediaMapPin(null, null, EnumC68146VDo.A04, venue, venue.A00(), venue.A01(), null, 0L));
            String A0n = AbstractC166997dE.A0n();
            W6l.A01(null, fragmentActivity, userSession, MapEntryPoint.A0C, VEZ.A04, A0n, venue.A05(), str2, arrayList, dArr);
            if (z) {
                fragmentActivity.finish();
                return;
            }
            return;
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        if (str != null) {
            A0P.A0B = str;
        }
        C1VW c1vw = C1VW.A00;
        c1vw.getClass();
        A0P.A0E(c1vw.getFragmentFactory().CsU(venue.A05()));
        if (interfaceC11380iw != null) {
            A0P.A09 = interfaceC11380iw;
        }
        if (c53s != null) {
            A0P.A07 = c53s;
        }
        A0P.A04();
    }
}
