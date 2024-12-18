package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AEF {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.C199758sR r16, java.lang.String r17, java.util.List r18, boolean r19) {
        /*
            r1 = 0
            r15 = r17
            r0 = r18
            if (r17 == 0) goto Lb9
            int r2 = r15.length()
            if (r2 == 0) goto Lb9
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r8 = 1
            r2.inJustDecodeBounds = r8
            android.graphics.BitmapFactory.decodeFile(r15, r2)
            int r7 = r2.outWidth
            float r3 = (float) r7
            int r6 = r2.outHeight
            float r2 = (float) r6
            float r3 = r3 / r2
            r2 = r16
            int r13 = r2.A01
            int r14 = r2.A00
            float r9 = (float) r13
            float r10 = (float) r14
            float r2 = r9 / r10
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L2e
            r8 = 0
        L2e:
            java.lang.String r5 = "x#"
            java.lang.String r4 = " output size="
            r3 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = "bitmap size="
            if (r8 != 0) goto L95
            java.lang.StringBuilder r2 = X.AbstractC166997dE.A11(r2)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            r2.append(r4)
            r2.append(r13)
            r2.append(r5)
            r2.append(r14)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ReelImageRegionsUtils_static_overlay_aspect_ratio_does_not_match"
        L57:
            X.C0w9.A03(r2, r3)
        L5a:
            if (r18 == 0) goto L93
            int r3 = r0.size()
        L60:
            int r12 = r3 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            float r7 = r9 / r2
            float r8 = r10 / r2
            r11 = 0
            X.5NO r6 = new X.5NO
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.5NP r14 = X.C5NP.A07
            java.util.Set r17 = java.util.Collections.singleton(r6)
            X.C14360o3.A07(r17)
            r13 = 0
            X.5NJ r12 = new X.5NJ
            r16 = r13
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            if (r18 == 0) goto L88
            r2.addAll(r0)
        L88:
            if (r19 == 0) goto L8b
            r1 = r3
        L8b:
            r2.add(r1, r12)
            java.util.List r0 = X.AbstractC001800i.A0a(r2)
            return r0
        L93:
            r3 = 0
            goto L60
        L95:
            if (r7 < r13) goto L99
            if (r6 >= r14) goto L5a
        L99:
            java.lang.StringBuilder r2 = X.AbstractC166997dE.A11(r2)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            r2.append(r4)
            r2.append(r13)
            r2.append(r5)
            r2.append(r14)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ReelImageRegionsUtils_static_overlay_low_quality"
            goto L57
        Lb9:
            if (r18 == 0) goto Lc0
            java.util.List r0 = X.AbstractC001800i.A0a(r0)
            return r0
        Lc0:
            X.0sl r0 = X.C16930sl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEF.A00(X.8sR, java.lang.String, java.util.List, boolean):java.util.List");
    }

    public static final void A01(UserSession userSession, C47Z c47z, Map map) {
        C5NL c5nl;
        C5NL c5nl2;
        Al8 al8;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1R(map, c47z);
        ArrayList A00 = A05.A00(userSession, map);
        c47z.A4a = A00;
        C23542Abw c23542Abw = C23542Abw.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C5NJ c5nj = (C5NJ) it.next();
            if (c5nj.A03 == C5NP.A09) {
                C5NM c5nm = c5nj.A04;
                if (c5nm != null) {
                    c5nl = c5nm.A00();
                } else {
                    c5nl = null;
                }
                if (c5nl instanceof Al8) {
                    C5NM c5nm2 = c5nj.A04;
                    if (c5nm2 != null) {
                        c5nl2 = c5nm2.A00();
                    } else {
                        c5nl2 = null;
                    }
                    if ((c5nl2 instanceof Al8) && (al8 = (Al8) c5nl2) != null && c23542Abw.apply(al8)) {
                        A1E.add(al8.A06.A0X);
                    }
                }
            }
        }
        if (!A1E.isEmpty()) {
            C47v c47v = new C47v(0.0f, 31);
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                C5JH c5jh = new C5JH(null, C5JI.A09, null, (String) it2.next(), null, null, 1.0f, 1.0f, 0, 0, -1);
                C14360o3.A0B(c5jh, 0);
                c47v.A03.add(c5jh);
            }
            c47z.A1V = c47v;
        }
    }
}
