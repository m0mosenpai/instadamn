package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.3el, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78193el extends C03E implements InterfaceC16620sF {
    public static final C78193el A00 = new C78193el();

    public C78193el() {
        super(2, ColorFilterAlphaImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        C14360o3.A0B(imageView, 0);
        imageView.setImageDrawable((Drawable) obj2);
        return C0eB.A00;
    }
}
