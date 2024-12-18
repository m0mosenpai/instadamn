package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class BNV implements C2YT {
    public final Drawable A00;
    public final ImageView.ScaleType A01;

    public BNV(Drawable drawable, ImageView.ScaleType scaleType) {
        C14360o3.A0B(drawable, 1);
        this.A00 = drawable;
        this.A01 = scaleType;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        ImageView imageView = (ImageView) BNU.A04.ALq(c2yr.A00.A04);
        imageView.setImageDrawable(this.A00);
        ImageView.ScaleType scaleType = this.A01;
        if (scaleType != null) {
            imageView.setScaleType(scaleType);
        }
        imageView.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
        return new C2YU(AbstractC78673fZ.A00(Math.max(C78613fT.A03(j), imageView.getMeasuredWidth()), Math.max(C78613fT.A02(j), imageView.getMeasuredHeight())), null);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
