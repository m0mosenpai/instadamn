package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.Le7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48570Le7 implements InterfaceC43071ya {
    public final /* synthetic */ GalleryItem A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LHw A02;

    public C48570Le7(GalleryItem galleryItem, UserSession userSession, LHw lHw) {
        this.A02 = lHw;
        this.A01 = userSession;
        this.A00 = galleryItem;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        L0Q l0q;
        String str;
        WearablesAppAttributionType wearablesAppAttributionType;
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0 && A01 != 1) {
            l0q = (L0Q) c59062n7.A04;
        } else {
            l0q = (L0Q) c59062n7.A04;
            if (l0q.A00) {
                return;
            }
            l0q.A00 = true;
            MediaPickerItemView mediaPickerItemView = this.A02.A00;
            GalleryItem galleryItem = ((L25) c59062n7.A03).A00;
            UserSession userSession = this.A01;
            Drawable drawable = mediaPickerItemView.A01;
            if (drawable != null && drawable.isVisible() && mediaPickerItemView.A06 == EnumC44309Ji0.A05 && !F28.A00(userSession)) {
                Medium medium = galleryItem.A00;
                Integer num = null;
                if (medium != null) {
                    str = medium.A0G.A03;
                } else {
                    str = null;
                }
                AbstractC224309vG A012 = AbstractC178007vZ.A01(userSession, str, C16930sl.A00);
                if (A012 != null) {
                    wearablesAppAttributionType = A012.A01();
                } else {
                    wearablesAppAttributionType = null;
                }
                C8i c8i = C8i.GALLERY_WEARABLES_ICON_IMPRESSION;
                Medium medium2 = galleryItem.A00;
                if (medium2 != null) {
                    num = Integer.valueOf(medium2.A05);
                }
                CZH.A01(c8i, wearablesAppAttributionType, userSession, String.valueOf(num), null);
                return;
            }
            Medium medium3 = this.A00.A00;
            if (medium3 != null && medium3.A0G.A03 != null) {
                return;
            }
        }
        l0q.A00 = false;
    }
}
