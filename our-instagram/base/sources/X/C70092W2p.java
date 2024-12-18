package X;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.text.Layout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.W2p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70092W2p {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final List A03;
    public final List A04;
    public final Map A05;

    public C70092W2p(Layout layout, List list, float f, float f2, float f3, float f4, float f5, int i) {
        List<UPD> list2;
        C14360o3.A0B(layout, 1);
        this.A01 = f;
        this.A00 = f2;
        layout.getText().toString();
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            arrayList.add(new UPE(layout.getLineLeft(i2), layout.getLineRight(i2), layout.getLineStart(i2), layout.getLineTop(i2) - f3, layout.getLineEnd(i2), layout.getLineBottom(i2) + f4));
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            UPE upe = (UPE) AbstractC001800i.A0I(arrayList);
            int size = arrayList.size();
            for (int i3 = 1; i3 < size; i3++) {
                UPE upe2 = (UPE) arrayList.get(i3);
                float f6 = upe.A01;
                float f7 = upe2.A01;
                float f8 = upe.A02;
                float f9 = upe2.A02;
                if (Math.abs(f7 - f6) < f5) {
                    f6 = Math.min(upe.A01, upe2.A01);
                    f7 = f6;
                }
                if (Math.abs(upe2.A02 - upe.A02) < f5) {
                    f8 = Math.max(upe.A02, upe2.A02);
                    f9 = f8;
                }
                float f10 = f6;
                arrayList2.add(new UPE(f10, f8, upe.A05, upe.A03, upe.A04, upe.A00));
                upe = new UPE(f7, f9, upe2.A05, upe2.A03, upe2.A04, upe2.A00);
            }
            arrayList2.add(upe);
            arrayList = arrayList2;
        }
        this.A03 = arrayList;
        UQ7 uq7 = (UQ7) AbstractC001800i.A0J(list);
        if (uq7 == null) {
            list2 = C16930sl.A00;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i4 = uq7.A02;
            int i5 = uq7.A01;
            int i6 = uq7.A03;
            int i7 = uq7.A00;
            int size2 = list.size();
            for (int i8 = 1; i8 < size2; i8++) {
                UQ7 uq72 = (UQ7) list.get(i8);
                if (uq72.A00 == i7) {
                    i6 += uq72.A03;
                    i5 = uq72.A01;
                } else {
                    arrayList3.add(new UPD(i4, i5, layout.getLineForOffset(i4), i6, i7, 1));
                    i4 = uq72.A02;
                    i5 = uq72.A01;
                    i6 = uq72.A03;
                    i7 = uq72.A00;
                }
            }
            arrayList3.add(new UPD(i4, i5, layout.getLineForOffset(i4), i6, i7, 1));
            list2 = arrayList3;
        }
        this.A04 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UPD upd : list2) {
            AbstractC37301Gc2.A1T(Integer.valueOf(upd.A04), linkedHashMap, upd.A01);
        }
        this.A05 = linkedHashMap;
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setPathEffect(new CornerPathEffect(f5));
    }

    public static final int A00(Paint paint, C70092W2p c70092W2p, CharSequence charSequence, int i, int i2) {
        int i3;
        if (charSequence == null) {
            return 0;
        }
        int i4 = i2 + 1;
        int i5 = 0;
        while (i < i4) {
            List list = c70092W2p.A04;
            i5 += ((UPD) list.get(i)).A05;
            int i6 = i + 1;
            if (i6 < list.size() && ((UPD) list.get(i6)).A03 == ((UPD) list.get(i)).A03) {
                if (charSequence.length() > ((UPD) list.get(i)).A02 && charSequence.length() > ((UPD) list.get(i6)).A04) {
                    i3 = C1H4.A01(paint.measureText(charSequence, ((UPD) list.get(i)).A02, ((UPD) list.get(i6)).A04));
                } else {
                    i3 = 0;
                }
                i5 += i3;
            }
            i = i6;
        }
        return i5;
    }
}
