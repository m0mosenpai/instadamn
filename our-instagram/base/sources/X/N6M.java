package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6M extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC58080Pp5, InterfaceC30955DjC {
    public static final String __redex_internal_original_name = "ClipsPeopleTagFragment";
    public View A00;
    public ListView A01;
    public TextView A02;
    public C22P A03;
    public ClipsSharingDraftViewModel A05;
    public PHB A06;
    public C50994Mg1 A07;
    public C32403EPe A08;
    public RoundedCornerFrameLayout A09;
    public Boolean A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public View A0L;
    public IgTextView A0M;
    public InterfaceC56392iX A0N;
    public String A0O;
    public boolean A0P;
    public C22P A04 = C22P.A5N;
    public final InterfaceC09390do A0Q = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019b, code lost:
    
        if (A05() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (X.AbstractC166987dD.A1b(A01()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d1, code lost:
    
        if (r9.size() >= 20) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01e3, code lost:
    
        if (X.AbstractC166987dD.A1b(r9) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.AbstractC166987dD.A1b(A00()) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0185, code lost:
    
        if ((requireActivity().getResources().getConfiguration().screenLayout & 15) != 1) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(java.util.List r9) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6M.A08(java.util.List):void");
    }

    @Override // X.InterfaceC58080Pp5
    public final void CvY() {
        A03(this, false);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        View.OnClickListener A01;
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean A06 = A06(this);
        Context requireContext = requireContext();
        int i = 2131955643;
        if (A06) {
            i = 2131952292;
        }
        interfaceC56362iU.setTitle(requireContext.getString(i));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_check_pano_outline_24;
        A0B.A0P = true;
        A0B.A02 = requireContext().getColor(C1QI.A01(requireContext()));
        A0B.A05 = 2131961124;
        if (this.A0I && this.A0F && this.A0G) {
            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0Q, 0), 36312999301023330L)) {
                A01 = ViewOnClickListenerC55465OkK.A00(interfaceC56362iU, this, 21);
                A0B.A0G = A01;
                A0B.A04 = R.id.clips_people_tagging_done_button;
                interfaceC56362iU.AA9(new C3LY(A0B));
                AbstractC31176DnK.A1C(ViewOnClickListenerC55466OkL.A01(this, 49), AbstractC31176DnK.A0I(), interfaceC56362iU);
            }
        }
        A01 = ViewOnClickListenerC55466OkL.A01(this, 50);
        A0B.A0G = A01;
        A0B.A04 = R.id.clips_people_tagging_done_button;
        interfaceC56362iU.AA9(new C3LY(A0B));
        AbstractC31176DnK.A1C(ViewOnClickListenerC55466OkL.A01(this, 49), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r1), 36312999300367961L) == false) goto L27;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6M.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final List A00() {
        PHB phb = this.A06;
        if (phb == null) {
            C14360o3.A0F("clipsPeopleTaggingController");
            throw C00O.createAndThrow();
        }
        List A01 = phb.A01();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            if (phb.A00().contains(((com.instagram.tagging.model.Tag) obj).getId())) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    private final List A01() {
        PHB phb = this.A06;
        if (phb == null) {
            C14360o3.A0F("clipsPeopleTaggingController");
            throw C00O.createAndThrow();
        }
        List A01 = phb.A01();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A01) {
            AbstractC25228BEl.A1Q(obj, A1E, phb.A00().contains(((com.instagram.tagging.model.Tag) obj).getId()) ? 1 : 0);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        if (A05() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r0 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6M.A02():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.N6M r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6M.A03(X.N6M, boolean):void");
    }

    private final boolean A05() {
        if (!this.A0I || !this.A0G) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0Q, 0), 36312999301023330L);
    }

    public static final boolean A06(N6M n6m) {
        if (n6m.A0F && n6m.A05()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (A05() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        if (X.AbstractC100604fP.A04(X.AbstractC166987dD.A0r(r5), true) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0043, code lost:
    
        if (X.C18U.A06(r4, X.AbstractC166987dD.A0o(r5), 36312999300367961L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        if (r6.A0K == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A07(java.util.List r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0H
            r3 = 1
            if (r0 == 0) goto L11
            X.0do r0 = r6.A0Q
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = X.AbstractC100604fP.A04(r0, r3)
            if (r0 == 0) goto L81
        L11:
            X.0do r5 = r6.A0Q
            X.0ll r2 = X.AbstractC166987dD.A0o(r5)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36312999299909204(0x81027b00000654, double:3.027825205749715E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L81
            boolean r0 = r6.A0I
            if (r0 == 0) goto L45
            boolean r0 = r6.A0H
            if (r0 == 0) goto L36
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            boolean r0 = X.AbstractC100604fP.A04(r0, r3)
            if (r0 != 0) goto L45
        L36:
            X.0ll r2 = X.AbstractC166987dD.A0o(r5)
            r0 = 36312999300367961(0x81027b00070659, double:3.027825206039835E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L81
        L45:
            boolean r0 = r6.A0I
            if (r0 == 0) goto L4d
            boolean r0 = r6.A0K
            if (r0 != 0) goto L81
        L4d:
            r2 = 0
            if (r3 == 0) goto L5e
            boolean r0 = A06(r6)
            if (r0 == 0) goto L5f
            java.util.List r0 = r6.A00()
            boolean r2 = X.AbstractC166987dD.A1b(r0)
        L5e:
            return r2
        L5f:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L6a
            boolean r1 = r6.A05()
            r0 = 1
            if (r1 != 0) goto L6b
        L6a:
            r0 = 0
        L6b:
            r1 = 20
            if (r0 == 0) goto L79
            java.util.List r0 = r6.A01()
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L5e
        L79:
            int r0 = r7.size()
            if (r0 >= r1) goto L5e
            r2 = 1
            return r2
        L81:
            r3 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6M.A07(java.util.List):boolean");
    }

    @Override // X.InterfaceC30955DjC
    public final void DN3() {
        if (this.A0J) {
            C54966OSw.A00(new C54966OSw(requireContext()), 2131961965, 2131961938);
        } else {
            A03(this, true);
        }
    }

    @Override // X.InterfaceC58080Pp5
    public final void DN6() {
        String str;
        C193328hC A0b;
        int i;
        if (this.A0P) {
            InterfaceC58202Pr8 A00 = AbstractC54314NzY.A00(AbstractC166987dD.A0r(this.A0Q));
            C14360o3.A07(A00);
            A0b = AbstractC31176DnK.A0b(this);
            A0b.A0A(A00.Aov());
            i = A00.Aou();
        } else {
            String str2 = "clipsPeopleTaggingController";
            if (A06(this)) {
                PHB phb = this.A06;
                if (phb != null) {
                    if (phb.A01().size() >= 20) {
                        AbstractC55114ObY.A00(requireActivity());
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            InterfaceC09390do interfaceC09390do = this.A0Q;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            PHB phb2 = this.A06;
            if (phb2 != null) {
                if (AbstractC55229Oez.A0G(this.A04, A0r, this.A0A, phb2.A00().size())) {
                    FragmentActivity requireActivity = requireActivity();
                    PHB phb3 = this.A06;
                    if (phb3 != null) {
                        AbstractC55114ObY.A01(requireActivity, phb3.A00().size());
                        return;
                    }
                } else {
                    List A1Q = AbstractC16960so.A1Q(EnumC76383bi.A04, EnumC76383bi.A08, EnumC76383bi.A07);
                    C50994Mg1 c50994Mg1 = this.A07;
                    if (c50994Mg1 != null) {
                        if (A1Q.contains(c50994Mg1.A01)) {
                            C50994Mg1 c50994Mg12 = this.A07;
                            if (c50994Mg12 != null) {
                                int ordinal = c50994Mg12.A01.ordinal();
                                if (ordinal != 1) {
                                    i = 2131955272;
                                    if (ordinal != 6) {
                                        i = 2131961937;
                                    }
                                } else {
                                    i = 2131955270;
                                }
                                A0b = AbstractC31175DnJ.A0O(this);
                                A0b.A0A(2131955271);
                            }
                        } else if (this.A0K) {
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            ClipsSharingDraftViewModel clipsSharingDraftViewModel = this.A05;
                            if (clipsSharingDraftViewModel == null) {
                                str2 = "sharingViewModel";
                            } else {
                                C128175qm A09 = clipsSharingDraftViewModel.A07.A09();
                                if (A09 == null || (str = A09.A0T) == null) {
                                    str = "";
                                }
                                C153936w2.A05(AbstractC153926w1.A01(this, A0r2, str), PublicKeyCredentialControllerUtility.JSON_KEY_USER, "share_sheet", "tap_invite_collaborators");
                                A0b = AbstractC31176DnK.A0b(this);
                                A0b.A0A(2131956302);
                                i = 2131956308;
                            }
                        } else {
                            if (!A05()) {
                                if (AbstractC55229Oez.A0E(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), this, this.A0A)) {
                                    return;
                                }
                            }
                            if (this.A0J) {
                                C54966OSw.A00(new C54966OSw(requireContext()), 2131961965, 2131961938);
                                return;
                            } else {
                                A03(this, true);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("clipsPeopleTaggingViewModel");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        A0b.A09(i);
        AbstractC31176DnK.A1W(A0b);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Q);
    }

    private final void A04(boolean z) {
        int A05 = AbstractC167007dF.A05(z ? 1 : 0);
        IgTextView igTextView = this.A0M;
        if (igTextView != null) {
            igTextView.setVisibility(A05);
        }
        View view = this.A0L;
        if (view != null) {
            view.setVisibility(A05);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (A06(this)) {
            return "clips_collab_tagging";
        }
        return "clips_people_tagging";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1708520925);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do = this.A0Q;
            this.A07 = (C50994Mg1) MSW.A0F(new NB6(AbstractC166987dD.A0r(interfaceC09390do)), requireActivity).A00(C50994Mg1.class);
            this.A0B = AbstractC31175DnJ.A0Y(bundle2, "ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID");
            Object obj = bundle2.get("ClipsConstants.ARG_CLIPS_SHARE_CAMERA_ENTRY_POINT ");
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            this.A03 = (C22P) obj;
            if (bundle2.containsKey("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ")) {
                Serializable serializable = bundle2.getSerializable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ");
                C14360o3.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
                this.A04 = (C22P) serializable;
            }
            C22P c22p = this.A03;
            if (c22p == null) {
                str = "entryPoint";
            } else {
                this.A0I = AbstractC167007dF.A1X(c22p, C22P.A0J);
                this.A0E = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_VIDEO_PREVIEW_URL");
                this.A0D = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY");
                this.A0O = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_AUDIO_CLUSTER_ID_FOR_COLLAB_CHECK");
                Serializable serializable2 = bundle2.getSerializable("ARGS_PRESELECTED_AUDIENCE");
                C14360o3.A0C(serializable2, "null cannot be cast to non-null type com.instagram.model.mediatype.MediaAudience");
                EnumC76383bi enumC76383bi = (EnumC76383bi) serializable2;
                List A0l = MSY.A0l(bundle2.getParcelableArrayList("ClipsConstants.ARG_CLIPS_PEOPLE_TAG_LIST"));
                List A0l2 = MSY.A0l(bundle2.getStringArrayList("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_IDS"));
                List A0l3 = MSY.A0l(bundle2.getStringArrayList("ClipsConstants.ARG_CLIPS_CONFIRMED_COLLABORATOR_TAG_IDS"));
                List A0l4 = MSY.A0l(bundle2.getParcelableArrayList("ClipsConstants.ARG_CLIPS_FB_USER_TAG_LIST"));
                this.A0C = bundle2.getString("ClipsConstants.ARG_CLIPS_MEDIA_ID");
                C50994Mg1 c50994Mg1 = this.A07;
                str = "clipsPeopleTaggingViewModel";
                if (c50994Mg1 != null) {
                    C14360o3.A0B(enumC76383bi, 0);
                    c50994Mg1.A01 = enumC76383bi;
                    C50994Mg1 c50994Mg12 = this.A07;
                    if (c50994Mg12 != null) {
                        c50994Mg12.A05 = A0l;
                        c50994Mg12.A0A.A0B(A0l);
                        C50994Mg1 c50994Mg13 = this.A07;
                        if (c50994Mg13 != null) {
                            c50994Mg13.A03 = A0l2;
                            c50994Mg13.A09.A0B(A0l2);
                            C50994Mg1 c50994Mg14 = this.A07;
                            if (c50994Mg14 != null) {
                                c50994Mg14.A02 = A0l3;
                                c50994Mg14.A00.A0B(A0l3);
                                C50994Mg1 c50994Mg15 = this.A07;
                                if (c50994Mg15 != null) {
                                    c50994Mg15.A06.A0B(bundle2.getString("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_ID"));
                                    C50994Mg1 c50994Mg16 = this.A07;
                                    if (c50994Mg16 != null) {
                                        c50994Mg16.A04 = A0l4;
                                        c50994Mg16.A0C.Egh(A0l4);
                                        C50994Mg1 c50994Mg17 = this.A07;
                                        if (c50994Mg17 != null) {
                                            c50994Mg17.A0A.A06(this, new C55562Olw(this));
                                            if (bundle2.containsKey("ClipsConstants.ARG_IS_CLIPS_ENTRY_POINT")) {
                                                this.A0A = AbstractC31174DnI.A0n(bundle2, "ClipsConstants.ARG_IS_CLIPS_ENTRY_POINT");
                                            }
                                            this.A0J = bundle2.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_EXCLUSIVE_REELS");
                                            this.A0H = bundle2.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_CONTENT_SCHEDULING_MEDIA");
                                            FragmentActivity requireActivity2 = requireActivity();
                                            FragmentActivity requireActivity3 = requireActivity();
                                            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                                            FragmentActivity requireActivity4 = requireActivity();
                                            String str2 = this.A0B;
                                            if (str2 == null) {
                                                str = "cameraSessionId";
                                            } else {
                                                this.A05 = (ClipsSharingDraftViewModel) MSW.A0F(new C50851Mdi(requireActivity4, requireActivity3, A0r, str2), requireActivity2).A00(ClipsSharingDraftViewModel.class);
                                                this.A0F = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_IS_ADD_COLLABORATORS_MODE");
                                                this.A0G = bundle2.getBoolean("ARG_CLIPS_IS_ADD_COLLABORATORS_MODE_ENABLED_FOR_EDITIONS", false);
                                                this.A0K = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_IS_TRIAL_REEL");
                                                this.A0P = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_HAS_CLIPS_SPINS");
                                                C0f9.A09(165231375, A02);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-2099721280, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(159522917);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_people_tagging_fragment, false);
        C0f9.A09(284484343, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1967009559);
        this.A09 = null;
        this.A00 = null;
        this.A0N = null;
        this.A01 = null;
        this.A0L = null;
        this.A0M = null;
        this.A02 = null;
        super.onDestroyView();
        C0f9.A09(-546758757, A02);
    }
}
