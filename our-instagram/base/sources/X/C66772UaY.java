package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.UaY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66772UaY extends C2JS implements C2JT {
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
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c95124Py, "did_report_as_spam"), new C4OK(C4OO.A00(), C66770UaW.class, "fb_mentioned_users", -2146526259), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C126895oT(new C4OK(C66771UaX.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1979225723), "exclude_caption_user_field"), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
    }

    public C66772UaY(int i) {
        super(i);
    }

    public C66772UaY() {
        super(567400688);
    }
}
