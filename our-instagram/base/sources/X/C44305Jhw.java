package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.Jhw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44305Jhw implements InterfaceC193488hT {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C44305Jhw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        String valueOf;
        if (this.A00 != 0) {
            C14360o3.A0B(medium, 0);
            return AbstractC50102Ry.A00(this.A02, medium);
        }
        C14360o3.A0B(medium, 0);
        Medium medium2 = ((C177977vW) this.A03).A00;
        if (medium2 != null && (valueOf = String.valueOf(medium2.A05)) != null && valueOf.equals(String.valueOf(medium.A05))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        String str2;
        if (this.A00 != 0) {
            ((InterfaceC23621Ds) this.A01).resumeWith(AbstractC25227BEk.A0h());
            return;
        }
        C14360o3.A0B(medium, 0);
        C177977vW c177977vW = (C177977vW) this.A03;
        Medium medium2 = c177977vW.A00;
        if (medium2 != null) {
            str2 = String.valueOf(medium2.A05);
        } else {
            str2 = null;
        }
        if (!C14360o3.A0K(str2, String.valueOf(medium.A05))) {
            return;
        }
        C206019Ah.A02((C206279Bk) this.A02, c177977vW.A03);
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = ((C44297Jho) this.A01).A00;
        galleryPickerMediaOverlayView.A0B = false;
        galleryPickerMediaOverlayView.invalidate();
        c177977vW.A01.invalidate();
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        String str;
        if (this.A00 != 0) {
            C14360o3.A0B(bitmap, 2);
            ((InterfaceC23621Ds) this.A01).resumeWith(new C3NX(BlurUtil.blur(bitmap, 0.25f, 15)));
            return;
        }
        C14360o3.A0B(medium, 0);
        C14360o3.A0B(bitmap, 2);
        C177977vW c177977vW = (C177977vW) this.A03;
        Medium medium2 = c177977vW.A00;
        if (medium2 != null) {
            str = String.valueOf(medium2.A05);
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, String.valueOf(medium.A05))) {
            return;
        }
        C206019Ah.A00.A03(bitmap, (C206279Bk) this.A02, c177977vW.A03, null, medium.A07);
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = ((C44297Jho) this.A01).A00;
        galleryPickerMediaOverlayView.A0B = true;
        galleryPickerMediaOverlayView.invalidate();
        c177977vW.A01.invalidate();
    }
}
