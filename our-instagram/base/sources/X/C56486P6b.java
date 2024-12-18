package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* renamed from: X.P6b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56486P6b implements InterfaceC53852dP {
    public final int A00;
    public final Object A01;

    public C56486P6b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        C38709H2v c38709H2v;
        Integer num;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c47z, 0);
                ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A01;
                AbstractC166987dD.A1Z(new PZI(profileCardViewModel, c47z, null, 3), AbstractC141776au.A00(profileCardViewModel));
                profileCardViewModel.A0G.A01.A06.A0I(this);
                return;
            case 1:
                C14360o3.A0B(c47z, 0);
                if (c47z.A0D() == ShareType.A0d) {
                    C25671My A00 = AbstractC25651Mw.A00(((OCZ) this.A01).A00);
                    C38321qM c38321qM = c47z.A1C;
                    if (c47z.A1f != c47z.A6J) {
                        c38321qM = null;
                    }
                    A00.E4s(new C56015Otm(c38321qM, c47z.A3t));
                    return;
                }
                return;
            default:
                C14360o3.A0B(c47z, 0);
                N5T n5t = (N5T) this.A01;
                if (c47z.A1f == EnumC915447k.A02 && (c38709H2v = c47z.A0v) != null && (num = c38709H2v.A00) != null && num.intValue() > 0) {
                    AbstractC51174MjI abstractC51174MjI = n5t.A02;
                    if (abstractC51174MjI == null) {
                        C14360o3.A0F("clipsDraftsAdapter");
                        throw C00O.createAndThrow();
                    }
                    if ((abstractC51174MjI instanceof C53073Ndm) && C151866sW.A00.A09(AbstractC166987dD.A0r(n5t.A0I))) {
                        N5T.A03(n5t, null);
                        ((C44513JmJ) n5t.A0H.getValue()).A00();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC53852dP
    public final void DSR(C47Z c47z) {
        if (this.A00 == 0) {
            C14360o3.A0B(c47z, 0);
            AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
            AbstractC166987dD.A1Z(new C57169PZn(abstractC52922bZ, c47z, null, 18), AbstractC141776au.A00(abstractC52922bZ));
        }
    }
}
