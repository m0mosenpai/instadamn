package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fnx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35606Fnx implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C33206Ekt A03;

    public ViewOnClickListenerC35606Fnx(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C33206Ekt c33206Ekt) {
        this.A03 = c33206Ekt;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-986877641);
        C33206Ekt c33206Ekt = this.A03;
        if (c33206Ekt != null) {
            UserSession userSession = this.A02;
            C29W c29w = new C29W(userSession);
            long A01 = c29w.A01();
            c29w.A03(this.A00, c33206Ekt.A00);
            C461329x.A06(userSession, null, "take_break", C461529z.A00(), A01, AbstractC31174DnI.A07(userSession));
        }
        this.A01.onBackPressed();
        C0f9.A0C(-2007118833, A05);
    }
}
