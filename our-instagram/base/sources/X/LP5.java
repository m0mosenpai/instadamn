package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class LP5 implements View.OnClickListener {
    public final /* synthetic */ C9CP A00;
    public final /* synthetic */ C7QY A01;
    public final /* synthetic */ C158677Ad A02;

    public LP5(C9CP c9cp, C7QY c7qy, C158677Ad c158677Ad) {
        this.A01 = c7qy;
        this.A02 = c158677Ad;
        this.A00 = c9cp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1028704066);
        String str = this.A01.A0L.A02;
        C158677Ad c158677Ad = this.A02;
        C47993LKk.A02(c158677Ad.A01, c158677Ad.A02, str);
        Context context = c158677Ad.A00;
        String str2 = this.A00.A02;
        if (str2 != null) {
            AbstractC41776Ies.A03(context, str2);
            C0f9.A0C(461506296, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(-699850886, A05);
            throw A0g;
        }
    }
}
