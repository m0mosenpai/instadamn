package X;

import android.content.DialogInterface;

/* renamed from: X.Ofn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55272Ofn implements DialogInterface.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C149166nQ A01;

    public DialogInterfaceOnClickListenerC55272Ofn(C41181vS c41181vS, C149166nQ c149166nQ) {
        this.A00 = c41181vS;
        this.A01 = c149166nQ;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC31364DqT.A03();
        String str = this.A00.A0k;
        C14360o3.A07(str);
        C52156N6i A00 = AbstractC54112NwA.A00(str);
        C149166nQ c149166nQ = this.A01;
        AbstractC31177DnL.A16(A00, c149166nQ.A02, c149166nQ.A03);
    }
}
