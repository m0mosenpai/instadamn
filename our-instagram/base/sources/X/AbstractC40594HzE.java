package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.HzE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40594HzE {
    public static final C19280xC A00(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, InterfaceC38411qV interfaceC38411qV, String str, int i, int i2) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, AbstractC111324zv.A00(224));
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC38411qV.getId());
        A00.A0C("m_pk", interfaceC38411qV.getId());
        A00.A0C("position", AbstractC154266wb.A01(i, i2));
        A00.A08(Integer.valueOf(interfaceC38411qV.BRp().A00), "media_type");
        A00.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC167007dF.A0d());
        List Bh4 = interfaceC38411qV.Bh4();
        if (Bh4 != null) {
            A00.A0D("product_ids", Bh4);
        }
        List BSa = interfaceC38411qV.BSa();
        if (BSa != null) {
            A00.A0D("merchant_ids", BSa);
        }
        if (str != null && str.length() != 0) {
            A00.A07(C5I8.A83, str);
        }
        A00.A04(c19260xA);
        return A00;
    }
}
