package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class GOD implements Runnable {
    public final /* synthetic */ C148786mn A00;
    public final /* synthetic */ C41181vS A01;

    public GOD(C148786mn c148786mn, C41181vS c41181vS) {
        this.A00 = c148786mn;
        this.A01 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C148786mn c148786mn = this.A00;
        Context context = c148786mn.A03;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0k(context.getDrawable(R.drawable.ig_illustrations_illo_story_highlight_add));
        A0I.A0A(2131972781);
        A0I.A09(2131972780);
        DialogInterfaceOnClickListenerC35455FkC.A01(A0I, this.A01, c148786mn, 30, 2131952265);
        A0I.A0I(null, 2131968687);
        DialogInterfaceOnDismissListenerC35463FkK.A00(A0I, c148786mn, 3);
        AbstractC166987dD.A1W(A0I);
        InterfaceC19630xq interfaceC19630xq = c148786mn.A06.A01;
        AbstractC167007dF.A18(interfaceC19630xq, "exclusive_story_highlight_dialog_count", AbstractC31172DnG.A01(interfaceC19630xq, "exclusive_story_highlight_dialog_count") + 1);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("exclusive_story_highlight_dialog_timestamp", currentTimeMillis);
        ARD.apply();
    }
}
