package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.toolbar.CreationToolbarView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes8.dex */
public final class KCP extends AbstractC59962oe implements InterfaceC60072op, InterfaceC41501vz, MQQ {
    public static final String __redex_internal_original_name = "VideoEditFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public Toast A07;
    public MXB A08;
    public MOM A09;
    public MediaEditActionBar A0A;
    public OXA A0B;
    public CreationToolbarView A0C;
    public C50930Mez A0D;
    public KB4 A0E;
    public OM7 A0F;
    public C9KK A0G;
    public OXC A0H;
    public Integer A0I;
    public boolean A0J;
    public boolean A0K;
    public Bundle A0L;
    public VideoSession A0M;
    public FilterGroupModel A0N;
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A0X = new com.instagram.creation.base.ui.mediatabbar.Tab(2131962556, 0);
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A0Y = new com.instagram.creation.base.ui.mediatabbar.Tab(2131975753, 1);
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A0W = new com.instagram.creation.base.ui.mediatabbar.Tab(2131956885, 2);
    public final InterfaceC41501vz A0T = new C44288Jhe(this, 2);
    public final InterfaceC41501vz A0U = new C44288Jhe(this, 4);
    public final Handler A0Q = new Handler();
    public final InterfaceC09390do A0O = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0P = AbstractC25225BEi.A0a(new C50161MDo(this, 17), new C50161MDo(this, 18), new ME0(38, this, null), AbstractC25225BEi.A1D(C44529JmZ.class));
    public final JR8 A0S = new JR8(this, 0);
    public final C44288Jhe A0R = new C44288Jhe(this, 3);
    public final String A0V = "video_edit";

