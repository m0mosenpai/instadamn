package X;

import android.widget.ImageView;

/* renamed from: X.D5e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C29641D5e extends C03E implements InterfaceC16620sF {
    public static final C29641D5e A00 = new C29641D5e();

    public C29641D5e() {
        super(2, ImageView.class, "setScaleType", "setScaleType(Landroid/widget/ImageView$ScaleType;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        C14360o3.A0B(imageView, 0);
        imageView.setScaleType((ImageView.ScaleType) obj2);
        return C0eB.A00;
    }
}
