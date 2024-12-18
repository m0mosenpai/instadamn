package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ih7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41869Ih7 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41869Ih7(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1874864143);
        AnonymousClass308 anonymousClass308 = this.A00;
        UserSession userSession = anonymousClass308.A0T;
        IQV.A01(anonymousClass308.A0R, userSession, anonymousClass308.A07(), anonymousClass308.A0X, new C71144Wof(anonymousClass308, 1));
        C0f9.A0C(-1038424114, A05);
    }
}
