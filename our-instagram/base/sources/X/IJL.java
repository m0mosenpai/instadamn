package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IJL {
    public final Context A00;
    public final View A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC09390do A03 = J8V.A00(this, 17);
    public final InterfaceC09390do A04 = J8V.A00(this, 18);

    public IJL(View view) {
        this.A00 = view.getContext();
        this.A01 = AbstractC166987dD.A0c(view, R.id.profile_overlay_gradient);
        this.A02 = AbstractC31179DnN.A0M(view, R.id.profile_overlay_stub);
    }
}
