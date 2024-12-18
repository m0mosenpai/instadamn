package X;

import android.view.View;

/* renamed from: X.Lw5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49612Lw5 implements InterfaceC150976qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;

    public C49612Lw5(View view, int i, int i2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        AbstractC13880nE.A0g(this.A02, (int) (this.A00 + (this.A01 * f)));
    }
}
