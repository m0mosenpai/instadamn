package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147416kR {
    public C677733r A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C147426kS A06;
    public final C53h A07;
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C206839Do(this, 22));
    public final UserSession A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public static final void A00(C147416kR c147416kR, String str) {
        c147416kR.A04 = true;
        C147426kS c147426kS = c147416kR.A06;
        C72786Xn6 c72786Xn6 = (C72786Xn6) c147426kS.A04.A02.get(str);
        if (c72786Xn6 != null) {
            InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
            if (interfaceC678133v.CLN()) {
                if (!c147426kS.A00) {
                    c147426kS.A00 = true;
                    c72786Xn6.A03.Cje();
                }
                interfaceC678133v.E4S();
            }
        }
    }

    public final void A01() {
        C72786Xn6 c72786Xn6;
        if (this.A04) {
            this.A04 = false;
            String str = this.A01;
            if (str != null && (c72786Xn6 = (C72786Xn6) this.A06.A04.A02.get(str)) != null) {
                InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
                if (interfaceC678133v.CLN()) {
                    interfaceC678133v.pause();
                }
            }
        }
    }

    public final void A02() {
        C147426kS c147426kS = this.A06;
        C147436kT c147436kT = c147426kS.A04;
        Map map = c147436kT.A02;
        for (String str : AbstractC001800i.A0a(map.keySet())) {
            C14360o3.A0B(str, 0);
            C72786Xn6 c72786Xn6 = (C72786Xn6) map.get(str);
            if (c72786Xn6 != null) {
                c147436kT.A01(str);
                c72786Xn6.A03.CjW();
                c147426kS.A00 = false;
            }
        }
        c147436kT.A00();
    }

    public final void A03() {
        C147436kT c147436kT = this.A06.A04;
        Iterator it = AbstractC001800i.A0a(c147436kT.A02.keySet()).iterator();
        while (it.hasNext()) {
            c147436kT.A01((String) it.next());
        }
    }

    public final void A04() {
        if (this.A03) {
            A01();
            String str = this.A01;
            if (str != null) {
                C147426kS c147426kS = this.A06;
                C147436kT c147436kT = c147426kS.A04;
                C72786Xn6 c72786Xn6 = (C72786Xn6) c147436kT.A02.get(str);
                if (c72786Xn6 != null) {
                    c147436kT.A01(str);
                    c72786Xn6.A03.CjW();
                    c147426kS.A00 = false;
                }
            }
            this.A01 = null;
            this.A03 = false;
        }
    }

    public final void A05(float f) {
        String str = this.A01;
        if (str != null) {
            C147426kS c147426kS = this.A06;
            C72786Xn6 c72786Xn6 = (C72786Xn6) c147426kS.A04.A02.get(str);
            if (c72786Xn6 != null) {
                InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
                if (interfaceC678133v.CLN()) {
                    if (c147426kS.A08) {
                        f = 0.0f;
                    }
                    interfaceC678133v.EhH(f);
                }
            }
        }
    }

    public final void A06(int i) {
        C72786Xn6 c72786Xn6;
        String str = this.A01;
        if (str != null && (c72786Xn6 = (C72786Xn6) this.A06.A04.A02.get(str)) != null) {
            InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
            if (interfaceC678133v.CLN()) {
                interfaceC678133v.seekTo(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [X.XfA, java.lang.Object] */
    public final void A07(InterfaceC43583JMr interfaceC43583JMr, InterfaceC150336ph interfaceC150336ph, String str, boolean z) {
        int i;
        long j;
        String str2;
        C72690XlJ c72690XlJ;
        Long A0k;
        Long A0k2;
        C53h c53h = this.A07;
        boolean EiN = c53h.EiN();
        Long Bzx = interfaceC43583JMr.Bzx();
        if (Bzx != null) {
            i = (int) Bzx.longValue();
        } else {
            i = 0;
        }
        if (EiN) {
            i *= 1000;
        }
        UserSession userSession = this.A09;
        String str3 = this.A0B;
        Context context = this.A05;
        C677733r c677733r = this.A00;
        long j2 = 0;
        if (str != null && (A0k2 = AbstractC003100w.A0k(10, str)) != null) {
            j = A0k2.longValue();
        } else {
            j = 0;
        }
        String str4 = this.A0A;
        String id = interfaceC43583JMr.getId();
        if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
            j2 = A0k.longValue();
        }
        boolean z2 = false;
        if (interfaceC43583JMr.BiP() != null) {
            z2 = true;
        }
        Long Azh = interfaceC43583JMr.Azh();
        List Afr = interfaceC43583JMr.Afr();
        if (Afr == null) {
            Afr = C16930sl.A00;
        }
        boolean z3 = this.A0C;
        MusicDataSource A00 = I9W.A00(interfaceC43583JMr);
        C147426kS c147426kS = this.A06;
        C147436kT c147436kT = c147426kS.A04;
        Map map = c147436kT.A01;
        if (map.isEmpty()) {
            InterfaceC678133v A01 = AbstractC677833s.A01(context, userSession, null, c677733r, "PlayerPoolHandler", true, z3, false, false);
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            map.put(obj, A01);
        }
        if ((!map.isEmpty()) && (str2 = (String) AbstractC001800i.A0A(map.keySet())) != null) {
            InterfaceC678133v interfaceC678133v = (InterfaceC678133v) map.remove(str2);
            if (interfaceC678133v != null) {
                Long valueOf = Long.valueOf(j);
                String str5 = userSession.userId;
                C14360o3.A0B(str5, 0);
                Long valueOf2 = Long.valueOf(j2);
                Long valueOf3 = Long.valueOf(i / 1000);
                C06090Tz c06090Tz = C06090Tz.A05;
                YQT A002 = I9V.A00(userSession, valueOf, valueOf2, Azh, valueOf3, str5, str4, str3, Afr, z2, C18U.A06(c06090Tz, userSession, 36314704402058005L));
                if (C18U.A06(c06090Tz, userSession, 36320506903143008L)) {
                    c72690XlJ = new C72690XlJ(interfaceC678133v);
                } else {
                    c72690XlJ = null;
                }
                ?? obj2 = new Object();
                obj2.A00 = c72690XlJ;
                obj2.A01 = new C43647JSf(new YFh(obj2, A002, c53h), 100);
                c147436kT.A02.put(str2, new C72786Xn6(interfaceC678133v, obj2, A002, C05F.A00));
            }
            boolean z4 = this.A02;
            C72786Xn6 c72786Xn6 = (C72786Xn6) c147436kT.A02.get(str2);
            if (c72786Xn6 != null) {
                InterfaceC678133v interfaceC678133v2 = c72786Xn6.A01;
                YQT yqt = c72786Xn6.A03;
                boolean A003 = C4AJ.A00(c147426kS.A03, null, z4, false);
                yqt.EPx(A003);
                yqt.Cjd();
                float f = 0.0f;
                if (A003) {
                    f = 1.0f;
                }
                interfaceC678133v2.EhH(f);
                interfaceC678133v2.ESz(A00, new YFM(interfaceC150336ph, c72786Xn6), null, i, -1, (int) c147426kS.A02, false, c147426kS.A07);
                yqt.CjU();
            }
            this.A03 = true;
            this.A01 = str2;
            if (z) {
                A00(this, str2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A08() {
        C72786Xn6 c72786Xn6;
        String str = this.A01;
        if (str != null && (c72786Xn6 = (C72786Xn6) this.A06.A04.A02.get(str)) != null) {
            return c72786Xn6.A01.isPlaying();
        }
        return false;
    }

    public C147416kR(Context context, UserSession userSession, C53h c53h, String str, String str2) {
        this.A09 = userSession;
        this.A05 = context;
        this.A0B = str;
        this.A07 = c53h;
        this.A0A = str2;
        this.A06 = new C147426kS(userSession);
        this.A00 = new C677733r(context, userSession);
        this.A0C = C18U.A06(C06090Tz.A05, userSession, 36320506903798376L);
    }
}
