package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;

/* renamed from: X.JaO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43858JaO {
    public final /* synthetic */ C43830JZt A00;

    public C43858JaO(C43830JZt c43830JZt) {
        this.A00 = c43830JZt;
    }

    public final void A00(String str, String str2) {
        C43830JZt c43830JZt = this.A00;
        UserSession userSession = c43830JZt.A0C;
        AbstractC59962oe abstractC59962oe = c43830JZt.A0B;
        String str3 = "";
        C09530e4 A1L = AbstractC166987dD.A1L("uri", str);
        if (str2 != null) {
            str3 = str2;
        }
        AbstractC208329Jr.A09(abstractC59962oe, userSession, "error_logging", "posts", AbstractC167017dG.A0u("is_network", "network", A1L, AbstractC166987dD.A1L("error_message", str3), AbstractC166987dD.A1L("error_type", "thumbnail_load")));
    }

    public final boolean A01(GalleryItem galleryItem) {
        C43830JZt c43830JZt = this.A00;
        C43835JZy c43835JZy = c43830JZt.A0D;
        if (c43835JZy.A07 || C43830JZt.A06(galleryItem, c43830JZt) || !c43830JZt.A0L()) {
            return false;
        }
        Integer num = galleryItem.A09;
        Integer num2 = C05F.A01;
        if (num == num2 && galleryItem.A01()) {
            return false;
        }
        c43835JZy.EdU(galleryItem, true, true);
        c43830JZt.A0G(galleryItem, num2);
        c43830JZt.A0K(true, true);
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = c43830JZt.A0F.A00;
        GestureDetectorOnGestureListenerC43829JZs.A0D(C5L6.A0E, gestureDetectorOnGestureListenerC43829JZs, true);
        GestureDetectorOnGestureListenerC43829JZs.A0J(gestureDetectorOnGestureListenerC43829JZs);
        gestureDetectorOnGestureListenerC43829JZs.A0y.A05(new C44316Ji7(1, true));
        C6WI.A01().A0I = true;
        return true;
    }
}
