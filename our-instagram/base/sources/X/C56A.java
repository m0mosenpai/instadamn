package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: X.56A, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56A {
    public static final Object A00 = new Object();
    public static volatile Map A01;

    public static Pair A01() {
        String str;
        String[] strArr = C56G.A01;
        double parseDouble = Double.parseDouble(strArr[0]);
        C17280tP A002 = C17280tP.A00();
        if (((Boolean) A002.A0x.CES(A002, C17280tP.A4G[108])).booleanValue()) {
            str = String.valueOf(196);
        } else {
            str = strArr[42];
        }
        return new Pair(Double.valueOf(parseDouble), Double.valueOf(Double.parseDouble(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r4.A01 >= 8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A02(android.content.Context r5, X.AnonymousClass569 r6) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "faceTracker"
            r3.add(r0)
            X.0ll r4 = r6.A00
            boolean r0 = X.C56B.A01(r4)
            if (r0 == 0) goto L17
            java.lang.String r0 = "segmentation"
            r3.add(r0)
        L17:
            java.lang.String r0 = "hairSegmentation"
            r3.add(r0)
            int r1 = X.C56B.A00(r4)
            r0 = 15
            if (r1 > r0) goto L2e
            android.content.Context r0 = X.AbstractC12290kX.A00
            int r1 = X.C04100Kb.A00(r0)
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 < r0) goto L33
        L2e:
            java.lang.String r0 = "worldTracker"
            r3.add(r0)
        L33:
            boolean r0 = X.C56C.A00(r5)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "realScaleEstimation"
            r3.add(r0)
        L3e:
            boolean r0 = X.C56C.A00(r5)
            if (r0 == 0) goto L56
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314017207159159(0x81036800000977, double:3.02846893439337E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = "sceneDepth"
            r3.add(r0)
        L56:
            boolean r0 = X.C56C.A00(r5)
            if (r0 == 0) goto L61
            java.lang.String r0 = "geoanchor"
            r3.add(r0)
        L61:
            boolean r0 = X.C56C.A00(r5)
            if (r0 == 0) goto L79
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314622797548275(0x8103f500000af3, double:3.028851912193964E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L79
            java.lang.String r0 = "multiplane"
            r3.add(r0)
        L79:
            boolean r0 = X.C56C.A00(r5)
            if (r0 == 0) goto L84
            java.lang.String r0 = "worldTracking"
            r3.add(r0)
        L84:
            java.lang.String r0 = "bodyTracking"
            r3.add(r0)
            java.lang.String r0 = "bodyTracking3D"
            r3.add(r0)
            boolean r0 = A04(r5)
            if (r0 == 0) goto L99
            java.lang.String r0 = "deviceMotion"
            r3.add(r0)
        L99:
            X.56E r4 = X.C56E.A06
            r2 = 1
            X.C56E.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto La8
            java.lang.String r0 = "halfFloatRenderPass"
            r3.add(r0)
        La8:
            X.C56E.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "depthShaderRead"
            r3.add(r0)
        Lb4:
            X.C56E.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "multipleRenderTargets"
            r3.add(r0)
        Lc0:
            X.56E r0 = X.C56E.A05
            X.C56E.A00(r0, r2)
            int r0 = r0.A01
            r1 = 8
            if (r0 >= r1) goto Ld2
            X.C56E.A00(r4, r2)
            int r0 = r4.A01
            if (r0 < r1) goto Ld7
        Ld2:
            java.lang.String r0 = "vertexTextureFetch"
            r3.add(r0)
        Ld7:
            boolean r0 = X.AnonymousClass566.A05()
            if (r0 == 0) goto Le2
            java.lang.String r0 = "renderSettingsHigh"
            r3.add(r0)
        Le2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56A.A02(android.content.Context, X.569):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r4.equals(r8.get("pvr_compression")) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map A03(android.content.Context r6, X.AnonymousClass569 r7, java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56A.A03(android.content.Context, X.569, java.util.Map):java.util.Map");
    }

    public static boolean A04(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager == null) {
            return false;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(11);
        List<Sensor> sensorList2 = sensorManager.getSensorList(15);
        List<Sensor> sensorList3 = sensorManager.getSensorList(20);
        if (sensorList.isEmpty() && sensorList2.isEmpty() && sensorList3.isEmpty()) {
            return false;
        }
        return true;
    }

    public static Pair A00() {
        return new Pair(Double.valueOf(189.0d), Double.valueOf(191.0d));
    }
}
