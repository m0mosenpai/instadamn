package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GPT implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ User A02;

    public GPT(Context context, DialogInterface.OnClickListener onClickListener, User user) {
        this.A00 = context;
        this.A02 = user;
        this.A01 = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131962152);
        AbstractC31177DnL.A0v(context, A0I, this.A02.getUsername(), 2131962151);
        A0I.A0J(this.A01, 2131962676);
        A0I.A06();
        AbstractC166987dD.A1W(A0I);
    }
}
