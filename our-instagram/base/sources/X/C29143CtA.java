package X;

import android.graphics.Bitmap;

/* renamed from: X.CtA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29143CtA implements C1NJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        float f;
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            String str = this.A02;
            int i = this.A01;
            float f2 = this.A00;
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            if (C14360o3.A0K(str, "TWO_FACES")) {
                f = 24.0f;
                if (i == 0) {
                    f = 32.0f;
                }
            } else if (i != 0) {
                f = 22.0f;
                if (i != 1) {
                    f = 16.0f;
                }
            } else {
                f = 30.0f;
            }
            int i2 = (int) (f2 * f);
            Bitmap A00 = C0fK.A00(bitmap, i2, i2, false);
            C14360o3.A0A(A00);
            interfaceC16660sJ.invoke(A00);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C29143CtA(String str, InterfaceC16660sJ interfaceC16660sJ, float f, int i) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = f;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C18950wb.A01.AEp("Exception getting bitmap from user profile image url", 817896325);
    }
}
