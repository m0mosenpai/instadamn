package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Ejt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33150Ejt extends ELn {
    public static final String __redex_internal_original_name = "CampfireAudiencePickerFragment";
    public IgdsButton A00;
    public String A02;
    public String A03;
    public boolean A04;
    public Integer A01 = C05F.A00;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0r;
        C14360o3.A0B(interfaceC56362iU, 0);
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                A0r = requireContext().getString(2131954741);
            } else {
                throw B4Z.A00();
            }
        } else {
            Resources A0N = AbstractC166997dE.A0N(this);
            String str = this.A03;
            if (str == null) {
                C14360o3.A0F("currentCampfireName");
                throw C00O.createAndThrow();
            }
            A0r = AbstractC166997dE.A0r(A0N, str, 2131954709);
        }
        interfaceC56362iU.Ehk(A0r);
        interfaceC56362iU.EkS(true);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35685FpK.A00(this, 36), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "campfire_audience_picker";
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsButton igdsButton;
        int i;
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0A().A00 = new C34624FNh(requireContext(), null, null, 0, true);
        TextView A0N = AbstractC167007dF.A0N(requireView(), R.id.audience_picker_disclaimer_text);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131954720);
        SpannableStringBuilder append = AbstractC31175DnJ.A05(requireContext(), 2131954718).append((CharSequence) "\n").append((CharSequence) A0p);
        C14360o3.A07(append);
        AnonymousClass773.A03(append, new Em1(this, AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_gradient_blue)), A0p);
        A0N.setMovementMethod(C6R6.A00);
        A0N.setText(append);
        View A0R = AbstractC166997dE.A0R(requireView(), R.id.campfire_audience_picker_edit_name_container);
        TextView A0N2 = AbstractC167007dF.A0N(requireView(), R.id.campfire_audience_picker_edit_name);
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                A0R.setVisibility(0);
                A0N2.addTextChangedListener(new C35468Fl3(6, this, A0N2));
            } else {
                throw B4Z.A00();
            }
        } else {
            A0R.setVisibility(8);
        }
        ViewGroup A0C = AbstractC31176DnK.A0C(requireView(), R.id.main_container);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(requireView(), R.id.search_box);
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.search_exit_button);
        C33155Ejy c33155Ejy = new C33155Ejy(requireContext(), A0S, AbstractC018607g.A00(this), AbstractC166987dD.A0r(this.A05), igdsInlineSearchBox, new C36695GFq(this, 2), A0A());
        c33155Ejy.A02();
        super.A01 = c33155Ejy;
        A0C.getLayoutTransition().addTransitionListener(new C35287FhM(igdsInlineSearchBox));
        C3F1 c3f1 = AbstractC31178DnM.A0D(requireView()).A0C;
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        IgdsButton A0W = AbstractC31173DnH.A0W(requireView(), R.id.done_button);
        this.A00 = A0W;
        if (A0W != null) {
            A0W.setEnabled(false);
        }
        IgdsButton igdsButton2 = this.A00;
        if (igdsButton2 != null) {
            igdsButton2.setVisibility(0);
        }
        int intValue2 = this.A01.intValue();
        if (intValue2 != 1) {
            if (intValue2 == 0) {
                IgdsButton igdsButton3 = this.A00;
                if (igdsButton3 != null) {
                    igdsButton3.setText(2131954713);
                }
                igdsButton = this.A00;
                if (igdsButton != null) {
                    i = 38;
                    ViewOnClickListenerC35685FpK.A01(igdsButton, i, this);
                }
                A03(this);
            }
            throw B4Z.A00();
        }
        IgdsButton igdsButton4 = this.A00;
        if (igdsButton4 != null) {
            igdsButton4.setText(2131961124);
        }
        igdsButton = this.A00;
        if (igdsButton != null) {
            i = 37;
            ViewOnClickListenerC35685FpK.A01(igdsButton, i, this);
        }
        A03(this);
    }

    public static final void A04(C33150Ejt c33150Ejt) {
        IgdsButton igdsButton;
        int size = ((ELn) c33150Ejt).A03.A03.size();
        int intValue = c33150Ejt.A01.intValue();
        boolean z = false;
        if (intValue != 1) {
            if (intValue == 0) {
                igdsButton = c33150Ejt.A00;
                if (igdsButton != null) {
                    if (size > 0) {
                        String str = c33150Ejt.A03;
                        if (str == null) {
                            C14360o3.A0F("currentCampfireName");
                            throw C00O.createAndThrow();
                        }
                        size = str.length();
                    }
                    igdsButton.setEnabled(z);
                }
                return;
            }
            throw B4Z.A00();
        }
        igdsButton = c33150Ejt.A00;
        if (igdsButton == null) {
            return;
        }
        if (size > 0) {
            z = true;
        }
        igdsButton.setEnabled(z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public static final void A03(C33150Ejt c33150Ejt) {
        C57312k6 A00;
        PYZ pyz;
        c33150Ejt.A0A().A03(c33150Ejt.requireContext(), null, EnumC153216up.A06);
        int intValue = c33150Ejt.A01.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                A00 = C07Y.A00(c33150Ejt);
                pyz = new PYZ(c33150Ejt, null, 2);
            } else {
                throw B4Z.A00();
            }
        } else {
            A00 = C07Y.A00(c33150Ejt);
            pyz = new PYZ(c33150Ejt, null, 1);
        }
        AbstractC166987dD.A1Z(pyz, A00);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        super.A0D(igdsCheckBox, c32069E6v);
        A0B().A00();
        A04(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        int A02 = C0f9.A02(-1860413140);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("hall_pass_audience_picker_mode");
        if (string != null) {
            if (string.equals("CREATION")) {
                num = C05F.A00;
            } else if (string.equals("ADD_PEOPLE")) {
                num = C05F.A01;
            } else {
                throw AbstractC166987dD.A12(string);
            }
            this.A01 = num;
        }
        this.A03 = AbstractC31175DnJ.A0Y(requireArguments, "hall_pass_name");
        this.A02 = requireArguments.getString("hall_pass_id");
        this.A04 = requireArguments.getBoolean("campfire_has_story_to_share");
        C0f9.A09(-1052613256, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-18665893);
        ELn.A01(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_campfire_audience_picker, viewGroup, false);
        C0f9.A09(-702170638, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1784438133);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(1914439839, A02);
    }
}
