package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G8U implements GZB {
    public final /* synthetic */ EMb A00;
    public final /* synthetic */ C84923qg A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ boolean A03;

    @Override // X.GZB
    public final void D3J(Context context) {
        C14360o3.A0B(context, 0);
        C38321qM c38321qM = this.A02;
        String id = c38321qM.getId();
        if (id != null) {
            C27956CUa A00 = AnonymousClass548.A00().A00();
            FragmentActivity A07 = AbstractC31179DnN.A07();
            if (A07 != null) {
                EMb eMb = this.A00;
                UserSession A0r = AbstractC166987dD.A0r(eMb.A0D);
                InterfaceC60442pS interfaceC60442pS = eMb.A01;
                if (interfaceC60442pS == null) {
                    C14360o3.A0F("insightsHost");
                    throw C00O.createAndThrow();
                }
                A00.A01(A07, EnumC120785dO.NOTIFICATIONS, A0r, interfaceC60442pS, id, this.A01.A0G, null, this.A03, true, false, true, false, c38321qM.CdW());
            }
        }
    }

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8U(EMb eMb, C84923qg c84923qg, C38321qM c38321qM, boolean z) {
        this.A02 = c38321qM;
        this.A00 = eMb;
        this.A01 = c84923qg;
        this.A03 = z;
    }
}
