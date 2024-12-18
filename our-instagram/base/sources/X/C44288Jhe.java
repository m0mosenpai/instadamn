package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;
import com.instagram.creation.capture.MediaCaptureFragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.follow.FollowButtonBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jhe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44288Jhe implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C44288Jhe(LLk lLk, int i) {
        this.A00 = i;
        switch (i) {
            case Process.SIGTERM /* 15 */:
            case 16:
                this.A01 = lLk;
                return;
            default:
                this.A01 = lLk;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        String str2;
        AbstractC50697MZs c52501NKu;
        int A03;
        int i;
        long max;
        int A032;
        int i2;
        String str3;
        int A033;
        int i3;
        C2EC c2ec;
        List list;
        C47946LGa c47946LGa;
        C45093JxN A01;
        String str4;
        switch (this.A00) {
            case 0:
                int A034 = C0f9.A03(-1861062482);
                C56024Otv c56024Otv = (C56024Otv) obj;
                int A035 = C0f9.A03(-83377180);
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
                com.instagram.creation.base.ui.mediatabbar.Tab tab = viewOnClickListenerC44269JhH.A03;
                if (tab == AbstractC43884Jap.A01 || tab == AbstractC43884Jap.A02) {
                    switch (c56024Otv.A00.intValue()) {
                        case 0:
                            str = ViewOnClickListenerC44269JhH.__redex_internal_original_name;
                            str2 = "onFocusKey not implemened";
                            C0K8.A0D(str, str2);
                            break;
                        case 1:
                            if (!viewOnClickListenerC44269JhH.A0H && !viewOnClickListenerC44269JhH.A0e.A06.A01()) {
                                viewOnClickListenerC44269JhH.A0C();
                                break;
                            }
                            break;
                        case 2:
                            if (!viewOnClickListenerC44269JhH.A0E && viewOnClickListenerC44269JhH.A0e.A00 != null && !viewOnClickListenerC44269JhH.A0H) {
                                AbstractC31718DwN.A01(viewOnClickListenerC44269JhH.A0a, C05F.A0H);
                                viewOnClickListenerC44269JhH.A0d.setPressed(true);
                                viewOnClickListenerC44269JhH.A0H = true;
                                viewOnClickListenerC44269JhH.A0D();
                                ViewOnClickListenerC44269JhH.A06(viewOnClickListenerC44269JhH, true);
                                break;
                            }
                            break;
                        case 3:
                            if (viewOnClickListenerC44269JhH.A0H) {
                                viewOnClickListenerC44269JhH.A0H = false;
                                try {
                                    if (viewOnClickListenerC44269JhH.A0Y.A0V()) {
                                        viewOnClickListenerC44269JhH.A0B();
                                        viewOnClickListenerC44269JhH.A0d.setPressed(false);
                                        viewOnClickListenerC44269JhH.A07();
                                        break;
                                    }
                                } catch (C6M2 unused) {
                                    break;
                                }
                            }
                            break;
                        case 4:
                            str = ViewOnClickListenerC44269JhH.__redex_internal_original_name;
                            str2 = "onZoomInKey not implemented";
                            C0K8.A0D(str, str2);
                            break;
                        default:
                            str = ViewOnClickListenerC44269JhH.__redex_internal_original_name;
                            str2 = "onZoomOutKey not implemented";
                            C0K8.A0D(str, str2);
                            break;
                    }
                }
                C0f9.A0A(1925461174, A035);
                C0f9.A0A(278032576, A034);
                return;
            case 1:
                A032 = C0f9.A03(959420802);
                C44316Ji7 c44316Ji7 = (C44316Ji7) obj;
                int A036 = C0f9.A03(-340518595);
                boolean z = c44316Ji7.A01;
                boolean z2 = false;
                Object obj2 = this.A01;
                if (z) {
                    MediaCaptureFragment mediaCaptureFragment = (MediaCaptureFragment) obj2;
                    GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = mediaCaptureFragment.mMediaTabHost;
                    gestureDetectorOnGestureListenerC44266JhD.A08 = false;
                    gestureDetectorOnGestureListenerC44266JhD.A05 = false;
                    gestureDetectorOnGestureListenerC44266JhD.A0I.setVisibility(8);
                    int i4 = 2;
                    if (AbstractC43593JPy.A0R(mediaCaptureFragment.A04).A0J) {
                        i4 = 1;
                    }
                    if (mediaCaptureFragment.A07 && c44316Ji7.A00 < i4) {
                        mediaCaptureFragment.mActionBar.setNextEnabledWithColor(false);
                    } else {
                        int i5 = c44316Ji7.A00;
                        int i6 = mediaCaptureFragment.A01;
                        mediaCaptureFragment.mActionBar.setNextEnabledWithColor(true);
                        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD2 = mediaCaptureFragment.mMediaTabHost;
                        if (i5 == i6) {
                            gestureDetectorOnGestureListenerC44266JhD2.setTextInfoBar(AbstractC43594JPz.A0t(AbstractC166997dE.A0N(mediaCaptureFragment), mediaCaptureFragment.A01, 2131973246));
                        } else {
                            GestureDetectorOnGestureListenerC44266JhD.A02(gestureDetectorOnGestureListenerC44266JhD2);
                            View view = gestureDetectorOnGestureListenerC44266JhD2.A02;
                            if (view != null) {
                                view.setVisibility(8);
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                } else {
                    MediaCaptureFragment mediaCaptureFragment2 = (MediaCaptureFragment) obj2;
                    GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD3 = mediaCaptureFragment2.mMediaTabHost;
                    GestureDetectorOnGestureListenerC44266JhD.A02(gestureDetectorOnGestureListenerC44266JhD3);
                    View view2 = gestureDetectorOnGestureListenerC44266JhD3.A02;
                    if (view2 != null) {
                        int i7 = 8;
                        view2.setVisibility(8);
                        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD4 = mediaCaptureFragment2.mMediaTabHost;
                        if (gestureDetectorOnGestureListenerC44266JhD4.A0I.getChildCount() > 1) {
                            z2 = true;
                        }
                        gestureDetectorOnGestureListenerC44266JhD4.A05 = z2;
                        MediaTabBar mediaTabBar = gestureDetectorOnGestureListenerC44266JhD4.A0I;
                        if (z2) {
                            i7 = 0;
                        }
                        mediaTabBar.setVisibility(i7);
                        mediaCaptureFragment2.mMediaTabHost.A08 = true;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C0f9.A0A(-1155066433, A036);
                i2 = -1802022319;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A033 = C0f9.A03(424116641);
                LYE lye = (LYE) obj;
                int A0N = AbstractC167017dG.A0N(lye, -1604345498);
                KCP kcp = (KCP) this.A01;
                Integer num = lye.A00;
                Integer num2 = C05F.A0N;
                str3 = "videoPreviewController";
                OM7 om7 = kcp.A0F;
                if (num == num2) {
                    if (om7 != null) {
                        C9KJ c9kj = om7.A03;
                        c9kj.A04();
                        c9kj.A01();
                        KCP.A05(kcp, num);
                        C0f9.A0A(-325012904, A0N);
                        i3 = 70255881;
                    }
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                if (om7 != null) {
                    om7.A01();
                    KCP.A05(kcp, num);
                    C0f9.A0A(-325012904, A0N);
                    i3 = 70255881;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
                C0f9.A0A(i3, A033);
                return;
            case 3:
                A032 = C0f9.A03(119863979);
                int A037 = C0f9.A03(1334972684);
                KCP kcp2 = (KCP) this.A01;
                MXB mxb = kcp2.A08;
                if (mxb != null) {
                    mxb.A08(C05F.A01);
                }
                if (kcp2.A0K) {
                    InterfaceC09390do interfaceC09390do = kcp2.A0P;
                    if (((C44529JmZ) interfaceC09390do.getValue()).A02()) {
                        OXA oxa = kcp2.A0B;
                        if (oxa != null) {
                            oxa.A01();
                            kcp2.A0I = null;
                            OM7 om72 = kcp2.A0F;
                            if (om72 == null) {
                                str3 = "videoPreviewController";
                                C14360o3.A0F(str3);
                                throw C00O.createAndThrow();
                            }
                            om72.A01();
                        } else {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0A(-151302801, A037);
                            throw A0g;
                        }
                    } else {
                        Integer num3 = kcp2.A0I;
                        if (num3 == C05F.A0N || num3 == C05F.A0C) {
                            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(kcp2.A0O), 36329096837349394L)) {
                                ((C44529JmZ) interfaceC09390do.getValue()).A00();
                            }
                        }
                        AbstractC43593JPy.A1P(AbstractC166987dD.A0r(kcp2.A0O));
                    }
                } else {
                    AbstractC31176DnK.A0Q(kcp2.A0O).A05(new Object());
                }
                C0f9.A0A(-1446914711, A037);
                i2 = 711565468;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                int A038 = C0f9.A03(547155841);
                int A039 = C0f9.A03(-399238858);
                KCP kcp3 = (KCP) this.A01;
                KCP.A04(kcp3);
                AbstractC10360h2 childFragmentManager = kcp3.getChildFragmentManager();
                C14360o3.A07(childFragmentManager);
                Fragment A0O = childFragmentManager.A0O(R.id.video_edit_fragment_container_back);
                if (A0O != null) {
                    AbstractC43594JPz.A19(A0O, childFragmentManager);
                }
                MXB mxb2 = kcp3.A08;
                if (mxb2 != null) {
                    mxb2.A08(C05F.A01);
                }
                C47Z A0i = AbstractC43593JPy.A0i(kcp3);
                InterfaceC189608af interfaceC189608af = (InterfaceC189608af) kcp3.getContext();
                if (A0i != null && interfaceC189608af != null) {
                    A0i.A02 = interfaceC189608af.Ak4().A00().ACq();
                }
                boolean z3 = ((MX5) AbstractC43594JPz.A0R(kcp3.requireContext())).A01.A0I;
                UserSession A0r = AbstractC166987dD.A0r(kcp3.A0O);
                if (z3) {
                    c52501NKu = new C52497NKq();
                } else {
                    c52501NKu = new C52501NKu();
                }
                C50695MZq.A00(A0r, c52501NKu);
                C0f9.A0A(1952312117, A039);
                C0f9.A0A(874291217, A038);
                return;
            case 5:
                A033 = C0f9.A03(-1759915763);
                int A0310 = C0f9.A03(1898143264);
                LGE lge = (LGE) this.A01;
                LGE.A00(lge);
                if (((C44192Jfv) obj).A00) {
                    lge.A01();
                }
                C0f9.A0A(1201507724, A0310);
                i3 = 215728346;
                C0f9.A0A(i3, A033);
                return;
            case 6:
                A033 = C0f9.A03(463210593);
                C43686JTv c43686JTv = (C43686JTv) obj;
                int A0N2 = AbstractC167017dG.A0N(c43686JTv, -764405038);
                InterfaceC09390do interfaceC09390do2 = ((JR2) this.A01).A2M;
                Long l = AbstractC43592JPx.A0f(interfaceC09390do2).A01;
                if (l != null) {
                    AbstractC43592JPx.A0f(interfaceC09390do2).A0S(Math.max(0L, l.longValue() - c43686JTv.A00));
                }
                C0f9.A0A(-607144139, A0N2);
                i3 = 109384544;
                C0f9.A0A(i3, A033);
                return;
            case 7:
                A033 = C0f9.A03(-1966211050);
                C133035zS c133035zS = (C133035zS) obj;
                int A0N3 = AbstractC167017dG.A0N(c133035zS, -2078480983);
                JR2 jr2 = (JR2) this.A01;
                if (jr2.A1V != C05F.A00 && jr2.A2z) {
                    C44142Jf7 A0d = AbstractC43593JPy.A0d(jr2);
                    int i8 = c133035zS.A00;
                    A0d.A01.markerPoint(31797299, "armadillo_threads_retrieval_end");
                    A0d.A05 = true;
                    A0d.A02 = i8;
                    JR2.A0T(jr2);
                }
                C0f9.A0A(-2063675688, A0N3);
                i3 = -1284795169;
                C0f9.A0A(i3, A033);
                return;
            case 8:
                A033 = C0f9.A03(-1394778088);
                int A0311 = C0f9.A03(-727755417);
                JR2 jr22 = (JR2) this.A01;
                if (jr22.A1V != C05F.A00 && jr22.A2z) {
                    AbstractC43593JPy.A0d(jr22).A01.markerPoint(31797299, "armadillo_threads_retrieval_start");
                }
                C0f9.A0A(1192960544, A0311);
                i3 = 1166523495;
                C0f9.A0A(i3, A033);
                return;
            case 9:
                A03 = C0f9.A03(115457833);
                int A0312 = C0f9.A03(-593769418);
                C48518LdG.A00((C48518LdG) this.A01);
                C0f9.A0A(-953398179, A0312);
                i = 2074494571;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(327980061);
                int A0313 = C0f9.A03(721792128);
                C44322JiE.A00((C44322JiE) this.A01);
                C0f9.A0A(-520757644, A0313);
                i = -936543642;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A033 = C0f9.A03(204790623);
                C2Io c2Io = (C2Io) obj;
                int A0314 = C0f9.A03(1499138600);
                if (c2Io != null) {
                    Integer num4 = c2Io.A01;
                    if (num4.equals(C05F.A0E) || num4.equals(C05F.A00) || num4.equals(C05F.A0F)) {
                        C48510Ld2 c48510Ld2 = (C48510Ld2) this.A01;
                        c48510Ld2.A03.A00(new MHI(c48510Ld2, 30), C18U.A01(C06090Tz.A05, c48510Ld2.A02, 36609708525885395L));
                    }
                }
                C0f9.A0A(-1431837729, A0314);
                i3 = -617852364;
                C0f9.A0A(i3, A033);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A033 = C0f9.A03(14544655);
                C2Io c2Io2 = (C2Io) obj;
                int A0315 = C0f9.A03(-1315225550);
                if (c2Io2 != null) {
                    C48525LdN c48525LdN = (C48525LdN) this.A01;
                    HandlerC25861Nt handlerC25861Nt = c48525LdN.A00;
                    if (handlerC25861Nt == null) {
                        str3 = "handler";
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                    handlerC25861Nt.A01(33735910, new M4R(c48525LdN, c2Io2));
                }
                C0f9.A0A(259578299, A0315);
                i3 = 17763601;
                C0f9.A0A(i3, A033);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(693841619);
                C48042Ir c48042Ir = (C48042Ir) obj;
                int A0316 = C0f9.A03(-1593577075);
                C14360o3.A0B(c48042Ir, 0);
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                if (C14360o3.A0K(c48042Ir.A00, JRE.A01(directVisualMessageViewerController.A0x))) {
                    C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
                    if (c47946LGa2 != null) {
                        FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                        UserSession userSession = directVisualMessageViewerController.A0m;
                        C2EC c2ec2 = directVisualMessageViewerController.A0n;
                        if (c2ec2 != null) {
                            ArrayList A04 = AbstractC101604hV.A04(fragmentActivity, userSession, c2ec2, c48042Ir.A01);
                            int i9 = c47946LGa2.A01;
                            List list2 = c47946LGa2.A03;
                            int size = i9 - list2.size();
                            if (size > 0) {
                                list2.addAll(A04.subList(0, Math.min(size, A04.size())));
                            }
                        } else {
                            IllegalStateException A0g2 = AbstractC166997dE.A0g();
                            C0f9.A0A(-313150937, A0316);
                            throw A0g2;
                        }
                    }
                    DirectVisualMessageViewerController.A0A(directVisualMessageViewerController);
                    L03 l03 = directVisualMessageViewerController.A0I;
                    if (l03 != null) {
                        DirectVisualMessageViewerController directVisualMessageViewerController2 = l03.A00;
                        if (!directVisualMessageViewerController2.A0e.isFinishing()) {
                            DirectVisualMessageViewerController.A0O(directVisualMessageViewerController2, l03.A01);
                        }
                    }
                    directVisualMessageViewerController.A0I = null;
                    directVisualMessageViewerController.A0T = false;
                }
                C0f9.A0A(-1628586805, A0316);
                i2 = -500386452;
                C0f9.A0A(i2, A032);
                return;
            case 14:
                A032 = C0f9.A03(-1620863791);
                C2Io c2Io3 = (C2Io) obj;
                int A0317 = C0f9.A03(-2037655313);
                C14360o3.A0B(c2Io3, 0);
                DirectVisualMessageViewerController directVisualMessageViewerController3 = (DirectVisualMessageViewerController) this.A01;
                if (c2Io3.A01 == C05F.A0M) {
                    DirectThreadKey directThreadKey = c2Io3.A00;
                    if (directThreadKey.A00 != null && (c2ec = directVisualMessageViewerController3.A0n) != null && c2ec.C7I() != null && directVisualMessageViewerController3.A0J != null && directVisualMessageViewerController3.A0G != null && C14360o3.A0K(directThreadKey.A00, c2ec.C7I()) && (list = c2Io3.A04) != null && list.size() == 1 && (c47946LGa = directVisualMessageViewerController3.A0G) != null && (A01 = c47946LGa.A01(c47946LGa.A00)) != null && (str4 = A01.A0K) != null) {
                        C83403nh c83403nh = (C83403nh) list.get(0);
                        if (c83403nh.A0h() != null && C14360o3.A0K(c83403nh.A0h(), str4)) {
                            if (directVisualMessageViewerController3.A0J != null) {
                                UserSession userSession2 = directVisualMessageViewerController3.A0m;
                                FragmentActivity fragmentActivity2 = directVisualMessageViewerController3.A0e;
                                C1575675q c1575675q = new C1575675q(userSession2, c83403nh, A01.A0I);
                                PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = A01.A00;
                                PrivacyMediaOverlayViewModel A042 = c1575675q.A04(fragmentActivity2, false);
                                boolean z4 = !C14360o3.A0K(privacyMediaOverlayViewModel, A042);
                                if (z4) {
                                    A01.A00 = A042;
                                }
                                DirectVisualMessageViewerController.A0H(directVisualMessageViewerController3);
                                if (z4) {
                                    DirectVisualMessageViewerController.A0E(directVisualMessageViewerController3);
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                }
                C0f9.A0A(-1842855479, A0317);
                i2 = 877443948;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGTERM /* 15 */:
                LLk.A0J((LLk) this.A01);
                return;
            case 16:
                LLk.A0K((LLk) this.A01);
                return;
            case 17:
                A032 = C0f9.A03(1040671866);
                int A0318 = C0f9.A03(891173721);
                InterfaceC83733oI interfaceC83733oI = ((C48032Iq) obj).A00;
                if (interfaceC83733oI instanceof MsysThreadId) {
                    MsysThreadId A0319 = AbstractC1345466e.A03(interfaceC83733oI);
                    LLk lLk = (LLk) this.A01;
                    lLk.A0u.remove(LLk.A01(lLk, A0319));
                }
                C3o9 A05 = AbstractC1345466e.A05(interfaceC83733oI);
                LLk lLk2 = (LLk) this.A01;
                if (lLk2.A0v.remove(A05)) {
                    lLk2.A0r.A01();
                }
                LLk.A0J(lLk2);
                C0f9.A0A(-201586844, A0318);
                i2 = -148980606;
                C0f9.A0A(i2, A032);
                return;
            case 18:
                A032 = C0f9.A03(-1639755156);
                C3MC c3mc = (C3MC) obj;
                int A0N4 = AbstractC167017dG.A0N(c3mc, 1021326253);
                String str5 = c3mc.A01;
                KBN kbn = (KBN) this.A01;
                String str6 = kbn.A0A;
                if (str6 == null) {
                    str3 = "userId";
                } else {
                    if (C14360o3.A0K(str5, str6) && kbn.A05 != null) {
                        View view3 = kbn.A02;
                        if (view3 == null) {
                            str3 = "containerView";
                        } else {
                            ((FollowButtonBase) view3.requireViewById(R.id.profile_preview_card_follow_button)).A0J.A04(kbn, AbstractC166987dD.A0r(kbn.A0E), kbn.A05);
                        }
                    }
                    C0f9.A0A(848739313, A0N4);
                    i2 = 1989378271;
                    C0f9.A0A(i2, A032);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(-209485518);
                int A0N5 = AbstractC167017dG.A0N(obj, -573852460);
                C49508LuL c49508LuL = (C49508LuL) this.A01;
                Iterator A15 = AbstractC166997dE.A15(c49508LuL.A04);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    InterfaceC58362lv interfaceC58362lv = (InterfaceC58362lv) entry.getKey();
                    boolean z5 = ((C48101LRb) entry.getValue()).A00;
                    C14360o3.A0B(interfaceC58362lv, 1);
                    List list3 = (List) c49508LuL.A05.get(interfaceC58362lv);
                    if (list3 != null) {
                        list3.add(obj);
                        if (z5) {
                            interfaceC58362lv.onChanged(list3);
                            list3.clear();
                        }
                    }
                }
                C0f9.A0A(-1110901903, A0N5);
                i2 = 326162878;
                C0f9.A0A(i2, A032);
                return;
            case 20:
                A032 = C0f9.A03(1458026063);
                C70712Wfb c70712Wfb = (C70712Wfb) obj;
                int A0320 = C0f9.A03(1352190680);
                int intValue = c70712Wfb.A01.intValue();
                if (intValue != 8) {
                    if (intValue == 4) {
                        L20 l20 = (L20) this.A01;
                        l20.A00.A02(l20.A01, C70712Wfb.class);
                    }
                } else {
                    L20 l202 = (L20) this.A01;
                    if (c70712Wfb.A00 != null) {
                        C11T.A02(new M21(l202));
                    }
                }
                C0f9.A0A(-571746665, A0320);
                i2 = 2145257973;
                C0f9.A0A(i2, A032);
                return;
            case 21:
                A03 = C0f9.A03(283862562);
                LYH lyh = (LYH) obj;
                int A0N6 = AbstractC167017dG.A0N(lyh, -1819116522);
                C3CY A0321 = C45510KCz.A03((C45510KCz) this.A01);
                AbstractC166987dD.A1Z(new PZW(A0321, (InterfaceC23621Ds) null, 42, lyh.A00), AbstractC141776au.A00(A0321));
                C0f9.A0A(-1555345248, A0N6);
                i = -1140535780;
                C0f9.A0A(i, A03);
                return;
            case 22:
                A03 = C0f9.A03(1187651844);
                C43686JTv c43686JTv2 = (C43686JTv) obj;
                int A0N7 = AbstractC167017dG.A0N(c43686JTv2, 459652263);
                C46104Kb4 c46104Kb4 = (C46104Kb4) this.A01;
                c46104Kb4.updateExtras(c46104Kb4.A04);
                C47959LGv c47959LGv = c46104Kb4.A09;
                long j = c43686JTv2.A00;
                synchronized (c47959LGv) {
                    c47959LGv.A01 = Math.max(c47959LGv.A01, j);
                }
                synchronized (c47959LGv) {
                    max = Math.max(0L, c47959LGv.A00 - c47959LGv.A01);
                }
                c46104Kb4.A0G(c46104Kb4.A0A, "iris_message_sync", AnonymousClass001.A0f("seqId=", ", delta=", j, max));
                c46104Kb4.maybeEndFlowSuccess("iris_sync");
                C0f9.A0A(-1935378390, A0N7);
                i = -1293536833;
                C0f9.A0A(i, A03);
                return;
            default:
                A032 = C0f9.A03(1683342171);
                C5EX c5ex = (C5EX) obj;
                int A0N8 = AbstractC167017dG.A0N(c5ex, 926459290);
                C46104Kb4 c46104Kb42 = (C46104Kb4) this.A01;
                c46104Kb42.updateExtras(c46104Kb42.A04);
                Integer num5 = c5ex.A02;
                if (num5 == C05F.A01) {
                    c46104Kb42.A0B(c46104Kb42.A0A, "iris_subscription");
                } else if (num5 == C05F.A0C) {
                    c46104Kb42.A0I(c46104Kb42.A0A, "iris_subscription", null);
                    c46104Kb42.maybeEndFlowSuccess("iris_subscription");
                }
                C0f9.A0A(-1618727286, A0N8);
                i2 = -909154740;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    public C44288Jhe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
