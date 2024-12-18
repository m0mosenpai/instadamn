package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194558jG implements C7Db {
    public List A01;
    public List A02;
    public int A00 = 10;
    public List A03 = new ArrayList();
    public final java.util.Set A05 = new HashSet();
    public final C8SI A04 = new C8SI(0);

    @Override // X.InterfaceC159417Dc
    public final boolean A8r(C9NH c9nh) {
        C14360o3.A0B(c9nh, 0);
        if (this.A01.size() >= this.A00) {
            return false;
        }
        this.A01 = AbstractC001800i.A0T(c9nh, this.A01);
        A01(this);
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final void AAN(Bitmap bitmap, int i) {
    }

    @Override // X.InterfaceC159417Dc
    public final int Bsl() {
        return -1;
    }

    @Override // X.InterfaceC159417Dc
    public final Bitmap By6(int i) {
        return null;
    }

    @Override // X.C7Db
    public final int CNK(GalleryItem galleryItem) {
        C14360o3.A0B(galleryItem, 0);
        return A00(galleryItem);
    }

    @Override // X.C7Db
    public final int CNS(Medium medium) {
        C14360o3.A0B(medium, 0);
        Iterator it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!medium.equals(((C9NH) it.next()).A01.A00)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC159417Dc
    public final void Cpv(int i, int i2) {
    }

    private final int A00(GalleryItem galleryItem) {
        Iterator it = this.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!galleryItem.equals(((C9NH) it.next()).A01)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final void A01(C194558jG c194558jG) {
        List list = c194558jG.A01;
        List list2 = c194558jG.A02;
        C8SI c8si = c194558jG.A04;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (!list2.isEmpty()) {
            int size = list2.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                arrayList.add(new C9NH(new GalleryItem(null, null, null, null, null, null, null, null, C05F.A1F, String.valueOf(c8si.A00(AnonymousClass001.A0O("empty_segment_", size2))), (int) ((InterfaceC110074xc) list2.get(size2)).getDurationInMs()), null));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        c194558jG.A03 = unmodifiableList;
        boolean isEmpty = unmodifiableList.isEmpty();
        Iterator it = c194558jG.A05.iterator();
        if (isEmpty) {
            while (it.hasNext()) {
                ((InterfaceC187208Rn) it.next()).DNz();
            }
        } else {
            while (it.hasNext()) {
                ((InterfaceC187208Rn) it.next()).DO2(AbstractC001800i.A0a(c194558jG.A03));
            }
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void A96(InterfaceC187208Rn interfaceC187208Rn) {
        this.A05.add(interfaceC187208Rn);
    }

    @Override // X.InterfaceC159417Dc
    public final C9NH BJy(int i) {
        return (C9NH) this.A03.get(i);
    }

    @Override // X.C7Db
    public final int BPr() {
        return this.A00;
    }

    @Override // X.C7Db
    public final List Bsg() {
        return this.A01;
    }

    @Override // X.C7Db
    public final C9NH Bsi(int i) {
        return (C9NH) this.A01.get(i);
    }

    @Override // X.InterfaceC159417Dc
    public final void EdS(int i) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNp((C9NH) this.A03.get(i), i);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void clear() {
        this.A01 = C16930sl.A00;
        A01(this);
    }

    @Override // X.InterfaceC159417Dc
    public final int getCount() {
        return this.A03.size();
    }

    @Override // X.InterfaceC159417Dc
    public final boolean isEmpty() {
        return this.A03.isEmpty();
    }

    @Override // X.InterfaceC159417Dc
    public final void removeItem(int i) {
        if (i >= 0 && i < this.A01.size()) {
            List list = this.A01;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (i2 != i) {
                    arrayList.add(obj);
                }
                i2 = i3;
            }
            this.A01 = arrayList;
            A01(this);
        }
    }

    public C194558jG() {
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = c16930sl;
        this.A02 = c16930sl;
    }

    @Override // X.C7Db
    public final boolean Ccf(GalleryItem galleryItem) {
        if (A00(galleryItem) == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final void EFS(GalleryItem galleryItem) {
        removeItem(A00(galleryItem));
    }

    @Override // X.InterfaceC159417Dc
    public final void EWl(List list) {
        this.A01 = AbstractC001800i.A0a(list);
        A01(this);
    }

    @Override // X.C7Db
    public final void EYg(int i) {
        this.A00 = i;
    }
}
