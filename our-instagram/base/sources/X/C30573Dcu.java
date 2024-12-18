package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dcu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30573Dcu extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ CSQ A00;
    public final /* synthetic */ C25987Beb A01;
    public final /* synthetic */ C69R A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30573Dcu(CSQ csq, C25987Beb c25987Beb, C69R c69r, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(3);
        this.A02 = c69r;
        this.A00 = csq;
        this.A01 = c25987Beb;
        this.A03 = str;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A08 = z;
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CSQ csq;
        Object obj4;
        Object c69p;
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
                C0fH.A01(-2032796029, "com.instagram.barcelona.feed.post.ui.PostCarousel.<anonymous>.<anonymous> (PostCarousel.kt:315)");
            }
            C69R c69r = this.A02;
            if (c69r instanceof C26158Bhj) {
                C5Hc c5Hc = ((C26158Bhj) c69r).A00;
                csq = this.A00;
                c69p = c5Hc.get(csq.A01);
            } else {
                boolean z = this.A01.A02;
                csq = this.A00;
                C9CM c9cm = (C9CM) csq.A02;
                if (z) {
                    obj4 = c9cm.A04;
                } else {
                    obj4 = c9cm.A05;
                }
                c69p = new C69P((ImageUrl) obj4);
            }
            C69P c69p2 = (C69P) c69p;
            String str = this.A03;
            c5Tl.Eno(1216569943);
            if (str == null) {
                str = C5YD.A00(c5Tl, 2131953718);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            AbstractC136656Gu.A00(c5Tl, null, interfaceC119655bO.Cng(c1130158n), null, C5YJ.A00, c69p2, str, this.A04, this.A05, this.A06, 0.0f, 12582912, 0, 1856, 0L);
            if (this.A08) {
                c5Tl.Eno(1216585134);
                InterfaceC16660sJ interfaceC16660sJ = this.A07;
                boolean A1W = AbstractC25230BEn.A1W(c5Tl, interfaceC16660sJ, csq);
                Object EEc = c5Tl.EEc();
                if (A1W || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A11(c5Tl, interfaceC16660sJ, csq, 8);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc, false);
                AbstractC27540CDk.A00(c5Tl, AbstractC118175Wb.A0B(interfaceC119655bO.AB5(C118195Wf.A08, c1130158n), 0.0f, 0.0f, 12.0f), EnumC27359C5o.A03, A1A, 48, 0);
            }
            if (C0fH.A02()) {
                C0fH.A00(1145474693);
            }
        }
        return C0eB.A00;
    }
}
