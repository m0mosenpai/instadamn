package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.CTa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27941CTa {
    public final C18920wW A00;

    public C27941CTa(C18920wW c18920wW) {
        C14360o3.A0B(c18920wW, 1);
        this.A00 = c18920wW;
    }

    public final void A00(C38321qM c38321qM) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(450));
        User A14 = AbstractC25226BEj.A14(c38321qM);
        String str = null;
        if (A14 != null) {
            l = AbstractC25231BEo.A0k(A14);
        } else {
            l = null;
        }
        A0f.A9K("entity_id", l);
        User A142 = AbstractC25226BEj.A14(c38321qM);
        if (A142 != null) {
            str = A142.getUsername();
        }
        A0f.AAP("entity_name", str);
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM.getId());
        A0f.AAP("m_pk", c38321qM.getId());
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A0f.A9K("media_id", AbstractC166997dE.A0j(A2u));
            A0f.A8R(c38321qM.BRp().A00(), "media_type");
            A0f.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            AbstractC25234BEr.A11(A0f, AbstractC111324zv.A00(205), AbstractC82663mU.A00);
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
