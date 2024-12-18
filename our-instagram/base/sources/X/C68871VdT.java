package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VdT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68871VdT {
    public static List A01;
    public final List A00;

    public C68871VdT(UserSession userSession) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        arrayList.add(EnumC68206VFy.A0A);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342159783789925003L) || C18U.A06(c06090Tz, userSession, 2342159783789990540L)) {
            arrayList.add(EnumC68206VFy.A08);
        }
        if (!C18U.A06(c06090Tz, userSession, 36314992164735947L) && C18U.A06(c06090Tz, userSession, 2342159783789925003L)) {
            arrayList.add(EnumC68206VFy.A07);
        }
        if (C18U.A06(c06090Tz, userSession, 2342159783789990540L)) {
            arrayList.add(EnumC68206VFy.A05);
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36315799618588218L)) {
            arrayList.add(EnumC68206VFy.A04);
        }
    }
}
