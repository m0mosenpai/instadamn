package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.AVd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23318AVd implements BCQ {
    public final /* synthetic */ C22936A9g A00;
    public final /* synthetic */ BCQ A01;
    public final /* synthetic */ C179987yo A02;
    public final /* synthetic */ C22813A4g A03;
    public final /* synthetic */ File A04;

    public C23318AVd(C22936A9g c22936A9g, BCQ bcq, C179987yo c179987yo, C22813A4g c22813A4g, File file) {
        this.A02 = c179987yo;
        this.A00 = c22936A9g;
        this.A04 = file;
        this.A01 = bcq;
        this.A03 = c22813A4g;
    }

    public final void A00(Bitmap bitmap, A6X a6x) {
        C179987yo c179987yo = this.A02;
        c179987yo.A06.BAu("Lite-Controller-Thread").post(new Ax9(bitmap, a6x, this));
        InterfaceC178407wE interfaceC178407wE = c179987yo.A04;
        if (interfaceC178407wE != null) {
            AbstractC196788n8.A01(interfaceC178407wE, "PhotoCaptureControllerImpl", c179987yo.hashCode());
        }
    }

    @Override // X.BCQ
    public final void D2G() {
        C179987yo c179987yo = this.A02;
        InterfaceC178407wE interfaceC178407wE = c179987yo.A04;
        if (interfaceC178407wE != null) {
            AbstractC196788n8.A00(new AbstractC223559ty(10000, "Photo capture cancelled"), interfaceC178407wE, "PhotoCaptureControllerImpl", "low", c179987yo.hashCode());
        }
    }

    @Override // X.BCQ
    public final void D2I(Exception exc) {
        AbstractC223559ty abstractC223559ty;
        C179987yo c179987yo = this.A02;
        C179987yo.A01(c179987yo);
        APL.A03(this.A01, exc);
        InterfaceC178407wE interfaceC178407wE = c179987yo.A04;
        if (interfaceC178407wE != null) {
            int hashCode = c179987yo.hashCode();
            if (exc instanceof AbstractC223559ty) {
                abstractC223559ty = (AbstractC223559ty) exc;
            } else {
                abstractC223559ty = new AbstractC223559ty(10000, exc);
            }
            AbstractC196788n8.A00(abstractC223559ty, interfaceC178407wE, "PhotoCaptureControllerImpl", "medium", hashCode);
        }
    }
}
