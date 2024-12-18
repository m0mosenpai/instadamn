package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;

/* renamed from: X.2cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53632cp {
    public final synchronized DGWClientHolder A00(UserSession userSession) {
        C18720vz c18720vz;
        String A04;
        C53702cx c53702cx;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        c18720vz = AbstractC12960li.A00;
        A04 = AbstractC12880la.A04(context);
        boolean z = false;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342167892688122441L)) {
            z = !((C53642cq) C53642cq.A02.getValue()).A00.mAppForegroundStateGetter.isAppForegrounded();
        }
        c53702cx = new C53702cx();
        c53702cx.A04 = z;
        c53702cx.A03 = C18U.A06(c06090Tz, userSession, 2342167892688187978L);
        return (DGWClientHolder) c18720vz.A01(DGWClientHolder.class, new C9G2(userSession, c53702cx.A00(), A04, 16));
    }
}
