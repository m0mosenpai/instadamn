package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.AeQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23691AeQ implements InterfaceC25167BBn {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C210959Us A01;
    public final /* synthetic */ C148276lx A02;

    public C23691AeQ(Drawable drawable, C210959Us c210959Us, C148276lx c148276lx) {
        this.A00 = drawable;
        this.A01 = c210959Us;
        this.A02 = c148276lx;
    }

    @Override // X.InterfaceC25167BBn
    public final void Dl1(ConstrainedImageView constrainedImageView, int i, int i2, int i3, int i4) {
        RectF rectF = ALo.A01;
        Drawable drawable = this.A00;
        if (drawable != null) {
            ALo.A01(drawable, this.A01, this.A02, i3 - i, i4 - i2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
