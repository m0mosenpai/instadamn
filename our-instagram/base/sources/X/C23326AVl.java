package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AVl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23326AVl implements BE2 {
    public final C150486px A00;
    public final BBT A01;
    public final AnonymousClass818 A02;
    public final UserSession A03;
    public final boolean A04;

    public C23326AVl(C150486px c150486px, BBT bbt, AnonymousClass818 anonymousClass818, UserSession userSession, boolean z) {
        C14360o3.A0B(anonymousClass818, 1);
        this.A02 = anonymousClass818;
        this.A03 = userSession;
        this.A00 = c150486px;
        this.A01 = bbt;
        this.A04 = z;
    }

    @Override // X.BE2
    public final C23385AYj AL8(Context context, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, context, str);
        C178017va c178017va = new C178017va(str);
        C178017va.A00(c178017va, InterfaceC178107vj.A0M, A1R);
        List A00 = AbstractC224659vq.A00(this.A03);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            ((BCP) it.next()).Ehs(c178017va);
        }
        C23385AYj c23385AYj = new C23385AYj(context, new C178027vb(c178017va));
        Iterator it2 = A00.iterator();
        while (it2.hasNext()) {
            c23385AYj.A02((InterfaceC178287w2) ((BCP) it2.next()).ALQ(c23385AYj));
        }
        c23385AYj.A02((InterfaceC178287w2) new C178267w0(c23385AYj));
        c23385AYj.A01(new C180027ys(c23385AYj), InterfaceC179927yi.A00);
        c23385AYj.A01(new C179557y5(c23385AYj), InterfaceC179567y6.A00);
        C180147z4 A02 = AbstractC178227vw.A02(c23385AYj, InterfaceC178737wl.A00, A1R);
        boolean z = this.A04;
        if (!z) {
            A02.EfR(30);
        }
        C178087vh A002 = C175607ra.A00(c23385AYj, A02, InterfaceC178787wq.A00);
        c23385AYj.A01(new C211499Wy(c23385AYj), BEQ.A01);
        if (z) {
            c23385AYj.A01(new C179957yl(c23385AYj), InterfaceC179967ym.A00);
        }
        AnonymousClass818 anonymousClass818 = this.A02;
        AbstractC224569vh.A00(this.A00, c23385AYj, this.A01, new C1814883b(), anonymousClass818);
        if (!z) {
            c23385AYj.A01(new C9X1(c23385AYj), InterfaceC180067yw.A04);
        }
        AbstractC178807ws.A03(c23385AYj, A002, anonymousClass818, A1R ? 1 : 0);
        return c23385AYj;
    }
}
