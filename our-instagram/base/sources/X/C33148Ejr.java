package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Ejr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33148Ejr extends ELn {
    public static final String __redex_internal_original_name = "HallPassAudiencePickerFragment";
    public IgdsBottomButtonLayout A00;
    public String A02;
    public String A03;
    public String A04;
    public C56352iT A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public Integer A01 = C05F.A00;

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(967);
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        int i;
        String str;
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.disclosure);
        InterfaceC09390do interfaceC09390do = this.A06;
        if (!AbstractC25230BEn.A0l(interfaceC09390do).A01.getBoolean("has_seen_hall_pass_one_time_add_people_disclosure", false)) {
            A0S.setVisibility(0);
            AbstractC31177DnL.A1N(AbstractC25230BEn.A0l(interfaceC09390do).A01, "has_seen_hall_pass_one_time_add_people_disclosure", true);
        } else {
            A0S.setVisibility(8);
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(requireView(), R.id.done_button);
        this.A00 = A0j;
        if (A0j != null) {
            int intValue = this.A01.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    context = getContext();
                    if (context != null) {
                        i = 2131952265;
                        str = context.getString(i);
                    }
                    str = null;
                } else {
                    throw B4Z.A00();
                }
            } else {
                context = getContext();
                if (context != null) {
                    i = 2131956954;
                    str = context.getString(i);
                }
                str = null;
            }
            A0j.setPrimaryActionText(str);
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 47));
                    A0A().A00 = new C34624FNh(requireContext(), null, null, 0, true);
                    ViewGroup A0C = AbstractC31176DnK.A0C(requireView(), R.id.main_container);
                    IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(requireView(), R.id.search_box);
                    C33155Ejy c33155Ejy = new C33155Ejy(requireContext(), AbstractC166997dE.A0S(requireView(), R.id.search_exit_button), AbstractC018607g.A00(this), AbstractC166987dD.A0r(interfaceC09390do), igdsInlineSearchBox, new C36695GFq(this, 3), A0A());
                    c33155Ejy.A02();
                    super.A01 = c33155Ejy;
                    A0C.getLayoutTransition().addTransitionListener(new C35288FhN(igdsInlineSearchBox));
                    C3F1 c3f1 = AbstractC31178DnM.A0D(requireView()).A0C;
                    if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
                        c3f0.A00 = false;
                    }
                    A03(this);
                    return;
                }
            }
        }
        C14360o3.A0F("doneButton");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public static final void A03(C33148Ejr c33148Ejr) {
        c33148Ejr.A0A().A03(c33148Ejr.requireContext(), null, EnumC153216up.A06);
        int intValue = c33148Ejr.A01.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                AbstractC31177DnL.A1Q(c33148Ejr, C07Y.A00(c33148Ejr), 7);
                return;
            }
            throw B4Z.A00();
        }
        AbstractC31177DnL.A1Q(c33148Ejr, C07Y.A00(c33148Ejr), 6);
    }

    public static final void A04(C33148Ejr c33148Ejr, int i, boolean z) {
        C9GR.A0F(c33148Ejr.requireContext(), "hall_pass_audience_picker_fetch_error", i);
        if (z) {
            c33148Ejr.A0A().A03(c33148Ejr.requireContext(), ViewOnClickListenerC35685FpK.A00(c33148Ejr, 48), EnumC153216up.A04);
        }
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        super.A0D(igdsCheckBox, c32069E6v);
        A0B().A00();
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout == null) {
            C14360o3.A0F("doneButton");
            throw C00O.createAndThrow();
        }
        igdsBottomButtonLayout.setPrimaryButtonEnabled(AbstractC166987dD.A1b(AbstractC31173DnH.A0L(super.A03.A03)));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31176DnK.A1C(ViewOnClickListenerC35685FpK.A00(this, 46), AbstractC31179DnN.A0B(interfaceC56362iU, AbstractC166997dE.A0p(AbstractC31176DnK.A05(this, interfaceC56362iU), 2131963411)), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        int A02 = C0f9.A02(-1814431600);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString("hall_pass_name");
        this.A02 = requireArguments.getString(AbstractC111324zv.A00(2431));
        this.A03 = requireArguments.getString("hall_pass_id");
        String string = requireArguments.getString("hall_pass_audience_picker_mode");
        if (string != null && !string.equals("CREATION")) {
            if (string.equals("ADD_PEOPLE")) {
                num = C05F.A01;
            } else {
                throw AbstractC166987dD.A12(string);
            }
        } else {
            num = C05F.A00;
        }
        this.A01 = num;
        this.A05 = C56352iT.A0t.A04(this);
        C0f9.A09(513913433, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1887588597);
        ELn.A01(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_hall_pass_audience_picker, viewGroup, false);
        C0f9.A09(-1071548368, A02);
        return inflate;
    }
}
