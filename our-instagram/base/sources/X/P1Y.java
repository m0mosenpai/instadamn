package X;

import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* loaded from: classes9.dex */
public final class P1Y implements InterfaceC57943Pmn {
    public final /* synthetic */ C52136N5l A00;

    public P1Y(C52136N5l c52136N5l) {
        this.A00 = c52136N5l;
    }

    @Override // X.InterfaceC57943Pmn
    public final void Dav() {
        C52136N5l c52136N5l = this.A00;
        CallerContext callerContext = C52136N5l.A0E;
        C36731GHa c36731GHa = c52136N5l.A04;
        if (c36731GHa != null) {
            c36731GHa.A0F = false;
            InterfaceC09390do interfaceC09390do = c52136N5l.A0C;
            if (C196218mC.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
                C36731GHa c36731GHa2 = c52136N5l.A04;
                C14360o3.A0A(c36731GHa2);
                c36731GHa2.A0D = true;
            }
            c52136N5l.A06 = true;
            C36731GHa c36731GHa3 = c52136N5l.A04;
            C14360o3.A0A(c36731GHa3);
            c36731GHa3.A06 = null;
            C35246Fgf c35246Fgf = c52136N5l.A05;
            if (c35246Fgf != null) {
                List list = c52136N5l.A0B;
                C52781NXp c52781NXp = c52136N5l.A00;
                if (c52781NXp != null) {
                    int position = c52781NXp.getPosition(c35246Fgf);
                    C131975xX c131975xX = C131965xW.A05;
                    C35246Fgf c35246Fgf2 = new C35246Fgf(MSZ.A0a(interfaceC09390do).A02(c52136N5l.requireContext(), c52136N5l.requireActivity()));
                    c35246Fgf2.A01 = R.style.igds_body_1;
                    list.set(position, c35246Fgf2);
                    C52781NXp c52781NXp2 = c52136N5l.A00;
                    if (c52781NXp2 != null) {
                        c52781NXp2.setItems(list);
                        return;
                    }
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
