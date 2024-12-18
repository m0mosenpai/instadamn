package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.CqI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28967CqI implements InterfaceC51522Ya {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ Drawable A03;
    public final /* synthetic */ Drawable A04;

    public C28967CqI(Drawable drawable, Drawable drawable2, Drawable drawable3, int i, int i2) {
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = drawable3;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        return new BZA(context, this.A03, this.A02, this.A04, this.A01, this.A00);
    }
}
