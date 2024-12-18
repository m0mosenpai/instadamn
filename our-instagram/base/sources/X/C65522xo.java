package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65522xo {
    public final UserSession A00;
    public final C11L A01;
    public final C11L A02;
    public final boolean A03;

    public /* synthetic */ C65522xo(UserSession userSession) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323328697445542L);
        this.A00 = userSession;
        this.A03 = A06;
        this.A01 = new C11L("^[a-zA-Z, _]*$");
        this.A02 = new C11L("^'\\s*'$");
    }

    public static final AbstractC65572xt A00(C65522xo c65522xo, String str, String str2) {
        String obj = AbstractC001900j.A0B(str).toString();
        if (!AbstractC001900j.A0T(obj) && !c65522xo.A02.A08(obj)) {
            if (c65522xo.A03 && !c65522xo.A01.A08(obj)) {
                C14360o3.A0B(str2, 2);
                throw new RuntimeException(AnonymousClass001.A0v("Invalid Litho Feed Eligibility: ", str, " [", str2, ']'));
            }
            if (C14360o3.A0K(obj, "all")) {
                return C65582xu.A00;
            }
            if (C14360o3.A0K(obj, "main")) {
                return C65562xs.A00;
            }
            List A0R = AbstractC001900j.A0R(obj, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC001900j.A0B((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!AbstractC001900j.A0T((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            return new C66762zt(AbstractC001800i.A0k(arrayList2));
        }
        return null;
    }
}
