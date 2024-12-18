package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9L6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9L6 implements InterfaceC159417Dc {
    public final List A01 = AbstractC166987dD.A1E();
    public final java.util.Set A02 = AbstractC166987dD.A1H();
    public int A00 = -1;

    public final void A00(C84B c84b) {
        ArrayList A12 = AbstractC166997dE.A12(c84b, 0);
        int size = c84b.A01.size();
        for (int i = 0; i < size; i++) {
            C115525Km c115525Km = ((C115475Kh) c84b.A03(i)).A0G;
            boolean A1M = AbstractC167007dF.A1M(c115525Km.A08);
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = c115525Km.A09;
            int i3 = c115525Km.A05;
            int i4 = c115525Km.A07;
            A12.add(new C9NH(new GalleryItem(new C195868lW(AbstractC166987dD.A11(c115525Km.A0F), null, c115525Km.A0D, i2, i3, i4, currentTimeMillis, currentTimeMillis, false, A1M, true)), null));
        }
        EWl(A12);
    }

    @Override // X.InterfaceC159417Dc
    public final boolean A8r(C9NH c9nh) {
        C14360o3.A0B(c9nh, 0);
        List list = this.A01;
        int size = list.size();
        list.add(size, c9nh);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNF(c9nh, size);
        }
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final void A96(InterfaceC187208Rn interfaceC187208Rn) {
        C14360o3.A0B(interfaceC187208Rn, 0);
        this.A02.add(interfaceC187208Rn);
    }

    @Override // X.InterfaceC159417Dc
    public final void EFS(GalleryItem galleryItem) {
        String str = galleryItem.A0A;
        C14360o3.A0B(str, 0);
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C14360o3.A0K(((C9NH) list.get(i)).A01.A0A, str)) {
                if (i >= 0) {
                    removeItem(i);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void clear() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC159417Dc
    public final void AAN(Bitmap bitmap, int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                ((C9NH) list.get(i)).A00 = bitmap;
            }
        }
    }

    @Override // X.InterfaceC159417Dc
    public final C9NH BJy(int i) {
        return (C9NH) this.A01.get(i);
    }

    @Override // X.InterfaceC159417Dc
    public final int Bsl() {
        return this.A00;
    }

    @Override // X.InterfaceC159417Dc
    public final Bitmap By6(int i) {
        return ((C9NH) this.A01.get(i)).A00;
    }

    @Override // X.InterfaceC159417Dc
    public final void Cpv(int i, int i2) {
        List list = this.A01;
        list.add(i2, list.remove(i));
        if (this.A00 == i) {
            this.A00 = i2;
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNc(i, i2);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void EWl(List list) {
        List list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DO2(list);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void EdS(int i) {
        C9NH c9nh;
        this.A00 = i;
        for (InterfaceC187208Rn interfaceC187208Rn : this.A02) {
            if (i == -1) {
                c9nh = null;
            } else {
                c9nh = (C9NH) this.A01.get(i);
            }
            interfaceC187208Rn.DNp(c9nh, i);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final int getCount() {
        return this.A01.size();
    }

    @Override // X.InterfaceC159417Dc
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // X.InterfaceC159417Dc
    public final void removeItem(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                C9NH c9nh = (C9NH) list.remove(i);
                int i2 = this.A00;
                if (i < i2 || i2 >= list.size()) {
                    this.A00--;
                }
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC187208Rn) it.next()).DNm(c9nh, i);
                }
            }
        }
    }
}
