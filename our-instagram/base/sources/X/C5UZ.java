package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5UZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UZ implements C2DD {
    public AnonymousClass195 A00;
    public final InterfaceC16620sF A01;
    public final C19L A02;

    @Override // X.C2DD
    public final void CuG() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(new C50556MTn());
        }
        this.A00 = null;
    }

    @Override // X.C2DD
    public final void DI8() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(new C50556MTn());
        }
        this.A00 = null;
    }

    @Override // X.C2DD
    public final void Deh() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            anonymousClass195.AGH(cancellationException);
        }
        C19L c19l = this.A02;
        InterfaceC16620sF interfaceC16620sF = this.A01;
        this.A00 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, interfaceC16620sF, c19l);
    }

    public C5UZ(C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
        this.A02 = AnonymousClass194.A02(c12w);
    }
}
