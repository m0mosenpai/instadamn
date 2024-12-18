package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hau, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39410Hau extends AbstractC153816vq {
    public final AbstractC38087GpG A00;

    public C39410Hau(AbstractC38087GpG abstractC38087GpG) {
        super(false, false);
        this.A00 = abstractC38087GpG;
    }

    public final List A04() {
        C38321qM BQN;
        Collection<InterfaceC154036wC> values = this.A02.values();
        ArrayList A10 = AbstractC31174DnI.A10(values);
        for (InterfaceC154036wC interfaceC154036wC : values) {
            if ((interfaceC154036wC instanceof InterfaceC127975qQ) && (BQN = ((InterfaceC127975qQ) interfaceC154036wC).BQN()) != null) {
                A10.add(BQN);
            }
        }
        return A10;
    }

    @Override // X.AbstractC153816vq
    public final /* bridge */ /* synthetic */ InterfaceC154036wC A00(Object obj) {
        C38321qM A0H = AbstractC37301Gc2.A0H(obj);
        Iterator A04 = this.A00.A04();
        C14360o3.A07(A04);
        while (A04.hasNext()) {
            Object next = A04.next();
            if ((next instanceof InterfaceC127975qQ) && (next instanceof InterfaceC154036wC) && C14360o3.A0K(((InterfaceC127975qQ) next).BQN().getId(), A0H.getId())) {
                return (InterfaceC154036wC) next;
            }
        }
        return null;
    }
}
