package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ME9 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7OH A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ C15370ps A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ME9(UserSession userSession, C7OH c7oh, Map map, InterfaceC16820sZ interfaceC16820sZ, C15370ps c15370ps, long j) {
        super(0);
        this.A05 = c15370ps;
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = c7oh;
        this.A04 = interfaceC16820sZ;
        this.A03 = map;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C15370ps c15370ps = this.A05;
        ((List) c15370ps.A00).size();
        UserSession userSession = this.A01;
        long j = this.A00;
        Iterable iterable = (Iterable) c15370ps.A00;
        ArrayList A0i = AbstractC167007dF.A0i(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0i.add(AbstractC43592JPx.A17(it).A00);
        }
        Iterable iterable2 = (Iterable) c15370ps.A00;
        ArrayList A0i2 = AbstractC167007dF.A0i(iterable2);
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            A0i2.add(AbstractC43592JPx.A17(it2).A01);
        }
        C7OH c7oh = this.A02;
        String A0j = AbstractC167017dG.A0j();
        String str = c7oh.A00.A00;
        if (str != null) {
            AnonymousClass777 anonymousClass777 = new AnonymousClass777(new C45548KEn(userSession, c7oh, A0j, A0i, j), DirectThreadApi.A0D(userSession, str, A0j, A0i, A0i2));
            anonymousClass777.A00(new C31456Ds0(21, this.A03, this.A04));
            C1GJ.A04(anonymousClass777, 1150850966);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
