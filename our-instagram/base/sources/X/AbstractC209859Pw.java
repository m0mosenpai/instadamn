package X;

import com.facebook.location.platform.api.Location;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.9Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209859Pw {
    public static final String[] A00 = {Location.LATITUDE, "longitude"};

    public static double A00(String str) {
        String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 3);
        String[] split2 = split[0].split("/", 2);
        double parseDouble = Double.parseDouble(split2[0]);
        boolean z = false;
        if (parseDouble < 0.0d) {
            z = true;
            parseDouble = -parseDouble;
        }
        double parseDouble2 = parseDouble / Double.parseDouble(split2[1]);
        String[] split3 = split[1].split("/", 2);
        double parseDouble3 = Double.parseDouble(split3[0]) / Double.parseDouble(split3[1]);
        String[] split4 = split[2].split("/", 2);
        double parseDouble4 = parseDouble2 + (parseDouble3 / 60.0d) + ((Double.parseDouble(split4[0]) / Double.parseDouble(split4[1])) / 3600.0d);
        if (z) {
            return -parseDouble4;
        }
        return parseDouble4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.location.Location A01(android.content.Context r10, android.net.Uri r11, java.lang.String r12) {
        /*
            java.lang.String r2 = "ExifLocationUtil"
            r7 = r11
            android.content.ContentProviderClient r6 = X.AbstractC15910ql.A00(r10, r11)
            r11 = 0
            if (r6 == 0) goto L72
            java.lang.String[] r8 = X.AbstractC209859Pw.A00     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4d java.lang.SecurityException -> L55
            java.lang.String r9 = "_data=?"
            java.lang.String[] r10 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4d java.lang.SecurityException -> L55
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4b android.os.RemoteException -> L4d java.lang.SecurityException -> L55
            if (r5 == 0) goto L5e
            boolean r0 = r5.moveToFirst()     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            if (r0 == 0) goto L5e
            int r1 = r5.getColumnCount()     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            r0 = 2
            if (r1 != r0) goto L5e
            java.lang.String r0 = "latitude"
            int r1 = r5.getColumnIndex(r0)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            java.lang.String r0 = "longitude"
            int r4 = r5.getColumnIndex(r0)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            java.lang.String r0 = "mediastore"
            android.location.Location r3 = new android.location.Location     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            double r0 = r5.getDouble(r1)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            r3.setLatitude(r0)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            double r0 = r5.getDouble(r4)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            r3.setLongitude(r0)     // Catch: android.os.RemoteException -> L47 java.lang.SecurityException -> L49 java.lang.Throwable -> L67
            goto L5d
        L47:
            r1 = move-exception
            goto L4f
        L49:
            r1 = move-exception
            goto L57
        L4b:
            r0 = move-exception
            goto L69
        L4d:
            r1 = move-exception
            r5 = r11
        L4f:
            java.lang.String r0 = "getVideoLocation failed with RemoteException"
            X.AbstractC12120kG.A07(r2, r0, r1)     // Catch: java.lang.Throwable -> L67
            goto L5e
        L55:
            r1 = move-exception
            r5 = r11
        L57:
            java.lang.String r0 = "getVideoLocation failed with SecurityException"
            X.AbstractC12120kG.A07(r2, r0, r1)     // Catch: java.lang.Throwable -> L67
            goto L5e
        L5d:
            r11 = r3
        L5e:
            r6.release()
            if (r5 == 0) goto L72
            r5.close()
            return r11
        L67:
            r0 = move-exception
            r11 = r5
        L69:
            r6.release()
            if (r11 == 0) goto L71
            r11.close()
        L71:
            throw r0
        L72:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209859Pw.A01(android.content.Context, android.net.Uri, java.lang.String):android.location.Location");
    }

    public static void A03(android.location.Location location, String str) {
        String str2;
        String str3;
        try {
            C60782q2 c60782q2 = new C60782q2(str);
            c60782q2.A0P("GPSLatitude", A02(location.getLatitude()));
            c60782q2.A0P("GPSLongitude", A02(location.getLongitude()));
            if (location.getLatitude() < 0.0d) {
                str2 = "S";
            } else {
                str2 = "N";
            }
            c60782q2.A0P("GPSLatitudeRef", str2);
            if (location.getLongitude() < 0.0d) {
                str3 = "W";
            } else {
                str3 = "E";
            }
            c60782q2.A0P("GPSLongitudeRef", str3);
            c60782q2.A0O();
        } catch (IOException e) {
            AbstractC12120kG.A07("Exif Writing Error", "IO Exeption while trying to write exifInterface for photo's location", e);
        }
    }

    public static double[] A04(C60782q2 c60782q2) {
        double A002;
        double A003;
        String A0N = c60782q2.A0N("GPSLatitude");
        String A0N2 = c60782q2.A0N("GPSLatitudeRef");
        String A0N3 = c60782q2.A0N("GPSLongitude");
        String A0N4 = c60782q2.A0N("GPSLongitudeRef");
        if (A0N != null && A0N2 != null && A0N3 != null && A0N4 != null) {
            try {
                double[] dArr = new double[2];
                if (A0N2.equals("N")) {
                    A002 = A00(A0N);
                } else {
                    A002 = A00(A0N);
                    if (A002 > 0.0d) {
                        A002 = -A002;
                    }
                }
                dArr[0] = A002;
                if (A0N4.equals("E")) {
                    A003 = A00(A0N3);
                } else {
                    A003 = A00(A0N3);
                    if (A003 > 0.0d) {
                        A003 = -A003;
                    }
                }
                dArr[1] = A003;
                return dArr;
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public static String A02(double d) {
        double abs = Math.abs(d);
        int floor = (int) Math.floor(abs);
        double d2 = abs - floor;
        int floor2 = (int) Math.floor(d2 * 60.0d);
        return String.format(Locale.US, "%d/1,%d/1,%d/1", Integer.valueOf(floor), Integer.valueOf(floor2), Integer.valueOf((int) Math.floor((d2 - (floor2 / 60.0d)) * 3600.0d)));
    }
}
