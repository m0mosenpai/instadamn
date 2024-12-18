package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OaN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55067OaN {
    public long A00;
    public InterfaceC11380iw A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;

    public C55067OaN(UserSession userSession, ArrayList arrayList, String str, ArrayList arrayList2, String str2, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(str, 3);
        this.A02 = userSession;
        this.A06 = MSY.A0j(arrayList);
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A07 = MSY.A0j(arrayList2);
        this.A03 = str2;
        this.A08 = AbstractC166987dD.A1E();
        this.A04 = "seller";
    }

    public static final boolean A00(C55067OaN c55067OaN) {
        ArrayList arrayList = c55067OaN.A06;
        if (!(!arrayList.isEmpty())) {
            arrayList = c55067OaN.A07;
        }
        if (arrayList.size() > 1) {
            return true;
        }
        return false;
    }

    public final void A01() {
        OGc oGc = C56141Ow2.A04;
        UserSession userSession = this.A02;
        C56141Ow2 A00 = oGc.A00(userSession);
        String str = this.A05;
        Integer num = C05F.A0C;
        ArrayList arrayList = this.A06;
        A00.A02 = str;
        A00.A01 = num;
        A00.A00 = null;
        A00.A03 = arrayList;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("commerce/suggested_product_tags/");
        A0c.A0P(null, C52086N2m.class, OQB.class, false);
        String str2 = userSession.userId;
        ArrayList arrayList2 = this.A07;
        String str3 = this.A03;
        ArrayList arrayList3 = this.A08;
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            C16V.A03(A0S, "upload_ids");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(A0S, it);
            }
            A0S.A0Z();
            if (str2 != null) {
                A0S.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
            }
            A0S.A0T("use_mock_data", false);
            A0S.A0S("waterfall_id", str);
            C16V.A03(A0S, "base_64_imgs");
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(A0S, it2);
            }
            A0S.A0Z();
            A0S.A0S("media_format", str3);
            C16V.A03(A0S, AbstractC111324zv.A00(1109));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                AbstractC167017dG.A1F(A0S, it3);
            }
            A0S.A0Z();
            A0c.A9s("data", AbstractC167017dG.A0l(A0S, A0O));
            C1ON A0N = A0c.A0N();
            A0N.A00 = new NAB(this);
            this.A00 = System.currentTimeMillis();
            C1GJ.A03(A0N);
        } catch (IOException e) {
            String str4 = AbstractC50666MYj.A00(userSession).A02;
            if (str4 != null) {
                AbstractC55216Oef.A08(this.A01, userSession, str4, e.getMessage(), 0L, A00(this));
            }
        }
    }

    public C55067OaN(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = str;
        this.A07 = arrayList;
        this.A06 = AbstractC166987dD.A1E();
        this.A03 = str2;
        this.A08 = MSY.A0j(arrayList2);
        this.A04 = "opt";
    }
}
