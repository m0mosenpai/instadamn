package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;

/* loaded from: classes9.dex */
public final class O4H {
    public final LinearLayout A00;

    public O4H(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        this.A00 = (LinearLayout) inflate;
    }
}
