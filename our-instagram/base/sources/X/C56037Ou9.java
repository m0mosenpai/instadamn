package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import java.util.List;

/* renamed from: X.Ou9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56037Ou9 implements InterfaceC41501vz, InterfaceC127465pP {
    public Location A00;
    public final long A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC58040PoQ A04;
    public final C1VW A05;
    public final String A06;
    public final C47Z A07;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r8 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56037Ou9(android.content.Context r4, com.instagram.common.session.UserSession r5, X.InterfaceC58040PoQ r6, X.C1VW r7, X.C47Z r8, java.lang.String r9) {
        /*
            r3 = this;
            r0 = 7
            X.C14360o3.A0B(r9, r0)
            r3.<init>()
            r3.A02 = r4
            r3.A03 = r5
            r3.A05 = r7
            r3.A04 = r6
            r3.A07 = r8
            r3.A06 = r9
            r1 = 0
            if (r8 == 0) goto L2f
            java.util.HashMap r2 = r8.A44
            if (r2 == 0) goto L2f
            java.lang.String r0 = "date_time_original"
            java.lang.String r2 = X.AbstractC31171DnF.A0h(r0, r2)
        L20:
            X.1tc r1 = r8.A1G
        L22:
            X.1tc r0 = X.EnumC40111tc.A0Q
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            long r0 = X.S5I.A00(r2, r0)
            r3.A01 = r0
            return
        L2f:
            r2 = r1
            if (r8 == 0) goto L22
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56037Ou9.<init>(android.content.Context, com.instagram.common.session.UserSession, X.PoQ, X.1VW, X.47Z, java.lang.String):void");
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }

    public final void A00() {
        C1VW c1vw = this.A05;
        UserSession userSession = this.A03;
        Location lastLocation = c1vw.getLastLocation(userSession, "LocationSuggestionsRepository");
        if (lastLocation != null && AbstractC103794ly.A00(lastLocation)) {
            this.A00 = lastLocation;
            c1vw.removeLocationUpdates(userSession, this);
            NearbyVenuesService.A01(this.A02, lastLocation, userSession, null, Long.valueOf(this.A01));
        } else {
            c1vw.requestLocationUpdates(userSession, this, this.A06);
        }
        C73450YDt A00 = NearbyVenuesService.A00(this.A00);
        if (A00 != null) {
            this.A04.Dl4(A00.getItems(), A00.Bk6());
        }
        AbstractC25651Mw.A00(userSession).A01(this, C56017Oto.class);
    }

    public final void A01() {
        AbstractC25651Mw.A00(this.A03).A02(this, C56017Oto.class);
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        if (location != null) {
            C1VW c1vw = this.A05;
            if (c1vw.isAccurateEnough(location)) {
                this.A00 = location;
                UserSession userSession = this.A03;
                c1vw.removeLocationUpdates(userSession, this);
                NearbyVenuesService.A01(this.A02, location, userSession, null, Long.valueOf(this.A01));
            }
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-2094534475);
        C56017Oto c56017Oto = (C56017Oto) obj;
        int A0N = AbstractC167017dG.A0N(c56017Oto, 1876761096);
        A01();
        List list = c56017Oto.A02;
        if (list != null) {
            InterfaceC58040PoQ interfaceC58040PoQ = this.A04;
            interfaceC58040PoQ.D3I();
            interfaceC58040PoQ.Dl4(list, c56017Oto.A00);
        }
        C0f9.A0A(830165147, A0N);
        C0f9.A0A(891401004, A03);
    }
}
