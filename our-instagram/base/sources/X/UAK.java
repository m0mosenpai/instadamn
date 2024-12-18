package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UAK extends View {
    public final ArrayList A00;
    public final /* synthetic */ C69338Vlk A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UAK(Context context, C69338Vlk c69338Vlk, ArrayList arrayList) {
        super(context);
        this.A01 = c69338Vlk;
        this.A00 = arrayList;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C69466Vnp c69466Vnp = (C69466Vnp) it.next();
            Matrix matrix = c69466Vnp.A0D;
            matrix.reset();
            matrix.postTranslate(c69466Vnp.A02, c69466Vnp.A03);
            Paint paint = c69466Vnp.A0E;
            paint.setAlpha(c69466Vnp.A08);
            canvas.drawBitmap(c69466Vnp.A0C, matrix, paint);
        }
    }
}
