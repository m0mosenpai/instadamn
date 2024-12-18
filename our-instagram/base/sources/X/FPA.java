package X;

import android.view.View;
import com.facebook.R;
import kotlin.Deprecated;

/* loaded from: classes6.dex */
public final class FPA {
    public final FKQ A00;

    public FPA(View view, boolean z) {
        FKQ fkq;
        C14360o3.A0B(view, 1);
        if (z) {
            View A0U = AbstractC167017dG.A0U(view, R.id.direct_multi_select_bottom_container_stub);
            C14360o3.A0A(A0U);
            fkq = new C32741Eb7(A0U);
        } else {
            View A0U2 = AbstractC167017dG.A0U(view, R.id.direct_private_share_message_view_stub);
            C14360o3.A0A(A0U2);
            C14360o3.A0B(A0U2, 1);
            fkq = new FKQ(A0U2);
            View view2 = fkq.A01;
            int A01 = C1H4.A01(AbstractC13880nE.A04(AbstractC166997dE.A0L(view2), 12));
            view2.setPadding(A01, A01, A01, A01);
        }
        this.A00 = fkq;
    }

    @Deprecated(message = "Exposed viewHolder visibility is temporary for migration purposes")
    public final C32741Eb7 A00() {
        FKQ fkq = this.A00;
        if (fkq instanceof C32741Eb7) {
            return (C32741Eb7) fkq;
        }
        return null;
    }
}
