package X;

import java.util.List;

/* renamed from: X.YDi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73439YDi implements YO0 {
    public final /* synthetic */ C48282Js A00;

    public C73439YDi(C48282Js c48282Js) {
        this.A00 = c48282Js;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        String A00;
        if (c5ks.A0F()) {
            Object A06 = c5ks.A06();
            A06.getClass();
            A00 = String.format("%d states", AbstractC25228BEl.A1Y(((List) A06).size()));
        } else {
            A00 = C48282Js.A00(c5ks);
        }
        C48282Js.A02(this.A00, "getSessionStates completed: %s ", A00);
    }
}
