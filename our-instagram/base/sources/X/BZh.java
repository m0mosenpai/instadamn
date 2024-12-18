package X;

import android.content.res.Configuration;
import android.graphics.Path;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public final class BZh extends C58J implements InterfaceC113445Ag, InterfaceC1129458d {
    public Integer A00;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        long j;
        float f;
        float f2;
        C14360o3.A0B(interfaceC1129057z, 0);
        if (this.A00 != C05F.A00) {
            if ((((Configuration) C5Zy.A00(AndroidCompositionLocals_androidKt.A00, this)).uiMode & 48) == 32) {
                j = 4281546296L;
            } else {
                j = 4293256677L;
            }
            long j2 = j << 32;
            long j3 = C1132359l.A01;
            float EqT = interfaceC1129057z.EqT(60.0f);
            AnonymousClass583 layoutDirection = interfaceC1129057z.getLayoutDirection();
            AnonymousClass583 anonymousClass583 = AnonymousClass583.Rtl;
            if (layoutDirection == anonymousClass583) {
                f = 2.0f;
                f2 = C5YC.A02(interfaceC1129057z.Bxc()) - (EqT / 2.0f);
            } else {
                f = 2.0f;
                f2 = EqT / 2.0f;
            }
            float EqT2 = interfaceC1129057z.EqT(f);
            int intValue = this.A00.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 0) {
                                throw B4Z.A00();
                            }
                        } else {
                            long Bxc = interfaceC1129057z.Bxc();
                            float A02 = C5YC.A02(Bxc);
                            float A00 = C5YC.A00(Bxc);
                            AnonymousClass588 AzL = interfaceC1129057z.AzL();
                            AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
                            AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
                            long A08 = AbstractC25227BEk.A08(anonymousClass586);
                            try {
                                anonymousClass587.A01.AI7(1, 0.0f, 0.0f, A02, A00);
                                interfaceC1129057z.AQe(null, C119815bf.A00, EqT2 / f, 1.0f, 3, j2, AbstractC119395aw.A00(f2, 0.0f));
                            } finally {
                                AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
                            }
                        }
                    } else {
                        float EqT3 = interfaceC1129057z.EqT(14.0f);
                        int i = 1;
                        if (interfaceC1129057z.getLayoutDirection() == anonymousClass583) {
                            i = -1;
                        }
                        float f3 = EqT3 * i;
                        float A002 = (AbstractC25229BEm.A00(interfaceC1129057z) - EqT3) / f;
                        interfaceC1129057z.AQs(null, null, EqT2, 1.0f, 0, 3, j2, AbstractC119395aw.A00(f2, 0.0f), AbstractC119395aw.A00(f2, A002));
                        C60X A003 = C60W.A00();
                        Path path = A003.A03;
                        path.moveTo(f3, 0.0f);
                        path.cubicTo(f3, EqT3, 0.0f, EqT3, 0.0f, EqT3 / f);
                        path.cubicTo(0.0f, 0.0f, f3, 0.0f, f3, EqT3);
                        float f4 = f2 - f3;
                        C58A c58a = ((AnonymousClass587) interfaceC1129057z.AzL()).A01;
                        c58a.F8X(f4, A002);
                        try {
                            interfaceC1129057z.AQw(null, A003, new C62V(null, EqT2, 4.0f, 0, 0), 1.0f, 3, j2);
                            c58a.F8X(-f4, -A002);
                            interfaceC1129057z.AQs(null, null, EqT2, 1.0f, 0, 3, j2, AbstractC119395aw.A00(f2, A002 + EqT3), AbstractC119395aw.A00(f2, AbstractC25229BEm.A00(interfaceC1129057z)));
                        } catch (Throwable th) {
                            c58a.F8X(-f4, -A002);
                            throw th;
                        }
                    }
                } else {
                    interfaceC1129057z.AQs(null, null, EqT2, 1.0f, 0, 3, j2, AbstractC119395aw.A00(f2, 0.0f), AbstractC119395aw.A00(f2, AbstractC25229BEm.A00(interfaceC1129057z)));
                }
            } else {
                float f5 = EqT2 / f;
                long A004 = AbstractC119395aw.A00(f2, f5);
                interfaceC1129057z.AQs(null, null, EqT2, 1.0f, 0, 3, j2, A004, AbstractC119395aw.A00(f2, AbstractC25229BEm.A00(interfaceC1129057z)));
                interfaceC1129057z.AQe(null, C119815bf.A00, f5, 1.0f, 3, j2, A004);
            }
            interfaceC1129057z.AQf();
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }
}
