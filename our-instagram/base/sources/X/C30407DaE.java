package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.DaE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30407DaE extends C0YY implements InterfaceC16620sF {
    public static final C30407DaE A00 = new C30407DaE();

    public C30407DaE() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) AbstractC25236BEt.A0D((ViewGroup) obj2);
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return AbstractC25225BEi.A0q(C29899DGn.A00(scaleType, imageView, 4));
    }
}
