package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes8.dex */
public final class KYO extends C33H {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ C21C A01;

    public KYO(C25814BbV c25814BbV, C21C c21c) {
        this.A00 = c25814BbV;
        this.A01 = c21c;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        C25814BbV c25814BbV = this.A00;
        c25814BbV.A03 = false;
        InterfaceC19630xq interfaceC19630xq = this.A01.A00;
        AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, AbstractC111324zv.A00(4794), 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c25814BbV.A0C.A02), MSV.A00(194));
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "avatars_in_comments");
        A0f.Cht();
    }
}
