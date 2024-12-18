package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194628jN implements C1NJ {
    public List A00 = C16930sl.A00;
    public final /* synthetic */ C193838i4 A01;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            C193838i4 c193838i4 = this.A01;
            int i = 0;
            Medium medium = ((GalleryItem) this.A00.get(0)).A00;
            if (medium != null) {
                i = medium.A07;
            }
            C193838i4.A07(bitmap, c193838i4, i);
            C8YY c8yy = c193838i4.A0w;
            List unmodifiableList = Collections.unmodifiableList(this.A00);
            C14360o3.A07(unmodifiableList);
            c8yy.A0J(c193838i4, unmodifiableList, 0, false, false, false);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C194628jN(C193838i4 c193838i4) {
        this.A01 = c193838i4;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C193838i4 c193838i4 = this.A01;
        C8YY c8yy = c193838i4.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A00);
        C14360o3.A07(unmodifiableList);
        c8yy.A0J(c193838i4, unmodifiableList, 0, false, false, false);
    }
}
