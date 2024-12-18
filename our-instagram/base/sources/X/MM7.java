package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class MM7 extends C0YY implements InterfaceC16620sF {
    public static final MM7 A00 = new MM7();

    public MM7() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj2;
        C14360o3.A0B(viewGroup, 1);
        View childAt = viewGroup.getChildAt(0);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(69));
        ImageView imageView = (ImageView) childAt;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new C79773hS(new C29899DGn(2, scaleType, imageView));
    }
}
