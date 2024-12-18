package X;

import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.BUj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25621BUj extends C03E implements InterfaceC16620sF {
    public static final C25621BUj A00 = new C25621BUj();

    public C25621BUj() {
        super(2, IgImageView.class, "setScaleType", "setScaleType(Landroid/widget/ImageView$ScaleType;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        C14360o3.A0B(imageView, 0);
        imageView.setScaleType((ImageView.ScaleType) obj2);
        return C0eB.A00;
    }
}
