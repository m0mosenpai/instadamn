package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Ani, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24159Ani implements C89G {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C9ZD A02;
    public final /* synthetic */ C23102AGo A03;

    @Override // X.C89G
    public final /* synthetic */ void DM8(int i) {
    }

    public C24159Ani(Drawable drawable, Drawable drawable2, C9ZD c9zd, C23102AGo c23102AGo) {
        this.A02 = c9zd;
        this.A03 = c23102AGo;
        this.A01 = drawable;
        this.A00 = drawable2;
    }

    public static void A00(C24159Ani c24159Ani) {
        if (c24159Ani.A02.A00) {
            c24159Ani.A03.A01(c24159Ani.A01, c24159Ani.A00);
        }
    }

    @Override // X.C89G
    public final void DWV(float f) {
        A00(this);
    }

    @Override // X.C89G
    public final void DWW(float f) {
        A00(this);
    }

    @Override // X.C89G
    public final void DhY(float f) {
        A00(this);
    }

    @Override // X.C89G
    public final void DiN(float f) {
        A00(this);
    }
}
