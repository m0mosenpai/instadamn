package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.V0l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67880V0l extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ProfileInputFragment";
    public EditText A00;
    public int A01;
    public AbstractC18680vv A02;
    public final C69672VtH A03 = new Object();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_input_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            C69672VtH c69672VtH = this.A03;
            if (bundle.getString("DynamicFlowPlugin.extraFlowId") != null) {
                c69672VtH.A00(bundle, AbstractC167007dF.A0g(this.A00));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1727545602);
        super.onCreate(bundle);
        this.A02 = (AbstractC18680vv) AbstractC60492pY.A01(this).getValue();
        Window window = getRootActivity().getWindow();
        window.getClass();
        this.A01 = window.getAttributes().softInputMode | 240;
        C0f9.A09(1169973525, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-489795676);
        Bundle requireArguments = requireArguments();
        View inflate = layoutInflater.inflate(R.layout.layout_configurable_input_wizard_step, viewGroup, false);
        ((TextView) inflate.requireViewById(R.id.step_title)).setText(requireArguments.getInt("EXTRA_TITLE_STRING_RES_ID"));
        ((TextView) inflate.requireViewById(R.id.step_subtitle)).setText(requireArguments.getInt("EXTRA_SUBTITLE_STRING_RES_ID"));
        EditText editText = (EditText) inflate.requireViewById(R.id.input_field);
        this.A00 = editText;
        editText.setText(requireArguments.getString("EXTRA_CONTENT"));
        this.A00.setHint(requireArguments.getInt("EXTRA_HINT_STRING_RES_ID"));
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(new WOE(this, 13));
        int i = requireArguments.getInt("EXTRA_INPUT_IME_ACTION", -1);
        if (i != -1) {
            this.A00.setImeOptions(i);
        }
        int i2 = requireArguments.getInt("EXTRA_INPUT_MAX_LINES", 1);
        if (i2 > 1) {
            this.A00.setSingleLine(false);
            this.A00.setImeOptions(AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            this.A00.setInputType(655361);
            this.A00.setMaxLines(i2);
            this.A00.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        int i3 = requireArguments.getInt("EXTRA_INPUT_MAX_CHARACTERS", -1);
        if (i3 > 0) {
            this.A00.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
        }
        this.A00.setOnEditorActionListener(new WPE(2, requireArguments, this));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.progress_button);
        progressButton.setText(requireArguments.getInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID"));
        WNP.A00(progressButton, 56, this, requireArguments);
        C0f9.A09(249663314, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(426063504);
        super.onPause();
        Window window = getRootActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(this.A01);
        InputMethodManager inputMethodManager = (InputMethodManager) getRootActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.A00.getWindowToken(), 0);
        }
        C0f9.A09(43996054, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(474407593);
        super.onResume();
        Window window = getRootActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(16);
        C0f9.A09(-908014243, A02);
    }
}
