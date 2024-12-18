package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGU extends AbstractC61132qb {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public KGU(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        switch (this.A00) {
            case 0:
                C188958Yl c188958Yl = new C188958Yl((AbstractC018607g) this.A02, (C8SG) this.A03);
                c188958Yl.A03 = EnumC188968Ym.A02;
                c188958Yl.A0B = true;
                C189058Yv c189058Yv = new C189058Yv((Context) this.A01, null, null, new C189028Ys(c188958Yl));
                RunnableC49829Lza runnableC49829Lza = new RunnableC49829Lza(c189058Yv);
                if (c189058Yv.A04) {
                    runnableC49829Lza.run();
                } else {
                    c189058Yv.A02 = runnableC49829Lza;
                }
                return new C44470Jlc(c189058Yv, C0JE.A00(new MCH(c189058Yv, (InterfaceC23621Ds) null, 37, 42)));
            case 1:
                return new C44549Jmt((EnumC50631MWs) this.A02, (UserSession) this.A03, (C184108Ez) this.A01);
            default:
                return new C38321GtG((Context) this.A01, (AbstractC018607g) this.A02, (UserSession) this.A03);
        }
    }
}
