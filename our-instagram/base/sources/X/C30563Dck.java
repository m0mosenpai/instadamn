package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dck, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30563Dck extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ CSQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ C5Hc A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30563Dck(CSQ csq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc) {
        super(3);
        this.A00 = csq;
        this.A01 = str;
        this.A05 = interfaceC16660sJ;
        this.A06 = c5Hc;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16820sZ interfaceC16820sZ;
        InterfaceC119655bO interfaceC119655bO = (InterfaceC119655bO) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(interfaceC119655bO, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1631784372, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:409)");
            }
            CSQ csq = this.A00;
            C136896Hs c136896Hs = (C136896Hs) csq.A02;
            C69P c69p = new C69P(c136896Hs.A00);
            String str = c136896Hs.A02;
            String str2 = this.A01;
            c5Tl.Eno(1216677367);
            if (str2 == null) {
                str2 = C5YD.A00(c5Tl, 2131953718);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier Cng = interfaceC119655bO.Cng(Modifier.A00);
            c5Tl.Eno(1216689606);
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            if (interfaceC16660sJ != null) {
                boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, interfaceC16660sJ, csq, 1216691250);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A11(c5Tl, interfaceC16660sJ, csq, 10);
                }
                interfaceC16820sZ = AbstractC25225BEi.A1A(A0K, EEc, false);
            } else {
                interfaceC16820sZ = null;
            }
            C117505Tk.A0L(A0K, false);
            AbstractC27557CEc.A00(c5Tl, Cng, c69p, str, str2, this.A02, this.A03, this.A04, interfaceC16820sZ, 0, 0, C14360o3.A0K(c136896Hs.A01, ((InterfaceC132185xw) AbstractC001800i.A0I(this.A06)).getId()));
            if (C0fH.A02()) {
                C0fH.A00(1862517116);
            }
        }
        return C0eB.A00;
    }
}
