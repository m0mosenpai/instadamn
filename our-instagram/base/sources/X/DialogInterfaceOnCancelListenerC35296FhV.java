package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FhV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35296FhV implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnCancelListenerC35296FhV(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 2:
                ((Activity) this.A02).runOnUiThread(new GKW(this));
                return;
            case 3:
                UserSession userSession = ((FQJ) this.A03).A04;
                AbstractC35174FfR.A02((EnumC72435Xdf) this.A02, userSession, MSV.A00(1693), (HashMap) this.A01, 3);
                return;
            default:
                AbstractC25227BEk.A1M((C6FQ) this.A03, AbstractC31179DnN.A0I(this.A02), (InterfaceC103384lE) this.A01);
                return;
        }
    }
}
