package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes4.dex */
public final class AOX implements DialogInterface.OnClickListener {
    public final /* synthetic */ C85J A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AOX(C85J c85j, String str, boolean z, boolean z2) {
        this.A00 = c85j;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C85J c85j = this.A00;
        String str = this.A01;
        boolean z = this.A03;
        Intent intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str));
        Context context = c85j.A02;
        if (z) {
            AbstractC07840b2.A01(context, intent);
        } else {
            AbstractC07840b2.A02(context, intent);
        }
        if (this.A02 && (context instanceof TransparentModalActivity)) {
            ((ModalActivity) context).finish();
        }
    }
}
