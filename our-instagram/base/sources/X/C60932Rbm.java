package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.Rbm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60932Rbm extends AbstractC62654SKn {
    public final Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60932Rbm(Paint paint, Q4Q q4q, List list) {
        super(q4q);
        AbstractC167017dG.A1R(list, paint);
        this.A03 = list;
        this.A02 = paint;
        Bitmap createBitmap = Bitmap.createBitmap(q4q.A01, q4q.A00, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        this.A00 = createBitmap;
        this.A01 = new Canvas(createBitmap);
    }
}
