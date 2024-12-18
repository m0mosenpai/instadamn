package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Knd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46844Knd {
    public static String A00(C47791L8x c47791L8x) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        String str = c47791L8x.A00;
        if (str != null) {
            A0S.A0S("question", str);
        }
        List list = c47791L8x.A03;
        if (list != null) {
            C16V.A03(A0S, "options");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B != null) {
                    A0S.A0d();
                    A0S.A0S("text", A1B);
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        List<C51740MtP> list2 = c47791L8x.A02;
        if (list2 != null) {
            C16V.A03(A0S, "new_options");
            for (C51740MtP c51740MtP : list2) {
                if (c51740MtP != null) {
                    A0S.A0d();
                    A0S.A0T("is_voted", c51740MtP.A01);
                    AbstractC37301Gc2.A1E(A0S, c51740MtP.A00);
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        List<C47571Kzh> list3 = c47791L8x.A01;
        if (list3 != null) {
            C16V.A03(A0S, "existing_options");
            for (C47571Kzh c47571Kzh : list3) {
                if (c47571Kzh != null) {
                    A0S.A0d();
                    A0S.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c47571Kzh.A00);
                    A0S.A0T("is_voted", c47571Kzh.A01);
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
