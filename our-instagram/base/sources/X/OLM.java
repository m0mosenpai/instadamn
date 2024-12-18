package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import kotlin.Deprecated;

/* loaded from: classes9.dex */
public final class OLM {
    public final C18920wW A00;

    public OLM(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    @Deprecated(message = "For all future logs use logUpsellsEvent")
    public final void A01(String str, String str2, String str3) {
        C14360o3.A0B(str3, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_wellbeing_upsells_impression");
        if (A0f.isSampled()) {
            Map A0n = AbstractC167007dF.A0n("nav_chain", AbstractC25225BEi.A14());
            A0f.AAP("surface", str);
            A0f.AAP("entrypoint", str3);
            A0f.A9M("extra_values", A0n);
            if (str2 != null) {
                MSX.A1H(A0f, str2);
            }
            A0f.Cht();
        }
    }

    @Deprecated(message = "For all future logs use logUpsellsEvent")
    public final void A02(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str3, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(4705));
        if (A0f.isSampled()) {
            Map A0n = AbstractC167007dF.A0n("nav_chain", AbstractC25225BEi.A14());
            A0f.AAP("surface", str);
            AbstractC31171DnF.A1A(A0f, str4);
            A0f.AAP("entrypoint", str3);
            A0f.A9M("extra_values", A0n);
            if (str2 != null) {
                MSX.A1H(A0f, str2);
            }
            A0f.Cht();
        }
    }

    public final void A00(EnumC39589Hdz enumC39589Hdz, EnumC72375XcB enumC72375XcB, Integer num, Integer num2, String str, Map map) {
        String str2;
        String str3;
        String str4;
        AbstractC167017dG.A1S(enumC72375XcB, map);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC43591JPw.A00(1063));
        if (A0f.isSampled()) {
            map.put("nav_chain", AbstractC25225BEi.A14());
            switch (num.intValue()) {
                case 0:
                    str2 = "undo_snackbar";
                    break;
                case 1:
                    str2 = "bottom_sheet";
                    break;
                case 2:
                    str2 = "main_app";
                    break;
                default:
                    str2 = "messages_screen";
                    break;
            }
            A0f.AAP("surface", str2);
            switch (num2.intValue()) {
                case 0:
                    str3 = "display_bottomsheet";
                    break;
                case 1:
                    str3 = "dismiss_bottomsheet";
                    break;
                case 2:
                    str3 = "save_setting";
                    break;
                case 3:
                    str3 = "save_setting_success";
                    break;
                case 4:
                    str3 = "save_setting_failed";
                    break;
                case 5:
                    str3 = "display_undo_snackbar";
                    break;
                case 6:
                    str3 = "click_undo_snackbar";
                    break;
                case 7:
                    str3 = "undo_setting_success";
                    break;
                case 8:
                    str3 = "undo_setting_failed";
                    break;
                case 9:
                    str3 = "link_clicked";
                    break;
                case 10:
                    str3 = "remove_tag";
                    break;
                case 11:
                    str3 = AbstractC43591JPw.A00(906);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str3 = "null_view_model";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str3 = "sync_setting";
                    break;
                case 14:
                    str3 = "sync_setting_failed";
                    break;
                default:
                    str3 = "do_not_show_bottomsheet";
                    break;
            }
            AbstractC31171DnF.A1A(A0f, str3);
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC72375XcB.A00);
            if (enumC39589Hdz == null || (str4 = enumC39589Hdz.A00) == null) {
                str4 = "";
            }
            A0f.AAP("entrypoint", str4);
            A0f.A9M("extra_values", map);
            if (str != null) {
                MSX.A1H(A0f, str);
            }
            A0f.Cht();
        }
    }
}
