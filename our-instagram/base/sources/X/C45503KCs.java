package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.KCs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45503KCs extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "BoostMediaPickerSubTabFragment";
    public int A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public RecyclerView A04;
    public AppBarLayout A05;
    public ViewOnTouchListenerC67974V4p A06;
    public IgdsMediaButton A07;
    public SpinnerImageView A08;
    public boolean A09;
    public final List A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    public static final void A02(C45503KCs c45503KCs, C44793JsE c44793JsE, C38321qM c38321qM, int i) {
        if (c45503KCs.isResumed() && c38321qM.BRp() == EnumC40111tc.A0a) {
            InterfaceC09390do interfaceC09390do = c45503KCs.A0E;
            if (!c38321qM.equals(((C30E) interfaceC09390do.getValue()).A0G())) {
                A04(c45503KCs, "media_mismatch");
                ((C30E) interfaceC09390do.getValue()).A0S(c38321qM, c45503KCs, c44793JsE, new C4QP(false, false, false, false), i, i, AbstractC37303Gc4.A0E(c38321qM).A01(), true, false);
                c45503KCs.A00 = i;
            }
        }
    }

    public static final void A04(C45503KCs c45503KCs, String str) {
        InterfaceC09390do interfaceC09390do = c45503KCs.A0E;
        if (((C30E) interfaceC09390do.getValue()).A0G() != null) {
            ((C30E) interfaceC09390do.getValue()).A0V(str, true, true);
            c45503KCs.A00 = -1;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_media_picker_sub_tab_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0e;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BoostMediaPickerTabType boostMediaPickerTabType = BoostMediaPickerTabType.A06;
        java.util.Set A07 = AbstractC16830sb.A07(boostMediaPickerTabType, BoostMediaPickerTabType.A03);
        InterfaceC09390do interfaceC09390do = this.A0D;
        float f = 1.0f;
        if (A07.contains(interfaceC09390do.getValue())) {
            f = 0.5625f;
        }
        this.A02 = view.findViewById(R.id.main_container_view);
        this.A08 = (SpinnerImageView) view.findViewById(R.id.loading_indicator);
        View view2 = this.A02;
        if (view2 != null) {
            ViewStub A0M = AbstractC167007dF.A0M(view2, R.id.media_grid_container);
            Context context = A0M.getContext();
            View inflate = A0M.inflate();
            if (inflate != null) {
                RecyclerView A0B = AbstractC43592JPx.A0B(inflate, R.id.media_grid_recycler_view);
                View view3 = null;
                if (A0B != null) {
                    A0B.setItemAnimator(null);
                    A0B.setLayoutManager(new GridLayoutManager(context, 3));
                    A0B.A10(new C51184MjS(AbstractC43594JPz.A04(context), 1));
                    A0B.A14(new C153156uj(A0B.A0D, new JY9(this, 5), C153146ui.A07, true, false));
                    C66392zG A00 = C66362zD.A00(context);
                    A00.A08 = true;
                    C66362zD A0R = AbstractC31173DnH.A0R(A00, new C45663KJa(new C47259KuW(this), this, f));
                    AbstractC43593JPy.A1O(A0R);
                    A0R.notifyDataSetChanged();
                    A0B.setAdapter(A0R);
                } else {
                    A0B = null;
                }
                this.A03 = A0B;
                View findViewById = inflate.findViewById(R.id.empty_media_grid_view);
                if (findViewById != null) {
                    int ordinal = ((BoostMediaPickerTabType) interfaceC09390do.getValue()).ordinal();
                    TextView A0e2 = AbstractC166987dD.A0e(findViewById, R.id.empty_media_grid_title);
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (A0e2 != null) {
                                A0e2.setText(2131961747);
                                A0e2.setVisibility(0);
                            }
                            TextView A0e3 = AbstractC166987dD.A0e(findViewById, R.id.empty_media_grid_message);
                            if (A0e3 != null) {
                                A0e3.setText(2131961746);
                                A0e3.setVisibility(0);
                            }
                            A0e = AbstractC166987dD.A0e(findViewById, R.id.create_media_button);
                            if (A0e != null) {
                                A0e.setText(2131966069);
                                i = 29;
                                ViewOnClickListenerC48064LPp.A00(A0e, i, this);
                                A0e.setVisibility(0);
                            }
                            view3 = findViewById;
                        } else {
                            if (A0e2 != null) {
                                A0e2.setText(2131961749);
                                A0e2.setVisibility(0);
                            }
                            TextView A0e4 = AbstractC166987dD.A0e(findViewById, R.id.empty_media_grid_message);
                            if (A0e4 != null) {
                                A0e4.setText(2131961748);
                                A0e4.setVisibility(0);
                            }
                            A0e = AbstractC166987dD.A0e(findViewById, R.id.create_media_button);
                            if (A0e != null) {
                                A0e.setText(2131966138);
                                i = 28;
                                ViewOnClickListenerC48064LPp.A00(A0e, i, this);
                                A0e.setVisibility(0);
                            }
                            view3 = findViewById;
                        }
                    } else {
                        if (A0e2 != null) {
                            A0e2.setText(2131961751);
                            A0e2.setVisibility(0);
                        }
                        TextView A0e5 = AbstractC166987dD.A0e(findViewById, R.id.empty_media_grid_message);
                        if (A0e5 != null) {
                            A0e5.setText(2131961750);
                            A0e5.setVisibility(0);
                        }
                        A0e = AbstractC166987dD.A0e(findViewById, R.id.create_media_button);
                        if (A0e != null) {
                            A0e.setText(2131966148);
                            i = 27;
                            ViewOnClickListenerC48064LPp.A00(A0e, i, this);
                            A0e.setVisibility(0);
                        }
                        view3 = findViewById;
                    }
                }
                this.A01 = view3;
                ViewStub A0M2 = AbstractC167007dF.A0M(view2, R.id.media_thumbnail_preview_container);
                View inflate2 = A0M2.inflate();
                inflate2.setVisibility(0);
                ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = this.A06;
                if (viewOnTouchListenerC67974V4p != null) {
                    viewOnTouchListenerC67974V4p.A06(AbstractC25229BEm.A1a(interfaceC09390do.getValue(), boostMediaPickerTabType));
                    viewOnTouchListenerC67974V4p.A05 = new Wk9(this, 0);
                }
                AppBarLayout appBarLayout = (AppBarLayout) view2.findViewById(R.id.media_thumbnail_preview_app_bar);
                if (appBarLayout != null) {
                    appBarLayout.A02(new MaW(this, 1));
                } else {
                    appBarLayout = null;
                }
                this.A05 = appBarLayout;
                Context A0L = AbstractC166997dE.A0L(A0M2);
                RecyclerView A0B2 = AbstractC43592JPx.A0B(inflate2, R.id.media_thumbnail_preview_recycler_view);
                if (A0B2 != null) {
                    AbstractC31174DnI.A17(A0L, A0B2, false);
                    C66392zG A002 = C66362zD.A00(A0L);
                    A002.A08 = true;
                    A002.A01(new KJI(f));
                    C66362zD A0R2 = AbstractC31173DnH.A0R(A002, new C45670KJh(new C47523Kyq(A0B2, this), this, AbstractC166987dD.A0r(this.A0C), f));
                    AbstractC43593JPy.A1O(A0R2);
                    A0B2.setAdapter(A0R2);
                    A0B2.A14(new C44229JgZ(0, this, A0B2));
                    A0B2.A10(new JoH(A0L, this, f, 1));
                    try {
                        new C80V().A07(A0B2);
                    } catch (IllegalStateException e) {
                        AbstractC167007dF.A15(C18950wb.A01.AEp("boost_media_picker_sub_tab_fragment", 817897926), "boost_media_picker_sub_tab_fragment", AbstractC166997dE.A0y("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                    }
                } else {
                    A0B2 = null;
                }
                this.A04 = A0B2;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2.findViewById(R.id.thumbnail_igds_media_button);
                this.A07 = igdsMediaButton;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setLabel(getString(2131966114));
                }
                IgdsMediaButton igdsMediaButton2 = this.A07;
                if (igdsMediaButton2 != null) {
                    ViewOnClickListenerC48064LPp.A00(igdsMediaButton2, 26, this);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC166987dD.A1Z(new MC3(this, (InterfaceC23621Ds) null, 46), AbstractC25229BEm.A0a(this));
    }

    public static final void A00(C45503KCs c45503KCs) {
        String str;
        InterfaceC09390do interfaceC09390do = c45503KCs.A0C;
        C70399WUb A0N = AbstractC43594JPz.A0N(interfaceC09390do);
        VG4 vg4 = VG4.A11;
        InterfaceC09390do interfaceC09390do2 = c45503KCs.A0D;
        int ordinal = ((BoostMediaPickerTabType) interfaceC09390do2.getValue()).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                str = "create_post";
            } else {
                str = "create_reel";
            }
        } else {
            str = "create_story";
        }
        A0N.A0G(vg4, str);
        int ordinal2 = ((BoostMediaPickerTabType) interfaceC09390do2.getValue()).ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                Context requireContext = c45503KCs.requireContext();
                C48635LfC c48635LfC = new C48635LfC(c45503KCs, 2);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0C(A0r, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                AbstractC69933Cc.A00(requireContext, A0r, c48635LfC).Emy(EnumC33447EqK.A0N, EnumC69983Ch.A02);
                return;
            }
            AbstractC31172DnG.A1M(c45503KCs, JQ1.A0F(c45503KCs, AbstractC166987dD.A0o(interfaceC09390do)));
            return;
        }
        ComponentCallbacks2 rootActivity = c45503KCs.getRootActivity();
        C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.ui.swipenavigation.SwipeNavigationHost");
        ((InterfaceC53892dT) rootActivity).FBp(new PositionConfig(null, null, null, "promote_media_picker_create_story", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
    }

    public static final void A01(C45503KCs c45503KCs) {
        AbstractC70663Fe abstractC70663Fe;
        LinearLayoutManager linearLayoutManager;
        C44793JsE c44793JsE;
        RecyclerView recyclerView = c45503KCs.A04;
        C3OO c3oo = null;
        if (recyclerView != null) {
            abstractC70663Fe = recyclerView.A0D;
        } else {
            abstractC70663Fe = null;
        }
        if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
            int A1a = linearLayoutManager.A1a();
            int A1b = linearLayoutManager.A1b();
            int A1c = linearLayoutManager.A1c();
            if (Math.abs(A1b - A1a) > 1) {
                A1c = (A1a + A1b) / 2;
            }
            LZY lzy = (LZY) AbstractC001800i.A0O(c45503KCs.A0A, A1c);
            if (lzy != null) {
                C38321qM c38321qM = lzy.A00;
                RecyclerView recyclerView2 = c45503KCs.A04;
                if (recyclerView2 != null) {
                    c3oo = recyclerView2.A0V(A1c);
                }
                if ((c3oo instanceof C44793JsE) && (c44793JsE = (C44793JsE) c3oo) != null) {
                    A02(c45503KCs, c44793JsE, c38321qM, A1c);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.2zP] */
    public static final void A03(C45503KCs c45503KCs, AbstractC47604L0p abstractC47604L0p) {
        BaseFragmentActivity baseFragmentActivity;
        C66362zD c66362zD;
        C66362zD c66362zD2;
        ViewModelListUpdate viewModelListUpdate;
        if (abstractC47604L0p instanceof KE0) {
            KE0 ke0 = (KE0) abstractC47604L0p;
            C38321qM c38321qM = ke0.A03;
            RecyclerView recyclerView = c45503KCs.A04;
            C2UU c2uu = null;
            if (recyclerView != null) {
                c2uu = recyclerView.A0A;
            }
            if ((c2uu instanceof C66362zD) && (c66362zD2 = (C66362zD) c2uu) != null) {
                String id = c38321qM.getId();
                if (id != null && id.length() > 0) {
                    List list = c45503KCs.A0A;
                    list.clear();
                    if (c38321qM.BRp() != EnumC40111tc.A09) {
                        list.add(new LZY(c38321qM, AbstractC37303Gc4.A0E(c38321qM), EnumC74373Vt.A03));
                    } else {
                        int A0p = c38321qM.A0p();
                        for (int i = 0; i < A0p; i++) {
                            C38321qM A1e = c38321qM.A1e(i);
                            if (A1e != null) {
                                list.add(new LZY(A1e, AbstractC37303Gc4.A0E(A1e), EnumC74373Vt.A03));
                            }
                        }
                    }
                    viewModelListUpdate = AbstractC43593JPy.A0L(list);
                } else {
                    ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                    A0E.A00(new Object());
                    viewModelListUpdate = A0E;
                }
                c66362zD2.A05(viewModelListUpdate);
                AppBarLayout appBarLayout = c45503KCs.A05;
                if (appBarLayout != null) {
                    appBarLayout.A03 = 13;
                    appBarLayout.requestLayout();
                }
            }
            C45106Jxa c45106Jxa = ke0.A01;
            RecyclerView recyclerView2 = c45503KCs.A03;
            C2UU c2uu2 = null;
            if (recyclerView2 != null) {
                c2uu2 = recyclerView2.A0A;
            }
            if ((c2uu2 instanceof C66362zD) && (c66362zD = (C66362zD) c2uu2) != null) {
                ViewModelListUpdate A0E2 = AbstractC31171DnF.A0E();
                A0E2.A01(c45106Jxa.A04);
                c66362zD.A05(A0E2);
            }
            boolean isEmpty = c45106Jxa.A04.isEmpty();
            RecyclerView recyclerView3 = c45503KCs.A03;
            if (isEmpty) {
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(8);
                }
                View view = c45503KCs.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                View view2 = c45503KCs.A01;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            boolean A00 = ke0.A00();
            IgdsMediaButton igdsMediaButton = c45503KCs.A07;
            if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(AbstractC167007dF.A05(A00 ? 1 : 0));
            }
        }
        boolean z = abstractC47604L0p instanceof KE1;
        View view3 = c45503KCs.A02;
        int i2 = 0;
        if (view3 != null) {
            view3.setVisibility(AbstractC167007dF.A05(!z ? 1 : 0));
        }
        SpinnerImageView spinnerImageView = c45503KCs.A08;
        if (spinnerImageView != null) {
            if (!z) {
                i2 = 8;
            }
            spinnerImageView.setVisibility(i2);
        }
        FragmentActivity activity = c45503KCs.getActivity();
        if ((activity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) activity) != null) {
            baseFragmentActivity.A0Z();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public C45503KCs() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2y(new X2y(this, 26), 27));
        C0YZ A1D = AbstractC25225BEi.A1D(C44544Jmo.class);
        this.A0B = AbstractC25225BEi.A0a(new X2y(A00, 28), new C57253Pbb(14, A00, this), new C57253Pbb(13, null, A00), A1D);
        this.A0D = JQ0.A0q(this, 29);
        this.A0F = JQ0.A0q(this, 31);
        this.A0E = JQ0.A0q(this, 30);
        this.A0A = AbstractC166987dD.A1E();
        this.A09 = true;
        this.A00 = -1;
        this.A0C = AbstractC60492pY.A02(this);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.36j] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1703179433);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0C(A0r, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = new ViewOnTouchListenerC67974V4p(requireContext, this, requireActivity().getSupportFragmentManager(), A0r, new Object(), this, new C70912WkG(0), C57332k8.A0m.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)));
        this.A06 = viewOnTouchListenerC67974V4p;
        registerLifecycleListener(viewOnTouchListenerC67974V4p);
        C0f9.A09(-693224651, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1894005546);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ig_media_picker_content_fragment, false);
        C0f9.A09(-347001662, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-678119659);
        super.onDestroy();
        unregisterLifecycleListener(this.A06);
        this.A06 = null;
        C0f9.A09(-518787495, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(176709694);
        super.onDestroyView();
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(null);
        }
        this.A03 = null;
        this.A01 = null;
        RecyclerView recyclerView3 = this.A04;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.A04;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(null);
        }
        this.A04 = null;
        this.A05 = null;
        this.A02 = null;
        this.A08 = null;
        this.A07 = null;
        C0f9.A09(375805755, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-734691343);
        super.onPause();
        A04(this, "context_switch");
        C0f9.A09(467310575, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2104129901);
        super.onResume();
        A03(this, (AbstractC47604L0p) ((C44523JmT) this.A0F.getValue()).A05.getValue());
        A01(this);
        C0f9.A09(-932920996, A02);
    }
}
