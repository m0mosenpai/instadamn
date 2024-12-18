package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PN1 implements Runnable {
    public final /* synthetic */ C52163N6p A00;

    public PN1(C52163N6p c52163N6p) {
        this.A00 = c52163N6p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52163N6p c52163N6p = this.A00;
        if (c52163N6p.getActivity() != null) {
            View view = c52163N6p.A00;
            if (view != null) {
                int A03 = MSW.A03(view);
                C5SU A0f = AbstractC167017dG.A0f(c52163N6p.requireActivity(), AbstractC166997dE.A0N(c52163N6p).getString(2131964177));
                View view2 = c52163N6p.A00;
                if (view2 != null) {
                    A0f.A04(view2, 0, A03, true);
                    A0f.A01();
                    A0f.A0A = true;
                    A0f.A0F = true;
                    A0f.A00().A07(AbstractC166987dD.A0r(c52163N6p.A08));
                }
            }
            C14360o3.A0F("toggleAspectRatioButton");
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do = c52163N6p.A08;
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        AbstractC167007dF.A1L(A0l, A0l.A0n, C23031Ai.A8c, 248, true);
        C25621Ms A0C = AbstractC31179DnN.A0C(AbstractC166987dD.A0o(interfaceC09390do));
        A0C.A0B("nux/write_nux_type/");
        A0C.A9s("nux_type", "igtv_aspect_ratio");
        AbstractC31175DnJ.A0D(A0C, C40781ul.class, C55702hA.class, true).run();
    }
}
