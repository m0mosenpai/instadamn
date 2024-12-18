package X;

import android.os.Looper;
import java.io.File;

/* renamed from: X.AaX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23460AaX implements InterfaceC196578mn {
    public final /* synthetic */ BCQ A00;
    public final /* synthetic */ C179987yo A01;
    public final /* synthetic */ C22813A4g A02;
    public final /* synthetic */ C176877tj A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    @Override // X.InterfaceC196578mn
    public final /* synthetic */ void Dbk(float f) {
    }

    public C23460AaX(BCQ bcq, C179987yo c179987yo, C22813A4g c22813A4g, C176877tj c176877tj, File file, boolean z, boolean z2, boolean z3) {
        this.A01 = c179987yo;
        this.A05 = z;
        this.A00 = bcq;
        this.A02 = c22813A4g;
        this.A04 = file;
        this.A03 = c176877tj;
        this.A06 = z2;
        this.A07 = z3;
    }

    @Override // X.InterfaceC196578mn
    public final void D2R() {
        InterfaceC178737wl interfaceC178737wl = this.A01.A03;
        if (interfaceC178737wl != null && this.A05) {
            interfaceC178737wl.EbN(false);
        }
    }

    @Override // X.InterfaceC196578mn
    public final void DEF(Exception exc) {
        AbstractC223559ty abstractC223559ty;
        C179987yo c179987yo = this.A01;
        C179987yo.A01(c179987yo);
        APL.A03(this.A00, exc);
        InterfaceC178737wl interfaceC178737wl = c179987yo.A03;
        if (interfaceC178737wl != null && this.A05 && this.A07) {
            interfaceC178737wl.EbN(true);
        }
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

    @Override // X.InterfaceC196578mn
    public final void DYZ(C196748n4 c196748n4) {
        A6Y a6y;
        BCQ bcq = this.A00;
        boolean z = true;
        if (!(bcq instanceof C63963Swo)) {
            z = false;
        }
        C22813A4g c22813A4g = this.A02;
        boolean z2 = c22813A4g instanceof C22813A4g;
        File file = this.A04;
        if (file != null) {
            C179987yo c179987yo = this.A01;
            byte[] bArr = (byte[]) c196748n4.A04(C196748n4.A0X);
            C176877tj c176877tj = this.A03;
            boolean z3 = this.A06;
            c22813A4g.getClass();
            a6y = new A6Y(c179987yo, new RunnableC24888Azn(c179987yo, c22813A4g, c176877tj, file, bArr, z2, z3));
        } else {
            a6y = null;
        }
        if (z) {
            C179987yo c179987yo2 = this.A01;
            C179987yo.A01(c179987yo2);
            APL.A02(bcq, AHM.A01(c196748n4), a6y, (byte[]) c196748n4.A04(C196748n4.A0X));
            InterfaceC178737wl interfaceC178737wl = c179987yo2.A03;
            if (interfaceC178737wl != null && this.A05 && this.A07) {
                interfaceC178737wl.EbN(true);
                return;
            }
            return;
        }
        RunnableC24725Ax8 runnableC24725Ax8 = new RunnableC24725Ax8(this, a6y, c196748n4);
        InterfaceC178297w3 interfaceC178297w3 = this.A01.A06;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            interfaceC178297w3.BAu("Lite-Controller-Thread").post(runnableC24725Ax8);
        } else {
            runnableC24725Ax8.run();
        }
    }

    @Override // X.InterfaceC196578mn
    public final void Dtw(C196748n4 c196748n4) {
        C179987yo c179987yo = this.A01;
        InterfaceC178407wE interfaceC178407wE = c179987yo.A04;
        if (interfaceC178407wE != null) {
            AbstractC196788n8.A01(interfaceC178407wE, "PhotoCaptureControllerImpl", c179987yo.hashCode());
        }
    }
}
