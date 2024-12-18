package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FmE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35523FmE implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35523FmE(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1238216026);
        C34963Fan c34963Fan = this.A00;
        UserSession userSession = c34963Fan.A04;
        FRU fru = new FRU(c34963Fan.A03, userSession);
        EnumC33505Ere enumC33505Ere = EnumC33505Ere.POG_LONG_PRESS;
        fru.A01(enumC33505Ere);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(EnumC33367Ep0.A0A, null);
        A1G.put(EnumC33367Ep0.A04, null);
        A1G.put(EnumC33367Ep0.A07, enumC33505Ere);
        FragmentActivity fragmentActivity = c34963Fan.A02;
        EOT A00 = AbstractC34039F0s.A00(null, userSession, A1G);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = A00;
        A0y.A0T = A00;
        A0y.A0X = null;
        AbstractC31173DnH.A0w(fragmentActivity, A00, A0y);
        C0f9.A0C(1962763394, A05);
    }
}
