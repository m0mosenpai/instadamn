package X;

import java.util.Iterator;

/* loaded from: classes8.dex */
public final class JWG implements InterfaceC118965aD {
    public final int A00;
    public final Object A01;

    public JWG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        switch (this.A00) {
            case 0:
                Iterator it = ((C00H) this.A01).A02.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass003) it.next()).cancel();
                }
                return;
            case 1:
                ((C6MH) this.A01).A00 = null;
                return;
            case 2:
                AnonymousClass693 anonymousClass693 = (AnonymousClass693) this.A01;
                if (anonymousClass693 == null) {
                    return;
                }
                anonymousClass693.stop();
                return;
            case 3:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 4:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                C14360o3.A0B(abstractC12990ll, 0);
                abstractC12990ll.A01(C46634KkB.class, MEq.A00);
                return;
            case 5:
                C136936Hw c136936Hw = (C136936Hw) this.A01;
                C6G3 c6g3 = c136936Hw.A04;
                String str = c136936Hw.A05;
                c6g3.A0B.remove(str);
                if (!C14360o3.A0K(c6g3.A07.getValue(), str)) {
                    return;
                }
                InterfaceC74953Yl interfaceC74953Yl = c6g3.A06;
                interfaceC74953Yl.Egh(Integer.valueOf(AbstractC25231BEo.A0E(interfaceC74953Yl) + 1));
                return;
            case 6:
                C47686L3t c47686L3t = (C47686L3t) this.A01;
                c47686L3t.A04.AGH(null);
                c47686L3t.A03.AGH(null);
                c47686L3t.A05.AGH(null);
                return;
            default:
                return;
        }
    }
}
