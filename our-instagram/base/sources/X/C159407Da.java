package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159407Da implements C7Db {
    public int A00;
    public int A01;
    public final List A02;
    public final java.util.Set A03;
    public final UserSession A04;

    public C159407Da(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = 10;
        this.A02 = new ArrayList();
        this.A03 = new HashSet();
        this.A01 = -1;
    }

    @Override // X.InterfaceC159417Dc
    public final boolean A8r(C9NH c9nh) {
        C14360o3.A0B(c9nh, 0);
        List list = this.A02;
        int size = list.size();
        if (size >= this.A00) {
            return false;
        }
        list.add(c9nh);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNF(c9nh, size);
        }
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final void AAN(Bitmap bitmap, int i) {
    }

    @Override // X.C7Db
    public final int CNK(GalleryItem galleryItem) {
        C14360o3.A0B(galleryItem, 0);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (galleryItem.equals(((C9NH) list.get(i)).A01)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C7Db
    public final int CNS(Medium medium) {
        C14360o3.A0B(medium, 0);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (medium.equals(((C9NH) list.get(i)).A01.A00)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC159417Dc
    public final void A96(InterfaceC187208Rn interfaceC187208Rn) {
        this.A03.add(interfaceC187208Rn);
    }

    @Override // X.InterfaceC159417Dc
    public final C9NH BJy(int i) {
        return (C9NH) this.A02.get(i);
    }

    @Override // X.C7Db
    public final int BPr() {
        return this.A00;
    }

    @Override // X.C7Db
    public final List Bsg() {
        List unmodifiableList = Collections.unmodifiableList(this.A02);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.C7Db
    public final C9NH Bsi(int i) {
        return (C9NH) this.A02.get(i);
    }

    @Override // X.InterfaceC159417Dc
    public final int Bsl() {
        return this.A01;
    }

    @Override // X.InterfaceC159417Dc
    public final Bitmap By6(int i) {
        C9NH c9nh = (C9NH) AbstractC001800i.A0O(this.A02, i);
        if (c9nh != null) {
            return c9nh.A00;
        }
        return null;
    }

    @Override // X.InterfaceC159417Dc
    public final void Cpv(int i, int i2) {
        List list = this.A02;
        list.add(i2, list.remove(i));
        if (this.A01 == i) {
            this.A01 = i2;
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNc(i, i2);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void EWl(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DO2(list);
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void EdS(int i) {
        this.A01 = i;
        if (i >= 0) {
            List list = this.A02;
            if (i < list.size()) {
                C9NH c9nh = (C9NH) list.get(i);
                Iterator it = this.A03.iterator();
                while (it.hasNext()) {
                    ((InterfaceC187208Rn) it.next()).DNp(c9nh, i);
                }
            }
        }
    }

    @Override // X.InterfaceC159417Dc
    public final void clear() {
        this.A02.clear();
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC187208Rn) it.next()).DNz();
        }
    }

    @Override // X.InterfaceC159417Dc
    public final int getCount() {
        return this.A02.size();
    }

    @Override // X.InterfaceC159417Dc
    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    @Override // X.InterfaceC159417Dc
    public final void removeItem(int i) {
        List list = this.A02;
        if (i < list.size()) {
            C9NH c9nh = (C9NH) list.remove(i);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC187208Rn) it.next()).DNm(c9nh, i);
            }
            this.A01 = -1;
        }
    }

    @Override // X.C7Db
    public final boolean Ccf(GalleryItem galleryItem) {
        if (CNK(galleryItem) == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC159417Dc
    public final void EFS(GalleryItem galleryItem) {
        int CNK = CNK(galleryItem);
        if (CNK >= 0) {
            removeItem(CNK);
        }
    }

    @Override // X.C7Db
    public final void EYg(int i) {
        this.A00 = i;
    }
}
