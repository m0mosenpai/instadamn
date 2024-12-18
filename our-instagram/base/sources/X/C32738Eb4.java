package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eb4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32738Eb4 extends G2R {
    public String A00;
    public final FFV A01;
    public final FP9 A02;
    public final C1P1 A03;
    public final UserSession A04;
    public final C1GL A05;
    public final String A06;

    @Override // X.G2R, X.InterfaceC37194Ga5
    public final void Cha() {
        String str = this.A06;
        if (str != null) {
            super.Cha();
            C1GL c1gl = this.A05;
            UserSession userSession = this.A04;
            String str2 = this.A00;
            int i = super.A00;
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("direct_v2/in_thread_message_search/");
            A0M.A9s("query", str2);
            A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            A0M.A0D("offset", i);
            C1ON A0e = AbstractC25227BEk.A0e(A0M, C32194ECp.class, C34788FUq.class);
            A0e.A00 = this.A03;
            c1gl.schedule(A0e);
            return;
        }
        super.A02 = C05F.A0C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32738Eb4(UserSession userSession, FFV ffv, FP9 fp9, String str, String str2) {
        super(ffv);
        AbstractC167017dG.A1P(userSession, str);
        this.A04 = userSession;
        this.A00 = str;
        this.A06 = str2;
        this.A01 = ffv;
        this.A02 = fp9;
        this.A05 = C1GJ.A01();
        this.A03 = EV0.A00(this, 8);
    }
}
