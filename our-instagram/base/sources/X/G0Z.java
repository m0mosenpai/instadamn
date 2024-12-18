package X;

import com.instagram.model.direct.DirectSearchResult;

/* loaded from: classes6.dex */
public final class G0Z implements InterfaceC43071ya {
    public final GXU A00;

    public G0Z(GXU gxu) {
        this.A00 = gxu;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        if ((CFq == C05F.A00 || CFq == C05F.A01) && interfaceC57162jr.CGk(c59062n7) > 0.3f) {
            this.A00.DjK((DirectSearchResult) c59062n7.A03);
        }
    }
}
