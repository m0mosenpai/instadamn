package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55424OjZ implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public ViewOnClickListenerC55424OjZ(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55011OVw c55011OVw, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = fragmentActivity;
        this.A03 = interfaceC11380iw;
        this.A05 = userSession;
        this.A06 = str;
        this.A01 = i;
        this.A04 = c55011OVw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-916332040);
                C55195Oe1.A01.A06((FragmentActivity) this.A02, (InterfaceC11380iw) this.A03, (UserSession) this.A05, (C55011OVw) this.A04, this.A06, this.A01, true);
                i = 874295442;
                break;
            case 1:
                A05 = C0f9.A05(1760575992);
                C55195Oe1.A01.A06((FragmentActivity) this.A02, (InterfaceC11380iw) this.A03, (UserSession) this.A05, (C55011OVw) this.A04, this.A06, this.A01, false);
                i = 975322671;
                break;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
