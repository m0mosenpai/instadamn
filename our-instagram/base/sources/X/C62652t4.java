package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62652t4 implements InterfaceC57092jk {
    public final C57072ji A00;
    public final List A01 = new ArrayList();

    @Override // X.InterfaceC57092jk
    public final void A7i(InterfaceC57142jp interfaceC57142jp) {
        this.A01.add(interfaceC57142jp);
    }

    @Override // X.InterfaceC57092jk
    public final InterfaceC57142jp AXJ(int i) {
        Object obj;
        List list = this.A01;
        int size = list.size();
        List list2 = this.A00.A01;
        int size2 = list2.size();
        if (size + size2 > i) {
            if (i < size) {
                obj = list.get(i);
            } else {
                obj = list2.get(i - size);
            }
            return (InterfaceC57142jp) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index ");
        sb.append(i);
        sb.append(AbstractC58317Pt9.A00(834));
        sb.append(size);
        sb.append(size2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // X.InterfaceC57092jk
    public final void clear() {
        this.A01.clear();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C64745TSe(this);
    }

    @Override // X.InterfaceC57092jk
    public final int size() {
        return this.A01.size() + this.A00.A01.size();
    }

    public C62652t4(C57072ji c57072ji) {
        this.A00 = c57072ji;
    }
}
