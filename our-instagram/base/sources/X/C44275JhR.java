package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.JhR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44275JhR implements Iterable, InterfaceC15590qF {
    public C44276JhS A00;
    public final LinkedList A01 = new LinkedList();

    public final C44059Jdk A01() {
        Object obj;
        LinkedList linkedList = this.A01;
        if (!linkedList.isEmpty()) {
            obj = AbstractC001800i.A0K(linkedList);
        } else {
            obj = null;
        }
        return (C44059Jdk) obj;
    }

    public final void A02(Object obj) {
        this.A01.add(obj);
        C44276JhS c44276JhS = this.A00;
        if (c44276JhS != null) {
            C44059Jdk c44059Jdk = (C44059Jdk) obj;
            Iterator it = c44276JhS.A00.A02.iterator();
            while (it.hasNext()) {
                ((MRD) it.next()).D4l(c44059Jdk);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C44277JhT(this);
    }

    public final int A00() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += (int) Math.max(0L, ((C44059Jdk) it.next()).A03);
        }
        return i;
    }
}
