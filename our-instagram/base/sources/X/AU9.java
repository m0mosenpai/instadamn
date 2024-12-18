package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AU9 implements InterfaceC58362lv {
    public final /* synthetic */ C185948Mo A00;

    public AU9(C185948Mo c185948Mo) {
        this.A00 = c185948Mo;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AbstractC223779uM abstractC223779uM = (AbstractC223779uM) obj;
        if (abstractC223779uM instanceof C218409lC) {
            C185948Mo c185948Mo = this.A00;
            C195868lW A04 = c185948Mo.A0k.A02.A01.A04();
            if (A04 != null) {
                List list = ((C218409lC) abstractC223779uM).A00;
                boolean isEmpty = list.isEmpty();
                if (isEmpty) {
                    C185948Mo.A0B(c185948Mo, 2131964710);
                }
                C47Z c47z = c185948Mo.A0D;
                if (c47z != null) {
                    c47z.A59 = !isEmpty;
                }
                c185948Mo.A0G = A04.A07();
                InterfaceC58362lv interfaceC58362lv = c185948Mo.A02;
                if (interfaceC58362lv != null) {
                    interfaceC58362lv.onChanged(list);
                    return;
                }
                return;
            }
            return;
        }
        if (!(abstractC223779uM instanceof C218419lD) && !(abstractC223779uM instanceof C218439lF)) {
            C185948Mo c185948Mo2 = this.A00;
            C185948Mo.A0B(c185948Mo2, 2131964709);
            c185948Mo2.A0H = null;
            return;
        }
        C185948Mo c185948Mo3 = this.A00;
        C195868lW A042 = c185948Mo3.A0k.A02.A01.A04();
        if (A042 == null) {
            return;
        }
        C185948Mo.A0B(c185948Mo3, 2131964710);
        C47Z c47z2 = c185948Mo3.A0D;
        if (c47z2 != null) {
            c47z2.A59 = false;
        }
        c185948Mo3.A0G = A042.A07();
        InterfaceC58362lv interfaceC58362lv2 = c185948Mo3.A02;
        if (interfaceC58362lv2 == null) {
            return;
        }
        interfaceC58362lv2.onChanged(AbstractC166987dD.A1E());
    }
}
