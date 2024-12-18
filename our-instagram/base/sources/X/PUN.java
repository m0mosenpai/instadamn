package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.R;
import java.io.File;
import java.util.Random;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUN implements Callable {
    public final long A00;
    public final Context A01;
    public final Paint A02;
    public final Rect A03;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap createBitmap;
        Context context = this.A01;
        if (C50745Maz.A09 == null) {
            File A0w = MSW.A0w(context.getExternalFilesDir(null), "StaticAnimationDrawable");
            C50745Maz.A09 = A0w;
            A0w.mkdirs();
        }
        File A0w2 = MSW.A0w(C50745Maz.A09, "static_tile_1");
        if (A0w2.exists()) {
            createBitmap = C25821No.A00().A0G(AbstractC81033jX.A01(A0w2));
            if (createBitmap == null) {
                A0w2.delete();
            }
            System.currentTimeMillis();
            createBitmap.getWidth();
            createBitmap.getHeight();
            createBitmap.getByteCount();
            return createBitmap;
        }
        int A0A = AbstractC166987dD.A0A(AbstractC13880nE.A0A(context), 0.333f);
        createBitmap = Bitmap.createBitmap(A0A, A0A, Bitmap.Config.ARGB_8888);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        Random random = new Random();
        int round = Math.round(AbstractC13880nE.A00(context, 1.0f));
        for (int i = 0; i < A0A; i += round) {
            int i2 = 0;
            while (i2 < A0A) {
                Paint paint = this.A02;
                paint.setAlpha(random.nextInt(255));
                Rect rect = this.A03;
                int i3 = i2 + round;
                rect.set(i, i2, i + round, i3);
                A06.drawRect(rect, paint);
                i2 = i3;
            }
        }
        C0fK.A02(Bitmap.CompressFormat.PNG, createBitmap, MSW.A0x(A0w2.getCanonicalFile()), 100);
        System.currentTimeMillis();
        createBitmap.getWidth();
        createBitmap.getHeight();
        createBitmap.getByteCount();
        return createBitmap;
    }

    public PUN(Context context, long j) {
        this.A01 = context;
        this.A00 = j;
        Paint paint = new Paint(2);
        this.A02 = paint;
        C1GL c1gl = C50745Maz.A0A;
        AbstractC166987dD.A1N(context, paint, R.color.grey_5);
        paint.setStyle(Paint.Style.FILL);
        this.A03 = AbstractC166987dD.A0U();
    }
}
