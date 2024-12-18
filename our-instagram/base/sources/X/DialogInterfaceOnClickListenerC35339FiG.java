package X;

import android.content.DialogInterface;

/* renamed from: X.FiG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35339FiG implements DialogInterface.OnClickListener {
    public final DialogInterface.OnClickListener A00;
    public final C07270a1 A01;
    public final C1Q9 A02;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35230FgN.A03(this.A02.A02(this.A01), EnumC31713DwI.A04);
        this.A00.onClick(dialogInterface, i);
    }

    public DialogInterfaceOnClickListenerC35339FiG(DialogInterface.OnClickListener onClickListener, C07270a1 c07270a1, C1Q9 c1q9) {
        this.A01 = c07270a1;
        this.A00 = onClickListener;
        this.A02 = c1q9;
    }
}
