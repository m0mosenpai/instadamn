package com.facebook.http.historical;

import X.C2BQ;
import X.C46262Am;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class NetworkInfoMap {
    public static final NetworkInfoMap A07 = new NetworkInfoMap();
    public C2BQ A02;
    public String A03;
    public boolean A04;
    public C46262Am A01 = null;
    public final LruCache A06 = new LruCache(20);
    public long A00 = 0;
    public boolean A05 = false;

    public NetworkInfoMap() {
        if (this.A01 != null) {
            A00(this);
        }
    }

    public final synchronized ArrayList A01() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.A06.snapshot().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((C2BQ) ((Map.Entry) it.next()).getValue()).toString());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r6) >= 120000) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A02(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = "="
            java.lang.String r2 = "-"
            java.lang.String r1 = r13.replace(r0, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "\n"
            java.lang.String r1 = r1.replace(r0, r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = ","
            java.lang.String r2 = r1.replace(r0, r2)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L6b
            java.lang.String r1 = r12.A03     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r2.equals(r1)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L6b
            if (r1 == 0) goto L32
            X.2Am r1 = r12.A01     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L32
            java.util.ArrayList r0 = r12.A01()     // Catch: java.lang.Throwable -> L6d
            r1.A00(r0)     // Catch: java.lang.Throwable -> L6d
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6d
            r12.A00 = r0     // Catch: java.lang.Throwable -> L6d
        L32:
            r12.A03 = r2     // Catch: java.lang.Throwable -> L6d
            android.util.LruCache r1 = r12.A06     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L6d
            X.2BQ r0 = (X.C2BQ) r0     // Catch: java.lang.Throwable -> L6d
            r12.A02 = r0     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L51
            java.lang.String r3 = r12.A03     // Catch: java.lang.Throwable -> L6d
            r4 = -1
            X.2BQ r2 = new X.2BQ     // Catch: java.lang.Throwable -> L6d
            r6 = r4
            r8 = r4
            r10 = r4
            r2.<init>(r3, r4, r6, r8, r10)     // Catch: java.lang.Throwable -> L6d
            r12.A02 = r2     // Catch: java.lang.Throwable -> L6d
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L6d
        L51:
            X.2BQ r0 = r12.A02     // Catch: java.lang.Throwable -> L6d
            long r6 = r0.A02     // Catch: java.lang.Throwable -> L6d
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6d
            long r4 = r4 - r6
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L69
        L68:
            r0 = 1
        L69:
            r12.A05 = r0     // Catch: java.lang.Throwable -> L6d
        L6b:
            monitor-exit(r12)
            return
        L6d:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.historical.NetworkInfoMap.A02(java.lang.String):void");
    }

    public static void A00(NetworkInfoMap networkInfoMap) {
        ArrayList arrayList;
        LruCache lruCache = networkInfoMap.A06;
        lruCache.evictAll();
        networkInfoMap.A00 = SystemClock.elapsedRealtime();
        C46262Am c46262Am = networkInfoMap.A01;
        c46262Am.getClass();
        try {
            try {
                File file = new File(c46262Am.A00, c46262Am.A01);
                if (file.exists()) {
                    arrayList = new ArrayList();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    arrayList.add(readLine);
                                }
                            } catch (IOException | NullPointerException | SecurityException unused) {
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException unused2) {
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                    } catch (IOException | NullPointerException | SecurityException unused3) {
                    }
                } else {
                    arrayList = null;
                }
            } catch (IOException | NullPointerException | SecurityException unused4) {
                arrayList = null;
            }
            boolean z = false;
            if (arrayList != null) {
                if (networkInfoMap.A04) {
                    Log.w("com.facebook.http.historical.NetworkInfoMap", String.format("Loading %d rows from storage", Integer.valueOf(arrayList.size())));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null && !str.isEmpty()) {
                        try {
                            long j = -1;
                            long j2 = -1;
                            long j3 = -1;
                            long j4 = -1;
                            String str2 = null;
                            for (String str3 : str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                                if (str3.startsWith("id=")) {
                                    str2 = str3.substring(3);
                                } else if (str3.startsWith("bw=")) {
                                    j = Long.parseLong(str3.substring(3));
                                } else if (str3.startsWith("ttfb=")) {
                                    j2 = Long.parseLong(str3.substring(5));
                                } else if (str3.startsWith("ts=")) {
                                    j3 = Long.parseLong(str3.substring(3));
                                } else if (str3.startsWith("bwt=")) {
                                    j4 = Long.parseLong(str3.substring(4));
                                }
                            }
                            if (str2 != null) {
                                C2BQ c2bq = new C2BQ(str2, j, j2, j3, j4);
                                if (networkInfoMap.A04) {
                                    Log.w("com.facebook.http.historical.NetworkInfoMap", String.format("Found record for: %s", c2bq.A04));
                                }
                                lruCache.put(c2bq.A04, c2bq);
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException | PatternSyntaxException unused5) {
                        }
                    }
                }
            }
            String str4 = networkInfoMap.A03;
            if (str4 != null) {
                C2BQ c2bq2 = (C2BQ) lruCache.get(str4);
                networkInfoMap.A02 = c2bq2;
                if (c2bq2 == null) {
                    String str5 = networkInfoMap.A03;
                    C2BQ c2bq3 = new C2BQ(str5, -1L, -1L, -1L, -1L);
                    networkInfoMap.A02 = c2bq3;
                    lruCache.put(str5, c2bq3);
                }
                long j5 = networkInfoMap.A02.A02;
                if (j5 == -1 || SystemClock.elapsedRealtime() - j5 >= 120000) {
                    z = true;
                }
                networkInfoMap.A05 = z;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
