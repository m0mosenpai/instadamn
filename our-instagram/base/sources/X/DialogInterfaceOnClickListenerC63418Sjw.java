package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.Sjw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC63418Sjw implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((C58772Q8e) weakReference.get()).A04(true);
        }
    }

    public DialogInterfaceOnClickListenerC63418Sjw(C58772Q8e c58772Q8e) {
        this.A00 = AbstractC25225BEi.A16(c58772Q8e);
    }
}
