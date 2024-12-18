package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OUT {
    public final UserSession A00;
    public final C28531Zo A01;
    public final C7YG A02;
    public final C23031Ai A03;
    public final C6Z4 A04;
    public final C54705OEh A05;
    public final C54478O5g A06;
    public final JV7 A07;
    public final Ny9 A08;
    public final OSW A09;

    public OUT(UserSession userSession, C28531Zo c28531Zo, C7YG c7yg, JV7 jv7, C23031Ai c23031Ai, C6Z4 c6z4, C54705OEh c54705OEh, Ny9 ny9, OSW osw, C54478O5g c54478O5g) {
        AbstractC167007dF.A1G(osw, 2, c7yg);
        C14360o3.A0B(c6z4, 7);
        AbstractC25229BEm.A1J(c23031Ai, 9, jv7);
        this.A00 = userSession;
        this.A09 = osw;
        this.A01 = c28531Zo;
        this.A06 = c54478O5g;
        this.A02 = c7yg;
        this.A08 = ny9;
        this.A04 = c6z4;
        this.A05 = c54705OEh;
        this.A03 = c23031Ai;
        this.A07 = jv7;
    }

    public static final void A00(DirectShareTarget directShareTarget, C41181vS c41181vS, OUT out, User user, String str, boolean z) {
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            String id = user.getId();
            String str2 = c41181vS.A0k;
            C14360o3.A07(str2);
            AbstractC167007dF.A1F(directShareTarget, 0, str);
            C45092JxM c45092JxM = new C45092JxM(c38321qM, directShareTarget, id, str2, str, "reel", z);
            Long BTC = user.BTC();
            if (BTC != null) {
                c45092JxM.A04 = BTC;
            }
            out.A01.A0D(out.A00, c45092JxM.A00(), "reel", "");
            return;
        }
        C0w9.A03("StoriesMessageComposerRepository", "Message failed to send. Potential cause: no valid recipient found in ReelItem or Reel object.");
    }
}
