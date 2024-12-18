package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class MID extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C37331oW A03;
    public final /* synthetic */ InterfaceC16620sF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MID(Context context, UserSession userSession, C37331oW c37331oW, InterfaceC16620sF interfaceC16620sF, int i) {
        super(1);
        this.A04 = interfaceC16620sF;
        this.A03 = c37331oW;
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (com.instagram.friendmap.data.FriendMapRepository.A02(X.AbstractC43594JPz.A0L(r11), r2) != null) goto L19;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            android.location.Location r11 = (android.location.Location) r11
            X.0sF r4 = r10.A04
            android.content.Context r0 = r10.A01
            com.instagram.common.session.UserSession r6 = r10.A02
            int r9 = r10.A00
            android.content.res.Resources r8 = r0.getResources()
            java.lang.String r7 = X.C2TD.A03
            java.lang.String r0 = "notes_tray_friend_map_pog"
            com.facebook.android.maps.StaticMapView$StaticMapOptions r5 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r5.<init>(r0)
            r2 = 0
            if (r11 == 0) goto L8b
            double r0 = r11.getLatitude()
            double r2 = r11.getLongitude()
        L23:
            r5.A01(r0, r2)
            if (r11 == 0) goto L89
            r3 = 0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36603197356970901(0x820a6a001b1395, double:3.2113476255693146E-306)
            int r2 = X.AbstractC25225BEi.A07(r2, r6, r0)
            r1 = 12
            X.17u r0 = new X.17u
            r0.<init>(r3, r1)
            int r0 = X.C17s.A05(r0, r2)
        L3f:
            r5.A03(r0)
            boolean r0 = X.C1H6.A03()
            if (r0 == 0) goto L86
            java.lang.String r0 = "dark"
        L4a:
            r5.A09 = r0
            android.net.Uri r0 = com.instagram.maps.ui.IgStaticMapView.A00(r8, r5, r7, r9, r9)
            java.lang.String r0 = r0.toString()
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.AbstractC25225BEi.A0t(r0)
            if (r11 == 0) goto L7b
            com.instagram.friendmap.data.FriendMapRepository r2 = X.AbstractC92954Eo.A00(r6)
            X.0UO r0 = r2.A0N
            java.lang.Object r0 = r0.getValue()
            X.4Et r0 = (X.C92984Et) r0
            X.4Es r1 = r0.A04
            X.4Es r0 = X.EnumC92974Es.A0A
            if (r1 == r0) goto L7b
            X.4Es r0 = X.EnumC92974Es.A09
            if (r1 == r0) goto L7b
            com.facebook.android.maps.model.LatLng r0 = X.AbstractC43594JPz.A0L(r11)
            java.lang.String r0 = com.instagram.friendmap.data.FriendMapRepository.A02(r0, r2)
            r1 = 1
            if (r0 == 0) goto L7c
        L7b:
            r1 = 0
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.invoke(r3, r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L86:
            java.lang.String r0 = "default"
            goto L4a
        L89:
            r0 = 0
            goto L3f
        L8b:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MID.invoke(java.lang.Object):java.lang.Object");
    }
}
