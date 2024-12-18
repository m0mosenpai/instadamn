package X;

import android.graphics.Bitmap;

/* renamed from: X.PEf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56687PEf implements InterfaceC65533Tm3 {
    public final /* synthetic */ NTR A00;

    public C56687PEf(NTR ntr) {
        this.A00 = ntr;
    }

    @Override // X.InterfaceC65533Tm3
    public final void DYG() {
        NTR ntr = this.A00;
        ntr.A08.A00.A00(new C56577P9z(C05F.A01));
        ntr.A00 = null;
        MSX.A0v(ntr.A09.A03.getContext(), 2131976793);
    }

    @Override // X.InterfaceC65533Tm3
    public final void DYH() {
        NTR ntr = this.A00;
        ntr.A08.A00.A00(new C56577P9z(C05F.A00));
        Bitmap bitmap = ntr.A00;
        if (bitmap != null) {
            NTR.A00(bitmap, ntr);
        }
    }
}
