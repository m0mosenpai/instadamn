package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212329b1 extends AbstractC178657wd implements InterfaceC180087yy {
    public final ArrayList A00;

    public C212329b1(InterfaceC178207vu interfaceC178207vu, C81A c81a) {
        super(interfaceC178207vu);
        ArrayList arrayList = new ArrayList(1);
        this.A00 = arrayList;
        arrayList.add(c81a);
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC180087yy.A00;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }

    @Override // X.InterfaceC180087yy
    public final List Bmt() {
        return this.A00;
    }
}
