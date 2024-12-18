package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Fga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35241Fga {
    public static final C35241Fga A00 = new Object();

    public static final void A01(EnumC33507Erg enumC33507Erg, UserSession userSession, String str) {
        long parseLong;
        EnumC222416a A0I;
        EnumC33467Er2 enumC33467Er2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_identity_product");
        A0f.AAP("fx_im_logger_events", str);
        A0f.AAP("flow_type", "business_reminders");
        A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
        A0f.A9K("initiator_account_id", AbstractC25231BEo.A0j(0, userSession.userId));
        A0f.A8R(enumC33507Erg, "type_of_reminder");
        HashMap A1G = AbstractC166987dD.A1G();
        try {
            parseLong = Long.parseLong(userSession.userId);
            A0I = AbstractC166997dE.A0Y(userSession).A0I();
        } catch (NumberFormatException e) {
            C0w9.A03("FxImLogger", AbstractC166997dE.A0y("Error parsing userid to long: ", e));
            A1G = null;
        }
        if (EnumC222416a.A06 == A0I) {
            enumC33467Er2 = EnumC33467Er2.IG_CREATOR;
        } else if (EnumC222416a.A05 == A0I) {
            enumC33467Er2 = EnumC33467Er2.IG_BUSINESS;
        } else {
            C0w9.A03("FxImLogger", AbstractC167017dG.A0n(A0I, "UserAccountType expected to be MEDIA_CREATOR or BUSINESS, but got: ", AbstractC166987dD.A1C()));
            A1G = null;
            A0f.A9M("target_identity_info", A1G);
            A0f.Cht();
        }
        A1G.put(Long.valueOf(parseLong), enumC33467Er2);
        A0f.A9M("target_identity_info", A1G);
        A0f.Cht();
    }

    public static final void A02(EnumC33507Erg enumC33507Erg, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_identity_product");
        A0f.AAP("fx_im_logger_events", str);
        A0f.AAP("flow_type", AbstractC111324zv.A00(3007));
        A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
        A0f.A9K("initiator_account_id", AbstractC25231BEo.A0j(0, userSession.userId));
        A0f.A8R(enumC33507Erg, "type_of_reminder");
        A0f.Cht();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final HashMap A00(ImmutableList immutableList, ImmutableList immutableList2) {
        EnumC33468Er3 enumC33468Er3;
        HashMap A1G = AbstractC166987dD.A1G();
        if (immutableList.size() == immutableList2.size()) {
            int size = immutableList2.size();
            for (int i = 0; i < size; i++) {
                E e = immutableList.get(i);
                C14360o3.A07(e);
                VHf vHf = (VHf) e;
                int ordinal = vHf.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    vHf = VHf.AVATAR;
                }
                E e2 = immutableList2.get(i);
                C14360o3.A07(e2);
                if (((EnumC33433Eq4) e2).ordinal() == 1) {
                    enumC33468Er3 = EnumC33468Er3.FACEBOOK;
                } else {
                    enumC33468Er3 = EnumC33468Er3.INSTAGRAM;
                }
                A1G.put(vHf, enumC33468Er3);
            }
        }
        return A1G;
    }

    public static final void A03(UserSession userSession, String str, String str2, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_identity_product");
        if (A0f.isSampled()) {
            A0f.AAP("fx_im_logger_events", str);
            A0f.AAP("flow_type", str2);
            A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
            A0f.A9K("initiator_account_id", AbstractC25231BEo.A0j(0, userSession.userId));
            A0f.A9K("target_identity_id", null);
            A0f.A9M("target_identity_resource_source_of_truth", map);
            A0f.Cht();
        }
    }
}
