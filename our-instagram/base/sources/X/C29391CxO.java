package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CxO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29391CxO implements MPG {
    public final /* synthetic */ C47958LGu A00;
    public final /* synthetic */ CPY A01;

    public C29391CxO(C47958LGu c47958LGu, CPY cpy) {
        this.A00 = c47958LGu;
        this.A01 = cpy;
    }

    @Override // X.MPG
    public final void DU7(int i, int i2) {
        List A01 = this.A00.A01();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            Medium medium = ((GalleryItem) it.next()).A00;
            if (medium != null) {
                A1E.add(new C27991CVo(medium.A02(), String.valueOf(medium.A05), medium.A0a));
            }
        }
        this.A01.A00.A03(C30182DRn.A01(A1E, 44));
    }
}
