package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.Ozd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56316Ozd implements InterfaceC58039PoP {
    public final /* synthetic */ C50643MXf A00;
    public final /* synthetic */ C115525Km A01;

    @Override // X.InterfaceC58039PoP
    public final void Dq9(File file) {
        C14360o3.A0B(file, 0);
        C50643MXf c50643MXf = this.A00;
        C50643MXf.A04(NsW.A00(null, this.A01, c50643MXf.A0X.A02, AbstractC43592JPx.A0x(file)), c50643MXf);
    }

    public C56316Ozd(C50643MXf c50643MXf, C115525Km c115525Km) {
        this.A00 = c50643MXf;
        this.A01 = c115525Km;
    }

    @Override // X.InterfaceC58039PoP
    public final void DG2(IOException iOException) {
        C50643MXf c50643MXf = this.A00;
        AKk.A02(c50643MXf.A0L, C05F.A0j, "Failure while burning video with audio", 2131955613);
        C50643MXf.A0B(c50643MXf, false);
    }
}
