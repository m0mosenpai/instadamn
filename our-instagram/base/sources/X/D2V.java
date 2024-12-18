package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class D2V implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C6CF A02;
    public final /* synthetic */ C48519LdH A03;
    public final /* synthetic */ EncrypteddBackupsUrlHandlerActivity A04;

    public D2V(Bundle bundle, UserSession userSession, C6CF c6cf, C48519LdH c48519LdH, EncrypteddBackupsUrlHandlerActivity encrypteddBackupsUrlHandlerActivity) {
        this.A03 = c48519LdH;
        this.A02 = c6cf;
        this.A04 = encrypteddBackupsUrlHandlerActivity;
        this.A00 = bundle;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48519LdH c48519LdH = this.A03;
        C6CF c6cf = this.A02;
        EncrypteddBackupsUrlHandlerActivity encrypteddBackupsUrlHandlerActivity = this.A04;
        EnumC46208Kck A00 = LJf.A00(encrypteddBackupsUrlHandlerActivity, c6cf, c48519LdH, C05F.A15);
        if (A00 != null) {
            Bundle bundle = this.A00;
            UserSession userSession = this.A01;
            bundle.putString(AbstractC43591JPw.A00(107), A00.A00);
            KCM A01 = LJf.A01(bundle, userSession, A00);
            if (A01 != null) {
                C140966Yy A0r = AbstractC25225BEi.A0r(encrypteddBackupsUrlHandlerActivity, userSession);
                A0r.A0D(A01);
                A0r.A0D = false;
                A0r.A04();
                return;
            }
            return;
        }
        encrypteddBackupsUrlHandlerActivity.finish();
    }
}
