package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ETe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32504ETe extends C1P1 {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC114765Gh A03;
    public final /* synthetic */ C62832tM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C32504ETe(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, UserSession userSession, EnumC114765Gh enumC114765Gh, C62832tM c62832tM, String str, String str2, boolean z) {
        this.A04 = c62832tM;
        this.A05 = str;
        this.A00 = c6fq;
        this.A02 = userSession;
        this.A06 = str2;
        this.A07 = z;
        this.A03 = enumC114765Gh;
        this.A01 = interfaceC103384lE;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-520900686);
        super.onFinish();
        AbstractC35195Ffn.A00.set(false);
        C0f9.A0A(-1977776747, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(422909366);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A032 = C0f9.A03(2007645257);
        C14360o3.A0B(c74293Vk, 0);
        List list = c74293Vk.A06;
        C14360o3.A07(list);
        C38321qM c38321qM = (C38321qM) AbstractC001800i.A0J(list);
        if (c38321qM == null) {
            i = -617900672;
        } else {
            C62832tM c62832tM = this.A04;
            String str = this.A05;
            List A1J = AbstractC166987dD.A1J(C128085qc.A02(c38321qM));
            C125905mf A00 = InterfaceC111084zP.A00.A00(false);
            A00.A00 = null;
            c62832tM.A03(A00.A00(), EnumC125615m7.A03, str, A1J, true, false);
            C6FQ c6fq = this.A00;
            C6BQ.A0K(c6fq, new C70729Wfv(c62832tM, c6fq, str, 1));
            UserSession userSession = this.A02;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A05, userSession);
            c116875Qr.A1D = this.A06;
            c116875Qr.A1C = userSession.userId;
            c116875Qr.A1G = str;
            c116875Qr.A1S = this.A07;
            EnumC114765Gh enumC114765Gh = this.A03;
            C14360o3.A0B(enumC114765Gh, 0);
            c116875Qr.A0O = enumC114765Gh;
            ClipsViewerConfig A002 = c116875Qr.A00();
            C6WF.A01 = new C36774GIx(c6fq, this.A01);
            C77453dV.A06(C6BQ.A04(c6fq), A002, userSession, 1005);
            i = 176355886;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(849379371, A03);
    }
}
