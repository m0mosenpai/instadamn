package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.1VW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1VW {
    public static C1VW A00;

    public abstract void cancelSignalPackageRequest(UserSession userSession, InterfaceC57959Pn5 interfaceC57959Pn5);

    public abstract C1VQ getFragmentFactory();

    public abstract Location getLastLocation(UserSession userSession, long j, float f, String str);

    public abstract Location getLastLocation(UserSession userSession, long j, float f, boolean z, String str);

    public abstract Location getLastLocation(UserSession userSession, long j, String str);

    public abstract Location getLastLocation(UserSession userSession, String str);

    public abstract boolean isAccurateEnough(Location location);

    public abstract boolean isAccurateEnough(Location location, long j, float f);

    public abstract boolean isLocationValid(Location location);

    public abstract Future prefetchLocation(UserSession userSession, String str);

    public abstract void removeLocationUpdates(UserSession userSession, InterfaceC127465pP interfaceC127465pP);

    public abstract void requestLocationPermission(Activity activity, UserSession userSession, MQC mqc, boolean z, String str, VDJ vdj);

    public abstract void requestLocationSignalPackage(UserSession userSession, InterfaceC57959Pn5 interfaceC57959Pn5, String str);

    public abstract void requestLocationSignalPackage(UserSession userSession, Activity activity, InterfaceC57959Pn5 interfaceC57959Pn5, MQC mqc, String str, VDJ vdj);

    public void requestLocationUpdates(UserSession userSession, InterfaceC127465pP interfaceC127465pP, String str) {
        requestLocationUpdates(userSession, interfaceC127465pP, str, true);
    }

    public abstract void requestLocationUpdates(UserSession userSession, InterfaceC127465pP interfaceC127465pP, String str, boolean z);

    public abstract void requestLocationUpdates(UserSession userSession, Activity activity, InterfaceC127465pP interfaceC127465pP, MQC mqc, String str, boolean z, VDJ vdj);

    public abstract void setupForegroundCollection(UserSession userSession);

    public abstract void setupPlaceSignatureCollection(UserSession userSession);

    public abstract boolean shouldUseDevicePermissionKit(UserSession userSession, VDJ vdj);

    public abstract boolean shouldUseNewNativeReconsiderDialog(UserSession userSession);

    public static Location performIntegrityChecks(Location location) {
        if (location != null && location.isFromMockProvider()) {
            return null;
        }
        return location;
    }

    public static Future prefetchLocationLazy(UserSession userSession, String str) {
        C93R c93r = new C93R();
        C1GJ.A06(new C93T(c93r, userSession, str), 209, 4, false, false);
        return c93r;
    }

    public static boolean isLocationEnabled(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    public static boolean isLocationPermitted(Context context, UserSession userSession, String str) {
        String str2;
        Context applicationContext = context.getApplicationContext();
        if (userSession != null && C1ZZ.A00 != null && C18U.A06(C06090Tz.A05, userSession, 36318015823550256L)) {
            if (C1ZZ.A00 != null) {
                List singletonList = Collections.singletonList(C4I9.UNKNOWN);
                C14360o3.A07(singletonList);
                C14360o3.A0B(str, 3);
                if (FA6.A00(userSession).A00(context, C4IB.A05, str, singletonList) != C4IC.A06) {
                    return false;
                }
                return true;
            }
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        boolean A07 = AbstractC23451Ch.A07(applicationContext, "android.permission.ACCESS_FINE_LOCATION");
        if (userSession == null) {
            return A07;
        }
        C4I7 c4i7 = new C4I7(new InterfaceC11380iw() { // from class: X.4Se
            public static final String __redex_internal_original_name = "LocationPlugin$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "LocationPlugin";
            }
        }, userSession);
        Long A002 = C4I8.A00(userSession);
        if (A07) {
            str2 = "app_status_grant";
        } else {
            str2 = "app_status_deny";
        }
        List singletonList2 = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList2);
        c4i7.A00(new C9CH(C4IA.A08, C4IB.A05), A002, str2, str, null, singletonList2);
        return A07;
    }

    public static void setupLocationServices(UserSession userSession) {
        Looper.myQueue().addIdleHandler(new C60402pO(userSession));
    }

    public void requestLocationUpdates(UserSession userSession, Activity activity, InterfaceC127465pP interfaceC127465pP, MQC mqc, String str, VDJ vdj) {
        requestLocationUpdates(userSession, activity, interfaceC127465pP, mqc, str, true, vdj);
    }
}
