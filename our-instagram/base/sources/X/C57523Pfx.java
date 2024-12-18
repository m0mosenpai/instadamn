package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pfx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57523Pfx extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57523Pfx(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57523Pfx A00(Object obj, int i) {
        return new C57523Pfx(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                C55982hj A0R = AbstractC167007dF.A0R();
                A0R.A09(C55942hf.A04(155.0d, 8.5d));
                A0R.A0A(new C51978MyM(this.A01, 1));
                A0R.A08(0.0d, true);
                return A0R;
            case 1:
                C24148AnX c24148AnX = (C24148AnX) this.A01;
                View requireViewById = AbstractC166987dD.A0d(c24148AnX.A06).requireViewById(R.id.stories_template_cancel_button);
                C14360o3.A0A(requireViewById);
                C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
                A0s.A06 = false;
                C216559iC.A02(A0s, c24148AnX, 33);
                return requireViewById;
            case 2:
                return AbstractC166997dE.A0S(AbstractC166987dD.A0d(((C24148AnX) this.A01).A06), R.id.stories_template_header);
            case 3:
                return AbstractC166997dE.A0X((View) this.A01, R.id.stories_template_editor_stub).getView();
            case 4:
                C24148AnX c24148AnX2 = (C24148AnX) this.A01;
                View requireViewById2 = AbstractC166987dD.A0d(c24148AnX2.A06).requireViewById(R.id.stories_template_next_button);
                C14360o3.A0A(requireViewById2);
                C3P9 A0s2 = AbstractC166987dD.A0s(requireViewById2);
                A0s2.A06 = false;
                C216559iC.A02(A0s2, c24148AnX2, 34);
                return requireViewById2;
            case 5:
            case 6:
            case 7:
            case 10:
                C8JT.A0g((C8JT) this.A01);
                return C0eB.A00;
            case 8:
                C8JT c8jt = (C8JT) this.A01;
                c8jt.A0c = true;
                AnonymousClass229.A01(c8jt.A1D).A0V();
                c8jt.A1s.A0D(c8jt.A1B.requireActivity(), c8jt.A16, A00(c8jt, 7));
                return C0eB.A00;
            case 9:
                C8JT c8jt2 = (C8JT) this.A01;
                C448424o c448424o = AnonymousClass229.A01(c8jt2.A1D).A0C;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448424o.A01, "ig_camera_nux");
                if (A0f.isSampled()) {
                    MSW.A1R(A0f, "CONTINUE_SESSION_OPTION_DISMISS");
                    A0f.AAP("nux_step", "TAP");
                    C22M c22m = c448424o.A04;
                    AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                    MSZ.A1E(A0f, c22m, "legacy_falco_event_name", "IG_CAMERA_CLIPS_CONTINUE_SESSION_OPTION_DISCARD_TAP");
                    int i2 = 2;
                    AbstractC166997dE.A1N(A0f, "event_type", 2);
                    A0f.A9K("capture_format_index", AbstractC167007dF.A0d());
                    AbstractC167007dF.A11(A0f, c448424o);
                    MSX.A1G(A0f, c22m);
                    AbstractC167017dG.A1B(A0f);
                    MSW.A1M(EnumC50631MWs.A0J, A0f);
                    if (c22m.A01 != 2) {
                        i2 = 1;
                    }
                    AbstractC166997dE.A1N(A0f, "camera_position", i2);
                    A0f.AAP("discovery_session_id", c22m.A0O);
                    A0f.AAP("search_session_id", c22m.A0P);
                    AbstractC167017dG.A1C(A0f);
                }
                C8JT.A0i(c8jt2);
                c8jt2.A1h.A0Q(true, false);
                ClipsCreationDraftViewModel clipsCreationDraftViewModel = c8jt2.A1s;
                AbstractC166987dD.A1Z(new C57160PZe(C57622PhY.A00, clipsCreationDraftViewModel, (InterfaceC23621Ds) null, 32, 42), AbstractC141776au.A00(clipsCreationDraftViewModel));
                return C0eB.A00;
            case 11:
                N7P n7p = (N7P) this.A01;
                return AbstractC50522MSa.A0W(n7p, n7p.A0A);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 21:
            case 45:
            case 48:
                return this.A01;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 22:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 14:
            case 23:
            case 47:
                return AbstractC167027dH.A0B(this.A01);
            case Process.SIGTERM /* 15 */:
                return new O7K((UserSession) this.A01);
            case 16:
                N6W n6w = (N6W) this.A01;
                return new NCQ(n6w.requireActivity(), AbstractC166987dD.A0r(n6w.A06), ((ClipsCreationViewModel) n6w.A05.getValue()).A0S);
            case 17:
                N6W n6w2 = (N6W) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(n6w2.A06), n6w2.requireActivity());
            case 18:
                N6W n6w3 = (N6W) this.A01;
                return AbstractC50522MSa.A0W(n6w3, n6w3.A06);
            case Process.SIGSTOP /* 19 */:
            case 20:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
                return AbstractC25235BEs.A0U(this.A01);
            case 24:
                C187418Sj c187418Sj = ((C52133N5h) this.A01).A06;
                if (c187418Sj == null) {
                    str = "clipsTimelineButtonEventProvider";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c187418Sj.A0F(Oz8.A00);
                return C0eB.A00;
            case 25:
                NI7.A01((NI7) this.A01);
                return C0eB.A00;
            case 26:
                NI7 ni7 = (NI7) this.A01;
                C51164Mj7 c51164Mj7 = ni7.A0D;
                NIW niw = ni7.A0H;
                int A07 = MSZ.A07(((AbstractC50863Mdu) niw).A01);
                Integer[] numArr = ni7.A0B.A02;
                c51164Mj7.A01(A07, MSW.A07(numArr, 0), MSW.A07(numArr, 1));
                return Boolean.valueOf(niw.A0U(ni7.A05, MSW.A07(numArr, 0), MSW.A07(numArr, 1), true, true, true));
            case 27:
                NI7 ni72 = (NI7) this.A01;
                Integer[] numArr2 = ni72.A0B.A02;
                NI7.A04(ni72, MSW.A07(numArr2, 0), MSW.A07(numArr2, 1));
                return C0eB.A00;
            case 28:
                RecyclerView recyclerView = ((NI7) this.A01).A08;
                boolean z = true;
                if (recyclerView == null || !recyclerView.A1D()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Context context = ((NI7) this.A01).A06;
                return Integer.valueOf((int) (((int) (AbstractC167017dG.A0B(context) / AbstractC50522MSa.A00(context, OZQ.A00))) * 0.5d));
            case 30:
                return Integer.valueOf((int) (((OXZ) r0).A00 / AbstractC50522MSa.A00(((NI7) this.A01).A06, OZQ.A00)));
            case 31:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(((AbstractC52130N5e) clipsStackedTimelineFragment).A05);
                List A1J = AbstractC166987dD.A1J(EnumC53256Ngu.A07);
                C8NL c8nl = clipsStackedTimelineFragment.A0e;
                if (c8nl == null) {
                    str = "clipsTransformViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C56283Oyu(A0r, EnumC53114NeR.A03, A1J, MSW.A1F(c8nl, 10), C57747Pja.A00(clipsStackedTimelineFragment, 13));
            case 32:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment2 = (ClipsStackedTimelineFragment) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(((AbstractC52130N5e) clipsStackedTimelineFragment2).A05);
                FragmentActivity requireActivity = clipsStackedTimelineFragment2.requireActivity();
                ClipsCreationViewModel clipsCreationViewModel = clipsStackedTimelineFragment2.A0Z;
                if (clipsCreationViewModel != null) {
                    String str3 = clipsCreationViewModel.A0S;
                    C87D c87d = clipsStackedTimelineFragment2.A0X;
                    if (c87d != null) {
                        return new ND1(requireActivity, A0r2, c87d, str3);
                    }
                    str2 = "clipsAudioVolumeViewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "clipsCreationViewModel";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 33:
                AbstractC52130N5e abstractC52130N5e = (AbstractC52130N5e) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(abstractC52130N5e.A05), abstractC52130N5e.requireActivity());
            case 34:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment3 = (ClipsStackedTimelineFragment) this.A01;
                Application A0L = AbstractC25231BEo.A0L(clipsStackedTimelineFragment3);
                UserSession A0r3 = AbstractC166987dD.A0r(((AbstractC52130N5e) clipsStackedTimelineFragment3).A05);
                C50868Mdz c50868Mdz = clipsStackedTimelineFragment3.A0h;
                if (c50868Mdz == null) {
                    str2 = "stackedTimelineViewModel";
                } else {
                    C187358Sd c187358Sd = clipsStackedTimelineFragment3.A0d;
                    if (c187358Sd != null) {
                        C8NF c8nf = clipsStackedTimelineFragment3.A0Y;
                        if (c8nf == null) {
                            str2 = "clipsColorFilterViewModel";
                        } else {
                            ClipsCreationViewModel clipsCreationViewModel2 = clipsStackedTimelineFragment3.A0Z;
                            if (clipsCreationViewModel2 != null) {
                                C183298Bb c183298Bb = clipsStackedTimelineFragment3.A0l;
                                if (c183298Bb == null) {
                                    str2 = "bitmapTimelineViewModel";
                                } else {
                                    C87D c87d2 = clipsStackedTimelineFragment3.A0X;
                                    if (c87d2 != null) {
                                        NIX nix = clipsStackedTimelineFragment3.A0i;
                                        if (nix == null) {
                                            str2 = "timedElementsViewModel";
                                        } else {
                                            C8NL c8nl2 = clipsStackedTimelineFragment3.A0e;
                                            if (c8nl2 == null) {
                                                str2 = "clipsTransformViewModel";
                                            } else {
                                                C185278Js c185278Js = clipsStackedTimelineFragment3.A0A;
                                                if (c185278Js == null) {
                                                    str2 = "audioFilterViewModel";
                                                } else {
                                                    C50864Mdv c50864Mdv = clipsStackedTimelineFragment3.A0W;
                                                    if (c50864Mdv == null) {
                                                        str2 = "clipsAudioVoiceEffectsViewModel";
                                                    } else {
                                                        return new C52326NDp(A0L, A0r3, c185278Js, c50864Mdv, c87d2, c8nf, clipsCreationViewModel2, c187358Sd, c8nl2, c50868Mdz, nix, c183298Bb);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str2 = "clipsAudioVolumeViewModel";
                                }
                            }
                            str2 = "clipsCreationViewModel";
                        }
                    }
                    str2 = "clipsTimelineEditorViewModel";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 35:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment4 = (ClipsStackedTimelineFragment) this.A01;
                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment4.A0F;
                if (clipsStackedTimelineViewController != null) {
                    clipsStackedTimelineViewController.A0B.ATn();
                    AbstractC55200OeA.A02(clipsStackedTimelineViewController.A0O());
                    ClipsStackedTimelineFragment.A0H(clipsStackedTimelineFragment4, true);
                    C187358Sd c187358Sd2 = clipsStackedTimelineFragment4.A0d;
                    if (c187358Sd2 != null) {
                        MSZ.A1M(c187358Sd2);
                        C87H c87h = clipsStackedTimelineFragment4.A0j;
                        if (c87h == null) {
                            str2 = "videoPlaybackViewModel";
                        } else {
                            C87J A0P = MSX.A0P(c87h);
                            if (A0P != null) {
                                ClipsStackedTimelineFragment.A0C(clipsStackedTimelineFragment4, A0P.CFM());
                            }
                            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = clipsStackedTimelineFragment4.A0G;
                            if (clipsTimelineActionBarViewController == null) {
                                str2 = "actionBarViewController";
                            } else {
                                O7M o7m = clipsTimelineActionBarViewController.A00;
                                if (o7m == null) {
                                    str2 = "buttonDebouncer";
                                } else {
                                    o7m.A01 = false;
                                    return C0eB.A00;
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    str2 = "clipsTimelineEditorViewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "viewController";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 36:
                return AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0r(((AbstractC52130N5e) this.A01).A05), 36318136080930778L);
            case 37:
                UserSession A0r4 = AbstractC166987dD.A0r(((AbstractC52130N5e) this.A01).A05);
                return AbstractC166997dE.A0c(AbstractC166997dE.A0U(A0r4), A0r4, 36322113220519940L);
            case 38:
            case 39:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment5 = (ClipsStackedTimelineFragment) this.A01;
                if (clipsStackedTimelineFragment5.A0t) {
                    C50868Mdz c50868Mdz2 = clipsStackedTimelineFragment5.A0h;
                    if (c50868Mdz2 == null) {
                        str = "stackedTimelineViewModel";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    i = c50868Mdz2.A03;
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 40:
                NI5 ni5 = ((ClipsStackedTimelineFragment) this.A01).A0E;
                if (ni5 == null) {
                    str = "videoTrackViewController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                ni5.A09.A0A(ni5.A0A);
                ni5.A03 = true;
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                ClipsStackedTimelineFragment clipsStackedTimelineFragment6 = (ClipsStackedTimelineFragment) this.A01;
                ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = clipsStackedTimelineFragment6.A0F;
                if (clipsStackedTimelineViewController2 != null) {
                    clipsStackedTimelineViewController2.A0E();
                    C55103ObG c55103ObG = clipsStackedTimelineFragment6.A0B;
                    if (c55103ObG == null) {
                        str2 = "audioElementTracksManager";
                    } else {
                        Iterator A01 = C55103ObG.A01(c55103ObG);
                        while (A01.hasNext()) {
                            MSW.A0U(A01).A0E();
                        }
                        Iterator A00 = C55103ObG.A00(c55103ObG);
                        while (A00.hasNext()) {
                            MSW.A0U(A00).A0E();
                        }
                        NI5 ni52 = clipsStackedTimelineFragment6.A0E;
                        str = "videoTrackViewController";
                        if (ni52 != null) {
                            ni52.A0E();
                            NI5 ni53 = clipsStackedTimelineFragment6.A0E;
                            if (ni53 != null) {
                                ni53.A09.A0A(null);
                                ni53.A03 = false;
                                C54843OMo c54843OMo = clipsStackedTimelineFragment6.A0D;
                                if (c54843OMo == null) {
                                    str2 = "timedElementTracksManager";
                                } else {
                                    Iterator it = c54843OMo.A0C.iterator();
                                    while (it.hasNext()) {
                                        MSW.A0U(it).A0E();
                                    }
                                    Iterator it2 = c54843OMo.A0B.iterator();
                                    while (it2.hasNext()) {
                                        MSW.A0U(it2).A0E();
                                    }
                                    return C0eB.A00;
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "viewController";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 43:
                return AbstractC50523MSb.A0A(this.A01);
        }
    }
}
