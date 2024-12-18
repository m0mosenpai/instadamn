package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.R;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class KDG extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "TrendingPromptsFragment";
    public MQB A00;
    public C44563Jnk A01;
    public SpinnerImageView A02;
    public RecyclerView A03;
    public EnumC50631MWs A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trending_prompts_page";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A03 = A0F;
        String str = "recyclerView";
        if (A0F != null) {
            C44563Jnk c44563Jnk = this.A01;
            if (c44563Jnk == null) {
                str = "promptsAdapter";
            } else {
                A0F.setAdapter(c44563Jnk);
                RecyclerView recyclerView = this.A03;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        C44286Jhc.A00(recyclerView2, this, 10);
                        InterfaceC09390do interfaceC09390do = this.A06;
                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C50901MeW) interfaceC09390do.getValue()).A00, new C57561PgZ(this, 46), 47);
                        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                        AbstractC166987dD.A1Z(new PYZ(A0Z, null, 26), AbstractC141776au.A00(A0Z));
                        InterfaceC09390do interfaceC09390do2 = this.A05;
                        C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do2);
                        EnumC50631MWs enumC50631MWs = this.A04;
                        str = "cameraSurface";
                        if (enumC50631MWs != null) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A0T).A01, "ig_camera_sticker_aggregation_page_impression");
                            C22M c22m = ((C22F) A0T).A04;
                            String str2 = c22m.A0L;
                            if (A0f.isSampled() && A0T.A0J() != null && str2 != null) {
                                A0f.A8R(A0T.A0J(), "camera_destination");
                                AbstractC166987dD.A1S(A0f, str2);
                                AbstractC167017dG.A1B(A0f);
                                A0f.AAP("sticker_id", ReelTappableObjectType.A0e.A00);
                                AbstractC166997dE.A1N(A0f, "entity_type", 21);
                                A0f.A8R(enumC50631MWs, "surface");
                                AbstractC43594JPz.A1B(A0f, c22m);
                                AbstractC37302Gc3.A0t(A0f);
                                A0f.Cht();
                            }
                            C22C A0T2 = AbstractC43593JPy.A0T(interfaceC09390do2);
                            EnumC50631MWs enumC50631MWs2 = this.A04;
                            if (enumC50631MWs2 != null) {
                                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(((C22F) A0T2).A01, "ig_camera_sticker_page_impression");
                                C22M c22m2 = ((C22F) A0T2).A04;
                                String str3 = c22m2.A0L;
                                if (A0f2.isSampled() && A0T2.A0J() != null && str3 != null) {
                                    String str4 = null;
                                    if (enumC50631MWs2 == EnumC50631MWs.A0J) {
                                        str4 = "clips_precapture_camera";
                                    } else if (enumC50631MWs2 == EnumC50631MWs.A0I) {
                                        str4 = "clips_postcapture_camera";
                                    }
                                    A0f2.A8R(A0T2.A0J(), "camera_destination");
                                    AbstractC166987dD.A1S(A0f2, str3);
                                    if (str4 == null) {
                                        str4 = C22F.A08.getModuleName();
                                    }
                                    AbstractC31171DnF.A1D(A0f2, str4);
                                    AbstractC166997dE.A1N(A0f2, "entity_type", 21);
                                    A0f2.A8R(enumC50631MWs2, "surface");
                                    AbstractC43594JPz.A1B(A0f2, c22m2);
                                    AbstractC37302Gc3.A0t(A0f2);
                                    A0f2.Cht();
                                }
                                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do2), 36318891995044613L)) {
                                    View A0S = AbstractC166997dE.A0S(view, R.id.use_in_camera_button_scene_root);
                                    A0S.setVisibility(0);
                                    View A0R = AbstractC166997dE.A0R(A0S, R.id.use_in_camera_button);
                                    TextView A0N = AbstractC167007dF.A0N(A0S, R.id.use_in_camera_label);
                                    ImageView A0D = AbstractC31176DnK.A0D(A0S, R.id.use_in_camera_icon);
                                    A0R.setClickable(true);
                                    LQ1.A00(A0R, 68, this, view);
                                    Context context = view.getContext();
                                    AbstractC31173DnH.A0z(context, A0R, R.drawable.use_in_camera_button_background_emphasized);
                                    AbstractC166987dD.A1O(context, A0N, AbstractC53242c7.A0E(getContext()));
                                    A0N.setText(getText(2131952439));
                                    AbstractC31173DnH.A11(context, A0D, AbstractC53242c7.A05(getContext()));
                                    return;
                                }
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

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null || !AbstractC43592JPx.A1X(recyclerView)) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDG() {
        C50164MDr c50164MDr = new C50164MDr(this, 7);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50164MDr(new C50164MDr(this, 4), 5));
        this.A06 = AbstractC25225BEi.A0a(new C50164MDr(A00, 6), c50164MDr, new C57251PbZ(45, null, A00), AbstractC25225BEi.A1D(C50901MeW.class));
        this.A05 = AbstractC60492pY.A02(this);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2054078175);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("TRENDING_PROMPTS_CAMERA_SURFACE_ARG");
        C14360o3.A0C(serializable, MSV.A00(1437));
        this.A04 = (EnumC50631MWs) serializable;
        C0f9.A09(-1523897053, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(2147325044);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_trending_prompts_fragment, viewGroup, false);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        EnumC50631MWs enumC50631MWs = this.A04;
        if (enumC50631MWs == null) {
            str = "cameraSurface";
        } else {
            MQB mqb = this.A00;
            if (mqb == null) {
                str = "promptsAdapterListener";
            } else {
                this.A01 = new C44563Jnk(requireContext, enumC50631MWs, A0r, mqb);
                this.A02 = AbstractC31180DnO.A0V(inflate);
                C0f9.A09(835804937, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
