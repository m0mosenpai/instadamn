package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6XY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XY {
    public final C6XX A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new LinkedHashMap();

    public static final void A00(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, IgImageView igImageView, C6XX c6xx, C6XY c6xy, String str, float f, boolean z, boolean z2) {
        if (imageUrl != null) {
            String A0R = AnonymousClass001.A0R(str, imageUrl.getUrl());
            Bitmap bitmap = (Bitmap) c6xy.A02.get(A0R);
            if (bitmap != null) {
                c6xx.A01();
                igImageView.setImageBitmap(bitmap);
                return;
            } else {
                igImageView.A0E = new C70821Whe(c6xx);
                igImageView.A0I = new C23705Aee(igImageView, c6xy, A0R, f, z, z2);
                igImageView.setUrl(imageUrl, interfaceC11380iw);
                return;
            }
        }
        igImageView.setVisibility(4);
        C37947Gmp.A01(str, "Null image");
    }

    public C6XY(C6XX c6xx) {
        this.A00 = c6xx;
    }
}
