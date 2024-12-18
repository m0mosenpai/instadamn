package X;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Az0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24840Az0 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ C177977vW A02;
    public final /* synthetic */ InterfaceC195388ke A03;

    public RunnableC24840Az0(Bitmap bitmap, Medium medium, C177977vW c177977vW, InterfaceC195388ke interfaceC195388ke) {
        this.A00 = bitmap;
        this.A02 = c177977vW;
        this.A01 = medium;
        this.A03 = interfaceC195388ke;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC195388ke interfaceC195388ke;
        GalleryItem.LocalGalleryMedium A0d;
        BBC bbc;
        int absoluteAdapterPosition;
        ConstraintLayout constraintLayout;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            C177977vW c177977vW = this.A02;
            IgImageView igImageView = c177977vW.A03.A07;
            Medium medium = this.A01;
            if (AbstractC188868Yc.A05(igImageView, medium)) {
                interfaceC195388ke = this.A03;
                A0d = AbstractC167017dG.A0d(medium);
                bbc = new C9NP(bitmap);
                absoluteAdapterPosition = c177977vW.getAbsoluteAdapterPosition();
                constraintLayout = c177977vW.A01;
                interfaceC195388ke.DNa(constraintLayout, A0d, bbc, absoluteAdapterPosition);
            }
        }
        interfaceC195388ke = this.A03;
        A0d = AbstractC167017dG.A0d(this.A01);
        bbc = AiD.A00;
        C177977vW c177977vW2 = this.A02;
        absoluteAdapterPosition = c177977vW2.getAbsoluteAdapterPosition();
        constraintLayout = c177977vW2.A01;
        interfaceC195388ke.DNa(constraintLayout, A0d, bbc, absoluteAdapterPosition);
    }
}
