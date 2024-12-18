package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.91n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2041791n {
    public final C006802i A00;

    public C2041791n(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C006802i.A0p;
    }

    public static final void A00(C2041791n c2041791n, String str, String str2, int i) {
        C006802i c006802i = c2041791n.A00;
        c006802i.markerStart(77004801);
        c006802i.markerAnnotate(77004801, "num_ranking_results", i);
        c006802i.markerAnnotate(77004801, "ranking_delivery_point", str2);
        c006802i.markerAnnotate(77004801, TraceFieldType.RequestID, str);
        c006802i.markerEnd(77004801, (short) 467);
    }
}
