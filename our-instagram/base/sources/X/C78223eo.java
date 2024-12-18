package X;

import android.widget.ImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.3eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78223eo extends C03E implements InterfaceC16620sF {
    public static final C78223eo A00 = new C78223eo();

    public C78223eo() {
        super(2, ColorFilterAlphaImageView.class, "setScaleType", "setScaleType(Landroid/widget/ImageView$ScaleType;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        C14360o3.A0B(imageView, 0);
        imageView.setScaleType((ImageView.ScaleType) obj2);
        return C0eB.A00;
    }
}
