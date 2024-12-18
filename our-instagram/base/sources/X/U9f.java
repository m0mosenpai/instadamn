package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.style.DynamicDrawableSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U9f extends DynamicDrawableSpan {
    public float A00;
    public final Bitmap A01;
    public final List A02;
    public final int A03;
    public final OIJ A04;

    public U9f(Layout layout, OIJ oij, CharSequence charSequence, float f, int i) {
        AbstractC167007dF.A1F(layout, 1, oij);
        this.A03 = i;
        this.A04 = oij;
        this.A00 = f;
        this.A02 = new ArrayList();
        StaticLayout staticLayout = new StaticLayout(charSequence, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_NORMAL, layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, (int) staticLayout.getLineWidth(0)), Math.max(1, staticLayout.getHeight()), Bitmap.Config.ARGB_8888);
        staticLayout.draw(new Canvas(createBitmap));
        this.A01 = createBitmap;
    }

    @Override // android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return null;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.A01.getWidth();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        LinkedHashMap linkedHashMap;
        Path path;
        UPD upd;
        UPD upd2;
        UPD upd3;
        int i6;
        RectF rectF;
        AbstractC167007dF.A1I(canvas, 0, paint);
        for (C70092W2p c70092W2p : this.A02) {
            float f2 = this.A00;
            OIJ oij = this.A04;
            C14360o3.A0B(oij, 10);
            Map map = c70092W2p.A05;
            Number number = (Number) AbstractC166997dE.A0m(map, i);
            if (number != null) {
                int intValue = number.intValue();
                C66620UPh A00 = oij.A00(intValue);
                if (A00 == null) {
                    A00 = new C66620UPh(null, null);
                }
                C66620UPh A002 = oij.A00(intValue - 1);
                if (A002 == null) {
                    A002 = new C66620UPh(null, null);
                }
                if (intValue <= 0 || !A00.A00(A002, f2)) {
                    while (number.intValue() < map.size() - 1) {
                        C66620UPh A003 = oij.A00(number.intValue() + 1);
                        if (A003 == null) {
                            A003 = new C66620UPh(null, null);
                        }
                        if (!A00.A00(A003, f2)) {
                            break;
                        } else {
                            number = Integer.valueOf(number.intValue() + 1);
                        }
                    }
                    int intValue2 = number.intValue();
                    List list = c70092W2p.A04;
                    if (intValue == intValue2) {
                        List A1J = AbstractC166987dD.A1J(list.get(intValue));
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj : A1J) {
                            ((List) JQ0.A0h(Integer.valueOf(((UPD) obj).A03), linkedHashMap)).add(obj);
                        }
                    } else {
                        List subList = list.subList(intValue, intValue2 + 1);
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : subList) {
                            ((List) JQ0.A0h(Integer.valueOf(((UPD) obj2).A03), linkedHashMap)).add(obj2);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = AbstractC001800i.A0Z(linkedHashMap.keySet()).iterator();
                    while (it.hasNext()) {
                        int A0B = AbstractC167007dF.A0B(it);
                        List list2 = (List) AbstractC58319PtB.A0n(linkedHashMap, A0B);
                        if (list2 == null) {
                            list2 = C16930sl.A00;
                        }
                        UPE upe = (UPE) AbstractC001800i.A0O(c70092W2p.A03, A0B);
                        if (upe != null) {
                            int i7 = upe.A05;
                            Number number2 = (Number) AbstractC166997dE.A0m(map, i7);
                            if (number2 != null && (upd = (UPD) list.get(number2.intValue())) != null && (upd2 = (UPD) AbstractC001800i.A0J(list2)) != null && (upd3 = (UPD) AbstractC001800i.A0L(list2)) != null) {
                                int i8 = upd2.A04;
                                if (i8 == i7 && Math.abs(upd3.A02 - upe.A04) <= 1) {
                                    rectF = new RectF(upe.A01 - c70092W2p.A01, upe.A03, upe.A02 + c70092W2p.A00, upe.A00);
                                } else {
                                    if (i7 < i8) {
                                        i6 = C70092W2p.A00(paint, c70092W2p, charSequence, upd.A01, upd2.A01 - 1);
                                    } else {
                                        i6 = 0;
                                    }
                                    float f3 = upe.A01 + i6;
                                    rectF = new RectF(f3 - c70092W2p.A01, upe.A03, C70092W2p.A00(paint, c70092W2p, charSequence, upd2.A01, upd3.A01) + f3 + c70092W2p.A00, upe.A00);
                                }
                                arrayList.add(rectF);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        path = new Path();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            RectF rectF2 = (RectF) it2.next();
                            arrayList2.add(new PointF(rectF2.right, rectF2.top));
                            arrayList2.add(new PointF(rectF2.right, rectF2.bottom));
                            arrayList3.add(new PointF(rectF2.left, rectF2.top));
                            arrayList3.add(new PointF(rectF2.left, rectF2.bottom));
                        }
                        path = new Path();
                        path.moveTo(((PointF) arrayList3.get(0)).x, ((PointF) arrayList3.get(0)).y);
                        int size = arrayList3.size();
                        for (int i9 = 1; i9 < size; i9++) {
                            path.lineTo(((PointF) arrayList3.get(i9)).x, ((PointF) arrayList3.get(i9)).y);
                        }
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            path.lineTo(((PointF) arrayList2.get(size2)).x, ((PointF) arrayList2.get(size2)).y);
                        }
                        path.close();
                    }
                    C66620UPh A004 = oij.A00(intValue);
                    if (A004 == null) {
                        canvas.drawPath(path, c70092W2p.A02);
                    } else {
                        canvas.save();
                        C26674Bq9 c26674Bq9 = A004.A01;
                        if (c26674Bq9 != null) {
                            PointF A005 = c26674Bq9.A00(f2);
                            canvas.translate(A005.x, A005.y);
                        }
                        C26675BqA c26675BqA = A004.A00;
                        if (c26675BqA != null) {
                            c70092W2p.A02.setAlpha(C1H4.A01(c26675BqA.A00(f2) * 255.0f));
                        }
                        canvas.drawPath(path, c70092W2p.A02);
                        canvas.restore();
                    }
                }
            }
        }
        C66620UPh A006 = this.A04.A00(this.A03);
        if (A006 == null) {
            canvas.drawBitmap(this.A01, f, i3, paint);
            return;
        }
        canvas.save();
        C26674Bq9 c26674Bq92 = A006.A01;
        if (c26674Bq92 != null) {
            PointF A007 = c26674Bq92.A00(this.A00);
            canvas.translate(A007.x, A007.y);
        }
        C26675BqA c26675BqA2 = A006.A00;
        if (c26675BqA2 != null) {
            paint.setAlpha(C1H4.A01(Float.valueOf(c26675BqA2.A00(this.A00)).floatValue() * 255.0f));
        }
        canvas.drawBitmap(this.A01, f, i3, paint);
        canvas.restore();
        paint.setAlpha(255);
    }
}
