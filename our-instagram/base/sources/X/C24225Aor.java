package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Aor, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24225Aor implements BE4 {
    public final List A00 = AbstractC166987dD.A1E();

    public final void A00(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryPickerServiceContent galleryPickerServiceContent = (GalleryPickerServiceContent) it.next();
            A12.add(galleryPickerServiceContent.mFilePath);
            AbstractC166997dE.A1W(A1E, galleryPickerServiceContent.mOrientation);
            A1E2.add(Boolean.valueOf(galleryPickerServiceContent.mIsPhoto));
        }
        if (list.size() == A12.size() && list.size() == A1E.size() && list.size() == A1E2.size()) {
            C09530e4 A0o = AbstractC167007dF.A0o("serviceType", 29);
            C09530e4 A0Y = AbstractC167027dH.A0Y(C05F.A00);
            C09530e4 A1L = AbstractC166987dD.A1L("filePaths", A12);
            C09530e4 A1L2 = AbstractC166987dD.A1L("orientations", A1E);
            boolean[] zArr = new boolean[A1E2.size()];
            Iterator it2 = A1E2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                zArr[i] = AbstractC166987dD.A1a(it2.next());
                i++;
            }
            this.A00.add(AbstractC61636Rr0.A00(A0o, A0Y, A1L, A1L2, AbstractC166987dD.A1L("isPhotoBooleans", zArr)));
            return;
        }
        C0K8.A0C("GalleryPickerService", "Error retrieving gallery content: mismatching sizes");
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(29);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        GalleryPickerServiceConfiguration galleryPickerServiceConfiguration;
        GalleryPickerServiceDataSource galleryPickerServiceDataSource;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = GalleryPickerServiceConfiguration.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt) && (galleryPickerServiceConfiguration = (GalleryPickerServiceConfiguration) anonymousClass904.A02(c203848zt)) != null && (galleryPickerServiceDataSource = galleryPickerServiceConfiguration.A00) != null) {
                galleryPickerServiceDataSource.setGalleryPickerContentListener(this);
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A00;
        List A0a = AbstractC001800i.A0a(list);
        list.clear();
        return A0a;
    }
}
