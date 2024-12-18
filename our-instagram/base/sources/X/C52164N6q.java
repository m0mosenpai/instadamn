package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.common.math.matrix.Matrix4;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.N6q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52164N6q extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC184058Eu {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasFragment";
    public ViewGroup A00;
    public Toast A01;
    public TabLayout A02;
    public ConstrainedTextureView A03;
    public C9KJ A04;
    public C9KK A05;
    public FilterGroupModel A06;
    public OAL A07;
    public ImageView A08;
    public C56063Oug A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D = C57538PgC.A00(this, C57538PgC.A01(this, 19), new C57251PbZ(18, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 20);
    public final InterfaceC09390do A0B = C57538PgC.A00(this, C57538PgC.A01(this, 21), new C57251PbZ(19, null, this), AbstractC25225BEi.A1D(C50995Mg2.class), 22);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_canvas_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, X.AGr] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setPadding(0, AbstractC53242c7.A0G(view.getContext(), R.attr.actionBarHeight), 0, 0);
        InterfaceC09390do interfaceC09390do = this.A0D;
        C47Z A01 = NNE.A01(interfaceC09390do);
        C9KK c9kk = this.A05;
        if (c9kk != null) {
            ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(requireContext());
            c9kk.A03 = constrainedTextureView;
            constrainedTextureView.setAspectRatio(MSY.A0Q(interfaceC09390do).A00);
            this.A03 = constrainedTextureView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.creation_image_container);
            ConstrainedTextureView constrainedTextureView2 = this.A03;
            if (constrainedTextureView2 != null) {
                A0F.addView(constrainedTextureView2, 0, layoutParams);
                this.A00 = A0F;
                if (AbstractC167007dF.A1W(MSW.A0b(interfaceC09390do).A0M.A0C)) {
                    InterfaceC09390do interfaceC09390do2 = this.A0A;
                    MSX.A19(AbstractC50522MSa.A0X(interfaceC09390do2).A01, MSY.A0P(interfaceC09390do).A01.B6Q());
                    MSX.A19(AbstractC50522MSa.A0X(interfaceC09390do2).A02, MSY.A0P(interfaceC09390do).A01.B6S());
                }
                int B6Q = MSY.A0P(interfaceC09390do).A01.B6Q();
                int B6S = MSY.A0P(interfaceC09390do).A01.B6S();
                FilterGroupModel filterGroupModel = this.A06;
                if (filterGroupModel != null) {
                    AbstractC53885NsH.A00(((FilterGroupModelImpl) filterGroupModel).A02, B6Q, B6S);
                    Matrix4 matrix4 = C9KJ.A0R;
                    Context requireContext = requireContext();
                    ?? obj = new Object();
                    ViewGroup viewGroup = this.A00;
                    if (viewGroup != null) {
                        obj.A01(viewGroup.findViewById(R.id.play_button));
                        ViewGroup viewGroup2 = this.A00;
                        if (viewGroup2 != null) {
                            obj.A01 = viewGroup2.findViewById(R.id.seek_frame_indicator);
                            InterfaceC09390do interfaceC09390do3 = this.A0C;
                            C9KJ c9kj = new C9KJ(requireContext, AbstractC166987dD.A0r(interfaceC09390do3), obj, "live", false, true);
                            c9kj.A08(A01, 0);
                            C9KK c9kk2 = this.A05;
                            if (c9kk2 != null) {
                                c9kk2.A07 = c9kj;
                                C9KW c9kw = c9kj.A08;
                                if (c9kw != null) {
                                    c9kw.A0L(true);
                                }
                                c9kj.A07(this);
                                this.A04 = c9kj;
                                ConstrainedTextureView constrainedTextureView3 = this.A03;
                                if (constrainedTextureView3 != null) {
                                    C0fQ.A00(c9kj, constrainedTextureView3);
                                    C9KK c9kk3 = this.A05;
                                    if (c9kk3 != null) {
                                        constrainedTextureView3.setSurfaceTextureListener(c9kk3);
                                        InterfaceC09390do interfaceC09390do4 = this.A0A;
                                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(interfaceC09390do4).A01, new C50362MLo(13, A01, this), 45);
                                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(interfaceC09390do4).A02, new C50362MLo(14, A01, this), 45);
                                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(interfaceC09390do4).A03, new C57561PgZ(this, 21), 45);
                                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(interfaceC09390do4).A05, new C57561PgZ(this, 22), 45);
                                        C51391Mmw c51391Mmw = new C51391Mmw(AbstractC166987dD.A0r(interfaceC09390do3), this);
                                        View requireViewById = view.requireViewById(R.id.view_pager);
                                        ViewPager2 viewPager2 = (ViewPager2) requireViewById;
                                        viewPager2.setAdapter(c51391Mmw);
                                        viewPager2.A03(EnumC53213NgB.A04.A00, true);
                                        viewPager2.setUserInputEnabled(false);
                                        C14360o3.A07(requireViewById);
                                        TabLayout tabLayout = (TabLayout) view.requireViewById(R.id.tab_layout);
                                        this.A02 = tabLayout;
                                        if (tabLayout == null) {
                                            C14360o3.A0F("tabLayout");
                                            throw C00O.createAndThrow();
                                        }
                                        new JZX(viewPager2, tabLayout, new C55798Oq9(this, 1)).A00();
                                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(interfaceC09390do4).A06, new C57561PgZ(this, 20), 45);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("previewViewContainer");
                    throw C00O.createAndThrow();
                }
                throw AbstractC166997dE.A0g();
            }
            C14360o3.A0F("previewTextureView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("videoRenderController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC184058Eu
    public final void DzQ(int i) {
        MSX.A1S(AbstractC50522MSa.A0X(this.A0A).A07, i);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (this.A07 == null) {
            str = "creationLogger";
        } else {
            C56063Oug c56063Oug = this.A09;
            if (c56063Oug == null) {
                str = "draftsUnsavedChangesHandlerDelegate";
            } else {
                return c56063Oug.onBackPressed();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C52164N6q() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C57538PgC.A01(C57538PgC.A01(this, 23), 24));
        C0YZ A1D = AbstractC25225BEi.A1D(C50948MfH.class);
        this.A0A = AbstractC25225BEi.A0a(C57538PgC.A01(A00, 25), new C57251PbZ(21, A00, this), new C57251PbZ(20, null, A00), A1D);
        this.A0C = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        ImageView imageView = this.A08;
        if (imageView == null) {
            C14360o3.A0F("toggleAudioButton");
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.ESn(imageView);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131968535);
        AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(this, 18), A0B, interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1746950833);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("igtv_creation_session_id_arg", AbstractC167017dG.A0j());
        String string2 = requireArguments.getString("igtv_viewer_session_id_arg", null);
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0A(string);
        OAK oak = new OAK(A0r, string, string2);
        this.A07 = new OAL(oak.A00, oak.A01, oak.A02);
        this.A09 = new C56063Oug(requireContext(), this, string);
        InterfaceC09390do interfaceC09390do2 = this.A0D;
        C47Z A01 = NNE.A01(interfaceC09390do2);
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(true);
        surfaceCropFilter.A0K(MX2.A00(A01.A02, A01.A0H, A01.A0G, 0, false), A01.A0H, A01.A0G, 0, true);
        FilterGroupModelImpl A00 = C9OA.A00();
        A00.EUT(surfaceCropFilter.A00, 3);
        A01.A1D = A00;
        this.A06 = A00;
        C9KK c9kk = new C9KK(requireContext(), null, AbstractC166987dD.A0r(interfaceC09390do), null, A00, null, "live", false, false, false, false, true, false, false, false);
        int i = NNE.A01(interfaceC09390do2).A1N.A09;
        int i2 = NNE.A01(interfaceC09390do2).A1N.A06;
        c9kk.A01 = i;
        c9kk.A00 = i2;
        this.A05 = c9kk;
        C0f9.A09(-690456201, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-415616804);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = getLayoutInflater().inflate(R.layout.upload_toggle_audio_button, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        C0fQ.A00(ViewOnClickListenerC55465OkK.A00(imageView, this, 37), imageView);
        this.A08 = imageView;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_fragment, false);
        C0f9.A09(297450045, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1779973459);
        C9KJ c9kj = this.A04;
        if (c9kj == null) {
            C14360o3.A0F("videoPreviewDelegate");
            throw C00O.createAndThrow();
        }
        c9kj.A0J.remove(this);
        C9KW c9kw = c9kj.A08;
        if (c9kw != null) {
            c9kw.A0A.remove(this);
        }
        super.onDestroyView();
        C0f9.A09(541089494, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1763855788);
        C9KJ c9kj = this.A04;
        if (c9kj != null) {
            c9kj.A04();
            C9KJ c9kj2 = this.A04;
            if (c9kj2 != null) {
                c9kj2.A01();
                super.onPause();
                C0f9.A09(-1678711745, A02);
                return;
            }
        }
        C14360o3.A0F("videoPreviewDelegate");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(1484847130);
        super.onResume();
        C9KK c9kk = this.A05;
        if (c9kk == null) {
            str = "videoRenderController";
        } else {
            C9KJ c9kj = this.A04;
            str = "videoPreviewDelegate";
            if (c9kj != null) {
                c9kk.A07 = c9kj;
                c9kj.A04();
                C9KJ c9kj2 = this.A04;
                if (c9kj2 != null) {
                    c9kj2.A03();
                    C0f9.A09(-1227973505, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
