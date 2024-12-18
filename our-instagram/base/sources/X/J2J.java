package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J2J implements InterfaceC43457JHv {
    public final /* synthetic */ C41102IHt A00;
    public final /* synthetic */ C42521Is0 A01;
    public final /* synthetic */ InterfaceC75123Zc A02;

    public J2J(C41102IHt c41102IHt, C42521Is0 c42521Is0, InterfaceC75123Zc interfaceC75123Zc) {
        this.A00 = c41102IHt;
        this.A02 = interfaceC75123Zc;
        this.A01 = c42521Is0;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        Integer num;
        List list;
        C41102IHt c41102IHt = this.A00;
        InterfaceC60442pS interfaceC60442pS = c41102IHt.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        InterfaceC75123Zc interfaceC75123Zc = this.A02;
        C42521Is0 c42521Is0 = this.A01;
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        ArrayList arrayList = null;
        if (interfaceC75123Zc != null) {
            num = Integer.valueOf(interfaceC75123Zc.getPosition());
        } else {
            num = null;
        }
        c82713mZ.A0T(num);
        C38640Gyh c38640Gyh = c42521Is0.A00;
        String str = c38640Gyh.A06;
        c82713mZ.A3c = AbstractC37302Gc3.A0W(str);
        c82713mZ.A0d = EnumC130265uW.NOTES_IN_FEED_UNIT;
        C9C4 c9c4 = c38640Gyh.A00;
        if (c9c4 != null && (list = (List) c9c4.A01) != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C6C9) it.next()).A0H);
            }
        }
        c82713mZ.A7c = AbstractC166987dD.A1F(arrayList);
        c82713mZ.A14 = Boolean.valueOf(AbstractC37302Gc3.A0Q(c41102IHt.A00).A03(str));
        return new C82753md(c82713mZ);
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }
}
