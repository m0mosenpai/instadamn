package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;

/* renamed from: X.Aed, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23704Aed implements InterfaceC59142nF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C193328hC A01;

    public C23704Aed(C193328hC c193328hC, int i) {
        this.A01 = c193328hC;
        this.A00 = i;
    }

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        int A00 = (int) AbstractC126235nK.A00(this.A01.A0Q, 136);
        int i = this.A00;
        int height = (int) ((bitmap.getHeight() / bitmap.getWidth()) * i);
        if (height <= A00) {
            A00 = height;
        }
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, A00);
        if (extractThumbnail != null) {
            return extractThumbnail;
        }
        return bitmap;
    }
}
