package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.CkJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28610CkJ implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public ViewOnClickListenerC28610CkJ(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(205243456);
        AbstractC35257Fgr.A00(this.A00, null, this.A01, "thread_action_sheet", null);
        C0f9.A0C(1102974535, A05);
    }
}
