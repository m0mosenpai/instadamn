package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ETb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32501ETb extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C32501ETb(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj4;
        this.A05 = str;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A06 = str2;
        this.A07 = z;
        this.A03 = obj;
    }

    @Override // X.C1P1
    public final void onFinish() {
        if (this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(2079162782);
        super.onFinish();
        AbstractC35195Ffn.A00.set(false);
        C0f9.A0A(-689893571, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        int i2;
        int i3;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1091916056);
            C74293Vk c74293Vk = (C74293Vk) obj;
            int A032 = C0f9.A03(44800004);
            C14360o3.A0B(c74293Vk, 0);
            List list = c74293Vk.A06;
            C14360o3.A07(list);
            C38321qM c38321qM = (C38321qM) AbstractC001800i.A0J(list);
            if (c38321qM == null) {
                i3 = -2044232999;
            } else {
                C62832tM c62832tM = (C62832tM) this.A01;
                String str = this.A05;
                c62832tM.A03(new C111074zO(null, true), EnumC125615m7.A03, str, AbstractC166987dD.A1J(C128085qc.A02(c38321qM)), true, false);
                C6FQ c6fq = (C6FQ) this.A02;
                C6BQ.A0K(c6fq, new C70729Wfv(c62832tM, c6fq, str, 3));
                UserSession userSession = (UserSession) this.A04;
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A03, userSession);
                c116875Qr.A1D = this.A06;
                c116875Qr.A1C = userSession.userId;
                c116875Qr.A1G = str;
                c116875Qr.A1d = false;
                boolean z = this.A07;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A03;
                if (z) {
                    AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
                } else {
                    AbstractC31173DnH.A1J(fragmentActivity, c116875Qr, userSession);
                }
                i3 = 1463291692;
            }
            C0f9.A0A(i3, A032);
            i2 = -1734844274;
        } else {
            A03 = C0f9.A03(-1808293379);
            C74293Vk c74293Vk2 = (C74293Vk) obj;
            int A033 = C0f9.A03(-1627352872);
            C14360o3.A0B(c74293Vk2, 0);
            List list2 = c74293Vk2.A06;
            C14360o3.A07(list2);
            C38321qM c38321qM2 = (C38321qM) AbstractC001800i.A0J(list2);
            if (c38321qM2 == null) {
                i = -1812207144;
            } else {
                C62832tM c62832tM2 = (C62832tM) this.A01;
                String str2 = this.A05;
                List A1J = AbstractC166987dD.A1J(C128085qc.A02(c38321qM2));
                C125905mf A00 = InterfaceC111084zP.A00.A00(false);
                A00.A00 = null;
                c62832tM2.A03(A00.A00(), EnumC125615m7.A03, str2, A1J, true, false);
                C6FQ c6fq2 = (C6FQ) this.A02;
                C6BQ.A0K(c6fq2, new C70729Wfv(c62832tM2, c6fq2, str2, 2));
                UserSession userSession2 = (UserSession) this.A04;
                C116875Qr c116875Qr2 = new C116875Qr(ClipsViewerSource.A24, userSession2);
                c116875Qr2.A1D = this.A06;
                c116875Qr2.A1C = userSession2.userId;
                c116875Qr2.A1G = str2;
                c116875Qr2.A1S = this.A07;
                c116875Qr2.A1e = true;
                ClipsViewerConfig A002 = c116875Qr2.A00();
                C6WE.A00 = new GJ2(c6fq2, (InterfaceC103384lE) this.A03);
                C77453dV.A06(C6BQ.A04(c6fq2), A002, userSession2, 1001);
                i = 1329209404;
            }
            C0f9.A0A(i, A033);
            i2 = 1948220972;
        }
        C0f9.A0A(i2, A03);
    }
}
