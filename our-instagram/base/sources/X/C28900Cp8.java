package X;

import android.graphics.Bitmap;

/* renamed from: X.Cp8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28900Cp8 implements BEH {
    public final /* synthetic */ C26456Bmd A00;

    @Override // X.BCQ
    public final void D2G() {
    }

    public C28900Cp8(C26456Bmd c26456Bmd) {
        this.A00 = c26456Bmd;
    }

    @Override // X.BEH
    public final void Czc(Bitmap bitmap) {
        if (bitmap == null) {
            C18950wb c18950wb = C18950wb.A01;
            C14360o3.A07(c18950wb);
            c18950wb.EH8(164832702, "memu_onboarding");
            return;
        }
        this.A00.A01.invoke(new C4G(bitmap));
    }

    @Override // X.BCQ
    public final void D2I(Exception exc) {
        C18950wb c18950wb = C18950wb.A01;
        C14360o3.A07(c18950wb);
        c18950wb.EH8(164832702, "memu_onboarding");
    }
}
