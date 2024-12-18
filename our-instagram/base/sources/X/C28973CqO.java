package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.CqO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28973CqO implements InterfaceC51522Ya {
    public static final C28973CqO A00 = new C28973CqO();

    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ImageView, X.BZD, java.lang.Object] */
    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        ?? imageView = new ImageView(context);
        imageView.A00 = new Rect();
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Object obj = (InterfaceC59242nQ) C59232nO.A00().AM5();
        C14360o3.A0C(obj, AbstractC111324zv.A00(477));
        imageView.setImageDrawable((Drawable) obj);
        return imageView;
    }
}
