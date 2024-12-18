package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.SfK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63214SfK {
    public static final C63214SfK A00 = new Object();

    public static final String A00(java.util.Set set) {
        String str;
        C14360o3.A0B(set, 0);
        String str2 = "";
        if (!set.contains(EnumC61117RfX.A04)) {
            str = "";
        } else {
            str = "mem_cached";
        }
        if (set.contains(EnumC61117RfX.A03)) {
            str2 = "disk_cached";
        }
        String A1A = AbstractC25228BEl.A1A(AnonymousClass001.A0T(str, str2, ' '));
        if (A1A.length() == 0) {
            return "not_cached";
        }
        return A1A;
    }

    public final void A01(C5G6 c5g6, SKL skl) {
        UserSession userSession = c5g6.A03.A00;
        String string = AbstractC166987dD.A0x(userSession).getString("autofill_bloks_contact_save_cache_key", null);
        UserSession userSession2 = c5g6.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!AbstractC002300n.A0g(string, C18U.A04(c06090Tz, userSession2, 36885750373483185L), false)) {
            new QE2(c5g6, skl).A03();
            AbstractC31176DnK.A1X(AbstractC166987dD.A0x(userSession), "autofill_bloks_contact_save_cache_key", C18U.A04(c06090Tz, userSession2, 36885750373483185L));
        }
        new QE2(c5g6, skl).A04();
    }

    public final void A02(C5G6 c5g6, SKL skl) {
        UserSession userSession = c5g6.A03.A00;
        String string = AbstractC166987dD.A0x(userSession).getString("autofill_bloks_contact_usage_cache_key", null);
        UserSession userSession2 = c5g6.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!AbstractC002300n.A0g(string, C18U.A04(c06090Tz, userSession2, 36885750373548722L), false)) {
            new QE3(c5g6, skl).A03();
            AbstractC31176DnK.A1X(AbstractC166987dD.A0x(userSession), "autofill_bloks_contact_usage_cache_key", C18U.A04(c06090Tz, userSession2, 36885750373548722L));
        }
        new QE3(c5g6, skl).A04();
    }

    public final void A03(C5G6 c5g6, SKL skl) {
        UserSession userSession = c5g6.A03.A00;
        String string = AbstractC166987dD.A0x(userSession).getString("autofill_bloks_payment_save_cache_key", null);
        UserSession userSession2 = c5g6.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!AbstractC002300n.A0g(string, C18U.A04(c06090Tz, userSession2, 36885750373679796L), false)) {
            new QE0(c5g6, skl).A03();
            AbstractC31176DnK.A1X(AbstractC166987dD.A0x(userSession), "autofill_bloks_payment_save_cache_key", C18U.A04(c06090Tz, userSession2, 36885750373679796L));
        }
        new QE0(c5g6, skl).A04();
    }

    public final void A04(C5G6 c5g6, SKL skl) {
        UserSession userSession = c5g6.A03.A00;
        String string = AbstractC166987dD.A0x(userSession).getString("autofill_bloks_payment_usage_cache_key", null);
        UserSession userSession2 = c5g6.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!AbstractC002300n.A0g(string, C18U.A04(c06090Tz, userSession2, 36885750373745333L), false)) {
            new QE1(c5g6, skl).A03();
            AbstractC31176DnK.A1X(AbstractC166987dD.A0x(userSession), "autofill_bloks_payment_usage_cache_key", C18U.A04(c06090Tz, userSession2, 36885750373745333L));
        }
        new QE1(c5g6, skl).A04();
    }
}
