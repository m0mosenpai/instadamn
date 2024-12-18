package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101474h9 {
    public static final String A00(List list) {
        String id;
        int i;
        C38321qM A02;
        JMJ BVD;
        C38321qM c38321qM;
        String str = null;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3XG c3xg = (C3XG) it.next();
                Integer num = c3xg.A08;
                InterfaceC38381qS interfaceC38381qS = c3xg.A05;
                C38321qM A022 = C3XH.A02(interfaceC38381qS);
                if (A022 != null) {
                    A022.A0C.EhL(true);
                }
                A0A.A0d();
                int ordinal = c3xg.A06.ordinal();
                if (ordinal != 41) {
                    if (ordinal == 43) {
                        C38321qM A023 = C3XH.A02(interfaceC38381qS);
                        if (A023 != null && (c38321qM = (C38321qM) AbstractC001800i.A0J(A023.A1E())) != null) {
                            id = c38321qM.getId();
                        }
                        id = null;
                    } else {
                        id = c3xg.A09;
                    }
                } else {
                    IL5 il5 = (IL5) AbstractC001800i.A0J(c3xg.A01().A0B);
                    if (il5 != null) {
                        id = il5.A00().getId();
                    }
                    id = null;
                }
                A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, id);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                A0A.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                if (ordinal != 41) {
                    if (ordinal == 43 && (A02 = C3XH.A02(interfaceC38381qS)) != null && (BVD = A02.A0C.BVD()) != null) {
                        A0A.A0Q("multi_ads_type", BVD.BVI());
                    }
                } else {
                    A0A.A0Q("multi_ads_type", c3xg.A01().A00);
                }
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            str = stringWriter.toString();
            return str;
        } catch (IOException e) {
            C0K8.A0F("ViewStateUtil", AbstractC111324zv.A00(3611), e);
            return str;
        }
    }
}
