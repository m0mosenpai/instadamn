package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35587Fne implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FKI A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC35587Fne(FragmentActivity fragmentActivity, UserSession userSession, FKI fki, String str) {
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = fki;
        this.A00 = fragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-8115406);
        UserSession userSession = this.A01;
        C7F3.A01(null, EnumC72433Xdd.A05, new C7F3(userSession), this.A03, 9);
        FKI fki = this.A02;
        fki.A01.markerStart(814288692, fki.A00);
        FragmentActivity fragmentActivity = this.A00;
        C30172DRc c30172DRc = new C30172DRc(42, fragmentActivity, userSession, fki);
        AbstractC31265Don.A00();
        AbstractC31266Doo.A00(userSession).A01(fragmentActivity, new G1N(fragmentActivity, c30172DRc));
        C0f9.A0C(-816843785, A05);
    }
}
