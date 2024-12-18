package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: X.KEz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45560KEz extends U7H {
    public C8FY A00;
    public final /* synthetic */ K5T A01;

    public C45560KEz(K5T k5t) {
        this.A01 = k5t;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Bitmap decodeFile;
        K5T k5t = this.A01;
        String str = k5t.A06;
        if (str != null && (decodeFile = BitmapFactory.decodeFile(str)) != null) {
            C8FY c8fy = new C8FY(AbstractC166997dE.A0N(k5t), decodeFile);
            c8fy.A08.setAntiAlias(true);
            c8fy.invalidateSelf();
            c8fy.A02(decodeFile.getWidth() * 0.03f);
            this.A00 = c8fy;
        }
        return null;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        ImageView imageView = this.A01.A01;
        if (imageView != null) {
            imageView.setImageDrawable(this.A00);
        }
    }
}
