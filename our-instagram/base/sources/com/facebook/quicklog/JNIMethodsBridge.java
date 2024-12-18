package com.facebook.quicklog;

import X.AnonymousClass001;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes.dex */
public class JNIMethodsBridge {
    public static void markerPoint(int i, int i2, String str, String str2, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).addPointData("__key", str2).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    public static void markerPoint(int i, int i2, String str, String[] strArr, int i3, long j, boolean z, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            int length = strArr.length;
            if (length % 3 == 0) {
                MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
                withMarker.withLevel(i3);
                PointEditor pointShouldIncludeMetadata = withMarker.pointEditor(str).pointCustomTimestamp(j).pointShouldIncludeMetadata(z);
                for (int i4 = 0; i4 < length; i4 += 3) {
                    String str2 = strArr[i4];
                    String str3 = strArr[i4 + 1];
                    String str4 = strArr[i4 + 2];
                    switch (str4.hashCode()) {
                        case 49:
                            if (!str4.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            pointShouldIncludeMetadata.addPointData(str2, str3);
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            if (!str4.equals("2")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            pointShouldIncludeMetadata.addPointData(str2, Long.parseLong(str3));
                        case 51:
                            if (!str4.equals("3")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            pointShouldIncludeMetadata.addPointData(str2, Double.parseDouble(str3));
                        case 52:
                            if (!str4.equals("4")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            pointShouldIncludeMetadata.addPointData(str2, !"0".equals(str3));
                        case 53:
                            if (!str4.equals("5")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            pointShouldIncludeMetadata.addPointData(str2, str3.split(",,,"));
                        case 54:
                            if (!str4.equals("6")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            String[] split = str3.split(",,,");
                            int length2 = split.length;
                            long[] jArr = new long[length2];
                            for (int i5 = 0; i5 < length2; i5++) {
                                jArr[i5] = Long.parseLong(split[i5]);
                            }
                            pointShouldIncludeMetadata.addPointData(str2, jArr);
                        case 55:
                            if (!str4.equals("7")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            String[] split2 = str3.split(",,,");
                            int length3 = split2.length;
                            double[] dArr = new double[length3];
                            for (int i6 = 0; i6 < length3; i6++) {
                                dArr[i6] = Double.parseDouble(split2[i6]);
                            }
                            pointShouldIncludeMetadata.addPointData(str2, dArr);
                        case 56:
                            if (!str4.equals("8")) {
                                throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                            }
                            String[] split3 = str3.split(",,,");
                            int length4 = split3.length;
                            boolean[] zArr = new boolean[length4];
                            for (int i7 = 0; i7 < length4; i7++) {
                                zArr[i7] = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(split3[i7]);
                            }
                            pointShouldIncludeMetadata.addPointData(str2, zArr);
                        default:
                            throw new IllegalArgumentException(AnonymousClass001.A0R("Type entry is not supported: ", str4));
                    }
                }
                pointShouldIncludeMetadata.pointEditingCompleted().markerEditingCompleted();
            }
        }
    }

    public static void markerPoint(int i, int i2, String str, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }
}
