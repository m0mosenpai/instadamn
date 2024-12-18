package X;

import android.graphics.Paint;
import android.os.Build;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.7fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168157fA {
    public static final C148336m3 A01(String str) {
        C14360o3.A0B(str, 0);
        return new C148336m3(str, -1);
    }

    public static final boolean A03(String str) {
        C14360o3.A0B(str, 0);
        if (AbstractC13670mt.A0D(str) && new Paint().hasGlyph(str)) {
            return true;
        }
        return false;
    }

    public final SimpleImageUrl A04(String str) {
        C14360o3.A0B(str, 0);
        return A00(A02(str), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C148336m3 A05(com.instagram.common.session.UserSession r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            if (r5 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L22
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144857843(0x810618000312f3, double:3.030337648892597E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L41
            X.ALx r0 = X.ALx.A00
            X.6m3 r0 = r0.A02(r5)
            return r0
        L22:
            r0 = 32
            if (r1 >= r0) goto L41
            r0 = 31
            if (r1 >= r0) goto L53
            r0 = 30
            if (r1 >= r0) goto L65
            r0 = 29
            if (r1 >= r0) goto L77
            X.0do r0 = X.AbstractC168197fE.A00
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r5)
            X.6m3 r0 = (X.C148336m3) r0
            return r0
        L41:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144792306(0x810618000212f2, double:3.030337648851151E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L53
            X.6m3 r0 = X.AK0.A00(r5)
            return r0
        L53:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144726769(0x810618000112f1, double:3.030337648809705E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L65
            X.6m3 r0 = X.AJz.A00(r5)
            return r0
        L65:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144661232(0x810618000012f0, double:3.030337648768259E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L77
            X.6m3 r0 = X.AJy.A00(r5)
            return r0
        L77:
            X.6m3 r0 = X.C168167fB.A00(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168157fA.A05(com.instagram.common.session.UserSession, java.lang.String):X.6m3");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A06(com.instagram.common.session.UserSession r9) {
        /*
            r8 = this;
            r3 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L6e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144857843(0x810618000312f3, double:3.030337648892597E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto L81
            X.BA4 r7 = X.BA4.A00
        L16:
            X.0sJ r7 = (X.InterfaceC16660sJ) r7
            X.C14360o3.A0B(r7, r3)
            X.0do r0 = X.C63324ShY.A01
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L32:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r5.next()
            X.L0O r0 = (X.L0O) r0
            X.Rgk r4 = r0.A00
            java.util.List r0 = r0.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L4b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r7.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4b
            r3.add(r1)
            goto L4b
        L65:
            X.L0O r0 = new X.L0O
            r0.<init>(r4, r3)
            r6.add(r0)
            goto L32
        L6e:
            r0 = 32
            if (r1 >= r0) goto L81
            r0 = 31
            if (r1 >= r0) goto L91
            r0 = 30
            if (r1 >= r0) goto La2
            r0 = 29
            if (r1 >= r0) goto Lb3
            X.BA9 r7 = X.BA9.A00
            goto L16
        L81:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144792306(0x810618000212f2, double:3.030337648851151E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto L91
            X.BA5 r7 = X.BA5.A00
            goto L16
        L91:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144726769(0x810618000112f1, double:3.030337648809705E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto La2
            X.BA6 r7 = X.BA6.A00
            goto L16
        La2:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144661232(0x810618000012f0, double:3.030337648768259E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto Lb3
            X.BA7 r7 = X.BA7.A00
            goto L16
        Lb3:
            X.BA8 r7 = X.BA8.A00
            goto L16
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168157fA.A06(com.instagram.common.session.UserSession):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C148336m3[] A07(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L1c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144857843(0x810618000312f3, double:3.030337648892597E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L35
            X.6m3[] r0 = X.ALx.A01()
            return r0
        L1c:
            r0 = 32
            if (r1 >= r0) goto L35
            r0 = 31
            if (r1 >= r0) goto L47
            r0 = 30
            if (r1 >= r0) goto L59
            r0 = 29
            if (r1 >= r0) goto L6b
            X.0do r0 = X.AbstractC168197fE.A01
            java.lang.Object r0 = r0.getValue()
            X.6m3[] r0 = (X.C148336m3[]) r0
            return r0
        L35:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144792306(0x810618000212f2, double:3.030337648851151E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L47
            X.6m3[] r0 = X.AK0.A01()
            return r0
        L47:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144726769(0x810618000112f1, double:3.030337648809705E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L59
            X.6m3[] r0 = X.AJz.A01()
            return r0
        L59:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316972144661232(0x810618000012f0, double:3.030337648768259E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L6b
            X.6m3[] r0 = X.AJy.A01()
            return r0
        L6b:
            X.6m3[] r0 = X.C168167fB.A02()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168157fA.A07(com.instagram.common.session.UserSession):X.6m3[]");
    }

    public static final SimpleImageUrl A00(String str, String str2) {
        return new SimpleImageUrl(AnonymousClass001.A0u("emoji:/", AnonymousClass001.A0b(str, "-api", Build.VERSION.SDK_INT), "//", str2));
    }

    public static final String A02(String str) {
        C12550kz c12550kz = C148336m3.A03;
        StringBuilder sb = (StringBuilder) c12550kz.A7H();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            sb.setLength(0);
            sb.append("emoji");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                sb.append("-u");
                sb.append(Integer.toHexString(charAt));
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        } finally {
            sb.setLength(0);
            c12550kz.EE6(sb);
        }
    }
}
