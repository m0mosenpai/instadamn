package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DWe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30303DWe extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC132365yF A02;
    public final /* synthetic */ C44508JmE A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC60442pS A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30303DWe(InterfaceC132365yF interfaceC132365yF, C44508JmE c44508JmE, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, int i2) {
        super(2);
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A02 = interfaceC132365yF;
        this.A06 = str;
        this.A0A = interfaceC16820sZ;
        this.A09 = interfaceC16820sZ2;
        this.A07 = interfaceC16820sZ3;
        this.A08 = interfaceC16820sZ4;
        this.A03 = c44508JmE;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        UserSession userSession = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        AbstractC27576CEv.A00(A0S, this.A02, this.A03, userSession, interfaceC60442pS, this.A06, this.A0A, this.A09, this.A07, this.A08, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
