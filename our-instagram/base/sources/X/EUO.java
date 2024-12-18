package X;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EUO extends C1P1 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public EUO(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1890013686);
                EJL ejl = (EJL) this.A01;
                C9GR.A01(ejl.getContext(), null, 2131961897, 0);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = ejl.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Clv(new Y7A("profile_native_calling", ejl.A02, null, ejl.getString(2131961897), null, null, AbstractC06930Yk.A07(AbstractC25230BEn.A1b("is_profile_audio_call_enabled", String.valueOf(this.A02))), null));
                }
                i = -1018695263;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -815997508);
                super.onFail(abstractC115105If);
                i = 434572542;
                break;
            case 2:
                A03 = C0f9.A03(1706119605);
                C9GR.A04(AbstractC31172DnG.A07(this.A01));
                i = 1306310504;
                break;
            case 3:
                A03 = C0f9.A03(1823296178);
                AbstractC25235BEs.A1Q(((C35125FeS) this.A01).A04);
                i = 1838913006;
                break;
            case 4:
            default:
                super.onFail(abstractC115105If);
                return;
            case 5:
                A03 = C0f9.A03(1548923223);
                EM6 em6 = (EM6) this.A01;
                EM6.A01(em6);
                FOR r0 = em6.A09;
                if (r0 != null) {
                    FB3.A00(r0);
                }
                i = -867279801;
                break;
            case 6:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1454643549);
                super.onFail(abstractC115105If);
                C33223ElB c33223ElB = (C33223ElB) this.A01;
                C36731GHa c36731GHa = c33223ElB.A02;
                if (c36731GHa != null) {
                    c36731GHa.A0D = !this.A02;
                }
                C33223ElB.A01(c33223ElB);
                i = 238744023;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-1480294881);
                C56352iT c56352iT = ((ELG) this.A01).A02;
                if (c56352iT == null) {
                    C14360o3.A0F("actionBarService");
                    throw C00O.createAndThrow();
                }
                c56352iT.setIsLoading(false);
                i = -1204393710;
                break;
            case 3:
            case 4:
            default:
                super.onFinish();
                return;
            case 5:
                A03 = C0f9.A03(75322638);
                FOR r0 = ((EM6) this.A01).A09;
                if (r0 != null) {
                    FB3.A00(r0);
                }
                i = -1821256362;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(758339212);
                C56352iT c56352iT = ((ELG) this.A01).A02;
                if (c56352iT == null) {
                    C14360o3.A0F("actionBarService");
                    throw C00O.createAndThrow();
                }
                c56352iT.setIsLoading(true);
                i = -1557238532;
                break;
            case 3:
            case 4:
            default:
                super.onStart();
                return;
            case 5:
                A03 = C0f9.A03(-2004890658);
                FOR r1 = ((EM6) this.A01).A09;
                if (r1 != null) {
                    IgImageView igImageView = r1.A08;
                    igImageView.setAlpha(0.5f);
                    TextView textView = r1.A03;
                    textView.setAlpha(0.5f);
                    IgImageView igImageView2 = r1.A09;
                    igImageView2.setAlpha(0.5f);
                    igImageView2.setOnClickListener(null);
                    igImageView.setOnClickListener(null);
                    textView.setOnClickListener(null);
                }
                i = -113542780;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(883469285);
                int A032 = C0f9.A03(324691575);
                EJL ejl = (EJL) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = ejl.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Clu(new Y7A("profile_native_calling", ejl.A02, "profile_native_calling", null, null, null, AbstractC06930Yk.A07(AbstractC25230BEn.A1b("is_profile_audio_call_enabled", String.valueOf(this.A02))), null));
                }
                C0f9.A0A(-655728960, A032);
                i = -1999114162;
                break;
            case 1:
                A03 = C0f9.A03(-524356785);
                int A0N = AbstractC167017dG.A0N(obj, -27573190);
                super.onSuccess(obj);
                InterfaceC09390do interfaceC09390do = ((C32299EKm) this.A01).A01;
                User A0U = AbstractC31178DnM.A0U(interfaceC09390do);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                boolean z = this.A02;
                C6XI.A00(A0r, A0U, z);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(AbstractC166987dD.A0o(interfaceC09390do), "collab_status_fragment"), "ig_creator_connections_events");
                if (z) {
                    str = "toggle_on";
                } else {
                    str = "toggle_off";
                }
                AbstractC31171DnF.A1B(A0f, str);
                A0f.A8R(AbstractC100604fP.A00(AbstractC166987dD.A0r(interfaceC09390do)), "project");
                A0f.AAP("target", "edit_settings");
                A0f.A8R(EnumC33488ErN.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
                A0f.Cht();
                C0f9.A0A(-1930335210, A0N);
                i = 661392851;
                break;
            case 2:
                A03 = C0f9.A03(-126549675);
                int A033 = C0f9.A03(-1410880865);
                ELG elg = (ELG) this.A01;
                if (!elg.A08) {
                    AbstractC31174DnI.A1O(AbstractC31176DnK.A0Q(elg.A0D), C05F.A01);
                }
                if (this.A02) {
                    AbstractC25226BEj.A1Q(elg);
                }
                C0f9.A0A(1652544339, A033);
                i = -2066153838;
                break;
            case 3:
                A03 = C0f9.A03(-735853476);
                C67843UzG c67843UzG = (C67843UzG) obj;
                int A034 = C0f9.A03(643117231);
                if (c67843UzG != null) {
                    C35125FeS c35125FeS = (C35125FeS) this.A01;
                    UserSession userSession = c35125FeS.A03;
                    String str3 = c35125FeS.A01.A0H;
                    GWg A00 = c67843UzG.A00(userSession, str3);
                    if (A00 instanceof GroupLinkPreviewResponse$Success) {
                        GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) A00;
                        String str4 = groupLinkPreviewResponse$Success.A0A;
                        if (str4 != null && str4.length() != 0) {
                            AbstractC25235BEs.A1Q(c35125FeS.A04);
                            C36881nl A01 = C36881nl.A01(c35125FeS.A00, c35125FeS.A02, userSession, "inbox_notes_tray");
                            AbstractC31179DnN.A1R(A01, str4);
                            AbstractC31174DnI.A1P(A01);
                        } else if (!this.A02 && C18U.A06(C06090Tz.A05, userSession, 36323191257443397L)) {
                            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
                            A0M.A0B("direct_v2/join_thread_via_note_chat/");
                            A0M.A9s("note_id", str3);
                            C1ON A0S = AbstractC31172DnG.A0S(A0M, EBV.class, C34795FUx.class);
                            C31456Ds0.A00(A0S, groupLinkPreviewResponse$Success, c35125FeS, 19);
                            C1GJ.A04(A0S, 1695661322);
                        } else {
                            C35125FeS.A00(c35125FeS, groupLinkPreviewResponse$Success);
                        }
                    }
                }
                C0f9.A0A(1203169535, A034);
                i = -750474669;
                break;
            case 4:
                A03 = C0f9.A03(-1107434445);
                int A035 = C0f9.A03(-95997922);
                EM6 em6 = (EM6) this.A01;
                SavedCollection savedCollection = em6.A0C;
                if (savedCollection != null) {
                    boolean z2 = this.A02;
                    UserSession userSession2 = em6.A05;
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(em6, userSession2), "ig_collections");
                    boolean isSampled = A0f2.isSampled();
                    if (!z2) {
                        if (isSampled) {
                            A0f2.AAP("module_name", em6.getModuleName());
                            str2 = "collection_like";
                            AbstractC25233BEq.A17(A0f2, "collection_type", AbstractC31180DnO.A0d(A0f2, savedCollection, "event", str2));
                            AbstractC35089Fd0.A02(A0f2, userSession2, savedCollection);
                        }
                    } else if (isSampled) {
                        A0f2.AAP("module_name", em6.getModuleName());
                        str2 = "collection_unlike";
                        AbstractC25233BEq.A17(A0f2, "collection_type", AbstractC31180DnO.A0d(A0f2, savedCollection, "event", str2));
                        AbstractC35089Fd0.A02(A0f2, userSession2, savedCollection);
                    }
                }
                C0f9.A0A(-1404922762, A035);
                i = 1190463070;
                break;
            case 5:
                A03 = C0f9.A03(1315838223);
                int A036 = C0f9.A03(366343863);
                Fragment fragment = (Fragment) this.A01;
                if (fragment.isResumed() && fragment.mView != null && fragment.getContext() != null && this.A02) {
                    C9GR.A07(fragment.requireContext(), 2131972811);
                }
                C0f9.A0A(-623039875, A036);
                i = -981006376;
                break;
            default:
                A03 = C0f9.A03(944868799);
                C3DC c3dc = (C3DC) obj;
                int A0N2 = AbstractC167017dG.A0N(c3dc, 923723626);
                super.onSuccess(c3dc);
                C33223ElB c33223ElB = (C33223ElB) this.A01;
                c33223ElB.A05 = Boolean.valueOf(((C32037E5p) c3dc.F7f()).A00);
                C31349DqE c31349DqE = c33223ElB.A01;
                if (c31349DqE != null) {
                    AbstractC31177DnL.A1L(c31349DqE);
                    c33223ElB.A01 = null;
                }
                C0f9.A0A(933845336, A0N2);
                i = -202530366;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
