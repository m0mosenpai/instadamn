package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.api.schemas.BrandedContentProjectMetadata;

/* renamed from: X.Osb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55943Osb implements InterfaceC57928PmY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ FrameLayout A03;
    public final /* synthetic */ ImageView A04;
    public final /* synthetic */ ImageView A05;
    public final /* synthetic */ TextView A06;
    public final /* synthetic */ OL8 A07;

    public C55943Osb(ViewGroup viewGroup, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, TextView textView, OL8 ol8, int i, int i2) {
        this.A07 = ol8;
        this.A05 = imageView;
        this.A03 = frameLayout;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = imageView2;
        this.A02 = viewGroup;
        this.A06 = textView;
    }

    @Override // X.InterfaceC57928PmY
    public final void D9Q(Bitmap bitmap) {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        String str;
        OL8 ol8 = this.A07;
        ImageView imageView = this.A05;
        FrameLayout frameLayout = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        ImageView imageView2 = this.A04;
        ViewGroup viewGroup = this.A02;
        TextView textView = this.A06;
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        if (bitmap != null) {
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
        }
        AbstractC43592JPx.A1H(frameLayout, i, i2);
        imageView2.setVisibility(8);
        C47Z c47z = ol8.A07;
        if (c47z != null && (brandedContentProjectMetadata = c47z.A0t) != null && (str = brandedContentProjectMetadata.A05) != null && str.length() == 0) {
            viewGroup.setVisibility(0);
            textView.setText(2131964553);
        } else {
            viewGroup.setVisibility(8);
        }
    }
}
