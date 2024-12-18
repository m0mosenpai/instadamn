package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5T extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsDraftsFragment";
    public C54736OFn A00;
    public PendingRecipient A01;
    public AbstractC51174MjI A02;
    public boolean A03;
    public boolean A04;
    public C51167MjB A06;
    public C6WQ A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final C56486P6b A0L;
    public final C22P A0A = C22P.A0z;
    public C2GS A05 = new C2GT(EnumC53126Nee.A02);
    public final InterfaceC09390do A0E = AbstractC25225BEi.A0a(new C57537PgB(this, 13), new C57537PgB(this, 8), new D8K(44, null, this), AbstractC25225BEi.A1D(C75E.class));
    public final InterfaceC09390do A0D = AbstractC25225BEi.A0a(new C57537PgB(this, 14), new C57537PgB(this, 7), new D8K(45, null, this), AbstractC25225BEi.A1D(ClipsCreationDraftViewModel.class));
    public final InterfaceC09390do A0B = AbstractC25225BEi.A0a(new C57537PgB(this, 15), new C57537PgB(this, 5), new D8K(46, null, this), AbstractC25225BEi.A1D(C1810981l.class));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (A04(this)) {
            interfaceC56362iU.EkF(false);
            return;
        }
        if (this.A04) {
            Context themedContext = getThemedContext();
            C56352iT c56352iT = (C56352iT) interfaceC56362iU;
            C14360o3.A0B(themedContext, 0);
            c56352iT.A02 = themedContext;
            C56352iT.A0H(c56352iT);
        }
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131961178);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A0Y);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55463OkI(this, 36), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_drafts";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5T.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(EnumC53126Nee enumC53126Nee, N5T n5t, boolean z) {
        C54736OFn c54736OFn = n5t.A00;
        if (c54736OFn != null) {
            if (c54736OFn.A0G.getVisibility() == 0) {
                n5t.A05.A0B(enumC53126Nee);
                C54736OFn c54736OFn2 = n5t.A00;
                if (c54736OFn2 != null) {
                    c54736OFn2.A0G.A00(enumC53126Nee.ordinal(), z);
                    C54736OFn c54736OFn3 = n5t.A00;
                    if (c54736OFn3 != null) {
                        RecyclerView recyclerView = c54736OFn3.A06;
                        EnumC53126Nee enumC53126Nee2 = EnumC53126Nee.A02;
                        int i = 0;
                        int i2 = 8;
                        if (enumC53126Nee == enumC53126Nee2) {
                            i2 = 0;
                        }
                        recyclerView.setVisibility(i2);
                        C54736OFn c54736OFn4 = n5t.A00;
                        if (c54736OFn4 != null) {
                            RecyclerView recyclerView2 = c54736OFn4.A07;
                            int i3 = 8;
                            if (enumC53126Nee == EnumC53126Nee.A03) {
                                i3 = 0;
                            }
                            recyclerView2.setVisibility(i3);
                            C54736OFn c54736OFn5 = n5t.A00;
                            if (c54736OFn5 != null) {
                                ViewGroup viewGroup = c54736OFn5.A04;
                                if (enumC53126Nee != enumC53126Nee2) {
                                    i = 8;
                                }
                                viewGroup.setVisibility(i);
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    public static final void A01(N5T n5t) {
        InterfaceC09390do interfaceC09390do = n5t.A0I;
        if (AbstractC166997dE.A0t(AbstractC166987dD.A0r(interfaceC09390do)) == null) {
            C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
            C22P c22p = n5t.A0A;
            int A00 = C56D.A00(n5t.requireContext());
            A01.A18(c22p, EnumC50631MWs.A0J, (C1810981l) n5t.A0B.getValue(), C5JK.A06, ((AnonymousClass840) n5t.A0C.getValue()).A02.A01.A09, null, A00, -1);
        }
    }

    public static final void A03(N5T n5t, List list) {
        C53073Ndm c53073Ndm;
        String str;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(n5t.A0I), 36323783962930797L)) {
            C54736OFn c54736OFn = n5t.A00;
            if (c54736OFn == null) {
                str = "viewHolder";
            } else {
                c54736OFn.A0G.setVisibility(0);
                str = "scheduledContentAdapter";
                if (list != null) {
                    C51167MjB c51167MjB = n5t.A06;
                    if (c51167MjB != null) {
                        c51167MjB.A03(list);
                    }
                }
                C51167MjB c51167MjB2 = n5t.A06;
                if (c51167MjB2 != null) {
                    c51167MjB2.A01();
                    return;
                }
            }
        } else {
            AbstractC51174MjI abstractC51174MjI = n5t.A02;
            if (abstractC51174MjI == null) {
                str = "clipsDraftsAdapter";
            } else {
                if ((abstractC51174MjI instanceof C53073Ndm) && (c53073Ndm = (C53073Ndm) abstractC51174MjI) != null) {
                    c53073Ndm.A02 = true;
                    c53073Ndm.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.N5T r1) {
        /*
            android.os.Bundle r1 = r1.mArguments
            if (r1 == 0) goto L13
            java.lang.String r0 = "ARGS_DRAFT_SUBTITLE"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L13
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5T.A04(X.N5T):boolean");
    }

    public final UserSession A05() {
        return AbstractC166987dD.A0r(this.A0I);
    }

    public final void A06(C9J0 c9j0) {
        C34726FRp A08 = C28531Zo.A04.A02.A08(AbstractC166987dD.A0r(this.A0I), C2EY.A0V, "clips_drafts");
        A08.A02 = new C56380P1p(c9j0, this);
        C3DN A0l = AbstractC43593JPy.A0l(this, C3DN.A00);
        A08.A01();
        if (A0l != null) {
            A0l.A0K(A08.A00());
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0I);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r26, int r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5T.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    public N5T() {
        C57537PgB c57537PgB = new C57537PgB(this, 11);
        C57537PgB c57537PgB2 = new C57537PgB(this, 16);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57537PgB(c57537PgB2, 17));
        this.A0H = AbstractC25225BEi.A0a(new C57537PgB(A00, 18), c57537PgB, new D8K(47, null, A00), AbstractC25225BEi.A1D(C44513JmJ.class));
        C57537PgB c57537PgB3 = new C57537PgB(this, 10);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C57537PgB(new C57537PgB(this, 19), 20));
        this.A0G = AbstractC25225BEi.A0a(new C57537PgB(A002, 21), c57537PgB3, new D8K(48, null, A002), AbstractC25225BEi.A1D(C44475Jlh.class));
        this.A0K = C57537PgB.A01(this, 22);
        this.A0F = C57537PgB.A01(this, 9);
        this.A0J = C57537PgB.A00(this, 12);
        this.A0C = C57537PgB.A01(this, 6);
        this.A0L = new C56486P6b(this, 2);
        this.A0I = AbstractC60492pY.A02(this);
    }

    public static final void A02(N5T n5t) {
        IgdsHeadline igdsHeadline = new IgdsHeadline(n5t.getThemedContext(), null, 0, 0);
        igdsHeadline.setHeadline(2131955443);
        igdsHeadline.setBody(2131955442);
        AbstractC31177DnL.A0x(igdsHeadline, igdsHeadline.getPaddingLeft(), 0);
        C50674MYs c50674MYs = new C50674MYs(n5t.getThemedContext(), AbstractC166987dD.A0r(n5t.A0I));
        c50674MYs.A01 = igdsHeadline;
        c50674MYs.A06 = false;
        EnumC60792q3 enumC60792q3 = n5t.dayNightMode;
        C14360o3.A0B(enumC60792q3, 0);
        c50674MYs.A02 = enumC60792q3;
        C31727DwY.A02(n5t, c50674MYs);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-273102361);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("clips_drafts");
        this.A03 = requireArguments.getBoolean("args_is_from_profile", false);
        this.A04 = requireArguments.getBoolean("args_clips_drafts_fragment_should_use_dark_mode", false);
        this.A01 = (PendingRecipient) requireArguments.getParcelable("target_group_profile");
        this.A08 = requireArguments().getBoolean("ClipsConstants.CLIPS_DRAFTS_IN_CAMERA_GALLERY", false);
        this.A07 = new C6WQ(requireActivity(), true);
        if (this.A04) {
            setDayNightMode(EnumC60792q3.A03);
        }
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        Context themedContext = getThemedContext();
        C1809080s c1809080s = new C1809080s(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
        int A022 = AbstractC31177DnL.A02(this, R.dimen.action_bar_immersive_gradient_height);
        InterfaceC09390do interfaceC09390do2 = this.A0E;
        this.A02 = new C53073Ndm(requireActivity, themedContext, this, A0r, c1809080s, (C75E) interfaceC09390do2.getValue(), this, dimensionPixelSize, A022, this.A04);
        this.A06 = new C51167MjB(getThemedContext(), requireActivity(), this.dayNightMode, new OXR(EnumC50628MWp.A06, this, AbstractC166987dD.A0r(interfaceC09390do)), this, AbstractC166987dD.A0r(interfaceC09390do));
        C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
        if (!this.A03) {
            requireArguments().getSerializable("args_camera_surface_type");
        }
        A01.A0a();
        ((C75E) interfaceC09390do2.getValue()).A0E();
        CameraConfiguration A00 = C82R.A00(C81U.A00, new C81W[0]);
        C1810981l c1810981l = (C1810981l) this.A0B.getValue();
        C81P c81p = C81O.A02;
        A05();
        C81O A012 = c81p.A01(AbstractC171987lT.A01());
        java.util.Set set = A00.A04;
        c1810981l.A0E(this.A0A, A012, A00.A03, null, set, A00.A00, false, true);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36325557784294569L)) {
            A01(this);
        }
        C40121td.A0G.A01(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)).A0H(this.A0L);
        C0f9.A09(1490381781, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1745717876);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_drafts_fragment, viewGroup, false);
        C0f9.A09(-268799939, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1508502983);
        super.onDestroy();
        C40121td.A0G.A01(requireContext(), AbstractC166987dD.A0r(this.A0I)).A0I(this.A0L);
        C0f9.A09(1958724315, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-516630595);
        this.A09 = true;
        super.onPause();
        C0f9.A09(1836038421, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1941515343);
        super.onResume();
        if (this.A04) {
            AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A0I), false, false);
        }
        AbstractC51174MjI abstractC51174MjI = this.A02;
        if (abstractC51174MjI == null) {
            C14360o3.A0F("clipsDraftsAdapter");
            throw C00O.createAndThrow();
        }
        abstractC51174MjI.A01 = -1L;
        if (this.A09) {
            ((C75E) this.A0E.getValue()).A07.A02.A02.A0A();
            this.A09 = false;
        }
        EnumC53126Nee enumC53126Nee = (EnumC53126Nee) this.A05.A02();
        if (enumC53126Nee != null) {
            A00(enumC53126Nee, this, false);
        }
        C0f9.A09(1253972250, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1738896050);
        super.onStop();
        AbstractC145016gM.A04(requireActivity(), AbstractC166987dD.A0r(this.A0I), false);
        C0f9.A09(708425828, A02);
    }
}
