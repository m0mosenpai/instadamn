package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GPS implements Runnable {
    public final /* synthetic */ C7KZ A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C47Z A02;

    public GPS(C7KZ c7kz, C38321qM c38321qM, C47Z c47z) {
        this.A00 = c7kz;
        this.A01 = c38321qM;
        this.A02 = c47z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7KZ c7kz = this.A00;
        c7kz.A05.FAX(C128085qc.A02(this.A01));
        C47Z c47z = this.A02;
        if (c47z.A0l != null) {
            Context context = c7kz.A01;
            C77453dV.A08(c7kz.A04, c7kz.A06);
            C9GR.A07(context, 2131973809);
            return;
        }
        UserSession userSession = c7kz.A04;
        if (!C18U.A06(C06090Tz.A05, userSession, 36314837546765137L)) {
            return;
        }
        Context context2 = c7kz.A01;
        Fragment fragment = c7kz.A02;
        InterfaceC60442pS interfaceC60442pS = c7kz.A06;
        if (interfaceC60442pS == null) {
            return;
        }
        C65972yZ c65972yZ = C77453dV.A03;
        if (c65972yZ == null) {
            c65972yZ = new C65972yZ(context2, fragment, userSession, interfaceC60442pS, C05F.A00);
            C77453dV.A03 = c65972yZ;
        }
        c65972yZ.A01(c47z);
    }
}
