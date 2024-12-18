package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class M49 implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C49165Loi A01;

    public M49(Drawable drawable, C49165Loi c49165Loi) {
        this.A01 = c49165Loi;
        this.A00 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04.setImageDrawable(this.A00);
    }
}
