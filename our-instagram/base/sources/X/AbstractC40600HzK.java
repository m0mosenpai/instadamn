package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.HzK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40600HzK {
    public static final void A00(AbstractC23721Ec abstractC23721Ec, InterfaceC65262xO interfaceC65262xO) {
        Number number;
        Integer num;
        StringWriter A0O = AbstractC37300Gc1.A0O();
        try {
            C17z A0S = AbstractC167007dF.A0S(A0O);
            A0S.A0Q("total_num_items", interfaceC65262xO.B5m());
            Pair BLk = interfaceC65262xO.BLk();
            InterfaceC38381qS interfaceC38381qS = null;
            if (BLk != null) {
                interfaceC38381qS = (InterfaceC38381qS) BLk.first;
                number = (Number) BLk.second;
            } else {
                number = null;
            }
            if (interfaceC38381qS != null && number != null) {
                A0S.A0r("last_non_organic_item");
                A0S.A0d();
                A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC38381qS.getId());
                if (interfaceC38381qS instanceof C38321qM) {
                    if (((C38321qM) interfaceC38381qS).CdW()) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A01;
                    }
                } else if (interfaceC38381qS instanceof InterfaceC73233Pz) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A00;
                }
                A0S.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num.intValue());
                A0S.A0Q("index", number.intValue());
                A0S.A0a();
            }
            Pair BLp = interfaceC65262xO.BLp();
            if (BLp != null) {
                C38321qM c38321qM = (C38321qM) BLp.first;
                Number number2 = (Number) BLp.second;
                if (c38321qM != null && number2 != null) {
                    A0S.A0r("last_organic_item");
                    A0S.A0d();
                    A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM.getId());
                    A0S.A0Q("index", number2.intValue());
                    A0S.A0a();
                }
            }
            A0S.A0a();
            A0S.close();
            abstractC23721Ec.A9s("paging_token", A0O.toString());
        } catch (IOException unused) {
            android.util.Log.e("DiscoveryChainingApiUtil", AbstractC111324zv.A00(1612));
        }
    }
}
