package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Ayt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24833Ayt implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C166627cY A02;
    public final /* synthetic */ UserSession A03;

    public RunnableC24833Ayt(Context context, FragmentActivity fragmentActivity, C166627cY c166627cY, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = c166627cY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        C14360o3.A0A(context);
        UserSession userSession = this.A03;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A02.A0B;
        AbstractC167017dG.A1P(context, userSession);
        C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, context.getResources().getString(2131956479));
        A0f.A03(composerAutoCompleteTextView);
        A0f.A02();
        A0f.A0A = false;
        A0f.A04 = new C220459oV(userSession, 0);
        AbstractC166997dE.A1P(A0f);
    }
}
