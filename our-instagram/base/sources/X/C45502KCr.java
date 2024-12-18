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

/* renamed from: X.KCr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45502KCr extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "BoostMediaPickerABTestSubTabFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public AppBarLayout A04;
    public IgdsMediaButton A05;
    public SpinnerImageView A06;
    public boolean A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_media_picker_ab_test_sub_tab_fragment";
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
        java.util.Set A07 = AbstractC16830sb.A07(BoostMediaPickerTabType.A06, BoostMediaPickerTabType.A03);
        InterfaceC09390do interfaceC09390do = this.A0A;
        float f = 1.0f;
        if (A07.contains(interfaceC09390do.getValue())) {
            f = 0.5625f;
        }
        this.A01 = view.findViewById(R.id.main_container_view);
        this.A06 = (SpinnerImageView) view.findViewById(R.id.loading_indicator);
        View view2 = this.A01;
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
                    A0B.A10(new C51184MjS(AbstractC43594JPz.A04(context), 0));
                    A0B.A14(new C153156uj(A0B.A0D, new JY9(this, 4), C153146ui.A07, true, false));
                    C66392zG A00 = C66362zD.A00(context);
                    A00.A08 = true;
                    C66362zD A0R = AbstractC31173DnH.A0R(A00, new KJZ(new C47258KuV(this), this, f));
                    AbstractC43593JPy.A1O(A0R);
                    A0R.notifyDataSetChanged();
                    A0B.setAdapter(A0R);
                } else {
                    A0B = null;
                }
                this.A02 = A0B;
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
                                i = 23;
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
                                i = 22;
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
                            i = 21;
                            ViewOnClickListenerC48064LPp.A00(A0e, i, this);
                            A0e.setVisibility(0);
                        }
                        view3 = findViewById;
                    }
                }
                this.A00 = view3;
                ViewStub A0M2 = AbstractC167007dF.A0M(view2, R.id.media_thumbnail_preview_container);
                View inflate2 = A0M2.inflate();
                inflate2.setVisibility(0);
                AppBarLayout appBarLayout = (AppBarLayout) view2.findViewById(R.id.media_thumbnail_preview_app_bar);
                if (appBarLayout != null) {
                    appBarLayout.A02(new MaW(this, 0));
                } else {
                    appBarLayout = null;
                }
                this.A04 = appBarLayout;
                Context A0L = AbstractC166997dE.A0L(A0M2);
                TextView A0e6 = AbstractC166987dD.A0e(inflate2, R.id.thumbnail_header_text_view);
                if (A0e6 != null) {
                    AbstractC25227BEk.A12(A0e6, this, 2131953992);
                    A0e6.setVisibility(0);
                }
                RecyclerView A0B2 = AbstractC43592JPx.A0B(inflate2, R.id.media_thumbnail_preview_recycler_view);
                if (A0B2 != null) {
                    AbstractC31174DnI.A17(A0L, A0B2, false);
                    C66392zG A002 = C66362zD.A00(A0L);
                    A002.A08 = true;
                    C66362zD A0R2 = AbstractC31173DnH.A0R(A002, new KJQ(this, f));
                    AbstractC43593JPy.A1O(A0R2);
                    A0B2.setAdapter(A0R2);
                    A0B2.A10(new JoH(A0L, this, f, 0));
                    try {
                        new C80V().A07(A0B2);
                    } catch (IllegalStateException e) {
                        AbstractC167007dF.A15(C18950wb.A01.AEp("boost_media_picker_ab_test_sub_tab_fragment", 817897926), "boost_media_picker_ab_test_sub_tab_fragment", AbstractC166997dE.A0y("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                    }
                } else {
                    A0B2 = null;
                }
                this.A03 = A0B2;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2.findViewById(R.id.thumbnail_igds_media_button);
                this.A05 = igdsMediaButton;
                if (igdsMediaButton != null) {
                    igdsMediaButton.setLabel(getString(2131966122));
                }
                IgdsMediaButton igdsMediaButton2 = this.A05;
                if (igdsMediaButton2 != null) {
                    ViewOnClickListenerC48064LPp.A00(igdsMediaButton2, 24, this);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC166987dD.A1Z(new MC3(this, (InterfaceC23621Ds) null, 44), AbstractC25229BEm.A0a(this));
    }

    public static final void A00(C45502KCr c45502KCr) {
        String str;
        InterfaceC09390do interfaceC09390do = c45502KCr.A09;
        C70399WUb A0N = AbstractC43594JPz.A0N(interfaceC09390do);
        VG4 vg4 = VG4.A11;
        InterfaceC09390do interfaceC09390do2 = c45502KCr.A0A;
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
                Context requireContext = c45502KCr.requireContext();
                C48635LfC c48635LfC = new C48635LfC(c45502KCr, 1);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0C(A0r, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                AbstractC69933Cc.A00(requireContext, A0r, c48635LfC).Emy(EnumC33447EqK.A0N, EnumC69983Ch.A02);
                return;
            }
            AbstractC31172DnG.A1M(c45502KCr, JQ1.A0F(c45502KCr, AbstractC166987dD.A0o(interfaceC09390do)));
            return;
        }
        ComponentCallbacks2 rootActivity = c45502KCr.getRootActivity();
        C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.ui.swipenavigation.SwipeNavigationHost");
        ((InterfaceC53892dT) rootActivity).FBp(new PositionConfig(null, null, null, "promote_media_picker_create_story", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
    }

    public static final void A01(C45502KCr c45502KCr, AbstractC47604L0p abstractC47604L0p) {
        BaseFragmentActivity baseFragmentActivity;
        C66362zD c66362zD;
        C66362zD c66362zD2;
        L2R l2r;
        if (abstractC47604L0p instanceof KE0) {
            KE0 ke0 = (KE0) abstractC47604L0p;
            C45106Jxa c45106Jxa = ke0.A01;
            RecyclerView recyclerView = c45502KCr.A03;
            C2UU c2uu = null;
            if (recyclerView != null) {
                c2uu = recyclerView.A0A;
            }
            if ((c2uu instanceof C66362zD) && (c66362zD2 = (C66362zD) c2uu) != null) {
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                int i = c45106Jxa.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    Number number = (Number) AbstractC001800i.A0O(c45106Jxa.A03, i2);
                    if (number != null) {
                        C48310LZj c48310LZj = (C48310LZj) AbstractC001800i.A0O(c45106Jxa.A04, number.intValue());
                        if (c48310LZj != null) {
                            l2r = new L2R(c48310LZj.A01, c48310LZj.A02, c48310LZj.A03, c48310LZj.A00);
                            A0E.A00(new C48305LZe(l2r));
                        }
                    }
                    l2r = new L2R(null, null, AnonymousClass001.A0O("null_item_key_", i2), -1);
                    A0E.A00(new C48305LZe(l2r));
                }
                c66362zD2.A05(A0E);
                AppBarLayout appBarLayout = c45502KCr.A04;
                if (appBarLayout != null) {
                    appBarLayout.A03 = 13;
                    appBarLayout.requestLayout();
                }
            }
            RecyclerView recyclerView2 = c45502KCr.A02;
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
            RecyclerView recyclerView3 = c45502KCr.A02;
            if (isEmpty) {
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(8);
                }
                View view = c45502KCr.A00;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                View view2 = c45502KCr.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            boolean A00 = ke0.A00();
            IgdsMediaButton igdsMediaButton = c45502KCr.A05;
            if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(AbstractC167007dF.A05(A00 ? 1 : 0));
            }
        }
        boolean z = abstractC47604L0p instanceof KE1;
        View view3 = c45502KCr.A01;
        int i3 = 0;
        if (view3 != null) {
            view3.setVisibility(AbstractC167007dF.A05(!z ? 1 : 0));
        }
        SpinnerImageView spinnerImageView = c45502KCr.A06;
        if (spinnerImageView != null) {
            if (!z) {
                i3 = 8;
            }
            spinnerImageView.setVisibility(i3);
        }
        FragmentActivity activity = c45502KCr.getActivity();
        if ((activity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) activity) != null) {
            baseFragmentActivity.A0Z();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public C45502KCr() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2y(new X2y(this, 11), 12));
        C0YZ A1D = AbstractC25225BEi.A1D(C44544Jmo.class);
        this.A08 = AbstractC25225BEi.A0a(new X2y(A00, 13), new C57253Pbb(11, A00, this), new C57253Pbb(10, null, A00), A1D);
        this.A0A = JQ0.A0q(this, 14);
        this.A0B = JQ0.A0q(this, 15);
        this.A07 = true;
        this.A09 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1824358156);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.boost_ig_media_picker_ab_test_content_fragment, false);
        C0f9.A09(-1385972577, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-32536597);
        super.onDestroyView();
        this.A00 = null;
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(null);
        }
        this.A02 = null;
        RecyclerView recyclerView3 = this.A03;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(null);
        }
        RecyclerView recyclerView4 = this.A03;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(null);
        }
        this.A03 = null;
        this.A04 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        C0f9.A09(-442111930, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1218080780);
        super.onResume();
        A01(this, (AbstractC47604L0p) ((C44523JmT) this.A0B.getValue()).A05.getValue());
        C0f9.A09(-580827599, A02);
    }
}
