package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.AeP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23690AeP implements InterfaceC25167BBn {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C210949Ur A01;
    public final /* synthetic */ C148276lx A02;

    public C23690AeP(Drawable drawable, C210949Ur c210949Ur, C148276lx c148276lx) {
        this.A00 = drawable;
        this.A01 = c210949Ur;
        this.A02 = c148276lx;
    }

    @Override // X.InterfaceC25167BBn
    public final void Dl1(ConstrainedImageView constrainedImageView, int i, int i2, int i3, int i4) {
        RectF rectF = AbstractC23078AFk.A01;
        Drawable drawable = this.A00;
        if (drawable != null) {
            AbstractC23078AFk.A00(drawable, this.A01, this.A02, i3 - i, i4 - i2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
