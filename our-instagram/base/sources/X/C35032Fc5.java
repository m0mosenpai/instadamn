package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fc5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35032Fc5 {
    public final DirectThreadKey A00;

    public final String A01(UserSession userSession) {
        List list;
        C14360o3.A0B(userSession, 0);
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey == null || (list = directThreadKey.A02) == null) {
            return null;
        }
        if (list.isEmpty()) {
            return userSession.userId;
        }
        return (String) AbstractC001800i.A0O(list, 0);
    }

    public final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EC c2ec, Integer num) {
        String str;
        String str2;
        C7P1 c7p1;
        C7P2 c7p2;
        int i;
        String A00;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1E(context, 1, interfaceC11380iw);
        String str3 = userSession.userId;
        if (c2ec.BSH().size() > 0) {
            str = AbstractC31171DnF.A0g(c2ec.BSH().get(0));
        } else {
            str = null;
        }
        String C7I = c2ec.C7I();
        List Axh = c2ec.Axh();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (Axh != null) {
            Iterator it = Axh.iterator();
            while (it.hasNext()) {
                Object obj = ((C206419By) it.next()).A01;
                if (obj == C05F.A0Y) {
                    i = 3918;
                } else {
                    Integer num2 = C05F.A0j;
                    String A002 = AbstractC111324zv.A00(5027);
                    if (obj != num2) {
                        if (obj == C05F.A0u) {
                            i = 5048;
                        } else if (obj == C05F.A15) {
                            i = 5028;
                        } else {
                            if (obj != C05F.A02) {
                                if (obj == C05F.A03) {
                                    A00 = "important";
                                } else if (obj == C05F.A04) {
                                    A00 = "follow_up";
                                } else if (obj != C05F.A05) {
                                    if (obj == C05F.A06) {
                                    }
                                }
                                A1E.add(A00);
                            }
                            A1E.add("lead");
                        }
                    }
                    A1E.add(A002);
                }
                A00 = AbstractC111324zv.A00(i);
                A1E.add(A00);
            }
        }
        if (new C31233DoG(userSession, c2ec.BLY(), c2ec, AbstractC31273Dov.A00(context, userSession)).CUy() && AbstractC31235DoI.A01(userSession)) {
            A1E.add("flag");
        }
        if (str != null && C7I != null) {
            String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E);
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("seller_id", str3);
            A1G.put("buyer_id", str);
            A1G.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7I);
            A1G.put(AbstractC111324zv.A00(4808), join);
            Integer num3 = C05F.A00;
            if (num == num3) {
                str2 = "inbox_action_sheet";
            } else {
                str2 = "tas_upsell";
            }
            A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            C23031Ai A003 = AbstractC23021Ah.A00(userSession);
            if (!A003.A1t()) {
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(4130), A1G);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                A0C.A0i = true;
                AbstractC31173DnH.A0Z(AbstractC13330mJ.A00(context), W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks").A0C(context);
                A003.A0P();
            } else if (num == num3) {
                AbstractC34058F1l.A00(userSession).A00(context, str, "IG_TAS_SCREEN_IN_THREAD_LIST", A1G, new ME7(41, context, this, A1G, userSession), true);
            } else {
                A00(context, userSession, A1G);
            }
            C7P0 c7p0 = new C7P0(interfaceC11380iw, userSession);
            if (num == num3) {
                C14360o3.A0B(str3, 1);
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.INBOX_THREAD_ACTION_SHEET_ENTRYPOINT;
            } else {
                if (num != C05F.A01) {
                    return;
                }
                C14360o3.A0B(str3, 1);
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.UPSELL_YES_ENTRYPOINT;
            }
            C7P0.A01(null, c7p1, c7p2, c7p0, str, str3);
        }
    }

    public final void A03(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        String str;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1E(context, 1, interfaceC11380iw);
        C7OF c7of = C7OF.A00;
        if (c7of.A00(userSession)) {
            String A01 = A01(userSession);
            if (A01 != null && A01.length() != 0) {
                HashMap A1G = AbstractC166987dD.A1G();
                if (c7of.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36313299947882358L)) {
                    A1G.put("seller_deferred_onboarding", "true");
                }
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                A0C.A0R = "com.bloks.www.bloks.commerce.invoicecomposer";
                HashMap A1G2 = AbstractC166987dD.A1G();
                HashMap A1G3 = AbstractC166987dD.A1G();
                HashMap A1G4 = AbstractC166987dD.A1G();
                BitSet A0j = AbstractC31171DnF.A0j(1);
                A1G2.put("buyer_id", A01);
                A0j.set(0);
                if (!A1G.isEmpty()) {
                    A1G2.put("experiments", A1G);
                }
                AbstractC31171DnF.A1T("composer", A1G2);
                if (A0j.nextClearBit(0) >= 1) {
                    C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.bloks.commerce.invoicecomposer", A1G2, A1G3);
                    A0H.A03 = null;
                    A0H.A02 = null;
                    AbstractC31174DnI.A18(context, A0C, A0H, A1G4);
                    return;
                }
                throw AbstractC31173DnH.A0f();
            }
            return;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36315864043097751L)) {
            String A012 = A01(userSession);
            if (A012 != null && A012.length() != 0) {
                IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(userSession);
                A0C2.A0R = "com.bloks.www.biig.mcomm.ordercreation";
                HashMap A1G5 = AbstractC166987dD.A1G();
                HashMap A1G6 = AbstractC166987dD.A1G();
                HashMap A1G7 = AbstractC166987dD.A1G();
                BitSet A0j2 = AbstractC31171DnF.A0j(1);
                A1G5.put("buyer_id", A012);
                A0j2.set(0);
                A1G5.put("currency_code", WFD.A03(userSession).getCurrencyCode());
                if (A0j2.nextClearBit(0) >= 1) {
                    C66277U6x A0H2 = AbstractC31179DnN.A0H("com.bloks.www.biig.mcomm.ordercreation", A1G5, A1G6);
                    A0H2.A03 = null;
                    A0H2.A02 = null;
                    AbstractC31174DnI.A18(context, A0C2, A0H2, A1G7);
                } else {
                    throw AbstractC31173DnH.A0f();
                }
            }
        } else {
            FNU fnu = new FNU(userSession, context, A01(userSession));
            fnu.A04.A03(fnu.A01, fnu.A03);
            DirectThreadKey directThreadKey = this.A00;
            if (directThreadKey != null) {
                str = directThreadKey.A00;
            } else {
                str = null;
            }
            fnu.A00 = str;
        }
        if (num != C05F.A00) {
            return;
        }
        C18920wW A013 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        String A014 = A01(userSession);
        if (A014 == null) {
            return;
        }
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 0);
        AbstractC31181DnP.A0v(A013, "biig_order_management_composer_entrypoint_click", str2, A014);
    }

    public static final void A00(Context context, UserSession userSession, HashMap hashMap) {
        U60 A01 = W6d.A01(AbstractC31171DnF.A0C(userSession), C66277U6x.A01(AbstractC111324zv.A00(2091), hashMap));
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A03 = 0.7f;
        A0y.A00().A03(context, A01);
    }

    public C35032Fc5(DirectThreadKey directThreadKey) {
        this.A00 = directThreadKey;
    }
}
