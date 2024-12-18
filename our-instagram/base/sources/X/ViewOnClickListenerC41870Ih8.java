package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ih8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41870Ih8 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41870Ih8(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1152890872);
        AnonymousClass308 anonymousClass308 = this.A00;
        Fragment fragment = anonymousClass308.A0R;
        UserSession userSession = anonymousClass308.A0T;
        String A2u = anonymousClass308.A07().A2u();
        if (A2u != null) {
            C1GJ.A03(AbstractC41331IRb.A01(fragment, userSession, A2u));
            C0f9.A0C(-214193380, A05);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
