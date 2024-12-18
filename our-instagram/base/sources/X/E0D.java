package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class E0D extends AbstractC70653Fc {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04 = 5;
    public final boolean A05;

    public E0D(float f, int i, int i2, int i3, boolean z) {
        this.A00 = f;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.graphics.Rect r8, int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            r0 = r10
            if (r12 == 0) goto L7
            int r0 = r7.A03
            int r0 = r10 - r0
        L7:
            float r1 = (float) r0
            float r4 = r7.A00
            float r6 = (float) r9
            float r3 = r4 * r6
            float r1 = r1 - r3
            float r1 = r1 / r6
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r1 = (int) r1
            int r5 = r7.A02
            if (r1 >= r5) goto L18
            r1 = r5
        L18:
            if (r13 == 0) goto L63
            r0 = r10
            if (r12 == 0) goto L21
            int r0 = r7.A03
            int r0 = r10 - r0
        L21:
            float r2 = (float) r0
            float r2 = r2 - r3
            float r2 = r2 / r6
            int r3 = r7.A01
            int r0 = r9 * 2
            int r1 = r3 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r1 = (int) r2
            if (r1 >= r5) goto L63
            int r2 = r9 + (-1)
            if (r12 == 0) goto L39
            int r0 = r7.A03
            int r10 = r10 - r0
        L39:
            float r1 = (float) r10
            float r0 = (float) r2
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 / r0
            int r0 = r2 * 2
            int r3 = r3 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r3
            float r1 = r1 - r0
            int r1 = (int) r1
        L47:
            if (r2 == 0) goto L4a
            r9 = r2
        L4a:
            r0 = 0
            r8.top = r0
            r8.bottom = r0
            if (r11 != 0) goto L60
            int r0 = r7.A01
            r8.left = r0
        L55:
            int r0 = r9 + (-1)
            if (r11 != r0) goto L5d
            if (r13 != 0) goto L5d
            int r1 = r7.A01
        L5d:
            r8.right = r1
            return
        L60:
            r8.left = r1
            goto L55
        L63:
            r2 = r9
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0D.A00(android.graphics.Rect, int, int, int, boolean, boolean):void");
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        boolean A1b = AbstractC25233BEq.A1b(rect, view, recyclerView);
        int measuredWidth = recyclerView.getMeasuredWidth();
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            int itemCount = c2uu.getItemCount();
            float floor = (float) Math.floor(measuredWidth / (this.A00 + (this.A02 * 2)));
            int A02 = RecyclerView.A02(view);
            if (floor >= itemCount && itemCount <= this.A04) {
                A00(rect, itemCount, measuredWidth, A02, false, this.A05);
            } else {
                A00(rect, this.A04, measuredWidth, A02, A1b, this.A05);
            }
        }
    }
}
