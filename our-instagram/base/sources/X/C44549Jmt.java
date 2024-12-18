package X;

import android.content.Context;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Jmt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44549Jmt extends AbstractC52922bZ {
    public Integer A00;
    public boolean A01;
    public final EnumC50631MWs A02;
    public final C184108Ez A03;
    public final C47543KzB A04;
    public final Integer A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C05A A0B;

    public C44549Jmt(EnumC50631MWs enumC50631MWs, UserSession userSession, C184108Ez c184108Ez) {
        JWd jWd;
        Integer num;
        Integer num2;
        C14360o3.A0B(c184108Ez, 2);
        this.A03 = c184108Ez;
        this.A02 = enumC50631MWs;
        Integer num3 = C05F.A01;
        this.A05 = num3;
        MWT mwt = c184108Ez.A00;
        this.A00 = (mwt == null || (num2 = (Integer) mwt.A00) == null) ? num3 : num2;
        C008002u A00 = C10E.A00(C193588hd.A00);
        this.A06 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0B = A0o;
        this.A0A = A0o;
        MWT mwt2 = this.A03.A00;
        if (mwt2 != null) {
            jWd = new JWd(mwt2.A03, (Integer) mwt2.A05, AbstractC167007dF.A1W(mwt2.A02), 5);
        } else {
            jWd = new JWd(C05F.A00, AbstractC47838LBb.A01(this.A05));
        }
        C008002u A002 = C10E.A00(jWd);
        this.A07 = A002;
        this.A09 = A002;
        this.A04 = new C47543KzB(userSession);
        MWT mwt3 = this.A03.A00;
        A00(this, (mwt3 == null || (num = (Integer) mwt3.A00) == null) ? this.A05 : num);
    }

    public final void A02() {
        Object obj;
        C05A c05a = this.A06;
        Collection collection = (Collection) ((AbstractC193598he) c05a.getValue()).A01;
        if (collection != null) {
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            ArrayList A0q = AbstractC167017dG.A0q(A1F);
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                C45056Jwl c45056Jwl = (C45056Jwl) it.next();
                Integer num = C05F.A01;
                String str = c45056Jwl.A05;
                String str2 = c45056Jwl.A07;
                String str3 = c45056Jwl.A06;
                int i = c45056Jwl.A00;
                C47712L4t c47712L4t = c45056Jwl.A01;
                C47712L4t c47712L4t2 = c45056Jwl.A02;
                A91 a91 = c45056Jwl.A03;
                C14360o3.A0B(str, 0);
                AbstractC25234BEr.A1P(str2, str3, c47712L4t);
                AbstractC167017dG.A1T(c47712L4t2, a91);
                A0q.add(new C45056Jwl(c47712L4t, c47712L4t2, a91, num, str, str2, str3, i));
            }
            obj = new C187398Sh(A0q);
        } else {
            obj = C193648hk.A00;
        }
        c05a.Egh(obj);
    }

    public final void A03(Context context, UserSession userSession, C45056Jwl c45056Jwl, InterfaceC16660sJ interfaceC16660sJ) {
        A8O a8o;
        A8O a8o2;
        A8O a8o3;
        String str;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        A91 a91 = c45056Jwl.A03;
        A8O a8o4 = a91.A00;
        if ((a8o4 == null || (str = a8o4.A02) == null) && (((a8o = a91.A03) == null || (str = a8o.A02) == null) && (((a8o2 = a91.A02) == null || (str = a8o2.A02) == null) && ((a8o3 = a91.A01) == null || (str = a8o3.A02) == null)))) {
            return;
        }
        C121275eQ A03 = AbstractC50633MWu.A03(context, userSession, new OUQ(str, "GiphyClipsBrowserViewModel", A1V, false, false));
        C43922JbX.A01(A03, interfaceC16660sJ, 7);
        C1GJ.A03(A03);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        C47543KzB c47543KzB = this.A04;
        List list = (List) c47543KzB.A00.get(str);
        if (list != null) {
            A05(str, list);
            return;
        }
        UserSession userSession = c47543KzB.A01;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("giphy_video");
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        JQ0.A1F(A0M, jSONArray, str);
        A0M.A9s("request_surface", String.valueOf(GiphyRequestSurface.A04));
        C1ON A0e = AbstractC25227BEk.A0e(A0M, K8C.class, C47837LBa.class);
        A0e.A00 = new C45547KEm(c47543KzB, this, str, 1);
        C1GJ.A03(A0e);
    }

    public static void A01(Integer num, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new C51758Mth(num, 14, z));
    }

    public final void A05(String str, List list) {
        Object c8zt;
        if (str.equals(((JWd) this.A07.getValue()).A01)) {
            C05A c05a = this.A06;
            if (list.isEmpty()) {
                c8zt = C193588hd.A00;
            } else {
                c8zt = new C8ZT(list);
            }
            c05a.Egh(c8zt);
        }
    }

    public static final void A00(C44549Jmt c44549Jmt, Integer num) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Integer num2 = C05F.A01;
        boolean z = true;
        A01(num2, A1E, AbstractC167007dF.A1X(num, num2));
        Integer num3 = C05F.A0C;
        A01(num3, A1E, AbstractC167007dF.A1X(num, num3));
        Integer num4 = C05F.A0N;
        A01(num4, A1E, AbstractC167007dF.A1X(num, num4));
        Integer num5 = C05F.A0Y;
        A01(num5, A1E, AbstractC167007dF.A1X(num, num5));
        Integer num6 = C05F.A0j;
        A01(num6, A1E, AbstractC167007dF.A1X(num, num6));
        Integer num7 = C05F.A0u;
        A01(num7, A1E, AbstractC167007dF.A1X(num, num7));
        Integer num8 = C05F.A00;
        if (num != num8) {
            z = false;
        }
        A01(num8, A1E, z);
        c44549Jmt.A0B.Egh(A1E);
    }
}
