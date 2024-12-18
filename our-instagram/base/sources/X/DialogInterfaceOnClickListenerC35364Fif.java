package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Fif, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35364Fif implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public DialogInterfaceOnClickListenerC35364Fif(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.A00 = i3;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj3;
        this.A05 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FQ5 fq5;
        switch (this.A00) {
            case 0:
                C35123FeQ c35123FeQ = (C35123FeQ) this.A03;
                int i2 = this.A01;
                int i3 = this.A02;
                C3o9 c3o9 = (C3o9) this.A04;
                InterfaceC37210GaL interfaceC37210GaL = (InterfaceC37210GaL) this.A05;
                if (i2 == 0 && i3 != 29) {
                    c35123FeQ.A03.Ch4(c3o9);
                    interfaceC37210GaL.DOi();
                    return;
                } else {
                    if (c3o9 instanceof MsysThreadId) {
                        return;
                    }
                    Context context = c35123FeQ.A00;
                    UserSession userSession = c35123FeQ.A02;
                    AbstractC167017dG.A1N(context, userSession);
                    new C31605DuX(context, userSession).A02(c3o9, C05F.A0C);
                    interfaceC37210GaL.D9X();
                    return;
                }
            case 1:
                fq5 = (FQ5) this.A05;
                break;
            default:
                fq5 = (FQ5) this.A05;
                InterfaceC09390do interfaceC09390do = fq5.A02;
                CharSequence charSequence = ((CharSequence[]) interfaceC09390do.getValue())[i];
                Context context2 = fq5.A00;
                if (!C14360o3.A0K(charSequence, AbstractC166997dE.A0p(context2, 2131972240))) {
                    if (C14360o3.A0K(((CharSequence[]) interfaceC09390do.getValue())[i], AbstractC166997dE.A0p(context2, 2131972226))) {
                        fq5.A01.EFN((C38321qM) this.A03, (C75113Zb) this.A04, this.A01, this.A02);
                        return;
                    }
                    return;
                }
                break;
        }
        fq5.A01.F9n((C38321qM) this.A03, (C75113Zb) this.A04, this.A01, this.A02);
    }
}
