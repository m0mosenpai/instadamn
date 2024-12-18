package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.Map;

/* renamed from: X.9V4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V4 extends C3OO implements InterfaceC193488hT {
    public Medium A00;
    public final View A01;
    public final TextView A02;
    public final ImageView A03;

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        Medium medium2 = this.A00;
        if (medium2 == null) {
            C14360o3.A0F("medium");
            throw C00O.createAndThrow();
        }
        return medium.equals(medium2);
    }

    public C9V4(View view) {
        super(view);
        this.A01 = view;
        this.A03 = (ImageView) AbstractC166997dE.A0R(view, R.id.mk_folder_media);
        this.A02 = AbstractC167007dF.A0N(view, R.id.mk_folder_title);
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167017dG.A1O(medium, bitmap);
        String valueOf = String.valueOf(medium.A05);
        Map map = AbstractC188868Yc.A00;
        BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) map.get(valueOf);
        if (backgroundGradientColors == null) {
            backgroundGradientColors = AbstractC14570oV.A01(bitmap, C05F.A00);
            map.put(valueOf, backgroundGradientColors);
        }
        medium.A0H = backgroundGradientColors;
        ImageView imageView = this.A03;
        imageView.setImageMatrix(AbstractC188868Yc.A03(medium.A07, bitmap.getWidth(), bitmap.getHeight(), imageView.getWidth(), imageView.getHeight()));
        imageView.setImageBitmap(bitmap);
    }
}
