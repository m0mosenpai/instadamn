package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.Fip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35374Fip implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC37216GaR A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C47P A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ CharSequence[] A06;

    public DialogInterfaceOnClickListenerC35374Fip(Context context, InterfaceC37216GaR interfaceC37216GaR, User user, C47P c47p, String str, CharSequence[] charSequenceArr, int i) {
        this.A06 = charSequenceArr;
        this.A01 = context;
        this.A02 = interfaceC37216GaR;
        this.A03 = user;
        this.A04 = c47p;
        this.A00 = i;
        this.A05 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (C14360o3.A0K(this.A06[i], this.A01.getString(2131960998))) {
            InterfaceC37216GaR interfaceC37216GaR = this.A02;
            Integer AvK = interfaceC37216GaR.AvK(this.A03.getId());
            C47P c47p = this.A04;
            if (AvK != null) {
                i2 = AvK.intValue();
            } else {
                i2 = this.A00;
            }
            interfaceC37216GaR.DAw(c47p, this.A05, i2);
        }
    }
}
