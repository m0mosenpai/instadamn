package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.KNl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45758KNl extends KB4 implements InterfaceC60072op, InterfaceC58141Pq6 {
    public static final String __redex_internal_original_name = "VideoFilterFragment";
    public int A00;
    public int A01;
    public ViewGroup A02;
    public ViewSwitcher A03;
    public InterfaceC58189Pqv A04;
    public ViewOnClickListenerC44797JsK A05;
    public C9KJ A06;
    public HashMap A07 = AbstractC166987dD.A1G();
    public List A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    @Override // X.InterfaceC58141Pq6
    public final void DC7(View view, float f, float f2) {
        this.A09 = true;
        View view2 = this.A0B;
        if (view2 == null) {
            view2 = requireActivity().findViewById(R.id.view_drag_overlay);
            this.A0B = view2;
            if (view2 == null) {
                throw AbstractC166997dE.A0g();
            }
        }
        view2.setVisibility(0);
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCB() {
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCC(View view, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_filter";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (this.A04 != null) {
            A01(this, false);
        }
        bundle.putInt("VideoFilterFragment.FILTER_ID", this.A00);
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A05;
        if (viewOnClickListenerC44797JsK != null) {
            i = viewOnClickListenerC44797JsK.getScrollX();
        } else {
            i = 0;
        }
        bundle.putInt("VideoFilterFragment.FILTER_SCROLL_X", i);
        bundle.putBoolean("VideoFilterFragment.FILTERS_REORDERED", this.A09);
        bundle.putSerializable("VideoFilterFragment.FILTER_STRENGTH_MAP", this.A07);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View requireViewById;
        int i;
        MediaEditActionBar BQj;
        MediaEditActionBar BQj2;
        ViewStub A07;
        int i2;
        boolean z;
        InterfaceC19390xP interfaceC19390xP;
        InterfaceC23621Ds interfaceC23621Ds;
        int i3;
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK;
        Object value;
        boolean z2;
        boolean z3;
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        OM7 om7 = super.A04;
        C9KJ c9kj = null;
        if (om7 != null) {
            c9kj = om7.A03;
        }
        this.A06 = c9kj;
        this.A03 = (ViewSwitcher) view.requireViewById(R.id.video_filter_switcher);
        this.A02 = AbstractC31173DnH.A0F(view, R.id.adjust_container);
        boolean A04 = AbstractC43841Ja4.A04(requireContext());
        if (!A04 || !((C44516JmM) this.A0D.getValue()).A00()) {
            View view2 = super.A00;
            if (view2 != null && (A07 = AbstractC31171DnF.A07(view2, R.id.accept_reject_buttons_stub)) != null) {
                int i4 = R.layout.accept_reject_edit_buttons;
                if (A04) {
                    i4 = R.layout.accept_reject_edit_buttons_v3;
                }
                A07.setLayoutResource(i4);
                A07.inflate();
            }
            if (A04) {
                View view3 = super.A00;
                if (view3 != null) {
                    ViewOnClickListenerC48063LPo.A00(view3.requireViewById(R.id.button_accept_adjust), 65, this);
                    View view4 = super.A00;
                    if (view4 != null) {
                        requireViewById = view4.requireViewById(R.id.button_cancel_adjust);
                        i = 66;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                if (super.A02 != null) {
                    if (C18U.A06(C06090Tz.A06, A0A(), 36318724491647412L)) {
                        this.A0A = true;
                        MOM mom = super.A02;
                        if (mom != null && (BQj = mom.BQj()) != null) {
                            ViewOnClickListenerC48063LPo.A00(BQj.requireViewById(R.id.button_accept_adjust), 67, this);
                            MOM mom2 = super.A02;
                            if (mom2 != null && (BQj2 = mom2.BQj()) != null) {
                                requireViewById = BQj2.requireViewById(R.id.button_cancel_adjust);
                                i = 68;
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                ViewOnClickListenerC48063LPo.A00(requireActivity().requireViewById(R.id.button_accept_adjust), 69, this);
                requireViewById = requireActivity().requireViewById(R.id.button_cancel_adjust);
                i = 70;
            }
            ViewOnClickListenerC48063LPo.A00(requireViewById, i, this);
        }
        C9KK c9kk = super.A05;
        if (c9kk != null) {
            C9KJ c9kj2 = this.A06;
            if (c9kj2 != null) {
                c9kk.A07 = c9kj2;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        if (bundle == null && A0B(A0A()) != null) {
            C47Z A0B = A0B(A0A());
            if (A0B != null) {
                i2 = A0B.A1i.A01;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            i2 = requireArguments().getInt("VideoFilterFragment.FILTER_ID", 0);
        }
        this.A00 = i2;
        this.A01 = i2;
        UserSession A0A = A0A();
        C56227Oxa c56227Oxa = new C56227Oxa(A0A);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C54629OBe c54629OBe : AbstractC53888NsK.A00(A0A)) {
            C14360o3.A0A(c54629OBe);
            A1E.add(new NHD(c54629OBe, c56227Oxa));
        }
        this.A08 = A1E;
        int A00 = AbstractC53889NsL.A00(A1E, this.A00);
        if (A00 == -1) {
            this.A00 = 0;
            A00 = 0;
            z = true;
        } else {
            z = false;
        }
        C47Z A0B2 = A0B(A0A());
        if (A0B2 != null) {
            C915647m c915647m = A0B2.A1i;
            int i5 = this.A00;
            c915647m.A01 = i5;
            A00(this, A0B2, i5);
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.filter_picker_frame);
            float f = RecyclerView.A1E;
            ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK2 = new ViewOnClickListenerC44797JsK(getThemedContext());
            AbstractC43593JPy.A1B(viewOnClickListenerC44797JsK2, -1);
            viewOnClickListenerC44797JsK2.setClipChildren(false);
            A0C.addView(viewOnClickListenerC44797JsK2);
            this.A05 = viewOnClickListenerC44797JsK2;
            AbstractC53887NsJ.A00(A0A());
            ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK3 = this.A05;
            if (viewOnClickListenerC44797JsK3 != null) {
                viewOnClickListenerC44797JsK3.setBlurIconCache(C50713MaC.A00(A0A()));
            }
            ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK4 = this.A05;
            if (viewOnClickListenerC44797JsK4 != null) {
                viewOnClickListenerC44797JsK4.A05 = true;
                viewOnClickListenerC44797JsK4.A02 = new C48581LeJ(this);
                List list = this.A08;
                if (list == null) {
                    C14360o3.A0F("filterList");
                    throw C00O.createAndThrow();
                }
                A0A();
                viewOnClickListenerC44797JsK4.A03 = list;
                viewOnClickListenerC44797JsK4.A04 = false;
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK5 = this.A05;
            if (viewOnClickListenerC44797JsK5 != null) {
                for (C44428Jkf c44428Jkf : viewOnClickListenerC44797JsK5.getTileFrames()) {
                    C44437Jky c44437Jky = c44428Jkf.A05;
                    if (C44437Jky.A00(c44437Jky) != -1) {
                        A1E2.add(new O7H(c44428Jkf, C44437Jky.A00(c44437Jky)));
                    }
                }
                C50713MaC.A00(A0A()).A07(requireContext(), A1E2);
                InterfaceC09390do interfaceC09390do = this.A0D;
                boolean A002 = ((C44516JmM) interfaceC09390do.getValue()).A00();
                C44516JmM c44516JmM = (C44516JmM) interfaceC09390do.getValue();
                if (A002) {
                    C05A c05a = c44516JmM.A00;
                    do {
                        value = c05a.getValue();
                        z2 = c44516JmM.A02;
                        z3 = !z2;
                        num = (Integer) ((C51733MtG) value).A01;
                        C14360o3.A0B(num, 0);
                    } while (!c05a.AIi(value, new C51733MtG(num, false, z3, z3, z2, z3)));
                    interfaceC19390xP = ((C44529JmZ) this.A0C.getValue()).A01;
                    interfaceC23621Ds = null;
                    i3 = 18;
                } else {
                    interfaceC19390xP = c44516JmM.A01;
                    interfaceC23621Ds = null;
                    i3 = 19;
                }
                JQ0.A11(this, new MCE(this, interfaceC23621Ds, i3), interfaceC19390xP);
                if (z && (viewOnClickListenerC44797JsK = this.A05) != null) {
                    viewOnClickListenerC44797JsK.A1H(0);
                }
                ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK6 = this.A05;
                if (viewOnClickListenerC44797JsK6 != null) {
                    viewOnClickListenerC44797JsK6.setRestoreSelectedIndex(A00);
                }
                this.A09 = requireArguments().getBoolean("VideoFilterFragment.FILTERS_REORDERED");
                View view5 = super.A00;
                if (view5 != null) {
                    AbstractC43841Ja4.A03(view5);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A00(C45758KNl c45758KNl, C47Z c47z, int i) {
        FilterGroupModel filterGroupModel = ((KB4) c45758KNl).A06;
        if (filterGroupModel != null) {
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
            if (filterGroupModelImpl.A04) {
                AbstractC53885NsH.A00(filterGroupModelImpl.A02, i, c47z.A1i.A00);
                return;
            }
        }
        C9KJ c9kj = c45758KNl.A06;
        if (c9kj == null) {
            return;
        }
        c9kj.B6O();
    }

    @Override // X.InterfaceC58141Pq6
    public final void DC0(View view, boolean z) {
        View view2 = this.A0B;
        if (view2 != null) {
            view2.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A04 == null) {
            return false;
        }
        A01(this, false);
        return true;
    }

    public C45758KNl() {
        C50161MDo c50161MDo = new C50161MDo(this, 24);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50161MDo(new C50161MDo(this, 20), 21));
        this.A0D = AbstractC25225BEi.A0a(new C50161MDo(A00, 22), c50161MDo, new ME0(40, A00, null), AbstractC25225BEi.A1D(C44516JmM.class));
        this.A0C = AbstractC25225BEi.A0a(new C50161MDo(this, 19), new C50161MDo(this, 23), new ME0(39, this, null), AbstractC25225BEi.A1D(C44529JmZ.class));
    }

    public static final void A01(C45758KNl c45758KNl, boolean z) {
        C915647m c915647m;
        Object value;
        boolean z2;
        Integer num;
        AbstractC43593JPy.A1P(c45758KNl.A0A());
        InterfaceC09390do interfaceC09390do = c45758KNl.A0D;
        if (!((C44516JmM) interfaceC09390do.getValue()).A00()) {
            C44516JmM c44516JmM = (C44516JmM) interfaceC09390do.getValue();
            C05A c05a = c44516JmM.A00;
            do {
                value = c05a.getValue();
                z2 = c44516JmM.A02;
                num = (Integer) ((C51733MtG) value).A01;
                C14360o3.A0B(num, 0);
            } while (!c05a.AIi(value, new C51733MtG(num, true, z2, z2, z2, !z2)));
        }
        InterfaceC58189Pqv interfaceC58189Pqv = c45758KNl.A04;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.Cvt(z);
            if (z) {
                C56227Oxa c56227Oxa = (C56227Oxa) interfaceC58189Pqv;
                int A00 = c56227Oxa.A00(null);
                C47Z A0B = c45758KNl.A0B(c45758KNl.A0A());
                if (A0B != null && (c915647m = A0B.A1i) != null) {
                    c915647m.A00 = A00;
                }
                c45758KNl.A07 = new HashMap(c56227Oxa.A03);
            }
            ViewSwitcher viewSwitcher = c45758KNl.A03;
            if (viewSwitcher != null) {
                viewSwitcher.setDisplayedChild(0);
            }
            ViewGroup viewGroup = c45758KNl.A02;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        }
        c45758KNl.A04 = null;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A0A();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1829989708);
        super.onCreate(bundle);
        UserSession CE4 = ((InterfaceC189628ah) AbstractC13320mI.A01(requireContext(), InterfaceC189628ah.class)).CE4();
        C14360o3.A0B(CE4, 0);
        super.A01 = CE4;
        if (AbstractC43840Ja3.A00(A0A())) {
            setDayNightMode(EnumC60792q3.A03);
        }
        if (bundle != null) {
            requireArguments().putAll(bundle);
            Object obj = requireArguments().get("VideoFilterFragment.FILTER_STRENGTH_MAP");
            C14360o3.A0C(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, kotlin.Int>");
            this.A07 = (HashMap) obj;
        }
        setModuleNameV2("video_filter");
        C0f9.A09(1287944258, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(538167264);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_video_filter, viewGroup, false);
        C0f9.A09(1524968394, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(305276187);
        super.onDestroy();
        C0f9.A09(-431539213, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(64195943);
        ViewGroup viewGroup = (ViewGroup) this.A0B;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.A0B = null;
        this.A03 = null;
        this.A02 = null;
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A05;
        if (viewOnClickListenerC44797JsK != null) {
            viewOnClickListenerC44797JsK.A02 = null;
            viewOnClickListenerC44797JsK.setAdapter(null);
        }
        this.A05 = null;
        this.A06 = null;
        super.onDestroyView();
        C0f9.A09(-2063092902, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1848821673);
        AbstractC54340Nzy.A00.A03(this, KKt.class);
        super.onPause();
        C0f9.A09(315977300, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-326773504);
        super.onResume();
        AbstractC54340Nzy.A00.A02(this, KKt.class);
        C9KK c9kk = super.A05;
        if (c9kk != null) {
            C9KJ c9kj = this.A06;
            if (c9kj != null) {
                c9kk.A07 = c9kj;
                C0f9.A09(1991359856, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -482078381;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1079111725;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
