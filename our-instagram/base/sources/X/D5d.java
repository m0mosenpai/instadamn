package X;

import android.widget.ImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes5.dex */
public final /* synthetic */ class D5d extends C03E implements InterfaceC16620sF {
    public static final D5d A00 = new D5d();

    public D5d() {
        super(2, IgProgressImageView.class, "setScaleType", "setScaleType(Landroid/widget/ImageView$ScaleType;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        IgProgressImageView igProgressImageView = (IgProgressImageView) obj;
        ImageView.ScaleType scaleType = (ImageView.ScaleType) obj2;
        AbstractC167017dG.A1N(igProgressImageView, scaleType);
        igProgressImageView.setScaleType(scaleType);
        return C0eB.A00;
    }
}
