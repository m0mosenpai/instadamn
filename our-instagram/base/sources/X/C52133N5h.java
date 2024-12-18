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
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.N5h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52133N5h extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsPostCapTimelineFragment";
    public int A00;
    public C51142Mil A01;
    public C54716OEt A02;
    public ClipsTimelineActionBarViewController A03;
    public ClipsCreationViewModel A04;
    public C50860Mdr A05;
    public C187418Sj A06;
    public C87H A07;
    public C8NF A08;
    public C50869Me0 A09;
    public C1828989k A0A;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_postcap_timeline_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.findViewById(R.id.drawer_edit_button);
        igdsMediaButton.setLabel(igdsMediaButton.getResources().getString(2131955497));
        ViewOnClickListenerC55457OkB.A01(igdsMediaButton, 31, this);
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.findViewById(R.id.drawer_next_button);
        igdsMediaButton2.setEndAddOn(EnumC53232NgU.A05);
        igdsMediaButton2.setLabel(igdsMediaButton2.getResources().getString(2131955580));
        ViewOnClickListenerC55457OkB.A01(igdsMediaButton2, 32, this);
        if (C18U.A06(C06090Tz.A06, AbstractC25230BEn.A0k(this.A0B, 0), 36327237116901799L)) {
            C50860Mdr c50860Mdr = this.A05;
            if (c50860Mdr == null) {
                str = "miniTimelineViewModel";
            } else {
                JQ0.A11(this, PZJ.A01(this, null, 6), c50860Mdr.A00);
                ClipsCreationViewModel clipsCreationViewModel = this.A04;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    JQ0.A11(this, new MC7((InterfaceC23621Ds) null, this, view, 35), clipsCreationViewModel.A0c);
                    C87H c87h = this.A07;
                    str = "videoPlaybackViewModel";
                    if (c87h != null) {
                        AbstractC31180DnO.A1F(getViewLifecycleOwner(), c87h.A0G, C57747Pja.A00(this, 12), 56);
                        C87H c87h2 = this.A07;
                        if (c87h2 != null) {
                            AbstractC31180DnO.A1F(getViewLifecycleOwner(), c87h2.A0A, new BAO(42, view, this), 56);
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C50869Me0 c50869Me0 = this.A09;
        if (c50869Me0 == null) {
            str = "clipsTimelineActionBarViewModel";
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            C50869Me0.A05(c50869Me0, A1E, false);
            c50869Me0.A0D.Egh(A1E);
            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A03;
            str = "actionBarViewController";
            if (clipsTimelineActionBarViewController != null) {
                ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 35), EnumC53325Ni3.A0N, clipsTimelineActionBarViewController);
                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController2 = this.A03;
                if (clipsTimelineActionBarViewController2 != null) {
                    ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 36), EnumC53325Ni3.A06, clipsTimelineActionBarViewController2);
                    ClipsTimelineActionBarViewController clipsTimelineActionBarViewController3 = this.A03;
                    if (clipsTimelineActionBarViewController3 != null) {
                        ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 37), EnumC53325Ni3.A05, clipsTimelineActionBarViewController3);
                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController4 = this.A03;
                        if (clipsTimelineActionBarViewController4 != null) {
                            ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 38), EnumC53325Ni3.A02, clipsTimelineActionBarViewController4);
                            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController5 = this.A03;
                            if (clipsTimelineActionBarViewController5 != null) {
                                ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 39), EnumC53325Ni3.A0f, clipsTimelineActionBarViewController5);
                                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController6 = this.A03;
                                if (clipsTimelineActionBarViewController6 != null) {
                                    ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 40), EnumC53325Ni3.A0h, clipsTimelineActionBarViewController6);
                                    ClipsTimelineActionBarViewController clipsTimelineActionBarViewController7 = this.A03;
                                    if (clipsTimelineActionBarViewController7 != null) {
                                        ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 41), EnumC53325Ni3.A0S, clipsTimelineActionBarViewController7);
                                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController8 = this.A03;
                                        if (clipsTimelineActionBarViewController8 != null) {
                                            ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 42), EnumC53325Ni3.A0G, clipsTimelineActionBarViewController8);
                                            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController9 = this.A03;
                                            if (clipsTimelineActionBarViewController9 != null) {
                                                ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 43), EnumC53325Ni3.A03, clipsTimelineActionBarViewController9);
                                                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController10 = this.A03;
                                                if (clipsTimelineActionBarViewController10 != null) {
                                                    ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 33), EnumC53325Ni3.A0F, clipsTimelineActionBarViewController10);
                                                    ClipsTimelineActionBarViewController clipsTimelineActionBarViewController11 = this.A03;
                                                    if (clipsTimelineActionBarViewController11 != null) {
                                                        ClipsTimelineActionBarViewController.A01(ViewOnClickListenerC55457OkB.A00(this, 34), EnumC53325Ni3.A0W, clipsTimelineActionBarViewController11);
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
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-737988011);
        super.onCreate(bundle);
        this.A00 = ((NineSixteenLayoutConfigImpl) ((CreationLayoutConfig) AbstractC153636vY.A00(requireArguments(), TargetViewSizeProvider.class, "ARG_TARGET_VIEW_SIZE_PROVIDER"))).A06;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0B;
        this.A04 = (ClipsCreationViewModel) AbstractC50522MSa.A0K(this, requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        this.A0A = (C1828989k) AbstractC31175DnJ.A0A(this).A00(C1828989k.class);
        FragmentActivity requireActivity2 = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity3 = requireActivity();
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        String str = "clipsCreationViewModel";
        if (clipsCreationViewModel != null) {
            this.A08 = (C8NF) MSW.A0F(new C8NE(requireActivity3, A0r, clipsCreationViewModel.A0Q), requireActivity2).A00(C8NF.class);
            FragmentActivity requireActivity4 = requireActivity();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            ClipsCreationViewModel clipsCreationViewModel2 = this.A04;
            if (clipsCreationViewModel2 != null) {
                C1828989k c1828989k = this.A0A;
                if (c1828989k == null) {
                    str = "clipsSourceMediaViewModel";
                } else {
                    C8NF c8nf = this.A08;
                    if (c8nf == null) {
                        str = "clipsColorFilterViewModel";
                    } else {
                        this.A09 = (C50869Me0) MSW.A0F(new C52324NDn(requireActivity4, A0r2, null, c8nf, clipsCreationViewModel2, null, null, null, null, c1828989k), this).A00(C50869Me0.class);
                        this.A07 = MSZ.A0Z(AbstractC31175DnJ.A0A(this), C87G.class);
                        this.A05 = (C50860Mdr) MSW.A0F(new NB3(requireActivity()), this).A00(C50860Mdr.class);
                        this.A06 = (C187418Sj) MSW.A0F(new C187408Si(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), requireActivity()).A00(C187418Sj.class);
                        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                        int i = this.A00;
                        ClipsCreationViewModel clipsCreationViewModel3 = this.A04;
                        if (clipsCreationViewModel3 != null) {
                            C50869Me0 c50869Me0 = this.A09;
                            if (c50869Me0 == null) {
                                str = "clipsTimelineActionBarViewModel";
                            } else {
                                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = new ClipsTimelineActionBarViewController(this, A0r3, clipsCreationViewModel3, c50869Me0, null, null, i, false);
                                this.A03 = clipsTimelineActionBarViewController;
                                registerLifecycleListener(clipsTimelineActionBarViewController);
                                C0f9.A09(-886260387, A02);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(2134275479);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_timeline_editor_postcap_fragment, viewGroup, false);
        this.A01 = new C51142Mil();
        Context requireContext = requireContext();
        C51142Mil c51142Mil = this.A01;
        if (c51142Mil == null) {
            str = "miniTimelineAdapter";
        } else {
            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(inflate, R.id.mini_timeline);
            C87H c87h = this.A07;
            if (c87h == null) {
                str = "videoPlaybackViewModel";
            } else {
                ClipsCreationViewModel clipsCreationViewModel = this.A04;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    this.A02 = new C54716OEt(requireContext, recyclerView, c51142Mil, c87h, C57523Pfx.A00(this, 24), MSW.A04(clipsCreationViewModel));
                    if (C18U.A06(C06090Tz.A06, AbstractC25230BEn.A0k(this.A0B, 0), 36327237116901799L)) {
                        AbstractC166997dE.A0S(inflate, R.id.mini_timeline_container).setVisibility(0);
                        C54716OEt c54716OEt = this.A02;
                        if (c54716OEt == null) {
                            str = "miniTimelineController";
                        } else {
                            ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1 clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1 = c54716OEt.A05;
                            clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1.A13(false);
                            RecyclerView recyclerView2 = c54716OEt.A03;
                            recyclerView2.setVisibility(0);
                            recyclerView2.setLayoutManager(clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1);
                            recyclerView2.setAdapter(c54716OEt.A04);
                            recyclerView2.setItemAnimator(null);
                            C51198Mji.A00(recyclerView2, c54716OEt, 3);
                            recyclerView2.A12(new C55588OmR(c54716OEt));
                        }
                    }
                    C0f9.A09(-1425755562, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
