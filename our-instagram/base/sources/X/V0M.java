package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0M extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteAgeGenderFragmentV2";
    public W5D A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgdsCheckBox A05;
    public IgdsCheckBox A06;
    public XEE A07;
    public RangeSeekBar A08;
    public FRW A09;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0A = C1XM.A00(new X31(this, 21));
    public final InterfaceC09390do A0C = new C60842q8(new X31(this, 22), new X31(this, 23), new C57253Pbb(19, null, this), new C0YZ(UFT.class));
    public int A01 = 13;
    public int A00 = 65;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970368);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A09 = frw;
        WNT.A01(frw, C05F.A1F, this, 6);
        FRW frw2 = this.A09;
        if (frw2 == null) {
            C14360o3.A0F("actionBarController");
            throw C00O.createAndThrow();
        }
        frw2.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_age_gender";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer BTn;
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsCheckBox igdsCheckBox = (IgdsCheckBox) view.findViewById(R.id.male_gender_option);
        if (igdsCheckBox != null) {
            View A0S = AbstractC166997dE.A0S(view, R.id.male_gender_row);
            igdsCheckBox.setButtonDrawable((Drawable) null);
            WNV.A00(A0S, 57, igdsCheckBox, this);
        } else {
            igdsCheckBox = null;
        }
        this.A06 = igdsCheckBox;
        IgdsCheckBox igdsCheckBox2 = (IgdsCheckBox) view.findViewById(R.id.female_gender_option);
        if (igdsCheckBox2 != null) {
            View A0S2 = AbstractC166997dE.A0S(view, R.id.female_gender_row);
            igdsCheckBox2.setButtonDrawable((Drawable) null);
            WNV.A00(A0S2, 57, igdsCheckBox2, this);
        } else {
            igdsCheckBox2 = null;
        }
        this.A05 = igdsCheckBox2;
        this.A08 = (RangeSeekBar) view.findViewById(R.id.age_range_seekbar);
        this.A04 = (IgTextView) view.requireViewById(R.id.age_min_text);
        this.A03 = (IgTextView) view.requireViewById(R.id.age_max_text);
        InterfaceC09390do interfaceC09390do = this.A0C;
        float A00 = WGs.A00(((UFT) interfaceC09390do.getValue()).A00, 13);
        AdvantageAudienceData advantageAudienceData = ((UFT) interfaceC09390do.getValue()).A05().A02;
        if (advantageAudienceData != null && (BTn = advantageAudienceData.BTn()) != null) {
            int intValue = BTn.intValue();
            AdvantageAudienceData advantageAudienceData2 = ((UFT) interfaceC09390do.getValue()).A05().A02;
            if (advantageAudienceData2 != null) {
                xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData2.AaJ();
            } else {
                xFBTargetingAutomationAdvantageAudienceStatus = null;
            }
            if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.A05) {
                A00 = intValue;
            }
        }
        RangeSeekBar rangeSeekBar = this.A08;
        if (rangeSeekBar != null) {
            rangeSeekBar.A04 = 3;
            rangeSeekBar.A02(A00, 65.0f);
        }
        IgdsCheckBox igdsCheckBox3 = this.A06;
        if (igdsCheckBox3 != null) {
            igdsCheckBox3.setChecked(false);
        }
        IgdsCheckBox igdsCheckBox4 = this.A05;
        if (igdsCheckBox4 != null) {
            igdsCheckBox4.setChecked(false);
        }
        UQJ A05 = ((UFT) interfaceC09390do.getValue()).A05();
        List list = A05.A06;
        if (list != null) {
            IgdsCheckBox igdsCheckBox5 = this.A06;
            if (igdsCheckBox5 != null) {
                igdsCheckBox5.setChecked(list.contains(AudienceGender.A04));
            }
            IgdsCheckBox igdsCheckBox6 = this.A05;
            if (igdsCheckBox6 != null) {
                igdsCheckBox6.setChecked(list.contains(AudienceGender.A03));
            }
        }
        int A002 = WGs.A00(((UFT) interfaceC09390do.getValue()).A00, A05.A01);
        this.A01 = A002;
        int i = A05.A00;
        this.A00 = i;
        RangeSeekBar rangeSeekBar2 = this.A08;
        if (rangeSeekBar2 != null) {
            rangeSeekBar2.setStartingRangeValue(A002);
            rangeSeekBar2.setEndingRangeValue(i);
        }
        IgTextView igTextView = this.A04;
        if (igTextView != null) {
            MSX.A15(igTextView, this.A01);
        }
        IgTextView igTextView2 = this.A03;
        if (igTextView2 != null) {
            MSX.A15(igTextView2, this.A00);
        }
        this.A07 = new C71091Wnn(this);
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 3));
        RangeSeekBar rangeSeekBar3 = this.A08;
        if (rangeSeekBar3 != null) {
            rangeSeekBar3.A06 = new C71088Wnk(this);
        }
        View findViewById = view.findViewById(R.id.audience_potential_reach_view);
        if (findViewById != null) {
            this.A02 = new W5D((UserSession) this.A0B.getValue(), getActivity(), findViewById);
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 0), AbstractC25229BEm.A0a(this));
        A01(this);
        AbstractC65702TsY.A1M(AbstractC65702TsY.A0N(this.A0A), VG4.A0A);
    }

    public static final ImmutableList A00(V0M v0m) {
        ArrayList arrayList = new ArrayList();
        IgdsCheckBox igdsCheckBox = v0m.A06;
        if (igdsCheckBox != null && igdsCheckBox.isChecked()) {
            arrayList.add(AudienceGender.A04);
        }
        IgdsCheckBox igdsCheckBox2 = v0m.A05;
        if (igdsCheckBox2 != null && igdsCheckBox2.isChecked()) {
            arrayList.add(AudienceGender.A03);
        }
        return AbstractC31173DnH.A0L(arrayList);
    }

    public static final void A01(V0M v0m) {
        InterfaceC09390do interfaceC09390do = v0m.A0C;
        ((UFT) interfaceC09390do.getValue()).A0A(UQJ.A00(null, null, ((UFT) interfaceC09390do.getValue()).A05(), null, AbstractC001800i.A0U(A00(v0m)), null, null, v0m.A01, v0m.A00, 995, false));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0B.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1021510607);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_age_gender_main_view, viewGroup, false);
        C0f9.A09(1221384828, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2084997693);
        super.onDestroyView();
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        W5D w5d = this.A02;
        if (w5d != null) {
            w5d.A01();
        }
        this.A02 = null;
        C0f9.A09(1939065852, A02);
    }
}
