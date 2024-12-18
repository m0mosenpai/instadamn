package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes6.dex */
public abstract class FD2 {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str) {
        double A00 = AbstractC31177DnL.A00(abstractC12990ll);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "look_up_with_google_id_tokens");
        AbstractC31179DnN.A18(A0f, A00, A002);
        AbstractC31171DnF.A1A(A0f, "user_lookup");
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC35274Fh9.A04(A0f);
        AbstractC35274Fh9.A09(A0f, abstractC12990ll);
        AbstractC31172DnG.A1O(A0f);
        A0f.Cht();
    }
}
