package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.GsU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38285GsU extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "OlderContextualFeedController";
    public long A00;
    public C154796xU A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public java.util.Set A06;
    public boolean A07;
    public boolean A08;
    public String A09;
    public final Fragment A0A;
    public final InterfaceC41501vz A0B = C37816GkW.A00(this, 52);
    public final InterfaceC41501vz A0C = C37816GkW.A00(this, 53);
    public final UserSession A0D;
    public final JIJ A0E;
    public final InterfaceC17600tv A0F;
    public final C61992s0 A0G;
    public final InterfaceC61432r6 A0H;
    public final C1M0 A0I;
    public final String A0J;

    public C38285GsU(Bundle bundle, Fragment fragment, UserSession userSession, JIJ jij, InterfaceC61432r6 interfaceC61432r6, C1M0 c1m0, String str) {
        this.A0A = fragment;
        this.A0D = userSession;
        this.A0J = str;
        this.A0E = jij;
        this.A0I = c1m0;
        this.A0F = AbstractC17610tw.A00(userSession);
        this.A05 = bundle.getString(AbstractC111324zv.A00(3548));
        this.A09 = bundle.getString(AbstractC111324zv.A00(3549));
        this.A03 = bundle.getString(AbstractC111324zv.A00(3545));
        this.A07 = bundle.getBoolean(AbstractC111324zv.A00(3546));
        Context context = fragment.getContext();
        if (context != null) {
            this.A0G = new C61992s0(context, AbstractC018607g.A00(fragment), userSession, this, null, null, false);
            this.A0H = interfaceC61432r6;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    public static final void A02(C1EN c1en, C38285GsU c38285GsU, boolean z) {
        C154796xU c154796xU;
        String str;
        HashMap hashMap;
        String str2;
        C154796xU c154796xU2;
        Long l;
        if (z && (l = c38285GsU.A02) != null && System.currentTimeMillis() - l.longValue() < c38285GsU.A00) {
            c38285GsU.A0E.Dfz();
            return;
        }
        if ((!"feed_timeline_older".equals(c38285GsU.A0J) && z) || (c154796xU = c38285GsU.A01) == null) {
            str = null;
        } else {
            str = c154796xU.A03.A07;
        }
        C17590tu c17590tu = new C17590tu(c38285GsU.A0F);
        String str3 = c38285GsU.A09;
        if (str3 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("pagination_source", str3);
            hashMap = A1G;
        } else {
            hashMap = null;
        }
        if (z) {
            c38285GsU.A0I.A00 = AbstractC166997dE.A0n();
        } else if (hashMap != null && (str2 = c38285GsU.A04) != null) {
            hashMap.put("last_taken_at", str2);
        }
        InterfaceC61432r6 interfaceC61432r6 = c38285GsU.A0H;
        Map AUS = interfaceC61432r6.AUS("feed/timeline/");
        c38285GsU.A06 = AbstractC85703rz.A01(AUS);
        UserSession userSession = c38285GsU.A0D;
        C1CL c1cl = new C1CL(userSession);
        String str4 = c38285GsU.A0I.A00;
        C1ES A00 = C1ER.A00(userSession, c1en, str, str3, false);
        Map map = hashMap;
        if (hashMap == null) {
            map = AbstractC06930Yk.A0E();
        }
        C1I0 A002 = c1cl.A00(new C1EU(null, c17590tu, c1en, A00, null, str4, str, null, null, AbstractC167017dG.A0j(), null, AbstractC85703rz.A00(AUS), map, C1EU.A0G.incrementAndGet(), false, false), -20);
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
        java.util.Set set = c38285GsU.A06;
        if (set != null) {
            interfaceC61432r6.FCF(enumC74603Ws, set);
        }
        if (A002 instanceof C24561Hz) {
            C154796xU c154796xU3 = c38285GsU.A01;
            if (c154796xU3 == null) {
                return;
            }
            c154796xU3.A04(((C24561Hz) A002).A00, new HLD(1, A002, c38285GsU));
            return;
        }
        if (!(A002 instanceof C62272sS) || (c154796xU2 = c38285GsU.A01) == null) {
            return;
        }
        c154796xU2.A03(((C62272sS) A002).A00, new HLD(1, A002, c38285GsU));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0J;
    }
}
