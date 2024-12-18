package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6h extends AbstractC59962oe implements InterfaceC58110PpZ, InterfaceC58287Psf {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasFilterFragment";
    public ViewGroup A00;
    public ViewSwitcher A01;
    public C55105ObK A02;
    public InterfaceC58189Pqv A03;
    public FilterPicker A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public HashMap A05 = AbstractC166987dD.A1G();
    public final InterfaceC09390do A08 = C57538PgC.A00(this, C57538PgC.A01(this, 15), new C57251PbZ(15, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 16);

    @Override // X.InterfaceC58287Psf
    public final boolean CoQ() {
        return false;
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtC(C47283Kuu c47283Kuu) {
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtD(C44428Jkf c44428Jkf) {
        int i;
        C14360o3.A0B(c44428Jkf, 0);
        C44437Jky c44437Jky = c44428Jkf.A05;
        int A00 = C44437Jky.A00(c44437Jky);
        InterfaceC09390do interfaceC09390do = this.A08;
        if (A00 == MSY.A0P(interfaceC09390do).A01.B6Q()) {
            InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
            C14360o3.A07(interfaceC50490MQs);
            InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
            C14360o3.A0C(Arg, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            C56227Oxa c56227Oxa = (C56227Oxa) Arg;
            c56227Oxa.A03 = this.A05;
            if (AbstractC167007dF.A1W(MSW.A0b(interfaceC09390do).A0M.A0C)) {
                i = MSY.A0P(interfaceC09390do).A01.B6S();
            } else {
                Number number = (Number) AbstractC50522MSa.A0X(this.A06).A02.A02();
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 100;
                }
            }
            AbstractC166997dE.A1U(Integer.valueOf(C44437Jky.A00(c44437Jky)), c56227Oxa.A03, i);
            c56227Oxa.A01(c44428Jkf, this, (VideoFilter) AbstractC50522MSa.A0X(this.A06).A00.A02(), null);
        }
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtE(C44428Jkf c44428Jkf, boolean z) {
        String str;
        C14360o3.A0B(c44428Jkf, 0);
        C44437Jky c44437Jky = c44428Jkf.A05;
        if (C44437Jky.A00(c44437Jky) != -1) {
            InterfaceC09390do interfaceC09390do = this.A06;
            MSX.A19(AbstractC50522MSa.A0X(interfaceC09390do).A01, C44437Jky.A00(c44437Jky));
            InterfaceC09390do interfaceC09390do2 = this.A08;
            NNE A0P = MSY.A0P(interfaceC09390do2);
            A0P.A01.EUX(C44437Jky.A00(c44437Jky));
            InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
            C14360o3.A07(interfaceC50490MQs);
            InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
            C14360o3.A0C(Arg, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            C56227Oxa c56227Oxa = (C56227Oxa) Arg;
            c56227Oxa.A03 = this.A05;
            C47Z A01 = NNE.A01(interfaceC09390do2);
            int B6Q = MSY.A0P(interfaceC09390do2).A01.B6Q();
            int B6S = MSY.A0P(interfaceC09390do2).A01.B6S();
            FilterGroupModel filterGroupModel = A01.A1D;
            if (filterGroupModel != null) {
                AbstractC53885NsH.A00(((FilterGroupModelImpl) filterGroupModel).A02, B6Q, B6S);
                if (c56227Oxa.A01(c44428Jkf, this, (VideoFilter) AbstractC50522MSa.A0X(interfaceC09390do).A00.A02(), null)) {
                    if (z) {
                        this.A03 = c56227Oxa;
                        ViewSwitcher viewSwitcher = this.A01;
                        if (viewSwitcher == null) {
                            str = "adjustOverlaySwitcher";
                        } else {
                            viewSwitcher.setDisplayedChild(1);
                            View Aa0 = c56227Oxa.Aa0(requireContext());
                            ViewGroup viewGroup = this.A00;
                            if (viewGroup == null) {
                                str = "adjustmentContainer";
                            } else {
                                viewGroup.addView(Aa0);
                                AbstractC166997dE.A1Y(AbstractC50522MSa.A0X(interfaceC09390do).A08, false);
                                return;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    return;
                }
                if (z) {
                    L64 A00 = AbstractC53887NsJ.A00(AbstractC166987dD.A0r(this.A07));
                    InterfaceC50490MQs interfaceC50490MQs2 = c44437Jky.A01;
                    C14360o3.A07(interfaceC50490MQs2);
                    A00.A00(interfaceC50490MQs2.getName(), false);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_canvas_filter_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FilterPicker filterPicker = (FilterPicker) view.requireViewById(R.id.filter_picker);
        InterfaceC09390do interfaceC09390do = this.A07;
        filterPicker.A01 = AbstractC53887NsJ.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C55105ObK c55105ObK = this.A02;
        if (c55105ObK != null) {
            ((FeedColorFilterPicker) filterPicker).A04 = c55105ObK;
            ((FeedColorFilterPicker) filterPicker).A07 = true;
            ((FeedColorFilterPicker) filterPicker).A05 = this;
            filterPicker.setEffects(A00(), false, AbstractC166987dD.A0r(interfaceC09390do));
            this.A04 = filterPicker;
            ArrayList A1E = AbstractC166987dD.A1E();
            List<C44428Jkf> list = ((FeedColorFilterPicker) filterPicker).A06;
            C14360o3.A07(list);
            for (C44428Jkf c44428Jkf : list) {
                C44437Jky c44437Jky = c44428Jkf.A05;
                if (C44437Jky.A00(c44437Jky) != -1) {
                    A1E.add(new O7H(c44428Jkf, C44437Jky.A00(c44437Jky)));
                }
            }
            C55105ObK c55105ObK2 = this.A02;
            if (c55105ObK2 != null) {
                c55105ObK2.A07(requireContext(), A1E);
                InterfaceC09390do interfaceC09390do2 = this.A08;
                if (AbstractC167007dF.A1W(MSW.A0b(interfaceC09390do2).A0M.A0C)) {
                    int A00 = AbstractC53889NsL.A00(A00(), MSY.A0P(interfaceC09390do2).A01.B6Q());
                    str = "filterPicker";
                    if (A00 == -1) {
                        FilterPicker filterPicker2 = this.A04;
                        if (filterPicker2 != null) {
                            if (0 < ((FeedColorFilterPicker) filterPicker2).A06.size()) {
                                C44428Jkf c44428Jkf2 = (C44428Jkf) ((FeedColorFilterPicker) filterPicker2).A06.get(0);
                                if (filterPicker2.A02(C44437Jky.A00(c44428Jkf2.A05), false)) {
                                    filterPicker2.smoothScrollBy(filterPicker2.A01(c44428Jkf2), 0);
                                }
                                InterfaceC58110PpZ interfaceC58110PpZ = ((FeedColorFilterPicker) filterPicker2).A05;
                                if (interfaceC58110PpZ != null) {
                                    interfaceC58110PpZ.DtE(c44428Jkf2, false);
                                }
                            }
                            FilterPicker filterPicker3 = this.A04;
                            if (filterPicker3 != null) {
                                ((FeedColorFilterPicker) filterPicker3).A01 = 0;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    FilterPicker filterPicker4 = this.A04;
                    if (filterPicker4 != null) {
                        ((FeedColorFilterPicker) filterPicker4).A01 = A00;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                this.A01 = (ViewSwitcher) view.requireViewById(R.id.creation_main_actions);
                this.A00 = AbstractC31173DnH.A0F(view, R.id.adjust_container);
                ViewOnClickListenerC48073LPy.A00(view.requireViewById(R.id.button_accept_adjust), 1, this);
                ViewOnClickListenerC48073LPy.A00(view.requireViewById(R.id.button_cancel_adjust), 2, this);
                OAL oal = (OAL) MSW.A0b(interfaceC09390do2).A0E.getValue();
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, oal.A00), "ig_camera_start_post_capture_session"), 206);
                if (AbstractC25226BEj.A1Z(A0A)) {
                    A0A.A0a(EnumC114925Hg.FEED);
                    A0A.A0S("camera_tools_struct", C16930sl.A00);
                    A0A.A0V(3);
                    A0A.A0R("camera_session_id", oal.A01);
                    A0A.A0Q("capture_format_index", AbstractC167007dF.A0d());
                    A0A.A0M(EnumC193318hB.A03, "capture_type");
                    A0A.A0M(C22P.A2n, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0A.A0W(1);
                    AnonymousClass249 anonymousClass249 = AnonymousClass249.VIDEO;
                    A0A.A0c(anonymousClass249);
                    A0A.A0m("igtv_upload_canvas_filter_fragment");
                    MSW.A1P(EnumC50631MWs.A0I, A0A);
                    A0A.A0R("composition_str_id", "");
                    A0A.A0M(anonymousClass249, "composition_media_type");
                    A0A.A0O("is_panavision", false);
                    A0A.A0O("is_feed_fork", false);
                    A0A.Cht();
                    return;
                }
                return;
            }
        }
        str = "blurIconCache";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final List A00() {
        InterfaceC09390do interfaceC09390do = this.A07;
        C56227Oxa c56227Oxa = new C56227Oxa(AbstractC166987dD.A0r(interfaceC09390do));
        LinkedList<C54629OBe> A00 = AbstractC53888NsK.A00(AbstractC166987dD.A0r(interfaceC09390do));
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        for (C54629OBe c54629OBe : A00) {
            C14360o3.A0A(c54629OBe);
            A0q.add(new NHD(c54629OBe, c56227Oxa));
        }
        return A0q;
    }

    public static final void A01(N6h n6h, boolean z) {
        String str;
        InterfaceC09390do interfaceC09390do = n6h.A06;
        AbstractC166997dE.A1Y(AbstractC50522MSa.A0X(interfaceC09390do).A08, true);
        InterfaceC58189Pqv interfaceC58189Pqv = n6h.A03;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.Cvt(z);
            InterfaceC58189Pqv interfaceC58189Pqv2 = n6h.A03;
            C14360o3.A0C(interfaceC58189Pqv2, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            int A00 = ((C56227Oxa) interfaceC58189Pqv2).A00((VideoFilter) AbstractC50522MSa.A0X(interfaceC09390do).A00.A02());
            InterfaceC09390do interfaceC09390do2 = n6h.A08;
            NNE.A01(interfaceC09390do2).A1i.A00 = A00;
            MSY.A0P(interfaceC09390do2).A01.EUZ(A00);
            InterfaceC58189Pqv interfaceC58189Pqv3 = n6h.A03;
            C14360o3.A0C(interfaceC58189Pqv3, "null cannot be cast to non-null type com.instagram.creation.video.ui.VideoFilterStrengthController");
            n6h.A05 = new HashMap(((C56227Oxa) interfaceC58189Pqv3).A03);
            n6h.A03 = null;
            ViewSwitcher viewSwitcher = n6h.A01;
            if (viewSwitcher == null) {
                str = "adjustOverlaySwitcher";
            } else {
                viewSwitcher.setDisplayedChild(0);
                ViewGroup viewGroup = n6h.A00;
                if (viewGroup == null) {
                    str = "adjustmentContainer";
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58287Psf
    public final VideoFilter B6O() {
        return (VideoFilter) AbstractC50522MSa.A0X(this.A06).A00.A02();
    }

    @Override // X.C8MA
    public final void EGV() {
        AbstractC50522MSa.A0X(this.A06).A03.A0B(AbstractC166997dE.A0b());
    }

    @Override // X.InterfaceC58287Psf
    public final void EUZ(int i) {
        MSX.A19(AbstractC50522MSa.A0X(this.A06).A02, i);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N6h() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C57538PgC.A01(C57538PgC.A01(this, 14), 17));
        C0YZ A1D = AbstractC25225BEi.A1D(C50948MfH.class);
        this.A06 = AbstractC25225BEi.A0a(C57538PgC.A01(A00, 18), new C57251PbZ(17, A00, this), new C57251PbZ(16, null, A00), A1D);
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1324586213);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A07;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A08;
        AnonymousClass840 A00 = MX9.A00(MSW.A0b(interfaceC09390do2).A00, A0r, new CreationSession(), new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false));
        File A0w = MSW.A0w(requireContext.getCacheDir(), "icon_zero_frame.jpg");
        int A01 = LBN.A01(requireContext, true);
        C55201OeB.A02(NNE.A01(interfaceC09390do2), A0w, A01, A01, 50);
        C55105ObK A002 = C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do));
        A002.A08(A00);
        A002.A05(requireContext, A0w.getCanonicalPath());
        A002.A02(requireContext, new CropInfo(new Rect(0, 0, A01, A01), A01, A01), 0, false);
        LinkedList A003 = AbstractC53888NsK.A00(AbstractC166987dD.A0r(interfaceC09390do));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A003.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A1E, ((C54629OBe) it.next()).A00);
        }
        synchronized (A002) {
            A002.A04(requireContext, null, A1E);
        }
        this.A02 = A002;
        C0f9.A09(443401460, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1292051662);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_filter_fragment, false);
        C0f9.A09(-1510965647, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(532807500);
        C50713MaC.A01(AbstractC166987dD.A0r(this.A07), requireContext());
        super.onDestroy();
        C0f9.A09(357701784, A02);
    }
}
