package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class MM6 extends C0YY implements InterfaceC16620sF {
    public static final MM6 A00 = new MM6();

    public MM6() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) AbstractC25236BEt.A0D((ViewGroup) obj2);
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new C79773hS(new D8L(45, scaleType, imageView));
    }
}
