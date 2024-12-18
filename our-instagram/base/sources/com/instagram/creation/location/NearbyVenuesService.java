package com.instagram.creation.location;

import X.AbstractC167017dG;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC55617On2;
import X.AbstractServiceC18470vY;
import X.AnonymousClass028;
import X.C00O;
import X.C0K8;
import X.C1GJ;
import X.C1ON;
import X.C51594Mqm;
import X.C56017Oto;
import X.C73450YDt;
import X.MSW;
import X.NAD;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.location.intf.LocationSignalPackage;

/* loaded from: classes9.dex */
public class NearbyVenuesService extends AbstractServiceC18470vY {
    public static Location A00;
    public static C73450YDt A01;
    public static LocationSignalPackage A02;

    public static synchronized C73450YDt A00(Location location) {
        C73450YDt c73450YDt;
        Location location2;
        synchronized (NearbyVenuesService.class) {
            if (A01 != null && (location2 = A00) != null && location != null && location.distanceTo(location2) < 20.0f) {
                c73450YDt = A01;
            } else {
                c73450YDt = null;
            }
        }
        return c73450YDt;
    }

    public static void A02(UserSession userSession, C73450YDt c73450YDt) {
        C56017Oto c56017Oto;
        if (c73450YDt != null) {
            C51594Mqm c51594Mqm = c73450YDt.A00.A00;
            if (c51594Mqm == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            c56017Oto = new C56017Oto(c51594Mqm.A01, c73450YDt.Bk6(), c73450YDt.getItems());
        } else {
            c56017Oto = new C56017Oto(null, null, null);
        }
        AbstractC25651Mw.A00(userSession).E4s(c56017Oto);
    }

    public static void A01(Context context, Location location, UserSession userSession, LocationSignalPackage locationSignalPackage, Long l) {
        String A0j = AbstractC167017dG.A0j();
        Intent A08 = MSW.A08(context, NearbyVenuesService.class);
        A08.putExtra("location", location);
        A08.putExtra("requestId", A0j);
        A08.putExtra("rankToken", A0j);
        A08.putExtra("signalPackage", locationSignalPackage);
        AbstractC31173DnH.A18(A08, userSession);
        A08.putExtra("timestamp", l);
        AnonymousClass028.enqueueWork(context, NearbyVenuesService.class, 1, A08);
    }

    @Override // X.AnonymousClass028
    public final void onHandleWork(Intent intent) {
        float f;
        C73450YDt c73450YDt;
        LocationSignalPackage locationSignalPackage;
        Bundle extras = intent.getExtras();
        extras.getClass();
        UserSession A0G = AbstractC31171DnF.A0G(extras);
        Location location = (Location) intent.getParcelableExtra("location");
        String stringExtra = intent.getStringExtra("rankToken");
        long longExtra = intent.getLongExtra("timestamp", -1L);
        LocationSignalPackage locationSignalPackage2 = (LocationSignalPackage) intent.getParcelableExtra("signalPackage");
        if (location == null) {
            C0K8.A0C("NearbyVenuesService", "Cannot query venues for null location");
            c73450YDt = null;
        } else {
            Location location2 = A00;
            float f2 = Float.MAX_VALUE;
            if (location2 != null) {
                f = location.distanceTo(location2);
            } else {
                f = Float.MAX_VALUE;
            }
            if (locationSignalPackage2 != null && locationSignalPackage2.BOK() != null && (locationSignalPackage = A02) != null && locationSignalPackage.BOK() != null) {
                f2 = locationSignalPackage2.BOK().distanceTo(A02.BOK());
            }
            if (A00 != null && f < 20.0f && (locationSignalPackage2 == null || f2 < 20.0f)) {
                c73450YDt = A01;
            } else {
                C1ON A002 = AbstractC55617On2.A00(location, A0G, locationSignalPackage2, null, stringExtra, longExtra);
                A002.A00 = new NAD(8, location, locationSignalPackage2, A0G);
                C1GJ.A02(A002);
                return;
            }
        }
        A02(A0G, c73450YDt);
    }
}
