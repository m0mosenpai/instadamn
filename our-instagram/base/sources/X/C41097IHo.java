package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.R;

/* renamed from: X.IHo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41097IHo {
    public final Context A00;
    public final Paint A01;
    public final Paint A02;
    public final Rect A03;

    public C41097IHo(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        this.A02 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(1711276032);
        this.A01 = paint2;
        this.A03 = AbstractC166987dD.A0U();
    }
}
