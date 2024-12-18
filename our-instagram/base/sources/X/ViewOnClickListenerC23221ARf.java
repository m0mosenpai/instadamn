package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.ARf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23221ARf implements View.OnClickListener {
    public final /* synthetic */ C2EE A00;
    public final /* synthetic */ AGO A01;

    public ViewOnClickListenerC23221ARf(C2EE c2ee, AGO ago) {
        this.A01 = ago;
        this.A00 = c2ee;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr;
        int A05 = C0f9.A05(1756307308);
        AGO ago = this.A01;
        User BT1 = this.A00.BT1();
        FragmentActivity fragmentActivity = ago.A02;
        String A0p = AbstractC166997dE.A0p(fragmentActivity, 2131958760);
        String A0p2 = AbstractC166997dE.A0p(fragmentActivity, 2131960355);
        if (ago.A05.A00(EnumC2054697t.A0x)) {
            strArr = new String[]{A0p, A0p2};
        } else {
            strArr = new String[]{A0p};
        }
        C193328hC c193328hC = new C193328hC((Context) fragmentActivity);
        c193328hC.A0n(ago.A03);
        c193328hC.A0f(new LMK(BT1, strArr, ago, A0p2, A0p, 0), strArr);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        AbstractC166987dD.A1W(c193328hC);
        C0f9.A0C(257826928, A05);
    }
}
