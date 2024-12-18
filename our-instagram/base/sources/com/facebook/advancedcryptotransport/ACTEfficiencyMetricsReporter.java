package com.facebook.advancedcryptotransport;

import X.C02910Bp;
import X.C06800Xw;

/* loaded from: classes3.dex */
public class ACTEfficiencyMetricsReporter {
    public static void addBytesReadCount(int i) {
        C02910Bp c02910Bp = C02910Bp.A01;
        long j = i;
        synchronized (c02910Bp) {
            C06800Xw c06800Xw = c02910Bp.A00;
            c06800Xw.A07 += j;
            c06800Xw.A08++;
            long now = C02910Bp.A03.now();
            C02910Bp.A02.A00(now - 5, now);
        }
    }

    public static void addBytesWrittenCount(int i) {
        C02910Bp c02910Bp = C02910Bp.A01;
        long j = i;
        synchronized (c02910Bp) {
            C06800Xw c06800Xw = c02910Bp.A00;
            c06800Xw.A09 += j;
            c06800Xw.A0A++;
            long now = C02910Bp.A03.now();
            C02910Bp.A02.A00(now - 5, now);
        }
    }
}
