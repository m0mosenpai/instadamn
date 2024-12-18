package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L9b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47794L9b {
    public final C18920wW A00;
    public final UserSession A01;

    public C47794L9b(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC31176DnK.A0O(userSession, "direct_thread");
    }

    public final void A02(MessageActionsViewModel messageActionsViewModel, C3o9 c3o9, String str, List list) {
        String str2;
        String str3;
        EnumC72424XdU enumC72424XdU;
        C14360o3.A0B(list, 3);
        C18920wW c18920wW = this.A00;
        C12180kM c12180kM = c18920wW.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c12180kM, "direct_long_press_message_menu_open");
        if (A00.isSampled()) {
            AbstractC31171DnF.A1C(A00, "long_press");
            A00.AAP("menu_ui", str);
            if (c3o9 != null) {
                str3 = AbstractC43827JZq.A01(c3o9);
            } else {
                str3 = null;
            }
            AbstractC31171DnF.A1H(A00, str3);
            String str4 = messageActionsViewModel.A0G;
            if (str4 == null) {
                str4 = String.valueOf(messageActionsViewModel.A07);
            }
            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            MessageIdentifier messageIdentifier = messageActionsViewModel.A08;
            A00.AAP("message_id", messageIdentifier.A01);
            int i = messageActionsViewModel.A02;
            EnumC72424XdU[] values = EnumC72424XdU.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC72424XdU = values[i2];
                    Long valueOf = Long.valueOf(enumC72424XdU.A00);
                    long j = i;
                    if (valueOf != null && valueOf.longValue() == j) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    enumC72424XdU = null;
                    break;
                }
            }
            A00.A8R(enumC72424XdU, "thread_subtype");
            A00.AAP("bot_response_id", messageActionsViewModel.A0D);
            A00.AAP("client_context", messageIdentifier.A00());
            A00.Cht();
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((LongPressActionData) it.next()).A03 == C05F.A0G) {
                    String str5 = messageActionsViewModel.A08.A01;
                    boolean z = messageActionsViewModel.A0Z;
                    InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, AbstractC111324zv.A00(877));
                    if (A002.isSampled()) {
                        AbstractC31171DnF.A1C(A002, "lp_impression");
                        A002.AAP("message_type", C2EY.A1i.toString());
                        A002.AAP("message_id", str5);
                        AbstractC31175DnJ.A1A(A002, z);
                        Long l = null;
                        if (c3o9 != null) {
                            str2 = AbstractC43827JZq.A01(c3o9);
                        } else {
                            str2 = null;
                        }
                        AbstractC31171DnF.A1H(A002, str2);
                        if (c3o9 != null) {
                            l = AbstractC43827JZq.A00(c3o9);
                        }
                        A002.A9K("occamadillo_thread_id", l);
                        A002.Cht();
                    }
                }
            }
        }
        C47986LJl.A00.A03(this.A01, c3o9, Boolean.valueOf(messageActionsViewModel.A0Z), messageActionsViewModel.A0B, messageActionsViewModel.A0A, null, null, messageActionsViewModel.A0H, null, 25, 1, messageActionsViewModel.A02);
    }

    public final void A00(EnumC72433Xdd enumC72433Xdd, AiStudioLoggingData aiStudioLoggingData, MessageActionsViewModel messageActionsViewModel, C3o9 c3o9, String str, String str2, String str3) {
        String str4;
        String str5;
        EnumC72424XdU enumC72424XdU;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(4283));
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "click");
            A0f.AAP("menu_ui", str2);
            A0f.AAP("menu_selection", str);
            if (c3o9 != null) {
                str5 = AbstractC43827JZq.A01(c3o9);
            } else {
                str5 = null;
            }
            AbstractC31171DnF.A1H(A0f, str5);
            String str6 = messageActionsViewModel.A0G;
            if (str6 == null) {
                str6 = String.valueOf(messageActionsViewModel.A07);
            }
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str6);
            MessageIdentifier messageIdentifier = messageActionsViewModel.A08;
            A0f.AAP("message_id", messageIdentifier.A01);
            int i = messageActionsViewModel.A02;
            EnumC72424XdU[] values = EnumC72424XdU.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC72424XdU = values[i2];
                    Long valueOf = Long.valueOf(enumC72424XdU.A00);
                    long j = i;
                    if (valueOf != null && valueOf.longValue() == j) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    enumC72424XdU = null;
                    break;
                }
            }
            A0f.A8R(enumC72424XdU, "thread_subtype");
            A0f.AAP("bot_response_id", messageActionsViewModel.A0D);
            A0f.AAP("client_context", messageIdentifier.A00());
            A0f.A8R(enumC72433Xdd, "thread_type");
            A0f.AAP("media_source", str3);
            if (messageActionsViewModel.A0P) {
                if (C18U.A06(C06090Tz.A05, this.A01, 36323672294239717L)) {
                    A0f.A9K("bot_id", AbstractC37302Gc3.A0W(messageActionsViewModel.A0H));
                    A0f.A8R(EnumC46265Kdx.A02, AbstractC111324zv.A00(4917));
                }
            }
            A0f.Cht();
        }
        C47986LJl c47986LJl = C47986LJl.A00;
        UserSession userSession = this.A01;
        c47986LJl.A03(userSession, c3o9, Boolean.valueOf(messageActionsViewModel.A0Z), messageActionsViewModel.A0B, messageActionsViewModel.A0A, null, null, messageActionsViewModel.A0H, str, 25, 0, messageActionsViewModel.A02);
        if (aiStudioLoggingData != null) {
            if (str.equals("forward") || str.equals("share")) {
                C28484Chc c28484Chc = new C28484Chc(userSession);
                String str7 = aiStudioLoggingData.A01;
                IGAIAgentType iGAIAgentType = aiStudioLoggingData.A00;
                if (C28484Chc.A05(iGAIAgentType)) {
                    C25531Mh A00 = C28484Chc.A00(c28484Chc);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0k("long_press_message_menu_forward");
                        Long l = null;
                        if (str7 != null) {
                            l = AbstractC166997dE.A0j(str7);
                        }
                        A00.A0i(l);
                        if (iGAIAgentType == null || (str4 = iGAIAgentType.A00) == null) {
                            str4 = "";
                        }
                        AbstractC25233BEq.A18(A00, "agent_type", str4);
                    }
                }
            }
        }
    }

    public final void A01(EnumC72433Xdd enumC72433Xdd, C2EY c2ey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        String str6;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_long_press_message");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "long_press");
            AbstractC31171DnF.A1G(A0f, str5);
            if (str4 == null) {
                str4 = String.valueOf(c2ey);
            }
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            A0f.AAP("message_id", str);
            if (c3o9 != null) {
                str6 = AbstractC43827JZq.A01(c3o9);
            } else {
                str6 = null;
            }
            AbstractC31171DnF.A1H(A0f, str6);
            A0f.AAP("client_context", str2);
            A0f.A8R(enumC72433Xdd, "thread_type");
            A0f.AAP("media_source", str3);
            A0f.Cht();
        }
    }
}
