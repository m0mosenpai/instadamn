package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KsA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47115KsA {
    /* JADX WARN: Type inference failed for: r3v0, types: [android.app.Dialog, java.lang.Object, X.9RU] */
    public static final C9RU A00(Context context, String str, InterfaceC16820sZ interfaceC16820sZ) {
        ?? dialog = new Dialog(context);
        dialog.setContentView(R.layout.cancelable_dialog);
        AbstractC166987dD.A1P(dialog.getContext(), (TextView) dialog.findViewById(R.id.negative_button), 2131954754);
        ViewOnClickListenerC48073LPy.A00(dialog.findViewById(R.id.negative_button_row), 43, dialog);
        TextView textView = (TextView) dialog.findViewById(R.id.message);
        textView.setVisibility(0);
        textView.setText(str);
        dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC48025LMu(interfaceC16820sZ, 12));
        return dialog;
    }
}
