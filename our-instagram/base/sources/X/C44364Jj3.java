package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jj3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44364Jj3 extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public List A01;
    public final int A03;
    public final Context A04;
    public final List A06;
    public final Paint A05 = AbstractC166987dD.A0S(3);
    public boolean A02 = true;

    public C44364Jj3(Context context, List list) {
        int i;
        this.A04 = context;
        this.A06 = list;
        this.A01 = C16930sl.A00;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        Resources resources = context.getResources();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = R.dimen.afi_margin_top;
                    } else {
                        return;
                    }
                } else {
                    i = R.dimen.account_discovery_bottom_gap;
                }
            } else {
                i = R.dimen.abc_dialog_padding_top_material;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            List list2 = this.A01;
            C89533yt c89533yt = new C89533yt((ImageUrl) this.A06.get(i2), "ScatteredPileDrawable", dimensionPixelSize, 0, 0, 0);
            c89533yt.setCallback(this);
            this.A01 = AbstractC001800i.A0T(c89533yt, list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r5 = 0
            X.C14360o3.A0B(r11, r5)
            android.graphics.Rect r3 = X.AbstractC166987dD.A0W(r10)
            int r0 = r3.width()
            if (r0 <= 0) goto Lca
            int r0 = r3.height()
            if (r0 <= 0) goto Lca
            boolean r0 = r10.A02
            java.lang.String r9 = "Required value was null."
            r4 = 1
            if (r0 == 0) goto La4
            android.graphics.Bitmap r2 = r10.A00
            if (r2 == 0) goto L8e
            int r1 = r2.getWidth()
            int r0 = r3.width()
            if (r1 != r0) goto L8b
            int r1 = r2.getHeight()
            int r0 = r3.height()
            if (r1 != r0) goto L8b
            r2.eraseColor(r5)
        L36:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto L9f
            android.graphics.Canvas r8 = X.AbstractC43592JPx.A06(r0)
            android.content.Context r0 = r10.A04
            android.content.res.Resources r7 = r0.getResources()
            java.util.List r6 = r10.A01
            int r5 = r6.size()
            r2 = 0
        L4b:
            if (r2 >= r5) goto La4
            r8.save()
            if (r2 == 0) goto L82
            if (r2 == r4) goto L77
            r0 = 2
            if (r2 != r0) goto La4
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            float r1 = X.AbstractC166987dD.A04(r7, r0)
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
        L61:
            float r0 = X.AbstractC166987dD.A04(r7, r0)
            r8.translate(r1, r0)
            java.lang.Object r0 = r6.get(r2)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r8)
            r8.restore()
            int r2 = r2 + 1
            goto L4b
        L77:
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            float r1 = X.AbstractC166987dD.A04(r7, r0)
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            goto L61
        L82:
            int r0 = X.AbstractC166997dE.A05(r7)
            float r1 = (float) r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            goto L61
        L8b:
            r2.recycle()
        L8e:
            int r2 = r3.width()
            int r1 = r3.height()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r10.A00 = r0
            goto L36
        L9f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r9)
            throw r0
        La4:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto Lc3
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto Lc3
            android.graphics.Bitmap r4 = r10.A00
            if (r4 == 0) goto Lbe
            int r0 = r3.left
            float r2 = (float) r0
            int r0 = r3.top
            float r1 = (float) r0
            android.graphics.Paint r0 = r10.A05
            r11.drawBitmap(r4, r2, r1, r0)
            return
        Lbe:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r9)
            throw r0
        Lc3:
            java.lang.String r1 = "PileDrawable"
            java.lang.String r0 = "bitmap is null or recycled"
            X.C0w9.A03(r1, r0)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44364Jj3.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.A02 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(colorFilter);
        }
    }
}
