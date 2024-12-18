package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ag3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23792Ag3 implements InterfaceC187078Ra {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C50725MaQ A02;

    @Override // X.InterfaceC187078Ra
    public final C9LJ AMR(Context context, Drawable drawable, C8FC c8fc, int i) {
        C14360o3.A0B(drawable, 0);
        C9LJ c9lj = new C9LJ(context, drawable, this.A02.A09, i, false, false);
        AHh.A00(c8fc, c9lj);
        return c9lj;
    }

    @Override // X.InterfaceC187078Ra
    public final void DUO() {
    }

    public C23792Ag3(C50725MaQ c50725MaQ, int i, int i2) {
        this.A02 = c50725MaQ;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC187078Ra
    public final int AzO() {
        return this.A00;
    }

    @Override // X.InterfaceC187078Ra
    public final int AzP() {
        return this.A01;
    }
}
