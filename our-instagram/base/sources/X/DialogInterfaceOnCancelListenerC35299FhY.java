package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.FhY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35299FhY implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C18920wW A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public DialogInterfaceOnCancelListenerC35299FhY(C18920wW c18920wW, User user, String str, String str2, String str3) {
        this.A00 = c18920wW;
        this.A01 = user;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C75R.A0A(this.A00, this.A01, "approval_page_cancel", this.A02, this.A04, this.A03);
    }
}
