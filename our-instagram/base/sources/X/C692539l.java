package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.39l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C692539l {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC65282xQ A03;
    public final C1Y1 A04;
    public final InterfaceC60442pS A05;
    public final String A06;

    public final void A00(C38321qM c38321qM, JG9 jg9) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity == null) {
            return;
        }
        UserSession userSession = this.A01;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            InterfaceC60442pS interfaceC60442pS = this.A05;
            Integer num = C05F.A00;
            String A38 = c38321qM.A38();
            if (A38 != null) {
                FCG.A00(interfaceC60442pS, userSession, A2E, num, A38, "feed");
                Integer num2 = C05F.A01;
                String A382 = c38321qM.A38();
                if (A382 != null) {
                    AbstractC34859FXt.A00(activity, interfaceC60442pS, userSession, A2E, new C43046J1m(activity, this, jg9), num2, A382, "feed");
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
        long j;
        Long l;
        Long A0k;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C42649Iu6 c42649Iu6 = new C42649Iu6(this, c38321qM, jg9, c75113Zb);
        C38909HBg c38909HBg = new C38909HBg();
        c38909HBg.A00 = c42649Iu6;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = requireActivity.getResources().getString(2131963515);
        c189448aO.A1C = false;
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A02 = R.drawable.instagram_arrow_back_24;
        c189458aP.A05 = new ViewOnClickListenerC41884IhM(c38909HBg);
        String string = requireActivity.getResources().getString(2131953583);
        C14360o3.A07(string);
        c189458aP.A07 = string;
        c189448aO.A06(c189458aP.A00());
        c189448aO.A00().A02(requireActivity, c38909HBg);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "hide_specific_words");
        if (A00.isSampled()) {
            String A38 = c38321qM.A38();
            if (A38 != null && (A0k = AbstractC003100w.A0k(10, A38)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A00.A9K("ig_media_id", Long.valueOf(j));
            A00.AAP("media_type", c38321qM.BRp().toString());
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l = AbstractC003100w.A0k(10, A2E.getId());
            } else {
                l = null;
            }
            A00.A9K("author_id_int", l);
            A00.AAP("inventory_source", c38321qM.A0C.BJN());
            A00.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
            A00.AAP("module", interfaceC60442pS.getModuleName());
            A00.Cht();
        }
    }

    public final void A02(C38321qM c38321qM, VG2 vg2, MRA mra, String str, String str2) {
        UserSession userSession = this.A01;
        WEz A01 = AbstractC69993VzD.A01(this.A00.requireActivity(), this.A05, userSession, EnumC65855TvH.A0a, vg2, str);
        A01.A01 = c38321qM.A2E(userSession);
        A01.A08(mra);
        A01.A09("shopping_session_id", this.A06);
        A01.A09("inventory_source", c38321qM.A0C.BJN());
        if (str2 == null) {
            str2 = "";
        }
        A01.A09(AbstractC111324zv.A00(2770), str2);
        A01.A06();
    }

    public C692539l(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C1Y1 c1y1, String str) {
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = c1y1;
        this.A03 = interfaceC65282xQ;
        this.A05 = interfaceC60442pS;
        this.A06 = str;
    }
}
