package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes11.dex */
public final class U8O extends Drawable {
    public float A00;
    public long A01;
    public long A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final long A09;
    public final Path A0A;
    public final RectF A0B;
    public final U98 A0C;
    public final LinkedList A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        C14360o3.A0B(canvas, 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.A01;
        if (j == 0) {
            j = uptimeMillis - 16;
            this.A01 = j;
        }
        long j2 = uptimeMillis - j;
        if (j2 > 60) {
            j2 = 60;
        }
        this.A01 = uptimeMillis;
        List<C69606Vs9> list = this.A0G;
        ArrayList arrayList = null;
        for (C69606Vs9 c69606Vs9 : list) {
            float f = ((float) j2) / 1000.0f;
            C69719VuE c69719VuE = c69606Vs9.A03;
            c69719VuE.A00(f);
            C69627VsU c69627VsU = c69606Vs9.A04;
            c69719VuE.A01(c69627VsU, f);
            c69606Vs9.A00 += j2;
            if (c69627VsU.A06 > getBounds().bottom + (c69606Vs9.A02.A00 * c69627VsU.A03)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c69606Vs9);
            }
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
            this.A0D.addAll(arrayList);
        }
        long j3 = this.A02 - j2;
        this.A02 = j3;
        if (j3 <= 0 && AbstractC166997dE.A0H(this) > 0) {
            this.A02 = (this.A09 * 100) / AbstractC166997dE.A0H(this);
            C69606Vs9 c69606Vs92 = (C69606Vs9) this.A0D.poll();
            if (c69606Vs92 == null) {
                List list2 = this.A0F;
                C50722Ut c50722Ut = AbstractC50712Us.A00;
                C69206VjZ c69206VjZ = (C69206VjZ) AbstractC001800i.A0G(list2, c50722Ut);
                if (c69206VjZ.A03 == VD4.A06) {
                    paint = new Paint(6);
                    paint.setAlpha((int) (this.A06 * 255.0f));
                } else {
                    paint = (Paint) AbstractC001800i.A0G(this.A0E, c50722Ut);
                }
                c69606Vs92 = new C69606Vs9(paint, c69206VjZ, AbstractC50712Us.A01.A08(1000L));
            }
            list.add(c69606Vs92);
            C69627VsU c69627VsU2 = c69606Vs92.A04;
            float f2 = getBounds().left;
            float f3 = getBounds().right;
            AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
            c69627VsU2.A05 = f2 + (abstractC50712Us.A02() * (f3 - f2));
            c69627VsU2.A06 = getBounds().top - (c69606Vs92.A02.A00 * c69627VsU2.A03);
            c69627VsU2.A02 = abstractC50712Us.A02() * 360.0f;
            float A02 = 0.6f + (abstractC50712Us.A02() * (1.1f - 0.6f));
            c69627VsU2.A03 = A02;
            c69627VsU2.A04 = A02;
            C69719VuE c69719VuE2 = c69606Vs92.A03;
            c69719VuE2.A09 = this.A08;
            float f4 = this.A07;
            float f5 = (-1.0f) * f4;
            c69719VuE2.A04 = f5 + (abstractC50712Us.A02() * (f4 - f5));
        }
        if (this.A05) {
            Path path = this.A0A;
            path.rewind();
            RectF rectF = this.A0B;
            float f6 = this.A00;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
            this.A05 = false;
        }
        Path path2 = this.A0A;
        int save = canvas.save();
        canvas.clipPath(path2);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C69606Vs9) it.next()).A00(canvas);
            }
            canvas.restoreToCount(save);
            this.A0C.postDelayed(new RunnableC71273Wr2(this), 33L);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        Path path = this.A0A;
        path.rewind();
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A02 = 0L;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ U8O(Context context) {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 2);
        this.A07 = 180.0f;
        this.A06 = 0.4f;
        this.A03 = "";
        ArrayList A01 = W6T.A01(context);
        ArrayList A0q = AbstractC167017dG.A0q(c16930sl);
        Iterator it = c16930sl.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            VD4 vd4 = VD4.A06;
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            A0q.add(new C69206VjZ(new C68925VeP(AbstractC46577KjG.A00(resources, drawable, 1), new int[]{0}), vd4));
        }
        this.A0F = AbstractC001800i.A0S(A0q, A01);
        ArrayList arrayList = new ArrayList();
        this.A0G = arrayList;
        this.A0D = new LinkedList();
        C14360o3.A07(context.getResources());
        this.A08 = AbstractC69815Vw1.A01(r1, 50.0f);
        this.A09 = C1H4.A02(4000.0f / AbstractC65702TsY.A00(context));
        this.A0E = W6T.A02((int) (0.4f * 255.0f));
        this.A0H = arrayList;
        this.A0C = new U98(this);
        this.A0A = new Path();
        this.A0B = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setAlpha((int) (this.A06 * i));
        }
    }
}
