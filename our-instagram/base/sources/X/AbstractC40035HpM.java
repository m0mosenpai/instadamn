package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40035HpM {
    public static Map A00(InterfaceC43558JLs interfaceC43558JLs) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43558JLs.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, interfaceC43558JLs.BEi());
        }
        String str2 = null;
        if (interfaceC43558JLs.BlM() != null) {
            InterestPivotRedirect BlM = interfaceC43558JLs.BlM();
            if (BlM != null) {
                str = BlM.A00;
            } else {
                str = null;
            }
            A1I.put("redirect", str);
        }
        if (interfaceC43558JLs.Bqp() != null) {
            A1I.put(AbstractC111324zv.A00(1250), interfaceC43558JLs.Bqp());
        }
        if (interfaceC43558JLs.C34() != null) {
            InterestPivotStyle C34 = interfaceC43558JLs.C34();
            if (C34 != null) {
                str2 = C34.A00;
            }
            A1I.put("style", str2);
        }
        if (interfaceC43558JLs.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43558JLs.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
