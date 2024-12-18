package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.CommentPromptImpl;

/* renamed from: X.EJb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32266EJb extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CommentPromptCreationFragment";
    public View A00;
    public EditText A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comment_prompt_creation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ActionButton actionButton;
        Editable text;
        String string;
        EditText editText;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (EditText) view.findViewById(R.id.comment_prompt_input_text_view);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString(MSV.A00(942))) != null && (editText = this.A01) != null) {
            editText.setText(string);
        }
        EditText editText2 = this.A01;
        if (editText2 != null) {
            C35469Fl4.A00(editText2, this, 1);
        }
        View findViewById = view.findViewById(R.id.creation_delete_prompt);
        if (requireArguments().getBoolean(MSV.A00(949), false)) {
            findViewById.setVisibility(0);
            ViewOnClickListenerC35679FpE.A01(findViewById, 33, this);
        } else {
            findViewById.setVisibility(8);
        }
        EditText editText3 = this.A01;
        if (editText3 != null) {
            editText3.requestFocus();
            AbstractC167017dG.A18(editText3);
            AbstractC13880nE.A0S(editText3);
            editText3.sendAccessibilityEvent(Constants.LOAD_RESULT_PGO);
        }
        boolean z = false;
        if (requireArguments().getBoolean(MSV.A00(178), false)) {
            View A0S = AbstractC166997dE.A0S(view, R.id.caption_add_on_action_bar);
            A0S.setVisibility(0);
            ViewOnClickListenerC35679FpE.A01(AbstractC166997dE.A0S(A0S, R.id.action_bar_button_cancel), 36, this);
            View requireViewById = A0S.requireViewById(R.id.action_bar_button_done);
            this.A00 = requireViewById;
            if ((requireViewById instanceof ActionButton) && (actionButton = (ActionButton) requireViewById) != null) {
                actionButton.setButtonResource(R.drawable.instagram_check_pano_outline_24);
                Context context = actionButton.getContext();
                actionButton.setColorFilter(AbstractC31174DnI.A09(context, AbstractC53242c7.A0C(context)));
                ViewOnClickListenerC35679FpE.A01(actionButton, 37, this);
                EditText editText4 = this.A01;
                if (editText4 != null && (text = editText4.getText()) != null && AbstractC25225BEi.A1Y(text)) {
                    z = true;
                }
                actionButton.setEnabled(z);
            }
        }
    }

    public static final void A00(C32266EJb c32266EJb) {
        Editable editable;
        InterfaceC09390do interfaceC09390do = c32266EJb.A02;
        C31795DyF c31795DyF = (C31795DyF) interfaceC09390do.getValue();
        EditText editText = c32266EJb.A01;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        C14360o3.A0B(valueOf, 0);
        c31795DyF.A01.Egh(valueOf);
        ((C31795DyF) interfaceC09390do.getValue()).A00.A0B(AbstractC33671EuL.A00(new CommentPromptImpl(null, null), C35104Fe6.A00().A01));
        AbstractC25226BEj.A1Q(c32266EJb);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C32266EJb() {
        C0YZ A1D = AbstractC25225BEi.A1D(C31795DyF.class);
        this.A02 = AbstractC25225BEi.A0a(new C29906DGu(this, 8), new C29906DGu(this, 9), new D8L(14, null, this), A1D);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Editable text;
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A02(AbstractC166997dE.A0N(this), A00, 2131956467);
        this.A00 = C31722DwR.A00(ViewOnClickListenerC35679FpE.A00(this, 34), interfaceC56362iU, A00);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 35), AbstractC31176DnK.A0I(), interfaceC56362iU);
        View view = this.A00;
        if (view != null) {
            EditText editText = this.A01;
            boolean z = false;
            if (editText != null && (text = editText.getText()) != null && AbstractC25225BEi.A1Y(text)) {
                z = true;
            }
            view.setEnabled(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2020064111);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.comment_prompt_creation_layout, false);
        C0f9.A09(-269245200, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(180464601);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        C0f9.A09(-1262670056, A02);
    }
}
