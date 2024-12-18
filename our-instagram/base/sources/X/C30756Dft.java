package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dft, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30756Dft extends C0YY implements InterfaceC16590sC {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC132365yF A02;
    public final /* synthetic */ C73454YDx A03;
    public final /* synthetic */ C73452YDv A04;
    public final /* synthetic */ C45079Jx9 A05;
    public final /* synthetic */ C44508JmE A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ InterfaceC60442pS A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30756Dft(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC132365yF interfaceC132365yF, C73454YDx c73454YDx, C73452YDv c73452YDv, C45079Jx9 c45079Jx9, C44508JmE c44508JmE, UserSession userSession, InterfaceC60442pS interfaceC60442pS, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2) {
        super(5);
        this.A03 = c73454YDx;
        this.A09 = list;
        this.A07 = userSession;
        this.A0B = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A05 = c45079Jx9;
        this.A04 = c73452YDv;
        this.A08 = interfaceC60442pS;
        this.A02 = interfaceC132365yF;
        this.A0C = z;
        this.A0D = z2;
        this.A06 = c44508JmE;
        this.A01 = interfaceC74953Yl;
        this.A00 = interfaceC74953Yl2;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj2);
        InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) obj3;
        C5Tl c5Tl = (C5Tl) obj4;
        int A0H2 = AbstractC166987dD.A0H(obj5);
        AbstractC167007dF.A1D(obj, 0, interfaceC132245y2);
        if ((A0H2 & 112) == 0) {
            i = AbstractC25232BEp.A09(c5Tl, A0H) | A0H2;
        } else {
            i = A0H2;
        }
        if ((A0H2 & 896) == 0) {
            i |= AbstractC25232BEp.A0T(c5Tl, interfaceC132245y2);
        }
        if ((i & 5841) == 1168 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(723188019, "com.instagram.barcelona.permalink.ui.component.PermalinkContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PermalinkContent.kt:275)");
            }
            String str = interfaceC132245y2.Bet().A03;
            List list = this.A09;
            UserSession userSession = this.A07;
            InterfaceC16820sZ interfaceC16820sZ = this.A0B;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0A;
            C45079Jx9 c45079Jx9 = this.A05;
            C73452YDv c73452YDv = this.A04;
            C73454YDx c73454YDx = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A08;
            InterfaceC132365yF interfaceC132365yF = this.A02;
            boolean z = this.A0C;
            boolean z2 = this.A0D;
            if (AbstractC25233BEq.A1Y(c5Tl, new DYF(this.A01, this.A00, interfaceC132245y2, interfaceC132365yF, c73454YDx, c73452YDv, c45079Jx9, this.A06, userSession, interfaceC60442pS, str, list, interfaceC16820sZ, interfaceC16820sZ2, A0H, z, z2), new C117685Ud[0], 225322685)) {
                C0fH.A00(-1302899234);
            }
        }
        return C0eB.A00;
    }
}
