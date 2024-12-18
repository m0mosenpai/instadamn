package X;

import android.graphics.Bitmap;

/* renamed from: X.AVc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23317AVc implements BEH {
    public final /* synthetic */ BCS A00;
    public final /* synthetic */ AKN A01;

    @Override // X.BEH
    public final void Czc(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        AKN.A00(this.A01);
        this.A00.Czc(bitmap);
    }

    @Override // X.BCQ
    public final void D2I(Exception exc) {
        C14360o3.A0B(exc, 0);
        AKN.A00(this.A01);
        this.A00.D2I(exc);
    }

    public C23317AVc(BCS bcs, AKN akn) {
        this.A01 = akn;
        this.A00 = bcs;
    }

    @Override // X.BCQ
    public final void D2G() {
        AKN.A00(this.A01);
        ((AWL) this.A00).A00.A04.A00.A02().A02(EnumC223239t9.A0Y, "CAPTURE", "onCaptureCancelled");
    }
}
