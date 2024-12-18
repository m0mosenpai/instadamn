package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.List;

/* renamed from: X.8Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189128Zd {
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Drawable A0C;
    public final CameraAREffect A0D;
    public final C88Z A0E;
    public final ProductItemWithAR A0F;
    public final C189138Ze A0G;
    public final String A0H;
    public final String A0I;

    public C189128Zd(Drawable drawable, CameraAREffect cameraAREffect, C88Z c88z, ImageUrl imageUrl, ProductItemWithAR productItemWithAR, C189138Ze c189138Ze, String str, String str2) {
        String str3;
        String str4;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A0E = c88z;
        this.A0I = str == null ? "" : str;
        this.A02 = imageUrl;
        this.A0C = drawable;
        this.A0F = productItemWithAR;
        this.A0G = c189138Ze;
        this.A0H = str2;
        if (c88z != C88Z.A04 && c88z != C88Z.A06 && c88z != C88Z.A08) {
            this.A0D = null;
            if (cameraAREffect != null) {
                C88X c88x = C88X.A0T;
                str3 = "DialElement";
                StringBuilder sb = new StringBuilder();
                sb.append("Builder() ");
                sb.append(c88z);
                sb.append(" has mCameraArEffect=");
                sb.append(cameraAREffect);
                str4 = sb.toString();
            } else {
                return;
            }
        } else {
            if (cameraAREffect != null) {
                this.A0D = cameraAREffect;
                return;
            }
            this.A0D = null;
            C88X c88x2 = C88X.A0T;
            str3 = "DialElement";
            str4 = "Builder() found null mCameraArEffect";
        }
        C0w9.A03(str3, str4);
    }

    public C189128Zd(Drawable drawable, C88Z c88z, String str) {
        this(drawable, null, c88z, null, null, null, str, null);
    }
}
