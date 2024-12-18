package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.5Qu, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Qu extends AbstractC116895Qv {
    public Runnable A00;
    public final UserSession A01;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        Runnable runnable;
        C14360o3.A0B(c37818GkY, 0);
        if ((!C1LE.A03(this.A01) || c37818GkY.A0C) && (runnable = this.A00) != null) {
            runnable.run();
        }
    }

    public final String A00() {
        try {
            C57782kr A00 = C57782kr.A00(this.A01);
            ArrayList A0L = A00.A0L();
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = A0L.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                A0A.A0d();
                A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            this.A00 = new RunnableC37786Gk1(A00, new HashSet(A00.A03.keySet()), new HashSet(A00.A01.A02));
            String obj = stringWriter.toString();
            C14360o3.A07(obj);
            return obj;
        } catch (IOException unused) {
            return "[]";
        }
    }

    public C5Qu(UserSession userSession) {
        this.A01 = userSession;
    }
}
