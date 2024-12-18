package X;

import android.content.Context;

/* renamed from: X.TVo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64824TVo implements InterfaceC08830cm {
    public final InterfaceC08830cm A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = (Context) this.A02.get();
        InterfaceC65676Tr6 interfaceC65676Tr6 = (InterfaceC65676Tr6) this.A03.get();
        AbstractC61583Rq7 abstractC61583Rq7 = (AbstractC61583Rq7) this.A01.get();
        this.A00.get();
        return new T48(context, abstractC61583Rq7, interfaceC65676Tr6);
    }

    public C64824TVo(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4) {
        this.A02 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A01 = interfaceC08830cm3;
        this.A00 = interfaceC08830cm4;
    }
}
