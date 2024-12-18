package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* loaded from: classes9.dex */
public final class OIB {
    public C54845OMq A00;
    public final SUPMediaStreamControllerDownloader A01;

    public OIB(SUPMediaStreamControllerDownloader sUPMediaStreamControllerDownloader) {
        C14360o3.A0B(sUPMediaStreamControllerDownloader, 1);
        this.A01 = sUPMediaStreamControllerDownloader;
    }

    public final void A00(Context context, UserSession userSession, InterfaceC57997Pnh interfaceC57997Pnh, String str) {
        AbstractC167017dG.A1N(context, userSession);
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null) {
            interfaceC57997Pnh.Dd6(c54845OMq);
        } else {
            this.A01.A02(context, userSession, new C56755PGx(context, userSession, this, interfaceC57997Pnh), str);
        }
    }
}
