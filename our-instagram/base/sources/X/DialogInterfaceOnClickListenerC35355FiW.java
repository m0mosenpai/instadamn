package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35355FiW implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public DialogInterfaceOnClickListenerC35355FiW(UserSession userSession, String str, String str2, int i, int i2) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC35213Fg6.A04(this.A02, this.A03, this.A04, this.A00, this.A01);
        dialogInterface.dismiss();
    }
}
