package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31300DpM extends AbstractC46524KiP {
    public C189478aR A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final FragmentActivity A04;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        View view = new View(context);
        view.setVisibility(8);
        return view;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (str != null) {
            this.A01 = str;
            if (c2ec != null && c2ec.C7I() != null) {
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        if (!this.A02) {
            C189448aO A0y = AbstractC25225BEi.A0y(this.A03);
            EkY ekY = new EkY();
            FragmentActivity fragmentActivity = this.A04;
            A0y.A0g = fragmentActivity.getString(2131969895);
            A0y.A1J = true;
            A0y.A0K = new ViewOnClickListenerC35666Fp0(this, 59);
            A0y.A0h = fragmentActivity.getString(2131960425);
            A0y.A1N = true;
            A0y.A0L = new ViewOnClickListenerC35666Fp0(this, 60);
            A0y.A0b = fragmentActivity.getString(2131969896);
            A0y.A0U = new GH5(this, 15);
            A0y.A1P = true;
            C189478aR A00 = A0y.A00();
            this.A00 = A00;
            A00.A02(fragmentActivity, ekY);
            C189478aR c189478aR = this.A00;
            if (c189478aR != null && c189478aR.A0S()) {
                this.A02 = true;
            }
        }
    }

    public C31300DpM(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A04 = fragmentActivity;
        this.A03 = userSession;
    }

    @Override // X.AbstractC46524KiP
    public final boolean A05() {
        return this.A02;
    }
}
