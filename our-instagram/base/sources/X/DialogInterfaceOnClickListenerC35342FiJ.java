package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.FiJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35342FiJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C70D A02;

    public DialogInterfaceOnClickListenerC35342FiJ(Intent intent, Bundle bundle, C70D c70d) {
        this.A02 = c70d;
        this.A01 = bundle;
        this.A00 = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1QE.A01("business_conversion_flow").A08();
        Bundle bundle = this.A01;
        bundle.putInt("business_account_flow", 3);
        Intent intent = this.A00;
        intent.putExtras(bundle);
        C12260kU.A06(this.A02.A07, intent, 14);
    }
}
