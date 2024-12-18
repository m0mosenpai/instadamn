package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.user.model.User;

/* renamed from: X.Oej, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55220Oej {
    public static final C55220Oej A00 = new Object();

    public static final void A02(Context context, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(str, 3);
        c38321qM.A0C.Efg(Boolean.valueOf(z));
        c38321qM.AEH(userSession);
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            AbstractC37301Gc2.A1M(A0c, "clips/item/set_third_party_downloads_enabled/", A2u);
            A0c.A0I("third_party_downloads_enabled", z);
            C1ON A0K = AbstractC31178DnM.A0K(A0c, "container_module", str);
            A0K.A00 = new C52220N9j(3, context, userSession, c38321qM, z);
            C1GJ.A03(A0K);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(Context context, UserSession userSession, String str, boolean z) {
        int A06 = AbstractC167007dF.A06(1, userSession, str);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        A0Y.A1G(z);
        A0Y.A0c(userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC31173DnH.A1N(A0c);
        A0c.A0B("clips/user/set_third_party_downloads_enabled/");
        A0c.A0I("third_party_downloads_enabled", z);
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "container_module", str);
        A0T.A00 = new C52220N9j(A06, context, userSession, A0Y, z);
        C1GJ.A03(A0T);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C55220Oej c55220Oej, String str, String str2, boolean z) {
        int i;
        BQL bql;
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        C54789OJg c54789OJg = new C54789OJg(fragmentActivity, supportFragmentManager, userSession, c38321qM, interfaceC60442pS, c75113Zb, new C54309NzT(), z);
        if (c55220Oej.A0A(userSession, c38321qM)) {
            if (C2TN.A02(userSession, c38321qM)) {
                c54789OJg.A00();
            } else {
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                    A0M.A0R(C52082N2i.class, OOF.class);
                    AbstractC37301Gc2.A1M(A0M, "clips/item/check_third_party_downloads_eligibility/", A2u);
                    C1ON A0N = A0M.A0N();
                    MWM.A00(A0N, fragmentActivity, c54789OJg, 25);
                    C1GJ.A03(A0N);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        } else {
            C9GR.A0F(fragmentActivity, "server_based_download_eligibility_check_failed", 2131974297);
        }
        if (c75113Zb != null) {
            i = c75113Zb.getPosition();
        } else {
            i = -1;
        }
        if (C2TN.A02(userSession, c38321qM)) {
            bql = BQL.A13;
        } else {
            bql = BQL.A14;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_save_to_camera_roll");
        AbstractC37300Gc1.A0e(bql, A0f);
        AbstractC25225BEi.A1M(EnumC120795dP.A0W, A0f);
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        String id = c38321qM.getId();
        if (id != null) {
            A0f.AAP("media_compound_key", id);
            AbstractC25230BEn.A1C(A0f, i);
            AbstractC25225BEi.A1P(A0f, str);
            AbstractC25234BEr.A10(A0f, c38321qM);
            A0f.AAP("viewer_init_media_compound_key", str2);
            A0f.A7v("is_audio_muted", AbstractC31172DnG.A0s(z));
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A0A(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM != null && !AbstractC92574Cr.A04(AbstractC25226BEj.A0u(c38321qM)) && A06(userSession, c38321qM)) {
            if (!C2TN.A02(userSession, c38321qM)) {
                C17050sx A01 = C57537PgB.A01(c38321qM, 3);
                if (AbstractC166997dE.A1Z(c38321qM.A0C.CeL(), true) && A08(AbstractC25226BEj.A14(c38321qM)) && c38321qM.A1x() == EnumC76383bi.A06 && !AbstractC166987dD.A1a(A01.getValue()) && AbstractC54310NzU.A00(userSession).booleanValue()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void A00(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C54798OJr c54798OJr, boolean z, boolean z2) {
        String str;
        VideoUrlImpl A002 = AbstractC88593xJ.A00(c54798OJr.A07.CFR());
        if (A002 != null) {
            str = A002.A06;
        } else {
            str = null;
        }
        C55937OsT c55937OsT = new C55937OsT(context, abstractC10360h2, userSession, interfaceC60442pS, c75113Zb, c54798OJr, c54798OJr.A08, z, z2);
        C1QY A003 = MSY.A0J().A00();
        if (str != null) {
            C14M.A03().A06(c55937OsT, A003, C2n4.A09.E3L(str), userSession);
        }
    }

    public static final void A01(Context context, UserSession userSession, C38321qM c38321qM, C54798OJr c54798OJr) {
        C41451vu c41451vu;
        InterfaceC41471vw c3kd;
        if (C18U.A06(C06090Tz.A05, userSession, 36326386713114465L)) {
            C54971OTd c54971OTd = new C54971OTd((C49490Lu3) null, new P3S(AbstractC166987dD.A0O(context), c38321qM, c54798OJr));
            c41451vu = C41451vu.A01;
            c3kd = new C3KH(c54971OTd);
        } else {
            c41451vu = C41451vu.A01;
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            A0Y.A09 = c38321qM.A1S();
            A0Y.A03();
            AbstractC31172DnG.A1H(context.getResources(), A0Y, 2131955212);
            c3kd = new C3KD(A0Y.A00());
        }
        c41451vu.E4s(c3kd);
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM) {
        C17050sx A01 = AbstractC09440dt.A01(new D8K(43, c38321qM, userSession));
        if (c38321qM.A5P() && !c38321qM.CdW() && !AbstractC166987dD.A1a(A01.getValue())) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, boolean z) {
        if (z && C18U.A06(C06090Tz.A05, userSession, 36317947102631643L)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(User user) {
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads;
        if (user != null) {
            iGUserThirdPartyDownloads = user.A03.C75();
        } else {
            iGUserThirdPartyDownloads = null;
        }
        if (iGUserThirdPartyDownloads == IGUserThirdPartyDownloads.A05 && C2TN.A06(user)) {
            return true;
        }
        return false;
    }

    public final void A09(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, String str, String str2, boolean z) {
        AbstractC167017dG.A1Q(userSession, str);
        if (Build.VERSION.SDK_INT < 33 && !AbstractC23451Ch.A07(fragmentActivity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AbstractC23451Ch.A04(fragmentActivity, new C56068Oul(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, str, str2, z), "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            A04(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, this, str, str2, z);
        }
    }

    public static final boolean A05(UserSession userSession) {
        if (C2TN.A06(AbstractC31178DnM.A0T(userSession)) && AbstractC166997dE.A0Y(userSession).A03.C75() == IGUserThirdPartyDownloads.A06 && !C18U.A06(C06090Tz.A05, userSession, 36317947102762716L) && AbstractC54310NzU.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }
}
