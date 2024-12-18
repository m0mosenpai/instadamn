package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.3Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71163Hc extends AbstractC56982jZ {
    public final InterfaceC59992oh A00;
    public final InterfaceC60012oj A01;
    public final InterfaceC71183He A02;
    public final AbstractC60592pi A03;
    public final InterfaceC60062oo A04;

    public static C71163Hc A00(InterfaceC60062oo interfaceC60062oo) {
        return new C71163Hc((InterfaceC59992oh) interfaceC60062oo, (InterfaceC60012oj) interfaceC60062oo, interfaceC60062oo);
    }

    public C71163Hc(InterfaceC59992oh interfaceC59992oh, InterfaceC60012oj interfaceC60012oj, InterfaceC60062oo interfaceC60062oo) {
        InterfaceC71183He interfaceC71183He = new InterfaceC71183He() { // from class: X.3Hd
            @Override // X.InterfaceC71183He
            public final void DI9(Fragment fragment) {
                C71163Hc.this.A02();
            }

            @Override // X.InterfaceC71183He
            public final void DID(Fragment fragment) {
                C71163Hc.this.A01();
            }
        };
        this.A02 = interfaceC71183He;
        AbstractC60592pi abstractC60592pi = new AbstractC60592pi() { // from class: X.3Hf
            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onDestroyView() {
                C71163Hc c71163Hc = C71163Hc.this;
                c71163Hc.A00.unregisterLifecycleListener(this);
                c71163Hc.A01.removeFragmentVisibilityListener(c71163Hc.A02);
            }

            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onPause() {
                C71163Hc.this.A02();
            }

            @Override // X.AbstractC60592pi, X.InterfaceC60602pj
            public final void onResume() {
                C71163Hc.this.A01();
            }
        };
        this.A03 = abstractC60592pi;
        this.A04 = interfaceC60062oo;
        this.A00 = interfaceC59992oh;
        this.A01 = interfaceC60012oj;
        interfaceC59992oh.registerLifecycleListener(abstractC60592pi);
        interfaceC60012oj.addFragmentVisibilityListener(interfaceC71183He);
    }
}
