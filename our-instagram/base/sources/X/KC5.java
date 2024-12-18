package X;

import android.os.Bundle;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.su.model.MiddleStateCardUser;
import java.util.List;

/* loaded from: classes8.dex */
public final class KC5 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "MiddleStateProfilePreviewFragment";
    public int A01;
    public int A02;
    public C123835ix A03;
    public C63702ur A04;
    public String A05;
    public String A06;
    public List A07;
    public int A09;
    public View A0A;
    public ViewPager2 A0B;
    public final String A0C = AbstractC111324zv.A00(2724);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public boolean A08 = true;
    public int A00 = -1;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("containerModule");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        FragmentActivity activity;
        ViewPager2 viewPager2 = this.A0B;
        if (viewPager2 != null) {
            AbstractC43594JPz.A0G(viewPager2).setDuration(400L);
            AbstractC56402iY.A06(getActivity(), this.A08);
            int i = this.A00;
            if (i != -1 && (activity = getActivity()) != null) {
                C30D.A04(activity, i);
            }
            C25671My A0Q = AbstractC31176DnK.A0Q(this.A0D);
            ViewPager2 viewPager22 = this.A0B;
            if (viewPager22 != null) {
                A0Q.E4s(new LYJ(viewPager22.A00));
                return false;
            }
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        List list;
        int i2;
        String str;
        String string;
        Window window;
        Transition sharedElementExitTransition;
        Window window2;
        Transition sharedElementExitTransition2;
        Window window3;
        Transition sharedElementEnterTransition;
        int A02 = C0f9.A02(1143108383);
        FragmentActivity activity = getActivity();
        if (activity != null && (window3 = activity.getWindow()) != null && (sharedElementEnterTransition = window3.getSharedElementEnterTransition()) != null) {
            sharedElementEnterTransition.setDuration(250L);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (window2 = activity2.getWindow()) != null && (sharedElementExitTransition2 = window2.getSharedElementExitTransition()) != null) {
            sharedElementExitTransition2.setDuration(250L);
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 != null && (window = activity3.getWindow()) != null && (sharedElementExitTransition = window.getSharedElementExitTransition()) != null) {
            sharedElementExitTransition.setInterpolator(new DecelerateInterpolator());
        }
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("ARG_START_POSITION");
        } else {
            i = 0;
        }
        this.A09 = i;
        this.A01 = i;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (list = bundle3.getParcelableArrayList("ARG_LIST_CARD_USERS")) == null) {
            list = C16930sl.A00;
        }
        this.A07 = list;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i2 = bundle4.getInt("ARG_VIEW_STATE_ITEM_TYPE");
        } else {
            i2 = 0;
        }
        this.A02 = i2;
        Bundle bundle5 = this.mArguments;
        String str2 = "";
        if (bundle5 == null || (str = bundle5.getString("ARG_DISPLAY_FORMAT")) == null) {
            str = "";
        }
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null && (string = bundle6.getString("ARG_CONTAINER_MODULE")) != null) {
            str2 = string;
        }
        this.A05 = str2;
        List list2 = this.A07;
        if (list2 != null) {
            if (list2.size() > 0) {
                List list3 = this.A07;
                if (list3 != null) {
                    if (((MiddleStateCardUser) list3.get(0)).A0A) {
                        this.A04 = new C63702ur(this, AbstractC166987dD.A0r(this.A0D));
                        C0f9.A09(1125217330, A02);
                        return;
                    }
                }
            }
            this.A03 = new C123835ix(this, AbstractC166987dD.A0r(this.A0D));
            C0f9.A09(1125217330, A02);
            return;
        }
        C14360o3.A0F("listCardUsers");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1183693588);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.middle_state_profile_preview_pager, viewGroup, false);
        this.A08 = AbstractC56402iY.A0A(getActivity());
        this.A00 = C30D.A00(getActivity());
        int A03 = AbstractC31173DnH.A03(getContext(), requireActivity(), R.attr.igds_color_dimmer);
        AbstractC56402iY.A02(getActivity(), A03);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, A03);
        }
        ViewPager2 viewPager2 = (ViewPager2) inflate.requireViewById(R.id.profile_preview_view_pager);
        this.A0B = viewPager2;
        String str = "viewPager";
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(1);
            View childAt = viewPager2.getChildAt(0);
            C14360o3.A0C(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            ViewGroup viewGroup2 = (ViewGroup) childAt;
            int A022 = AbstractC31171DnF.A02(viewGroup2.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            viewGroup2.setPadding(A022, 0, A022, 0);
            viewGroup2.setClipToPadding(false);
            ViewPager2 viewPager22 = this.A0B;
            if (viewPager22 != null) {
                viewPager22.setPageTransformer(new C65846Tv7(AbstractC31171DnF.A02(AbstractC166997dE.A0N(this), R.dimen.abc_button_padding_horizontal_material)));
                ViewPager2 viewPager23 = this.A0B;
                if (viewPager23 != null) {
                    UserSession A0r = AbstractC166987dD.A0r(this.A0D);
                    List list = this.A07;
                    if (list == null) {
                        str = "listCardUsers";
                    } else {
                        int i = this.A00;
                        int i2 = this.A02;
                        String str2 = this.A06;
                        if (str2 == null) {
                            str = "displayFormat";
                        } else {
                            String str3 = this.A05;
                            if (str3 == null) {
                                str = "containerModule";
                            } else {
                                viewPager23.setAdapter(new C44805JsX(this, A0r, str2, str3, list, i, i2));
                                ViewPager2 viewPager24 = this.A0B;
                                if (viewPager24 != null) {
                                    viewPager24.A03(this.A09, false);
                                    ViewPager2 viewPager25 = this.A0B;
                                    if (viewPager25 != null) {
                                        viewPager25.A05(new C43748JWj(this, 5));
                                        View requireViewById = inflate.requireViewById(R.id.background_dimmer);
                                        this.A0A = requireViewById;
                                        if (requireViewById == null) {
                                            str = "backgroundDimmer";
                                        } else {
                                            ViewOnClickListenerC48074LPz.A01(requireViewById, 54, this);
                                            C0f9.A09(901491028, A02);
                                            return inflate;
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
}
