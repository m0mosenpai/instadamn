package com.facebook.react.modules.location;

import X.AbstractC58321PtD;
import X.C02G;
import X.C0fS;
import X.C62792SRm;
import X.C63452SkV;
import X.InterfaceC65657Tqj;
import X.MSY;
import X.R3M;
import android.app.ActivityManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.facebook.fbreact.specs.NativeLocationObserverSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeLocationObserverSpec.NAME)
/* loaded from: classes10.dex */
public class LocationModule extends NativeLocationObserverSpec {
    public static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    public final LocationListener mLocationListener;
    public String mWatchedProvider;

    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    public void requestAuthorization() {
    }

    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    public void setConfiguration(ReadableMap readableMap) {
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = "network";
        if (z) {
            str = "gps";
        }
        if (!locationManager.isProviderEnabled(str)) {
            String str2 = str.equals("gps") ? "network" : "gps";
            if (locationManager.isProviderEnabled(str2)) {
                str = str2;
            }
            return null;
        }
        int A00 = C02G.A00(AbstractC58321PtD.A0b(this), "android.permission.ACCESS_FINE_LOCATION");
        if (str.equals("gps") && A00 != 0) {
            return null;
        }
        return str;
    }

    public static boolean isAppInBackground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return MSY.A1S(runningAppProcessInfo.importance, 100);
    }

    public static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r8.getBoolean("enableHighAccuracy") == false) goto L14;
     */
    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startObserving(com.facebook.react.bridge.ReadableMap r8) {
        /*
            r7 = this;
            java.lang.String r1 = r7.mWatchedProvider
            java.lang.String r0 = "gps"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8e
            java.lang.String r1 = "timeout"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L16
            r8.getDouble(r1)
        L16:
            java.lang.String r1 = "maximumAge"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L21
            r8.getDouble(r1)
        L21:
            java.lang.String r1 = "enableHighAccuracy"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L30
            boolean r0 = r8.getBoolean(r1)
            r2 = 1
            if (r0 != 0) goto L31
        L30:
            r2 = 0
        L31:
            java.lang.String r1 = "distanceFilter"
            boolean r0 = r8.hasKey(r1)
            if (r0 == 0) goto L3f
            double r0 = r8.getDouble(r1)
            float r3 = (float) r0
            goto L41
        L3f:
            r3 = 1120403456(0x42c80000, float:100.0)
        L41:
            X.R3M r0 = X.AbstractC58321PtD.A0b(r7)     // Catch: java.lang.SecurityException -> L85
            java.lang.String r1 = "location"
            android.content.Context r0 = r0.getBaseContext()     // Catch: java.lang.SecurityException -> L85
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.SecurityException -> L85
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch: java.lang.SecurityException -> L85
            java.lang.String r2 = r7.getValidProvider(r1, r2)     // Catch: java.lang.SecurityException -> L85
            if (r2 != 0) goto L5e
            r1 = 2
            java.lang.String r0 = "No location provider available."
            r7.emitError(r1, r0)     // Catch: java.lang.SecurityException -> L85
            return
        L5e:
            java.lang.String r0 = r7.mWatchedProvider     // Catch: java.lang.SecurityException -> L85
            boolean r0 = r2.equals(r0)     // Catch: java.lang.SecurityException -> L85
            if (r0 != 0) goto L82
            android.location.LocationListener r0 = r7.mLocationListener     // Catch: java.lang.SecurityException -> L85
            X.C0fS.A01(r0, r1)     // Catch: java.lang.SecurityException -> L85
            boolean r0 = isAppInBackground()     // Catch: java.lang.SecurityException -> L85
            if (r0 == 0) goto L78
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            r7.emitError(r1, r0)     // Catch: java.lang.SecurityException -> L85
            return
        L78:
            r5 = 1000(0x3e8, double:4.94E-321)
            android.location.LocationListener r0 = r7.mLocationListener     // Catch: java.lang.SecurityException -> L85
            r4 = 1234182653(0x499021fd, float:1180735.6)
            X.C0fS.A02(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.SecurityException -> L85
        L82:
            r7.mWatchedProvider = r2     // Catch: java.lang.SecurityException -> L85
            return
        L85:
            r0 = move-exception
            throwLocationPermissionMissing(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.location.LocationModule.startObserving(com.facebook.react.bridge.ReadableMap):void");
    }

    public LocationModule(R3M r3m) {
        super(r3m);
        this.mLocationListener = new C63452SkV(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitError(int i, String str) {
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("geolocationError", C62792SRm.A00(str, i));
        }
    }

    public static InterfaceC65657Tqj locationToMap(Location location) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
        A0c2.putDouble(com.facebook.location.platform.api.Location.LATITUDE, location.getLatitude());
        A0c2.putDouble("longitude", location.getLongitude());
        A0c2.putDouble(com.facebook.location.platform.api.Location.ALTITUDE, location.getAltitude());
        A0c2.putDouble(com.facebook.location.platform.api.Location.ACCURACY, location.getAccuracy());
        A0c2.putDouble("heading", location.getBearing());
        A0c2.putDouble(com.facebook.location.platform.api.Location.SPEED, location.getSpeed());
        A0c.putMap("coords", A0c2);
        A0c.putDouble("timestamp", location.getTime());
        A0c.putBoolean("mocked", location.isFromMockProvider());
        return A0c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r15.getBoolean("enableHighAccuracy") == false) goto L12;
     */
    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getCurrentPosition(com.facebook.react.bridge.ReadableMap r15, com.facebook.react.bridge.Callback r16, com.facebook.react.bridge.Callback r17) {
        /*
            r14 = this;
            java.lang.String r1 = "timeout"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L39
            double r0 = r15.getDouble(r1)
            long r11 = (long) r0
        Le:
            java.lang.String r1 = "maximumAge"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L36
            double r5 = r15.getDouble(r1)
        L1a:
            java.lang.String r1 = "enableHighAccuracy"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L29
            boolean r0 = r15.getBoolean(r1)
            r2 = 1
            if (r0 != 0) goto L2a
        L29:
            r2 = 0
        L2a:
            java.lang.String r1 = "distanceFilter"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L3f
            r15.getDouble(r1)
            goto L3f
        L36:
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L1a
        L39:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Le
        L3f:
            X.R3M r0 = X.AbstractC58321PtD.A0b(r14)     // Catch: java.lang.SecurityException -> Ld3
            java.lang.String r1 = "location"
            android.content.Context r0 = r0.getBaseContext()     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Object r7 = r0.getSystemService(r1)     // Catch: java.lang.SecurityException -> Ld3
            android.location.LocationManager r7 = (android.location.LocationManager) r7     // Catch: java.lang.SecurityException -> Ld3
            java.lang.String r10 = r14.getValidProvider(r7, r2)     // Catch: java.lang.SecurityException -> Ld3
            r9 = r17
            if (r10 != 0) goto L66
            r1 = 2
            java.lang.String r0 = "No location provider available."
            com.facebook.react.bridge.WritableNativeMap r0 = X.C62792SRm.A00(r0, r1)     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.SecurityException -> Ld3
        L62:
            r9.invoke(r0)     // Catch: java.lang.SecurityException -> Ld3
            goto L78
        L66:
            boolean r0 = isAppInBackground()     // Catch: java.lang.SecurityException -> Ld3
            if (r0 == 0) goto L79
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            com.facebook.react.bridge.WritableNativeMap r0 = X.C62792SRm.A00(r0, r1)     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.SecurityException -> Ld3
            goto L62
        L78:
            return
        L79:
            android.location.Location r4 = X.C0fS.A00(r7, r10)     // Catch: java.lang.SecurityException -> Ld3
            r8 = r16
            if (r4 == 0) goto L9b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.SecurityException -> Ld3
            long r2 = r4.getTime()     // Catch: java.lang.SecurityException -> Ld3
            long r0 = r0 - r2
            double r2 = (double) r0     // Catch: java.lang.SecurityException -> Ld3
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L9b
            X.Tqj r0 = locationToMap(r4)     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.SecurityException -> Ld3
            r8.invoke(r0)     // Catch: java.lang.SecurityException -> Ld3
            return
        L9b:
            X.SJI r6 = new X.SJI     // Catch: java.lang.SecurityException -> Ld3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.SecurityException -> Ld3
            boolean r0 = isAppInBackground()     // Catch: java.lang.SecurityException -> Ld3
            if (r0 == 0) goto Lb7
            com.facebook.react.bridge.Callback r2 = r6.A06     // Catch: java.lang.SecurityException -> Ld3
            r1 = 2
            java.lang.String r0 = "Cannot retrieve position while app is backgrounded."
            com.facebook.react.bridge.WritableNativeMap r0 = X.C62792SRm.A00(r0, r1)     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.SecurityException -> Ld3
            r2.invoke(r0)     // Catch: java.lang.SecurityException -> Ld3
            return
        Lb7:
            r6.A00 = r4     // Catch: java.lang.SecurityException -> Ld3
            android.location.LocationManager r8 = r6.A04     // Catch: java.lang.SecurityException -> Ld3
            java.lang.String r9 = r6.A09     // Catch: java.lang.SecurityException -> Ld3
            r12 = 100
            r10 = 1065353216(0x3f800000, float:1.0)
            android.location.LocationListener r7 = r6.A03     // Catch: java.lang.SecurityException -> Ld3
            r11 = 1714405069(0x662fbecd, float:2.0748345E23)
            X.C0fS.A02(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.SecurityException -> Ld3
            android.os.Handler r3 = r6.A05     // Catch: java.lang.SecurityException -> Ld3
            java.lang.Runnable r2 = r6.A08     // Catch: java.lang.SecurityException -> Ld3
            long r0 = r6.A02     // Catch: java.lang.SecurityException -> Ld3
            r3.postDelayed(r2, r0)     // Catch: java.lang.SecurityException -> Ld3
            return
        Ld3:
            r0 = move-exception
            throwLocationPermissionMissing(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.location.LocationModule.getCurrentPosition(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Callback, com.facebook.react.bridge.Callback):void");
    }

    @Override // com.facebook.fbreact.specs.NativeLocationObserverSpec
    public void stopObserving() {
        C0fS.A01(this.mLocationListener, (LocationManager) AbstractC58321PtD.A0b(this).getBaseContext().getSystemService("location"));
        this.mWatchedProvider = null;
    }
}
