package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.Rbn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60933Rbn extends AbstractC62654SKn {
    public final float A00;
    public final Bitmap A01;
    public final Canvas A02;
    public final Paint A03;
    public final List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60933Rbn(Paint paint, Q4Q q4q, List list) {
        super(q4q);
        AbstractC167017dG.A1R(list, paint);
        this.A04 = list;
        this.A03 = paint;
        this.A00 = AbstractC13880nE.A00(AbstractC166997dE.A0L(q4q), 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(q4q.A01, q4q.A00, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        this.A01 = createBitmap;
        this.A02 = new Canvas(createBitmap);
    }
}
