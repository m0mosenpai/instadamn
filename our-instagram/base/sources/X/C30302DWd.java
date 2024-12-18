package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DWd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30302DWd extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30302DWd(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i) {
        super(2);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = str;
        this.A09 = interfaceC16660sJ;
        this.A07 = interfaceC16820sZ;
        this.A0A = interfaceC16660sJ2;
        this.A06 = interfaceC16820sZ2;
        this.A08 = interfaceC16660sJ3;
        this.A04 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String str = this.A03;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A0A;
        AbstractC27574CEt.A00(A0S, userSession, interfaceC60442pS, str, interfaceC16820sZ, this.A06, this.A04, this.A05, interfaceC16660sJ, interfaceC16660sJ2, this.A08, AbstractC25225BEi.A04(this.A00));
        return C0eB.A00;
    }
}
