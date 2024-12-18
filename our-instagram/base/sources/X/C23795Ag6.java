package X;

import java.util.List;

/* renamed from: X.Ag6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23795Ag6 implements InterfaceC50448MPc {
    public final /* synthetic */ C22838A5h A00;

    @Override // X.InterfaceC50448MPc
    public final void DqF(List list) {
        String str;
        InterfaceC189798ay A00;
        C22838A5h c22838A5h = this.A00;
        C195868lW c195868lW = (C195868lW) list.get(0);
        C14360o3.A0B(c195868lW, 0);
        C1828789i c1828789i = c22838A5h.A00;
        C8XA c8xa = c1828789i.A02;
        if (c8xa != null) {
            if (c8xa.A00().A02 != 1) {
                C22P c22p = c1828789i.A06;
                C81J c81j = c1828789i.A0B;
                int A002 = C9O2.A00(c22p, c81j, c1828789i.A04);
                c195868lW.A0d = c81j.A2H;
                c195868lW.A0o = c81j.A2e;
                c195868lW.A0F = A002;
                c195868lW.A0m = c81j.A2G;
                C8GE c8ge = c1828789i.A03;
                if (c8ge != null && (A00 = c8ge.A00()) != null) {
                    A00.Cnt(AbstractC166987dD.A1J(c195868lW));
                }
                C188598Wy c188598Wy = c1828789i.A01;
                if (c188598Wy != null) {
                    c188598Wy.A01(C198318pg.A00, c195868lW, false);
                    return;
                }
                str = "capturedMediaProcessor";
            } else {
                return;
            }
        } else {
            str = "visibilityControllerComponentProvider";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C23795Ag6(C22838A5h c22838A5h) {
        this.A00 = c22838A5h;
    }

    @Override // X.InterfaceC50448MPc
    public final void onFailure(Exception exc) {
        C1828789i c1828789i = this.A00.A00;
        AbstractC12120kG.A07(c1828789i.A07.getModuleName(), AnonymousClass001.A0R("Error importing video: ", exc.getLocalizedMessage()), exc);
        C1828789i.A00(c1828789i);
    }
}
