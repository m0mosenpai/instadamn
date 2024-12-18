package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* loaded from: classes6.dex */
public final class G6I implements InterfaceC37118GXd {
    public Reel A00;
    public final /* synthetic */ C7TL A01;
    public final /* synthetic */ C32068E6u A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public G6I(C7TL c7tl, C32068E6u c32068E6u, C38321qM c38321qM, String str, String str2) {
        this.A01 = c7tl;
        this.A04 = str;
        this.A02 = c32068E6u;
        this.A05 = str2;
        this.A03 = c38321qM;
        this.A00 = c7tl.A03.A0M(str);
    }

    @Override // X.InterfaceC37118GXd
    public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        boolean z;
        ReelType reelType;
        UserSession userSession = this.A01.A00;
        C32068E6u c32068E6u = this.A02;
        boolean z2 = c32068E6u.A02;
        boolean z3 = c32068E6u.A03;
        Reel reel = this.A00;
        if (reel != null && (reel.A0b() || reel.A0P == ReelType.A05 || reel.A0k())) {
            z = true;
        } else {
            z = false;
        }
        String str = c32068E6u.A01;
        C14360o3.A0B(userSession, 0);
        JTa jTa = new JTa(l1w, null, AbstractC68470VSb.A00(), str, null, "", C31276Doy.A00(userSession, C31276Doy.A01, C29971cC.class), z2, z3, z, false);
        String str2 = this.A04;
        String str3 = this.A05;
        C38321qM c38321qM = this.A03;
        long A05 = AbstractC31177DnL.A05();
        if (reel != null) {
            reelType = reel.A0P;
        } else {
            reelType = null;
        }
        return new C29971cC(jTa, c38321qM, directThreadKey, reelType, l, str2, str3, A05, false);
    }
}
