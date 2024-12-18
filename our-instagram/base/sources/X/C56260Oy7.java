package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.Oy7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56260Oy7 implements InterfaceC149856oe {
    public final /* synthetic */ OCB A00;

    @Override // X.InterfaceC149856oe
    public final void DD6(boolean z, String str) {
    }

    @Override // X.InterfaceC149856oe
    public final void Dfc(String str) {
    }

    @Override // X.InterfaceC149856oe
    public final void Dfd() {
    }

    @Override // X.InterfaceC149856oe
    public final void Dkc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.PlO, java.lang.Object] */
    @Override // X.InterfaceC149856oe
    public final void EFE(String str) {
        C14360o3.A0B(str, 0);
        OCB ocb = this.A00;
        AbstractC55031OXo.A01(ocb.A01);
        C54459O4n c54459O4n = ocb.A00;
        if (c54459O4n != null) {
            C52692NTd c52692NTd = c54459O4n.A00;
            C8FP c8fp = (C8FP) c52692NTd.A0U.getValue();
            C88X B0q = c8fp.B0q(c8fp.B0x(str));
            if (B0q != null) {
                C55177Odh c55177Odh = c52692NTd.A0H;
                c55177Odh.A05(new Object());
                CameraAREffect A00 = B0q.A00();
                if (A00 != null) {
                    c55177Odh.A03(new C56699PEr(A00));
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    public C56260Oy7(OCB ocb) {
        this.A00 = ocb;
    }
}
