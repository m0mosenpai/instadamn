package X;

import android.media.CamcorderProfile;
import java.io.File;

/* renamed from: X.7ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175807ru implements InterfaceC175797rt {
    public InterfaceC175497rP A00;
    public BDG A01;
    public Y1s A02;
    public InterfaceC176297sm A03;
    public boolean A04;

    @Override // X.InterfaceC175797rt
    public final void ARf(boolean z) {
    }

    @Override // X.InterfaceC175797rt
    public final void EoB(BDG bdg, C23106AGs c23106AGs) {
        File file;
        try {
            this.A04 = true;
            this.A01 = bdg;
            InterfaceC176297sm CFN = this.A00.CFN();
            CFN.getClass();
            this.A03 = CFN;
            CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
            camcorderProfile.getClass();
            Object A00 = c23106AGs.A00(C23106AGs.A09);
            if (A00 == null && (file = (File) c23106AGs.A00(C23106AGs.A07)) != null) {
                A00 = file.getAbsolutePath();
            }
            A00.getClass();
            Y1s Eo9 = CFN.Eo9(camcorderProfile, null, (String) A00, null, 0, 0, false, true, false);
            this.A02 = Eo9;
            bdg.Dyp(Eo9);
        } catch (Exception e) {
            bdg.Dyo(e);
            this.A01 = null;
            this.A02 = null;
            this.A03 = null;
            this.A04 = false;
        }
    }

    @Override // X.InterfaceC175797rt
    public final void CNj(InterfaceC178207vu interfaceC178207vu) {
        this.A00 = ((InterfaceC178737wl) interfaceC178207vu.Aq0(InterfaceC178737wl.A00)).C4Q();
    }

    @Override // X.InterfaceC175797rt
    public final boolean Cbe() {
        return this.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC175797rt
    public final void Eom() {
        BDG bdg = this.A01;
        if (this.A04) {
            try {
                try {
                    InterfaceC176297sm interfaceC176297sm = this.A03;
                    interfaceC176297sm.getClass();
                    interfaceC176297sm.Eom();
                    if (bdg != null) {
                        Y1s y1s = this.A02;
                        y1s.getClass();
                        bdg.Dyq(y1s);
                    }
                } catch (Exception e) {
                    if (bdg != null) {
                        bdg.Dyo(e);
                    }
                }
            } finally {
                this.A01 = null;
                this.A02 = null;
                this.A03 = null;
                this.A04 = false;
            }
        }
    }

    @Override // X.InterfaceC175797rt
    public final void release() {
        Eom();
    }
}
