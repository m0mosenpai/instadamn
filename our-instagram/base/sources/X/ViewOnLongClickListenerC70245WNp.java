package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.WNp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLongClickListenerC70245WNp implements View.OnLongClickListener {
    public final /* synthetic */ C69655Vsw A00;
    public final /* synthetic */ C66359UCf A01;
    public final /* synthetic */ String A02;

    public ViewOnLongClickListenerC70245WNp(C69655Vsw c69655Vsw, C66359UCf c66359UCf, String str) {
        this.A00 = c69655Vsw;
        this.A01 = c66359UCf;
        this.A02 = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C69655Vsw c69655Vsw = this.A00;
        C193328hC c193328hC = new C193328hC((Activity) c69655Vsw.A02);
        c193328hC.A0t(true);
        c193328hC.A0R(new DialogInterfaceOnClickListenerC35451Fk8(c69655Vsw, this.A01, this.A02, 2), EnumC193348hE.A04, 2131957640);
        AbstractC166987dD.A1W(c193328hC);
        return true;
    }
}
