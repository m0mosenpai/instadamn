package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GQO implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ EDH A02;
    public final /* synthetic */ boolean A03;

    public GQO(FragmentActivity fragmentActivity, C07270a1 c07270a1, EDH edh, boolean z) {
        this.A02 = edh;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A01 = c07270a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<? extends Parcelable> A1E;
        AbstractC31172DnG.A1A();
        EDH edh = this.A02;
        List list = edh.A09;
        if (list != null) {
            A1E = AbstractC166987dD.A1F(list);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        String str = edh.A08;
        C14360o3.A07(str);
        boolean z = this.A03;
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS", A1E);
        A0b.putString("ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK", str);
        A0b.putBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL", z);
        abstractC59962oe.setArguments(A0b);
        C140966Yy A0N = AbstractC31174DnI.A0N(abstractC59962oe, this.A00, this.A01);
        if (z) {
            A0N.A0E = true;
        }
        A0N.A04();
    }
}
