package X;

import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AiJ implements InterfaceC58147PqC {
    public final /* synthetic */ AAZ A00;

    @Override // X.InterfaceC58147PqC
    public final /* synthetic */ void DfF() {
    }

    @Override // X.InterfaceC58147PqC
    public final /* synthetic */ void DfK() {
    }

    @Override // X.InterfaceC58147PqC
    public final /* synthetic */ void DiC(Map map) {
    }

    public AiJ(AAZ aaz) {
        this.A00 = aaz;
    }

    @Override // X.InterfaceC58147PqC
    public final void DfI(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54791OJj c54791OJj = (C54791OJj) it.next();
            boolean A1X = AbstractC167007dF.A1X(c54791OJj.A07, C05F.A00);
            if (c54791OJj.A03.A02 == EnumC53116NeT.A03) {
                C216039hJ c216039hJ = this.A00.A02.A00;
                if (A1X) {
                    UserSession userSession = c216039hJ.A01;
                    AbstractC167027dH.A0z(userSession);
                    Point point = c54791OJj.A01;
                    point.getClass();
                    A8F a8f = new A8F(c54791OJj, point.x, point.y);
                    C25A.A00(userSession).A0B(c216039hJ.A00.getApplicationContext());
                    InterfaceC25180BCd interfaceC25180BCd = c216039hJ.A04;
                    if (interfaceC25180BCd != null) {
                        interfaceC25180BCd.DxQ(a8f);
                    }
                } else {
                    String obj = c54791OJj.toString();
                    AbstractC12120kG.A0G("Stories camera upload fail", obj, c54791OJj.A06);
                    AbstractC166987dD.A0t(c216039hJ.A01).A0A(obj);
                    InterfaceC25180BCd interfaceC25180BCd2 = c216039hJ.A04;
                    if (interfaceC25180BCd2 != null) {
                        interfaceC25180BCd2.DxP();
                    }
                }
            }
        }
    }
}
