package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Uhj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67175Uhj extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(c94894Ou, "bit_flags");
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow2 = new C4OW(c94754Oe, TraceFieldType.ContentType);
        C67A c67a = C67A.A00;
        C4OW c4ow3 = new C4OW(c67a, "created_at");
        C4OW c4ow4 = new C4OW(c67a, "created_at_utc");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(C60047Qt7.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1971401024)});
    }

    public C67175Uhj(int i) {
        super(i);
    }

    public C67175Uhj() {
        super(-1301659741);
    }
}
