package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gvl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38464Gvl extends C3OO {
    public final Context A00;
    public final TextView A01;
    public final UserSession A02;

    public C38464Gvl(View view, UserSession userSession) {
        super(view);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A02 = userSession;
        this.A01 = AbstractC167007dF.A0N(view, R.id.text);
    }
}
