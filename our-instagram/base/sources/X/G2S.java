package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G2S implements InterfaceC37194Ga5 {
    public C32738Eb4 A00;
    public Integer A01;
    public String A02;
    public final FFV A03;
    public final C32739Eb5 A04;
    public final UserSession A05;
    public final FP9 A06;
    public final List A07;

    public G2S(UserSession userSession, FFV ffv, String str, String str2, String str3, String str4, List list) {
        AbstractC167027dH.A13(userSession, str, str2);
        C14360o3.A0B(str4, 5);
        this.A05 = userSession;
        this.A02 = str;
        this.A07 = list;
        this.A03 = ffv;
        this.A01 = C05F.A01;
        FP9 fp9 = new FP9(this);
        this.A06 = fp9;
        this.A04 = new C32739Eb5(userSession, null, fp9, str, str2, str4, list);
        this.A00 = new C32738Eb4(userSession, null, fp9, this.A02, str3);
    }

    @Override // X.InterfaceC37194Ga5
    public final void EJs(String str) {
        this.A02 = str;
        C14360o3.A0B(C05F.A00, 0);
    }

    @Override // X.InterfaceC37194Ga5
    public final Integer C04() {
        G2R g2r;
        if (this.A01 == C05F.A01) {
            g2r = this.A04;
        } else {
            g2r = this.A00;
        }
        return g2r.A02;
    }

    @Override // X.InterfaceC37194Ga5
    public final void Cha() {
        InterfaceC37194Ga5 interfaceC37194Ga5;
        Integer num = C05F.A01;
        C14360o3.A0B(num, 0);
        Integer num2 = this.A01;
        if (num2 == num) {
            interfaceC37194Ga5 = this.A04;
        } else if (num2 != C05F.A00) {
            return;
        } else {
            interfaceC37194Ga5 = this.A00;
        }
        interfaceC37194Ga5.Cha();
    }

    @Override // X.InterfaceC37194Ga5
    public final void onDestroy() {
        this.A00.onDestroy();
    }
}
