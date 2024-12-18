package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.MhA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51056MhA extends AbstractC52922bZ implements InterfaceC62602sz, InterfaceC62612t0 {
    public final NST A00;
    public final String A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;
    public final UserSession A05;
    public final C52128N5b A06;
    public final C05A A07;

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return false;
    }

    public final void A00() {
        String str;
        NST nst = this.A00;
        String str2 = this.A01;
        EnumC68206VFy enumC68206VFy = (EnumC68206VFy) this.A02.getValue();
        C14360o3.A0B(enumC68206VFy, 1);
        JWd jWd = (JWd) ((Map) nst.A01.getValue()).get(enumC68206VFy);
        if (jWd != null && !AbstractC31176DnK.A1b(nst.A03) && jWd.A02 && ((List) jWd.A00).size() < 150) {
            int ordinal = enumC68206VFy.ordinal();
            if (ordinal != 1) {
                if (ordinal == 3) {
                    str = "RECENT";
                } else {
                    throw AbstractC37303Gc4.A0M(enumC68206VFy, "Unsupported tab type: ", AbstractC166987dD.A1C());
                }
            } else {
                str = "TOP";
            }
            AbstractC166987dD.A1Z(new JZ1(enumC68206VFy, jWd, nst, str2, str, null, 15), ((C4A7) nst).A01);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        String str;
        C52128N5b c52128N5b = this.A06;
        Nj6 nj6 = c52128N5b.A00;
        if (nj6 == null) {
            str = "entrySurface";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(c52128N5b.A08);
            C38321qM c38321qM = c52128N5b.A02;
            if (c38321qM == null) {
                str = "entryMedia";
            } else {
                C14360o3.A0B(A0r, 1);
                AbstractC54298NzI.A00(nj6, c52128N5b, A0r, c38321qM, C05F.A0j, null, AbstractC166987dD.A1I());
                A00();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return MSX.A1X(this.A03.getValue());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        JWd jWd = (JWd) ((Map) this.A00.A04.getValue()).get(this.A02.getValue());
        if (jWd != null && jWd.A02) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC31176DnK.A1b(this.A07);
    }

    public C51056MhA(UserSession userSession, C52128N5b c52128N5b, String str) {
        AbstractC167027dH.A13(userSession, str, c52128N5b);
        this.A05 = userSession;
        this.A01 = str;
        this.A06 = c52128N5b;
        NST nst = new NST(userSession);
        this.A00 = nst;
        this.A04 = nst.A05;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC68206VFy.A08);
        this.A02 = A1H;
        this.A07 = nst.A03;
        C15150pV A16 = AbstractC43593JPy.A16(nst.A04, A1H, 47);
        this.A03 = AbstractC208910l.A01(C16930sl.A00, AbstractC141776au.A00(this), A16, C10I.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return CLJ();
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00();
    }
}
