package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

/* renamed from: X.Fnf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35588Fnf implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC35588Fnf(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1344148922);
        new AiAgentThreadLauncher(this.A02).A08(this.A00, this.A01, this.A03, null, null, null, true);
        C0f9.A0C(2109087220, A05);
    }
}
