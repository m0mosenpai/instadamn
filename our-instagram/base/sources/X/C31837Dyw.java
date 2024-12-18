package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Dyw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31837Dyw extends AbstractC52922bZ {
    public static final InterfaceC52932ba A0D;
    public final UserSession A00;
    public final C34488FIa A01;
    public final C34489FIb A02;
    public final FKR A03;
    public final String A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final boolean A0B;
    public final DirectShareSheetAppearance A0C;

    public C31837Dyw(UserSession userSession, C34488FIa c34488FIa, C34489FIb c34489FIb, FKR fkr, DirectShareSheetAppearance directShareSheetAppearance, String str, String str2, boolean z, boolean z2) {
        C26084BgD c26084BgD;
        AbstractC167007dF.A1E(userSession, 1, str);
        AbstractC25233BEq.A0y(7, fkr, c34489FIb, c34488FIa);
        this.A00 = userSession;
        this.A0C = directShareSheetAppearance;
        this.A0B = z;
        this.A04 = str2;
        this.A03 = fkr;
        this.A02 = c34489FIb;
        this.A01 = c34488FIa;
        Integer num = C05F.A01;
        C008002u A1H = AbstractC25225BEi.A1H(new C32784Ebo(num));
        this.A07 = A1H;
        this.A0A = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(new C26084BgD(7, (Integer) null));
        this.A05 = A1H2;
        this.A08 = AbstractC208910l.A02(A1H2);
        C008002u A1H3 = AbstractC25225BEi.A1H(new E72(false, (List) null, false, 7, (DefaultConstructorMarker) null, 4));
        this.A06 = A1H3;
        this.A09 = AbstractC208910l.A02(A1H3);
        if (z) {
            A1H.Egh(new E97(num, str, directShareSheetAppearance != null && directShareSheetAppearance.A09, false));
            c26084BgD = new C26084BgD(6, num);
        } else {
            A1H.Egh(new E97(num, str, directShareSheetAppearance != null && directShareSheetAppearance.A09, z2));
            c26084BgD = new C26084BgD(6, C05F.A00);
        }
        A1H2.Egh(c26084BgD);
        GSR.A02(this, AbstractC141776au.A00(this), 19);
    }

    static {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AbstractC53647Nns.A00(A1I, GVU.A00, AbstractC25225BEi.A1D(C31837Dyw.class));
        A0D = AbstractC53648Nnt.A00(A1I.values());
    }
}
