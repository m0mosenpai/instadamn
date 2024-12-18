package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.NHd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52407NHd extends AbstractC52130N5e implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsTimelineTemplateEditorFragment";
    public C56050OuP A00;
    public ClipsCreationViewModel A01;
    public C187358Sd A02;
    public C183298Bb A03;
    public C56046OuK A04;
    public InterfaceC58281PsZ A05;
    public C56038OuA A06;
    public C187418Sj A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_template_page";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (super.A01 == EnumC222689s9.A04) {
            UserSession A0r = AbstractC166987dD.A0r(super.A05);
            C14360o3.A0B(A0r, 0);
            IEK iek = (IEK) A0r.A01(IEK.class, new MHO(A0r, 41));
            if (iek.A00 != 0) {
                ((UserFlowLoggerImpl) iek.A01.getValue()).flowEndSuccess(iek.A00);
                iek.A00 = 0L;
            }
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 23), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A06 == null) {
            C14360o3.A0F("deleteTrayController");
            throw C00O.createAndThrow();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.OuA, X.2pj] */
    @Override // X.AbstractC52130N5e, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1176555456);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get("ARG_CLIPS_CREATION_TYPE");
        if (obj != null && (obj instanceof C5JK)) {
            C5JK c5jk = (C5JK) obj;
            C14360o3.A0B(c5jk, 0);
            super.A04 = c5jk;
        }
        Object obj2 = requireArguments.get("ARG_EDITOR_TRANSITION_SOURCE");
        if (obj2 != null && (obj2 instanceof EnumC222689s9)) {
            EnumC222689s9 enumC222689s9 = (EnumC222689s9) obj2;
            C14360o3.A0B(enumC222689s9, 0);
            super.A01 = enumC222689s9;
        }
        Object obj3 = requireArguments.get("ARG_EDITOR_CONFIG");
        if (obj3 != null && (obj3 instanceof ClipsTimelineEditorConfig)) {
            ClipsTimelineEditorConfig clipsTimelineEditorConfig = (ClipsTimelineEditorConfig) obj3;
            C14360o3.A0B(clipsTimelineEditorConfig, 0);
            super.A02 = clipsTimelineEditorConfig;
        }
        requireArguments.setClassLoader(TargetViewSizeProvider.class.getClassLoader());
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = super.A05;
        C89P A0X = MSZ.A0X(AbstractC183548Cd.A00(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), requireActivity);
        C14360o3.A0B(A0X, 0);
        super.A03 = A0X;
        this.A03 = ((C87G) AbstractC31175DnJ.A0A(this).A00(C87G.class)).A01("post_capture");
        C8Ba A022 = C8BW.A02(requireContext);
        C183298Bb c183298Bb = this.A03;
        if (c183298Bb != null) {
            c183298Bb.A02(A022, A022);
            C183298Bb c183298Bb2 = this.A03;
            if (c183298Bb2 != null) {
                int min = Math.min(A022.A00 * AbstractC166987dD.A0H(A022.A05.invoke(null)) * 10, C8Bc.A00());
                if (min > 0) {
                    c183298Bb2.A08.resize(min);
                }
                setModuleNameV2("clips_template_page");
                this.A01 = (ClipsCreationViewModel) AbstractC50522MSa.A0K(this, requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
                C87H A00 = ((C87G) AbstractC31175DnJ.A0A(this).A00(C87G.class)).A00("post_capture");
                FragmentActivity requireActivity2 = requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity3 = requireActivity();
                ClipsCreationViewModel clipsCreationViewModel = this.A01;
                String str = "clipsCreationViewModel";
                if (clipsCreationViewModel != null) {
                    this.A02 = (C187358Sd) MSW.A0F(new C187348Sc(requireActivity3, clipsCreationViewModel.A0C, A00.A0G, A0r), requireActivity2).A00(C187358Sd.class);
                    this.A07 = (C187418Sj) MSW.A0F(new C187408Si(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), requireActivity()).A00(C187418Sj.class);
                    C187358Sd c187358Sd = this.A02;
                    if (c187358Sd != null) {
                        c187358Sd.A03 = false;
                        c187358Sd.A0G(new C187368Se(false));
                        if (super.A02.isOpenLastClip) {
                            ClipsCreationViewModel clipsCreationViewModel2 = this.A01;
                            if (clipsCreationViewModel2 != null) {
                                C84B A0N = MSY.A0N(clipsCreationViewModel2);
                                if (A0N != null) {
                                    C187358Sd c187358Sd2 = this.A02;
                                    if (c187358Sd2 != null) {
                                        c187358Sd2.A0G(new C52410NHg(AbstractC31172DnG.A03(A0N.A01, 1), false));
                                    }
                                }
                            }
                        }
                        int i = super.A02.reorderVersion;
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C187358Sd c187358Sd3 = this.A02;
                        if (c187358Sd3 != null) {
                            C187418Sj c187418Sj = this.A07;
                            if (c187418Sj != null) {
                                this.A05 = new C23873AhS(this, A0r2, A0O(), c187418Sj, c187358Sd3, super.A04);
                                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                C187358Sd c187358Sd4 = this.A02;
                                if (c187358Sd4 != null) {
                                    ClipsCreationViewModel clipsCreationViewModel3 = this.A01;
                                    if (clipsCreationViewModel3 != null) {
                                        EnumC222689s9 enumC222689s92 = super.A01;
                                        InterfaceC58281PsZ interfaceC58281PsZ = this.A05;
                                        if (interfaceC58281PsZ != null) {
                                            C56046OuK c56046OuK = new C56046OuK(this, A0r3, enumC222689s92, interfaceC58281PsZ, clipsCreationViewModel3, c187358Sd4, A00);
                                            this.A04 = c56046OuK;
                                            registerLifecycleListener(c56046OuK);
                                            UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                            InterfaceC58281PsZ interfaceC58281PsZ2 = this.A05;
                                            if (interfaceC58281PsZ2 != null) {
                                                registerLifecycleListener(new C56041OuD(this, A0r4, interfaceC58281PsZ2, super.A04));
                                                ?? obj4 = new Object();
                                                this.A06 = obj4;
                                                registerLifecycleListener(obj4);
                                                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                                                C183298Bb c183298Bb3 = this.A03;
                                                if (c183298Bb3 != null) {
                                                    C187358Sd c187358Sd5 = this.A02;
                                                    if (c187358Sd5 != null) {
                                                        ClipsCreationViewModel clipsCreationViewModel4 = this.A01;
                                                        if (clipsCreationViewModel4 != null) {
                                                            O25 o25 = new O25(this);
                                                            C187418Sj c187418Sj2 = this.A07;
                                                            if (c187418Sj2 != null) {
                                                                C52408NHe c52408NHe = new C52408NHe(A0r5, o25, clipsCreationViewModel4, c187418Sj2, c187358Sd5, c183298Bb3);
                                                                if (i == 2) {
                                                                    ((AbstractC51134Mid) c52408NHe).A01 = false;
                                                                    c52408NHe.setHasStableIds(false);
                                                                } else {
                                                                    ((AbstractC51134Mid) c52408NHe).A01 = true;
                                                                    c52408NHe.setHasStableIds(true);
                                                                }
                                                                UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                C183298Bb c183298Bb4 = this.A03;
                                                                if (c183298Bb4 != null) {
                                                                    InterfaceC58281PsZ interfaceC58281PsZ3 = this.A05;
                                                                    if (interfaceC58281PsZ3 != null) {
                                                                        C187358Sd c187358Sd6 = this.A02;
                                                                        if (c187358Sd6 != null) {
                                                                            C187418Sj c187418Sj3 = this.A07;
                                                                            if (c187418Sj3 != null) {
                                                                                C5JK c5jk2 = super.A04;
                                                                                ClipsTimelineEditorConfig clipsTimelineEditorConfig2 = super.A02;
                                                                                C56038OuA c56038OuA = this.A06;
                                                                                if (c56038OuA == null) {
                                                                                    str = "deleteTrayController";
                                                                                } else {
                                                                                    C56046OuK c56046OuK2 = this.A04;
                                                                                    if (c56046OuK2 == null) {
                                                                                        str = "playbackController";
                                                                                    } else {
                                                                                        C56050OuP c56050OuP = new C56050OuP(this, A0r6, c56046OuK2, interfaceC58281PsZ3, c56038OuA, c52408NHe, clipsTimelineEditorConfig2, c187418Sj3, c187358Sd6, c5jk2, c183298Bb4, i);
                                                                                        this.A00 = c56050OuP;
                                                                                        registerLifecycleListener(c56050OuP);
                                                                                        InterfaceC58281PsZ interfaceC58281PsZ4 = this.A05;
                                                                                        if (interfaceC58281PsZ4 != null) {
                                                                                            registerLifecycleListener(interfaceC58281PsZ4);
                                                                                            AbstractC50522MSa.A14(this, new MC7((InterfaceC23621Ds) null, this, requireContext, 38), A0O().A0O);
                                                                                            C0f9.A09(-1439193013, A02);
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
                                        }
                                        C14360o3.A0F("viewController");
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                            C14360o3.A0F("clipsTimelineButtonEventProvider");
                            throw C00O.createAndThrow();
                        }
                    }
                    C14360o3.A0F("clipsTimelineEditorViewModel");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("bitmapTimelineViewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1735131323);
        C14360o3.A0B(layoutInflater, 0);
        C22C A0L = MSY.A0L(this);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A0L).A01, "ig_camera_template_builder_impression");
        C22M c22m = ((C22F) A0L).A04;
        String str = c22m.A0L;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (A0f.isSampled() && str != null && enumC50631MWs != null) {
            MSW.A1Q(A0f);
            MSZ.A1E(A0f, c22m, "camera_session_id", str);
            AbstractC167017dG.A1B(A0f);
            MSW.A1M(enumC50631MWs, A0f);
            AbstractC166997dE.A1N(A0f, "event_type", 2);
            AbstractC167017dG.A1C(A0f);
        }
        InterfaceC58281PsZ interfaceC58281PsZ = this.A05;
        if (interfaceC58281PsZ == null) {
            C14360o3.A0F("viewController");
            throw C00O.createAndThrow();
        }
        View inflate = layoutInflater.inflate(interfaceC58281PsZ.BMb(), viewGroup, false);
        C0f9.A09(1020537734, A02);
        return inflate;
    }
}
