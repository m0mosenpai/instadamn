package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xzv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73304Xzv {
    public static int A03;
    public C5GB A00;
    public C5GB A01;
    public ArrayList A02;

    public static long A00(Y8R y8r, C73304Xzv c73304Xzv, long j) {
        C5GB c5gb = y8r.A05;
        if (c5gb instanceof C72144XPt) {
            return j;
        }
        List list = y8r.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C5GC c5gc = (C5GC) list.get(i);
            if (c5gc instanceof Y8R) {
                Y8R y8r2 = (Y8R) c5gc;
                if (y8r2.A05 != c5gb) {
                    j2 = Math.min(j2, A00(y8r2, c73304Xzv, y8r2.A00 + j));
                }
            }
        }
        if (y8r == c5gb.A03) {
            long A05 = c5gb.A05();
            long j3 = j - A05;
            return Math.min(Math.min(j2, A00(c5gb.A04, c73304Xzv, j3)), j3 - r4.A00);
        }
        return j2;
    }

    public static long A01(Y8R y8r, C73304Xzv c73304Xzv, long j) {
        C5GB c5gb = y8r.A05;
        if (c5gb instanceof C72144XPt) {
            return j;
        }
        List list = y8r.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C5GC c5gc = (C5GC) list.get(i);
            if (c5gc instanceof Y8R) {
                Y8R y8r2 = (Y8R) c5gc;
                if (y8r2.A05 != c5gb) {
                    j2 = Math.max(j2, A01(y8r2, c73304Xzv, y8r2.A00 + j));
                }
            }
        }
        if (y8r == c5gb.A04) {
            long A05 = c5gb.A05();
            long j3 = j + A05;
            return Math.max(Math.max(j2, A01(c5gb.A03, c73304Xzv, j3)), j3 - r4.A00);
        }
        return j2;
    }
}
