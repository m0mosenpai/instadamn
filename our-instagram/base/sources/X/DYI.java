package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DYI extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ C5yI A04;
    public final /* synthetic */ InterfaceC132365yF A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ InterfaceC16660sJ A0D;
    public final /* synthetic */ InterfaceC16660sJ A0E;
    public final /* synthetic */ InterfaceC16620sF A0F;
    public final /* synthetic */ C5Hc A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DYI(FragmentActivity fragmentActivity, C5yI c5yI, InterfaceC132365yF interfaceC132365yF, UserSession userSession, String str, String str2, String str3, String str4, String str5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i, int i2, int i3) {
        super(2);
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A08 = str;
        this.A0B = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A0G = c5Hc;
        this.A02 = i;
        this.A05 = interfaceC132365yF;
        this.A04 = c5yI;
        this.A0E = interfaceC16660sJ;
        this.A0F = interfaceC16620sF;
        this.A0C = interfaceC16820sZ;
        this.A0D = interfaceC16660sJ2;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        UserSession userSession = this.A06;
        FragmentActivity fragmentActivity = this.A03;
        String str = this.A08;
        String str2 = this.A0B;
        String str3 = this.A07;
        String str4 = this.A09;
        String str5 = this.A0A;
        C5Hc c5Hc = this.A0G;
        int i = this.A02;
        InterfaceC132365yF interfaceC132365yF = this.A05;
        AbstractC25641BVd.A00(A0S, fragmentActivity, this.A04, interfaceC132365yF, userSession, str, str2, str3, str4, str5, this.A0C, this.A0E, this.A0D, this.A0F, c5Hc, i, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01));
        return C0eB.A00;
    }
}
