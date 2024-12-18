package X;

import com.instagram.common.typedurl.ImageCacheKey;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25741Ng implements InterfaceC25751Nh {
    public final List A00 = new LinkedList();

    @Override // X.InterfaceC25751Nh
    public final void A7h(C59562nz c59562nz) {
        C14360o3.A0B(c59562nz, 0);
        this.A00.add(c59562nz);
    }

    @Override // X.InterfaceC25751Nh
    public final void AHX(C27819COi c27819COi) {
        List list = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c27819COi.A00.A0P.remove(((ImageCacheKey) ((C59562nz) it.next()).A0L.AjX()).A03);
        }
        list.clear();
    }

    @Override // X.InterfaceC25751Nh
    public final C59562nz BE1() {
        C59562nz c59562nz = null;
        for (C59562nz c59562nz2 : this.A00) {
            if (c59562nz == null || c59562nz2.A0C() > c59562nz.A0C()) {
                c59562nz = c59562nz2;
            }
        }
        return c59562nz;
    }

    @Override // X.InterfaceC25751Nh
    public final boolean EEl(C59562nz c59562nz) {
        return this.A00.remove(c59562nz);
    }

    @Override // X.InterfaceC25751Nh
    public final void F8D(InterfaceC25751Nh interfaceC25751Nh) {
        List list = this.A00;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC25751Nh.A7h((C59562nz) it.next());
            }
        }
    }

    @Override // X.InterfaceC25751Nh
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }
}
