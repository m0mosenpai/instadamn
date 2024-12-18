package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.facebook.R;
import com.fbpay.w3c.views.AutofillTextInputLayout;

/* loaded from: classes10.dex */
public final class QED extends QEE {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Resources resources;
        String string;
        Resources resources2;
        C14360o3.A0B(view, 0);
        ((QEE) this).A0C = AbstractC166987dD.A0e(view, R.id.title);
        ((QEE) this).A0A = AbstractC166987dD.A0e(view, R.id.description);
        ((QEE) this).A06 = (EditText) view.findViewById(R.id.card_pan_input);
        ((QEE) this).A0F = (AutofillTextInputLayout) view.findViewById(R.id.card_pan_input_layout);
        ((QEE) this).A05 = (EditText) view.findViewById(R.id.card_cvv_input);
        ((QEE) this).A0E = (AutofillTextInputLayout) view.findViewById(R.id.card_cvv_input_layout);
        ((QEE) this).A03 = (Button) view.findViewById(R.id.confirm_button);
        ((QEE) this).A08 = (LinearLayout) view.findViewById(R.id.enter_card_details_layout);
        ((QEE) this).A02 = view.findViewById(R.id.progress_layout);
        ((QEE) this).A09 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        ((QEE) this).A07 = (FrameLayout) view.findViewById(R.id.bottom_sheet_layout);
        ((QEE) this).A04 = (Button) view.findViewById(R.id.not_now_button);
        ((QEE) this).A0B = AbstractC166987dD.A0e(view, R.id.inline_error_message);
        Context context = getContext();
        String str3 = "";
        if (context == null || (str = context.getString(R.string.res_0x7f130049_name_removed)) == null) {
            str = "";
        }
        this.A0H = str;
        Context context2 = getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.res_0x7f13008b_name_removed)) == null) {
            str2 = "";
        }
        this.A0J = str2;
        Context context3 = getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (string = resources.getString(R.string.res_0x7f13008a_name_removed)) != null) {
            str3 = string;
        }
        this.A0I = str3;
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_iab_autofill_demask_card_prompt, (ViewGroup) null);
        ((QEE) this).A01 = inflate;
        if (inflate != null) {
            ViewOnTouchListenerC63511Soe.A00(inflate, 3, this);
        }
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(((QEE) this).A01).create();
        C14360o3.A07(create);
        return create;
    }
}
