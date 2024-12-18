package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Anh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24158Anh implements C89G {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C190988cu A01;

    @Override // X.C89G
    public final /* synthetic */ void DM8(int i) {
    }

    public C24158Anh(Drawable drawable, C190988cu c190988cu) {
        this.A01 = c190988cu;
        this.A00 = drawable;
    }

    @Override // X.C89G
    public final void DWV(float f) {
        C190988cu c190988cu = this.A01;
        Drawable drawable = this.A00;
        C190988cu.A02(drawable, c190988cu, new C9FB(drawable, c190988cu, f, 0));
    }

    @Override // X.C89G
    public final void DWW(float f) {
        C190988cu c190988cu = this.A01;
        Drawable drawable = this.A00;
        C190988cu.A02(drawable, c190988cu, new C9FB(drawable, c190988cu, f, 1));
    }

    @Override // X.C89G
    public final void DhY(float f) {
        C190988cu c190988cu = this.A01;
        C190988cu.A02(this.A00, c190988cu, new C207029Eh(c190988cu, f, 0));
    }

    @Override // X.C89G
    public final void DiN(float f) {
        C190988cu c190988cu = this.A01;
        C190988cu.A02(this.A00, c190988cu, new C207029Eh(c190988cu, f, 1));
    }
}
