package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.user.model.User;

/* renamed from: X.Cva, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29279Cva implements GZ7 {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ String A01;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        Long l;
        C14360o3.A0B(c38321qM, 0);
        C25814BbV c25814BbV = this.A00;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2a, c25814BbV.A0E);
        c116875Qr.A1D = this.A01;
        ClipsViewerConfig A00 = c116875Qr.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c25814BbV.A0C.A01, AbstractC111324zv.A00(224));
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
            A0f.Cht();
            c25814BbV.A0N.Egh(new C9BK(A00, 6));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C29279Cva(C25814BbV c25814BbV, String str) {
        this.A00 = c25814BbV;
        this.A01 = str;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        C0w9.A03("CommentListViewModel", AnonymousClass001.A0R("Failed to fetch visual reply media: ", str));
    }
}
