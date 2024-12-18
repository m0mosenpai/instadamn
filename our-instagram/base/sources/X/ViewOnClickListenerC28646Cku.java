package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cku, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28646Cku implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C145176gc A01;
    public final /* synthetic */ C14510oO A02;

    public ViewOnClickListenerC28646Cku(FragmentActivity fragmentActivity, C145176gc c145176gc, C14510oO c14510oO) {
        this.A01 = c145176gc;
        this.A02 = c14510oO;
        this.A00 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(2132346222);
        C28458ChA c28458ChA = C28458ChA.A00;
        UserSession userSession = this.A01.A09;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        c28458ChA.A08(userSession, AbstractC111324zv.A00(3830), "primary_button", null, null, null, null, null, null);
        this.A02.A00 = true;
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        C0f9.A0C(-1344653439, A05);
    }
}
