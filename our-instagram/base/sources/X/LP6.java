package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class LP6 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC75453aC A01;
    public final /* synthetic */ String A02;

    public LP6(FragmentActivity fragmentActivity, InterfaceC75453aC interfaceC75453aC, String str) {
        this.A00 = fragmentActivity;
        this.A02 = str;
        this.A01 = interfaceC75453aC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(870644882);
        if (this.A00 != null && (str = this.A02) != null) {
            this.A01.D5Z(str);
        }
        C0f9.A0C(-407739488, A05);
    }
}