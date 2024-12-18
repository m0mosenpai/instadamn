package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.Iax, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41608Iax {
    public static final C41608Iax A00 = new Object();

    public final boolean A00(UserSession userSession, L23 l23, C47715L4w c47715L4w) {
        C14360o3.A0B(c47715L4w, 1);
        C24301Gz c24301Gz = C24301Gz.A05;
        String str = c47715L4w.A01;
        String hexString = Integer.toHexString(AnonymousClass001.A0g("offline_", str, userSession.userId).hashCode());
        C14360o3.A07(hexString);
        boolean A02 = c24301Gz.A02(hexString);
        C24301Gz c24301Gz2 = C24301Gz.A05;
        String hexString2 = Integer.toHexString(AnonymousClass001.A0g("offline_", str, userSession.userId).hashCode());
        C14360o3.A07(hexString2);
        long j = l23.A00;
        C1Ef c1Ef = C1Ef.Undefined;
        C3IK c3ik = new C3IK(hexString2);
        boolean z = false;
        try {
            c3ik.A05 = "discover/topical_explore/";
            c3ik.A00 = -1;
            C23781El A002 = c3ik.A01(c1Ef, c24301Gz2.A00, c24301Gz2.A01, false).A00();
            if (A002 != null) {
                if (AbstractC37300Gc1.A00(Long.parseLong(A002.A01)) > j) {
                    z = true;
                }
            }
        } catch (IOException unused) {
        }
        boolean z2 = !z;
        boolean z3 = true;
        C1IH c1ih = (C1IH) C1IC.A00(userSession).A00.get("discover/topical_explore/");
        if (c1ih != null) {
            boolean z4 = c1ih.A03;
            if (Boolean.valueOf(z4) != null) {
                z3 = !z4;
            }
        }
        if (A02 && z2 && z3) {
            return true;
        }
        return false;
    }
}
