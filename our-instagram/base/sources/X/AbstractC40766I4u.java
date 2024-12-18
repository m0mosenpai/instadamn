package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.I4u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40766I4u {
    public static final void A00(EnumC39633HiO enumC39633HiO, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, List list) {
        EnumC39645Hia enumC39645Hia;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "bi_ad_preferences_recent_ad_activity");
        Long A0j = AbstractC25231BEo.A0j(0, userSession.userId);
        if (A0j != null && A0f.isSampled()) {
            A0f.A9K("viewer_id", A0j);
            A0f.A8R(enumC39633HiO, "event_type");
            A0f.AAP(AbstractC111324zv.A00(2049), str);
            A0f.AAP("method_name", str2);
            A0f.AAk("ads", list);
            switch (AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).ordinal()) {
                case 1:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_0;
                    break;
                case 2:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_A;
                    break;
                case 3:
                case 6:
                case 8:
                case 9:
                case 10:
                default:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_NONE;
                    break;
                case 4:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_B;
                    break;
                case 5:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_C;
                    break;
                case 7:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_C_TEST;
                    break;
                case 11:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_P;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_SHARED;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    enumC39645Hia = EnumC39645Hia.BASIC_ADS_TIER_YOUTH;
                    break;
            }
            A0f.A8R(enumC39645Hia, "basic_ads_tier");
            A0f.Cht();
        }
    }
}
