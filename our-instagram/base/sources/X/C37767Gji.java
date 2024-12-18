package X;

/* renamed from: X.Gji, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37767Gji extends AbstractC60592pi {
    public final int A00;
    public final Object A01;

    public C37767Gji(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        switch (this.A00) {
            case 0:
                C33P c33p = ((C42669IuQ) this.A01).A02;
                if (c33p == null) {
                    return;
                }
                c33p.A0G.A0L();
                return;
            case 1:
                C35166FfG c35166FfG = (C35166FfG) this.A01;
                c35166FfG.A0D.dismiss();
                c35166FfG.A00 = null;
                return;
            default:
                super.onDestroy();
                return;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        if (this.A00 != 0) {
            super.onDestroyView();
            return;
        }
        C33P c33p = ((C42669IuQ) this.A01).A02;
        if (c33p == null) {
            return;
        }
        c33p.A0G.A0V("finished", false, false);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        if (this.A00 != 0) {
            super.onPause();
            return;
        }
        C42669IuQ c42669IuQ = (C42669IuQ) this.A01;
        C33P c33p = c42669IuQ.A02;
        if (c33p == null) {
            return;
        }
        c33p.A0G.A0U("fragment_paused");
        C42669IuQ.A00(c42669IuQ, c42669IuQ.A05.A0B(41));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        if (this.A00 != 0) {
            super.onResume();
            return;
        }
        C33P c33p = ((C42669IuQ) this.A01).A02;
        if (c33p == null) {
            return;
        }
        c33p.A0G.A0M();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onStart() {
        if (2 - this.A00 != 0) {
            super.onStart();
        } else {
            C37675GiC c37675GiC = (C37675GiC) this.A01;
            AbstractC25651Mw.A00(c37675GiC.A0C).A01(c37675GiC.A0B, C3IJ.class);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onStop() {
        if (2 - this.A00 != 0) {
            super.onStop();
            return;
        }
        C37675GiC c37675GiC = (C37675GiC) this.A01;
        AbstractC25651Mw.A00(c37675GiC.A0C).A02(c37675GiC.A0B, C3IJ.class);
        c37675GiC.A08.unregisterLifecycleListener(this);
    }
}
