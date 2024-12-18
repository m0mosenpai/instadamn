package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMA extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC50422MOc {
    public static final String __redex_internal_original_name = "DirectThreadSharedMediaFragment";
    public RecyclerView A00;
    public C44573Jny A01;
    public IgdsEmptyState A02;
    public boolean A03;
    public boolean A04;
    public GridLayoutManager A05;
    public DirectAggregatedMediaViewerController A06;
    public C32886EdT A07;
    public DirectShareTarget A08;
    public C3o9 A09;
    public final C41761wQ A0C = AbstractC31173DnH.A0S();
    public final C1I4 A0B = new E0L(this, 12);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    private final InterfaceC83733oI A00(C3o9 c3o9) {
        if (JRE.A0A(c3o9)) {
            InterfaceC83733oI A05 = JRE.A05(JRE.A01(c3o9));
            if (A05 == null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(JRE.A01(c3o9).getClass());
                AbstractC167017dG.A1J(C18950wb.A01, AnonymousClass001.A0T(__redex_internal_original_name, "toThreadTarget", '.'), AbstractC166987dD.A14(AbstractC166997dE.A0x(AbstractC111324zv.A00(3335), A1C)), 20134884);
            }
            return A05;
        }
        if (c3o9 instanceof MsysThreadId) {
            return JRE.A03(c3o9);
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append(AbstractC111324zv.A00(3808));
        A1C2.append(c3o9.getClass());
        A1C2.append(' ');
        AbstractC167017dG.A1J(C18950wb.A01, AnonymousClass001.A0T(__redex_internal_original_name, "toThreadTarget", '.'), AbstractC166987dD.A14(AbstractC166997dE.A0v(c3o9, A1C2)), 20134884);
        return null;
    }

    @Override // X.InterfaceC50422MOc
    public final void DRN(View view, List list, int i) {
        C35169FfL c35169FfL;
        AbstractC167017dG.A1N(list, view);
        InterfaceC09390do interfaceC09390do = this.A0A;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        C3o9 c3o9 = this.A09;
        String str = "threadKey";
        String str2 = null;
        if (c3o9 != null) {
            if (AbstractC34068F1w.A00(requireActivity, A0r, c3o9)) {
                MediaViewerReplyBarEligibilityChecker mediaViewerReplyBarEligibilityChecker = (MediaViewerReplyBarEligibilityChecker) requireArguments().getSerializable("DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER");
                if (mediaViewerReplyBarEligibilityChecker == null) {
                    mediaViewerReplyBarEligibilityChecker = new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false);
                }
                if (i < list.size() && (c35169FfL = (C35169FfL) AbstractC001800i.A0O(list, i)) != null) {
                    str2 = c35169FfL.A05();
                }
                Context requireContext = requireContext();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                C3o9 c3o92 = this.A09;
                if (c3o92 != null) {
                    DirectShareTarget directShareTarget = this.A08;
                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A06;
                    if (directAggregatedMediaViewerController == null) {
                        str = "directAggregatedMediaViewerController";
                    } else {
                        C34696FQh c34696FQh = new C34696FQh(requireContext, view, A0r2, directAggregatedMediaViewerController, directShareTarget, c3o92);
                        c34696FQh.A06 = list;
                        c34696FQh.A01 = i;
                        c34696FQh.A03 = C05F.A01;
                        c34696FQh.A05 = str2;
                        c34696FQh.A02 = mediaViewerReplyBarEligibilityChecker;
                        c34696FQh.A04 = C05F.A00;
                        c34696FQh.A00();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131959140));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(4308);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        String str;
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A0A);
        C3o9 c3o9 = this.A09;
        if (c3o9 == null) {
            str = "threadKey";
        } else {
            C44573Jny c44573Jny = new C44573Jny(requireContext, this, A0r, this, A00(c3o9));
            this.A01 = c44573Jny;
            GridLayoutManager gridLayoutManager = this.A05;
            if (gridLayoutManager == null) {
                str = "gridLayoutManager";
            } else {
                gridLayoutManager.A01 = new C31854DzM(c44573Jny);
                int width = AbstractC31172DnG.A04(this).getWindowManager().getDefaultDisplay().getWidth();
                C44573Jny c44573Jny2 = this.A01;
                if (c44573Jny2 != null) {
                    c44573Jny2.A00 = (width - (c44573Jny2.A03.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top) * 2)) / 3;
                }
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.A01);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.shared_media_list);
        this.A05 = new GridLayoutManager(requireContext(), 3);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A0A);
        C3o9 c3o9 = this.A09;
        if (c3o9 == null) {
            str = "threadKey";
        } else {
            C44573Jny c44573Jny = new C44573Jny(requireContext, this, A0r, this, A00(c3o9));
            this.A01 = c44573Jny;
            GridLayoutManager gridLayoutManager = this.A05;
            str = "gridLayoutManager";
            if (gridLayoutManager != null) {
                gridLayoutManager.A01 = new C31854DzM(c44573Jny);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.A10(new C195638l4(false, 0, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top), AbstractC31177DnL.A02(this, R.dimen.afi_indicator_arrow_margin_top), 0));
                    GridLayoutManager gridLayoutManager2 = this.A05;
                    if (gridLayoutManager2 != null) {
                        recyclerView.setLayoutManager(gridLayoutManager2);
                        recyclerView.setAdapter(this.A01);
                    }
                }
                this.A02 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(EMA ema) {
        String str;
        if (!ema.A04 && ema.A01 != null) {
            GridLayoutManager gridLayoutManager = ema.A05;
            if (gridLayoutManager == null) {
                str = "gridLayoutManager";
            } else {
                int A1b = gridLayoutManager.A1b();
                C44573Jny c44573Jny = ema.A01;
                if (c44573Jny != null && (c44573Jny.getItemCount() - 1) - A1b <= 15) {
                    ema.A04 = true;
                    c44573Jny.A04.A01(AbstractC001800i.A0T(G3N.A00, c44573Jny.A02), null);
                    AbstractC167007dF.A0x(ema.A02);
                    C32886EdT c32886EdT = ema.A07;
                    if (c32886EdT == null) {
                        str = "permanentDirectThreadMediaStore";
                    } else {
                        C3o9 c3o9 = ema.A09;
                        if (c3o9 == null) {
                            str = "threadKey";
                        } else {
                            c32886EdT.A0A(c3o9, null);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A06;
        if (directAggregatedMediaViewerController == null) {
            return false;
        }
        return directAggregatedMediaViewerController.A0l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(416279579);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        boolean z = false;
        boolean z2 = requireArguments.getBoolean(AbstractC111324zv.A00(153), false);
        C3o9 A00 = AbstractC43826JZo.A00(requireArguments, "DirectThreadSharedMediaFragment.DIRECT_THREAD_KEY");
        if (A00 != null) {
            this.A09 = A00;
            this.A08 = (DirectShareTarget) requireArguments.getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
            C34659FOs c34659FOs = C32886EdT.A00;
            InterfaceC09390do interfaceC09390do = this.A0A;
            this.A07 = c34659FOs.A00(AbstractC166987dD.A0r(interfaceC09390do));
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = new DirectAggregatedMediaViewerController(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), null, 104, z, z2);
            this.A06 = directAggregatedMediaViewerController;
            registerLifecycleListener(directAggregatedMediaViewerController);
            this.A03 = true;
            C0f9.A09(1360537509, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(2080165008, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(235375319);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_thread_detail_shared_photos_and_videos, viewGroup, false);
        C0f9.A09(1370598604, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1230778330);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A01);
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-1488114324, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(509991219);
        super.onPause();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A0B);
        }
        this.A0C.A01();
        C0f9.A09(77515461, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Integer num;
        int A02 = C0f9.A02(528194101);
        super.onResume();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A14(this.A0B);
        }
        C32886EdT c32886EdT = this.A07;
        String str = "permanentDirectThreadMediaStore";
        if (c32886EdT != null) {
            C44573Jny c44573Jny = this.A01;
            if (c44573Jny != null) {
                num = Integer.valueOf(c44573Jny.A00);
            } else {
                num = null;
            }
            c32886EdT.A00 = num;
            C41761wQ c41761wQ = this.A0C;
            C3o9 c3o9 = this.A09;
            if (c3o9 == null) {
                str = "threadKey";
            } else {
                GKK.A00(c32886EdT.A09(c3o9, null), c41761wQ, this, 17);
                C0f9.A09(-1520518240, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
