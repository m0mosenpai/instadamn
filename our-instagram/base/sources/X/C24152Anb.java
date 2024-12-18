package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Anb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24152Anb implements BD3 {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C89F A01;
    public final /* synthetic */ C1815783k A02;

    @Override // X.BD3
    public final /* synthetic */ void DiN(float f) {
    }

    public C24152Anb(Drawable drawable, C89F c89f, C1815783k c1815783k) {
        this.A00 = drawable;
        this.A01 = c89f;
        this.A02 = c1815783k;
    }

    @Override // X.BD3
    public final void DIZ(boolean z) {
        Drawable drawable = this.A00;
        if (z) {
            AbstractC202808xy.A03(drawable, this.A01, 0.0f);
            this.A02.A00();
        } else {
            C1815783k c1815783k = this.A02;
            AbstractC202808xy.A03(drawable, this.A01, c1815783k.A01 * 0.04f);
            c1815783k.A01();
        }
    }
}
