package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.N5n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52138N5n extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenEditFormNameBaseFragment";
    public IgFormField A00;
    public boolean A01;
    public AnonymousClass195 A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964944);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav.A01(C55089Oav.A00(this, interfaceC56362iU), this, 17);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField A0k = AbstractC31172DnG.A0k(view, R.id.form_name);
        this.A00 = A0k;
        if (A0k != null) {
            A0k.setText(A00().A00);
            A0k.setRuleChecker(new G8K(0, A0k, this));
            A0k.setInputType(49152);
            C55346Oi6.A00(A0k, this, 18).setOnEditorActionListener(new C55536OlV(this, 0));
            A0k.getMEditText().setImeOptions(6);
            A0k.getMEditText().requestFocus();
        }
        AbstractC50903MeY A00 = A00();
        O3T o3t = A00.A01;
        if (A00 instanceof C52601NOw) {
            str = ((C52601NOw) A00).A02;
        } else {
            str = ((C52600NOv) A00).A02;
        }
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(o3t.A00, str, "lead_gen_edit_form_name", "edit_form_screen_impression");
    }

    public final AbstractC50903MeY A00() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52569NNp) {
            interfaceC09390do = ((C52569NNp) this).A00;
        } else {
            interfaceC09390do = ((C52568NNo) this).A00;
        }
        return (AbstractC50903MeY) interfaceC09390do.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (!this.A01) {
            AbstractC50903MeY A00 = A00();
            O3T o3t = A00.A01;
            if (A00 instanceof C52601NOw) {
                str = ((C52601NOw) A00).A02;
            } else {
                str = ((C52600NOv) A00).A02;
            }
            C14360o3.A0B(str, 0);
            InterfaceC58268PsC.A02(o3t.A00, str, "lead_gen_edit_form_name", "cancel");
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        AbstractC50903MeY A00 = A00();
        if (A00 instanceof C52601NOw) {
            return ((C52601NOw) A00).A00;
        }
        return ((C52600NOv) A00).A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(120605612);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_edit_form_name, viewGroup, false);
        C0f9.A09(1011019047, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1153135948);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = false;
        C0f9.A09(328593229, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-928478169);
        super.onResume();
        IgFormField igFormField = this.A00;
        if (igFormField != null) {
            igFormField.post(new PN7(this));
        }
        C0f9.A09(1598547166, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1440946661);
        super.onStart();
        this.A02 = PZH.A01(this, A00().A03, 26);
        C0f9.A09(1953068431, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(211188881);
        super.onStop();
        this.A02 = MSY.A0r(this.A02);
        C0f9.A09(-395158745, A02);
    }
}
