package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IMK {
    public View A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C41741IeF A03;
    public final String A04;
    public final String A05;
    public final Context A06;

    public IMK(Context context, FragmentActivity fragmentActivity, UserSession userSession, C41741IeF c41741IeF, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str);
        C14360o3.A0B(str2, 5);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = str;
        this.A06 = context;
        this.A05 = str2;
        this.A03 = c41741IeF;
    }

    public final void A00(InterfaceC56362iU interfaceC56362iU) {
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_save_pano_outline_24;
        A0B.A05 = 2131977114;
        A0B.A0G = new ViewOnClickListenerC42033Ik2(this, 42);
        View AA9 = interfaceC56362iU.AA9(new C3LY(A0B));
        AbstractC13880nE.A0c(AA9, AbstractC167017dG.A0F(this.A06));
        this.A00 = AA9;
    }
}
