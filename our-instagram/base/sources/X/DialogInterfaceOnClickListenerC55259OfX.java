package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.OfX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55259OfX implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;

    public DialogInterfaceOnClickListenerC55259OfX(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.A00.onBackPressed();
    }
}
