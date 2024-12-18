package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54815OKq {
    public long A00;
    public long A01;
    public C1QT A02;
    public final UserSession A03;

    public C54815OKq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = C1QS.A00(userSession);
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 4);
        long j = this.A01;
        if (j != 0) {
            C1QT c1qt = this.A02;
            c1qt.flowAnnotate(j, "app_id", str);
            c1qt.flowAnnotate(this.A01, "source_app", str2);
            c1qt.flowAnnotate(this.A01, "sticker", z);
            c1qt.flowAnnotate(this.A01, "attribution", z2);
            c1qt.flowAnnotate(this.A01, "action", str3);
            if (str4 != null) {
                c1qt.flowAnnotate(this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            }
            if (str5 != null) {
                c1qt.flowAnnotate(this.A01, "package", str5);
            }
        }
    }

    public final void A00(String str) {
        long j = this.A01;
        if (j != 0) {
            this.A02.flowEndFail(j, str, null);
            this.A01 = 0L;
        }
    }
}
