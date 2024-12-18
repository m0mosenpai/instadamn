package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8D0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8D0 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.AAO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.AAO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.AAO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.AAO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.AAO, java.lang.Object] */
    public final AAO A01() {
        if (this instanceof C221639qS) {
            C221639qS c221639qS = (C221639qS) this;
            ?? obj = new Object();
            obj.A08 = C05F.A0C;
            obj.A06 = c221639qS.A02;
            obj.A02 = c221639qS.A00;
            obj.A03 = c221639qS.A01;
            return obj;
        }
        if (this instanceof C183748Cz) {
            C183748Cz c183748Cz = (C183748Cz) this;
            ?? obj2 = new Object();
            obj2.A08 = C05F.A00;
            obj2.A00 = c183748Cz.A00;
            obj2.A01 = c183748Cz.A01;
            return obj2;
        }
        if (this instanceof C221629qR) {
            C221629qR c221629qR = (C221629qR) this;
            ?? obj3 = new Object();
            obj3.A08 = C05F.A01;
            obj3.A04 = c221629qR.A00;
            obj3.A05 = c221629qR.A01;
            return obj3;
        }
        if (this instanceof C221649qT) {
            ?? obj4 = new Object();
            obj4.A08 = C05F.A0Y;
            return obj4;
        }
        ?? obj5 = new Object();
        obj5.A08 = C05F.A0N;
        obj5.A07 = ((C221619qQ) this).A00;
        return obj5;
    }

    public final void A02(Drawable drawable, List list, int i, int i2) {
        Rect rect;
        int i3;
        int max;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this instanceof C183748Cz) {
            C183748Cz c183748Cz = (C183748Cz) this;
            i4 = (int) (c183748Cz.A00 * (i - drawable.getIntrinsicWidth()));
            i5 = (int) (c183748Cz.A01 * (i2 - drawable.getIntrinsicHeight()));
            i6 = drawable.getIntrinsicWidth() + i4;
            i7 = drawable.getIntrinsicHeight() + i5;
        } else {
            if (this instanceof C221639qS) {
                C221639qS c221639qS = (C221639qS) this;
                Rect rect2 = new Rect(0, 0, i, i2);
                rect = new Rect();
                Gravity.apply(c221639qS.A02, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect2, rect);
                i3 = (int) c221639qS.A00;
                max = (int) c221639qS.A01;
            } else {
                if (this instanceof C221619qQ) {
                    rect = ((C221619qQ) this).A00;
                    drawable.setBounds(rect);
                    return;
                }
                if (this instanceof C221629qR) {
                    C221629qR c221629qR = (C221629qR) this;
                    int i8 = (int) (c221629qR.A00 * i);
                    int i9 = (int) (c221629qR.A01 * i2);
                    int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                    int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                    i4 = i8 - intrinsicWidth;
                    i5 = i9 - intrinsicHeight;
                    i6 = i8 + intrinsicWidth;
                    i7 = i9 + intrinsicHeight;
                } else {
                    Collections.sort(list, new C9J7(12));
                    int intrinsicWidth2 = (i - drawable.getIntrinsicWidth()) / 2;
                    int intrinsicHeight2 = (int) ((i2 * ((C221649qT) this).A00) - drawable.getIntrinsicHeight());
                    rect = new Rect(intrinsicWidth2, intrinsicHeight2, drawable.getIntrinsicWidth() + intrinsicWidth2, drawable.getIntrinsicHeight() + intrinsicHeight2);
                    Iterator it = list.iterator();
                    do {
                        i3 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Rect rect3 = (Rect) it.next();
                        if (Rect.intersects(rect3, rect)) {
                            rect.offset(0, -Math.abs(rect.bottom - rect3.top));
                        }
                    } while (rect.centerY() >= i2 / 2);
                    max = Math.max(rect.top, (i2 - drawable.getIntrinsicHeight()) / 2) - rect.top;
                }
            }
            rect.offset(i3, max);
            drawable.setBounds(rect);
            return;
        }
        drawable.setBounds(i4, i5, i6, i7);
    }
}
