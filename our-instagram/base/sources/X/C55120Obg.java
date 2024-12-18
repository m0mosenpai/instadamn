package X;

import android.graphics.Point;
import com.instagram.common.session.UserSession;

/* renamed from: X.Obg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55120Obg {
    public static final C55120Obg A00;
    public static final String A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Obg, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = AbstractC31173DnH.A0q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36315451727744245L) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Point A00(android.graphics.Point r6, com.instagram.common.session.UserSession r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L44
            int r1 = X.C55187Ods.A01(r7)
            int r0 = r6.x
            if (r0 >= r1) goto L1a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315451727744245(0x8104b600170cf5, double:3.029376130987729E-306)
            boolean r1 = X.C18U.A06(r2, r7, r0)
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L44
            int r3 = X.C55187Ods.A01(r7)
        L21:
            int r0 = r6.y
            int r0 = r0 * r3
            float r1 = (float) r0
            int r0 = r6.x
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 + r5
            int r2 = (int) r1
            if (r9 != 0) goto L8a
            float r1 = (float) r3
            float r0 = (float) r2
            float r1 = r1 / r0
            r0 = 0
            boolean r0 = X.LHK.A02(r0, r1, r11)
            if (r0 != 0) goto L8a
            java.lang.String r1 = "Output aspect ratio error: "
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.AnonymousClass001.A0J(r1, r0, r3, r2)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L44:
            int r0 = r6.x
            r4 = 1440(0x5a0, float:2.018E-42)
            if (r0 >= r4) goto L62
            if (r8 <= r0) goto L62
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36310345010118681(0x81001100000019, double:3.026146622198221E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L62
            r3 = 1440(0x5a0, float:2.018E-42)
        L5b:
            if (r4 <= r8) goto L5e
            r3 = r8
        L5e:
            java.lang.Class<X.Ods> r2 = X.C55187Ods.class
            monitor-enter(r2)
            goto L70
        L62:
            int r3 = r6.x
            if (r3 >= r4) goto L7b
            if (r8 <= r3) goto L7b
            if (r10 == 0) goto L7b
            int r4 = X.C55187Ods.A01(r7)
            r3 = r4
            goto L5b
        L70:
            r1 = 320(0x140, float:4.48E-43)
            int r0 = X.C55187Ods.A01(r7)     // Catch: java.lang.Throwable -> L90
            int r3 = X.AbstractC38301qK.A00(r3, r1, r0)     // Catch: java.lang.Throwable -> L90
            goto L88
        L7b:
            java.lang.Class<X.Ods> r2 = X.C55187Ods.class
            monitor-enter(r2)
            r1 = 320(0x140, float:4.48E-43)
            int r0 = X.C55187Ods.A01(r7)     // Catch: java.lang.Throwable -> L90
            int r3 = X.AbstractC38301qK.A00(r3, r1, r0)     // Catch: java.lang.Throwable -> L90
        L88:
            monitor-exit(r2)
            goto L21
        L8a:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            return r0
        L90:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55120Obg.A00(android.graphics.Point, com.instagram.common.session.UserSession, int, boolean, boolean, boolean, boolean):android.graphics.Point");
    }

    public static final Point A01(Point point, UserSession userSession, boolean z) {
        int i;
        int i2;
        if (z) {
            if (point.x < C55187Ods.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36315451727744245L)) {
                i = C55187Ods.A01(userSession);
                i2 = (int) (((point.y * i) / point.x) + 0.5f);
                return new Point(i, i2);
            }
        }
        i = point.x;
        i2 = point.y;
        return new Point(i, i2);
    }
}
