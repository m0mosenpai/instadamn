package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.AdI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23623AdI implements InterfaceC193488hT {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C9S8 A01;

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        return true;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        C14360o3.A0B(bitmap, 2);
        C9S8 c9s8 = this.A01;
        int i = c9s8.A02;
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, i);
        C14360o3.A07(extractThumbnail);
        C8FY c8fy = new C8FY(c9s8.A05.getResources(), extractThumbnail);
        c8fy.A02(0.0f);
        c8fy.A08.setAntiAlias(true);
        c8fy.invalidateSelf();
        int i2 = (int) this.A00;
        int i3 = i + i2;
        c8fy.setBounds(i2, i2, i3, i3);
        List list = c9s8.A08;
        list.add(c8fy);
        if (list.size() >= 2) {
            c9s8.invalidateSelf();
        }
    }

    public C23623AdI(C9S8 c9s8, float f) {
        this.A01 = c9s8;
        this.A00 = f;
    }
}
