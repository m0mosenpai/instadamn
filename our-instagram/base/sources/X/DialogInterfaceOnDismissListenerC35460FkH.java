package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FkH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35460FkH implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnDismissListenerC35460FkH(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            EfY.A01((UserSession) this.A03, (EfY) this.A01, (User) this.A02);
        } else {
            G9Y g9y = (G9Y) this.A01;
            Efi.A01((UserSession) this.A02, (Efi) g9y.A01, (User) this.A03);
        }
    }
}
