package X;

import android.view.View;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.82x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1814582x implements GalleryPickerServiceDataSource {
    public boolean A00;
    public C24225Aor A01;
    public C9UW A02;
    public final List A03 = new ArrayList();

    public final synchronized void A00() {
        if (!this.A00) {
            this.A03.clear();
        }
        C9UW c9uw = this.A02;
        if (c9uw != null) {
            C8C2 c8c2 = c9uw.A03;
            View view = c9uw.A00;
            c8c2.DCw(view);
            c9uw.A02.setText(view.getContext().getString(2131952314));
        }
        C24225Aor c24225Aor = this.A01;
        if (c24225Aor != null) {
            c24225Aor.A00(this.A03);
        }
    }

    public final synchronized void A01(int i, String str, boolean z) {
        List list = this.A03;
        list.clear();
        list.add(new GalleryPickerServiceContent(i, str, z));
        C9UW c9uw = this.A02;
        if (c9uw != null) {
            c9uw.A00();
        }
        C24225Aor c24225Aor = this.A01;
        if (c24225Aor != null) {
            c24225Aor.A00(list);
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final synchronized List getContent() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final void setGalleryPickerContentListener(C24225Aor c24225Aor) {
        this.A01 = c24225Aor;
        if (c24225Aor != null) {
            c24225Aor.A00(this.A03);
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final void setGalleryPickerServiceListener(C9UW c9uw) {
        this.A02 = c9uw;
        if (!this.A03.isEmpty() && c9uw != null) {
            c9uw.A00();
        }
    }
}
