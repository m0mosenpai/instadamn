package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEU extends C2US {
    public final List A00;
    public final HF3 A01;
    public final InterfaceC43455JHt A02;
    public final C152996uT A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HEU(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC43455JHt interfaceC43455JHt, ILC ilc) {
        super(false);
        C14360o3.A0B(ilc, 3);
        HF3 hf3 = new HF3(interfaceC11380iw, ilc);
        this.A01 = hf3;
        C152996uT c152996uT = new C152996uT(context);
        this.A03 = c152996uT;
        this.A02 = interfaceC43455JHt;
        this.A00 = AbstractC166987dD.A1E();
        interfaceC43455JHt.EgQ();
        init(hf3, c152996uT);
    }

    public final void A00() {
        clear();
        List list = this.A00;
        if (list.isEmpty()) {
            InterfaceC43455JHt interfaceC43455JHt = this.A02;
            addModel(interfaceC43455JHt.Afz(), interfaceC43455JHt.B1M(), this.A03);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addModel(it.next(), this.A01);
            }
        }
        notifyDataSetChanged();
    }
}
