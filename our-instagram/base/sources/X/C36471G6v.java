package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.G6v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36471G6v implements GZ5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C36471G6v(C31664DvU c31664DvU, Map map, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = interfaceC16820sZ;
            this.A03 = c31664DvU;
            this.A02 = map;
        } else {
            this.A03 = c31664DvU;
            this.A02 = map;
            this.A01 = interfaceC16820sZ;
        }
    }

    @Override // X.GZ5
    public final void D1p() {
        if (1 - this.A00 != 0) {
        } else {
            throw C00O.createAndThrow();
        }
    }

    @Override // X.GZ5
    public final void DWw(C32071E6x c32071E6x) {
        switch (this.A00) {
            case 0:
                C31664DvU c31664DvU = (C31664DvU) this.A03;
                Map map = (Map) this.A02;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                AbstractC167007dF.A1D(map, 0, interfaceC16820sZ);
                Context context = c31664DvU.A00;
                UserSession userSession = c31664DvU.A02;
                java.util.Set keySet = map.keySet();
                ArrayList A0q = AbstractC167017dG.A0q(keySet);
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    String str = AbstractC31180DnO.A0Q(it).A00;
                    if (str == null) {
                        str = "";
                    }
                    A0q.add(str);
                }
                C35250Fgj.A00(context, c32071E6x, c31664DvU.A01, userSession, new C32901Edi(c31664DvU, map, interfaceC16820sZ), A0q, C16930sl.A00, false, false);
                return;
            case 1:
                AbstractC166987dD.A1Y(this.A01);
                ((C31664DvU) this.A03).A03.Cpw(c32071E6x, (Map) this.A02);
                return;
            default:
                ((C31603DuV) this.A03).A03(c32071E6x, (InterfaceC37158GYv) this.A01, (C2EC) this.A02);
                return;
        }
    }

    public C36471G6v(C31603DuV c31603DuV, InterfaceC37158GYv interfaceC37158GYv, C2EC c2ec, int i) {
        this.A00 = i;
        this.A03 = c31603DuV;
        this.A02 = c2ec;
        this.A01 = interfaceC37158GYv;
    }
}
