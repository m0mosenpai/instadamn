package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71743Jx {
    public C19L A00;
    public int A01;
    public final C25671My A02;
    public final UserSession A04;
    public final C71733Jw A05;
    public final C65192xH A07;
    public final Integer A08;
    public final Map A06 = new HashMap();
    public final InterfaceC41501vz A03 = new InterfaceC41501vz() { // from class: X.3Jy
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(112019805);
            int A032 = C0f9.A03(839351313);
            C71743Jx.A02(C71743Jx.this);
            C0f9.A0A(549272399, A032);
            C0f9.A0A(1806720513, A03);
        }
    };

    public static final void A00(C47Z c47z, C71743Jx c71743Jx) {
        if (c47z != null) {
            if ((!c47z.A5V || c47z.A0u()) && !c47z.A67) {
                C38321qM c38321qM = c47z.A1C;
                if (c38321qM != null) {
                    C65192xH c65192xH = c71743Jx.A07;
                    AbstractC65332xV.A01((AbstractC65332xV) ((AbstractC65202xI) c65192xH).A00, C3XH.A01(c38321qM), 0, true);
                    c65192xH.A0A(-1);
                } else {
                    C0w9.A03("placing_unfinished_pendingmedia", "Feed pending media is being placed without a valid Media instance.");
                }
            }
            if (c47z.A0v() || c47z.A0u()) {
                if (C18U.A06(C06090Tz.A05, c71743Jx.A04, 36326365238146898L)) {
                    C19L c19l = c71743Jx.A00;
                    if (c19l == null) {
                        C14360o3.A0F("mediaPlacerScope");
                        throw C00O.createAndThrow();
                    }
                    C9D4 c9d4 = new C9D4(c47z, c71743Jx, (InterfaceC23621Ds) null, 17);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
                    return;
                }
            }
            A01(c47z, c71743Jx);
        }
    }

    public static final void A01(C47Z c47z, C71743Jx c71743Jx) {
        c71743Jx.A06.remove(c47z.A35);
        A02(c71743Jx);
        if (C40121td.A0F) {
            C40121td.A0F = false;
        }
    }

    public static final void A02(C71743Jx c71743Jx) {
        UserSession userSession = c71743Jx.A04;
        ArrayList A05 = C25A.A00(userSession).A05(c71743Jx.A08);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C47Z c47z = (C47Z) it.next();
            if (c47z.A1f == EnumC915447k.A02 && c47z.A0v == null) {
                C19L c19l = c71743Jx.A00;
                if (c19l == null) {
                    C14360o3.A0F("mediaPlacerScope");
                    throw C00O.createAndThrow();
                }
                C9D4 c9d4 = new C9D4(c47z, c71743Jx, (InterfaceC23621Ds) null, 18);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
                C25A.A00(userSession).A04(c47z.A35, "Configured");
                AnonymousClass257.A00(userSession).A04();
                c71743Jx.A06.put(c47z.A35, c47z);
            }
        }
        Map map = c71743Jx.A06;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        A05.addAll(arrayList);
        C65192xH c65192xH = c71743Jx.A07;
        if (!A05.isEmpty() || !c65192xH.A0f.isEmpty()) {
            List list = c65192xH.A0f;
            list.clear();
            list.addAll(A05);
            c65192xH.A0A(-1);
        }
        if (c71743Jx.A01 != A05.size()) {
            c71743Jx.A01 = A05.size();
        }
    }

    public C71743Jx(UserSession userSession, C65192xH c65192xH, C71733Jw c71733Jw, Integer num) {
        this.A04 = userSession;
        this.A08 = num;
        this.A07 = c65192xH;
        this.A05 = c71733Jw;
        this.A02 = AbstractC25651Mw.A00(userSession);
    }
}
