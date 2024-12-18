package X;

/* loaded from: classes4.dex */
public final class B3Y implements InterfaceC16660sJ {
    public final /* synthetic */ C183688Ct A00;

    public B3Y(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final Float f = (Float) obj;
        C176567tE.A00(new Runnable() { // from class: X.AvA
            @Override // java.lang.Runnable
            public final void run() {
                B3Y b3y = B3Y.this;
                Float f2 = f;
                C9RW c9rw = (C9RW) b3y.A00.A20.getValue();
                if (c9rw.isShowing()) {
                    float floatValue = f2.floatValue();
                    if (floatValue == 1.0f) {
                        c9rw.dismiss();
                    } else {
                        c9rw.A00.setProgress((int) (floatValue * 100.0f));
                    }
                }
            }
        });
        return C0eB.A00;
    }
}
