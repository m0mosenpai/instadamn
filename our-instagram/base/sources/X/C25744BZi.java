package X;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.BZi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25744BZi extends C58J implements InterfaceC113445Ag, InterfaceC1129458d {
    public float A00;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        long j;
        C14360o3.A0B(interfaceC1129057z, 0);
        long j2 = ((C1132359l) C5Zy.A00(AbstractC25646BVi.A00, this)).A00;
        if ((((Configuration) C5Zy.A00(AndroidCompositionLocals_androidKt.A00, this)).uiMode & 48) == 32) {
            j = 4281546296L;
        } else {
            j = 4293256677L;
        }
        long j3 = j << 32;
        float EqT = interfaceC1129057z.EqT(2.0f);
        long Bxc = interfaceC1129057z.Bxc();
        float A02 = (int) (C5YC.A02(Bxc) / 2.0f);
        long A00 = AbstractC119395aw.A00(A02, C5YC.A00(Bxc));
        long A002 = AbstractC119395aw.A00(A02, AbstractC25226BEj.A00(interfaceC1129057z, this.A00, C5YC.A00(Bxc)));
        interfaceC1129057z.AQs(null, null, AbstractC25226BEj.A00(interfaceC1129057z, 1.0f, EqT), 1.0f, 0, 3, j2, A00, A002);
        long Bxc2 = interfaceC1129057z.Bxc();
        float A022 = C5YC.A02(Bxc2);
        float A003 = AbstractC25226BEj.A00(interfaceC1129057z, this.A00, C5YC.A00(Bxc2));
        AnonymousClass588 AzL = interfaceC1129057z.AzL();
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        long A08 = AbstractC25227BEk.A08(anonymousClass586);
        try {
            anonymousClass587.A01.AI7(1, 0.0f, 0.0f, A022, A003);
            interfaceC1129057z.AQe(null, C119815bf.A00, EqT / 2.0f, 1.0f, 3, j3, A002);
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            interfaceC1129057z.AQf();
        } catch (Throwable th) {
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            throw th;
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }
}
