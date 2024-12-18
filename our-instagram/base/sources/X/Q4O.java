package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4O extends View {
    public List A00;
    public final HashMap A01;
    public final HashMap A02;
    public final Paint A03;
    public final Paint A04;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        Iterator A0k = AbstractC167007dF.A0k(this.A02);
        while (A0k.hasNext()) {
            C62545SFw c62545SFw = (C62545SFw) A0k.next();
            Paint paint = this.A04;
            paint.setColor(c62545SFw.A00);
            canvas.drawRect(c62545SFw.A02, paint);
            int i = c62545SFw.A01;
            RunnableC64638TNu runnableC64638TNu = new RunnableC64638TNu(this, i);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(i);
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, runnableC64638TNu);
                C63255SgD.A00().postDelayed(runnableC64638TNu, 2000L);
            }
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.A03);
        }
    }

    public final void setHighlightedElementsRectangles(List list) {
        C14360o3.A0B(list, 0);
        this.A00 = list;
        invalidate();
    }

    public final void setTraceUpdates(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62545SFw c62545SFw = (C62545SFw) it.next();
            int i = c62545SFw.A01;
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                C63255SgD.A00().removeCallbacks((Runnable) hashMap.get(valueOf));
                hashMap.remove(valueOf);
            }
            this.A02.put(valueOf, c62545SFw);
        }
        invalidate();
    }

    public Q4O(Context context) {
        super(context);
        Paint A0R = AbstractC166987dD.A0R();
        this.A04 = A0R;
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A03 = A0R2;
        this.A00 = AbstractC166987dD.A1E();
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeWidth(6.0f);
        AbstractC166987dD.A1R(A0R2);
        A0R2.setColor(-859248897);
    }
}
