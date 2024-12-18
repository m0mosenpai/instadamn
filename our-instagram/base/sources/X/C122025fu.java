package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122025fu {
    public final C006802i A00;

    public C122025fu(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C006802i.A0p;
    }

    public final void A00(int i, String str, String str2, int i2) {
        C14360o3.A0B(str, 1);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(i, "ranking_request_id", str);
        c006802i.markerAnnotate(i, "banyan_view", str2);
        c006802i.markerAnnotate(i, "num_ranking_recommendations", i2);
        c006802i.markerEnd(i, (short) 467);
    }

    public final void A01(String str, Map map, String[] strArr, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(strArr, 1);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(77008831, "ranking_request_id", str);
        c006802i.markerAnnotate(77008831, "requested_ranking_views", strArr);
        for (String str2 : map.keySet()) {
            Number number = (Number) map.get(str2);
            if (number != null) {
                c006802i.markerAnnotate(77008831, AnonymousClass001.A0R("num_ranking_recommendations ", str2), number.intValue());
            }
        }
        short s = 467;
        if (z) {
            s = 3;
        }
        c006802i.markerEnd(77008831, s);
    }
}
