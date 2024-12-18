package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cix, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28565Cix implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DialogInterfaceOnClickListenerC28565Cix(DialogInterface.OnClickListener onClickListener, C18920wW c18920wW, UserSession userSession, C38321qM c38321qM, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A03 = c18920wW;
            this.A04 = userSession;
            this.A02 = c38321qM;
            this.A01 = onClickListener;
        } else {
            this.A01 = onClickListener;
            this.A03 = c18920wW;
            this.A04 = userSession;
            this.A02 = c38321qM;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C6FQ c6fq = (C6FQ) this.A03;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A04;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(this.A01);
                A0s.A02(this.A02);
                AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
                return;
            case 1:
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
                C18920wW c18920wW = (C18920wW) this.A03;
                String str = ((UserSession) this.A04).userId;
                String id = ((C38321qM) this.A02).getId();
                if (id != null) {
                    AbstractC167017dG.A1N(c18920wW, str);
                    C41684IdD.A00(c18920wW, str, id, AbstractC43591JPw.A00(133));
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C18920wW c18920wW2 = (C18920wW) this.A03;
                String str2 = ((UserSession) this.A04).userId;
                String id2 = ((C38321qM) this.A02).getId();
                if (id2 != null) {
                    AbstractC167017dG.A1N(c18920wW2, str2);
                    C41684IdD.A00(c18920wW2, str2, id2, AbstractC43591JPw.A00(133));
                    DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) this.A01;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(dialogInterface, i);
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    public DialogInterfaceOnClickListenerC28565Cix(C6FG c6fg, C6FQ c6fq, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = 0;
        this.A03 = c6fq;
        this.A04 = interfaceC103384lE;
        this.A01 = c102884kP;
        this.A02 = c6fg;
    }
}
