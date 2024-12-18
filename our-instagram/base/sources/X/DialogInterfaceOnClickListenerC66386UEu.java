package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.UEu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC66386UEu extends C0SG implements DialogInterface.OnClickListener {
    public final DialogInterfaceOnDismissListenerC63428Sk7 A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterfaceOnDismissListenerC63428Sk7 dialogInterfaceOnDismissListenerC63428Sk7 = this.A00;
        if (dialogInterfaceOnDismissListenerC63428Sk7 != null) {
            dialogInterfaceOnDismissListenerC63428Sk7.onClick(dialogInterface, i);
        }
    }

    public DialogInterfaceOnClickListenerC66386UEu(Bundle bundle, DialogInterfaceOnDismissListenerC63428Sk7 dialogInterfaceOnDismissListenerC63428Sk7) {
        this.A00 = dialogInterfaceOnDismissListenerC63428Sk7;
        setArguments(bundle);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        Bundle requireArguments = requireArguments();
        TypedArray obtainStyledAttributes = requireActivity.obtainStyledAttributes(AbstractC53402cO.A09);
        boolean hasValue = obtainStyledAttributes.hasValue(117);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            C69797Vvh c69797Vvh = new C69797Vvh(requireActivity);
            if (requireArguments.containsKey(DialogModule.KEY_TITLE)) {
                String string = requireArguments.getString(DialogModule.KEY_TITLE);
                AbstractC05810Sj.A00(string);
                View inflate = LayoutInflater.from(requireActivity).inflate(R.layout.alert_title_layout, (ViewGroup) null);
                View findViewById = inflate.findViewById(R.id.alert_title);
                AbstractC05810Sj.A00(findViewById);
                TextView textView = (TextView) findViewById;
                textView.setText(string);
                textView.setFocusable(true);
                textView.setAccessibilityHeading(true);
                c69797Vvh.A01.A09 = inflate;
            }
            if (requireArguments.containsKey("button_positive")) {
                c69797Vvh.A06(this, requireArguments.getString("button_positive"));
            }
            if (requireArguments.containsKey("button_negative")) {
                c69797Vvh.A05(this, requireArguments.getString("button_negative"));
            }
            if (requireArguments.containsKey("button_neutral")) {
                String string2 = requireArguments.getString("button_neutral");
                C69487VoA c69487VoA = c69797Vvh.A01;
                c69487VoA.A0E = string2;
                c69487VoA.A02 = this;
            }
            if (requireArguments.containsKey(DialogModule.KEY_MESSAGE)) {
                c69797Vvh.A01.A0C = requireArguments.getString(DialogModule.KEY_MESSAGE);
            }
            if (requireArguments.containsKey(DialogModule.KEY_ITEMS)) {
                CharSequence[] charSequenceArray = requireArguments.getCharSequenceArray(DialogModule.KEY_ITEMS);
                C69487VoA c69487VoA2 = c69797Vvh.A01;
                c69487VoA2.A0J = charSequenceArray;
                c69487VoA2.A03 = this;
            }
            return c69797Vvh.A00();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity);
        if (requireArguments.containsKey(DialogModule.KEY_TITLE)) {
            String string3 = requireArguments.getString(DialogModule.KEY_TITLE);
            AbstractC05810Sj.A00(string3);
            View inflate2 = LayoutInflater.from(requireActivity).inflate(R.layout.alert_title_layout, (ViewGroup) null);
            View findViewById2 = inflate2.findViewById(R.id.alert_title);
            AbstractC05810Sj.A00(findViewById2);
            TextView textView2 = (TextView) findViewById2;
            textView2.setText(string3);
            textView2.setFocusable(true);
            textView2.setAccessibilityHeading(true);
            builder.setCustomTitle(inflate2);
        }
        if (requireArguments.containsKey("button_positive")) {
            builder.setPositiveButton(requireArguments.getString("button_positive"), this);
        }
        if (requireArguments.containsKey("button_negative")) {
            builder.setNegativeButton(requireArguments.getString("button_negative"), this);
        }
        if (requireArguments.containsKey("button_neutral")) {
            builder.setNeutralButton(requireArguments.getString("button_neutral"), this);
        }
        if (requireArguments.containsKey(DialogModule.KEY_MESSAGE)) {
            builder.setMessage(requireArguments.getString(DialogModule.KEY_MESSAGE));
        }
        if (requireArguments.containsKey(DialogModule.KEY_ITEMS)) {
            builder.setItems(requireArguments.getCharSequenceArray(DialogModule.KEY_ITEMS), this);
        }
        return builder.create();
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterfaceOnDismissListenerC63428Sk7 dialogInterfaceOnDismissListenerC63428Sk7 = this.A00;
        if (dialogInterfaceOnDismissListenerC63428Sk7 != null) {
            dialogInterfaceOnDismissListenerC63428Sk7.onDismiss(dialogInterface);
        }
    }

    public DialogInterfaceOnClickListenerC66386UEu() {
        this.A00 = null;
    }
}
