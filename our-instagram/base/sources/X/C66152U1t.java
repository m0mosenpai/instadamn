package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.U1t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66152U1t {
    public final Context A00;
    public final UserSession A01;
    public final U28 A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final java.util.Set A05;
    public final java.util.Set A06;
    public final java.util.Set A07;
    public final java.util.Set A08;

    public C66152U1t(Context context, UserSession userSession, U28 u28) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = u28;
        this.A08 = new LinkedHashSet();
        this.A04 = new LinkedHashSet();
        this.A07 = new LinkedHashSet();
        this.A05 = new LinkedHashSet();
        this.A03 = new LinkedHashSet();
        this.A06 = new LinkedHashSet();
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw, Tx0 tx0, U0K u0k, User user) {
        if (tx0.A0H) {
            if (interfaceC11380iw != null) {
                C63702ur c63702ur = new C63702ur(interfaceC11380iw, this.A01);
                String id = user.getId();
                int i = tx0.A00;
                C6PG c6pg = new C6PG("su_in_search_null_state", id, interfaceC11380iw.getModuleName());
                c6pg.A00 = i;
                c63702ur.A07(new C6PH(c6pg));
            }
            U0J A00 = AbstractC65962TxF.A00(this.A01);
            A00.A03.remove(new C65741TtG(user));
            C1GJ.A04(FY5.A01(A00.A06, user.getId(), null, null), 359266386);
            Iterator it = this.A08.iterator();
            while (it.hasNext()) {
                ((XBI) it.next()).CN3(user.getId());
            }
            return;
        }
        if (tx0.A0F) {
            C65740TtF A002 = AbstractC65792TuA.A00(this.A01);
            synchronized (A002) {
                A002.A00.A05(user);
            }
        }
        Iterator it2 = this.A08.iterator();
        while (it2.hasNext()) {
            ((XBI) it2.next()).CN3(user.getId());
        }
        AbstractC68573VWa.A00(new C67945V3k(this.A00, new C71027Wmi(2, tx0, user, this), this.A02), this.A01, u0k, user.getId(), tx0.A08, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(Hashtag hashtag, Tx0 tx0, U0K u0k) {
        U10 u10;
        C14360o3.A0B(hashtag, 0);
        if (tx0.A0F) {
            if (u0k == U0K.A06) {
                W61 A00 = VWR.A00(this.A01);
                synchronized (A00) {
                    A00.A00.A05(hashtag);
                    u10 = A00;
                }
            } else {
                U10 A002 = AbstractC66131U0x.A00(this.A01);
                synchronized (A002) {
                    A002.A00.A05(hashtag);
                    u10 = A002;
                }
            }
        }
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((XBF) it.next()).CMX(String.valueOf(hashtag.getId()));
        }
        AbstractC68573VWa.A00(new C67945V3k(this.A00, new C71029Wmk(0, hashtag, tx0, u0k, this), this.A02), this.A01, null, String.valueOf(hashtag.getId()), tx0.A08, 1);
    }

    public final void A02(Keyword keyword, Tx0 tx0) {
        C14360o3.A0B(keyword, 0);
        String str = keyword.A03;
        if (str == null) {
            str = keyword.A04;
        }
        if (tx0.A0F) {
            U11 A00 = AbstractC66132U0y.A00(this.A01);
            synchronized (A00) {
                A00.A00.A05(keyword);
            }
        }
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XBG) it.next()).CMd(str);
        }
        UserSession userSession = this.A01;
        String A0X = AbstractC37303Gc4.A0X(tx0.A08);
        String str2 = keyword.A04;
        String str3 = keyword.A03;
        C67945V3k c67945V3k = new C67945V3k(this.A00, new C71028Wmj(keyword, tx0, this, str), this.A02);
        C14360o3.A0B(str2, 2);
        String str4 = null;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("fbsearch/hide_search_entities/");
        A0c.A9s("section", A0X);
        AbstractC31173DnH.A1N(A0c);
        String A0b = AbstractC31175DnJ.A0b(AbstractC166987dD.A1J(str2));
        C14360o3.A07(A0b);
        A0c.A0H("keyword_names", A0b);
        if (str3 != null && str3.length() != 0) {
            str4 = AbstractC31175DnJ.A0b(AbstractC166987dD.A1J(str3));
            C14360o3.A07(str4);
        }
        A0c.A0H("keyword", str4);
        C1ON A0N = A0c.A0N();
        A0N.A00 = c67945V3k;
        C1GJ.A03(A0N);
    }

    public final void A03(C69794Vvd c69794Vvd, Tx0 tx0, U0K u0k) {
        C14360o3.A0B(c69794Vvd, 0);
        if (tx0.A0F) {
            if (u0k == U0K.A06) {
                W61 A00 = VWR.A00(this.A01);
                synchronized (A00) {
                    A00.A02.A05(c69794Vvd);
                }
            } else {
                U0w.A00(this.A01).A00.A05(c69794Vvd);
            }
        }
        for (XBH xbh : this.A07) {
            String A05 = c69794Vvd.A00().A05();
            C14360o3.A07(A05);
            xbh.CMr(A05);
        }
        UserSession userSession = this.A01;
        String A02 = c69794Vvd.A00().A02();
        C14360o3.A07(A02);
        AbstractC68573VWa.A00(new C67945V3k(this.A00, new C71029Wmk(1, c69794Vvd, tx0, u0k, this), this.A02), userSession, null, A02, tx0.A08, 2);
    }

    public final void A04(JIN jin, Tx0 tx0) {
        if (tx0.A0F) {
            U2R A00 = U1X.A00(this.A01);
            synchronized (A00) {
                A00.A00.A05(jin);
            }
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((XBE) it.next()).CMK(jin.getId());
        }
        AbstractC68573VWa.A00(new C67945V3k(this.A00, new C71027Wmi(0, tx0, jin, this), this.A02), this.A01, null, jin.getId(), tx0.A08, 7);
    }
}
