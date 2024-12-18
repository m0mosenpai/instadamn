package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Ang, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24157Ang implements C89G {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C23102AGo A01;

    @Override // X.C89G
    public final /* synthetic */ void DM8(int i) {
    }

    public C24157Ang(Drawable drawable, C23102AGo c23102AGo) {
        this.A01 = c23102AGo;
        this.A00 = drawable;
    }

    @Override // X.C89G
    public final void DWV(float f) {
        C23102AGo c23102AGo = this.A01;
        Drawable drawable = this.A00;
        Drawable current = drawable.getCurrent();
        C14360o3.A07(current);
        C23102AGo.A00(current, c23102AGo, new DHY(drawable, c23102AGo, f, 7));
    }

    @Override // X.C89G
    public final void DWW(float f) {
        C23102AGo c23102AGo = this.A01;
        Drawable drawable = this.A00;
        Drawable current = drawable.getCurrent();
        C14360o3.A07(current);
        C23102AGo.A00(current, c23102AGo, new DHY(drawable, c23102AGo, f, 8));
    }

    @Override // X.C89G
    public final void DhY(float f) {
        C23102AGo c23102AGo = this.A01;
        Drawable current = this.A00.getCurrent();
        C14360o3.A07(current);
        C23102AGo.A00(current, c23102AGo, new DHM(c23102AGo, f, 6));
    }

    @Override // X.C89G
    public final void DiN(float f) {
        C23102AGo c23102AGo = this.A01;
        Drawable current = this.A00.getCurrent();
        C14360o3.A07(current);
        C23102AGo.A00(current, c23102AGo, new DHM(c23102AGo, f, 7));
    }
}
