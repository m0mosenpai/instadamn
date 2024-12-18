package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187218Ro implements InterfaceC159417Dc {
    public int A00;
    public final List A01 = new ArrayList();
    public final java.util.Set A02 = new HashSet();

    public final int A00(String str) {
        Object obj;
        C14360o3.A0B(str, 0);
        List list = this.A01;
        Iterator it = AbstractC16960so.A1S(list).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C9NH) list.get(((Number) obj).intValue())).A01.A0A, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final boolean A01(C9NH c9nh, int i) {
        List list = this.A01;
        if (list.size() >= 10) {
            return false;
        }
        list.add(i, c9nh);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNF(c9nh, i);
        }
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final boolean A8r(C9NH c9nh) {
        C14360o3.A0B(c9nh, 0);
        return A01(c9nh, this.A01.size());
    }

    @Override // X.InterfaceC159417Dc
    public final void clear() {
        this.A00 = 0;
        this.A01.clear();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNz();
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void A96(InterfaceC187208Rn interfaceC187208Rn) {
        this.A02.add(interfaceC187208Rn);
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
    public final void EFS(GalleryItem galleryItem) {
        int A00 = A00(galleryItem.A0A);
        if (A00 >= 0) {
            removeItem(A00);
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
        this.A00 = i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNp((C9NH) this.A01.get(i), i);
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
