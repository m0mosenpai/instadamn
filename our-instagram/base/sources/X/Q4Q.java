package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q4Q extends View {
    public int A00;
    public int A01;
    public boolean A02;
    public final Matrix A03;
    public final Matrix A04;
    public final Paint A05;
    public final SJK A06;
    public final Object A07;
    public final List A08;

    public Q4Q(Context context) {
        super(context, null);
        this.A07 = AbstractC58318PtA.A0b();
        this.A08 = AbstractC166987dD.A1E();
        this.A04 = AbstractC166987dD.A0Q();
        this.A03 = AbstractC166987dD.A0Q();
        this.A02 = true;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setAntiAlias(true);
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeWidth(AbstractC13880nE.A00(context, 1.0f));
        this.A05 = A0R;
        this.A06 = new SJK(context, new J7Q(this, 42));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        A01(canvas, C05F.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.SKl, X.RW4] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.SGT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUnderlayBitmap(android.graphics.Bitmap r32) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4Q.setUnderlayBitmap(android.graphics.Bitmap):void");
    }

    private final void A00() {
        int i;
        int i2;
        if (this.A02 && (i = this.A01) > 0 && (i2 = this.A00) > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            Matrix matrix = this.A04;
            matrix.reset();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.invert(this.A03);
            this.A02 = false;
        }
    }

    private final void A01(Canvas canvas, Integer num) {
        Q4Q q4q;
        Bitmap bitmap;
        synchronized (this.A07) {
            A00();
            for (AbstractC62654SKn abstractC62654SKn : this.A08) {
                if (abstractC62654SKn instanceof C60933Rbn) {
                    C60933Rbn c60933Rbn = (C60933Rbn) abstractC62654SKn;
                    C14360o3.A0B(num, 1);
                    Canvas canvas2 = c60933Rbn.A02;
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    Paint paint = c60933Rbn.A03;
                    paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
                    q4q = ((AbstractC62654SKn) c60933Rbn).A00;
                    paint.setStrokeWidth(AbstractC13880nE.A00(AbstractC166997dE.A0L(q4q), 1.0f));
                    for (C62518SEu c62518SEu : c60933Rbn.A04) {
                        if (num == C05F.A00 || c62518SEu.A00) {
                            RectF rectF = new RectF(c62518SEu.A01);
                            float f = -c60933Rbn.A00;
                            rectF.inset(f, f);
                            if (c62518SEu.A00) {
                                AbstractC166987dD.A1R(paint);
                            }
                            canvas2.drawRect(rectF, paint);
                            AbstractC43592JPx.A1E(paint);
                        }
                    }
                    bitmap = c60933Rbn.A01;
                } else if (abstractC62654SKn instanceof C60932Rbm) {
                    C60932Rbm c60932Rbm = (C60932Rbm) abstractC62654SKn;
                    C14360o3.A0B(num, 1);
                    Canvas canvas3 = c60932Rbm.A01;
                    canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
                    Paint paint2 = c60932Rbm.A02;
                    paint2.setPathEffect(null);
                    AbstractC43592JPx.A1E(paint2);
                    Q4Q q4q2 = ((AbstractC62654SKn) c60932Rbm).A00;
                    paint2.setStrokeWidth(AbstractC13880nE.A00(AbstractC166997dE.A0L(q4q2), 2.0f));
                    Iterator it = c60932Rbm.A03.iterator();
                    while (it.hasNext()) {
                        canvas3.drawPath((Path) it.next(), paint2);
                    }
                    canvas.drawBitmap(c60932Rbm.A00, q4q2.A04, null);
                } else {
                    C60931Rbl c60931Rbl = (C60931Rbl) abstractC62654SKn;
                    bitmap = c60931Rbl.A00;
                    q4q = ((AbstractC62654SKn) c60931Rbl).A00;
                }
                canvas.drawBitmap(bitmap, q4q.A04, null);
            }
        }
    }

    public final void A02(AbstractC62654SKn abstractC62654SKn) {
        synchronized (this.A07) {
            this.A08.add(abstractC62654SKn);
        }
    }

    public final int getImageHeight() {
        return this.A00;
    }

    public final int getImageWidth() {
        return this.A01;
    }

    public final Matrix getInverseTransformationMatrix() {
        return this.A03;
    }

    public final Paint getPaint() {
        return this.A05;
    }

    public final Matrix getTransformationMatrix() {
        return this.A04;
    }

    public final Bitmap getOverlayBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        A01(new Canvas(createBitmap), C05F.A01);
        return createBitmap;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1739908528);
        super.onSizeChanged(i, i2, i3, i4);
        synchronized (this.A07) {
            try {
                this.A02 = true;
                A00();
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                C0f9.A0D(-1215230562, A06);
                throw th;
            }
        }
        C0f9.A0D(1704923802, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-308163325);
        C14360o3.A0B(motionEvent, 0);
        motionEvent.transform(this.A03);
        SJK sjk = this.A06;
        EnumC61118RfY enumC61118RfY = sjk.A02;
        EnumC61118RfY enumC61118RfY2 = EnumC61118RfY.A03;
        if (enumC61118RfY == enumC61118RfY2) {
            if (motionEvent.getActionMasked() == 0) {
                Iterator it = sjk.A04.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C62518SEu) next).A01.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (next != null) {
                            enumC61118RfY = EnumC61118RfY.A04;
                        }
                    }
                }
            }
            enumC61118RfY = EnumC61118RfY.A02;
            sjk.A02 = enumC61118RfY;
        }
        int ordinal = enumC61118RfY.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                sjk.A05.onTouchEvent(motionEvent);
            }
        } else {
            sjk.A01 = new PointF(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        PointF pointF = new PointF((sjk.A01.x + motionEvent.getX()) / 2.0f, (sjk.A01.y + motionEvent.getY()) / 2.0f);
                        sjk.A00.quadTo(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
                    }
                } else {
                    sjk.A00 = AbstractC166987dD.A0T();
                    sjk.A02 = enumC61118RfY2;
                }
            } else {
                List list = sjk.A03;
                Path path = sjk.A00;
                path.moveTo(motionEvent.getX(), motionEvent.getY());
                list.add(path);
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                c006802i.markerStart(391261324, 0);
                c006802i.markerEnd(391261324, 0, (short) 2);
            }
            sjk.A08.invoke();
        }
        C0f9.A0C(949199816, A05);
        return true;
    }
}
