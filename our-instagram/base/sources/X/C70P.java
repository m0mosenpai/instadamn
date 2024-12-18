package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.70P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70P {
    public int A00;
    public C53I A01;
    public final Activity A02;
    public final Fragment A03;
    public final UserSession A04;
    public final C1GL A05;

    public C70P(Activity activity, Fragment fragment, UserSession userSession, C1GL c1gl) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = fragment;
        this.A05 = c1gl;
    }

    public final void A00() {
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318857638779501L)) {
            if (System.currentTimeMillis() - C9J6.A00 >= C18U.A00(c06090Tz, userSession, 37163282569167128L) * 1000.0d) {
                C9J6.A00 = System.currentTimeMillis();
            } else {
                return;
            }
        }
        AbstractC152356tL.A00(new C1P1() { // from class: X.6tK
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(144572550);
                C152366tM c152366tM = (C152366tM) obj;
                int A032 = C0f9.A03(1908644695);
                C14360o3.A0B(c152366tM, 0);
                C70P c70p = C70P.this;
                YQJ yqj = c152366tM.A00;
                if (yqj == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                c70p.A00 = ((XNZ) yqj).A00;
                if (c70p.A03.isResumed()) {
                    C56352iT.A0t.A03(c70p.A02).A0T();
                    C53I c53i = c70p.A01;
                    if (c53i != null) {
                        c53i.A02();
                    }
                }
                C0f9.A0A(1628167846, A032);
                C0f9.A0A(2025265249, A03);
            }
        }, userSession, this.A05);
    }
}
