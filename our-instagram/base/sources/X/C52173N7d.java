package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.N7d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52173N7d extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditGenderFragment";
    public View A00;
    public IgFormField A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public ActionButton A07;
    public final TextWatcher A08 = new C55346Oi6(this, 24);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_edit_gender";
    }

    public static void A00(C52173N7d c52173N7d) {
        boolean z;
        IgFormField igFormField;
        ActionButton actionButton = c52173N7d.A07;
        if (actionButton != null) {
            if (c52173N7d.A03 != C05F.A0C || ((igFormField = c52173N7d.A01) != null && !TextUtils.isEmpty(igFormField.getText()))) {
                z = true;
            } else {
                z = false;
            }
            actionButton.setEnabled(z);
        }
    }

    public static void A01(C52173N7d c52173N7d, String str) {
        AbstractC25651Mw.A00(c52173N7d.getSession()).E4s(new C36108Fwi(c52173N7d.getSession().userId, AbstractC54886OPh.A00(c52173N7d.A03), str));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31176DnK.A1C(new ViewOnClickListenerC48073LPy(this, 24), AbstractC31176DnK.A0I(), interfaceC56362iU);
        ?? obj = new Object();
        obj.A02 = AbstractC166997dE.A0N(this).getString(2131963171);
        this.A07 = C31722DwR.A00(new ViewOnClickListenerC55468OkN(3, this, interfaceC56362iU), interfaceC56362iU, obj);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1246892410);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_edit_gender);
        C0f9.A09(-175637710, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1782970621);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(772336156, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(571841834);
        super.onPause();
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            AbstractC31173DnH.A1D(this.A08, igFormField);
        }
        C0f9.A09(700947809, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(834737542);
        super.onResume();
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            igFormField.A0H(this.A08);
        }
        A00(this);
        C0f9.A09(1133103163, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        this.A04 = requireArguments().getString("custom_gender", "");
        int i = requireArguments().getInt("gender", 3);
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                num = A00[i2];
                if (AbstractC54886OPh.A00(num) == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                num = C05F.A0N;
                break;
            }
        }
        this.A03 = num;
        this.A02 = num;
        this.A00 = view;
        boolean z = requireArguments().getBoolean("should_show_custom_gender", false);
        this.A06 = z;
        if (z) {
            IgFormField A0k = AbstractC31172DnG.A0k(view, R.id.edit_gender_custom_field);
            this.A01 = A0k;
            A0k.setInputType(8192);
            int i3 = 0;
            boolean A1X = AbstractC167007dF.A1X(this.A03, C05F.A0C);
            IgFormField igFormField = this.A01;
            if (!A1X) {
                i3 = 8;
            }
            igFormField.setVisibility(i3);
            this.A01.setText(this.A04);
            this.A01.setRuleChecker(new P33(this, 3));
            if (A1X) {
                this.A01.getMEditText().requestFocus();
            }
        }
        ((CompoundButton) view.requireViewById(AbstractC54886OPh.A01(this.A03))).setChecked(true);
        if (this.A06) {
            AbstractC31172DnG.A1J(view, R.id.edit_gender_custom, 0);
        }
        ((RadioGroup) view.requireViewById(R.id.edit_gender_radio_group)).setOnCheckedChangeListener(new C55525OlJ(this, 0));
    }
}
