package X;

import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lwk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49653Lwk implements InterfaceC189068Yw {
    public final /* synthetic */ InterfaceC71543Iw A00;

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC167017dG.A0d(AbstractC166987dD.A0l(it)));
        }
        this.A00.F8s(A0q);
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public C49653Lwk(InterfaceC71543Iw interfaceC71543Iw) {
        this.A00 = interfaceC71543Iw;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return C16930sl.A00;
    }
}
