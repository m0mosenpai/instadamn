package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.JqN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44678JqN extends C3OO {
    public AnonymousClass710 A00;
    public final View A01;

    public C44678JqN(View view) {
        super(view);
        View A0S = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        this.A01 = A0S;
        Context context = view.getContext();
        if (context != null) {
            AnonymousClass710 A00 = AbstractC54033Nuj.A00(context, true);
            this.A00 = A00;
            A0S.setBackground(A00);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