    public static final void A04(KCP kcp) {
        View view;
        if (kcp.A0E != null && (view = kcp.A01) != null) {
            view.setSelected(false);
            KB4 kb4 = kcp.A0E;
            if (kb4 != null) {
                kb4.A0C();
            }
            if (kb4 != null) {
                Bundle bundle = kcp.A0L;
                if (bundle == null) {
                    C14360o3.A0F("arguments");
                    throw C00O.createAndThrow();
                }
                kb4.onSaveInstanceState(bundle);
            }
            kcp.A0E = null;
        }
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drj(float f, float f2) {
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drl(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.base.provider.BaseCreationProvider");
        MOM mom = (MOM) requireActivity;
        this.A09 = mom;
        FilterGroupModel filterGroupModel = null;
        if (mom == null) {
            C14360o3.A0F("provider");
            throw C00O.createAndThrow();
        }
        this.A08 = ((MediaCaptureActivity) mom).A07;
        VideoSession A04 = ((MX5) AbstractC43594JPz.A0Q(AbstractC13320mI.A01(context, InterfaceC189608af.class))).A01.A04();
        this.A0M = A04;
        if (A04 != null) {
            filterGroupModel = A04.A0D;
        }
        this.A0N = filterGroupModel;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.A0L;
        if (bundle2 == null) {
            C14360o3.A0F("arguments");
            throw C00O.createAndThrow();
        }
        bundle.putAll(bundle2);
        C47Z A0i = AbstractC43593JPy.A0i(this);
        if (A0i == null) {
            C0f5 AEp = C18950wb.A01.AEp(__redex_internal_original_name, 817901174);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Getting pendingMedia failed");
            AEp.report();
            return;
        }
        C915647m c915647m = A0i.A1i;
        if (c915647m == null) {
            VideoSession videoSession = this.A0M;
            if (videoSession != null) {
                i = videoSession.A08;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            i = c915647m.A01;
        }
        VideoSession videoSession2 = this.A0M;
        if (videoSession2 != null) {
            int i2 = videoSession2.A07;
            int i3 = videoSession2.A06;
            int i4 = videoSession2.A05;
            boolean z = videoSession2.A0L;
            c915647m.A01 = i;
            A0i.A05 = i2;
            ClipInfo clipInfo = A0i.A1N;
            clipInfo.A07 = i3;
            clipInfo.A05 = i4;
            A0i.A5F = z;
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final NLG A00(KCP kcp) {
        String str;
        C9KK c9kk = kcp.A0G;
        if (c9kk != null) {
            c9kk.A09 = "feed_post_cap_cover_fragment";
            AbstractC31718DwN.A01(AbstractC166987dD.A0r(kcp.A0O), C05F.A0d);
            kcp.A0I = C05F.A0N;
            Bundle bundle = kcp.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putBoolean(MSV.A00(876), false);
                NLG nlg = new NLG();
                ((KB4) nlg).A00 = kcp.mView;
                ((KB4) nlg).A05 = kcp.A0G;
                ((KB4) nlg).A06 = kcp.A0N;
                ((KB4) nlg).A07 = kcp.A0H;
                OM7 om7 = kcp.A0F;
                if (om7 == null) {
                    str = "videoPreviewController";
                } else {
                    ((KB4) nlg).A04 = om7;
                    nlg.setArguments(bundle2);
                    return nlg;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C45758KNl A01(KCP kcp) {
        String str;
        C9KK c9kk = kcp.A0G;
        if (c9kk != null) {
            c9kk.A09 = "feed_post_cap_filter_fragment";
            AbstractC31718DwN.A01(AbstractC166987dD.A0r(kcp.A0O), C05F.A0b);
            Bundle bundle = kcp.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                C45758KNl c45758KNl = new C45758KNl();
                ((KB4) c45758KNl).A00 = kcp.mView;
                ((KB4) c45758KNl).A05 = kcp.A0G;
                ((KB4) c45758KNl).A06 = kcp.A0N;
                MOM mom = kcp.A09;
                if (mom == null) {
                    str = "provider";
                } else {
                    ((KB4) c45758KNl).A02 = mom;
                    OM7 om7 = kcp.A0F;
                    if (om7 == null) {
                        str = "videoPreviewController";
                    } else {
                        ((KB4) c45758KNl).A04 = om7;
                        c45758KNl.setArguments(bundle2);
                        return c45758KNl;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final NLH A02(KCP kcp) {
        String str;
        C9KK c9kk = kcp.A0G;
        if (c9kk != null) {
            c9kk.A09 = "feed_post_cap_trim_fragment";
            AbstractC31718DwN.A01(AbstractC166987dD.A0r(kcp.A0O), C05F.A0c);
            Bundle bundle = kcp.A0L;
            if (bundle == null) {
                str = "arguments";
            } else {
                Bundle bundle2 = new Bundle(bundle);
                NLH nlh = new NLH();
                ((KB4) nlh).A00 = kcp.mView;
                ((KB4) nlh).A05 = kcp.A0G;
                ((KB4) nlh).A06 = kcp.A0N;
                ((KB4) nlh).A07 = kcp.A0H;
                OM7 om7 = kcp.A0F;
                if (om7 == null) {
                    str = "videoPreviewController";
                } else {
                    ((KB4) nlh).A04 = om7;
                    nlh.setArguments(bundle2);
                    return nlh;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(KCP kcp) {
        ViewParent parent;
        if (kcp.A0B == null && kcp.A0C != null) {
            UserSession A0r = AbstractC166987dD.A0r(kcp.A0O);
            Context requireContext = kcp.requireContext();
            CreationToolbarView creationToolbarView = kcp.A0C;
            if (creationToolbarView != null && (parent = creationToolbarView.getParent()) != null) {
                kcp.A0B = new OXA(requireContext, (ViewGroup) parent, A0r);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A05(KCP kcp, Integer num) {
        C14240no A0F;
        int i;
        KB4 kb4;
        Integer num2 = kcp.A0I;
        if (num2 != null && num == num2) {
            return;
        }
        Integer num3 = C05F.A0N;
        if (num == num3) {
            if (num2 == num3 && kcp.A0E != null) {
                return;
            }
            A04(kcp);
            View view = kcp.A00;
            kcp.A01 = view;
            if (view != null) {
                view.setSelected(true);
                kcp.A0E = A00(kcp);
                C14240no A0F2 = AbstractC43593JPy.A0F(kcp);
                KB4 kb42 = kcp.A0E;
                if (kb42 != null) {
                    A0F2.A0A(kb42, R.id.video_edit_fragment_container_front);
                    A0F2.A00();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        Integer num4 = C05F.A0C;
        if (num == num4) {
            if (num2 == num4 && kcp.A0E != null) {
                return;
            }
            A04(kcp);
            kcp.A0I = num4;
            View view2 = kcp.A05;
            kcp.A01 = view2;
            if (view2 != null) {
                view2.setSelected(true);
                kcp.A0E = A02(kcp);
                A0F = AbstractC43593JPy.A0F(kcp);
                i = R.id.video_edit_fragment_container_front;
                kb4 = kcp.A0E;
                if (kb4 == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            Integer num5 = C05F.A00;
            if (num2 == num5 && kcp.A0E != null) {
                return;
            }
            A04(kcp);
            kcp.A0I = num5;
            View view3 = kcp.A02;
            kcp.A01 = view3;
            if (view3 != null) {
                view3.setSelected(true);
                kcp.A0E = A01(kcp);
                A0F = AbstractC43593JPy.A0F(kcp);
                i = R.id.video_edit_fragment_container_front;
                kb4 = kcp.A0E;
                if (kb4 == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        A0F.A0A(kb4, i);
        A0F.A00();
    }

    public final C47Z A06(Context context) {
        return C25A.A00(AbstractC166987dD.A0r(this.A0O)).A03(AbstractC43594JPz.A0Q(context).E3z());
    }

    @Override // X.MQQ
    public final void Drk(com.instagram.creation.base.ui.mediatabbar.Tab tab, com.instagram.creation.base.ui.mediatabbar.Tab tab2) {
        View view;
        com.instagram.creation.base.ui.mediatabbar.Tab tab3 = A0X;
        if (C14360o3.A0K(tab2, tab3)) {
            if (tab != null && !tab.equals(tab3)) {
                C22C A0T = AbstractC43593JPy.A0T(this.A0O);
                if (A0T.A0J() != null) {
                    C22C.A08(EnumC50631MWs.A0I, A0T, "FEED_COLOR_FILTER_CAROUSEL_TAP", false);
                }
            }
            view = this.A02;
        } else if (C14360o3.A0K(tab2, A0Y)) {
            view = this.A05;
        } else if (!C14360o3.A0K(tab2, A0W)) {
            return;
        } else {
            view = this.A00;
        }
        if (view != null) {
            view.performClick();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0V;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0O);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        MXB mxb;
        MXB mxb2;
        InterfaceC60072op interfaceC60072op;
        InterfaceC08430c6 interfaceC08430c6 = this.A0E;
        if ((interfaceC08430c6 instanceof InterfaceC60072op) && (interfaceC60072op = (InterfaceC60072op) interfaceC08430c6) != null && interfaceC60072op.onBackPressed()) {
            return true;
        }
        boolean z = this.A0K;
        C47Z A0i = AbstractC43593JPy.A0i(this);
        if (!z) {
            if (A0i != null) {
                if ((A0i.A0q() || C55201OeB.A04(A0i) || AbstractC43592JPx.A0Z(this).A03(AbstractC43594JPz.A0R(requireContext()))) && (mxb2 = this.A08) != null && mxb2.A0A(null, C05F.A04)) {
                    return true;
                }
                String str = A0i.A3w;
                if (str != null) {
                    AbstractC916948n.A0G(str);
                }
                VideoSession A04 = ((MX5) AbstractC43594JPz.A0R(requireActivity())).A01.A04();
                A04.getClass();
                FilterGroupModel filterGroupModel = A04.A0E;
                if (filterGroupModel != null) {
                    A04.A0D = filterGroupModel.E3K();
                }
                C6WI.A01().A07(AbstractC166987dD.A0r(this.A0O), "gallery", true);
                return false;
            }
        } else if (A0i != null) {
            VideoSession videoSession = this.A0M;
            if (videoSession != null) {
                if (!C55201OeB.A05(A0i, videoSession.A08, videoSession.A07, videoSession.A06, videoSession.A05, videoSession.A0L) && AbstractC43592JPx.A0Z(this).A03(AbstractC43594JPz.A0R(requireContext())) && (mxb = this.A08) != null && mxb.A0A(null, C05F.A0j)) {
                    return true;
                }
                String str2 = A0i.A3w;
                if (str2 != null) {
                    AbstractC916948n.A0G(str2);
                }
                VideoSession videoSession2 = this.A0M;
                if (videoSession2 != null) {
                    int i = videoSession2.A08;
                    int i2 = videoSession2.A07;
                    int i3 = videoSession2.A06;
                    int i4 = videoSession2.A05;
                    boolean z2 = videoSession2.A0L;
                    A0i.A1i.A01 = i;
                    A0i.A05 = i2;
                    ClipInfo clipInfo = A0i.A1N;
                    clipInfo.A07 = i3;
                    clipInfo.A05 = i4;
                    A0i.A5F = z2;
                    VideoSession A042 = ((MX5) AbstractC43594JPz.A0R(requireContext())).A01.A04();
                    A042.getClass();
                    FilterGroupModel filterGroupModel2 = A042.A0E;
                    if (filterGroupModel2 != null) {
                        A042.A0D = filterGroupModel2.E3K();
                    }
                    C6WI A01 = C6WI.A01();
                    InterfaceC09390do interfaceC09390do = this.A0O;
                    A01.A07(AbstractC166987dD.A0r(interfaceC09390do), "edit_carousel", true);
                    AbstractC43593JPy.A1P(AbstractC166987dD.A0r(interfaceC09390do));
                    return true;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-202443407);
        super.onCreate(bundle);
        Bundle A0B = AbstractC31177DnL.A0B(this);
        this.A0L = A0B;
        if (bundle != null) {
            A0B.putAll(bundle);
        }
        if (AbstractC43840Ja3.A00(AbstractC166987dD.A0o(this.A0O))) {
            setDayNightMode(EnumC60792q3.A03);
        }
        Bundle bundle2 = this.A0L;
        if (bundle2 == null) {
            C14360o3.A0F("arguments");
            throw C00O.createAndThrow();
        }
        this.A0K = bundle2.getBoolean("VideoEditFragment.standalone_mode", false);
        this.A0J = AbstractC43841Ja4.A04(requireContext());
        C47Z A0i = AbstractC43593JPy.A0i(this);
        VideoSession videoSession = this.A0M;
        if (videoSession != null) {
            videoSession.A00(A0i);
        }
        VideoSession A04 = ((MX5) AbstractC43594JPz.A0R(requireActivity())).A01.A04();
        A04.getClass();
        A04.A0N.ELh();
        C0f9.A09(-1703419360, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC47113Ks8.A00(this, i2, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2030599075);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = this.A0J;
        int i = R.layout.fragment_video_edit_small;
        if (z) {
            i = R.layout.fragment_video_edit_v2;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View findViewById = requireActivity().findViewById(R.id.creation_secondary_actions);
        C14360o3.A07(findViewById);
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        viewGroup2.removeAllViews();
        layoutInflater.inflate(R.layout.action_bar_secondary_actions, viewGroup2);
        ViewStub A0M = AbstractC167007dF.A0M(viewGroup2, R.id.audio_button_stub);
        A0M.setLayoutResource(R.layout.mute_audio_button);
        A0M.inflate();
        AbstractC31176DnK.A0Q(this.A0O).A01(this, C50698MZt.class);
        C0f9.A09(-231072460, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1280004862);
        super.onDestroyView();
        AbstractC31176DnK.A0Q(this.A0O).A02(this, C50698MZt.class);
        this.A0Q.removeCallbacksAndMessages(null);
        this.A03 = null;
        OXC oxc = this.A0H;
        if (oxc != null) {
            oxc.A02();
        }
        this.A0H = null;
        this.A07 = null;
        this.A02 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A0G = null;
        this.A0C = null;
        C0f9.A09(915714600, A02);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(598594808);
        C0f9.A0A(-1092320867, AbstractC167017dG.A0N(obj, 1741203282));
        C0f9.A0A(-1596339824, A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1326972093);
        super.onPause();
        OM7 om7 = this.A0F;
        if (om7 == null) {
            C14360o3.A0F("videoPreviewController");
            throw C00O.createAndThrow();
        }
        C9KJ c9kj = om7.A03;
        c9kj.A04();
        c9kj.A01();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0O);
        A0Q.A02(this.A0T, LYE.class);
        A0Q.A02(this.A0U, LY6.class);
        A0Q.A02(this.A0S, LYF.class);
        A0Q.A02(this.A0R, LY5.class);
        C0f9.A09(103562080, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1989012122);
        super.onResume();
        requireActivity().setRequestedOrientation(1);
        OM7 om7 = this.A0F;
        if (om7 == null) {
            C14360o3.A0F("videoPreviewController");
            throw C00O.createAndThrow();
        }
        C9KJ c9kj = om7.A03;
        c9kj.A04();
        c9kj.A03();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A0O);
        A0Q.A01(this.A0T, LYE.class);
        A0Q.A01(this.A0U, LY6.class);
        A0Q.A01(this.A0S, LYF.class);
        A0Q.A01(this.A0R, LY5.class);
        C0f9.A09(1969535922, A02);
    }
}
