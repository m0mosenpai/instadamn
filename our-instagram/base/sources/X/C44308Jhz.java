package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;
import java.util.function.Consumer;

/* renamed from: X.Jhz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44308Jhz implements InterfaceC43071ya {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44308Jhz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean z;
        C51688MsJ c51688MsJ;
        EnumC44309Ji0 enumC44309Ji0;
        switch (this.A00) {
            case 0:
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                z = false;
                if (intValue == 0 || intValue == 1) {
                    c51688MsJ = (C51688MsJ) c59062n7.A04;
                    if (c51688MsJ.A00) {
                        return;
                    }
                    c51688MsJ.A00 = true;
                    GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = ((C44297Jho) this.A01).A00;
                    if (galleryPickerMediaOverlayView != null) {
                        enumC44309Ji0 = galleryPickerMediaOverlayView.A02;
                    } else {
                        enumC44309Ji0 = null;
                    }
                    Medium medium = ((C44302Jht) c59062n7.A03).A00;
                    UserSession userSession = (UserSession) this.A02;
                    EnumC44309Ji0 enumC44309Ji02 = EnumC44309Ji0.A05;
                    MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                    if (enumC44309Ji0 == enumC44309Ji02) {
                        WearablesAppAttributionType wearablesAppAttributionType = null;
                        AbstractC224309vG A01 = AbstractC178007vZ.A01(userSession, mediaUploadMetadata.A03, C16930sl.A00);
                        if (A01 != null) {
                            wearablesAppAttributionType = A01.A01();
                        }
                        CZH.A01(C8i.GALLERY_WEARABLES_ICON_IMPRESSION, wearablesAppAttributionType, userSession, String.valueOf(medium.A05), "feed_gallery");
                        return;
                    }
                    if (mediaUploadMetadata.A03 != null) {
                        return;
                    }
                    c51688MsJ.A00 = z;
                    return;
                }
                c51688MsJ = (C51688MsJ) c59062n7.A04;
                c51688MsJ.A00 = z;
                return;
            case 1:
                int intValue2 = interfaceC57162jr.CFq(c59062n7).intValue();
                z = false;
                if (intValue2 == 0 || intValue2 == 1) {
                    C51688MsJ c51688MsJ2 = (C51688MsJ) c59062n7.A04;
                    if (c51688MsJ2.A00) {
                        return;
                    }
                    c51688MsJ2.A00 = true;
                    C45748KNb c45748KNb = (C45748KNb) this.A02;
                    int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    InterfaceC193828i3 interfaceC193828i3 = c45748KNb.A04;
                    if (interfaceC193828i3 == null) {
                        return;
                    }
                    interfaceC193828i3.CiM(((KNW) this.A01).A00, c45748KNb.getBindingAdapterPosition());
                    return;
                }
                c51688MsJ = (C51688MsJ) c59062n7.A04;
                c51688MsJ.A00 = z;
                return;
            default:
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    java.util.Set set = ((LAG) this.A02).A07;
                    String str = c59062n7.A05;
                    if (!set.contains(str)) {
                        ((Consumer) this.A01).accept(c59062n7.A03);
                        C14360o3.A06(str);
                        set.add(str);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
