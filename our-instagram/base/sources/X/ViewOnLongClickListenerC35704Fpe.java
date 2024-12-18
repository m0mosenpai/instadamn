package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Fpe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35704Fpe implements View.OnLongClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public ViewOnLongClickListenerC35704Fpe(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C2AU c2au;
        InstagramMainActivity instagramMainActivity = this.A01;
        UserSession userSession = instagramMainActivity.A05;
        if (userSession != null && (c2au = (C2AU) userSession.A00(C2AU.class)) != null) {
            C17280tP A0y = AbstractC166987dD.A0y();
            if (AbstractC167017dG.A1b(A0y, A0y.A1i, C17280tP.A4G, 121)) {
                if (C2AU.A01(c2au)) {
                    C2AU.A02(c2au, true);
                    return true;
                }
                return true;
            }
        }
        DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(view.getContext(), instagramMainActivity.getSupportFragmentManager(), (FragmentActivity) instagramMainActivity.A0f, this.A00);
        return true;
    }
}
