package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.widget.nametag.NametagCardView;

/* renamed from: X.9GS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GS implements Drawable.Callback {
    public final int A00;
    public final Object A01;

    public C9GS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j;
        switch (this.A00) {
            case 0:
                C5Y8 c5y8 = (C5Y8) this.A01;
                InterfaceC74953Yl interfaceC74953Yl = c5y8.A01;
                interfaceC74953Yl.Egh(Integer.valueOf(((Number) interfaceC74953Yl.getValue()).intValue() + 1));
                Drawable drawable2 = c5y8.A00;
                InterfaceC09390do interfaceC09390do = C5Y9.A00;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j = C5YB.A00(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j = 9205357640488583168L;
                }
                c5y8.A02.Egh(new C5YC(j));
                return;
            case 1:
                C220789p2 c220789p2 = (C220789p2) this.A01;
                C6RB c6rb = c220789p2.A0k;
                if (drawable == c6rb) {
                    c220789p2.A05 = c6rb.A0A;
                    c220789p2.A02 = c6rb.A06;
                    return;
                }
                C6RB c6rb2 = c220789p2.A0l;
                if (drawable == c6rb2) {
                    c220789p2.A09 = c6rb2.A0A;
                    c220789p2.A06 = c6rb2.A06;
                    return;
                }
                C6RB c6rb3 = c220789p2.A0C;
                if (drawable == c6rb3) {
                    c6rb3.getClass();
                    c220789p2.A04 = c6rb3.A0A;
                    c220789p2.A03 = c220789p2.A0C.A06;
                    return;
                } else {
                    C6RB c6rb4 = c220789p2.A0D;
                    if (drawable != c6rb4) {
                        return;
                    }
                    c6rb4.getClass();
                    c220789p2.A08 = c6rb4.A0A;
                    c220789p2.A07 = c220789p2.A0D.A06;
                    return;
                }
            case 2:
                IgEditText igEditText = ((C45466KBb) this.A01).A0I;
                if (igEditText == null) {
                    C14360o3.A0F("noteEditText");
                    throw C00O.createAndThrow();
                }
                igEditText.invalidate();
                return;
            default:
                C11T.A02(((NametagCardView) this.A01).A0A);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.A00 == 0) {
            C14360o3.A0B(runnable, 1);
            ((Handler) C5Y9.A00.getValue()).postAtTime(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.A00 == 0) {
            C14360o3.A0B(runnable, 1);
            ((Handler) C5Y9.A00.getValue()).removeCallbacks(runnable);
        }
    }
}
