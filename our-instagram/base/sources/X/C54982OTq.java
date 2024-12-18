package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54982OTq {
    public final Context A00;
    public final OEK A01;
    public final UserSession A02;

    public static final void A00(EnumC201098ur enumC201098ur, C54982OTq c54982OTq, String str) {
        C82H c82h;
        UserSession userSession = c54982OTq.A02;
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "ClipsShareLaterDialog");
        OEK oek = c54982OTq.A01;
        C82G c82g = oek.A00;
        int intValue = oek.A03.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                c82h = C82H.A0k;
            } else {
                throw B4Z.A00();
            }
        } else {
            c82h = C82H.A0j;
        }
        C82I A0H = MSW.A0H();
        A0H.A06("waterfall_id", oek.A05);
        MSX.A1I(A0H, A1X);
        AbstractC50523MSb.A19(A0H, "ig_media_id", oek.A02.getId(), str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    public C54982OTq(Context context, OEK oek, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = oek;
    }
}
