package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.JrT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44746JrT extends C3OO {
    public C49683LxE A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final UserSession A04;
    public final C3PE A05;
    public final C44571Jnw A06;
    public final MediaFrameLayout A07;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.LxE] */
    public C44746JrT(View view, UserSession userSession, C44571Jnw c44571Jnw) {
        super(view);
        this.A05 = new KKp(this, 14);
        Context context = view.getContext();
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view;
        this.A07 = mediaFrameLayout;
        TextView A06 = AbstractC31180DnO.A06(view);
        this.A03 = A06;
        this.A02 = AbstractC166997dE.A0T(view, R.id.headline);
        this.A01 = AbstractC166997dE.A0T(view, R.id.action_button);
        this.A04 = userSession;
        this.A06 = c44571Jnw;
        ?? obj = new Object();
        obj.A00 = context;
        obj.A01 = userSession;
        this.A00 = obj;
        if (context != null) {
            A06.setTypeface(AbstractC167017dG.A0S(context));
            int A0A = AbstractC13880nE.A0A(context);
            AbstractC13880nE.A0g(mediaFrameLayout, A0A);
            AbstractC13880nE.A0W(mediaFrameLayout, A0A);
        }
    }
}
