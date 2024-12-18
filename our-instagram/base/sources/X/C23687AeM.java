package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.AeM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23687AeM implements C3PE {
    public final /* synthetic */ C9V6 A00;
    public final /* synthetic */ C194388iy A01;
    public final /* synthetic */ InterfaceC195388ke A02;

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    public C23687AeM(C9V6 c9v6, C194388iy c194388iy, InterfaceC195388ke interfaceC195388ke) {
        this.A00 = c9v6;
        this.A01 = c194388iy;
        this.A02 = interfaceC195388ke;
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C9V6 c9v6 = this.A00;
        Bitmap bitmap = c9v6.A01.A06;
        GalleryItem galleryItem = (GalleryItem) AbstractC001800i.A0J(this.A01.A00);
        if (bitmap != null && galleryItem != null) {
            this.A02.DNu(galleryItem, new C9NP(bitmap), c9v6.getAbsoluteAdapterPosition(), false);
            return true;
        }
        return false;
    }
}
