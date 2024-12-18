package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.android.billingclient.api.SkuDetails;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashMap;

/* renamed from: X.TcY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65043TcY extends C0YY implements InterfaceC16660sJ {
    public static final C65043TcY A00 = new C65043TcY();

    public C65043TcY() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        HashMap A11 = AbstractC31174DnI.A11(obj, 0);
        A11.put("productId", obj);
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "inapp");
        A11.put(DialogModule.KEY_TITLE, "mock title");
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mock title");
        A11.put("price", "$0.99");
        A11.put("price_amount_micros", "990000");
        return new SkuDetails(AbstractC31175DnJ.A0d(A11));
    }
}
