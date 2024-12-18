package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import go.Seq;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LnT implements MRL {
    public K2I A00;
    public MessageActionsViewModel A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final LRZ A04;
    public final Jn5 A05;
    public final C7IK A06;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // X.MRL
    public final void CJF(Integer num, String str, boolean z) {
        C81543kP A0g;
        String str2;
        C141796aw A00;
        java.util.Set set;
        AnonymousClass191 anonymousClass191;
        InterfaceC16620sF c50122MBw;
        C81543kP A0g2;
        String str3;
        String str4;
        C05A c05a;
        int i;
        C81543kP A0g3;
        String str5;
        C14360o3.A0B(num, 0);
        K2I k2i = this.A00;
        if (k2i == null) {
            return;
        }
        switch (num.intValue()) {
            case 1:
                Jn5 jn5 = this.A05;
                String str6 = k2i.A05;
                String str7 = k2i.A04;
                C14360o3.A0B(str6, 0);
                C167297di A01 = AbstractC166327c1.A01(AbstractC25228BEl.A0s(jn5.A05), str6, str7);
                if (A01 != null) {
                    Jn5.A00(A01, jn5);
                    LKh lKh = jn5.A08;
                    boolean A1W = AbstractC167007dF.A1W(str7);
                    C2EC A002 = LKh.A00(lKh);
                    if (A002 != null && (A0g = AbstractC31172DnG.A0g(A002)) != null) {
                        C09530e4 A02 = LKh.A02(lKh);
                        C09530e4 A03 = LKh.A03(lKh, A0g, A002);
                        if (A1W) {
                            str2 = "True";
                        } else {
                            str2 = "False";
                        }
                        AbstractC31172DnG.A0d(lKh.A04).A0W("comments_sheet_rendered", "tap", "comment_options_reply", "comments_view", A002.C7I(), A002.C7q(), AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str2, A02, A03)), A002.AdZ());
                    }
                }
                L46 l46 = this.A04.A03;
                l46.A03.post(new M0M(l46));
                return;
            case 3:
                Jn5 jn52 = this.A05;
                String str8 = k2i.A05;
                String str9 = k2i.A04;
                User user = k2i.A03;
                AbstractC167007dF.A1D(str8, 0, user);
                C46099Kaz c46099Kaz = new C46099Kaz(jn52, str8, str9);
                JSONObject A0q = AbstractC31171DnF.A0q();
                try {
                    A0q.put("comment_id", str8).put("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                } catch (JSONException unused) {
                }
                jn52.A0D.Egh(new K2J(user, EnumC65855TvH.A0J, VG2.A07, c46099Kaz, str8, str8, str9, jn52.A03.A0F, A0q));
                LKh lKh2 = jn52.A08;
                boolean A1W2 = AbstractC167007dF.A1W(str9);
                C2EC A003 = LKh.A00(lKh2);
                if (A003 == null || (A0g3 = AbstractC31172DnG.A0g(A003)) == null) {
                    return;
                }
                C142846ck A0d = AbstractC31172DnG.A0d(lKh2.A04);
                int AdZ = A003.AdZ();
                String C7I = A003.C7I();
                String C7q = A003.C7q();
                String A004 = lKh2.A01.A00();
                String A012 = LKh.A01(lKh2, A0g3, A003);
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (!AbstractC25226BEj.A1Z(A0I)) {
                    return;
                }
                C09530e4 A1L = AbstractC166987dD.A1L("message_client_context_id", A004);
                C09530e4 A1L2 = AbstractC166987dD.A1L("user_type", A012);
                if (A1W2) {
                    str5 = "True";
                } else {
                    str5 = "False";
                }
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_reply", str5, A1L, A1L2));
                AbstractC31175DnJ.A1B(A0I, A0d);
                AbstractC31174DnI.A1I(A0I, "report_comment_sheet_rendered");
                A0I.A0o("comment_options_report");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "comments_view", C7I, C7q, AdZ), A07);
                return;
            case 5:
                Jn5 jn53 = this.A05;
                String str10 = k2i.A05;
                String str11 = k2i.A04;
                User user2 = k2i.A03;
                AbstractC167007dF.A1D(str10, 0, user2);
                LKh lKh3 = jn53.A08;
                boolean A1W3 = AbstractC167007dF.A1W(str11);
                Boolean valueOf = Boolean.valueOf(A1W3);
                C2EC A005 = LKh.A00(lKh3);
                if (A005 != null && (A0g2 = AbstractC31172DnG.A0g(A005)) != null) {
                    C142846ck A0d2 = AbstractC31172DnG.A0d(lKh3.A04);
                    int AdZ2 = A005.AdZ();
                    String C7I2 = A005.C7I();
                    String C7q2 = A005.C7q();
                    String A006 = lKh3.A01.A00();
                    String A013 = LKh.A01(lKh3, A0g2, A005);
                    C25531Mh A0I2 = AbstractC31172DnG.A0I(A0d2);
                    if (AbstractC25226BEj.A1Z(A0I2)) {
                        String str12 = "False";
                        LinkedHashMap A072 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("is_bulk_deletion", "False", AbstractC166987dD.A1L("message_client_context_id", A006), AbstractC166987dD.A1L("user_type", A013)));
                        if (valueOf != null) {
                            if (A1W3) {
                                str12 = "True";
                            }
                            A072.put("is_reply", str12);
                        }
                        AbstractC31175DnJ.A1B(A0I2, A0d2);
                        AbstractC31174DnI.A1I(A0I2, AbstractC111324zv.A00(4250));
                        A0I2.A0o("comment_options_remove");
                        AbstractC31175DnJ.A1C(A0I2, AbstractC31179DnN.A0a(A0I2, "comments_view", C7I2, C7q2, AdZ2), A072);
                    }
                }
                L1C l1c = jn53.A0B;
                A00 = AbstractC141776au.A00(jn53);
                C05A c05a2 = jn53.A0D;
                C14360o3.A0B(c05a2, 4);
                java.util.Set A16 = AbstractC43592JPx.A16(str10);
                if (str11 != null) {
                    set = AbstractC43592JPx.A16(str11);
                } else {
                    set = C16910sj.A00;
                }
                C51760Mtj c51760Mtj = new C51760Mtj(A16, set, AbstractC43592JPx.A16(user2));
                Integer num2 = C05F.A01;
                C50119MBt c50119MBt = new C50119MBt(c51760Mtj, c05a2, l1c, null, 5);
                anonymousClass191 = AnonymousClass191.A00;
                l1c.A02.put(c51760Mtj, AbstractC23641Du.A03(num2, anonymousClass191, c50119MBt, A00));
                c05a2.Egh(new K2F(c51760Mtj));
                l1c.A00.A0S((java.util.Set) c51760Mtj.A01, (java.util.Set) c51760Mtj.A02);
                r4.A00--;
                AbstractC23641Du.A05(anonymousClass191, new MBo(l1c.A01, null, 29), A00);
                c50122MBw = new C50122MBw(c51760Mtj, c05a2, l1c, null, 42);
                AbstractC23641Du.A05(anonymousClass191, c50122MBw, A00);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                Jn5 jn54 = this.A05;
                this.A02.requireContext();
                jn54.A06(k2i.A05, k2i.A04, k2i.A03.getId(), k2i.A07);
                return;
            case 37:
                AbstractC59962oe abstractC59962oe = this.A02;
                C50674MYs c50674MYs = new C50674MYs(abstractC59962oe.requireContext(), this.A03);
                c50674MYs.A05 = true;
                MessageActionsViewModel messageActionsViewModel = this.A01;
                if (messageActionsViewModel == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                for (LongPressActionData longPressActionData : messageActionsViewModel.A0O) {
                    ViewOnClickListenerC35672Fp7 viewOnClickListenerC35672Fp7 = new ViewOnClickListenerC35672Fp7(0, longPressActionData, this, z);
                    boolean A1X = AbstractC167007dF.A1X(longPressActionData.A01, EnumC46221Kcx.A07);
                    String str13 = longPressActionData.A04;
                    if (A1X) {
                        c50674MYs.A09(str13, viewOnClickListenerC35672Fp7);
                    } else {
                        c50674MYs.A0B(str13, viewOnClickListenerC35672Fp7);
                    }
                }
                new C31727DwY(c50674MYs).A05(abstractC59962oe.requireActivity());
                return;
            case Seq.NULL_REFNUM /* 41 */:
                Jn5 jn55 = this.A05;
                String str14 = k2i.A05;
                String str15 = k2i.A04;
                C14360o3.A0B(str14, 0);
                C47642L2b c47642L2b = jn55.A0A;
                A00 = AbstractC141776au.A00(jn55);
                C05A c05a3 = jn55.A0D;
                C14360o3.A0B(c05a3, 3);
                Integer num3 = C05F.A01;
                C50109MAf c50109MAf = new C50109MAf(c47642L2b, str14, str15, null, 0);
                anonymousClass191 = AnonymousClass191.A00;
                c47642L2b.A02.put(str14, AbstractC23641Du.A03(num3, anonymousClass191, c50109MAf, A00));
                c47642L2b.A00.A0N(str14, str15);
                c05a3.Egh(new K2H(str14, str15, 0));
                c50122MBw = new MC9(c47642L2b, c05a3, str14, (InterfaceC23621Ds) null, 34);
                AbstractC23641Du.A05(anonymousClass191, c50122MBw, A00);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Jn5 jn56 = this.A05;
                str3 = k2i.A05;
                str4 = k2i.A04;
                C14360o3.A0B(str3, 0);
                Jn5.A02(jn56, str3, "unhide_comment_click");
                c05a = jn56.A0D;
                i = 1;
                c05a.Egh(new K2H(str3, str4, i));
                return;
            case 43:
                Jn5 jn57 = this.A05;
                str3 = k2i.A05;
                str4 = k2i.A04;
                C14360o3.A0B(str3, 0);
                c05a = jn57.A0D;
                i = 2;
                c05a.Egh(new K2H(str3, str4, i));
                return;
            default:
                return;
        }
    }

    @Override // X.MRL
    public final void DBP() {
    }

    @Override // X.MRL
    public final void DDn() {
    }

    @Override // X.MRL
    public final void DEq() {
    }

    @Override // X.MRL
    public final void DXN() {
    }

    @Override // X.MRL
    public final void CJp(InterfaceC83713oG interfaceC83713oG, C3o9 c3o9, String str, String str2, String str3, Map map, Map map2, boolean z) {
        K2I k2i = this.A00;
        if (k2i != null) {
            Jn5 jn5 = this.A05;
            this.A02.requireContext();
            jn5.A06(k2i.A05, k2i.A04, k2i.A03.getId(), k2i.A07);
        }
    }

    @Override // X.MRL
    public final void D0E() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C30D.A04(abstractC59962oe.requireActivity(), C3WR.A01(new ContextThemeWrapper(abstractC59962oe.requireContext(), this.A06.A0E), R.attr.backgroundColorSecondary));
        LRZ lrz = this.A04;
        if (lrz.A00) {
            L46 l46 = lrz.A03;
            l46.A03.post(new M0O(l46));
        }
        Jn5 jn5 = this.A05;
        jn5.A04.A01();
        jn5.A0C.Egh(C48664Lfr.A00);
    }

    @Override // X.MRL
    public final void DAl() {
        this.A05.A05.A0D();
    }

    @Override // X.MRL
    public final void DB6() {
        C3DN A0r;
        FragmentActivity activity = this.A02.getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null && !((C3DP) A0r).A0h) {
            C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
            AbstractC56402iY.A02(activity, activity.getColor(R.color.fds_transparent));
        }
    }

    public LnT(AbstractC59962oe abstractC59962oe, UserSession userSession, LRZ lrz, Jn5 jn5, C7IK c7ik) {
        AbstractC43594JPz.A1P(userSession, jn5);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A04 = lrz;
        this.A05 = jn5;
        this.A06 = c7ik;
    }
}
