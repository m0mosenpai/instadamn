package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.M6p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50026M6p implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public RunnableC50026M6p(Bitmap bitmap, View view, View view2, ImageView imageView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = imageView;
        this.A00 = bitmap;
        this.A02 = view;
        this.A01 = view2;
        this.A04 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Number number;
        ImageView imageView = this.A03;
        Bitmap bitmap = this.A00;
        View view = this.A02;
        View view2 = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        int measuredWidth = imageView.getMeasuredWidth();
        float A07 = JQ0.A07(imageView, R.dimen.abc_dropdownitem_icon_width);
        float f = measuredWidth * 0.5f;
        Object parent = imageView.getParent();
        AbstractC43592JPx.A1T(parent);
        int width = ((View) parent).getWidth();
        Object tag = imageView.getTag();
        if (tag instanceof Integer) {
            number = (Number) tag;
        } else {
            number = null;
        }
        int i = -1;
        int A02 = AbstractC37302Gc3.A02(number);
        boolean z = false;
        if (A02 == -1) {
            z = true;
            i = 1;
        }
        imageView.setTag(Integer.valueOf(i));
        imageView.setImageBitmap(bitmap);
        imageView.clearAnimation();
        imageView.setX(view.getX());
        imageView.setY(view.getY());
        AbstractC43593JPy.A1A(imageView);
        view.setVisibility(8);
        if (view2 != null) {
            view2.setScaleX(0.75f);
            view2.setScaleY(0.75f);
            view2.setAlpha(0.0f);
        }
        imageView.setRotation(0.0f);
        imageView.setVisibility(0);
        AbstractC43593JPy.A0E(imageView.animate(), 0.85f).y(imageView.getY() + A07).setDuration(150L).withEndAction(new M7A(imageView, interfaceC16820sZ, f, A02, width, measuredWidth, z));
    }
}
